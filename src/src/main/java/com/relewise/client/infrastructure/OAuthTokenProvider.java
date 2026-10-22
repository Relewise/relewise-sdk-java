package com.relewise.client.infrastructure;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.relewise.client.OAuthClientCredentials;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.time.Instant;
import java.util.Base64;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.LongSupplier;
import java.util.regex.Pattern;

/**
 * Acquires and caches OAuth client-credentials tokens. Reuse the provider or the
 * Relewise client which owns it to share cached tokens between requests.
 */
public final class OAuthTokenProvider {
    private static final Pattern UUID_PATTERN = Pattern.compile("^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$");
    private static final UUID EMPTY_UUID = new UUID(0, 0);
    private static final String INVALID_RESPONSE_MESSAGE = "The OAuth endpoint returned an invalid token response.";

    private final Object lock = new Object();
    private final String clientId;
    private final String clientSecret;
    private final Duration timeout;
    private final TokenRequestExecutor requestExecutor;
    private final ObjectMapper objectMapper;
    private final LongSupplier currentTimeMillis;

    private CachedToken cachedToken;
    private Acquisition tokenAcquisition;

    public OAuthTokenProvider(OAuthClientCredentials credentials, int timeoutInSeconds) {
        this(credentials, timeoutInSeconds, new HttpTokenRequestExecutor(), new ObjectMapper(), System::currentTimeMillis);
    }

    OAuthTokenProvider(
        OAuthClientCredentials credentials,
        int timeoutInSeconds,
        TokenRequestExecutor requestExecutor,
        ObjectMapper objectMapper,
        LongSupplier currentTimeMillis
    ) {
        if (credentials == null) {
            throw new IllegalArgumentException("OAuth credentials cannot be null.");
        }
        if (!isNonEmptyUuid(credentials.getClientId())) {
            throw new IllegalArgumentException("Client id must be a valid non-empty UUID.");
        }
        if (credentials.getClientSecret() == null || credentials.getClientSecret().isBlank()) {
            throw new IllegalArgumentException("Client secret cannot be null or empty.");
        }
        if (timeoutInSeconds <= 0) {
            throw new IllegalArgumentException("timeout must be greater than 0.");
        }

        this.clientId = credentials.getClientId();
        this.clientSecret = credentials.getClientSecret();
        this.timeout = Duration.ofSeconds(timeoutInSeconds);
        this.requestExecutor = requestExecutor;
        this.objectMapper = objectMapper;
        this.currentTimeMillis = currentTimeMillis;
    }

    /** Returns a cached token or acquires a new one when renewal is needed. */
    public OAuthToken getToken(URI endpoint) throws IOException, InterruptedException {
        return getToken(endpoint, null);
    }

    /**
     * Returns a token, replacing {@code rejectedToken} when it was rejected by the API.
     * Callers interrupted while waiting detach from the shared acquisition. The final
     * departing waiter cancels and abandons it, so a later request can start afresh.
     */
    public OAuthToken getToken(URI endpoint, String rejectedToken) throws IOException, InterruptedException {
        validateEndpoint(endpoint);

        while (true) {
            Acquisition acquisition;
            synchronized (lock) {
                if (canReuseToken(endpoint, rejectedToken)) {
                    return cachedToken.token;
                }

                acquisition = tokenAcquisition;
                if (acquisition == null) {
                    cachedToken = null;
                    acquisition = startAcquisition(endpoint);
                    tokenAcquisition = acquisition;
                    attachCompletion(acquisition);
                }
                acquisition.waiters++;
            }

            CachedToken acquiredToken;
            try {
                acquiredToken = acquisition.future.get();
            } catch (ExecutionException exception) {
                throw unwrap(exception.getCause());
            } finally {
                releaseWaiter(acquisition);
            }

            if (acquiredToken.endpoint.equals(endpoint)
                && currentTimeMillis.getAsLong() < acquiredToken.renewAt) {
                return acquiredToken.token;
            }
        }
    }

    private boolean canReuseToken(URI endpoint, String rejectedToken) {
        return cachedToken != null
            && cachedToken.endpoint.equals(endpoint)
            && !cachedToken.token.getAccessToken().equals(rejectedToken)
            && currentTimeMillis.getAsLong() < cachedToken.renewAt;
    }

    private Acquisition startAcquisition(URI endpoint) {
        long requestedAt = currentTimeMillis.getAsLong();
        String credentials = formEncode(clientId) + ":" + formEncode(clientSecret);
        String authorization = "Basic " + Base64.getEncoder().encodeToString(credentials.getBytes(StandardCharsets.UTF_8));
        CompletableFuture<TokenEndpointResponse> transport = requestExecutor.execute(
            endpoint,
            authorization,
            "grant_type=client_credentials",
            timeout
        );
        CompletableFuture<CachedToken> future = transport.thenApply(response -> parseResponse(endpoint, requestedAt, response));
        return new Acquisition(transport, future);
    }

    private void attachCompletion(Acquisition acquisition) {
        acquisition.future.whenComplete((token, error) -> {
            synchronized (lock) {
                acquisition.settled = true;
                if (tokenAcquisition == acquisition) {
                    if (error == null) {
                        cachedToken = token;
                    }
                    tokenAcquisition = null;
                }
            }
        });
    }

    private CachedToken parseResponse(URI endpoint, long requestedAt, TokenEndpointResponse response) {
        if (response.statusCode < 200 || response.statusCode > 299) {
            throw new TokenAcquisitionException("OAuth token acquisition failed with status " + response.statusCode + ".");
        }

        try {
            JsonNode value = objectMapper.readTree(response.body);
            JsonNode accessToken = value == null ? null : value.get("access_token");
            JsonNode tokenType = value == null ? null : value.get("token_type");
            JsonNode expiresIn = value == null ? null : value.get("expires_in");

            if (accessToken == null || !accessToken.isTextual() || accessToken.textValue().isEmpty()
                || containsInvalidTokenCharacter(accessToken.textValue())
                || tokenType == null || !tokenType.isTextual() || !tokenType.textValue().equalsIgnoreCase("Bearer")
                || expiresIn == null || !expiresIn.isIntegralNumber() || !expiresIn.canConvertToLong()
                || expiresIn.longValue() <= 0) {
                throw new TokenAcquisitionException(INVALID_RESPONSE_MESSAGE);
            }

            long expiresInSeconds = expiresIn.longValue();
            long expiresAt = Math.addExact(requestedAt, Math.multiplyExact(expiresInSeconds, 1_000));
            long renewBeforeExpirySeconds = Math.min(10, expiresInSeconds / 10);
            OAuthToken token = new OAuthToken(accessToken.textValue(), Instant.ofEpochMilli(expiresAt));
            return new CachedToken(endpoint, token, expiresAt - renewBeforeExpirySeconds * 1_000);
        } catch (TokenAcquisitionException exception) {
            throw exception;
        } catch (Exception exception) {
            // Never surface parser messages: malformed responses can contain secrets.
            throw new TokenAcquisitionException(INVALID_RESPONSE_MESSAGE);
        }
    }

    private void releaseWaiter(Acquisition acquisition) {
        synchronized (lock) {
            acquisition.waiters--;
            if (acquisition.waiters == 0 && !acquisition.settled && tokenAcquisition == acquisition) {
                tokenAcquisition = null;
                acquisition.future.cancel(true);
                acquisition.transport.cancel(true);
            }
        }
    }

    private static IOException unwrap(Throwable error) {
        if (error instanceof TokenAcquisitionException tokenError) {
            return new IOException(tokenError.getMessage());
        }
        if (error instanceof IOException ioError) {
            return ioError;
        }
        return new IOException("OAuth token acquisition failed.", error);
    }

    private static void validateEndpoint(URI endpoint) {
        if (endpoint == null
            || !"https".equalsIgnoreCase(endpoint.getScheme())
            || endpoint.getHost() == null
            || endpoint.getRawUserInfo() != null
            || endpoint.getRawQuery() != null
            || endpoint.getRawFragment() != null) {
            throw new IllegalArgumentException("OAuth token endpoint must be a valid HTTPS URL without credentials, query, or fragment.");
        }
    }

    static boolean isNonEmptyUuid(String value) {
        if (value == null || !UUID_PATTERN.matcher(value).matches()) {
            return false;
        }
        return !UUID.fromString(value).equals(EMPTY_UUID);
    }

    private static String formEncode(String value) {
        return URLEncoder.encode(value, StandardCharsets.UTF_8);
    }

    private static boolean containsInvalidTokenCharacter(String token) {
        for (int index = 0; index < token.length(); index++) {
            char character = token.charAt(index);
            if (character <= 0x20 || character == 0x7f) {
                return true;
            }
        }
        return false;
    }

    interface TokenRequestExecutor {
        CompletableFuture<TokenEndpointResponse> execute(URI endpoint, String authorization, String body, Duration timeout);
    }

    static final class TokenEndpointResponse {
        final int statusCode;
        final String body;

        TokenEndpointResponse(int statusCode, String body) {
            this.statusCode = statusCode;
            this.body = body;
        }
    }

    private static final class HttpTokenRequestExecutor implements TokenRequestExecutor {
        @Override
        public CompletableFuture<TokenEndpointResponse> execute(URI endpoint, String authorization, String body, Duration timeout) {
            HttpRequest request = HttpRequest.newBuilder(endpoint)
                .POST(HttpRequest.BodyPublishers.ofString(body))
                .header("Authorization", authorization)
                .header("Content-Type", "application/x-www-form-urlencoded")
                .timeout(timeout)
                .build();
            return DefaultHttpClientHolder.instance.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(response -> new TokenEndpointResponse(response.statusCode(), response.body()));
        }
    }

    private static final class DefaultHttpClientHolder {
        private static final HttpClient instance = HttpClient.newHttpClient();
    }

    private static final class CachedToken {
        private final URI endpoint;
        private final OAuthToken token;
        private final long renewAt;

        private CachedToken(URI endpoint, OAuthToken token, long renewAt) {
            this.endpoint = endpoint;
            this.token = token;
            this.renewAt = renewAt;
        }
    }

    private static final class Acquisition {
        private final CompletableFuture<?> transport;
        private final CompletableFuture<CachedToken> future;
        private int waiters;
        private boolean settled;

        private Acquisition(CompletableFuture<?> transport, CompletableFuture<CachedToken> future) {
            this.transport = transport;
            this.future = future;
        }
    }

    private static final class TokenAcquisitionException extends RuntimeException {
        private TokenAcquisitionException(String message) {
            super(message);
        }
    }
}

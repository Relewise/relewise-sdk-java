package com.relewise.client.infrastructure;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.relewise.client.OAuthClientCredentials;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.jupiter.api.Assertions.*;

class OAuthTokenProviderTest {
    private static final String CLIENT_ID = "11111111-1111-4111-8111-111111111111";
    private static final URI ENDPOINT = URI.create("https://api.example.com/dataset/oauth/token");

    @Test
    void formEncodesCredentialsCachesAndRenewsEarly() throws Exception {
        AtomicLong now = new AtomicLong(1_000);
        AtomicInteger requests = new AtomicInteger();
        AtomicReference<String> authorization = new AtomicReference<>();
        AtomicReference<String> body = new AtomicReference<>();
        var provider = provider("s e+c", now, (endpoint, auth, requestBody, timeout) -> {
            authorization.set(auth);
            body.set(requestBody);
            int number = requests.incrementAndGet();
            return completed(200, token("token-" + number, 100));
        });

        assertEquals("token-1", provider.getToken(ENDPOINT).getAccessToken());
        now.set(90_999);
        assertEquals("token-1", provider.getToken(ENDPOINT).getAccessToken());
        now.set(91_000);
        assertEquals("token-2", provider.getToken(ENDPOINT).getAccessToken());

        String decoded = new String(Base64.getDecoder().decode(authorization.get().substring("Basic ".length())), StandardCharsets.UTF_8);
        assertEquals(CLIENT_ID + ":s+e%2Bc", decoded);
        assertEquals("grant_type=client_credentials", body.get());
        assertEquals(2, requests.get());
    }

    @Test
    void sharesConcurrentAcquisition() throws Exception {
        AtomicInteger requests = new AtomicInteger();
        CountDownLatch started = new CountDownLatch(1);
        CompletableFuture<OAuthTokenProvider.TokenEndpointResponse> response = new CompletableFuture<>();
        var provider = provider("secret", new AtomicLong(0), (endpoint, auth, body, timeout) -> {
            requests.incrementAndGet();
            started.countDown();
            return response;
        });

        var executor = Executors.newFixedThreadPool(2);
        try {
            var first = executor.submit(() -> provider.getToken(ENDPOINT));
            assertTrue(started.await(2, TimeUnit.SECONDS));
            var second = executor.submit(() -> provider.getToken(ENDPOINT));
            response.complete(new OAuthTokenProvider.TokenEndpointResponse(200, token("shared", 300)));

            assertEquals("shared", first.get(2, TimeUnit.SECONDS).getAccessToken());
            assertEquals("shared", second.get(2, TimeUnit.SECONDS).getAccessToken());
            assertEquals(1, requests.get());
        } finally {
            executor.shutdownNow();
        }
    }

    @Test
    void replacesRejectedToken() throws Exception {
        AtomicInteger requests = new AtomicInteger();
        var provider = provider("secret", new AtomicLong(0), (endpoint, auth, body, timeout) -> {
            int number = requests.incrementAndGet();
            return completed(200, token("token-" + number, 300));
        });

        OAuthToken first = provider.getToken(ENDPOINT);
        OAuthToken replacement = provider.getToken(ENDPOINT, first.getAccessToken());

        assertEquals("token-2", replacement.getAccessToken());
        assertEquals(2, requests.get());
    }

    @Test
    void returnsReissuedRejectedTokenAfterSingleRefresh() throws Exception {
        AtomicInteger requests = new AtomicInteger();
        var provider = provider("secret", new AtomicLong(0), (endpoint, auth, body, timeout) -> {
            if (requests.incrementAndGet() > 2) {
                throw new IllegalStateException("Token acquisition must not be repeated.");
            }
            return completed(200, token("same-token", 300));
        });

        OAuthToken first = provider.getToken(ENDPOINT);
        OAuthToken replacement = provider.getToken(ENDPOINT, first.getAccessToken());

        assertEquals("same-token", replacement.getAccessToken());
        assertEquals(2, requests.get());
    }

    @Test
    void abandonsAcquisitionWhenFinalWaiterIsInterrupted() throws Exception {
        CountDownLatch firstStarted = new CountDownLatch(1);
        List<CompletableFuture<OAuthTokenProvider.TokenEndpointResponse>> responses = new ArrayList<>();
        var provider = provider("secret", new AtomicLong(0), (endpoint, auth, body, timeout) -> {
            var response = new CompletableFuture<OAuthTokenProvider.TokenEndpointResponse>();
            synchronized (responses) {
                responses.add(response);
            }
            firstStarted.countDown();
            return response;
        });

        var executor = Executors.newSingleThreadExecutor();
        try {
            var abandoned = executor.submit(() -> provider.getToken(ENDPOINT));
            assertTrue(firstStarted.await(2, TimeUnit.SECONDS));
            assertTrue(abandoned.cancel(true));

            var replacementCall = executor.submit(() -> provider.getToken(ENDPOINT));
            CompletableFuture<OAuthTokenProvider.TokenEndpointResponse> replacement = null;
            long deadline = System.nanoTime() + TimeUnit.SECONDS.toNanos(2);
            do {
                synchronized (responses) {
                    replacement = responses.size() > 1 ? responses.get(1) : null;
                }
                Thread.yield();
            } while (replacement == null && System.nanoTime() < deadline);

            assertNotNull(replacement);
            replacement.complete(new OAuthTokenProvider.TokenEndpointResponse(200, token("replacement", 300)));
            assertEquals("replacement", replacementCall.get(2, TimeUnit.SECONDS).getAccessToken());
            assertEquals(2, responses.size());
        } finally {
            executor.shutdownNow();
        }
    }

    @Test
    void doesNotLeakMalformedTokenResponse() {
        var provider = provider("secret", new AtomicLong(0), (endpoint, auth, body, timeout) ->
            completed(200, "SUPER_SECRET_MARKER"));

        IOException error = assertThrows(IOException.class, () -> provider.getToken(ENDPOINT));
        assertEquals("The OAuth endpoint returned an invalid token response.", error.getMessage());
        assertFalse(error.toString().contains("SUPER_SECRET_MARKER"));
    }

    @Test
    void validatesCredentialsAndEndpoint() {
        assertThrows(IllegalArgumentException.class, () -> new OAuthTokenProvider(new OAuthClientCredentials("not-a-uuid", "secret"), 5));
        assertThrows(IllegalArgumentException.class, () -> new OAuthTokenProvider(new OAuthClientCredentials("00000000-0000-0000-0000-000000000000", "secret"), 5));
        assertThrows(IllegalArgumentException.class, () -> new OAuthTokenProvider(new OAuthClientCredentials(CLIENT_ID, " "), 5));

        var provider = provider("secret", new AtomicLong(0), (endpoint, auth, body, timeout) -> completed(200, token("token", 300)));
        assertThrows(IllegalArgumentException.class, () -> provider.getToken(URI.create("http://api.example.com/oauth/token")));
        assertThrows(IllegalArgumentException.class, () -> provider.getToken(URI.create("https://user@api.example.com/oauth/token")));
        assertThrows(IllegalArgumentException.class, () -> provider.getToken(URI.create("https://api.example.com/oauth/token?x=1")));
    }

    private static OAuthTokenProvider provider(
        String secret,
        AtomicLong now,
        OAuthTokenProvider.TokenRequestExecutor executor
    ) {
        return new OAuthTokenProvider(
            new OAuthClientCredentials(CLIENT_ID, secret),
            5,
            executor,
            new ObjectMapper(),
            now::get
        );
    }

    private static CompletableFuture<OAuthTokenProvider.TokenEndpointResponse> completed(int status, String body) {
        return CompletableFuture.completedFuture(new OAuthTokenProvider.TokenEndpointResponse(status, body));
    }

    private static String token(String accessToken, long expiresIn) {
        return "{\"access_token\":\"" + accessToken + "\",\"token_type\":\"Bearer\",\"expires_in\":" + expiresIn + "}";
    }
}

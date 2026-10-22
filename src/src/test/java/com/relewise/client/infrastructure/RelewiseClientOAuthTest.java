package com.relewise.client.infrastructure;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.relewise.client.OAuthClientCredentials;
import com.relewise.client.model.TrackProductViewRequest;
import org.junit.jupiter.api.Test;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.Authenticator;
import java.net.CookieHandler;
import java.net.ProxySelector;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.ByteBuffer;
import java.security.NoSuchAlgorithmException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Flow;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RelewiseClientOAuthTest {
    private static final String DATASET_ID = "22222222-2222-4222-8222-222222222222";
    private static final String CLIENT_ID = "11111111-1111-4111-8111-111111111111";

    @Test
    void retriesCompleteRequestExactlyOnceAfterInvalidToken() throws Exception {
        AtomicInteger tokenRequests = new AtomicInteger();
        var credentials = new OAuthClientCredentials(CLIENT_ID, "secret");
        var tokenProvider = new OAuthTokenProvider(
            credentials,
            5,
            (endpoint, authorization, body, timeout) -> {
                int number = tokenRequests.incrementAndGet();
                return CompletableFuture.completedFuture(new OAuthTokenProvider.TokenEndpointResponse(
                    200,
                    "{\"access_token\":\"token-" + number + "\",\"token_type\":\"Bearer\",\"expires_in\":300}"
                ));
            },
            new ObjectMapper(),
            System::currentTimeMillis
        );
        var httpClient = new RecordingHttpClient();
        var client = new TestClient(httpClient, tokenProvider);

        HttpResponse<String> response = client.send();

        assertEquals(200, response.statusCode());
        assertEquals(2, httpClient.requests.size());
        assertEquals("Bearer token-1", httpClient.requests.get(0).headers().firstValue("Authorization").orElseThrow());
        assertEquals("Bearer token-2", httpClient.requests.get(1).headers().firstValue("Authorization").orElseThrow());
        assertEquals(httpClient.requests.get(0).uri(), httpClient.requests.get(1).uri());
        assertEquals(requestBody(httpClient.requests.get(0)), requestBody(httpClient.requests.get(1)));
        assertEquals(2, tokenRequests.get());
    }

    private static String requestBody(HttpRequest request) {
        var result = new CompletableFuture<String>();
        var output = new ByteArrayOutputStream();
        request.bodyPublisher().orElseThrow().subscribe(new Flow.Subscriber<>() {
            @Override public void onSubscribe(Flow.Subscription subscription) { subscription.request(Long.MAX_VALUE); }
            @Override public void onNext(ByteBuffer item) {
                byte[] bytes = new byte[item.remaining()];
                item.get(bytes);
                output.writeBytes(bytes);
            }
            @Override public void onError(Throwable throwable) { result.completeExceptionally(throwable); }
            @Override public void onComplete() { result.complete(output.toString(java.nio.charset.StandardCharsets.UTF_8)); }
        });
        return result.join();
    }

    private static final class TestClient extends RelewiseClient {
        private TestClient(HttpClient httpClient, OAuthTokenProvider tokenProvider) {
            super(DATASET_ID, "https://api.example.com", 5, httpClient, tokenProvider);
        }

        private HttpResponse<String> send() throws IOException, InterruptedException {
            return makeRequestAsync("TrackProductViewRequest", new TrackProductViewRequest());
        }
    }

    private static final class RecordingHttpClient extends HttpClient {
        private final List<HttpRequest> requests = new ArrayList<>();

        @Override
        @SuppressWarnings("unchecked")
        public <T> HttpResponse<T> send(HttpRequest request, HttpResponse.BodyHandler<T> responseBodyHandler) {
            requests.add(request);
            if (requests.size() == 1) {
                return (HttpResponse<T>) new StringResponse(
                    request,
                    401,
                    HttpHeaders.of(Map.of("WWW-Authenticate", List.of("Bearer realm=\"relewise\", error=\"invalid_token\"")), (name, value) -> true),
                    "unauthorized"
                );
            }
            return (HttpResponse<T>) new StringResponse(request, 200, HttpHeaders.of(Map.of(), (name, value) -> true), "");
        }

        @Override
        public <T> CompletableFuture<HttpResponse<T>> sendAsync(HttpRequest request, HttpResponse.BodyHandler<T> responseBodyHandler) {
            throw new UnsupportedOperationException();
        }

        @Override
        public <T> CompletableFuture<HttpResponse<T>> sendAsync(HttpRequest request, HttpResponse.BodyHandler<T> responseBodyHandler, HttpResponse.PushPromiseHandler<T> pushPromiseHandler) {
            throw new UnsupportedOperationException();
        }

        @Override public Optional<CookieHandler> cookieHandler() { return Optional.empty(); }
        @Override public Optional<Duration> connectTimeout() { return Optional.empty(); }
        @Override public Redirect followRedirects() { return Redirect.NEVER; }
        @Override public Optional<ProxySelector> proxy() { return Optional.empty(); }
        @Override public SSLContext sslContext() {
            try { return SSLContext.getDefault(); }
            catch (NoSuchAlgorithmException exception) { throw new IllegalStateException(exception); }
        }
        @Override public SSLParameters sslParameters() { return new SSLParameters(); }
        @Override public Optional<Authenticator> authenticator() { return Optional.empty(); }
        @Override public Version version() { return Version.HTTP_1_1; }
        @Override public Optional<Executor> executor() { return Optional.empty(); }
    }

    private static final class StringResponse implements HttpResponse<String> {
        private final HttpRequest request;
        private final int statusCode;
        private final HttpHeaders headers;
        private final String body;

        private StringResponse(HttpRequest request, int statusCode, HttpHeaders headers, String body) {
            this.request = request;
            this.statusCode = statusCode;
            this.headers = headers;
            this.body = body;
        }

        @Override public int statusCode() { return statusCode; }
        @Override public HttpRequest request() { return request; }
        @Override public Optional<HttpResponse<String>> previousResponse() { return Optional.empty(); }
        @Override public HttpHeaders headers() { return headers; }
        @Override public String body() { return body; }
        @Override public Optional<SSLSession> sslSession() { return Optional.empty(); }
        @Override public URI uri() { return request.uri(); }
        @Override public HttpClient.Version version() { return HttpClient.Version.HTTP_1_1; }
    }
}

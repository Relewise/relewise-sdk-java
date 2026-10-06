package com.relewise.client;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

/** Fake HTTP responses verify the helper without opening ports or accessing a real dataset. */
class IntegrationIndexSyncTest {
    private final ObjectMapper json = new ObjectMapper();
    private final List<Request> requests = new ArrayList<>();
    private IntegrationIndexSync.Response rebuildResponse =
        new IntegrationIndexSync.Response(200, "{\"rebuildTimeMs\":12}");
    private IntegrationIndexSync.Response refreshResponse =
        new IntegrationIndexSync.Response(200, "{\"refreshTimeMs\":8}");

    private record Request(String url, JsonNode body, Map<String, String> headers, Duration timeout) {
    }

    // Capture each request before returning the response chosen by the test.
    private final IntegrationIndexSync.Transport transport = (url, body, headers, timeout) -> {
        requests.add(new Request(url, json.readTree(body), headers, timeout));
        return url.endsWith("/RebuildSearchIndexRequest") ? rebuildResponse : refreshResponse;
    };

    @Test
    void rebuildsThenRefreshesAllCandidateCachesBeforeReturning() throws Exception {
        IntegrationIndexSync.synchronize("dataset", "master-key", "https://example.test/", transport);

        assertEquals(2, requests.size());
        Request rebuild = requests.get(0);
        assertEquals("https://example.test/dataset/ui/RebuildSearchIndexRequest", rebuild.url());
        assertEquals("default", rebuild.body().get("IndexId").asText());

        Request refresh = requests.get(1);
        assertEquals("https://example.test/dataset/ui/RefreshPresorterRequest", refresh.url());
        assertTrue(refresh.body().get("Fill").asBoolean());
        assertTrue(refresh.body().get("Popular").asBoolean());
        assertTrue(refresh.body().get("Fallback").asBoolean());

        for (Request request : requests) {
            assertEquals("APIKey master-key", request.headers().get("Authorization"));
            assertEquals("application/json", request.headers().get("Content-Type"));
            assertEquals("application/json", request.headers().get("Accept"));
            assertEquals(Duration.ofSeconds(120), request.timeout());
        }
    }

    @Test
    void failedRebuildStopsBeforeRefresh() {
        rebuildResponse = new IntegrationIndexSync.Response(503, "{\"message\":\"busy\"}");

        IllegalStateException error = assertThrows(IllegalStateException.class,
            () -> IntegrationIndexSync.synchronize("dataset", "master-key", "https://example.test", transport));
        assertTrue(error.getMessage().contains("HTTP 503"));
        assertEquals(1, requests.size());
    }

    @Test
    void malformedCompletionResponseStopsBeforeRefresh() {
        rebuildResponse = new IntegrationIndexSync.Response(200, "{}");

        IllegalStateException error = assertThrows(IllegalStateException.class,
            () -> IntegrationIndexSync.synchronize("dataset", "master-key", "https://example.test", transport));
        assertTrue(error.getMessage().contains("rebuildTimeMs"));
        assertEquals(1, requests.size());
    }

    @Test
    void failedRefreshIsPropagated() {
        refreshResponse = new IntegrationIndexSync.Response(500, "{}");

        IllegalStateException error = assertThrows(IllegalStateException.class,
            () -> IntegrationIndexSync.synchronize("dataset", "master-key", "https://example.test", transport));
        assertTrue(error.getMessage().contains("HTTP 500"));
        assertEquals(2, requests.size());
    }

    @Test
    void malformedRefreshCompletionIsPropagated() {
        refreshResponse = new IntegrationIndexSync.Response(200, "{\"refreshTimeMs\":-1}");

        IllegalStateException error = assertThrows(IllegalStateException.class,
            () -> IntegrationIndexSync.synchronize("dataset", "master-key", "https://example.test", transport));
        assertTrue(error.getMessage().contains("refreshTimeMs"));
        assertEquals(2, requests.size());
    }

    @Test
    void transportFailureStopsBeforeRefresh() {
        IntegrationIndexSync.Transport failingTransport = (url, body, headers, timeout) -> {
            requests.add(new Request(url, json.readTree(body), headers, timeout));
            throw new IOException("request timed out");
        };

        IOException error = assertThrows(IOException.class,
            () -> IntegrationIndexSync.synchronize("dataset", "master-key", "https://example.test", failingTransport));
        assertEquals("request timed out", error.getMessage());
        assertEquals(1, requests.size());
    }
}

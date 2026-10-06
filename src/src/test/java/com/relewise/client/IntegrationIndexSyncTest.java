package com.relewise.client;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.net.httpserver.HttpServer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * A temporary local server supplies fake UI responses to test the helper's HTTP behavior.
 * It performs no indexing and needs no dataset or credentials; integration tests use SERVER_URL.
 */
class IntegrationIndexSyncTest {
    private final ObjectMapper json = new ObjectMapper();
    private final List<Request> requests = new ArrayList<>();
    private HttpServer server;
    private String serverUrl;
    private int rebuildStatus = 200;
    private String rebuildBody = "{\"rebuildTimeMs\":12}";
    private int refreshStatus = 200;
    private String refreshBody = "{\"refreshTimeMs\":8}";

    private record Request(String path, String method, String authorization, JsonNode body) {
    }

    @BeforeEach
    void startServer() throws Exception {
        // Bind only to this machine; port 0 lets the OS choose an available port for each test.
        server = HttpServer.create(new InetSocketAddress("127.0.0.1", 0), 0);
        server.createContext("/dataset/ui/", exchange -> {
            byte[] requestBody = exchange.getRequestBody().readAllBytes();
            requests.add(new Request(exchange.getRequestURI().getPath(),
                exchange.getRequestMethod(), exchange.getRequestHeaders().getFirst("Authorization"),
                json.readTree(requestBody)));
            // Each test controls these responses to exercise successful and failed operations.
            boolean rebuild = exchange.getRequestURI().getPath().endsWith("/RebuildSearchIndexRequest");
            int status = rebuild ? rebuildStatus : refreshStatus;
            byte[] responseBody = (rebuild ? rebuildBody : refreshBody).getBytes(StandardCharsets.UTF_8);
            exchange.getResponseHeaders().add("Content-Type", "application/json");
            exchange.sendResponseHeaders(status, responseBody.length);
            try (var output = exchange.getResponseBody()) {
                output.write(responseBody);
            }
        });
        server.start();
        serverUrl = "http://127.0.0.1:" + server.getAddress().getPort() + "/";
    }

    @AfterEach
    void stopServer() {
        server.stop(0);
    }

    @Test
    void rebuildsThenRefreshesAllCandidateCachesBeforeReturning() throws Exception {
        IntegrationIndexSync.synchronize("dataset", "master-key", serverUrl);

        assertEquals(2, requests.size());
        Request rebuild = requests.get(0);
        assertEquals("/dataset/ui/RebuildSearchIndexRequest", rebuild.path());
        assertEquals("POST", rebuild.method());
        assertEquals("APIKey master-key", rebuild.authorization());
        assertEquals("default", rebuild.body().get("IndexId").asText());

        Request refresh = requests.get(1);
        assertEquals("/dataset/ui/RefreshPresorterRequest", refresh.path());
        assertEquals("POST", refresh.method());
        assertEquals("APIKey master-key", refresh.authorization());
        assertTrue(refresh.body().get("Fill").asBoolean());
        assertTrue(refresh.body().get("Popular").asBoolean());
        assertTrue(refresh.body().get("Fallback").asBoolean());
    }

    @Test
    void failedRebuildStopsBeforeRefresh() {
        rebuildStatus = 503;
        rebuildBody = "{\"message\":\"busy\"}";

        IllegalStateException error = assertThrows(IllegalStateException.class,
            () -> IntegrationIndexSync.synchronize("dataset", "master-key", serverUrl));
        assertTrue(error.getMessage().contains("HTTP 503"));
        assertEquals(1, requests.size());
    }

    @Test
    void malformedCompletionResponseStopsBeforeRefresh() {
        rebuildBody = "{}";

        IllegalStateException error = assertThrows(IllegalStateException.class,
            () -> IntegrationIndexSync.synchronize("dataset", "master-key", serverUrl));
        assertTrue(error.getMessage().contains("rebuildTimeMs"));
        assertEquals(1, requests.size());
    }

    @Test
    void failedRefreshIsPropagated() {
        refreshStatus = 500;

        IllegalStateException error = assertThrows(IllegalStateException.class,
            () -> IntegrationIndexSync.synchronize("dataset", "master-key", serverUrl));
        assertTrue(error.getMessage().contains("HTTP 500"));
        assertEquals(2, requests.size());
    }

    @Test
    void malformedRefreshCompletionIsPropagated() {
        refreshBody = "{\"refreshTimeMs\":-1}";

        IllegalStateException error = assertThrows(IllegalStateException.class,
            () -> IntegrationIndexSync.synchronize("dataset", "master-key", serverUrl));
        assertTrue(error.getMessage().contains("refreshTimeMs"));
        assertEquals(2, requests.size());
    }
}

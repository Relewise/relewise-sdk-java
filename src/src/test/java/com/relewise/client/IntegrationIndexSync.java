package com.relewise.client;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.Map;

/**
 * Test-only synchronization for fixtures used by search and facet assertions.
 * The UI endpoints require a master API key and return after the work completes.
 */
final class IntegrationIndexSync {
    private static final Duration REQUEST_TIMEOUT = Duration.ofSeconds(120);
    private static final ObjectMapper JSON = new ObjectMapper();

    // Tests supply fake responses through this transport; integration setup uses HttpClient.
    @FunctionalInterface
    interface Transport {
        Response post(String url, String body, Map<String, String> headers, Duration timeout) throws Exception;
    }

    record Response(int statusCode, String body) {
    }

    private IntegrationIndexSync() {
    }

    static void synchronize(String datasetId, String apiKey, String serverUrl) throws Exception {
        HttpClient client = HttpClient.newBuilder().connectTimeout(REQUEST_TIMEOUT).build();
        synchronize(datasetId, apiKey, serverUrl, (url, body, headers, timeout) -> {
            HttpRequest.Builder request = HttpRequest.newBuilder(URI.create(url))
                .timeout(timeout)
                .POST(HttpRequest.BodyPublishers.ofString(body));
            headers.forEach(request::header);
            // send() blocks until the UI operation responds.
            HttpResponse<String> response = client.send(request.build(), HttpResponse.BodyHandlers.ofString());
            return new Response(response.statusCode(), response.body());
        });
    }

    static void synchronize(String datasetId, String apiKey, String serverUrl, Transport transport) throws Exception {
        if (datasetId == null || datasetId.isBlank()
            || apiKey == null || apiKey.isBlank()
            || serverUrl == null || serverUrl.isBlank()) {
            throw new IllegalArgumentException("DATASET_ID, API_KEY, and SERVER_URL are required to synchronize integration fixtures");
        }

        String baseUrl = serverUrl.replaceAll("/+$", "") + "/" + datasetId + "/ui/";
        Map<String, String> headers = Map.of(
            "Authorization", "APIKey " + apiKey,
            "Content-Type", "application/json",
            "Accept", "application/json");

        var rebuild = JSON.createObjectNode().put("IndexId", "default");
        postAndCheck(transport, baseUrl + "RebuildSearchIndexRequest", headers,
            rebuild.toString(), "rebuildTimeMs");

        // Termless searches use presorted candidates, which need a separate refresh after rebuild.
        var refresh = JSON.createObjectNode()
            .put("Fill", true)
            .put("Popular", true)
            .put("Fallback", true);
        postAndCheck(transport, baseUrl + "RefreshPresorterRequest", headers,
            refresh.toString(), "refreshTimeMs");
    }

    private static void postAndCheck(Transport transport, String url, Map<String, String> headers,
                                     String body, String durationField) throws Exception {
        Response response = transport.post(url, body, headers, REQUEST_TIMEOUT);
        if (response.statusCode() < 200 || response.statusCode() >= 300) {
            String details = response.body() == null ? "" : response.body();
            throw new IllegalStateException("Integration synchronization request " + URI.create(url).getPath()
                + " failed with HTTP " + response.statusCode() + ": "
                + details.substring(0, Math.min(details.length(), 500)));
        }

        // Require the completion payload as well as HTTP success before allowing search assertions.
        JsonNode result = JSON.readTree(response.body());
        JsonNode duration = result == null ? null : result.get(durationField);
        if (duration == null || !duration.isNumber()
            || !Double.isFinite(duration.doubleValue()) || duration.doubleValue() < 0) {
            throw new IllegalStateException("Integration synchronization request " + URI.create(url).getPath()
                + " returned an invalid " + durationField);
        }
    }
}

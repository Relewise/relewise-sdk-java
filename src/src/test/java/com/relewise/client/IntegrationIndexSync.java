package com.relewise.client;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

/**
 * Test-only synchronization for fixtures used by search and facet assertions.
 * The UI endpoints require a master API key and return after the work completes.
 */
final class IntegrationIndexSync {
    private static final Duration REQUEST_TIMEOUT = Duration.ofSeconds(120);
    private static final ObjectMapper JSON = new ObjectMapper();

    private IntegrationIndexSync() {
    }

    static void synchronize(String datasetId, String apiKey, String serverUrl) throws Exception {
        if (datasetId == null || datasetId.isBlank()
            || apiKey == null || apiKey.isBlank()
            || serverUrl == null || serverUrl.isBlank()) {
            throw new IllegalArgumentException("DATASET_ID, API_KEY, and SERVER_URL are required to synchronize integration fixtures");
        }

        String baseUrl = serverUrl.replaceAll("/+$", "") + "/" + datasetId + "/ui/";
        HttpClient client = HttpClient.newBuilder().connectTimeout(REQUEST_TIMEOUT).build();

        var rebuild = JSON.createObjectNode().put("IndexId", "default");
        postAndCheck(client, baseUrl + "RebuildSearchIndexRequest", apiKey,
            rebuild.toString(), "rebuildTimeMs");

        var refresh = JSON.createObjectNode()
            .put("Fill", true)
            .put("Popular", true)
            .put("Fallback", true);
        postAndCheck(client, baseUrl + "RefreshPresorterRequest", apiKey,
            refresh.toString(), "refreshTimeMs");
    }

    private static void postAndCheck(HttpClient client, String url, String apiKey,
                                     String body, String durationField) throws Exception {
        HttpRequest request = HttpRequest.newBuilder(URI.create(url))
            .timeout(REQUEST_TIMEOUT)
            .header("Authorization", "APIKey " + apiKey)
            .header("Content-Type", "application/json")
            .header("Accept", "application/json")
            .POST(HttpRequest.BodyPublishers.ofString(body))
            .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        if (response.statusCode() < 200 || response.statusCode() >= 300) {
            String details = response.body() == null ? "" : response.body();
            throw new IllegalStateException("Integration synchronization request " + request.uri().getPath()
                + " failed with HTTP " + response.statusCode() + ": "
                + details.substring(0, Math.min(details.length(), 500)));
        }

        JsonNode result = JSON.readTree(response.body());
        JsonNode duration = result == null ? null : result.get(durationField);
        if (duration == null || !duration.isNumber()
            || !Double.isFinite(duration.doubleValue()) || duration.doubleValue() < 0) {
            throw new IllegalStateException("Integration synchronization request " + request.uri().getPath()
                + " returned an invalid " + durationField);
        }
    }
}

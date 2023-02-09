package com.relewise.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.relewise.client.model.LicensedRequest;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.function.Supplier;

import com.relewise.client.model.TimedResponse;

public class RelewiseClient {
    public String serverUrl  = "https://api.relewise.com";
    private static final String apiVersion = "v1";
    private final HttpClient httpClient;
    private final String datasetId;
    private final String apiKey;

    public RelewiseClient(String datasetId, String apiKey) {
        httpClient = HttpClient.newHttpClient();
        this.datasetId = datasetId;
        this.apiKey = apiKey;
    }

    public <T> HttpResponse<Supplier<T>> makeRequest(String endpoint, LicensedRequest requestBody, Class<T> responseClass) throws IOException, InterruptedException {
        ObjectMapper objectMapper = new ObjectMapper();

        var stringRequestBody = objectMapper.writeValueAsString(requestBody);

        var uri = URI.create(createRequestUrl(
                serverUrl,
                new String[] { datasetId, apiVersion, endpoint }
        ));

        var request = HttpRequest.newBuilder(uri)
                .POST(HttpRequest.BodyPublishers.ofString(stringRequestBody))
                .header("Authorization", "ApiKey " + apiKey)
                .header("Content-Type", "application/json")
                .build();

        return httpClient.send(request, new JsonBodyHandler<T>(responseClass));
    }

    public <T> T makeRequestAndValidate(String endpoint, LicensedRequest requestBody, Class<T> responseClass) throws IOException, InterruptedException {
        var response = makeRequest(endpoint, requestBody, responseClass);
        // TODO: Add validation for error codes
        return response.body().get();
    }

    private String createRequestUrl(String baseUrl, String[] segments) {
        var joinedSegments = String.join("/", segments);
        return baseUrl.endsWith("/")
            ? baseUrl + joinedSegments
            : baseUrl + "/" + joinedSegments;
    }
}

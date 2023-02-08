package com.relewise.client;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.relewise.client.model.LicensedRequest;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import com.relewise.client.model.TimedResponse;

public class RelewiseClient {
    public String serverUrl  = "https://api.relewise.com";
    private String apiVersion = "v1";
    private HttpClient httpClient;
    private String datasetId;
    private String apiKey;

    public RelewiseClient(String datasetId, String apiKey) {
        httpClient = HttpClient.newHttpClient();
        this.datasetId = datasetId;
        this.apiKey = apiKey;
    }

    public void makeRequest(String endpoint, LicensedRequest requestBody) throws IOException, InterruptedException {
        ObjectMapper objectMapper = new ObjectMapper();

        var stringRequestBody = objectMapper.writeValueAsString(requestBody);

        var request = HttpRequest.newBuilder(URI.create(createRequestUrl(serverUrl, apiVersion)))
                .POST(HttpRequest.BodyPublishers.ofString(stringRequestBody))
                .header("Authorization", "ApiKey " + apiKey)
                .header("Content-Type:", "application/json")
                .build();

        var response = httpClient.send(request, new JsonBodyHandler<>(TimedResponse.class));
    }

    private String createRequestUrl(String baseUrl, String version) {
        return baseUrl.endsWith("/")
            ? baseUrl + version
            : baseUrl + "/" + version;
    }
}

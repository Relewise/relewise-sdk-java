package com.relewise.client.infrastructure;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.relewise.client.model.LicensedRequest;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.Properties;
import java.util.function.Supplier;

public class RelewiseClient {
    private static final String apiKeyNotDefinedMessage = "apiKey must not be empty.";
    private static final String apiVersion = "v1";
    private static final String clientName = "RelewiseJavaClient";
    private String clientVersion = "unknown";
    private final String datasetId;
    private final String apiKey;
    private final String serverUrl;
    private final int timeout;
    private final ObjectMapper objectMapper;

    public RelewiseClient(String datasetId, String apiKey, String serverUrl, int timeout) {
        if (apiKey.isBlank()) {
            throw new IllegalArgumentException(apiKeyNotDefinedMessage);
        }

        this.datasetId = datasetId;
        this.apiKey = apiKey;
        this.serverUrl = serverUrl;
        this.timeout = timeout;

        this.objectMapper = JsonMapper.builder()
            .addModule(new JavaTimeModule())
            .build();

        try {
            Properties properties = new Properties();
            properties.load(this.getClass().getClassLoader().getResourceAsStream("project.properties"));
            this.clientVersion = properties.getProperty("version");
        } catch (IOException e) {
            // We intentionally swallow this exception as we don't want users code to throw exceptions if this is not successful.
        }
    }

    public HttpResponse<String> makeRequestAsync(String endpoint, LicensedRequest requestBody) throws IOException, InterruptedException {
        var stringRequestBody = objectMapper.writeValueAsString(requestBody);

        var uri = URI.create(createRequestUrl(
                serverUrl,
                new String[] { datasetId, apiVersion, endpoint }
        ));

        var request = HttpRequest.newBuilder(uri)
                .POST(HttpRequest.BodyPublishers.ofString(stringRequestBody))
                .header("Authorization", "ApiKey " + apiKey)
                .header("Content-Type", "application/json")
                .header("User-Agent",  clientName + "/" + clientVersion)
                .timeout(Duration.ofSeconds(timeout))
                .build();

        var httpClient = HttpClient.newHttpClient();
        return httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    }

    public <T> T makeRequestAndValidate(String endpoint, LicensedRequest requestBody, Class<T> responseClass) throws IOException, InterruptedException, ClientException {
        var response = makeRequestAsync(endpoint, requestBody);

        var statusCode = response.statusCode();
        if (statusCode >= 200 && statusCode <= 299) {
            if (responseClass == Void.class) {
                return null;
            }
            return objectMapper.readValue(response.body(), responseClass);
        }
        if (statusCode == 401) {
            throw new UnauthorizedException(response.body(), statusCode);
        }
        if (statusCode == 503) {
            throw new ServiceUnavailableException(response.body(), statusCode);
        }
        if (statusCode == 500) {
            throw new InternalServerErrorException(response.body(), statusCode);
        }
        if (statusCode == 400) {
            var contentType = response.headers().firstValue("contentType");
            if (contentType.isPresent() && contentType.get().equals("application/problem+json")) {
                throw new ProblemDetailsException(response.body(), statusCode);
            }
            throw new BadRequestException(response.body(), statusCode);
        }
        if (statusCode == 404) {
            return null;
        }
        throw new ClientException(response.body(), statusCode);
    }

    private String createRequestUrl(String baseUrl, String[] segments) {
        var joinedSegments = String.join("/", segments);
        return baseUrl.endsWith("/")
            ? baseUrl + joinedSegments
            : baseUrl + "/" + joinedSegments;
    }
}

package com.relewise.client;

/** OAuth 2.0 client credentials used for server-side Relewise authentication. */
public final class OAuthClientCredentials {
    private final String clientId;
    private final String clientSecret;

    public OAuthClientCredentials(String clientId, String clientSecret) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    public String getClientId() {
        return clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }
}

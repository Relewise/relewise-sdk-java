package com.relewise.client.infrastructure;

import java.time.Instant;

/** An OAuth access token and its absolute expiry time. */
public final class OAuthToken {
    private final String accessToken;
    private final Instant expiresAt;

    OAuthToken(String accessToken, Instant expiresAt) {
        this.accessToken = accessToken;
        this.expiresAt = expiresAt;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public Instant getExpiresAt() {
        return expiresAt;
    }
}

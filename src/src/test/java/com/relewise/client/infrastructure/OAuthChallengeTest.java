package com.relewise.client.infrastructure;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.net.http.HttpHeaders;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class OAuthChallengeTest {
    @ParameterizedTest
    @ValueSource(strings = {
        "Bearer error=\"invalid_token\"",
        "Bearer realm=\"relewise\", error=\"invalid_token\"",
        "bEaReR realm=\"relewise\", ERROR = invalid_token",
        "Bearer error_description=\"Expired, please renew\", error=\"invalid_token\"",
        "Bearer error_description=\"A \\\"quoted\\\" value, with commas\", error=\"invalid_token\"",
        "Basic realm=\"other\", Bearer realm=\"relewise\", error=\"invalid_token\"",
        "Bearer error=\"invalid_token\",",
        ", Bearer error=\"invalid_token\"",
        "Bearer realm=\"relewise\", , error=\"invalid_token\""
    })
    void acceptsInvalidTokenChallenges(String challenge) {
        assertTrue(OAuthChallenge.isInvalidTokenResponse(401, headers(challenge)));
    }

    @ParameterizedTest
    @ValueSource(strings = {
        "Bearer realm=\"relewise\"",
        "Bearer error=\"insufficient_scope\"",
        "Bearer error=\"INVALID_TOKEN\"",
        "Basic error=\"invalid_token\"",
        "Bearer error_description=\"invalid_token\"",
        "Bearer error=\"invalid_token\", error=\"insufficient_scope\"",
        "Bearer error=\"invalid_token\", realm=\"unterminated"
    })
    void rejectsOtherOrMalformedChallenges(String challenge) {
        assertFalse(OAuthChallenge.isInvalidTokenResponse(401, headers(challenge)));
    }

    private static HttpHeaders headers(String value) {
        return HttpHeaders.of(Map.of("WWW-Authenticate", List.of(value)), (name, headerValue) -> true);
    }
}

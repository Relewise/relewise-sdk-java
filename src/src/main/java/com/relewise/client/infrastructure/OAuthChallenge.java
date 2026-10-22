package com.relewise.client.infrastructure;

import java.net.http.HttpHeaders;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class OAuthChallenge {
    private static final String TOKEN = "[!#$%&'*+.^_`|~0-9A-Za-z-]+";
    private static final Pattern CHALLENGE_START = Pattern.compile("^(" + TOKEN + ")(?:\\s+(.*))?$");
    private static final Pattern PARAMETER = Pattern.compile("^(" + TOKEN + ")\\s*=\\s*(?:\"((?:\\\\.|[^\"])*)\"|(" + TOKEN + "))$");

    private OAuthChallenge() { }

    static boolean isInvalidTokenResponse(int statusCode, HttpHeaders headers) {
        if (statusCode != 401) {
            return false;
        }

        var values = headers.allValues("WWW-Authenticate");
        if (values.isEmpty()) {
            return false;
        }

        return parseChallenges(String.join(",", values)).stream().anyMatch(OAuthChallenge::isInvalidTokenChallenge);
    }

    private static List<AuthenticationChallenge> parseChallenges(String header) {
        var parts = splitOutsideQuotes(header);
        if (parts == null) {
            return List.of();
        }

        var challenges = new ArrayList<AuthenticationChallenge>();
        AuthenticationChallenge current = null;

        for (var part : parts) {
            var trimmed = part.trim();
            if (trimmed.isEmpty()) {
                continue;
            }

            Matcher start = CHALLENGE_START.matcher(trimmed);
            boolean startsChallenge = start.matches()
                && (start.group(2) == null || !start.group(2).stripLeading().startsWith("="));

            if (startsChallenge) {
                current = new AuthenticationChallenge(start.group(1));
                challenges.add(current);
                if (start.group(2) != null) {
                    current.parameters.add(start.group(2).trim());
                }
            } else if (current != null) {
                current.parameters.add(trimmed);
            } else {
                return List.of();
            }
        }

        return challenges;
    }

    private static List<String> splitOutsideQuotes(String value) {
        var result = new ArrayList<String>();
        int start = 0;
        boolean quoted = false;
        boolean escaped = false;

        for (int index = 0; index < value.length(); index++) {
            char character = value.charAt(index);
            if (escaped) {
                escaped = false;
            } else if (quoted && character == '\\') {
                escaped = true;
            } else if (character == '"') {
                quoted = !quoted;
            } else if (!quoted && character == ',') {
                result.add(value.substring(start, index));
                start = index + 1;
            }
        }

        if (quoted || escaped) {
            return null;
        }

        result.add(value.substring(start));
        return result;
    }

    private static boolean isInvalidTokenChallenge(AuthenticationChallenge challenge) {
        if (!challenge.scheme.equalsIgnoreCase("Bearer")) {
            return false;
        }

        String error = null;
        for (var parameter : challenge.parameters) {
            Matcher parsed = PARAMETER.matcher(parameter);
            if (!parsed.matches()) {
                return false;
            }
            if (!parsed.group(1).toLowerCase(Locale.ROOT).equals("error")) {
                continue;
            }
            if (error != null) {
                return false;
            }
            error = parsed.group(2) != null
                ? parsed.group(2).replaceAll("\\\\(.)", "$1")
                : parsed.group(3);
        }

        return "invalid_token".equals(error);
    }

    private static final class AuthenticationChallenge {
        private final String scheme;
        private final List<String> parameters = new ArrayList<>();

        private AuthenticationChallenge(String scheme) {
            this.scheme = scheme;
        }
    }
}

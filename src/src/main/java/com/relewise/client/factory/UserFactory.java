package com.relewise.client.factory;

import com.relewise.client.model.User;

import java.util.HashMap;

public class UserFactory {
    public static User byAuthenticatedId(String authenticatedId, String temporaryId) {
        var user = byAuthenticatedId(authenticatedId);
        user.temporaryId = temporaryId;
        return user;
    }
    public static User byAuthenticatedId(String authenticatedId) {
        var user = new User();
        user.authenticatedId = authenticatedId;
        return user;
    }
    public static User byTemporaryId(String temporaryId) {
        var user = new User();
        user.temporaryId = temporaryId;
        return user;
    }
    public static User byIdentifier(String key, String value) {
        var user = new User();
        user.identifiers = new HashMap<>();
        user.identifiers.put(key, value);
        return user;
    }
    public static User byIdentifiers(HashMap<String, String> identifiers) {
        var user = new User();
        user.identifiers = identifiers;
        return user;
    }
    public static User byEmail(String email) {
        var user = new User();
        user.email = email;
        return user;
    }
    public static User byFingerprint(String fingerprint) {
        var user = new User();
        user.fingerprint = fingerprint;
        return user;
    }
}

package com.relewise.client;

import com.relewise.client.factory.UserFactory;
import com.relewise.client.model.User;

public abstract class TestBase {
    protected static String fixtureId(String name) {
        return "java-sdk-" + name;
    }

    protected final String fixtureBrandId() {
        return fixtureId("brand");
    }

    protected final String searchProductId() {
        return fixtureId("search-product");
    }

    protected final User searchUser() {
        return fixtureUser("search-user");
    }

    protected final String filterProductId() {
        return fixtureId("filter-product");
    }

    protected final User fixtureUser(String name) {
        String id = fixtureId(name);
        return UserFactory.byTemporaryId(id).setAuthenticatedId(id);
    }

    public static String GetDatasetId() {
        return System.getenv("DATASET_ID");
    }

    public static String GetApiKey() {
        return System.getenv("API_KEY");
    }

    public static String GetServerUrl() {
        String serverUrl = System.getenv("SERVER_URL");
        return serverUrl == null || serverUrl.isBlank() ? "https://api.relewise.com" : serverUrl.replaceAll("/+$", "");
    }
}

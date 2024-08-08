package com.relewise.client;

public abstract class TestBase {

    public static String GetDatasetId() {
        return System.getenv("DATASET_ID");
    }

    public static String GetApiKey() {
        return System.getenv("API_KEY");
    }
}

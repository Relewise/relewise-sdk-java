package com.relewise.client;

import com.relewise.client.factory.DataValueFactory;
import com.relewise.client.factory.UserFactory;
import com.relewise.client.model.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContentRecommendationsTest extends TestBase {
    @Test
    public void testContentsViewedAfterViewing() throws Exception {
        var recommender = new Recommender(GetDatasetId(), GetApiKey(), "https://api.relewise.com");

        var contentsViewedAfterViewingContent = ContentsViewedAfterViewingContentRequest.create(
            Language.create("en-US"),
            Currency.create("USD"),
            "integration test",
            UserFactory.byTemporaryId("t-Id"),
            "1"
        );

        var response = recommender.recommend(contentsViewedAfterViewingContent);
        assertNotNull(response);
        assertNotEquals(0, response.recommendations.length);
    }

    @Test
    public void testPopularContent() throws Exception {
        var recommender = new Recommender(GetDatasetId(), GetApiKey(), "https://api.relewise.com");

        var popularContents = PopularContentsRequest.create(
            Language.create("en-US"),
            Currency.create("USD"),
            "integration test",
            UserFactory.byTemporaryId("t-Id"),
            500000
        );

        var response = recommender.recommend(popularContents);
        assertNotNull(response);
        assertNotEquals(0, response.recommendations.length);
    }
}
package com.relewise.client;

import com.relewise.client.factory.DataValueFactory;
import com.relewise.client.factory.UserFactory;
import com.relewise.client.model.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContentRecommendationsTest extends TestBase {
    @Test
    void testContentsViewedAfterViewing() throws Exception {
        var recommender = new Recommender(GetDatasetId(), GetApiKey());

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
    void testPopularContent() throws Exception {
        var recommender = new Recommender(GetDatasetId(), GetApiKey());

        var popularContents = PopularContentsRequest.create(
            Language.create("en-US"),
            Currency.create("USD"),
            "integration test",
            UserFactory.byTemporaryId("t-Id")
        ).setSinceMinutesAgo(500000);

        var response = recommender.recommend(popularContents);
        assertNotNull(response);
        assertNotEquals(0, response.recommendations.length);
    }
}
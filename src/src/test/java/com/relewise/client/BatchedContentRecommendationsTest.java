package com.relewise.client;

import com.relewise.client.factory.UserFactory;
import com.relewise.client.model.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BatchedContentRecommendationsTest extends TestBase {
    @Test
    public void testBatchedProductRecommendations() throws Exception {
        var recommender = new Recommender(GetDatasetId(), GetApiKey(), "https://api.relewise.com");

        var contentRecommendationRequestCollection  = ContentRecommendationRequestCollection.create(
            false,
            PopularContentsRequest.create(
                Language.create("en-US"),
                Currency.create("USD"),
                "batched integration test",
                UserFactory.byTemporaryId("t-Id"),
                100000
            ).setSettings(ContentRecommendationRequestSettings.create().setNumberOfRecommendations(1)),
            ContentsViewedAfterViewingContentRequest.create(
                Language.create("en-US"),
                Currency.create("USD"),
                "batched integration test",
                UserFactory.byTemporaryId("t-Id"),
                "1"
            ).setSettings(ContentRecommendationRequestSettings.create().setNumberOfRecommendations(1))
        );

        var response = recommender.recommend(contentRecommendationRequestCollection );

        assertNotNull(response);
        assertEquals(2, response.responses.length);
        assertNotEquals(0, response.responses[0].recommendations.length);
        assertNotEquals(0, response.responses[1].recommendations.length);
    }
}
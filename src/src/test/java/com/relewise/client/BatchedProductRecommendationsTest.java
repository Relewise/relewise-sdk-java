package com.relewise.client;

import com.relewise.client.factory.DataObject;
import com.relewise.client.factory.DataValueFactory;
import com.relewise.client.factory.MultilingualCollectionValue;
import com.relewise.client.factory.UserFactory;
import com.relewise.client.model.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BatchedProductRecommendationsTest extends TestBase {
    @Test
    void testBatchedProductRecommendations() throws Exception {
        var recommender = new Recommender(GetDatasetId(), GetApiKey());

        var productRecommendationRequestCollection = ProductRecommendationRequestCollection.create(
            false,
            ProductsViewedAfterViewingProductRequest.create(
                Language.create("en-US"),
                Currency.create("USD"),
                "batched integration test",
                UserFactory.byTemporaryId("t-Id"),
                ProductAndVariantId.create("1")
            ).setSettings(ProductRecommendationRequestSettings.create().setNumberOfRecommendations(1)),
            PurchasedWithProductRequest.create(
                Language.create("en-US"),
                Currency.create("USD"),
                "batched integration test",
                UserFactory.byTemporaryId("t-Id"),
                ProductAndVariantId.create("1")
            ).setSettings(ProductRecommendationRequestSettings.create().setNumberOfRecommendations(1))
        );

        var response = recommender.recommend(productRecommendationRequestCollection);

        assertNotNull(response);
        assertEquals(2, response.responses.length);
        assertNotEquals(0, response.responses[0].recommendations.length);
        assertNotEquals(0, response.responses[1].recommendations.length);
    }
}
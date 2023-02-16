package com.relewise.client;

import com.relewise.client.factory.UserFactory;
import com.relewise.client.model.*;
import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.*;

public class SearchTermPredictionTest extends TestBase {
    @Test
    public void testSearchTermPrediction() throws Exception {
        var searcher = new Searcher(GetDatasetId(), GetApiKey());

        var searchTermPrediction = SearchTermPredictionRequest.create(
            Language.create("en-US"),
            Currency.create("USD"),
            UserFactory.byTemporaryId("t-id"),
            "integration test",
            "1",
            1
        ).setSettings(
            SearchTermPredictionSettings.create()
                .setTargetEntityTypes(EntityType.Product, EntityType.Content)
        );

        Callable<SearchTermPredictionResponse> action = () -> searcher.predict(searchTermPrediction);
        assertDoesNotThrow(action::call);
        var response = action.call();
        assertNotNull(response);
        assertNotEquals(0, response.predictions.length);
    }
}
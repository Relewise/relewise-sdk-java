package com.relewise.client;

import com.relewise.client.factory.*;
import com.relewise.client.model.*;
import org.junit.jupiter.api.Test;
import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.*;

class SearcherTest extends TestBase {
    @Test
    void testProductSearchWithNoConditions() throws Exception {
        var searcher = new Searcher(GetDatasetId(), GetApiKey());

        var productSearch = ProductSearchRequest.create(
            Language.UNDEFINED,
            Currency.UNDEFINED,
            UserFactory.byTemporaryId("t-id"),
            "integration test",
            "p-1",
            0,
            3
        ).setRelevanceModifiers(
            RelevanceModifierCollection.create(
                ProductDataRelevanceModifier.create(
                    "NoveltyBoostModifier",
                    DataDoubleSelector.create("NoveltyBoostModifier")
                )
            )
        );

        Callable<ProductSearchResponse> action = () -> searcher.search(productSearch);
        assertDoesNotThrow(action::call);
        var response = action.call();
        assertNotNull(response);
        assertEquals(1, response.results.length);
        assertEquals("p-1", response.results[0].productId);
    }
}
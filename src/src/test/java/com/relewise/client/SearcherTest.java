package com.relewise.client;

import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.relewise.client.factory.*;
import com.relewise.client.model.*;
import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.*;

public class SearcherTest extends TestBase {
    @Test
    public void testProductSearchWithNoConditions() throws Exception {
        var searcher = new Searcher(GetDatasetId(), GetApiKey(), "https://api.relewise.com");

        var productSearch = ProductSearchRequest.create(
            Language.create("en-US"),
            Currency.create("USD"),
            UserFactory.byTemporaryId("t-id"),
            "integration test",
            "p-1",
            0,
            3
        ).setRelevanceModifiers(
            RelevanceModifierCollection.create(
                ProductDataRelevanceModifier.create(
                    "NoveltyBoostModifier",
                    new ArrayList<>(),
                    DataDoubleSelector.create("NoveltyBoostModifier")
                )
            )
        );

        Callable<ProductSearchResponse> action = () -> searcher.search(productSearch);
        assertDoesNotThrow(action::call);
        var response = action.call();
        assertNotNull(response);
        assertTrue(response.hits > 0);
        assertNotEquals(0, response.results.length);
    }

    @Test
    public void testProductSearchWithRecentlyViewedFilter() throws Exception {
        var searcher = new Searcher(GetDatasetId(), GetApiKey(), "https://api.relewise.com");

        var productSearch = ProductSearchRequest.create(
            Language.create("en-US"),
            Currency.create("USD"),
            UserFactory.byTemporaryId("t-id"),
            "integration test",
            null,
            0,
            3
        ).setFilters(
            FilterCollection.create(
                ProductRecentlyViewedByUserFilter.create(OffsetDateTime.now().minusDays(365))
            )
        );

        Callable<ProductSearchResponse> action = () -> searcher.search(productSearch);
        assertDoesNotThrow(action::call);
        var response = action.call();
        assertNotNull(response);
        assertTrue(response.hits > 0);
        assertNotEquals(0, response.results.length);
    }

    @Test
    public void testProductCategorySearchWithNoConditions() throws Exception {
        var searcher = new Searcher(GetDatasetId(), GetApiKey(), "https://api.relewise.com");

        var productCategorySearch = ProductCategorySearchRequest.create(
            Language.create("en-US"),
            Currency.create("USD"),
            UserFactory.byTemporaryId("t-id"),
            "integration test",
            null,
            0,
            3
        ).setRelevanceModifiers(
            RelevanceModifierCollection.create(
                ProductDataRelevanceModifier.create(
                    "NoveltyBoostModifier",
                    new ArrayList<>(),
                    DataDoubleSelector.create("NoveltyBoostModifier")
                )
            )
        );

        var response = searcher.search(productCategorySearch);
        assertNotNull(response);
        assertNotEquals(0, response.hits);
        assertNotEquals(0, response.results.length);
    }
}
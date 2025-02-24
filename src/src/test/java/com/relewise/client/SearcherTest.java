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
import static org.junit.jupiter.api.Assertions.assertEquals;

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
                    .setSettings(
                        FilterSettings.create()
                            .setScopes(
                                FilterScopes.create()
                                    .setDefault(ApplyFilterSettings.create(true))
                            )
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

    @Test
    public void testProductSearchWithHighlight() throws Exception {
        var tracker = new Tracker(GetDatasetId(), GetApiKey(), "https://api.relewise.com");

        tracker.track(TrackProductUpdateRequest.create(
            ProductUpdate.create(
                Product.create("p-1")
                    .addToData("Description", DataValueFactory.create(Multilingual.create(MultilingualValue.create(Language.create("en-US"), "the last word is highlighted")))),
                ProductUpdateUpdateKind.ReplaceProvidedProperties
            ).setVariantUpdateKind(ProductUpdateUpdateKind.None)
        ));

        var searcher = new Searcher(GetDatasetId(), GetApiKey(), "https://api.relewise.com");

        var productSearch = ProductSearchRequest.create(
            Language.create("en-US"),
            Currency.create("USD"),
            UserFactory.byTemporaryId("t-id"),
            "integration test",
            "highlighted",
            0,
            3
        ).setSettings(
            ProductSearchSettings.create()
                .setHighlight(ProductSearchSettingsHighlightSettings.create()
                    .setEnabled(true)
                    .setLimit(ProductProductHighlightPropsHighlightSettingsLimits.create()
                        .setMaxSnippetsPerField((short)1)
                        .setMaxSnippetsPerEntry((short)1)
                        .setMaxEntryLimit(1)
                    )
                    .setHighlightable(ProductHighlightProps.create()
                        .addToDataKeys("Description")
                    )
                    .setShape(ProductProductHighlightPropsHighlightSettingsResponseShape.create()
                        .setOffsets(ProductProductHighlightPropsHighlightSettingsOffsetSettings.create()
                            .setInclude(true)
                        )
                    )
            )
        );

        var response = searcher.search(productSearch);

        assertNotNull(response);
        assertNotEquals(0, response.hits);

        var productResult = response.results[0];

        assertNotNull(productResult.highlight);
        assertNotNull(productResult.highlight.offsets);
        assertNotNull(productResult.highlight.offsets.data);
        assertEquals(1, productResult.highlight.offsets.data.length);
        assertEquals("Description", productResult.highlight.offsets.data[0].key);
        assertNotNull(productResult.highlight.offsets.data[0].value);
        assertNotNull(productResult.highlight.offsets.data[0].value[0]);
        assertEquals(17, productResult.highlight.offsets.data[0].value[0].lowerBoundInclusive);
        assertEquals(28, productResult.highlight.offsets.data[0].value[0].upperBoundInclusive);
    }
}
package com.relewise.client;

import com.relewise.client.factory.DataValueFactory;
import com.relewise.client.factory.UserFactory;
import com.relewise.client.model.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

public class TrackerTest extends TestBase {
    @Test
    public void testProductView() throws Exception {
        var tracker = new Tracker(GetDatasetId(), GetApiKey(), "https://api.relewise.com");

        var productSearch = TrackProductViewRequest.create(
            ProductView.create(
                UserFactory.byTemporaryId("t-id"),
                Product.create("p-1"),
                ProductVariant.create("v-1")
            )
        );

        Executable action = () -> tracker.track(productSearch);
        assertDoesNotThrow(action);
    }

    @Test
    public void testProductUpdateWithVariant() throws Exception {
        // Create Product by tracking it.
        var tracker = new Tracker(GetDatasetId(), GetApiKey(), "https://api.relewise.com");

        var productUpdate = TrackProductUpdateRequest.create(
            ProductUpdate.create(
                    Product.create("p-1")
                        .setDisplayName(
                            Multilingual.create(
                                MultilingualValue.create(Language.create("da-dk"), "My Product 1")
                            )
                        )
                        .setBrand(
                            Brand.create("b-1")
                                .setDisplayName("My Brand 1")
                        )
                        .setCategoryPaths(
                            CategoryPath.create(
                                CategoryNameAndId.create(
                                    "c-1",
                                    Multilingual.create(
                                        MultilingualValue.create(
                                            Language.create("da-dk"),
                                            "My Category 1"
                                        )
                                    )
                                )
                            )
                        )
                        .addToData("SomeString", DataValueFactory.create("SomeValue"))
                        .addToData("SomeObject", DataValueFactory.create(new Object() {
                            public final String SomeString = "SomeValue";
                        }))
                        .addToData("SomeStringList", DataValueFactory.create("FirstString", "SecondString"))
                        .addToData("SomeBooleanList", DataValueFactory.create(true, true, false))
                )
                .setVariants(
                    ProductVariant.create("v-1")
                        .setDisplayName(
                            Multilingual.create(
                                MultilingualValue.create(
                                    Language.create("da-dk"),
                                    "My Variant 1"
                                )
                            )
                        )
                )
                .setProductUpdateKind(ProductUpdateUpdateKind.ReplaceProvidedProperties)
                .setVariantUpdateKind(ProductUpdateUpdateKind.ReplaceProvidedProperties)
        );

        Executable action = () -> tracker.track(productUpdate);
        assertDoesNotThrow(action);

        // Validate that the product was created with search.
        var searcher = new Searcher(GetDatasetId(), GetApiKey(), "https://api.relewise.com");

        var productSearch = ProductSearchRequest.create(
            Language.create("da-dk"),
            Currency.create("DKK"),
            UserFactory.anonymous(),
            "integration test",
            "p-1",
            0,
            1
        ).setSettings(
            ProductSearchSettings.create()
                .setSelectedVariantProperties(
                    SelectedVariantPropertiesSettings.create()
                        .setDisplayName(true)
                ).setSelectedProductProperties(
                    SelectedProductPropertiesSettings.create()
                        .setDisplayName(true)
                        .setCategoryPaths(true)
                )
        ).setFilters(FilterCollection.create(
            ProductIdFilter.create().setProductIds("p-1"),
            VariantIdFilter.create().setVariantIds("v-1")
        ));

        var searchResult = searcher.search(productSearch);

        assertEquals(1, searchResult.hits);
        assertNotEquals(0, searchResult.results.length);
        assertEquals("p-1", searchResult.results[0].productId);
        assertEquals("My Product 1", searchResult.results[0].displayName);
        assertEquals("c-1", searchResult.results[0].categoryPaths[0].pathFromRoot.get(0).id);
        assertEquals("My Category 1", searchResult.results[0].categoryPaths[0].pathFromRoot.get(0).displayName);
        assertEquals("v-1", searchResult.results[0].variant.variantId);
        assertEquals("My Variant 1", searchResult.results[0].variant.displayName);
    }
}
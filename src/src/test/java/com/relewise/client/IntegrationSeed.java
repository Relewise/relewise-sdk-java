package com.relewise.client;

import com.relewise.client.factory.DataValueFactory;
import com.relewise.client.factory.UserFactory;
import com.relewise.client.model.*;
import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class IntegrationSeed extends TestBase {
    @Test
    public void createOrUpdatePersistentFixtures() throws Exception {
        var tracker = new Tracker(GetDatasetId(), GetApiKey(), GetServerUrl());
        List<String> productIds = new ArrayList<>();
        for (int category = 0; category < 4; category++) {
            for (int product = 0; product < 4 - category; product++) {
                String id = fixtureId("facet-product-" + category + "-" + product);
                seedProduct(tracker, id, "integration test " + category + " " + product,
                    fixtureId("facet-category-" + category), false);
                productIds.add(id);
            }
        }
        seedProduct(tracker, searchProductId(), "integration test search product", fixtureId("search-category"), true);
        seedProduct(tracker, filterProductId(), "integration test 1", fixtureId("filter-category"), false);
        productIds.add(searchProductId());
        productIds.add(filterProductId());
        tracker.track(TrackProductViewRequest.create(ProductView.create(searchUser(), Product.create(searchProductId()), null)));

        for (String language : new String[] { "en-US", "da-dk" }) {
            waitForHits(ProductSearchRequest.create(Language.create(language), Currency.create(language.equals("da-dk") ? "DKK" : "USD"),
                UserFactory.anonymous(), "integration seed", null, 0, productIds.size())
                .setFilters(FilterCollection.create(ProductIdFilter.create().setProductIds(productIds.toArray(new String[0])))),
                productIds.size());
        }
        waitForHits(ProductSearchRequest.create(Language.create("en-US"), Currency.create("USD"),
            searchUser(), "integration seed", null, 0, 1)
            .setFilters(FilterCollection.create(ProductRecentlyViewedByUserFilter.create(OffsetDateTime.now().minusDays(365))
                .setSettings(FilterSettings.create().setScopes(FilterScopes.create().setDefault(ApplyFilterSettings.create(true)))))), 1);
    }

    private void seedProduct(Tracker tracker, String id, String name, String categoryId, boolean includeDescription) throws Exception {
        var english = Language.create("en-US");
        var danish = Language.create("da-dk");
        var product = Product.create(id)
            .setDisplayName(Multilingual.create(MultilingualValue.create(english, name), MultilingualValue.create(danish, name)))
            .setBrand(Brand.create(fixtureBrandId()).setDisplayName("Integration brand"))
            .setSalesPrice(MultiCurrency.create(Money.create(Currency.create("USD"), 30.0), Money.create(Currency.create("DKK"), 30.0)))
            .addToData("SomeStringList", DataValueFactory.create("FirstString", "SecondString"))
            .addToCategoryPaths(CategoryPath.create(CategoryNameAndId.create(categoryId,
                Multilingual.create(MultilingualValue.create(english, "integration test " + categoryId)))));
        if (includeDescription) {
            product.addToData("Description", DataValueFactory.create(Multilingual.create(
                MultilingualValue.create(english, "the last word is highlighted"))));
        }
        tracker.track(TrackProductUpdateRequest.create(ProductUpdate.create(product, ProductUpdateUpdateKind.ReplaceProvidedProperties)
            .setVariantUpdateKind(ProductUpdateUpdateKind.UpdateAndAppend)));
    }

    // Only the initial seed waits for indexing on a fresh dataset.
    private void waitForHits(ProductSearchRequest request, int expectedHits) throws Exception {
        var searcher = new Searcher(GetDatasetId(), GetApiKey(), GetServerUrl());
        long deadline = System.nanoTime() + TimeUnit.MINUTES.toNanos(5);
        do {
            if (searcher.search(request).hits == expectedHits) return;
            Thread.sleep(500);
        } while (System.nanoTime() < deadline);
        throw new AssertionError("Seed fixtures not searchable: expected " + expectedHits + " hits");
    }
}

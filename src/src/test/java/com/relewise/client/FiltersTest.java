package com.relewise.client;

import com.relewise.client.factory.UserFactory;
import com.relewise.client.model.*;
import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.*;

public class FiltersTest extends TestBase {
    @Test
    public void testProductAssortmentFilter() throws Exception {
        var searcher = new Searcher(GetDatasetId(), GetApiKey(), "https://api.relewise.com");

        var productSearch = ProductSearchRequest.create(
            Language.create("en-US"),
            Currency.create("USD"),
            UserFactory.byTemporaryId("t-id"),
            "integration test",
            "1",
            0,
            20
        ).setFilters(
            FilterCollection.create(
                ProductAssortmentFilter.create().setAssortments(10_000_000)
            )
        );

        var response = searcher.search(productSearch);
        assertNotNull(response);
        assertEquals(0, response.results.length);
    }

    @Test
    public void testProductIdFilter() throws Exception {
        var searcher = new Searcher(GetDatasetId(), GetApiKey(), "https://api.relewise.com");

        var productSearch = ProductSearchRequest.create(
            Language.create("en-US"),
            Currency.create("USD"),
            UserFactory.byTemporaryId("t-id"),
            "integration test",
            "1",
            0,
            20
        ).setFilters(
            FilterCollection.create(
                ProductIdFilter.create().setProductIds("1")
            )
        );

        var response = searcher.search(productSearch);
        assertNotNull(response);
        assertEquals(1, response.results.length);
    }
}
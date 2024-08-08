package com.relewise.client;

import com.relewise.client.factory.UserFactory;
import com.relewise.client.model.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FacetsTest extends TestBase {
    @Test
    public void testSalesPriceFacet() throws Exception {
        var searcher = new Searcher(GetDatasetId(), GetApiKey(), "https://api.relewise.com");

        var productSearch = ProductSearchRequest.create(
            Language.create("en-US"),
            Currency.create("USD"),
            UserFactory.anonymous(),
            "integration test",
            null,
            0,
            0
        ).setFacets(
            ProductFacetQuery.create()
                .setItems(
                    PriceRangeFacet.create(FacetingField.SalesPrice, PriceSelectionStrategy.Product, DoubleRange.create(20.0, null))
                )
        );

        var response = searcher.search(productSearch);
        assertNotNull(response);
        assertNotNull(response.facets);
        assertNotNull(response.facets.items);
        assertNotEquals(0, response.facets.items.size());
        assertEquals(PriceRangeFacetResult.class, response.facets.items.get(0).getClass());
        assertEquals(FacetingField.SalesPrice, response.facets.items.get(0).field);
    }

    @Test
    public void testBrandFacet() throws Exception {
        var searcher = new Searcher(GetDatasetId(), GetApiKey(), "https://api.relewise.com");

        var productSearch = ProductSearchRequest.create(
            Language.create("en-US"),
            Currency.create("USD"),
            UserFactory.anonymous(),
            "integration test",
            null,
            0,
            0
        ).setFacets(
            ProductFacetQuery.create()
                .setItems(
                    BrandFacet.create("b-1")
                        .setField(FacetingField.Brand)
                )
        );

        var response = searcher.search(productSearch);
        assertNotNull(response);
        assertNotNull(response.facets);
        assertNotNull(response.facets.items);
        assertNotEquals(0, response.facets.items.size());
        assertEquals(BrandFacetResult.class, response.facets.items.get(0).getClass());
        assertEquals("b-1", ((BrandFacetResult) response.facets.items.get(0)).selected.get(0));
        assertEquals(FacetingField.Brand, response.facets.items.get(0).field);
    }

    @Test
    public void testProductDataFacet() throws Exception {
        var searcher = new Searcher(GetDatasetId(), GetApiKey(), "https://api.relewise.com");

        var productSearch = ProductSearchRequest.create(
            Language.create("en-US"),
            Currency.create("USD"),
            UserFactory.anonymous(),
            "integration test",
            null,
            0,
            0
        ).setFacets(
            ProductFacetQuery.create()
                .setItems(
                    ProductDataStringValueFacet.create(
                            DataSelectionStrategy.Product,
                            "SomeStringList",
                            new ArrayList<>(List.of(new String[]{"FirstString"})),
                            CollectionFilterType.And
                        )
                        .setField(FacetingField.Data)
                )
        );

        var response = searcher.search(productSearch);
        assertNotNull(response);
        assertNotNull(response.facets);
        assertNotNull(response.facets.items);
        assertNotEquals(0, response.facets.items.size());
        assertEquals(ProductDataStringValueFacetResult.class, response.facets.items.get(0).getClass());
        assertEquals(DataSelectionStrategy.Product, ((ProductDataStringValueFacetResult) response.facets.items.get(0)).dataSelectionStrategy);
        assertEquals("SomeStringList", ((ProductDataStringValueFacetResult) response.facets.items.get(0)).key);
        assertEquals("FirstString", ((ProductDataStringValueFacetResult) response.facets.items.get(0)).selected.get(0));
        assertEquals(FacetingField.Data, response.facets.items.get(0).field);
    }

    @Test
    public void testCategoryFacet() throws Exception {
        var searcher = new Searcher(GetDatasetId(), GetApiKey(), "https://api.relewise.com");

        var productSearch = ProductSearchRequest.create(
            Language.create("en-US"),
            Currency.create("USD"),
            UserFactory.anonymous(),
            "integration test",
            null,
            0,
            0
        ).setFacets(
            ProductFacetQuery.create()
                .setItems(
                    CategoryFacet.create(CategorySelectionStrategy.ImmediateParent)
                        .setField(FacetingField.Category)
                )
        );

        var response = searcher.search(productSearch);
        assertNotNull(response);
        assertNotNull(response.facets);
        assertNotNull(response.facets.items);
        assertNotEquals(0, response.facets.items.size());
        assertEquals(CategoryFacetResult.class, response.facets.items.get(0).getClass());
        assertEquals(CategorySelectionStrategy.ImmediateParent, ((CategoryFacetResult)response.facets.items.get(0)).categorySelectionStrategy);
        assertEquals(FacetingField.Category, response.facets.items.get(0).field);
    }
}
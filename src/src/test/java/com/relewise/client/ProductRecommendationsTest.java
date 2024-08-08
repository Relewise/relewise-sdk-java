package com.relewise.client;

import com.relewise.client.factory.DataObject;
import com.relewise.client.factory.DataValueFactory;
import com.relewise.client.factory.MultilingualCollectionValue;
import com.relewise.client.factory.UserFactory;
import com.relewise.client.model.*;
import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.*;

public class ProductRecommendationsTest extends TestBase {
    @Test
    public void testPurchasedWithProduct() throws Exception {
        var recommender = new Recommender(GetDatasetId(), GetApiKey(), "https://api.relewise.com");

        var purchasedWithProduct = PurchasedWithProductRequest.create(
            Language.create("en-US"),
            Currency.create("USD"),
            "integration test",
            UserFactory.byTemporaryId("t-Id"),
            ProductAndVariantId.create("1")
        );

        var response = recommender.recommend(purchasedWithProduct);

        assertNotNull(response);
        assertNotEquals(0, response.recommendations.length);
    }

    @Test
    public void testProductsViewedAfterViewingProduct() throws Exception {
        var recommender = new Recommender(GetDatasetId(), GetApiKey(), "https://api.relewise.com");

        var productsViewedAfterViewingProduct = ProductsViewedAfterViewingProductRequest.create(
            Language.create("en-US"),
            Currency.create("USD"),
            "integration test",
            UserFactory.byTemporaryId("t-Id"),
            ProductAndVariantId.create("1")
        );

        var response = recommender.recommend(productsViewedAfterViewingProduct);

        assertNotNull(response);
        assertNotEquals(0, response.recommendations.length);
    }

    @Test
    public void testProductsViewedAfterViewingProductWithAllConditions() throws Exception {
        var recommender = new Recommender(GetDatasetId(), GetApiKey(), "https://api.relewise.com");

        var productsViewedAfterViewingProduct = ProductsViewedAfterViewingProductRequest.create(
            Language.create("en-US"),
            Currency.create("USD"),
            "integration test",
            UserFactory.byTemporaryId("t-Id"),
            ProductAndVariantId.create("1")
        ).setFilters(
            FilterCollection.create(
                ProductDataFilter.create("ShortDescription")
                    .setConditions(
                        ValueConditionCollection.create()
                            .setItems(
                                ContainsCondition.create(DataValueFactory.create("d"))
                                    .setValueCollectionEvaluationMode(ContainsConditionCollectionArgumentEvaluationMode.Any),
                                ContainsCondition.create(DataValueFactory.create(1))
                                    .setValueCollectionEvaluationMode(ContainsConditionCollectionArgumentEvaluationMode.Any),
                                ContainsCondition.create(DataValueFactory.create(Money.create(Currency.create("USD"), 1.0)))
                                    .setValueCollectionEvaluationMode(ContainsConditionCollectionArgumentEvaluationMode.Any),
                                ContainsCondition.create(DataValueFactory.create(MultiCurrency.create(Money.create(Currency.create("USD"), 1.0))))
                                    .setValueCollectionEvaluationMode(ContainsConditionCollectionArgumentEvaluationMode.Any),
                                ContainsCondition.create(DataValueFactory.create("a", "b"))
                                    .setValueCollectionEvaluationMode(ContainsConditionCollectionArgumentEvaluationMode.Any),
                                ContainsCondition.create(DataValueFactory.create(1.1, 2.1))
                                    .setValueCollectionEvaluationMode(ContainsConditionCollectionArgumentEvaluationMode.Any),
                                ContainsCondition.create(DataValueFactory.create(true, false, true))
                                    .setValueCollectionEvaluationMode(ContainsConditionCollectionArgumentEvaluationMode.Any),
                                ContainsCondition.create(DataValueFactory.create(Multilingual.create(MultilingualValue.create(Language.create("da-dk"), "dansk tekst"))))
                                    .setValueCollectionEvaluationMode(ContainsConditionCollectionArgumentEvaluationMode.Any),
                                ContainsCondition.create(DataValueFactory.create(Language.create("en-US"), "this text", "and this text"))
                                    .setValueCollectionEvaluationMode(ContainsConditionCollectionArgumentEvaluationMode.Any),
                                ContainsCondition.create(DataValueFactory.create(new MultilingualCollectionValue[] {
                                        MultilingualCollectionValue.create(Language.create("da-dk"), "den her tekst", "og den her"),
                                        MultilingualCollectionValue.create(Language.create("en-US"), "this text", "and this text")
                                    }))
                                    .setValueCollectionEvaluationMode(ContainsConditionCollectionArgumentEvaluationMode.Any),
                                ContainsCondition.create(DataValueFactory.create(new Object() { public final String Key1 = "Value1"; public final String Key2 = "Value2"; }))
                                    .setValueCollectionEvaluationMode(ContainsConditionCollectionArgumentEvaluationMode.Any),
                                ContainsCondition.create(DataValueFactory.create(
                                        DataObject.create(new Object() { public final String Key1 = "Value1"; public final String Key2 = "Value2"; }),
                                        DataObject.create(new Object() { public final String Key3 = "Value3"; public final String Key4 = "Value4"; })
                                    ))
                                    .setValueCollectionEvaluationMode(ContainsConditionCollectionArgumentEvaluationMode.Any)
                            )
                    )
            )
        );

        var response = recommender.recommend(productsViewedAfterViewingProduct);

        assertNotNull(response);
        assertEquals(0, response.recommendations.length);
    }
}
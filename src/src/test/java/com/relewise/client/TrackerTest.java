package com.relewise.client;

import com.relewise.client.factory.DataValueFactory;
import com.relewise.client.factory.MultilingualCollectionValue;
import com.relewise.client.factory.UserFactory;
import com.relewise.client.model.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;

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
    public void testDocsSampleProductUpdateWithVariant() throws Exception {
        var tracker = new Tracker(GetDatasetId(), GetApiKey(), "https://api.relewise.com");

        // Create a timestamp to distinguish active and inactive entities
        // Read more at
        // https://docs.relewise.com/docs/developer/bestpractices/product-integration.html
        long importedAtTimestamp = System.currentTimeMillis();

        // Language can be any string, and doesn't have to be a valid iso-standard.
        var english = Language.create("en");
        var dkk = Currency.create("DKK");

        var updates = new ArrayList<Trackable>();

        // Foreach product that needs to be imported, do the following:
        {
            // The Id should be the primary id of the product
            var product = Product.create("Product-SKU-01");

            // We only set the English translation in this example
            // but more can be set by parsing more MultilingualValue
            // to the Multilingual.create method.
            product.setDisplayName(
                Multilingual.create(
                    MultilingualValue.create(english, "The english display name")
                )
            );

            product.setSalesPrice(MultiCurrency.create(Money.create(dkk, 199.0)));
            product.setListPrice(MultiCurrency.create(Money.create(dkk, 199.0)));

            product.setBrand(
                // Displayname can be left out, but Id is required
                Brand.create("brandId")
                    .setDisplayName("Brand display name")
            );

            // We only set the English translation in this example
            // but more can be set by parsing more MultilingualValue
            // to the Multilingual.create method.
            product.addToData("ShortDescription", DataValueFactory.create(
                Multilingual.create(
                    MultilingualValue.create(english,"The short english description")
                )
            ));

            product.addToCategoryPaths(CategoryPath.create(
                CategoryNameAndId.create("74", Multilingual.create(
                    MultilingualValue.create(english, "Play")
                )),
                CategoryNameAndId.create("2", Multilingual.create(
                    MultilingualValue.create(english, "Swings")
                )),
                CategoryNameAndId.create("529", Multilingual.create(
                    MultilingualValue.create(english, "Swing Seats")
                ))
            ));

            product.addToData("ImportedAt", DataValueFactory.create(importedAtTimestamp));
            product.addToData("MinimumAge", DataValueFactory.create(4));
            product.addToData("InStock", DataValueFactory.create(true));
            product.addToData("USPs", DataValueFactory.create("first usp", "second usp", "third usp"));
            // Add any additional fields you would want returned from Relewise

            var variants = new ArrayList<ProductVariant>();

            // Foreach variant of this product
            {
                var variant = ProductVariant.create("The variant id");

                variant.addToData("Materials", DataValueFactory.create(
                    new MultilingualCollectionValue[] {
                        new MultilingualCollectionValue(
                            english, new String[] { "Wood", "Metal" }
                        )
                    }
                ));

                variant.addToData("Colors", DataValueFactory.create(
                    new MultilingualCollectionValue[] {
                        new MultilingualCollectionValue(
                            english, new String[] { "Red", "Green" }
                        )
                    }
                ));

                variant.addToData("PrimaryMaterial", DataValueFactory.create(
                    Multilingual.create(MultilingualValue.create(english, "Wood")))
                );
                variant.addToData("PrimaryColor", DataValueFactory.create(
                    Multilingual.create(MultilingualValue.create(english, "Red")))
                );

                // Add any additional fields you would want returned from Relewise

                variants.add(variant);
            }

            var productUpdate = ProductUpdate.create(
                product, ProductUpdateUpdateKind.ReplaceProvidedProperties
            );
            productUpdate.setVariants(variants.toArray(new ProductVariant[variants.size()]));
            productUpdate.setVariantUpdateKind(ProductUpdateUpdateKind.ReplaceProvidedProperties);
            productUpdate.setReplaceExistingVariants(true);
            // Replace existing variants = true will delete all variants in Relewise
            // (for the listed products) not included in this update request.

            updates.add(productUpdate);
        }
        // Foreach product END

        // If this is a full-import (not delta), disable all non-included products
        {
            // Setting this to false will make it disable all products that don't have the "ImportedAt" key.
            boolean onlyDisableOldProductsThatHaveTheImportedAtKey = true;

            boolean negated = true;
            var nonUpdatedProductFilter = FilterCollection.create(
                ProductDataFilter.create(
                    "ImportedAt",
                    ValueConditionCollection.create().setItems(
                        EqualsCondition.create(DataValueFactory.create(importedAtTimestamp), negated)
                    ),
                    true,
                    onlyDisableOldProductsThatHaveTheImportedAtKey,
                    null,
                    null)
            );

            var disableProductsWithoutNewestTimestamp = ProductAdministrativeAction.create(
                Language.UNDEFINED,
                Currency.UNDEFINED,
                nonUpdatedProductFilter,
                ProductAdministrativeActionUpdateKind.Disable,
                ProductAdministrativeActionUpdateKind.Disable
            );

            updates.add(disableProductsWithoutNewestTimestamp);
        }

        boolean negated = false;
        var updatedProductFilter = FilterCollection.create(
            ProductDataFilter.create(
                "ImportedAt",
                ValueConditionCollection.create().setItems(
                    EqualsCondition.create(DataValueFactory.create(importedAtTimestamp), negated)
                ),
                true,
                true,
                null,
                null)
        );
        var enabledProductsWithNewestTimestamp = ProductAdministrativeAction.create(
            Language.UNDEFINED,
            Currency.UNDEFINED,
            updatedProductFilter,
            ProductAdministrativeActionUpdateKind.Enable,
            ProductAdministrativeActionUpdateKind.Enable
        );

        updates.add(enabledProductsWithNewestTimestamp);

        tracker.track(BatchedTrackingRequest.create(updates.toArray(new Trackable[updates.size()])));
    }

    @Test
    public void testDocsSampleContentUpdate() throws Exception {
        var tracker = new Tracker(GetDatasetId(), GetApiKey(), "https://api.relewise.com");

        // Create a timestamp to distinguish active and inactive entities
        // Read more at
        // https://docs.relewise.com/docs/developer/bestpractices/product-integration.html
        long importedAtTimestamp = System.currentTimeMillis();

        // Language can be any string, and doesn't have to be a valid iso-standard.
        var english = Language.create("en");

        var updates = new ArrayList<Trackable>();

        // Foreach content element that needs to be imported, do the following:
        {
            // The Id should be some value associated to the content element
            // which does not change if titles or similar are changed.
            var content = Content.create("Content-ID-01");

            // We only set the English translation in this example
            // but more can be set by parsing more MultilingualValue
            // to the Multilingual.create method.
            content.setDisplayName(Multilingual.create(
                MultilingualValue.create(english, "The English display name"))
            );

            content.addToData("ShortDescription", DataValueFactory.create(Multilingual.create(
                MultilingualValue.create(
                    english,
                    "The short English description"
                )
            )));

            content.addToCategoryPaths(CategoryPath.create(
                CategoryNameAndId.create("23", Multilingual.create(
                    MultilingualValue.create(english, "Outdoor")
                )),
                CategoryNameAndId.create("372", Multilingual.create(
                    MultilingualValue.create(english, "Hiking")
                ))
            ));

            content.addToData("ImportedAt", DataValueFactory.create(importedAtTimestamp));
            content.addToData("ReadingTimeInMinutes", DataValueFactory.create(3));
            content.addToData("News", DataValueFactory.create(true));
            content.addToData("Badges", DataValueFactory.create("fun", "current season", "some other badge"));

            var contentUpdate = ContentUpdate.create(
                content,
                ContentUpdateUpdateKind.ReplaceProvidedProperties
            );

            updates.add(contentUpdate);
        }
        // Foreach content element END

        // If this is a full-import (not delta), disable all non-included content elements
        {
            // Setting this to false will make it disable all content elements that don't have the "ImportedAt" key.
            boolean onlyDisableOldContentElementsThatHaveTheImportedAtKey = true;

            boolean negated = true;
            var nonUpdatedContentFilter = FilterCollection.create(
                ContentDataFilter.create(
                    "ImportedAt",
                    ValueConditionCollection.create().setItems(
                        EqualsCondition.create(DataValueFactory.create(importedAtTimestamp), negated)
                    ),
                    true,
                    onlyDisableOldContentElementsThatHaveTheImportedAtKey,
                    null,
                    null
                )
            );

            var disableContentElementsWithoutNewestTimestamp = ContentAdministrativeAction.create(
                Language.UNDEFINED,
                Currency.UNDEFINED,
                nonUpdatedContentFilter,
                ContentAdministrativeActionUpdateKind.Disable
            );

            updates.add(disableContentElementsWithoutNewestTimestamp);
        }

        boolean negated = false;
        var updatedContentFilter = FilterCollection.create(
            ContentDataFilter.create(
                "ImportedAt",
                ValueConditionCollection.create().setItems(
                    EqualsCondition.create(DataValueFactory.create(importedAtTimestamp), negated)
                ),
                true,
                true,
                null,
                null
            )
        );
        var enableContentElementsWithNewestTimestamp = ContentAdministrativeAction.create(
            Language.UNDEFINED,
            Currency.UNDEFINED,
            updatedContentFilter,
            ContentAdministrativeActionUpdateKind.Enable
        );

        updates.add(enableContentElementsWithNewestTimestamp);

        tracker.track(BatchedTrackingRequest.create(
            updates.toArray(new Trackable[updates.size()])
        ));
    }

    @Test
    public void testCompactProductUpdateWithVariant() throws Exception {
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
package com.relewise.client;

import com.relewise.client.factory.DataValueFactory;
import com.relewise.client.factory.UserFactory;
import com.relewise.client.model.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInfo;

import java.time.OffsetDateTime;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;

public abstract class TestBase {

    private final Set<String> fixtureProducts = new LinkedHashSet<>();
    private final Set<String> fixtureContents = new LinkedHashSet<>();
    private final Set<String> fixtureProductCategories = new LinkedHashSet<>();
    private final Set<String> fixtureContentCategories = new LinkedHashSet<>();
    private final Set<String> fixtureBrands = new LinkedHashSet<>();
    private final Set<String> fixtureUsers = new LinkedHashSet<>();
    private String testBrandId;
    private String searchProductId;
    private String searchUserId;
    private String filterProductId;

    protected final String fixtureId(String name) {
        return "java-sdk-integration-" + name + "-" + UUID.randomUUID();
    }

    protected final String fixtureBrandId() {
        if (testBrandId == null) {
            testBrandId = fixtureId("brand");
            fixtureBrands.add(testBrandId);
        }
        return testBrandId;
    }

    protected final String searchProductId() {
        return searchProductId;
    }

    protected final User searchUser() {
        return UserFactory.byTemporaryId(searchUserId).setAuthenticatedId(searchUserId);
    }

    protected final String filterProductId() {
        return filterProductId;
    }

    protected final User fixtureUser(String name) {
        String id = fixtureId(name);
        fixtureUsers.add(id);
        return UserFactory.byTemporaryId(id).setAuthenticatedId(id);
    }

    protected final void deleteFixtureProductAfterTest(String id) {
        fixtureProducts.add(id);
    }

    protected final void deleteFixtureContentAfterTest(String id) {
        fixtureContents.add(id);
    }

    protected final void deleteFixtureProductCategoryAfterTest(String id) {
        fixtureProductCategories.add(id);
    }

    protected final void deleteFixtureContentCategoryAfterTest(String id) {
        fixtureContentCategories.add(id);
    }

    protected final void deleteFixtureBrandAfterTest(String id) {
        fixtureBrands.add(id);
    }

    @BeforeEach
    void createDatasetFixture(TestInfo testInfo) throws Exception {
        Class<?> testClass = testInfo.getTestClass().orElseThrow();
        if (testClass == FacetsTest.class) {
            for (int category = 0; category < 4; category++) {
                String categoryId = fixtureId("facet-category-" + category);
                for (int product = 0; product < 4 - category; product++) {
                    seedProduct(fixtureId("facet-product-" + category + "-" + product),
                        "integration test " + category + " " + product, categoryId);
                }
            }
        } else if (testClass == SearcherTest.class || testClass == TrackerTest.class) {
            if (testClass == SearcherTest.class) {
                searchProductId = fixtureId("search-product");
                seedProduct(searchProductId, "integration test search product", fixtureId("search-category"));
                var tracker = new Tracker(GetDatasetId(), GetApiKey(), GetServerUrl());
                searchUserId = fixtureId("search-user");
                fixtureUsers.add(searchUserId);
                tracker.track(TrackProductViewRequest.create(ProductView.create(
                    searchUser(),
                    Product.create(searchProductId), null)));
            }
        } else if (testClass == FiltersTest.class) {
            filterProductId = fixtureId("filter-product");
            seedProduct(filterProductId, "integration test 1", fixtureId("filter-category"));
        }
        awaitIndexedFixture();
        if (testClass == SearcherTest.class) {
            awaitProductHits(ProductSearchRequest.create(Language.create("en-US"), Currency.create("USD"),
                searchUser(), "integration fixture readiness", null, 0, 1)
                .setFilters(FilterCollection.create(ProductRecentlyViewedByUserFilter.create(
                    OffsetDateTime.now().minusDays(365)).setSettings(FilterSettings.create()
                    .setScopes(FilterScopes.create().setDefault(ApplyFilterSettings.create(true)))))), 1);
        }
    }

    protected final ProductSearchResponse awaitProductHits(ProductSearchRequest request, int minimumHits) throws Exception {
        var searcher = new Searcher(GetDatasetId(), GetApiKey(), GetServerUrl());
        long deadline = System.nanoTime() + java.util.concurrent.TimeUnit.SECONDS.toNanos(45);
        do {
            ProductSearchResponse response = searcher.search(request);
            if (response.hits >= minimumHits) return response;
            Thread.sleep(500);
        } while (System.nanoTime() < deadline);
        throw new AssertionError("Integration search result was not ready within 45 seconds");
    }

    protected final void awaitIndexedFixture() throws Exception {
        if (fixtureProducts.isEmpty() && fixtureContents.isEmpty()) return;
        IntegrationIndexSync.synchronize(GetDatasetId(), GetApiKey(), GetServerUrl());
        var searcher = new Searcher(GetDatasetId(), GetApiKey(), GetServerUrl());
        long deadline = System.nanoTime() + java.util.concurrent.TimeUnit.SECONDS.toNanos(45);
        Language productLanguage = getClass() == TrackerTest.class ? Language.create("da-dk") : Language.create("en-US");
        Currency productCurrency = getClass() == TrackerTest.class ? Currency.create("DKK") : Currency.create("USD");
        do {
            boolean productsReady = fixtureProducts.isEmpty() || searcher.search(ProductSearchRequest.create(
                productLanguage, productCurrency, UserFactory.anonymous(),
                "integration fixture readiness", null, 0, fixtureProducts.size())
                .setFilters(FilterCollection.create(ProductIdFilter.create()
                    .setProductIds(fixtureProducts.toArray(new String[0]))))).hits >= fixtureProducts.size();
            boolean contentsReady = fixtureContents.isEmpty() || searcher.search(ContentSearchRequest.create(
                Language.create("en-US"), Currency.create("USD"), UserFactory.anonymous(),
                "integration fixture readiness", null, 0, fixtureContents.size())
                .setFilters(FilterCollection.create(ContentIdFilter.create()
                    .setContentIds(fixtureContents.toArray(new String[0]))))).hits >= fixtureContents.size();
            if (productsReady && contentsReady) return;
            Thread.sleep(500);
        } while (System.nanoTime() < deadline);
        throw new AssertionError("Integration fixture was not indexed within 45 seconds");
    }

    private void seedProduct(String id, String name, String categoryId) throws Exception {
        fixtureProducts.add(id);
        fixtureProductCategories.add(categoryId);
        String brandId = fixtureBrandId();
        var english = Language.create("en-US");
        var danish = Language.create("da-dk");
        var product = Product.create(id)
            .setDisplayName(Multilingual.create(
                MultilingualValue.create(english, name),
                MultilingualValue.create(danish, name)))
            .setBrand(Brand.create(brandId).setDisplayName("Integration brand"))
            .setSalesPrice(MultiCurrency.create(Money.create(Currency.create("USD"), 30.0)))
            .addToData("SomeStringList", DataValueFactory.create("FirstString", "SecondString"))
            .addToCategoryPaths(CategoryPath.create(CategoryNameAndId.create(categoryId,
                Multilingual.create(MultilingualValue.create(english, "integration test " + categoryId)))));
        new Tracker(GetDatasetId(), GetApiKey(), GetServerUrl())
            .track(TrackProductUpdateRequest.create(ProductUpdate.create(product, ProductUpdateUpdateKind.ReplaceProvidedProperties)
                .setVariantUpdateKind(ProductUpdateUpdateKind.UpdateAndAppend)));
    }

    @AfterEach
    void deleteDatasetFixture() throws Exception {
        if (fixtureProducts.isEmpty() && fixtureContents.isEmpty() && fixtureProductCategories.isEmpty()
            && fixtureContentCategories.isEmpty() && fixtureBrands.isEmpty() && fixtureUsers.isEmpty()) return;
        var tracker = new Tracker(GetDatasetId(), GetApiKey(), GetServerUrl());
        try {
            if (!fixtureProducts.isEmpty()) tracker.track(TrackProductAdministrativeActionRequest.create(
                ProductAdministrativeAction.create(Language.UNDEFINED, Currency.UNDEFINED,
                    FilterCollection.create(ProductIdFilter.create().setProductIds(fixtureProducts.toArray(new String[0]))),
                    ProductAdministrativeActionUpdateKind.Delete, ProductAdministrativeActionUpdateKind.None)));
        } finally {
            try {
                if (!fixtureContents.isEmpty()) tracker.track(TrackContentAdministrativeActionRequest.create(
                    ContentAdministrativeAction.create(Language.UNDEFINED, Currency.UNDEFINED,
                        FilterCollection.create(ContentIdFilter.create().setContentIds(fixtureContents.toArray(new String[0]))),
                        ContentAdministrativeActionUpdateKind.Delete)));
            } finally {
                try {
                    if (!fixtureProductCategories.isEmpty()) tracker.track(TrackProductCategoryAdministrativeActionRequest.create(
                        ProductCategoryAdministrativeAction.create(Language.UNDEFINED, Currency.UNDEFINED,
                            FilterCollection.create(ProductCategoryIdFilter.create(CategoryScope.Ancestor)
                                .setCategoryIds(fixtureProductCategories.toArray(new String[0]))),
                            CategoryAdministrativeActionUpdateKind.Delete)));
                } finally {
                    try {
                        if (!fixtureContentCategories.isEmpty()) tracker.track(TrackContentCategoryAdministrativeActionRequest.create(
                            ContentCategoryAdministrativeAction.create(Language.UNDEFINED, Currency.UNDEFINED,
                                FilterCollection.create(ContentCategoryIdFilter.create(CategoryScope.Ancestor)
                                    .setCategoryIds(fixtureContentCategories.toArray(new String[0]))),
                                CategoryAdministrativeActionUpdateKind.Delete)));
                    } finally {
                        try {
                            if (!fixtureBrands.isEmpty()) tracker.track(TrackBrandAdministrativeActionRequest.create(
                                BrandAdministrativeAction.create(Language.UNDEFINED, Currency.UNDEFINED,
                                    FilterCollection.create(BrandIdFilter.create()
                                        .setBrandIds(fixtureBrands.toArray(new String[0]))),
                                    BrandAdministrativeActionUpdateKind.Delete)));
                        } finally {
                            if (!fixtureUsers.isEmpty()) tracker.track(TrackUserAdministrativeActionRequest.create(
                                UserAdministrativeAction.create(UserConditionCollection.create(
                                    AuthenticatedIdCondition.create().setAuthenticatedIds(fixtureUsers.toArray(new String[0]))),
                                    UserAdministrativeActionDeleteUser.create())));
                        }
                    }
                }
            }
        }
    }

    public static String GetDatasetId() {
        return System.getenv("DATASET_ID");
    }

    public static String GetApiKey() {
        return System.getenv("API_KEY");
    }

    public static String GetServerUrl() {
        String serverUrl = System.getenv("SERVER_URL");
        return serverUrl == null || serverUrl.isBlank() ? "https://api.relewise.com" : serverUrl.replaceAll("/+$", "");
    }
}

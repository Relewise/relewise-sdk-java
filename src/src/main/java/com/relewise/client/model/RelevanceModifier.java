package com.relewise.client.model;

import com.fasterxml.jackson.annotation.*;
import javax.annotation.Nullable;
import java.io.IOException;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Arrays;
import java.util.UUID;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ProductRecentlyViewedByUserRelevanceModifier.class, name = "Relewise.Client.Requests.RelevanceModifiers.ProductRecentlyViewedByUserRelevanceModifier, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductRecentlyPurchasedByUserRelevanceModifier.class, name = "Relewise.Client.Requests.RelevanceModifiers.ProductRecentlyPurchasedByUserRelevanceModifier, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductCategoryIdRelevanceModifier.class, name = "Relewise.Client.Requests.RelevanceModifiers.ProductCategoryIdRelevanceModifier, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductAssortmentRelevanceModifier.class, name = "Relewise.Client.Requests.RelevanceModifiers.ProductAssortmentRelevanceModifier, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductDataRelevanceModifier.class, name = "Relewise.Client.Requests.RelevanceModifiers.ProductDataRelevanceModifier, Relewise.Client"),
    @JsonSubTypes.Type(value = VariantSpecificationsInCommonRelevanceModifier.class, name = "Relewise.Client.Requests.RelevanceModifiers.VariantSpecificationsInCommonRelevanceModifier, Relewise.Client"),
    @JsonSubTypes.Type(value = VariantSpecificationValueRelevanceModifier.class, name = "Relewise.Client.Requests.RelevanceModifiers.VariantSpecificationValueRelevanceModifier, Relewise.Client"),
    @JsonSubTypes.Type(value = VariantAssortmentRelevanceModifier.class, name = "Relewise.Client.Requests.RelevanceModifiers.VariantAssortmentRelevanceModifier, Relewise.Client"),
    @JsonSubTypes.Type(value = VariantDataRelevanceModifier.class, name = "Relewise.Client.Requests.RelevanceModifiers.VariantDataRelevanceModifier, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductIdRelevanceModifier.class, name = "Relewise.Client.Requests.RelevanceModifiers.ProductIdRelevanceModifier, Relewise.Client"),
    @JsonSubTypes.Type(value = BrandIdRelevanceModifier.class, name = "Relewise.Client.Requests.RelevanceModifiers.BrandIdRelevanceModifier, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductListPriceRelevanceModifier.class, name = "Relewise.Client.Requests.RelevanceModifiers.ProductListPriceRelevanceModifier, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductSalesPriceRelevanceModifier.class, name = "Relewise.Client.Requests.RelevanceModifiers.ProductSalesPriceRelevanceModifier, Relewise.Client"),
    @JsonSubTypes.Type(value = VariantListPriceRelevanceModifier.class, name = "Relewise.Client.Requests.RelevanceModifiers.VariantListPriceRelevanceModifier, Relewise.Client"),
    @JsonSubTypes.Type(value = VariantSalesPriceRelevanceModifier.class, name = "Relewise.Client.Requests.RelevanceModifiers.VariantSalesPriceRelevanceModifier, Relewise.Client"),
    @JsonSubTypes.Type(value = UserFavoriteProductRelevanceModifier.class, name = "Relewise.Client.Requests.RelevanceModifiers.UserFavoriteProductRelevanceModifier, Relewise.Client"),
    @JsonSubTypes.Type(value = VariantIdRelevanceModifier.class, name = "Relewise.Client.Requests.RelevanceModifiers.VariantIdRelevanceModifier, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductRecentlyPurchasedByCompanyRelevanceModifier.class, name = "Relewise.Client.Requests.RelevanceModifiers.ProductRecentlyPurchasedByCompanyRelevanceModifier, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductRecentlyViewedByCompanyRelevanceModifier.class, name = "Relewise.Client.Requests.RelevanceModifiers.ProductRecentlyViewedByCompanyRelevanceModifier, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductRecentlyPurchasedByUserCompanyRelevanceModifier.class, name = "Relewise.Client.Requests.RelevanceModifiers.ProductRecentlyPurchasedByUserCompanyRelevanceModifier, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductRecentlyViewedByUserCompanyRelevanceModifier.class, name = "Relewise.Client.Requests.RelevanceModifiers.ProductRecentlyViewedByUserCompanyRelevanceModifier, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentRecentlyViewedByUserRelevanceModifier.class, name = "Relewise.Client.Requests.RelevanceModifiers.ContentRecentlyViewedByUserRelevanceModifier, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductCategoryRecentlyViewedByUserRelevanceModifier.class, name = "Relewise.Client.Requests.RelevanceModifiers.ProductCategoryRecentlyViewedByUserRelevanceModifier, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentCategoryRecentlyViewedByUserRelevanceModifier.class, name = "Relewise.Client.Requests.RelevanceModifiers.ContentCategoryRecentlyViewedByUserRelevanceModifier, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentDataRelevanceModifier.class, name = "Relewise.Client.Requests.RelevanceModifiers.ContentDataRelevanceModifier, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductCategoryDataRelevanceModifier.class, name = "Relewise.Client.Requests.RelevanceModifiers.ProductCategoryDataRelevanceModifier, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentCategoryDataRelevanceModifier.class, name = "Relewise.Client.Requests.RelevanceModifiers.ContentCategoryDataRelevanceModifier, Relewise.Client"),
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class RelevanceModifier
{
    public String $type = "";
    /** Filters which entities this relevance modifier can apply to. */
    public FilterCollection filters;
    /** Filters which entities this relevance modifier can apply to. */
    public FilterCollection getFilters()
    {
        return this.filters;
    }
    /** Filters which entities this relevance modifier can apply to. */
    public RelevanceModifier setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
}

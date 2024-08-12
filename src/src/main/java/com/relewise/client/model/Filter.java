package com.relewise.client.model;

import com.fasterxml.jackson.annotation.*;
import javax.annotation.Nullable;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Arrays;
import java.util.UUID;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashSet;
    
/** a <code>Filter</code> that can be used to define which entities to include in queries. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ProductRecentlyViewedByUserFilter.class, name = "Relewise.Client.Requests.Filters.ProductRecentlyViewedByUserFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductRecentlyPurchasedByUserFilter.class, name = "Relewise.Client.Requests.Filters.ProductRecentlyPurchasedByUserFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductCategoryIdFilter.class, name = "Relewise.Client.Requests.Filters.ProductCategoryIdFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductIdFilter.class, name = "Relewise.Client.Requests.Filters.ProductIdFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductAssortmentFilter.class, name = "Relewise.Client.Requests.Filters.ProductAssortmentFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductDataFilter.class, name = "Relewise.Client.Requests.Filters.ProductDataFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = VariantIdFilter.class, name = "Relewise.Client.Requests.Filters.VariantIdFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = VariantSpecificationFilter.class, name = "Relewise.Client.Requests.Filters.VariantSpecificationFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = VariantAssortmentFilter.class, name = "Relewise.Client.Requests.Filters.VariantAssortmentFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = VariantDataFilter.class, name = "Relewise.Client.Requests.Filters.VariantDataFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = CartDataFilter.class, name = "Relewise.Client.Requests.Filters.CartDataFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentIdFilter.class, name = "Relewise.Client.Requests.Filters.ContentIdFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentDataFilter.class, name = "Relewise.Client.Requests.Filters.ContentDataFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductDisplayNameFilter.class, name = "Relewise.Client.Requests.Filters.ProductDisplayNameFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = BrandIdFilter.class, name = "Relewise.Client.Requests.Filters.BrandIdFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductListPriceFilter.class, name = "Relewise.Client.Requests.Filters.ProductListPriceFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductSalesPriceFilter.class, name = "Relewise.Client.Requests.Filters.ProductSalesPriceFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = VariantListPriceFilter.class, name = "Relewise.Client.Requests.Filters.VariantListPriceFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = VariantSalesPriceFilter.class, name = "Relewise.Client.Requests.Filters.VariantSalesPriceFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductHasVariantsFilter.class, name = "Relewise.Client.Requests.Filters.ProductHasVariantsFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentCategoryIdFilter.class, name = "Relewise.Client.Requests.Filters.ContentCategoryIdFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = OrFilter.class, name = "Relewise.Client.Requests.Filters.OrFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = AndFilter.class, name = "Relewise.Client.Requests.Filters.AndFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductCategoryDataFilter.class, name = "Relewise.Client.Requests.Filters.ProductCategoryDataFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentCategoryDataFilter.class, name = "Relewise.Client.Requests.Filters.ContentCategoryDataFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = BrandDataFilter.class, name = "Relewise.Client.Requests.Filters.BrandDataFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductCategoryAssortmentFilter.class, name = "Relewise.Client.Requests.Filters.ProductCategoryAssortmentFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentCategoryAssortmentFilter.class, name = "Relewise.Client.Requests.Filters.ContentCategoryAssortmentFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = BrandAssortmentFilter.class, name = "Relewise.Client.Requests.Filters.BrandAssortmentFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductAndVariantIdFilter.class, name = "Relewise.Client.Requests.Filters.ProductAndVariantIdFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductCategoryHasParentFilter.class, name = "Relewise.Client.Requests.Filters.ProductCategoryHasParentFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentCategoryHasParentFilter.class, name = "Relewise.Client.Requests.Filters.ContentCategoryHasParentFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductCategoryHasChildFilter.class, name = "Relewise.Client.Requests.Filters.ProductCategoryHasChildFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentCategoryHasChildFilter.class, name = "Relewise.Client.Requests.Filters.ContentCategoryHasChildFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductCategoryLevelFilter.class, name = "Relewise.Client.Requests.Filters.ProductCategoryLevelFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentCategoryLevelFilter.class, name = "Relewise.Client.Requests.Filters.ContentCategoryLevelFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductCategoryHasAncestorFilter.class, name = "Relewise.Client.Requests.Filters.ProductCategoryHasAncestorFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentCategoryHasAncestorFilter.class, name = "Relewise.Client.Requests.Filters.ContentCategoryHasAncestorFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentAssortmentFilter.class, name = "Relewise.Client.Requests.Filters.ContentAssortmentFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductCategoryHasProductsFilter.class, name = "Relewise.Client.Requests.Filters.ProductCategoryHasProductsFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentCategoryHasContentsFilter.class, name = "Relewise.Client.Requests.Filters.ContentCategoryHasContentsFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = CompanyIdFilter.class, name = "Relewise.Client.Requests.Filters.CompanyIdFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = CompanyDataFilter.class, name = "Relewise.Client.Requests.Filters.CompanyDataFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductRecentlyViewedByUserCompanyFilter.class, name = "Relewise.Client.Requests.Filters.ProductRecentlyViewedByUserCompanyFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductRecentlyViewedByCompanyFilter.class, name = "Relewise.Client.Requests.Filters.ProductRecentlyViewedByCompanyFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductRecentlyPurchasedByUserCompanyFilter.class, name = "Relewise.Client.Requests.Filters.ProductRecentlyPurchasedByUserCompanyFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductRecentlyPurchasedByCompanyFilter.class, name = "Relewise.Client.Requests.Filters.ProductRecentlyPurchasedByCompanyFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentRecentlyViewedByUserFilter.class, name = "Relewise.Client.Requests.Filters.ContentRecentlyViewedByUserFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentCategoryRecentlyViewedByUserFilter.class, name = "Relewise.Client.Requests.Filters.ContentCategoryRecentlyViewedByUserFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductCategoryRecentlyViewedByUserFilter.class, name = "Relewise.Client.Requests.Filters.ProductCategoryRecentlyViewedByUserFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductRecentlyViewedByUserParentCompanyFilter.class, name = "Relewise.Client.Requests.Filters.ProductRecentlyViewedByUserParentCompanyFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductRecentlyPurchasedByUserParentCompanyFilter.class, name = "Relewise.Client.Requests.Filters.ProductRecentlyPurchasedByUserParentCompanyFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductDisabledFilter.class, name = "Relewise.Client.Requests.Filters.ProductDisabledFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentDisabledFilter.class, name = "Relewise.Client.Requests.Filters.ContentDisabledFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = VariantDisabledFilter.class, name = "Relewise.Client.Requests.Filters.VariantDisabledFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = BrandDisabledFilter.class, name = "Relewise.Client.Requests.Filters.BrandDisabledFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductCategoryDisabledFilter.class, name = "Relewise.Client.Requests.Filters.ProductCategoryDisabledFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentCategoryDisabledFilter.class, name = "Relewise.Client.Requests.Filters.ContentCategoryDisabledFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = CompanyDisabledFilter.class, name = "Relewise.Client.Requests.Filters.CompanyDisabledFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductDataHasKeyFilter.class, name = "Relewise.Client.Requests.Filters.ProductDataHasKeyFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentDataHasKeyFilter.class, name = "Relewise.Client.Requests.Filters.ContentDataHasKeyFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = VariantDataHasKeyFilter.class, name = "Relewise.Client.Requests.Filters.VariantDataHasKeyFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = BrandDataHasKeyFilter.class, name = "Relewise.Client.Requests.Filters.BrandDataHasKeyFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductCategoryDataHasKeyFilter.class, name = "Relewise.Client.Requests.Filters.ProductCategoryDataHasKeyFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentCategoryDataHasKeyFilter.class, name = "Relewise.Client.Requests.Filters.ContentCategoryDataHasKeyFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = CompanyDataHasKeyFilter.class, name = "Relewise.Client.Requests.Filters.CompanyDataHasKeyFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductHasCategoriesFilter.class, name = "Relewise.Client.Requests.Filters.ProductHasCategoriesFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentHasCategoriesFilter.class, name = "Relewise.Client.Requests.Filters.ContentHasCategoriesFilter, Relewise.Client"),
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class Filter
{
    public String $type = "";
    /** Defines whether the <code>Filter</code> should exclude the matching entities instead of including the matching entities. */
    public Boolean negated;
    public @Nullable FilterSettings settings;
    /** Defines whether the <code>Filter</code> should exclude the matching entities instead of including the matching entities. */
    public Boolean getNegated()
    {
        return this.negated;
    }
    public @Nullable FilterSettings getSettings()
    {
        return this.settings;
    }
    /** Defines whether the <code>Filter</code> should exclude the matching entities instead of including the matching entities. */
    public Filter setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    public Filter setSettings(FilterSettings settings)
    {
        this.settings = settings;
        return this;
    }
}

package com.relewise.client.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.annotation.Nullable;
import java.io.IOException;
import java.time.OffsetDateTime;
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
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class Filter
{
    public String $type = "Relewise.Client.Requests.Filters.Filter, Relewise.Client";
    public Boolean negated;
    public Boolean getNegated()
    {
        return this.negated;
    }
    public Filter setNegated(Boolean negated)
    {
        this.negated = negated;;
        return this;
    }
}

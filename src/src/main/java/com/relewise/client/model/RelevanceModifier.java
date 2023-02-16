package com.relewise.client.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
})
public abstract class RelevanceModifier
{
    public String $type = "Relewise.Client.Requests.RelevanceModifiers.RelevanceModifier, Relewise.Client";
    public FilterCollection filters;
    public FilterCollection getFilters()
    {
        return this.filters;
    }
    public RelevanceModifier setFilters(FilterCollection filters)
    {
        this.filters = filters;;
        return this;
    }
}

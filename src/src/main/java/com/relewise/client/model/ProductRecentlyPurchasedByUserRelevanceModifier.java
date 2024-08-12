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
    property = "$type",
    defaultImpl = ProductRecentlyPurchasedByUserRelevanceModifier.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductRecentlyPurchasedByUserRelevanceModifier extends RelevanceModifier implements IProductRelevanceModifier
{
    public String $type = "Relewise.Client.Requests.RelevanceModifiers.ProductRecentlyPurchasedByUserRelevanceModifier, Relewise.Client";
    public OffsetDateTime sinceUtc;
    public Double ifPreviouslyPurchasedByUserMultiplyWeightBy;
    public Double ifNotPreviouslyPurchasedByUserMultiplyWeightBy;
    public static ProductRecentlyPurchasedByUserRelevanceModifier create(OffsetDateTime sinceUtc)
    {
        return new ProductRecentlyPurchasedByUserRelevanceModifier(sinceUtc);
    }
    public ProductRecentlyPurchasedByUserRelevanceModifier(OffsetDateTime sinceUtc)
    {
        this.sinceUtc = sinceUtc;
        this.ifPreviouslyPurchasedByUserMultiplyWeightBy = 1d;
        this.ifNotPreviouslyPurchasedByUserMultiplyWeightBy = 1d;
    }
    public static ProductRecentlyPurchasedByUserRelevanceModifier create(OffsetDateTime sinceUtc, Double ifPreviouslyPurchasedByUserMultiplyWeightBy, Double ifNotPreviouslyPurchasedByUserMultiplyWeightBy)
    {
        return new ProductRecentlyPurchasedByUserRelevanceModifier(sinceUtc, ifPreviouslyPurchasedByUserMultiplyWeightBy, ifNotPreviouslyPurchasedByUserMultiplyWeightBy);
    }
    public ProductRecentlyPurchasedByUserRelevanceModifier(OffsetDateTime sinceUtc, Double ifPreviouslyPurchasedByUserMultiplyWeightBy, Double ifNotPreviouslyPurchasedByUserMultiplyWeightBy)
    {
        this.sinceUtc = sinceUtc;
        this.ifPreviouslyPurchasedByUserMultiplyWeightBy = ifPreviouslyPurchasedByUserMultiplyWeightBy;
        this.ifNotPreviouslyPurchasedByUserMultiplyWeightBy = ifNotPreviouslyPurchasedByUserMultiplyWeightBy;
    }
    public ProductRecentlyPurchasedByUserRelevanceModifier()
    {
        this.ifPreviouslyPurchasedByUserMultiplyWeightBy = 1d;
        this.ifNotPreviouslyPurchasedByUserMultiplyWeightBy = 1d;
    }
    public OffsetDateTime getSinceUtc()
    {
        return this.sinceUtc;
    }
    public Double getIfPreviouslyPurchasedByUserMultiplyWeightBy()
    {
        return this.ifPreviouslyPurchasedByUserMultiplyWeightBy;
    }
    public Double getIfNotPreviouslyPurchasedByUserMultiplyWeightBy()
    {
        return this.ifNotPreviouslyPurchasedByUserMultiplyWeightBy;
    }
    public ProductRecentlyPurchasedByUserRelevanceModifier setSinceUtc(OffsetDateTime sinceUtc)
    {
        this.sinceUtc = sinceUtc;
        return this;
    }
    public ProductRecentlyPurchasedByUserRelevanceModifier setIfPreviouslyPurchasedByUserMultiplyWeightBy(Double ifPreviouslyPurchasedByUserMultiplyWeightBy)
    {
        this.ifPreviouslyPurchasedByUserMultiplyWeightBy = ifPreviouslyPurchasedByUserMultiplyWeightBy;
        return this;
    }
    public ProductRecentlyPurchasedByUserRelevanceModifier setIfNotPreviouslyPurchasedByUserMultiplyWeightBy(Double ifNotPreviouslyPurchasedByUserMultiplyWeightBy)
    {
        this.ifNotPreviouslyPurchasedByUserMultiplyWeightBy = ifNotPreviouslyPurchasedByUserMultiplyWeightBy;
        return this;
    }
    @Override
    public ProductRecentlyPurchasedByUserRelevanceModifier setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
}

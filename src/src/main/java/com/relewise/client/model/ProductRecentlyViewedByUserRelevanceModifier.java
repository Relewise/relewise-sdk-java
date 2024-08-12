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
    defaultImpl = ProductRecentlyViewedByUserRelevanceModifier.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductRecentlyViewedByUserRelevanceModifier extends RelevanceModifier implements IProductRelevanceModifier
{
    public String $type = "Relewise.Client.Requests.RelevanceModifiers.ProductRecentlyViewedByUserRelevanceModifier, Relewise.Client";
    public OffsetDateTime sinceUtc;
    public Double ifPreviouslyViewedByUserMultiplyWeightBy;
    public Double ifNotPreviouslyViewedByUserMultiplyWeightBy;
    public static ProductRecentlyViewedByUserRelevanceModifier create(OffsetDateTime sinceUtc)
    {
        return new ProductRecentlyViewedByUserRelevanceModifier(sinceUtc);
    }
    public ProductRecentlyViewedByUserRelevanceModifier(OffsetDateTime sinceUtc)
    {
        this.sinceUtc = sinceUtc;
        this.ifPreviouslyViewedByUserMultiplyWeightBy = 1d;
        this.ifNotPreviouslyViewedByUserMultiplyWeightBy = 1d;
    }
    public static ProductRecentlyViewedByUserRelevanceModifier create(OffsetDateTime sinceUtc, Double ifPreviouslyViewedByUserMultiplyWeightBy, Double ifNotPreviouslyViewedByUserMultiplyWeightBy)
    {
        return new ProductRecentlyViewedByUserRelevanceModifier(sinceUtc, ifPreviouslyViewedByUserMultiplyWeightBy, ifNotPreviouslyViewedByUserMultiplyWeightBy);
    }
    public ProductRecentlyViewedByUserRelevanceModifier(OffsetDateTime sinceUtc, Double ifPreviouslyViewedByUserMultiplyWeightBy, Double ifNotPreviouslyViewedByUserMultiplyWeightBy)
    {
        this.sinceUtc = sinceUtc;
        this.ifPreviouslyViewedByUserMultiplyWeightBy = ifPreviouslyViewedByUserMultiplyWeightBy;
        this.ifNotPreviouslyViewedByUserMultiplyWeightBy = ifNotPreviouslyViewedByUserMultiplyWeightBy;
    }
    public ProductRecentlyViewedByUserRelevanceModifier()
    {
        this.ifPreviouslyViewedByUserMultiplyWeightBy = 1d;
        this.ifNotPreviouslyViewedByUserMultiplyWeightBy = 1d;
    }
    public OffsetDateTime getSinceUtc()
    {
        return this.sinceUtc;
    }
    public Double getIfPreviouslyViewedByUserMultiplyWeightBy()
    {
        return this.ifPreviouslyViewedByUserMultiplyWeightBy;
    }
    public Double getIfNotPreviouslyViewedByUserMultiplyWeightBy()
    {
        return this.ifNotPreviouslyViewedByUserMultiplyWeightBy;
    }
    public ProductRecentlyViewedByUserRelevanceModifier setSinceUtc(OffsetDateTime sinceUtc)
    {
        this.sinceUtc = sinceUtc;
        return this;
    }
    public ProductRecentlyViewedByUserRelevanceModifier setIfPreviouslyViewedByUserMultiplyWeightBy(Double ifPreviouslyViewedByUserMultiplyWeightBy)
    {
        this.ifPreviouslyViewedByUserMultiplyWeightBy = ifPreviouslyViewedByUserMultiplyWeightBy;
        return this;
    }
    public ProductRecentlyViewedByUserRelevanceModifier setIfNotPreviouslyViewedByUserMultiplyWeightBy(Double ifNotPreviouslyViewedByUserMultiplyWeightBy)
    {
        this.ifNotPreviouslyViewedByUserMultiplyWeightBy = ifNotPreviouslyViewedByUserMultiplyWeightBy;
        return this;
    }
    @Override
    public ProductRecentlyViewedByUserRelevanceModifier setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
}

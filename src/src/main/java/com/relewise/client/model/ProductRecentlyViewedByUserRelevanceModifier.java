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
    
/** a <code>RelevanceModifier</code> that can change the relevance of a Product depending on whether they have viewed this product within some timespan. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = ProductRecentlyViewedByUserRelevanceModifier.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductRecentlyViewedByUserRelevanceModifier extends RecentlyViewedByUserRelevanceModifier implements IProductRelevanceModifier
{
    public String $type = "Relewise.Client.Requests.RelevanceModifiers.ProductRecentlyViewedByUserRelevanceModifier, Relewise.Client";
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
    /**
     * Creates a <code>RelevanceModifier</code> that can change the relevance of a Product depending on whether they have viewed this product within some timespan.
     * @param sinceUtc The start of the time period in which an entity will be considered relevant to the user if viewed previously by them.
     * @param ifPreviouslyViewedByUserMultiplyWeightBy The weight that the entity will be multiplied with if it has been viewed in the past by the user (since SinceUtc).
     * @param ifNotPreviouslyViewedByUserMultiplyWeightBy The weight that the entity will be multiplied with if it has not been viewed in the past by the user (since SinceUtc).
     */
    public static ProductRecentlyViewedByUserRelevanceModifier create(OffsetDateTime sinceUtc, Double ifPreviouslyViewedByUserMultiplyWeightBy, Double ifNotPreviouslyViewedByUserMultiplyWeightBy)
    {
        return new ProductRecentlyViewedByUserRelevanceModifier(sinceUtc, ifPreviouslyViewedByUserMultiplyWeightBy, ifNotPreviouslyViewedByUserMultiplyWeightBy);
    }
    /**
     * Creates a <code>RelevanceModifier</code> that can change the relevance of a Product depending on whether they have viewed this product within some timespan.
     * @param sinceUtc The start of the time period in which an entity will be considered relevant to the user if viewed previously by them.
     * @param ifPreviouslyViewedByUserMultiplyWeightBy The weight that the entity will be multiplied with if it has been viewed in the past by the user (since SinceUtc).
     * @param ifNotPreviouslyViewedByUserMultiplyWeightBy The weight that the entity will be multiplied with if it has not been viewed in the past by the user (since SinceUtc).
     */
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
    @Override
    public ProductRecentlyViewedByUserRelevanceModifier setSinceUtc(@Nullable OffsetDateTime sinceUtc)
    {
        this.sinceUtc = sinceUtc;
        return this;
    }
    @Override
    public ProductRecentlyViewedByUserRelevanceModifier setIfPreviouslyViewedByUserMultiplyWeightBy(Double ifPreviouslyViewedByUserMultiplyWeightBy)
    {
        this.ifPreviouslyViewedByUserMultiplyWeightBy = ifPreviouslyViewedByUserMultiplyWeightBy;
        return this;
    }
    @Override
    public ProductRecentlyViewedByUserRelevanceModifier setIfNotPreviouslyViewedByUserMultiplyWeightBy(Double ifNotPreviouslyViewedByUserMultiplyWeightBy)
    {
        this.ifNotPreviouslyViewedByUserMultiplyWeightBy = ifNotPreviouslyViewedByUserMultiplyWeightBy;
        return this;
    }
    @Override
    public ProductRecentlyViewedByUserRelevanceModifier setSinceMinutesAgo(@Nullable Integer sinceMinutesAgo)
    {
        this.sinceMinutesAgo = sinceMinutesAgo;
        return this;
    }
    @Override
    public ProductRecentlyViewedByUserRelevanceModifier setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
}

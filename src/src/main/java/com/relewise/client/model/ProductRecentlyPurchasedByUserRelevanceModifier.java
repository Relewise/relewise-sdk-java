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
import java.util.Set;
import java.util.HashSet;
    
/** a <code>RelevanceModifier</code> that can change the relevance of a Product depending on whether they have bought this product within some timespan. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = ProductRecentlyPurchasedByUserRelevanceModifier.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductRecentlyPurchasedByUserRelevanceModifier extends RelevanceModifier implements IProductRelevanceModifier
{
    public String $type = "Relewise.Client.Requests.RelevanceModifiers.ProductRecentlyPurchasedByUserRelevanceModifier, Relewise.Client";
    /** The start of the time period in which a product will be considered relevant to the user if bought previously by them. */
    public @Nullable OffsetDateTime sinceUtc;
    /** The weight that the Product will be multiplied with if it has been bought in the past by the user (since <code>SinceUtc</code>). */
    public Double ifPreviouslyPurchasedByUserMultiplyWeightBy;
    /** The weight that the Product will be multiplied with if it has not been bought in the past by the user (since <code>SinceUtc</code>). */
    public Double ifNotPreviouslyPurchasedByUserMultiplyWeightBy;
    /** The minutes since in which a product will be considered relevant to the user if bought previously by them. */
    public @Nullable Integer sinceMinutesAgo;
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
    /**
     * Creates a <code>RelevanceModifier</code> that can change the relevance of a Product depending on whether they have bought this product within some timespan.
     * @param sinceUtc The start of the time period in which a product will be considered relevant to the user if bought previously by them.
     * @param ifPreviouslyPurchasedByUserMultiplyWeightBy The weight that the Product will be multiplied with if it has been bought in the past by the user (since SinceUtc).
     * @param ifNotPreviouslyPurchasedByUserMultiplyWeightBy The weight that the Product will be multiplied with if it has not been bought in the past by the user (since SinceUtc).
     */
    public static ProductRecentlyPurchasedByUserRelevanceModifier create(OffsetDateTime sinceUtc, Double ifPreviouslyPurchasedByUserMultiplyWeightBy, Double ifNotPreviouslyPurchasedByUserMultiplyWeightBy)
    {
        return new ProductRecentlyPurchasedByUserRelevanceModifier(sinceUtc, ifPreviouslyPurchasedByUserMultiplyWeightBy, ifNotPreviouslyPurchasedByUserMultiplyWeightBy);
    }
    /**
     * Creates a <code>RelevanceModifier</code> that can change the relevance of a Product depending on whether they have bought this product within some timespan.
     * @param sinceUtc The start of the time period in which a product will be considered relevant to the user if bought previously by them.
     * @param ifPreviouslyPurchasedByUserMultiplyWeightBy The weight that the Product will be multiplied with if it has been bought in the past by the user (since SinceUtc).
     * @param ifNotPreviouslyPurchasedByUserMultiplyWeightBy The weight that the Product will be multiplied with if it has not been bought in the past by the user (since SinceUtc).
     */
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
    /** The start of the time period in which a product will be considered relevant to the user if bought previously by them. */
    public @Nullable OffsetDateTime getSinceUtc()
    {
        return this.sinceUtc;
    }
    /** The weight that the Product will be multiplied with if it has been bought in the past by the user (since <code>SinceUtc</code>). */
    public Double getIfPreviouslyPurchasedByUserMultiplyWeightBy()
    {
        return this.ifPreviouslyPurchasedByUserMultiplyWeightBy;
    }
    /** The weight that the Product will be multiplied with if it has not been bought in the past by the user (since <code>SinceUtc</code>). */
    public Double getIfNotPreviouslyPurchasedByUserMultiplyWeightBy()
    {
        return this.ifNotPreviouslyPurchasedByUserMultiplyWeightBy;
    }
    /** The minutes since in which a product will be considered relevant to the user if bought previously by them. */
    public @Nullable Integer getSinceMinutesAgo()
    {
        return this.sinceMinutesAgo;
    }
    /** The start of the time period in which a product will be considered relevant to the user if bought previously by them. */
    public ProductRecentlyPurchasedByUserRelevanceModifier setSinceUtc(@Nullable OffsetDateTime sinceUtc)
    {
        this.sinceUtc = sinceUtc;
        return this;
    }
    /** The weight that the Product will be multiplied with if it has been bought in the past by the user (since <code>SinceUtc</code>). */
    public ProductRecentlyPurchasedByUserRelevanceModifier setIfPreviouslyPurchasedByUserMultiplyWeightBy(Double ifPreviouslyPurchasedByUserMultiplyWeightBy)
    {
        this.ifPreviouslyPurchasedByUserMultiplyWeightBy = ifPreviouslyPurchasedByUserMultiplyWeightBy;
        return this;
    }
    /** The weight that the Product will be multiplied with if it has not been bought in the past by the user (since <code>SinceUtc</code>). */
    public ProductRecentlyPurchasedByUserRelevanceModifier setIfNotPreviouslyPurchasedByUserMultiplyWeightBy(Double ifNotPreviouslyPurchasedByUserMultiplyWeightBy)
    {
        this.ifNotPreviouslyPurchasedByUserMultiplyWeightBy = ifNotPreviouslyPurchasedByUserMultiplyWeightBy;
        return this;
    }
    /** The minutes since in which a product will be considered relevant to the user if bought previously by them. */
    public ProductRecentlyPurchasedByUserRelevanceModifier setSinceMinutesAgo(@Nullable Integer sinceMinutesAgo)
    {
        this.sinceMinutesAgo = sinceMinutesAgo;
        return this;
    }
    @Override
    public ProductRecentlyPurchasedByUserRelevanceModifier setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
}

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
    
/** A <code>RelevanceModifier</code> that multiplies the relevance of a product based on the current user's engagement data (sentiment and/or favorite). */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = ProductEngagementRelevanceModifier.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductEngagementRelevanceModifier extends RelevanceModifier implements IProductRelevanceModifier
{
    public String $type = "Relewise.Client.Requests.RelevanceModifiers.ProductEngagementRelevanceModifier, Relewise.Client";
    /** The sentiment that must match for <code>MultiplyWeightBy</code> to apply. */
    public @Nullable ProductEngagementDataSentimentKind sentiment;
    /** The favorite flag that must match for <code>MultiplyWeightBy</code> to apply. */
    public @Nullable Boolean isFavorite;
    /** The multiplier applied when the modifier condition is satisfied (or when it is not satisfied if <code>Negated</code> is <code>true</code>). */
    public Double multiplyWeightBy;
    /** When set to <code>true</code>, the multiplier applies when the condition is not satisfied instead of when it matches. */
    public Boolean negated;
    public static ProductEngagementRelevanceModifier create(@Nullable ProductEngagementDataSentimentKind sentiment, @Nullable Boolean isFavorite)
    {
        return new ProductEngagementRelevanceModifier(sentiment, isFavorite);
    }
    public ProductEngagementRelevanceModifier(@Nullable ProductEngagementDataSentimentKind sentiment, @Nullable Boolean isFavorite)
    {
        this.sentiment = sentiment;
        this.isFavorite = isFavorite;
        this.multiplyWeightBy = 1d;
        this.negated = false;
    }
    /**
     * Creates a new <code>ProductEngagementRelevanceModifier</code>.
     * @param sentiment The sentiment that must match for MultiplyWeightBy to apply.
     * @param isFavorite The favorite flag that must match for MultiplyWeightBy to apply.
     * @param multiplyWeightBy The multiplier applied when the modifier condition is satisfied (or when it is not satisfied if Negated is true).
     * @param negated When set to true, the multiplier applies when the condition is not satisfied instead of when it matches.
     */
    public static ProductEngagementRelevanceModifier create(@Nullable ProductEngagementDataSentimentKind sentiment, @Nullable Boolean isFavorite, Double multiplyWeightBy, Boolean negated)
    {
        return new ProductEngagementRelevanceModifier(sentiment, isFavorite, multiplyWeightBy, negated);
    }
    /**
     * Creates a new <code>ProductEngagementRelevanceModifier</code>.
     * @param sentiment The sentiment that must match for MultiplyWeightBy to apply.
     * @param isFavorite The favorite flag that must match for MultiplyWeightBy to apply.
     * @param multiplyWeightBy The multiplier applied when the modifier condition is satisfied (or when it is not satisfied if Negated is true).
     * @param negated When set to true, the multiplier applies when the condition is not satisfied instead of when it matches.
     */
    public ProductEngagementRelevanceModifier(@Nullable ProductEngagementDataSentimentKind sentiment, @Nullable Boolean isFavorite, Double multiplyWeightBy, Boolean negated)
    {
        this.sentiment = sentiment;
        this.isFavorite = isFavorite;
        this.multiplyWeightBy = multiplyWeightBy;
        this.negated = negated;
    }
    public ProductEngagementRelevanceModifier()
    {
        this.multiplyWeightBy = 1d;
        this.negated = false;
    }
    /** The sentiment that must match for <code>MultiplyWeightBy</code> to apply. */
    public @Nullable ProductEngagementDataSentimentKind getSentiment()
    {
        return this.sentiment;
    }
    /** The favorite flag that must match for <code>MultiplyWeightBy</code> to apply. */
    public @Nullable Boolean getIsFavorite()
    {
        return this.isFavorite;
    }
    /** The multiplier applied when the modifier condition is satisfied (or when it is not satisfied if <code>Negated</code> is <code>true</code>). */
    public Double getMultiplyWeightBy()
    {
        return this.multiplyWeightBy;
    }
    /** When set to <code>true</code>, the multiplier applies when the condition is not satisfied instead of when it matches. */
    public Boolean getNegated()
    {
        return this.negated;
    }
    /** The sentiment that must match for <code>MultiplyWeightBy</code> to apply. */
    public ProductEngagementRelevanceModifier setSentiment(@Nullable ProductEngagementDataSentimentKind sentiment)
    {
        this.sentiment = sentiment;
        return this;
    }
    /** The favorite flag that must match for <code>MultiplyWeightBy</code> to apply. */
    public ProductEngagementRelevanceModifier setIsFavorite(@Nullable Boolean isFavorite)
    {
        this.isFavorite = isFavorite;
        return this;
    }
    /** The multiplier applied when the modifier condition is satisfied (or when it is not satisfied if <code>Negated</code> is <code>true</code>). */
    public ProductEngagementRelevanceModifier setMultiplyWeightBy(Double multiplyWeightBy)
    {
        this.multiplyWeightBy = multiplyWeightBy;
        return this;
    }
    /** When set to <code>true</code>, the multiplier applies when the condition is not satisfied instead of when it matches. */
    public ProductEngagementRelevanceModifier setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    @Override
    public ProductEngagementRelevanceModifier setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
}

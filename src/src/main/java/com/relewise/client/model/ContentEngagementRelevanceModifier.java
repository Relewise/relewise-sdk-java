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
    
/** A <code>RelevanceModifier</code> that multiplies the relevance of content based on the current user's engagement data. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = ContentEngagementRelevanceModifier.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentEngagementRelevanceModifier extends RelevanceModifier implements IContentRelevanceModifier
{
    public String $type = "Relewise.Client.Requests.RelevanceModifiers.ContentEngagementRelevanceModifier, Relewise.Client";
    /** The sentiment that must match for <code>MultiplyWeightBy</code> to apply. */
    public @Nullable ContentEngagementDataSentimentKind sentiment;
    /** The favorite flag that must match for <code>MultiplyWeightBy</code> to apply. */
    public @Nullable Boolean isFavorite;
    /** The multiplier applied when the modifier condition is satisfied (or when it is not satisfied if <code>Negated</code> is <code>true</code>). */
    public Double multiplyWeightBy;
    /** When set to <code>true</code>, the multiplier applies when the condition is not satisfied instead of when it matches. */
    public Boolean negated;
    public static ContentEngagementRelevanceModifier create(@Nullable ContentEngagementDataSentimentKind sentiment, @Nullable Boolean isFavorite)
    {
        return new ContentEngagementRelevanceModifier(sentiment, isFavorite);
    }
    public ContentEngagementRelevanceModifier(@Nullable ContentEngagementDataSentimentKind sentiment, @Nullable Boolean isFavorite)
    {
        this.sentiment = sentiment;
        this.isFavorite = isFavorite;
        this.multiplyWeightBy = 1d;
        this.negated = false;
    }
    /**
     * Creates a new <code>ContentEngagementRelevanceModifier</code>.
     * @param sentiment The sentiment that must match for MultiplyWeightBy to apply.
     * @param isFavorite The favorite flag that must match for MultiplyWeightBy to apply.
     * @param multiplyWeightBy The multiplier applied when the modifier condition is satisfied (or when it is not satisfied if Negated is true).
     * @param negated When set to true, the multiplier applies when the condition is not satisfied instead of when it matches.
     */
    public static ContentEngagementRelevanceModifier create(@Nullable ContentEngagementDataSentimentKind sentiment, @Nullable Boolean isFavorite, Double multiplyWeightBy, Boolean negated)
    {
        return new ContentEngagementRelevanceModifier(sentiment, isFavorite, multiplyWeightBy, negated);
    }
    /**
     * Creates a new <code>ContentEngagementRelevanceModifier</code>.
     * @param sentiment The sentiment that must match for MultiplyWeightBy to apply.
     * @param isFavorite The favorite flag that must match for MultiplyWeightBy to apply.
     * @param multiplyWeightBy The multiplier applied when the modifier condition is satisfied (or when it is not satisfied if Negated is true).
     * @param negated When set to true, the multiplier applies when the condition is not satisfied instead of when it matches.
     */
    public ContentEngagementRelevanceModifier(@Nullable ContentEngagementDataSentimentKind sentiment, @Nullable Boolean isFavorite, Double multiplyWeightBy, Boolean negated)
    {
        this.sentiment = sentiment;
        this.isFavorite = isFavorite;
        this.multiplyWeightBy = multiplyWeightBy;
        this.negated = negated;
    }
    public ContentEngagementRelevanceModifier()
    {
        this.multiplyWeightBy = 1d;
        this.negated = false;
    }
    /** The sentiment that must match for <code>MultiplyWeightBy</code> to apply. */
    public @Nullable ContentEngagementDataSentimentKind getSentiment()
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
    public ContentEngagementRelevanceModifier setSentiment(@Nullable ContentEngagementDataSentimentKind sentiment)
    {
        this.sentiment = sentiment;
        return this;
    }
    /** The favorite flag that must match for <code>MultiplyWeightBy</code> to apply. */
    public ContentEngagementRelevanceModifier setIsFavorite(@Nullable Boolean isFavorite)
    {
        this.isFavorite = isFavorite;
        return this;
    }
    /** The multiplier applied when the modifier condition is satisfied (or when it is not satisfied if <code>Negated</code> is <code>true</code>). */
    public ContentEngagementRelevanceModifier setMultiplyWeightBy(Double multiplyWeightBy)
    {
        this.multiplyWeightBy = multiplyWeightBy;
        return this;
    }
    /** When set to <code>true</code>, the multiplier applies when the condition is not satisfied instead of when it matches. */
    public ContentEngagementRelevanceModifier setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    @Override
    public ContentEngagementRelevanceModifier setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
}

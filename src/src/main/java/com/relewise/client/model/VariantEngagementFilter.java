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
    
/** Filters variant results by previously tracked engagement signals such as sentiment or favorites. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = VariantEngagementFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class VariantEngagementFilter extends Filter implements IVariantFilter
{
    public String $type = "Relewise.Client.Requests.Filters.VariantEngagementFilter, Relewise.Client";
    /** Specifies the sentiment that must have been recorded for the variant. */
    public @Nullable ProductEngagementDataSentimentKind sentiment;
    /** Specifies whether the variant must be marked as a favorite by the user. */
    public @Nullable Boolean isFavorite;
    public static VariantEngagementFilter create(@Nullable ProductEngagementDataSentimentKind sentiment, @Nullable Boolean isFavorite)
    {
        return new VariantEngagementFilter(sentiment, isFavorite);
    }
    public VariantEngagementFilter(@Nullable ProductEngagementDataSentimentKind sentiment, @Nullable Boolean isFavorite)
    {
        this.sentiment = sentiment;
        this.isFavorite = isFavorite;
        this.negated = false;
    }
    /**
     * Initializes a new instance of the <code>VariantEngagementFilter</code> class.
     * @param sentiment Optional sentiment requirement. Pass
     * @param isFavorite Optional favorite requirement. Pass
     * @param negated Set to
     */
    public static VariantEngagementFilter create(@Nullable ProductEngagementDataSentimentKind sentiment, @Nullable Boolean isFavorite, Boolean negated)
    {
        return new VariantEngagementFilter(sentiment, isFavorite, negated);
    }
    /**
     * Initializes a new instance of the <code>VariantEngagementFilter</code> class.
     * @param sentiment Optional sentiment requirement. Pass
     * @param isFavorite Optional favorite requirement. Pass
     * @param negated Set to
     */
    public VariantEngagementFilter(@Nullable ProductEngagementDataSentimentKind sentiment, @Nullable Boolean isFavorite, Boolean negated)
    {
        this.sentiment = sentiment;
        this.isFavorite = isFavorite;
        this.negated = negated;
    }
    public VariantEngagementFilter()
    {
        this.negated = false;
    }
    /** Specifies the sentiment that must have been recorded for the variant. */
    public @Nullable ProductEngagementDataSentimentKind getSentiment()
    {
        return this.sentiment;
    }
    /** Specifies whether the variant must be marked as a favorite by the user. */
    public @Nullable Boolean getIsFavorite()
    {
        return this.isFavorite;
    }
    /** Specifies the sentiment that must have been recorded for the variant. */
    public VariantEngagementFilter setSentiment(@Nullable ProductEngagementDataSentimentKind sentiment)
    {
        this.sentiment = sentiment;
        return this;
    }
    /** Specifies whether the variant must be marked as a favorite by the user. */
    public VariantEngagementFilter setIsFavorite(@Nullable Boolean isFavorite)
    {
        this.isFavorite = isFavorite;
        return this;
    }
    @Override
    public VariantEngagementFilter setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    @Override
    public VariantEngagementFilter setSettings(@Nullable FilterSettings settings)
    {
        this.settings = settings;
        return this;
    }
}

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
    
/** Filters product results by previously tracked engagement signals such as sentiment or favorites. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = ProductEngagementFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductEngagementFilter extends Filter implements IProductFilter
{
    public String $type = "Relewise.Client.Requests.Filters.ProductEngagementFilter, Relewise.Client";
    /** Specifies the sentiment that must have been recorded for the product. */
    public @Nullable ProductEngagementDataSentimentKind sentiment;
    /** Specifies whether the product must be marked as a favorite by the user. */
    public @Nullable Boolean isFavorite;
    public static ProductEngagementFilter create(@Nullable ProductEngagementDataSentimentKind sentiment, @Nullable Boolean isFavorite)
    {
        return new ProductEngagementFilter(sentiment, isFavorite);
    }
    public ProductEngagementFilter(@Nullable ProductEngagementDataSentimentKind sentiment, @Nullable Boolean isFavorite)
    {
        this.sentiment = sentiment;
        this.isFavorite = isFavorite;
        this.negated = false;
    }
    /**
     * Initializes a new instance of the <code>ProductEngagementFilter</code> class.
     * @param sentiment Optional sentiment requirement. Pass
     * @param isFavorite Optional favorite requirement. Pass
     * @param negated Set to
     */
    public static ProductEngagementFilter create(@Nullable ProductEngagementDataSentimentKind sentiment, @Nullable Boolean isFavorite, Boolean negated)
    {
        return new ProductEngagementFilter(sentiment, isFavorite, negated);
    }
    /**
     * Initializes a new instance of the <code>ProductEngagementFilter</code> class.
     * @param sentiment Optional sentiment requirement. Pass
     * @param isFavorite Optional favorite requirement. Pass
     * @param negated Set to
     */
    public ProductEngagementFilter(@Nullable ProductEngagementDataSentimentKind sentiment, @Nullable Boolean isFavorite, Boolean negated)
    {
        this.sentiment = sentiment;
        this.isFavorite = isFavorite;
        this.negated = negated;
    }
    public ProductEngagementFilter()
    {
        this.negated = false;
    }
    /** Specifies the sentiment that must have been recorded for the product. */
    public @Nullable ProductEngagementDataSentimentKind getSentiment()
    {
        return this.sentiment;
    }
    /** Specifies whether the product must be marked as a favorite by the user. */
    public @Nullable Boolean getIsFavorite()
    {
        return this.isFavorite;
    }
    /** Specifies the sentiment that must have been recorded for the product. */
    public ProductEngagementFilter setSentiment(@Nullable ProductEngagementDataSentimentKind sentiment)
    {
        this.sentiment = sentiment;
        return this;
    }
    /** Specifies whether the product must be marked as a favorite by the user. */
    public ProductEngagementFilter setIsFavorite(@Nullable Boolean isFavorite)
    {
        this.isFavorite = isFavorite;
        return this;
    }
    @Override
    public ProductEngagementFilter setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    @Override
    public ProductEngagementFilter setSettings(@Nullable FilterSettings settings)
    {
        this.settings = settings;
        return this;
    }
}

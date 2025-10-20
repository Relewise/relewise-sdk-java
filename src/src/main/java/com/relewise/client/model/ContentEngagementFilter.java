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
    
/** Filters content results by previously tracked engagement signals such as sentiment or favorites. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = ContentEngagementFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentEngagementFilter extends Filter implements IContentFilter
{
    public String $type = "Relewise.Client.Requests.Filters.ContentEngagementFilter, Relewise.Client";
    /** Specifies the sentiment that must have been recorded for the content. */
    public @Nullable ContentEngagementDataSentimentKind sentiment;
    /** Specifies whether the content must be marked as a favorite by the user. */
    public @Nullable Boolean isFavorite;
    public static ContentEngagementFilter create(@Nullable ContentEngagementDataSentimentKind sentiment, @Nullable Boolean isFavorite)
    {
        return new ContentEngagementFilter(sentiment, isFavorite);
    }
    public ContentEngagementFilter(@Nullable ContentEngagementDataSentimentKind sentiment, @Nullable Boolean isFavorite)
    {
        this.sentiment = sentiment;
        this.isFavorite = isFavorite;
        this.negated = false;
    }
    /**
     * Initializes a new instance of the <code>ContentEngagementFilter</code> class.
     * @param sentiment Optional sentiment requirement. Pass
     * @param isFavorite Optional favorite requirement. Pass
     * @param negated Set to
     */
    public static ContentEngagementFilter create(@Nullable ContentEngagementDataSentimentKind sentiment, @Nullable Boolean isFavorite, Boolean negated)
    {
        return new ContentEngagementFilter(sentiment, isFavorite, negated);
    }
    /**
     * Initializes a new instance of the <code>ContentEngagementFilter</code> class.
     * @param sentiment Optional sentiment requirement. Pass
     * @param isFavorite Optional favorite requirement. Pass
     * @param negated Set to
     */
    public ContentEngagementFilter(@Nullable ContentEngagementDataSentimentKind sentiment, @Nullable Boolean isFavorite, Boolean negated)
    {
        this.sentiment = sentiment;
        this.isFavorite = isFavorite;
        this.negated = negated;
    }
    public ContentEngagementFilter()
    {
        this.negated = false;
    }
    /** Specifies the sentiment that must have been recorded for the content. */
    public @Nullable ContentEngagementDataSentimentKind getSentiment()
    {
        return this.sentiment;
    }
    /** Specifies whether the content must be marked as a favorite by the user. */
    public @Nullable Boolean getIsFavorite()
    {
        return this.isFavorite;
    }
    /** Specifies the sentiment that must have been recorded for the content. */
    public ContentEngagementFilter setSentiment(@Nullable ContentEngagementDataSentimentKind sentiment)
    {
        this.sentiment = sentiment;
        return this;
    }
    /** Specifies whether the content must be marked as a favorite by the user. */
    public ContentEngagementFilter setIsFavorite(@Nullable Boolean isFavorite)
    {
        this.isFavorite = isFavorite;
        return this;
    }
    @Override
    public ContentEngagementFilter setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    @Override
    public ContentEngagementFilter setSettings(@Nullable FilterSettings settings)
    {
        this.settings = settings;
        return this;
    }
}

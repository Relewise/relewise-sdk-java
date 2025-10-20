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
    
/** Represents engagement signals (sentiment / favorite) for a <code>Product</code>. At least one of <code>Sentiment</code> or <code>IsFavorite</code> must be provided. */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductEngagementData
{
    /** Gets or sets the sentiment expressed towards the product. Null when no explicit sentiment was recorded. */
    public @Nullable ProductEngagementDataSentimentKind sentiment;
    /** Gets or sets whether the product is marked as a favorite by the user. Null when unknown or not recorded. */
    public @Nullable Boolean isFavorite;
    public static ProductEngagementData create()
    {
        return new ProductEngagementData();
    }
    public ProductEngagementData()
    {
        this.sentiment = null;
        this.isFavorite = null;
    }
    public static ProductEngagementData create(@Nullable ProductEngagementDataSentimentKind sentiment, @Nullable Boolean isFavorite)
    {
        return new ProductEngagementData(sentiment, isFavorite);
    }
    public ProductEngagementData(@Nullable ProductEngagementDataSentimentKind sentiment, @Nullable Boolean isFavorite)
    {
        this.sentiment = sentiment;
        this.isFavorite = isFavorite;
    }
    /** Gets or sets the sentiment expressed towards the product. Null when no explicit sentiment was recorded. */
    public @Nullable ProductEngagementDataSentimentKind getSentiment()
    {
        return this.sentiment;
    }
    /** Gets or sets whether the product is marked as a favorite by the user. Null when unknown or not recorded. */
    public @Nullable Boolean getIsFavorite()
    {
        return this.isFavorite;
    }
    /** Gets or sets the sentiment expressed towards the product. Null when no explicit sentiment was recorded. */
    public ProductEngagementData setSentiment(@Nullable ProductEngagementDataSentimentKind sentiment)
    {
        this.sentiment = sentiment;
        return this;
    }
    /** Gets or sets whether the product is marked as a favorite by the user. Null when unknown or not recorded. */
    public ProductEngagementData setIsFavorite(@Nullable Boolean isFavorite)
    {
        this.isFavorite = isFavorite;
        return this;
    }
}

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
    
/** Engagement payload describing the sentiment/favorite signals towards the content. */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentEngagementData
{
    public @Nullable ContentEngagementDataSentimentKind sentiment;
    public @Nullable Boolean isFavorite;
    public static ContentEngagementData create()
    {
        return new ContentEngagementData();
    }
    public ContentEngagementData()
    {
        this.sentiment = null;
        this.isFavorite = null;
    }
    public static ContentEngagementData create(@Nullable ContentEngagementDataSentimentKind sentiment, @Nullable Boolean isFavorite)
    {
        return new ContentEngagementData(sentiment, isFavorite);
    }
    public ContentEngagementData(@Nullable ContentEngagementDataSentimentKind sentiment, @Nullable Boolean isFavorite)
    {
        this.sentiment = sentiment;
        this.isFavorite = isFavorite;
    }
    public @Nullable ContentEngagementDataSentimentKind getSentiment()
    {
        return this.sentiment;
    }
    public @Nullable Boolean getIsFavorite()
    {
        return this.isFavorite;
    }
    public ContentEngagementData setSentiment(@Nullable ContentEngagementDataSentimentKind sentiment)
    {
        this.sentiment = sentiment;
        return this;
    }
    public ContentEngagementData setIsFavorite(@Nullable Boolean isFavorite)
    {
        this.isFavorite = isFavorite;
        return this;
    }
}

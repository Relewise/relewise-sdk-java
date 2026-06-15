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
    
/** Produces most popular content for the configured time window. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = ContentByPopularityFeedSource.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentByPopularityFeedSource extends FeedSource implements IContentFeedSource
{
    public String $type = "Relewise.Client.DataTypes.Feed.Sources.ContentByPopularityFeedSource, Relewise.Client";
    /** The time window in minutes used when reading the popularity source. */
    public Integer popularityWindowMinutes;
    /** Controls how much local randomization is applied after ranking by popularity.  Randomization makes every impression of the feed unique by slightly changing the order of items which rank close to each other. */
    public Integer randomizationWindow;
    public static ContentByPopularityFeedSource create(FeedSourceSelectionPolicy selectionPolicy, Integer popularityWindowMinutes, Integer randomizationWindow)
    {
        return new ContentByPopularityFeedSource(selectionPolicy, popularityWindowMinutes, randomizationWindow);
    }
    public ContentByPopularityFeedSource(FeedSourceSelectionPolicy selectionPolicy, Integer popularityWindowMinutes, Integer randomizationWindow)
    {
        this.selectionPolicy = selectionPolicy;
        this.popularityWindowMinutes = popularityWindowMinutes;
        this.randomizationWindow = randomizationWindow;
    }
    public ContentByPopularityFeedSource()
    {
    }
    /** The time window in minutes used when reading the popularity source. */
    public Integer getPopularityWindowMinutes()
    {
        return this.popularityWindowMinutes;
    }
    /** Controls how much local randomization is applied after ranking by popularity.  Randomization makes every impression of the feed unique by slightly changing the order of items which rank close to each other. */
    public Integer getRandomizationWindow()
    {
        return this.randomizationWindow;
    }
    /** The time window in minutes used when reading the popularity source. */
    public ContentByPopularityFeedSource setPopularityWindowMinutes(Integer popularityWindowMinutes)
    {
        this.popularityWindowMinutes = popularityWindowMinutes;
        return this;
    }
    /** Controls how much local randomization is applied after ranking by popularity.  Randomization makes every impression of the feed unique by slightly changing the order of items which rank close to each other. */
    public ContentByPopularityFeedSource setRandomizationWindow(Integer randomizationWindow)
    {
        this.randomizationWindow = randomizationWindow;
        return this;
    }
    @Override
    public ContentByPopularityFeedSource setEnabled(Boolean enabled)
    {
        this.enabled = enabled;
        return this;
    }
    @Override
    public ContentByPopularityFeedSource setSelectionPolicy(FeedSourceSelectionPolicy selectionPolicy)
    {
        this.selectionPolicy = selectionPolicy;
        return this;
    }
    @Override
    public ContentByPopularityFeedSource setMaxResults(@Nullable Integer maxResults)
    {
        this.maxResults = maxResults;
        return this;
    }
    @Override
    public ContentByPopularityFeedSource setMaxResultsPerChanceGiven(@Nullable Integer maxResultsPerChanceGiven)
    {
        this.maxResultsPerChanceGiven = maxResultsPerChanceGiven;
        return this;
    }
}

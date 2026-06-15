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
    
/** Produces content that is commonly viewed after the content configured by <code>ContentIds</code>.  Use this feed source to show related content items in feeds on content pages. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = ContentsViewedAfterContentSeedFeedSource.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentsViewedAfterContentSeedFeedSource extends EntityBySeedFeedSource implements IContentFeedSource
{
    public String $type = "Relewise.Client.DataTypes.Feed.Sources.ContentsViewedAfterContentSeedFeedSource, Relewise.Client";
    public static ContentsViewedAfterContentSeedFeedSource create(FeedSourceSelectionPolicy selectionPolicy, Integer maxSeedItems, Integer randomizationWindow)
    {
        return new ContentsViewedAfterContentSeedFeedSource(selectionPolicy, maxSeedItems, randomizationWindow);
    }
    public ContentsViewedAfterContentSeedFeedSource(FeedSourceSelectionPolicy selectionPolicy, Integer maxSeedItems, Integer randomizationWindow)
    {
        this.selectionPolicy = selectionPolicy;
        this.maxSeedItems = maxSeedItems;
        this.randomizationWindow = randomizationWindow;
    }
    public ContentsViewedAfterContentSeedFeedSource()
    {
    }
    @Override
    public ContentsViewedAfterContentSeedFeedSource setMaxSeedItems(Integer maxSeedItems)
    {
        this.maxSeedItems = maxSeedItems;
        return this;
    }
    @Override
    public ContentsViewedAfterContentSeedFeedSource setRandomizationWindow(Integer randomizationWindow)
    {
        this.randomizationWindow = randomizationWindow;
        return this;
    }
    @Override
    public ContentsViewedAfterContentSeedFeedSource setEnabled(Boolean enabled)
    {
        this.enabled = enabled;
        return this;
    }
    @Override
    public ContentsViewedAfterContentSeedFeedSource setSelectionPolicy(FeedSourceSelectionPolicy selectionPolicy)
    {
        this.selectionPolicy = selectionPolicy;
        return this;
    }
    @Override
    public ContentsViewedAfterContentSeedFeedSource setMaxResults(@Nullable Integer maxResults)
    {
        this.maxResults = maxResults;
        return this;
    }
    @Override
    public ContentsViewedAfterContentSeedFeedSource setMaxResultsPerChanceGiven(@Nullable Integer maxResultsPerChanceGiven)
    {
        this.maxResultsPerChanceGiven = maxResultsPerChanceGiven;
        return this;
    }
}

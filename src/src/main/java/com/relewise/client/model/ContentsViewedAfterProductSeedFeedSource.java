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
    
/** Produces content that is commonly viewed after the products configured by <code>ProductAndVariantIds</code>.  Use this feed source to show related content items in feeds on product pages, cart pages or power steps. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = ContentsViewedAfterProductSeedFeedSource.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentsViewedAfterProductSeedFeedSource extends EntityBySeedFeedSource implements IContentFeedSource
{
    public String $type = "Relewise.Client.DataTypes.Feed.Sources.ContentsViewedAfterProductSeedFeedSource, Relewise.Client";
    public static ContentsViewedAfterProductSeedFeedSource create(FeedSourceSelectionPolicy selectionPolicy, Integer maxSeedItems, Integer randomizationWindow)
    {
        return new ContentsViewedAfterProductSeedFeedSource(selectionPolicy, maxSeedItems, randomizationWindow);
    }
    public ContentsViewedAfterProductSeedFeedSource(FeedSourceSelectionPolicy selectionPolicy, Integer maxSeedItems, Integer randomizationWindow)
    {
        this.selectionPolicy = selectionPolicy;
        this.maxSeedItems = maxSeedItems;
        this.randomizationWindow = randomizationWindow;
    }
    public ContentsViewedAfterProductSeedFeedSource()
    {
    }
    @Override
    public ContentsViewedAfterProductSeedFeedSource setMaxSeedItems(Integer maxSeedItems)
    {
        this.maxSeedItems = maxSeedItems;
        return this;
    }
    @Override
    public ContentsViewedAfterProductSeedFeedSource setRandomizationWindow(Integer randomizationWindow)
    {
        this.randomizationWindow = randomizationWindow;
        return this;
    }
    @Override
    public ContentsViewedAfterProductSeedFeedSource setEnabled(Boolean enabled)
    {
        this.enabled = enabled;
        return this;
    }
    @Override
    public ContentsViewedAfterProductSeedFeedSource setSelectionPolicy(FeedSourceSelectionPolicy selectionPolicy)
    {
        this.selectionPolicy = selectionPolicy;
        return this;
    }
    @Override
    public ContentsViewedAfterProductSeedFeedSource setMaxResults(@Nullable Integer maxResults)
    {
        this.maxResults = maxResults;
        return this;
    }
    @Override
    public ContentsViewedAfterProductSeedFeedSource setMaxResultsPerChanceGiven(@Nullable Integer maxResultsPerChanceGiven)
    {
        this.maxResultsPerChanceGiven = maxResultsPerChanceGiven;
        return this;
    }
}

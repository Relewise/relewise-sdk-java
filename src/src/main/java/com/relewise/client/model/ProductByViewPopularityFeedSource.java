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
    
/** Produces a feed of most viewed products for the configured time window. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = ProductByViewPopularityFeedSource.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductByViewPopularityFeedSource extends ProductByPopularityFeedSource implements IProductFeedSource
{
    public String $type = "Relewise.Client.DataTypes.Feed.Sources.ProductByViewPopularityFeedSource, Relewise.Client";
    public static ProductByViewPopularityFeedSource create(FeedSourceSelectionPolicy selectionPolicy, Integer popularityWindowMinutes, Integer randomizationWindow)
    {
        return new ProductByViewPopularityFeedSource(selectionPolicy, popularityWindowMinutes, randomizationWindow);
    }
    public ProductByViewPopularityFeedSource(FeedSourceSelectionPolicy selectionPolicy, Integer popularityWindowMinutes, Integer randomizationWindow)
    {
        this.selectionPolicy = selectionPolicy;
        this.popularityWindowMinutes = popularityWindowMinutes;
        this.randomizationWindow = randomizationWindow;
    }
    public ProductByViewPopularityFeedSource()
    {
    }
    @Override
    public ProductByViewPopularityFeedSource setPopularityWindowMinutes(Integer popularityWindowMinutes)
    {
        this.popularityWindowMinutes = popularityWindowMinutes;
        return this;
    }
    @Override
    public ProductByViewPopularityFeedSource setRandomizationWindow(Integer randomizationWindow)
    {
        this.randomizationWindow = randomizationWindow;
        return this;
    }
    @Override
    public ProductByViewPopularityFeedSource setEnabled(Boolean enabled)
    {
        this.enabled = enabled;
        return this;
    }
    @Override
    public ProductByViewPopularityFeedSource setSelectionPolicy(FeedSourceSelectionPolicy selectionPolicy)
    {
        this.selectionPolicy = selectionPolicy;
        return this;
    }
    @Override
    public ProductByViewPopularityFeedSource setMaxResults(@Nullable Integer maxResults)
    {
        this.maxResults = maxResults;
        return this;
    }
    @Override
    public ProductByViewPopularityFeedSource setMaxResultsPerChanceGiven(@Nullable Integer maxResultsPerChanceGiven)
    {
        this.maxResultsPerChanceGiven = maxResultsPerChanceGiven;
        return this;
    }
}

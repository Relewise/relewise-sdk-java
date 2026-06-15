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
    
/** Shows products referenced by content items that were recently shown in the feed, when combined with a feed source that shows content.  Use this feed source to inject related products into a feed of content items such as short promotional videos. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = ProductByProductIdFromContentDataFeedSource.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductByProductIdFromContentDataFeedSource extends FeedSource implements IProductFeedSource
{
    public String $type = "Relewise.Client.DataTypes.Feed.Sources.ProductByProductIdFromContentDataFeedSource, Relewise.Client";
    /** The content data key that contains product ids. */
    public String contentDataKey;
    /** Defines proximity between a previously shown content and a newly produced product items in the feed.  Lower value will place product items in closer proximity to the content items that reference them. */
    public Integer maxLookBehindDistance;
    /** Defines how many content items to consider and produce product items from, before moving to the next feed source.  Lower value focuses on fewer and more recent content items to retrieve products from. See also <code>MaxResultsPerChanceGiven</code> as a way to define how many products to show each time. */
    public Integer maxLookBehindCount;
    /** Controls how much randomization is applied to the output. */
    public Integer randomizationWindow;
    public static ProductByProductIdFromContentDataFeedSource create(FeedSourceSelectionPolicy selectionPolicy, String contentDataKey, Integer maxLookBehindDistance, Integer maxLookBehindCount, Integer randomizationWindow)
    {
        return new ProductByProductIdFromContentDataFeedSource(selectionPolicy, contentDataKey, maxLookBehindDistance, maxLookBehindCount, randomizationWindow);
    }
    public ProductByProductIdFromContentDataFeedSource(FeedSourceSelectionPolicy selectionPolicy, String contentDataKey, Integer maxLookBehindDistance, Integer maxLookBehindCount, Integer randomizationWindow)
    {
        this.selectionPolicy = selectionPolicy;
        this.contentDataKey = contentDataKey;
        this.maxLookBehindDistance = maxLookBehindDistance;
        this.maxLookBehindCount = maxLookBehindCount;
        this.randomizationWindow = randomizationWindow;
    }
    public ProductByProductIdFromContentDataFeedSource()
    {
    }
    /** The content data key that contains product ids. */
    public String getContentDataKey()
    {
        return this.contentDataKey;
    }
    /** Defines proximity between a previously shown content and a newly produced product items in the feed.  Lower value will place product items in closer proximity to the content items that reference them. */
    public Integer getMaxLookBehindDistance()
    {
        return this.maxLookBehindDistance;
    }
    /** Defines how many content items to consider and produce product items from, before moving to the next feed source.  Lower value focuses on fewer and more recent content items to retrieve products from. See also <code>MaxResultsPerChanceGiven</code> as a way to define how many products to show each time. */
    public Integer getMaxLookBehindCount()
    {
        return this.maxLookBehindCount;
    }
    /** Controls how much randomization is applied to the output. */
    public Integer getRandomizationWindow()
    {
        return this.randomizationWindow;
    }
    /** The content data key that contains product ids. */
    public ProductByProductIdFromContentDataFeedSource setContentDataKey(String contentDataKey)
    {
        this.contentDataKey = contentDataKey;
        return this;
    }
    /** Defines proximity between a previously shown content and a newly produced product items in the feed.  Lower value will place product items in closer proximity to the content items that reference them. */
    public ProductByProductIdFromContentDataFeedSource setMaxLookBehindDistance(Integer maxLookBehindDistance)
    {
        this.maxLookBehindDistance = maxLookBehindDistance;
        return this;
    }
    /** Defines how many content items to consider and produce product items from, before moving to the next feed source.  Lower value focuses on fewer and more recent content items to retrieve products from. See also <code>MaxResultsPerChanceGiven</code> as a way to define how many products to show each time. */
    public ProductByProductIdFromContentDataFeedSource setMaxLookBehindCount(Integer maxLookBehindCount)
    {
        this.maxLookBehindCount = maxLookBehindCount;
        return this;
    }
    /** Controls how much randomization is applied to the output. */
    public ProductByProductIdFromContentDataFeedSource setRandomizationWindow(Integer randomizationWindow)
    {
        this.randomizationWindow = randomizationWindow;
        return this;
    }
    @Override
    public ProductByProductIdFromContentDataFeedSource setEnabled(Boolean enabled)
    {
        this.enabled = enabled;
        return this;
    }
    @Override
    public ProductByProductIdFromContentDataFeedSource setSelectionPolicy(FeedSourceSelectionPolicy selectionPolicy)
    {
        this.selectionPolicy = selectionPolicy;
        return this;
    }
    @Override
    public ProductByProductIdFromContentDataFeedSource setMaxResults(@Nullable Integer maxResults)
    {
        this.maxResults = maxResults;
        return this;
    }
    @Override
    public ProductByProductIdFromContentDataFeedSource setMaxResultsPerChanceGiven(@Nullable Integer maxResultsPerChanceGiven)
    {
        this.maxResultsPerChanceGiven = maxResultsPerChanceGiven;
        return this;
    }
}

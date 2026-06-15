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
    
/** Produces content by scoring product popularity for products referenced by product ids on the content items.  Use this feed source to create a dynamic personalized feed that shows content related to popular products and products with which the user has recently interacted. To use this content source, content items must contain ids of the related products (for example, products featured in a video) in data key referenced by <code>ContentDataKey</code>. The output will be ranked by popularity of the referenced products, combined with the user's recent interaction with the products in the feed. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = ContentByProductPopularityOfProductIdFromContentDataFeedSource.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentByProductPopularityOfProductIdFromContentDataFeedSource extends FeedSource implements IContentFeedSource
{
    public String $type = "Relewise.Client.DataTypes.Feed.Sources.ContentByProductPopularityOfProductIdFromContentDataFeedSource, Relewise.Client";
    /** The content data key that contains related product ids. */
    public String contentDataKey;
    /** The popularity window in minutes used for the referenced product ids. */
    public Integer productPopularityWindowMinutes;
    /** The popularity dimension used when scoring referenced product ids, such as most viewed vs. most purchased. */
    public PopularityTypes productPopularityDimension;
    /** Aggregation strategy used when combining popularity scores. */
    public ProductPopularityScoreAggregation aggregation;
    /** Defines how many most-popular content items are considered for the feed. */
    public Integer contentPopularityThreshold;
    /** Defines how many product ids are read from each content item. */
    public Integer maxProductIdsPerContent;
    /** Controls how much local randomization is applied after ranking by referenced product popularity. */
    public Integer randomizationWindow;
    public static ContentByProductPopularityOfProductIdFromContentDataFeedSource create(FeedSourceSelectionPolicy selectionPolicy, String contentDataKey, Integer productPopularityWindowMinutes, PopularityTypes productPopularityDimension, ProductPopularityScoreAggregation aggregation, Integer contentPopularityThreshold, Integer maxProductIdsPerContent, Integer randomizationWindow)
    {
        return new ContentByProductPopularityOfProductIdFromContentDataFeedSource(selectionPolicy, contentDataKey, productPopularityWindowMinutes, productPopularityDimension, aggregation, contentPopularityThreshold, maxProductIdsPerContent, randomizationWindow);
    }
    public ContentByProductPopularityOfProductIdFromContentDataFeedSource(FeedSourceSelectionPolicy selectionPolicy, String contentDataKey, Integer productPopularityWindowMinutes, PopularityTypes productPopularityDimension, ProductPopularityScoreAggregation aggregation, Integer contentPopularityThreshold, Integer maxProductIdsPerContent, Integer randomizationWindow)
    {
        this.selectionPolicy = selectionPolicy;
        this.contentDataKey = contentDataKey;
        this.productPopularityWindowMinutes = productPopularityWindowMinutes;
        this.productPopularityDimension = productPopularityDimension;
        this.aggregation = aggregation;
        this.contentPopularityThreshold = contentPopularityThreshold;
        this.maxProductIdsPerContent = maxProductIdsPerContent;
        this.randomizationWindow = randomizationWindow;
    }
    public ContentByProductPopularityOfProductIdFromContentDataFeedSource()
    {
    }
    /** The content data key that contains related product ids. */
    public String getContentDataKey()
    {
        return this.contentDataKey;
    }
    /** The popularity window in minutes used for the referenced product ids. */
    public Integer getProductPopularityWindowMinutes()
    {
        return this.productPopularityWindowMinutes;
    }
    /** The popularity dimension used when scoring referenced product ids, such as most viewed vs. most purchased. */
    public PopularityTypes getProductPopularityDimension()
    {
        return this.productPopularityDimension;
    }
    /** Aggregation strategy used when combining popularity scores. */
    public ProductPopularityScoreAggregation getAggregation()
    {
        return this.aggregation;
    }
    /** Defines how many most-popular content items are considered for the feed. */
    public Integer getContentPopularityThreshold()
    {
        return this.contentPopularityThreshold;
    }
    /** Defines how many product ids are read from each content item. */
    public Integer getMaxProductIdsPerContent()
    {
        return this.maxProductIdsPerContent;
    }
    /** Controls how much local randomization is applied after ranking by referenced product popularity. */
    public Integer getRandomizationWindow()
    {
        return this.randomizationWindow;
    }
    /** The content data key that contains related product ids. */
    public ContentByProductPopularityOfProductIdFromContentDataFeedSource setContentDataKey(String contentDataKey)
    {
        this.contentDataKey = contentDataKey;
        return this;
    }
    /** The popularity window in minutes used for the referenced product ids. */
    public ContentByProductPopularityOfProductIdFromContentDataFeedSource setProductPopularityWindowMinutes(Integer productPopularityWindowMinutes)
    {
        this.productPopularityWindowMinutes = productPopularityWindowMinutes;
        return this;
    }
    /** The popularity dimension used when scoring referenced product ids, such as most viewed vs. most purchased. */
    public ContentByProductPopularityOfProductIdFromContentDataFeedSource setProductPopularityDimension(PopularityTypes productPopularityDimension)
    {
        this.productPopularityDimension = productPopularityDimension;
        return this;
    }
    /** Aggregation strategy used when combining popularity scores. */
    public ContentByProductPopularityOfProductIdFromContentDataFeedSource setAggregation(ProductPopularityScoreAggregation aggregation)
    {
        this.aggregation = aggregation;
        return this;
    }
    /** Defines how many most-popular content items are considered for the feed. */
    public ContentByProductPopularityOfProductIdFromContentDataFeedSource setContentPopularityThreshold(Integer contentPopularityThreshold)
    {
        this.contentPopularityThreshold = contentPopularityThreshold;
        return this;
    }
    /** Defines how many product ids are read from each content item. */
    public ContentByProductPopularityOfProductIdFromContentDataFeedSource setMaxProductIdsPerContent(Integer maxProductIdsPerContent)
    {
        this.maxProductIdsPerContent = maxProductIdsPerContent;
        return this;
    }
    /** Controls how much local randomization is applied after ranking by referenced product popularity. */
    public ContentByProductPopularityOfProductIdFromContentDataFeedSource setRandomizationWindow(Integer randomizationWindow)
    {
        this.randomizationWindow = randomizationWindow;
        return this;
    }
    @Override
    public ContentByProductPopularityOfProductIdFromContentDataFeedSource setEnabled(Boolean enabled)
    {
        this.enabled = enabled;
        return this;
    }
    @Override
    public ContentByProductPopularityOfProductIdFromContentDataFeedSource setSelectionPolicy(FeedSourceSelectionPolicy selectionPolicy)
    {
        this.selectionPolicy = selectionPolicy;
        return this;
    }
    @Override
    public ContentByProductPopularityOfProductIdFromContentDataFeedSource setMaxResults(@Nullable Integer maxResults)
    {
        this.maxResults = maxResults;
        return this;
    }
    @Override
    public ContentByProductPopularityOfProductIdFromContentDataFeedSource setMaxResultsPerChanceGiven(@Nullable Integer maxResultsPerChanceGiven)
    {
        this.maxResultsPerChanceGiven = maxResultsPerChanceGiven;
        return this;
    }
}

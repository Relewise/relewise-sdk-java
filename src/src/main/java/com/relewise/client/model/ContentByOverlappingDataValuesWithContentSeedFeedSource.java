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
    
/** Produces content by scoring overlap between seeded content data values and candidate content data values.  Use this feed source to show content with similar attributes, such as color or tags, as the seed, for example, on a content page. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = ContentByOverlappingDataValuesWithContentSeedFeedSource.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentByOverlappingDataValuesWithContentSeedFeedSource extends EntityBySeedFeedSource implements IContentFeedSource
{
    public String $type = "Relewise.Client.DataTypes.Feed.Sources.ContentByOverlappingDataValuesWithContentSeedFeedSource, Relewise.Client";
    /** The content data keys whose values should be compared between the feed seed and each candidate. */
    public FeedEntityDataKey[] contentDataKeys;
    /** Limits how deep into the popularity-ordered content collection the producer scans before building its queue. */
    public Integer contentPopularityThreshold;
    public static ContentByOverlappingDataValuesWithContentSeedFeedSource create(FeedSourceSelectionPolicy selectionPolicy, Integer maxSeedItems, FeedEntityDataKey[] contentDataKeys, Integer contentPopularityThreshold, Integer randomizationWindow)
    {
        return new ContentByOverlappingDataValuesWithContentSeedFeedSource(selectionPolicy, maxSeedItems, contentDataKeys, contentPopularityThreshold, randomizationWindow);
    }
    public ContentByOverlappingDataValuesWithContentSeedFeedSource(FeedSourceSelectionPolicy selectionPolicy, Integer maxSeedItems, FeedEntityDataKey[] contentDataKeys, Integer contentPopularityThreshold, Integer randomizationWindow)
    {
        this.selectionPolicy = selectionPolicy;
        this.maxSeedItems = maxSeedItems;
        this.contentDataKeys = contentDataKeys;
        this.contentPopularityThreshold = contentPopularityThreshold;
        this.randomizationWindow = randomizationWindow;
    }
    public ContentByOverlappingDataValuesWithContentSeedFeedSource()
    {
    }
    /** The content data keys whose values should be compared between the feed seed and each candidate. */
    public FeedEntityDataKey[] getContentDataKeys()
    {
        return this.contentDataKeys;
    }
    /** Limits how deep into the popularity-ordered content collection the producer scans before building its queue. */
    public Integer getContentPopularityThreshold()
    {
        return this.contentPopularityThreshold;
    }
    /** The content data keys whose values should be compared between the feed seed and each candidate. */
    public ContentByOverlappingDataValuesWithContentSeedFeedSource setContentDataKeys(FeedEntityDataKey... contentDataKeys)
    {
        this.contentDataKeys = contentDataKeys;
        return this;
    }
    /** The content data keys whose values should be compared between the feed seed and each candidate. */
    public ContentByOverlappingDataValuesWithContentSeedFeedSource addToContentDataKeys(FeedEntityDataKey contentDataKey)
    {
        if (this.contentDataKeys == null)
        {
            this.contentDataKeys = new FeedEntityDataKey[] { contentDataKey };
        }
        else
        {
            ArrayList<FeedEntityDataKey> existingList = new ArrayList<>(Arrays.asList(this.contentDataKeys));
            existingList.add(contentDataKey);
            this.contentDataKeys = existingList.toArray(new FeedEntityDataKey[0]);
        }
        return this;
    }
    /** Limits how deep into the popularity-ordered content collection the producer scans before building its queue. */
    public ContentByOverlappingDataValuesWithContentSeedFeedSource setContentPopularityThreshold(Integer contentPopularityThreshold)
    {
        this.contentPopularityThreshold = contentPopularityThreshold;
        return this;
    }
    @Override
    public ContentByOverlappingDataValuesWithContentSeedFeedSource setMaxSeedItems(Integer maxSeedItems)
    {
        this.maxSeedItems = maxSeedItems;
        return this;
    }
    @Override
    public ContentByOverlappingDataValuesWithContentSeedFeedSource setRandomizationWindow(Integer randomizationWindow)
    {
        this.randomizationWindow = randomizationWindow;
        return this;
    }
    @Override
    public ContentByOverlappingDataValuesWithContentSeedFeedSource setEnabled(Boolean enabled)
    {
        this.enabled = enabled;
        return this;
    }
    @Override
    public ContentByOverlappingDataValuesWithContentSeedFeedSource setSelectionPolicy(FeedSourceSelectionPolicy selectionPolicy)
    {
        this.selectionPolicy = selectionPolicy;
        return this;
    }
    @Override
    public ContentByOverlappingDataValuesWithContentSeedFeedSource setMaxResults(@Nullable Integer maxResults)
    {
        this.maxResults = maxResults;
        return this;
    }
    @Override
    public ContentByOverlappingDataValuesWithContentSeedFeedSource setMaxResultsPerChanceGiven(@Nullable Integer maxResultsPerChanceGiven)
    {
        this.maxResultsPerChanceGiven = maxResultsPerChanceGiven;
        return this;
    }
}

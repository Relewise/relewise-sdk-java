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
    
/** Base class for feed sources that use input from <code>Seed</code>. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type")
@JsonSubTypes({
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class EntityBySeedFeedSource extends FeedSource
{
    public String $type = "";
    /** Limits how many seed items are considered when building the result queue. */
    public Integer maxSeedItems;
    /** Controls how much local randomization is applied to the result queue. */
    public Integer randomizationWindow;
    /** Limits how many seed items are considered when building the result queue. */
    public Integer getMaxSeedItems()
    {
        return this.maxSeedItems;
    }
    /** Controls how much local randomization is applied to the result queue. */
    public Integer getRandomizationWindow()
    {
        return this.randomizationWindow;
    }
    /** Limits how many seed items are considered when building the result queue. */
    public EntityBySeedFeedSource setMaxSeedItems(Integer maxSeedItems)
    {
        this.maxSeedItems = maxSeedItems;
        return this;
    }
    /** Controls how much local randomization is applied to the result queue. */
    public EntityBySeedFeedSource setRandomizationWindow(Integer randomizationWindow)
    {
        this.randomizationWindow = randomizationWindow;
        return this;
    }
    @Override
    public EntityBySeedFeedSource setEnabled(Boolean enabled)
    {
        this.enabled = enabled;
        return this;
    }
    @Override
    public EntityBySeedFeedSource setSelectionPolicy(FeedSourceSelectionPolicy selectionPolicy)
    {
        this.selectionPolicy = selectionPolicy;
        return this;
    }
    @Override
    public EntityBySeedFeedSource setMaxResults(@Nullable Integer maxResults)
    {
        this.maxResults = maxResults;
        return this;
    }
    @Override
    public EntityBySeedFeedSource setMaxResultsPerChanceGiven(@Nullable Integer maxResultsPerChanceGiven)
    {
        this.maxResultsPerChanceGiven = maxResultsPerChanceGiven;
        return this;
    }
}

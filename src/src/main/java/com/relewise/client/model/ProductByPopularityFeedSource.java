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
    
/** Base settings for product popularity feed sources. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type")
@JsonSubTypes({
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class ProductByPopularityFeedSource extends FeedSource
{
    public String $type = "";
    /** The time window in minutes used to calculate the popularity score. */
    public Integer popularityWindowMinutes;
    /** Controls how much local randomization is applied after ranking by popularity. */
    public Integer randomizationWindow;
    /** The time window in minutes used to calculate the popularity score. */
    public Integer getPopularityWindowMinutes()
    {
        return this.popularityWindowMinutes;
    }
    /** Controls how much local randomization is applied after ranking by popularity. */
    public Integer getRandomizationWindow()
    {
        return this.randomizationWindow;
    }
    /** The time window in minutes used to calculate the popularity score. */
    public ProductByPopularityFeedSource setPopularityWindowMinutes(Integer popularityWindowMinutes)
    {
        this.popularityWindowMinutes = popularityWindowMinutes;
        return this;
    }
    /** Controls how much local randomization is applied after ranking by popularity. */
    public ProductByPopularityFeedSource setRandomizationWindow(Integer randomizationWindow)
    {
        this.randomizationWindow = randomizationWindow;
        return this;
    }
    @Override
    public ProductByPopularityFeedSource setEnabled(Boolean enabled)
    {
        this.enabled = enabled;
        return this;
    }
    @Override
    public ProductByPopularityFeedSource setSelectionPolicy(FeedSourceSelectionPolicy selectionPolicy)
    {
        this.selectionPolicy = selectionPolicy;
        return this;
    }
    @Override
    public ProductByPopularityFeedSource setMaxResults(@Nullable Integer maxResults)
    {
        this.maxResults = maxResults;
        return this;
    }
    @Override
    public ProductByPopularityFeedSource setMaxResultsPerChanceGiven(@Nullable Integer maxResultsPerChanceGiven)
    {
        this.maxResultsPerChanceGiven = maxResultsPerChanceGiven;
        return this;
    }
}

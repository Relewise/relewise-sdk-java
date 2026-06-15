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
    
/** Base settings for a feed source, including enablement, selection policy, and per-source result limits. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type")
@JsonSubTypes({
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class FeedSource
{
    public String $type = "";
    /** Indicates whether this feed source is active. */
    public Boolean enabled;
    /** Determines how this feed source is prioritized and how ties are broken. */
    public FeedSourceSelectionPolicy selectionPolicy;
    /** Limits the total number of items this feed source may return. */
    public @Nullable Integer maxResults;
    /** Limits the number of items this feed source may return per chance given. */
    public @Nullable Integer maxResultsPerChanceGiven;
    /** Indicates whether this feed source is active. */
    public Boolean getEnabled()
    {
        return this.enabled;
    }
    /** Determines how this feed source is prioritized and how ties are broken. */
    public FeedSourceSelectionPolicy getSelectionPolicy()
    {
        return this.selectionPolicy;
    }
    /** Limits the total number of items this feed source may return. */
    public @Nullable Integer getMaxResults()
    {
        return this.maxResults;
    }
    /** Limits the number of items this feed source may return per chance given. */
    public @Nullable Integer getMaxResultsPerChanceGiven()
    {
        return this.maxResultsPerChanceGiven;
    }
    /** Indicates whether this feed source is active. */
    public FeedSource setEnabled(Boolean enabled)
    {
        this.enabled = enabled;
        return this;
    }
    /** Determines how this feed source is prioritized and how ties are broken. */
    public FeedSource setSelectionPolicy(FeedSourceSelectionPolicy selectionPolicy)
    {
        this.selectionPolicy = selectionPolicy;
        return this;
    }
    /** Limits the total number of items this feed source may return. */
    public FeedSource setMaxResults(@Nullable Integer maxResults)
    {
        this.maxResults = maxResults;
        return this;
    }
    /** Limits the number of items this feed source may return per chance given. */
    public FeedSource setMaxResultsPerChanceGiven(@Nullable Integer maxResultsPerChanceGiven)
    {
        this.maxResultsPerChanceGiven = maxResultsPerChanceGiven;
        return this;
    }
}

package com.relewise.client.model;

import com.fasterxml.jackson.annotation.*;
import javax.annotation.Nullable;
import java.io.IOException;
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
    
/** Contains information about the status of the rebuild process for a search index, these values are set server side, any values set from client is ignored */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RebuildStatus
{
    /** Indicates whether the rebuild process is currently in progress. This property is set server-side during modification. Any value sent from the client will be ignored. */
    public Boolean isRebuilding;
    /** Indicates whether the data is considered stale and the index is awaiting a rebuild. This property is set server-side during modification. Any value sent from the client will be ignored. */
    public Boolean isStale;
    /** The timestamp when the last rebuild process started. This property is set server-side during modification. Any value sent from the client will be ignored. */
    public OffsetDateTime lastRebuildStarted;
    /** The timestamp when the last rebuild process was completed. This property is set server-side during modification. Any value sent from the client will be ignored. */
    public OffsetDateTime lastRebuildCompleted;
    /** The timestamp representing the last time this index had an opportunity to perform a rebuild This property is set server-side during modification. Any value sent from the client will be ignored. */
    public OffsetDateTime lastRebuildOpportunity;
    /** The duration of the last rebuild. This property is set server-side during modification. Any value sent from the client will be ignored. */
    public TimeSpan lastRebuildDuration;
    /** Indicates whether the index have been built and is in a ready state to support searches. This property is set server-side. Any value sent from the client will be ignored. */
    public Boolean isBuilt;
    /** Indicates whether the index is a partially built index. The initial build of an index is always partial to minimize the time it takes before the index becomes ready to support searches As soon as an initial partial index is built, a full non-partial index is queued for re-indexing immediately to replace the partial built one asap. This property is set server-side. Any value sent from the client will be ignored. */
    public Boolean isPartial;
    /** The timestamp representing the last time this index has been marked as stale, meaning it requires a rebuild. This property is set server-side. Any value sent from the client will be ignored. */
    public OffsetDateTime lastMarkedAsStale;
    /** The duration of how long the index has been marked as stale, essentially waiting for a rebuild. This property is set server-side. Any value sent from the client will be ignored. */
    public TimeSpan staleDuration;
    public static RebuildStatus create(Boolean isBuilt, Boolean isPartial, Boolean isRebuilding, Boolean isStale, OffsetDateTime lastRebuildStarted, OffsetDateTime lastRebuildCompleted, OffsetDateTime lastRebuildOpportunity, TimeSpan lastRebuildDuration, OffsetDateTime lastMarkedAsStale, TimeSpan staleDuration)
    {
        return new RebuildStatus(isBuilt, isPartial, isRebuilding, isStale, lastRebuildStarted, lastRebuildCompleted, lastRebuildOpportunity, lastRebuildDuration, lastMarkedAsStale, staleDuration);
    }
    public RebuildStatus(Boolean isBuilt, Boolean isPartial, Boolean isRebuilding, Boolean isStale, OffsetDateTime lastRebuildStarted, OffsetDateTime lastRebuildCompleted, OffsetDateTime lastRebuildOpportunity, TimeSpan lastRebuildDuration, OffsetDateTime lastMarkedAsStale, TimeSpan staleDuration)
    {
        this.isBuilt = isBuilt;
        this.isPartial = isPartial;
        this.isRebuilding = isRebuilding;
        this.isStale = isStale;
        this.lastRebuildStarted = lastRebuildStarted;
        this.lastRebuildCompleted = lastRebuildCompleted;
        this.lastRebuildOpportunity = lastRebuildOpportunity;
        this.lastRebuildDuration = lastRebuildDuration;
        this.lastMarkedAsStale = lastMarkedAsStale;
        this.staleDuration = staleDuration;
    }
    public RebuildStatus()
    {
    }
    /** Indicates whether the rebuild process is currently in progress. This property is set server-side during modification. Any value sent from the client will be ignored. */
    public Boolean getIsRebuilding()
    {
        return this.isRebuilding;
    }
    /** Indicates whether the data is considered stale and the index is awaiting a rebuild. This property is set server-side during modification. Any value sent from the client will be ignored. */
    public Boolean getIsStale()
    {
        return this.isStale;
    }
    /** The timestamp when the last rebuild process started. This property is set server-side during modification. Any value sent from the client will be ignored. */
    public OffsetDateTime getLastRebuildStarted()
    {
        return this.lastRebuildStarted;
    }
    /** The timestamp when the last rebuild process was completed. This property is set server-side during modification. Any value sent from the client will be ignored. */
    public OffsetDateTime getLastRebuildCompleted()
    {
        return this.lastRebuildCompleted;
    }
    /** The timestamp representing the last time this index had an opportunity to perform a rebuild This property is set server-side during modification. Any value sent from the client will be ignored. */
    public OffsetDateTime getLastRebuildOpportunity()
    {
        return this.lastRebuildOpportunity;
    }
    /** The duration of the last rebuild. This property is set server-side during modification. Any value sent from the client will be ignored. */
    public TimeSpan getLastRebuildDuration()
    {
        return this.lastRebuildDuration;
    }
    /** Indicates whether the index have been built and is in a ready state to support searches. This property is set server-side. Any value sent from the client will be ignored. */
    public Boolean getIsBuilt()
    {
        return this.isBuilt;
    }
    /** Indicates whether the index is a partially built index. The initial build of an index is always partial to minimize the time it takes before the index becomes ready to support searches As soon as an initial partial index is built, a full non-partial index is queued for re-indexing immediately to replace the partial built one asap. This property is set server-side. Any value sent from the client will be ignored. */
    public Boolean getIsPartial()
    {
        return this.isPartial;
    }
    /** The timestamp representing the last time this index has been marked as stale, meaning it requires a rebuild. This property is set server-side. Any value sent from the client will be ignored. */
    public OffsetDateTime getLastMarkedAsStale()
    {
        return this.lastMarkedAsStale;
    }
    /** The duration of how long the index has been marked as stale, essentially waiting for a rebuild. This property is set server-side. Any value sent from the client will be ignored. */
    public TimeSpan getStaleDuration()
    {
        return this.staleDuration;
    }
    /** Indicates whether the rebuild process is currently in progress. This property is set server-side during modification. Any value sent from the client will be ignored. */
    public RebuildStatus setIsRebuilding(Boolean isRebuilding)
    {
        this.isRebuilding = isRebuilding;
        return this;
    }
    /** Indicates whether the data is considered stale and the index is awaiting a rebuild. This property is set server-side during modification. Any value sent from the client will be ignored. */
    public RebuildStatus setIsStale(Boolean isStale)
    {
        this.isStale = isStale;
        return this;
    }
    /** The timestamp when the last rebuild process started. This property is set server-side during modification. Any value sent from the client will be ignored. */
    public RebuildStatus setLastRebuildStarted(OffsetDateTime lastRebuildStarted)
    {
        this.lastRebuildStarted = lastRebuildStarted;
        return this;
    }
    /** The timestamp when the last rebuild process was completed. This property is set server-side during modification. Any value sent from the client will be ignored. */
    public RebuildStatus setLastRebuildCompleted(OffsetDateTime lastRebuildCompleted)
    {
        this.lastRebuildCompleted = lastRebuildCompleted;
        return this;
    }
    /** The timestamp representing the last time this index had an opportunity to perform a rebuild This property is set server-side during modification. Any value sent from the client will be ignored. */
    public RebuildStatus setLastRebuildOpportunity(OffsetDateTime lastRebuildOpportunity)
    {
        this.lastRebuildOpportunity = lastRebuildOpportunity;
        return this;
    }
    /** The duration of the last rebuild. This property is set server-side during modification. Any value sent from the client will be ignored. */
    public RebuildStatus setLastRebuildDuration(TimeSpan lastRebuildDuration)
    {
        this.lastRebuildDuration = lastRebuildDuration;
        return this;
    }
    /** Indicates whether the index have been built and is in a ready state to support searches. This property is set server-side. Any value sent from the client will be ignored. */
    public RebuildStatus setIsBuilt(Boolean isBuilt)
    {
        this.isBuilt = isBuilt;
        return this;
    }
    /** Indicates whether the index is a partially built index. The initial build of an index is always partial to minimize the time it takes before the index becomes ready to support searches As soon as an initial partial index is built, a full non-partial index is queued for re-indexing immediately to replace the partial built one asap. This property is set server-side. Any value sent from the client will be ignored. */
    public RebuildStatus setIsPartial(Boolean isPartial)
    {
        this.isPartial = isPartial;
        return this;
    }
    /** The timestamp representing the last time this index has been marked as stale, meaning it requires a rebuild. This property is set server-side. Any value sent from the client will be ignored. */
    public RebuildStatus setLastMarkedAsStale(OffsetDateTime lastMarkedAsStale)
    {
        this.lastMarkedAsStale = lastMarkedAsStale;
        return this;
    }
    /** The duration of how long the index has been marked as stale, essentially waiting for a rebuild. This property is set server-side. Any value sent from the client will be ignored. */
    public RebuildStatus setStaleDuration(TimeSpan staleDuration)
    {
        this.staleDuration = staleDuration;
        return this;
    }
}

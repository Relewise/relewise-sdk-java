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
    
/** Determines how a feed source is prioritized and how ties are broken. */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FeedSourceSelectionPolicy
{
    /** The selection order where lower values are chosen first. */
    public Integer priority;
    /** Relative weight for choosing between feed sources with the same priority. */
    public Float tieBreakerProbability;
    public static FeedSourceSelectionPolicy create(Integer priority, Float tieBreakerProbability)
    {
        return new FeedSourceSelectionPolicy(priority, tieBreakerProbability);
    }
    public FeedSourceSelectionPolicy(Integer priority, Float tieBreakerProbability)
    {
        this.priority = priority;
        this.tieBreakerProbability = tieBreakerProbability;
    }
    public FeedSourceSelectionPolicy()
    {
    }
    /** The selection order where lower values are chosen first. */
    public Integer getPriority()
    {
        return this.priority;
    }
    /** Relative weight for choosing between feed sources with the same priority. */
    public Float getTieBreakerProbability()
    {
        return this.tieBreakerProbability;
    }
    /** The selection order where lower values are chosen first. */
    public FeedSourceSelectionPolicy setPriority(Integer priority)
    {
        this.priority = priority;
        return this;
    }
    /** Relative weight for choosing between feed sources with the same priority. */
    public FeedSourceSelectionPolicy setTieBreakerProbability(Float tieBreakerProbability)
    {
        this.tieBreakerProbability = tieBreakerProbability;
        return this;
    }
}

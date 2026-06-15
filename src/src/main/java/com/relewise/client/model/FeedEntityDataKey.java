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
    
/** Describes one entity data key used when scoring overlap against seeded content. */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FeedEntityDataKey
{
    /** The name of the entity data key whose values should be used when determining overlaps. */
    public String key;
    /** The relative importance of overlaps on this key when scoring content. */
    public Float weight;
    /** Indicates whether content must overlap on this key to qualify as a valid result. */
    public Boolean required;
    /** Limits how many seed collection values are considered for this key. */
    public Integer seedDataCollectionsLimit;
    /** Limits how many candidate collection values are considered for this key. */
    public Integer candidateDataCollectionsLimit;
    public static FeedEntityDataKey create(String key, Float weight, Integer seedDataCollectionsLimit, Integer candidateDataCollectionsLimit, Boolean required)
    {
        return new FeedEntityDataKey(key, weight, seedDataCollectionsLimit, candidateDataCollectionsLimit, required);
    }
    public FeedEntityDataKey(String key, Float weight, Integer seedDataCollectionsLimit, Integer candidateDataCollectionsLimit, Boolean required)
    {
        this.key = key;
        this.weight = weight;
        this.seedDataCollectionsLimit = seedDataCollectionsLimit;
        this.candidateDataCollectionsLimit = candidateDataCollectionsLimit;
        this.required = required;
    }
    public FeedEntityDataKey()
    {
    }
    /** The name of the entity data key whose values should be used when determining overlaps. */
    public String getKey()
    {
        return this.key;
    }
    /** The relative importance of overlaps on this key when scoring content. */
    public Float getWeight()
    {
        return this.weight;
    }
    /** Indicates whether content must overlap on this key to qualify as a valid result. */
    public Boolean getRequired()
    {
        return this.required;
    }
    /** Limits how many seed collection values are considered for this key. */
    public Integer getSeedDataCollectionsLimit()
    {
        return this.seedDataCollectionsLimit;
    }
    /** Limits how many candidate collection values are considered for this key. */
    public Integer getCandidateDataCollectionsLimit()
    {
        return this.candidateDataCollectionsLimit;
    }
    /** The name of the entity data key whose values should be used when determining overlaps. */
    public FeedEntityDataKey setKey(String key)
    {
        this.key = key;
        return this;
    }
    /** The relative importance of overlaps on this key when scoring content. */
    public FeedEntityDataKey setWeight(Float weight)
    {
        this.weight = weight;
        return this;
    }
    /** Indicates whether content must overlap on this key to qualify as a valid result. */
    public FeedEntityDataKey setRequired(Boolean required)
    {
        this.required = required;
        return this;
    }
    /** Limits how many seed collection values are considered for this key. */
    public FeedEntityDataKey setSeedDataCollectionsLimit(Integer seedDataCollectionsLimit)
    {
        this.seedDataCollectionsLimit = seedDataCollectionsLimit;
        return this;
    }
    /** Limits how many candidate collection values are considered for this key. */
    public FeedEntityDataKey setCandidateDataCollectionsLimit(Integer candidateDataCollectionsLimit)
    {
        this.candidateDataCollectionsLimit = candidateDataCollectionsLimit;
        return this;
    }
}

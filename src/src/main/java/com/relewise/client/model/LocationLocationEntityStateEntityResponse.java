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
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type")
@JsonSubTypes({
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class LocationLocationEntityStateEntityResponse extends TimedResponse
{
    public String $type = "";
    public Location[] entities;
    public Integer hits;
    public HashMap<LocationEntityState, Integer> hitsPerState;
    public Location[] getEntities()
    {
        return this.entities;
    }
    public Integer getHits()
    {
        return this.hits;
    }
    public HashMap<LocationEntityState, Integer> getHitsPerState()
    {
        return this.hitsPerState;
    }
    public LocationLocationEntityStateEntityResponse setEntities(Location... entities)
    {
        this.entities = entities;
        return this;
    }
    public LocationLocationEntityStateEntityResponse setHits(Integer hits)
    {
        this.hits = hits;
        return this;
    }
    public LocationLocationEntityStateEntityResponse addToHitsPerState(LocationEntityState key, Integer value)
    {
        if (this.hitsPerState == null)
        {
            this.hitsPerState = new HashMap<>();
        }
        this.hitsPerState.put(key, value);
        return this;
    }
    public LocationLocationEntityStateEntityResponse setHitsPerState(HashMap<LocationEntityState, Integer> hitsPerState)
    {
        this.hitsPerState = hitsPerState;
        return this;
    }
    @Override
    public LocationLocationEntityStateEntityResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;
        return this;
    }
}

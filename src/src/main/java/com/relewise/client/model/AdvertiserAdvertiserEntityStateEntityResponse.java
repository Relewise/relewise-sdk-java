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
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type")
@JsonSubTypes({
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class AdvertiserAdvertiserEntityStateEntityResponse extends TimedResponse
{
    public String $type = "";
    public Advertiser[] entities;
    public Integer hits;
    public HashMap<AdvertiserEntityState, Integer> hitsPerState;
    public Advertiser[] getEntities()
    {
        return this.entities;
    }
    public Integer getHits()
    {
        return this.hits;
    }
    public HashMap<AdvertiserEntityState, Integer> getHitsPerState()
    {
        return this.hitsPerState;
    }
    public AdvertiserAdvertiserEntityStateEntityResponse setEntities(Advertiser... entities)
    {
        this.entities = entities;
        return this;
    }
    public AdvertiserAdvertiserEntityStateEntityResponse setHits(Integer hits)
    {
        this.hits = hits;
        return this;
    }
    public AdvertiserAdvertiserEntityStateEntityResponse addToHitsPerState(AdvertiserEntityState key, Integer value)
    {
        if (this.hitsPerState == null)
        {
            this.hitsPerState = new HashMap<>();
        }
        this.hitsPerState.put(key, value);
        return this;
    }
    public AdvertiserAdvertiserEntityStateEntityResponse setHitsPerState(HashMap<AdvertiserEntityState, Integer> hitsPerState)
    {
        this.hitsPerState = hitsPerState;
        return this;
    }
    @Override
    public AdvertiserAdvertiserEntityStateEntityResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;
        return this;
    }
}

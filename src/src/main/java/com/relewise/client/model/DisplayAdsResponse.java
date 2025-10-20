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
    property = "$type",
    defaultImpl = DisplayAdsResponse.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DisplayAdsResponse extends DisplayAdStringDisplayAdEntityStateEntityResponse
{
    public String $type = "Relewise.Client.Responses.RetailMedia.DisplayAdsResponse, Relewise.Client";
    public static DisplayAdsResponse create(DisplayAd[] displayAds, Integer hits, HashMap<DisplayAdEntityState, Integer> hitsPerState)
    {
        return new DisplayAdsResponse(displayAds, hits, hitsPerState);
    }
    public DisplayAdsResponse(DisplayAd[] displayAds, Integer hits, HashMap<DisplayAdEntityState, Integer> hitsPerState)
    {
        this.entities = displayAds;
        this.hits = hits;
        this.hitsPerState = hitsPerState;
    }
    public DisplayAdsResponse()
    {
    }
    @Override
    public DisplayAdsResponse setEntities(DisplayAd... entities)
    {
        this.entities = entities;
        return this;
    }
    public DisplayAdsResponse addToEntities(DisplayAd entity)
    {
        if (this.entities == null)
        {
            this.entities = new DisplayAd[] { entity };
        }
        else
        {
            ArrayList<DisplayAd> existingList = new ArrayList<>(Arrays.asList(this.entities));
            existingList.add(entity);
            this.entities = existingList.toArray(new DisplayAd[0]);
        }
        return this;
    }
    @Override
    public DisplayAdsResponse setHits(Integer hits)
    {
        this.hits = hits;
        return this;
    }
    public DisplayAdsResponse addToHitsPerState(DisplayAdEntityState key, Integer value)
    {
        if (this.hitsPerState == null)
        {
            this.hitsPerState = new HashMap<>();
        }
        this.hitsPerState.put(key, value);
        return this;
    }
    @Override
    public DisplayAdsResponse setHitsPerState(HashMap<DisplayAdEntityState, Integer> hitsPerState)
    {
        this.hitsPerState = hitsPerState;
        return this;
    }
    @Override
    public DisplayAdsResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;
        return this;
    }
}

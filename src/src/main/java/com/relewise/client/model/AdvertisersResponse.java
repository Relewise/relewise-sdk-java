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
    defaultImpl = AdvertisersResponse.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AdvertisersResponse extends AdvertiserAdvertiserEntityStateEntityResponse
{
    public String $type = "Relewise.Client.Responses.RetailMedia.AdvertisersResponse, Relewise.Client";
    public static AdvertisersResponse create(Advertiser[] advertisers, Integer hits, HashMap<AdvertiserEntityState, Integer> hitsPerState)
    {
        return new AdvertisersResponse(advertisers, hits, hitsPerState);
    }
    public AdvertisersResponse(Advertiser[] advertisers, Integer hits, HashMap<AdvertiserEntityState, Integer> hitsPerState)
    {
        this.entities = advertisers;
        this.hits = hits;
        this.hitsPerState = hitsPerState;
    }
    public AdvertisersResponse()
    {
    }
    @Override
    public AdvertisersResponse setEntities(Advertiser... entities)
    {
        this.entities = entities;
        return this;
    }
    public AdvertisersResponse addToEntities(Advertiser entity)
    {
        if (this.entities == null)
        {
            this.entities = new Advertiser[] { entity };
        }
        else
        {
            ArrayList<Advertiser> existingList = new ArrayList<>(Arrays.asList(this.entities));
            existingList.add(entity);
            this.entities = existingList.toArray(new Advertiser[0]);
        }
        return this;
    }
    @Override
    public AdvertisersResponse setHits(Integer hits)
    {
        this.hits = hits;
        return this;
    }
    public AdvertisersResponse addToHitsPerState(AdvertiserEntityState key, Integer value)
    {
        if (this.hitsPerState == null)
        {
            this.hitsPerState = new HashMap<>();
        }
        this.hitsPerState.put(key, value);
        return this;
    }
    @Override
    public AdvertisersResponse setHitsPerState(HashMap<AdvertiserEntityState, Integer> hitsPerState)
    {
        this.hitsPerState = hitsPerState;
        return this;
    }
    @Override
    public AdvertisersResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;
        return this;
    }
}

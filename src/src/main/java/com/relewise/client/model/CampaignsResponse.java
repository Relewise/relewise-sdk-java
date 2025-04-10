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
    defaultImpl = CampaignsResponse.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CampaignsResponse extends CampaignCampaignEntityStateEntityResponse
{
    public String $type = "Relewise.Client.Responses.RetailMedia.CampaignsResponse, Relewise.Client";
    public static CampaignsResponse create(Campaign[] campaigns, Integer hits, HashMap<CampaignEntityState, Integer> hitsPerState)
    {
        return new CampaignsResponse(campaigns, hits, hitsPerState);
    }
    public CampaignsResponse(Campaign[] campaigns, Integer hits, HashMap<CampaignEntityState, Integer> hitsPerState)
    {
        this.entities = campaigns;
        this.hits = hits;
        this.hitsPerState = hitsPerState;
    }
    public CampaignsResponse()
    {
    }
    @Override
    public CampaignsResponse setEntities(Campaign... entities)
    {
        this.entities = entities;
        return this;
    }
    public CampaignsResponse addToEntities(Campaign entity)
    {
        if (this.entities == null)
        {
            this.entities = new Campaign[] { entity };
        }
        else
        {
            ArrayList<Campaign> existingList = new ArrayList<>(Arrays.asList(this.entities));
            existingList.add(entity);
            this.entities = existingList.toArray(new Campaign[0]);
        }
        return this;
    }
    @Override
    public CampaignsResponse setHits(Integer hits)
    {
        this.hits = hits;
        return this;
    }
    public CampaignsResponse addToHitsPerState(CampaignEntityState key, Integer value)
    {
        if (this.hitsPerState == null)
        {
            this.hitsPerState = new HashMap<>();
        }
        this.hitsPerState.put(key, value);
        return this;
    }
    @Override
    public CampaignsResponse setHitsPerState(HashMap<CampaignEntityState, Integer> hitsPerState)
    {
        this.hitsPerState = hitsPerState;
        return this;
    }
    @Override
    public CampaignsResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;
        return this;
    }
}

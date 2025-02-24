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
    defaultImpl = SaveCampaignsResponse.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SaveCampaignsResponse extends CampaignSaveEntitiesResponse
{
    public String $type = "Relewise.Client.Responses.RetailMedia.SaveCampaignsResponse, Relewise.Client";
    public static SaveCampaignsResponse create(Campaign... campaigns)
    {
        return new SaveCampaignsResponse(campaigns);
    }
    public SaveCampaignsResponse(Campaign... campaigns)
    {
        this.entities = campaigns;
    }
    public SaveCampaignsResponse()
    {
    }
    @Override
    public SaveCampaignsResponse setEntities(Campaign... entities)
    {
        this.entities = entities;
        return this;
    }
    public SaveCampaignsResponse addToEntities(Campaign entity)
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
    public SaveCampaignsResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;
        return this;
    }
}

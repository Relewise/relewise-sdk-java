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
    defaultImpl = SaveDisplayAdsResponse.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SaveDisplayAdsResponse extends DisplayAdStringSaveEntitiesResponse
{
    public String $type = "Relewise.Client.Responses.RetailMedia.SaveDisplayAdsResponse, Relewise.Client";
    public static SaveDisplayAdsResponse create(DisplayAd... displayAds)
    {
        return new SaveDisplayAdsResponse(displayAds);
    }
    public SaveDisplayAdsResponse(DisplayAd... displayAds)
    {
        this.entities = displayAds;
    }
    public SaveDisplayAdsResponse()
    {
    }
    @Override
    public SaveDisplayAdsResponse setEntities(DisplayAd... entities)
    {
        this.entities = entities;
        return this;
    }
    public SaveDisplayAdsResponse addToEntities(DisplayAd entity)
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
    public SaveDisplayAdsResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;
        return this;
    }
}

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
    defaultImpl = SaveAdvertisersResponse.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SaveAdvertisersResponse extends AdvertiserSaveEntitiesResponse
{
    public String $type = "Relewise.Client.Responses.RetailMedia.SaveAdvertisersResponse, Relewise.Client";
    public static SaveAdvertisersResponse create(Advertiser... advertisers)
    {
        return new SaveAdvertisersResponse(advertisers);
    }
    public SaveAdvertisersResponse(Advertiser... advertisers)
    {
        this.entities = advertisers;
    }
    public SaveAdvertisersResponse()
    {
    }
    @Override
    public SaveAdvertisersResponse setEntities(Advertiser... entities)
    {
        this.entities = entities;
        return this;
    }
    public SaveAdvertisersResponse addToEntities(Advertiser entity)
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
    public SaveAdvertisersResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;
        return this;
    }
}

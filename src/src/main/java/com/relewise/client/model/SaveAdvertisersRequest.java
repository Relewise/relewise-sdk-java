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
    defaultImpl = SaveAdvertisersRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SaveAdvertisersRequest extends AdvertiserUUIDSaveEntitiesRequest
{
    public String $type = "Relewise.Client.Requests.RetailMedia.SaveAdvertisersRequest, Relewise.Client";
    public static SaveAdvertisersRequest create(Advertiser[] advertisers, String modifiedBy)
    {
        return new SaveAdvertisersRequest(advertisers, modifiedBy);
    }
    public SaveAdvertisersRequest(Advertiser[] advertisers, String modifiedBy)
    {
        this.entities = advertisers;
        this.modifiedBy = modifiedBy;
    }
    public SaveAdvertisersRequest()
    {
    }
    @Override
    public SaveAdvertisersRequest setEntities(Advertiser... entities)
    {
        this.entities = entities;
        return this;
    }
    public SaveAdvertisersRequest addToEntities(Advertiser entity)
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
    public SaveAdvertisersRequest setModifiedBy(String modifiedBy)
    {
        this.modifiedBy = modifiedBy;
        return this;
    }
}

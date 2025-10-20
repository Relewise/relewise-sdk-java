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
    defaultImpl = SaveDisplayAdsRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SaveDisplayAdsRequest extends DisplayAdStringSaveEntitiesRequest
{
    public String $type = "Relewise.Client.Requests.RetailMedia.SaveDisplayAdsRequest, Relewise.Client";
    public static SaveDisplayAdsRequest create(DisplayAd[] displayAd, String modifiedBy)
    {
        return new SaveDisplayAdsRequest(displayAd, modifiedBy);
    }
    public SaveDisplayAdsRequest(DisplayAd[] displayAd, String modifiedBy)
    {
        this.entities = displayAd;
        this.modifiedBy = modifiedBy;
    }
    public SaveDisplayAdsRequest()
    {
    }
    @Override
    public SaveDisplayAdsRequest setEntities(DisplayAd... entities)
    {
        this.entities = entities;
        return this;
    }
    public SaveDisplayAdsRequest addToEntities(DisplayAd entity)
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
    public SaveDisplayAdsRequest setModifiedBy(String modifiedBy)
    {
        this.modifiedBy = modifiedBy;
        return this;
    }
}

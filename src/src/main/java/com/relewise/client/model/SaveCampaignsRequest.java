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
import java.util.AbstractMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashSet;
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = SaveCampaignsRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SaveCampaignsRequest extends CampaignSaveEntitiesRequest
{
    public String $type = "Relewise.Client.Requests.RetailMedia.SaveCampaignsRequest, Relewise.Client";
    public static SaveCampaignsRequest create(Campaign[] campaigns, String modifiedBy)
    {
        return new SaveCampaignsRequest(campaigns, modifiedBy);
    }
    public SaveCampaignsRequest(Campaign[] campaigns, String modifiedBy)
    {
        this.entities = campaigns;
        this.modifiedBy = modifiedBy;
    }
    public SaveCampaignsRequest()
    {
    }
    @Override
    public SaveCampaignsRequest setEntities(Campaign... entities)
    {
        this.entities = entities;
        return this;
    }
    public SaveCampaignsRequest addToEntities(Campaign entity)
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
    public SaveCampaignsRequest setModifiedBy(String modifiedBy)
    {
        this.modifiedBy = modifiedBy;
        return this;
    }
}

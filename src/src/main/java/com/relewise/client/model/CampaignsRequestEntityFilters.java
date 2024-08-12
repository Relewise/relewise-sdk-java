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
    defaultImpl = CampaignsRequestEntityFilters.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CampaignsRequestEntityFilters extends CampaignEntityStateCampaignMetadataValuesRetailMediaEntityEntityFilters
{
    public String $type = "Relewise.Client.Requests.RetailMedia.CampaignsRequest+EntityFilters, Relewise.Client";
    public @Nullable UUID[] ids;
    public @Nullable UUID[] advertiserIds;
    public static CampaignsRequestEntityFilters create()
    {
        return new CampaignsRequestEntityFilters();
    }
    public CampaignsRequestEntityFilters()
    {
    }
    public @Nullable UUID[] getIds()
    {
        return this.ids;
    }
    public @Nullable UUID[] getAdvertiserIds()
    {
        return this.advertiserIds;
    }
    public CampaignsRequestEntityFilters setIds(UUID... ids)
    {
        this.ids = ids;
        return this;
    }
    public CampaignsRequestEntityFilters addToIds(UUID id)
    {
        if (this.ids == null)
        {
            this.ids = new UUID[] { id };
        }
        else
        {
            ArrayList<UUID> existingList = new ArrayList<>(Arrays.asList(this.ids));
            existingList.add(id);
            this.ids = existingList.toArray(new UUID[0]);
        }
        return this;
    }
    public CampaignsRequestEntityFilters setAdvertiserIds(UUID... advertiserIds)
    {
        this.advertiserIds = advertiserIds;
        return this;
    }
    public CampaignsRequestEntityFilters addToAdvertiserIds(UUID advertiserId)
    {
        if (this.advertiserIds == null)
        {
            this.advertiserIds = new UUID[] { advertiserId };
        }
        else
        {
            ArrayList<UUID> existingList = new ArrayList<>(Arrays.asList(this.advertiserIds));
            existingList.add(advertiserId);
            this.advertiserIds = existingList.toArray(new UUID[0]);
        }
        return this;
    }
    @Override
    public CampaignsRequestEntityFilters setTerm(String term)
    {
        this.term = term;
        return this;
    }
    @Override
    public CampaignsRequestEntityFilters setStates(CampaignEntityState... states)
    {
        this.states = states;
        return this;
    }
    public CampaignsRequestEntityFilters addToStates(CampaignEntityState state)
    {
        if (this.states == null)
        {
            this.states = new CampaignEntityState[] { state };
        }
        else
        {
            ArrayList<CampaignEntityState> existingList = new ArrayList<>(Arrays.asList(this.states));
            existingList.add(state);
            this.states = existingList.toArray(new CampaignEntityState[0]);
        }
        return this;
    }
}

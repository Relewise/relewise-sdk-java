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
    defaultImpl = DisplayAdsRequestEntityFilters.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DisplayAdsRequestEntityFilters extends DisplayAdEntityStateStringDisplayAdMetadataValuesRetailMediaEntityEntityFilters
{
    public String $type = "Relewise.Client.Requests.RetailMedia.DisplayAdsRequest+EntityFilters, Relewise.Client";
    public @Nullable String[] ids;
    public @Nullable UUID[] advertiserIds;
    public @Nullable UUID[] templateIds;
    public @Nullable FilterCollection filters;
    public static DisplayAdsRequestEntityFilters create()
    {
        return new DisplayAdsRequestEntityFilters();
    }
    public DisplayAdsRequestEntityFilters()
    {
    }
    public @Nullable String[] getIds()
    {
        return this.ids;
    }
    public @Nullable UUID[] getAdvertiserIds()
    {
        return this.advertiserIds;
    }
    public @Nullable UUID[] getTemplateIds()
    {
        return this.templateIds;
    }
    public @Nullable FilterCollection getFilters()
    {
        return this.filters;
    }
    public DisplayAdsRequestEntityFilters setIds(String... ids)
    {
        this.ids = ids;
        return this;
    }
    public DisplayAdsRequestEntityFilters addToIds(String id)
    {
        if (this.ids == null)
        {
            this.ids = new String[] { id };
        }
        else
        {
            ArrayList<String> existingList = new ArrayList<>(Arrays.asList(this.ids));
            existingList.add(id);
            this.ids = existingList.toArray(new String[0]);
        }
        return this;
    }
    public DisplayAdsRequestEntityFilters setAdvertiserIds(UUID... advertiserIds)
    {
        this.advertiserIds = advertiserIds;
        return this;
    }
    public DisplayAdsRequestEntityFilters addToAdvertiserIds(UUID advertiserId)
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
    public DisplayAdsRequestEntityFilters setTemplateIds(UUID... templateIds)
    {
        this.templateIds = templateIds;
        return this;
    }
    public DisplayAdsRequestEntityFilters addToTemplateIds(UUID templateId)
    {
        if (this.templateIds == null)
        {
            this.templateIds = new UUID[] { templateId };
        }
        else
        {
            ArrayList<UUID> existingList = new ArrayList<>(Arrays.asList(this.templateIds));
            existingList.add(templateId);
            this.templateIds = existingList.toArray(new UUID[0]);
        }
        return this;
    }
    public DisplayAdsRequestEntityFilters setFilters(@Nullable FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
    @Override
    public DisplayAdsRequestEntityFilters setTerm(@Nullable String term)
    {
        this.term = term;
        return this;
    }
    @Override
    public DisplayAdsRequestEntityFilters setStates(DisplayAdEntityState... states)
    {
        this.states = states;
        return this;
    }
    public DisplayAdsRequestEntityFilters addToStates(DisplayAdEntityState state)
    {
        if (this.states == null)
        {
            this.states = new DisplayAdEntityState[] { state };
        }
        else
        {
            ArrayList<DisplayAdEntityState> existingList = new ArrayList<>(Arrays.asList(this.states));
            existingList.add(state);
            this.states = existingList.toArray(new DisplayAdEntityState[0]);
        }
        return this;
    }
}

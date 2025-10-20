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
    defaultImpl = DisplayAdTemplatesRequestEntityFilters.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DisplayAdTemplatesRequestEntityFilters extends DisplayAdTemplateEntityStateUUIDDisplayAdTemplateMetadataValuesRetailMediaEntityEntityFilters
{
    public String $type = "Relewise.Client.Requests.RetailMedia.DisplayAdTemplatesRequest+EntityFilters, Relewise.Client";
    public @Nullable UUID[] ids;
    public @Nullable String[] keys;
    public @Nullable FilterCollection filters;
    public static DisplayAdTemplatesRequestEntityFilters create()
    {
        return new DisplayAdTemplatesRequestEntityFilters();
    }
    public DisplayAdTemplatesRequestEntityFilters()
    {
    }
    public @Nullable UUID[] getIds()
    {
        return this.ids;
    }
    public @Nullable String[] getKeys()
    {
        return this.keys;
    }
    public @Nullable FilterCollection getFilters()
    {
        return this.filters;
    }
    public DisplayAdTemplatesRequestEntityFilters setIds(UUID... ids)
    {
        this.ids = ids;
        return this;
    }
    public DisplayAdTemplatesRequestEntityFilters addToIds(UUID id)
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
    public DisplayAdTemplatesRequestEntityFilters setKeys(String... keys)
    {
        this.keys = keys;
        return this;
    }
    public DisplayAdTemplatesRequestEntityFilters addToKeys(String key)
    {
        if (this.keys == null)
        {
            this.keys = new String[] { key };
        }
        else
        {
            ArrayList<String> existingList = new ArrayList<>(Arrays.asList(this.keys));
            existingList.add(key);
            this.keys = existingList.toArray(new String[0]);
        }
        return this;
    }
    public DisplayAdTemplatesRequestEntityFilters setFilters(@Nullable FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
    @Override
    public DisplayAdTemplatesRequestEntityFilters setTerm(@Nullable String term)
    {
        this.term = term;
        return this;
    }
    @Override
    public DisplayAdTemplatesRequestEntityFilters setStates(DisplayAdTemplateEntityState... states)
    {
        this.states = states;
        return this;
    }
    public DisplayAdTemplatesRequestEntityFilters addToStates(DisplayAdTemplateEntityState state)
    {
        if (this.states == null)
        {
            this.states = new DisplayAdTemplateEntityState[] { state };
        }
        else
        {
            ArrayList<DisplayAdTemplateEntityState> existingList = new ArrayList<>(Arrays.asList(this.states));
            existingList.add(state);
            this.states = existingList.toArray(new DisplayAdTemplateEntityState[0]);
        }
        return this;
    }
}

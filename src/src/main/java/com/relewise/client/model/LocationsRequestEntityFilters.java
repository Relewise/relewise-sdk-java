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
    defaultImpl = LocationsRequestEntityFilters.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class LocationsRequestEntityFilters extends LocationEntityStateLocationMetadataValuesRetailMediaEntityEntityFilters
{
    public String $type = "Relewise.Client.Requests.RetailMedia.LocationsRequest+EntityFilters, Relewise.Client";
    public @Nullable UUID[] ids;
    public @Nullable String[] keys;
    public static LocationsRequestEntityFilters create()
    {
        return new LocationsRequestEntityFilters();
    }
    public LocationsRequestEntityFilters()
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
    public LocationsRequestEntityFilters setIds(UUID... ids)
    {
        this.ids = ids;
        return this;
    }
    public LocationsRequestEntityFilters addToIds(UUID id)
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
    public LocationsRequestEntityFilters setKeys(String... keys)
    {
        this.keys = keys;
        return this;
    }
    public LocationsRequestEntityFilters addToKeys(String key)
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
    @Override
    public LocationsRequestEntityFilters setTerm(String term)
    {
        this.term = term;
        return this;
    }
    @Override
    public LocationsRequestEntityFilters setStates(LocationEntityState... states)
    {
        this.states = states;
        return this;
    }
    public LocationsRequestEntityFilters addToStates(LocationEntityState state)
    {
        if (this.states == null)
        {
            this.states = new LocationEntityState[] { state };
        }
        else
        {
            ArrayList<LocationEntityState> existingList = new ArrayList<>(Arrays.asList(this.states));
            existingList.add(state);
            this.states = existingList.toArray(new LocationEntityState[0]);
        }
        return this;
    }
}

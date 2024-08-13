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
    defaultImpl = LocationsResponse.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class LocationsResponse extends LocationLocationEntityStateEntityResponse
{
    public String $type = "Relewise.Client.Responses.RetailMedia.LocationsResponse, Relewise.Client";
    public static LocationsResponse create(Location[] locations, Integer hits, HashMap<LocationEntityState, Integer> hitsPerState)
    {
        return new LocationsResponse(locations, hits, hitsPerState);
    }
    public LocationsResponse(Location[] locations, Integer hits, HashMap<LocationEntityState, Integer> hitsPerState)
    {
        this.entities = locations;
        this.hits = hits;
        this.hitsPerState = hitsPerState;
    }
    public LocationsResponse()
    {
    }
    @Override
    public LocationsResponse setEntities(Location... entities)
    {
        this.entities = entities;
        return this;
    }
    public LocationsResponse addToEntities(Location entity)
    {
        if (this.entities == null)
        {
            this.entities = new Location[] { entity };
        }
        else
        {
            ArrayList<Location> existingList = new ArrayList<>(Arrays.asList(this.entities));
            existingList.add(entity);
            this.entities = existingList.toArray(new Location[0]);
        }
        return this;
    }
    @Override
    public LocationsResponse setHits(Integer hits)
    {
        this.hits = hits;
        return this;
    }
    public LocationsResponse addToHitsPerState(LocationEntityState key, Integer value)
    {
        if (this.hitsPerState == null)
        {
            this.hitsPerState = new HashMap<>();
        }
        this.hitsPerState.put(key, value);
        return this;
    }
    @Override
    public LocationsResponse setHitsPerState(HashMap<LocationEntityState, Integer> hitsPerState)
    {
        this.hitsPerState = hitsPerState;
        return this;
    }
    @Override
    public LocationsResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;
        return this;
    }
}

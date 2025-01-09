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
import java.util.Set;
import java.util.HashSet;
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = SaveLocationsResponse.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SaveLocationsResponse extends LocationSaveEntitiesResponse
{
    public String $type = "Relewise.Client.Responses.RetailMedia.SaveLocationsResponse, Relewise.Client";
    public static SaveLocationsResponse create(Location... locations)
    {
        return new SaveLocationsResponse(locations);
    }
    public SaveLocationsResponse(Location... locations)
    {
        this.entities = locations;
    }
    public SaveLocationsResponse()
    {
    }
    @Override
    public SaveLocationsResponse setEntities(Location... entities)
    {
        this.entities = entities;
        return this;
    }
    public SaveLocationsResponse addToEntities(Location entity)
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
    public SaveLocationsResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;
        return this;
    }
}

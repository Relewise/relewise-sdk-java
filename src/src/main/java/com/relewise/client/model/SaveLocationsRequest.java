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
    defaultImpl = SaveLocationsRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SaveLocationsRequest extends LocationSaveEntitiesRequest
{
    public String $type = "Relewise.Client.Requests.RetailMedia.SaveLocationsRequest, Relewise.Client";
    public static SaveLocationsRequest create(Location[] locations, String modifiedBy)
    {
        return new SaveLocationsRequest(locations, modifiedBy);
    }
    public SaveLocationsRequest(Location[] locations, String modifiedBy)
    {
        this.entities = locations;
        this.modifiedBy = modifiedBy;
    }
    public SaveLocationsRequest()
    {
    }
    @Override
    public SaveLocationsRequest setEntities(Location... entities)
    {
        this.entities = entities;
        return this;
    }
    public SaveLocationsRequest addToEntities(Location entity)
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
    public SaveLocationsRequest setModifiedBy(String modifiedBy)
    {
        this.modifiedBy = modifiedBy;
        return this;
    }
}

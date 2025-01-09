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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class LocationPlacementCollection
{
    public ArrayList<LocationPlacement> items;
    public static LocationPlacementCollection create(LocationPlacement... placements)
    {
        return new LocationPlacementCollection(placements);
    }
    public LocationPlacementCollection(LocationPlacement... placements)
    {
        this.items = new ArrayList<>(Arrays.asList(placements));
    }
    public LocationPlacementCollection()
    {
    }
    public ArrayList<LocationPlacement> getItems()
    {
        return this.items;
    }
    public LocationPlacementCollection setItems(LocationPlacement... items)
    {
        this.items = new ArrayList<>(Arrays.asList(items));;
        return this;
    }
    public LocationPlacementCollection addToItems(LocationPlacement items)
    {
        if (this.items == null)
        {
            this.items = new ArrayList<>();
        }
        this.items.add(items);
        return this;
    }
}

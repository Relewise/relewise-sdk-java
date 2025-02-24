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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class LocationPlacementVariationCollection
{
    public ArrayList<LocationPlacementVariation> items;
    public static LocationPlacementVariationCollection create(LocationPlacementVariation... variations)
    {
        return new LocationPlacementVariationCollection(variations);
    }
    public LocationPlacementVariationCollection(LocationPlacementVariation... variations)
    {
        this.items = new ArrayList<>(Arrays.asList(variations));
    }
    public LocationPlacementVariationCollection()
    {
    }
    public ArrayList<LocationPlacementVariation> getItems()
    {
        return this.items;
    }
    public LocationPlacementVariationCollection setItems(LocationPlacementVariation... items)
    {
        this.items = new ArrayList<>(Arrays.asList(items));;
        return this;
    }
    public LocationPlacementVariationCollection addToItems(LocationPlacementVariation items)
    {
        if (this.items == null)
        {
            this.items = new ArrayList<>();
        }
        this.items.add(items);
        return this;
    }
}

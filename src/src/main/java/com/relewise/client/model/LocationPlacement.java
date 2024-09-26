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
    
/** Represents a placement within a location in the system where promotions can be shown */
@JsonIgnoreProperties(ignoreUnknown = true)
public class LocationPlacement
{
    /** The name of this placement, e.g. "Top", "Bottom", "Right", "Overlay" etc. */
    public String name;
    /** A key which is automatically computed based on the name. This value gets created the first time the placement is saved and cannot be modified in the future. Manually assigning a value to this will have no effect. */
    public @Nullable String key;
    /** The variations of this placement, e.g. to support multiple different views, like Mobile, Tablet, Desktop, Email template etc. If null or empty, no promotions will be shown for this placement */
    public @Nullable LocationPlacementVariationCollection variations;
    public static LocationPlacement create(String name, @Nullable LocationPlacementVariationCollection variations)
    {
        return new LocationPlacement(name, variations);
    }
    public LocationPlacement(String name, @Nullable LocationPlacementVariationCollection variations)
    {
        this.name = name;
        this.variations = variations;
    }
    public static LocationPlacement create(String name)
    {
        return new LocationPlacement(name);
    }
    public LocationPlacement(String name)
    {
        this.name = name;
    }
    public LocationPlacement()
    {
    }
    /** The name of this placement, e.g. "Top", "Bottom", "Right", "Overlay" etc. */
    public String getName()
    {
        return this.name;
    }
    /** A key which is automatically computed based on the name. This value gets created the first time the placement is saved and cannot be modified in the future. Manually assigning a value to this will have no effect. */
    public @Nullable String getKey()
    {
        return this.key;
    }
    /** The variations of this placement, e.g. to support multiple different views, like Mobile, Tablet, Desktop, Email template etc. If null or empty, no promotions will be shown for this placement */
    public @Nullable LocationPlacementVariationCollection getVariations()
    {
        return this.variations;
    }
    /** The name of this placement, e.g. "Top", "Bottom", "Right", "Overlay" etc. */
    public LocationPlacement setName(String name)
    {
        this.name = name;
        return this;
    }
    /** A key which is automatically computed based on the name. This value gets created the first time the placement is saved and cannot be modified in the future. Manually assigning a value to this will have no effect. */
    public LocationPlacement setKey(@Nullable String key)
    {
        this.key = key;
        return this;
    }
    /** The variations of this placement, e.g. to support multiple different views, like Mobile, Tablet, Desktop, Email template etc. If null or empty, no promotions will be shown for this placement */
    public LocationPlacement setVariations(@Nullable LocationPlacementVariationCollection variations)
    {
        this.variations = variations;
        return this;
    }
}

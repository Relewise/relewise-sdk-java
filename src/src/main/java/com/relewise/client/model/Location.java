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
    
/** Represents a location in the system where promotions can be shown, like 'Front Page', as well as <code>Placements</code> (like 'main zone', or 'power action'). */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = Location.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Location extends LocationEntityStateLocationMetadataValuesRetailMediaEntity
{
    public String $type = "Relewise.Client.DataTypes.RetailMedia.Location, Relewise.Client";
    /** The name of this location, e.g. "Front page", "PDP", "Home screen" etc. */
    public String name;
    /** A key which is automatically computed based on the name of the location. This will be used as identifier to reference this location when retrieving Retail Media content for it from the consuming client This value gets created the first time the location is saved and cannot be modified in the future. Manually assigning a value to this will have no effect. */
    public @Nullable String key;
    /** The placements where promotions may be displayed at this location If <code>null</code> or empty, no promotions will be shown at this location */
    public @Nullable LocationPlacementCollection placements;
    /** Defines what kinds of promotions are supported by this location */
    public @Nullable PromotionSpecificationCollection supportedPromotions;
    public static Location create(@Nullable UUID id, LocationEntityState state, String name, LocationPlacementCollection placements, @Nullable PromotionSpecificationCollection supportedPromotions)
    {
        return new Location(id, state, name, placements, supportedPromotions);
    }
    public Location(@Nullable UUID id, LocationEntityState state, String name, LocationPlacementCollection placements, @Nullable PromotionSpecificationCollection supportedPromotions)
    {
        this.id = id;
        this.state = state;
        this.name = name;
        this.placements = placements;
        this.supportedPromotions = supportedPromotions;
    }
    public static Location create(@Nullable UUID id, LocationEntityState state, String name)
    {
        return new Location(id, state, name);
    }
    public Location(@Nullable UUID id, LocationEntityState state, String name)
    {
        this.id = id;
        this.state = state;
        this.name = name;
    }
    public Location()
    {
    }
    /** The name of this location, e.g. "Front page", "PDP", "Home screen" etc. */
    public String getName()
    {
        return this.name;
    }
    /** A key which is automatically computed based on the name of the location. This will be used as identifier to reference this location when retrieving Retail Media content for it from the consuming client This value gets created the first time the location is saved and cannot be modified in the future. Manually assigning a value to this will have no effect. */
    public @Nullable String getKey()
    {
        return this.key;
    }
    /** The placements where promotions may be displayed at this location If <code>null</code> or empty, no promotions will be shown at this location */
    public @Nullable LocationPlacementCollection getPlacements()
    {
        return this.placements;
    }
    /** Defines what kinds of promotions are supported by this location */
    public @Nullable PromotionSpecificationCollection getSupportedPromotions()
    {
        return this.supportedPromotions;
    }
    /** The name of this location, e.g. "Front page", "PDP", "Home screen" etc. */
    public Location setName(String name)
    {
        this.name = name;
        return this;
    }
    /** A key which is automatically computed based on the name of the location. This will be used as identifier to reference this location when retrieving Retail Media content for it from the consuming client This value gets created the first time the location is saved and cannot be modified in the future. Manually assigning a value to this will have no effect. */
    public Location setKey(@Nullable String key)
    {
        this.key = key;
        return this;
    }
    /** The placements where promotions may be displayed at this location If <code>null</code> or empty, no promotions will be shown at this location */
    public Location setPlacements(@Nullable LocationPlacementCollection placements)
    {
        this.placements = placements;
        return this;
    }
    /** Defines what kinds of promotions are supported by this location */
    public Location setSupportedPromotions(@Nullable PromotionSpecificationCollection supportedPromotions)
    {
        this.supportedPromotions = supportedPromotions;
        return this;
    }
    @Override
    public Location setState(LocationEntityState state)
    {
        this.state = state;
        return this;
    }
    @Override
    public Location setMetadata(LocationMetadataValues metadata)
    {
        this.metadata = metadata;
        return this;
    }
    @Override
    public Location setId(@Nullable UUID id)
    {
        this.id = id;
        return this;
    }
}

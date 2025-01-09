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
    property = "$type")
@JsonSubTypes({
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class LocationEntityStateLocationMetadataValuesRetailMediaEntity extends RetailMediaEntity
{
    public String $type = "";
    public LocationEntityState state;
    /** Managed server side only, manually setting this will have no effect */
    public LocationMetadataValues metadata;
    public LocationEntityState getState()
    {
        return this.state;
    }
    /** Managed server side only, manually setting this will have no effect */
    public LocationMetadataValues getMetadata()
    {
        return this.metadata;
    }
    public LocationEntityStateLocationMetadataValuesRetailMediaEntity setState(LocationEntityState state)
    {
        this.state = state;
        return this;
    }
    /** Managed server side only, manually setting this will have no effect */
    public LocationEntityStateLocationMetadataValuesRetailMediaEntity setMetadata(LocationMetadataValues metadata)
    {
        this.metadata = metadata;
        return this;
    }
    @Override
    public LocationEntityStateLocationMetadataValuesRetailMediaEntity setId(@Nullable UUID id)
    {
        this.id = id;
        return this;
    }
}

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
    defaultImpl = LocationMetadataValues.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class LocationMetadataValues extends MetadataValues
{
    public String $type = "Relewise.Client.DataTypes.RetailMedia.Location+MetadataValues, Relewise.Client";
    public @Nullable OffsetDateTime inactivated;
    public @Nullable String inactivatedBy;
    public @Nullable OffsetDateTime activated;
    public @Nullable String activatedBy;
    public @Nullable OffsetDateTime archived;
    public @Nullable String archivedBy;
    public static LocationMetadataValues create()
    {
        return new LocationMetadataValues();
    }
    public LocationMetadataValues()
    {
    }
    public @Nullable OffsetDateTime getInactivated()
    {
        return this.inactivated;
    }
    public @Nullable String getInactivatedBy()
    {
        return this.inactivatedBy;
    }
    public @Nullable OffsetDateTime getActivated()
    {
        return this.activated;
    }
    public @Nullable String getActivatedBy()
    {
        return this.activatedBy;
    }
    public @Nullable OffsetDateTime getArchived()
    {
        return this.archived;
    }
    public @Nullable String getArchivedBy()
    {
        return this.archivedBy;
    }
    public LocationMetadataValues setInactivated(@Nullable OffsetDateTime inactivated)
    {
        this.inactivated = inactivated;
        return this;
    }
    public LocationMetadataValues setInactivatedBy(String inactivatedBy)
    {
        this.inactivatedBy = inactivatedBy;
        return this;
    }
    public LocationMetadataValues setActivated(@Nullable OffsetDateTime activated)
    {
        this.activated = activated;
        return this;
    }
    public LocationMetadataValues setActivatedBy(String activatedBy)
    {
        this.activatedBy = activatedBy;
        return this;
    }
    public LocationMetadataValues setArchived(@Nullable OffsetDateTime archived)
    {
        this.archived = archived;
        return this;
    }
    public LocationMetadataValues setArchivedBy(String archivedBy)
    {
        this.archivedBy = archivedBy;
        return this;
    }
    @Override
    public LocationMetadataValues setCreated(OffsetDateTime created)
    {
        this.created = created;
        return this;
    }
    @Override
    public LocationMetadataValues setCreatedBy(String createdBy)
    {
        this.createdBy = createdBy;
        return this;
    }
    @Override
    public LocationMetadataValues setModified(OffsetDateTime modified)
    {
        this.modified = modified;
        return this;
    }
    @Override
    public LocationMetadataValues setModifiedBy(String modifiedBy)
    {
        this.modifiedBy = modifiedBy;
        return this;
    }
}

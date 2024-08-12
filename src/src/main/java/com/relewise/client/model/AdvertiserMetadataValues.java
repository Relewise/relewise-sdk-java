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
    defaultImpl = AdvertiserMetadataValues.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AdvertiserMetadataValues extends MetadataValues
{
    public String $type = "Relewise.Client.DataTypes.RetailMedia.Advertiser+MetadataValues, Relewise.Client";
    public @Nullable OffsetDateTime inactivated;
    public @Nullable String inactivatedBy;
    public @Nullable OffsetDateTime activated;
    public @Nullable String activatedBy;
    public @Nullable OffsetDateTime archived;
    public @Nullable String archivedBy;
    public static AdvertiserMetadataValues create()
    {
        return new AdvertiserMetadataValues();
    }
    public AdvertiserMetadataValues()
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
    public AdvertiserMetadataValues setInactivated(@Nullable OffsetDateTime inactivated)
    {
        this.inactivated = inactivated;
        return this;
    }
    public AdvertiserMetadataValues setInactivatedBy(String inactivatedBy)
    {
        this.inactivatedBy = inactivatedBy;
        return this;
    }
    public AdvertiserMetadataValues setActivated(@Nullable OffsetDateTime activated)
    {
        this.activated = activated;
        return this;
    }
    public AdvertiserMetadataValues setActivatedBy(String activatedBy)
    {
        this.activatedBy = activatedBy;
        return this;
    }
    public AdvertiserMetadataValues setArchived(@Nullable OffsetDateTime archived)
    {
        this.archived = archived;
        return this;
    }
    public AdvertiserMetadataValues setArchivedBy(String archivedBy)
    {
        this.archivedBy = archivedBy;
        return this;
    }
    @Override
    public AdvertiserMetadataValues setCreated(OffsetDateTime created)
    {
        this.created = created;
        return this;
    }
    @Override
    public AdvertiserMetadataValues setCreatedBy(String createdBy)
    {
        this.createdBy = createdBy;
        return this;
    }
    @Override
    public AdvertiserMetadataValues setModified(OffsetDateTime modified)
    {
        this.modified = modified;
        return this;
    }
    @Override
    public AdvertiserMetadataValues setModifiedBy(String modifiedBy)
    {
        this.modifiedBy = modifiedBy;
        return this;
    }
}

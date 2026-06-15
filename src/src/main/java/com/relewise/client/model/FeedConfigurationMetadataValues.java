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
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = FeedConfigurationMetadataValues.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FeedConfigurationMetadataValues extends CommonMetadataValues
{
    public String $type = "Relewise.Client.DataTypes.Feed.FeedConfiguration+MetadataValues, Relewise.Client";
    public @Nullable OffsetDateTime activated;
    public @Nullable String activatedBy;
    public @Nullable OffsetDateTime inactivated;
    public @Nullable String inactivatedBy;
    public static FeedConfigurationMetadataValues create()
    {
        return new FeedConfigurationMetadataValues();
    }
    public FeedConfigurationMetadataValues()
    {
    }
    public @Nullable OffsetDateTime getActivated()
    {
        return this.activated;
    }
    public @Nullable String getActivatedBy()
    {
        return this.activatedBy;
    }
    public @Nullable OffsetDateTime getInactivated()
    {
        return this.inactivated;
    }
    public @Nullable String getInactivatedBy()
    {
        return this.inactivatedBy;
    }
    public FeedConfigurationMetadataValues setActivated(@Nullable OffsetDateTime activated)
    {
        this.activated = activated;
        return this;
    }
    public FeedConfigurationMetadataValues setActivatedBy(@Nullable String activatedBy)
    {
        this.activatedBy = activatedBy;
        return this;
    }
    public FeedConfigurationMetadataValues setInactivated(@Nullable OffsetDateTime inactivated)
    {
        this.inactivated = inactivated;
        return this;
    }
    public FeedConfigurationMetadataValues setInactivatedBy(@Nullable String inactivatedBy)
    {
        this.inactivatedBy = inactivatedBy;
        return this;
    }
    @Override
    public FeedConfigurationMetadataValues setCreated(OffsetDateTime created)
    {
        this.created = created;
        return this;
    }
    @Override
    public FeedConfigurationMetadataValues setCreatedBy(String createdBy)
    {
        this.createdBy = createdBy;
        return this;
    }
    @Override
    public FeedConfigurationMetadataValues setModified(OffsetDateTime modified)
    {
        this.modified = modified;
        return this;
    }
    @Override
    public FeedConfigurationMetadataValues setModifiedBy(String modifiedBy)
    {
        this.modifiedBy = modifiedBy;
        return this;
    }
}

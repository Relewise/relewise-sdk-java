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
    defaultImpl = DisplayAdMetadataValues.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DisplayAdMetadataValues extends MetadataValues
{
    public String $type = "Relewise.Client.DataTypes.RetailMedia.Entities.DisplayAd+MetadataValues, Relewise.Client";
    public static DisplayAdMetadataValues create()
    {
        return new DisplayAdMetadataValues();
    }
    public DisplayAdMetadataValues()
    {
    }
    @Override
    public DisplayAdMetadataValues setCreated(OffsetDateTime created)
    {
        this.created = created;
        return this;
    }
    @Override
    public DisplayAdMetadataValues setCreatedBy(String createdBy)
    {
        this.createdBy = createdBy;
        return this;
    }
    @Override
    public DisplayAdMetadataValues setModified(OffsetDateTime modified)
    {
        this.modified = modified;
        return this;
    }
    @Override
    public DisplayAdMetadataValues setModifiedBy(String modifiedBy)
    {
        this.modifiedBy = modifiedBy;
        return this;
    }
}

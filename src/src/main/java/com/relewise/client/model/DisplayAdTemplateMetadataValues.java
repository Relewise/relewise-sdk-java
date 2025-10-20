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
    defaultImpl = DisplayAdTemplateMetadataValues.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DisplayAdTemplateMetadataValues extends MetadataValues
{
    public String $type = "Relewise.Client.DataTypes.RetailMedia.Entities.DisplayAdTemplate+MetadataValues, Relewise.Client";
    public static DisplayAdTemplateMetadataValues create()
    {
        return new DisplayAdTemplateMetadataValues();
    }
    public DisplayAdTemplateMetadataValues()
    {
    }
    @Override
    public DisplayAdTemplateMetadataValues setCreated(OffsetDateTime created)
    {
        this.created = created;
        return this;
    }
    @Override
    public DisplayAdTemplateMetadataValues setCreatedBy(String createdBy)
    {
        this.createdBy = createdBy;
        return this;
    }
    @Override
    public DisplayAdTemplateMetadataValues setModified(OffsetDateTime modified)
    {
        this.modified = modified;
        return this;
    }
    @Override
    public DisplayAdTemplateMetadataValues setModifiedBy(String modifiedBy)
    {
        this.modifiedBy = modifiedBy;
        return this;
    }
}

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
    property = "$type")
@JsonSubTypes({
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class MetadataValues
{
    public String $type = "";
    public OffsetDateTime created;
    public String createdBy;
    public OffsetDateTime modified;
    public String modifiedBy;
    public OffsetDateTime getCreated()
    {
        return this.created;
    }
    public String getCreatedBy()
    {
        return this.createdBy;
    }
    public OffsetDateTime getModified()
    {
        return this.modified;
    }
    public String getModifiedBy()
    {
        return this.modifiedBy;
    }
    public MetadataValues setCreated(OffsetDateTime created)
    {
        this.created = created;
        return this;
    }
    public MetadataValues setCreatedBy(String createdBy)
    {
        this.createdBy = createdBy;
        return this;
    }
    public MetadataValues setModified(OffsetDateTime modified)
    {
        this.modified = modified;
        return this;
    }
    public MetadataValues setModifiedBy(String modifiedBy)
    {
        this.modifiedBy = modifiedBy;
        return this;
    }
}

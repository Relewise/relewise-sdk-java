package com.relewise.client.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.annotation.Nullable;
import java.io.IOException;
import java.time.OffsetDateTime;
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
    defaultImpl = SearchIndex.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchIndex
{
    public String $type = "Relewise.Client.DataTypes.Search.SearchIndex, Relewise.Client";
    public String id;
    public String description;
    public Boolean enabled;
    public Boolean isDefault;
    public OffsetDateTime created;
    public String createdBy;
    public OffsetDateTime modified;
    public String modifiedBy;
    public IndexConfiguration configuration;
    public static SearchIndex create(String id, String description, Boolean isDefault)
    {
        return new SearchIndex(id, description, isDefault);
    }
    public SearchIndex(String id, String description, Boolean isDefault)
    {
        this.id = id;
        this.description = description;
        this.isDefault = isDefault;
        this.enabled = true;
    }
    public static SearchIndex create(String id, String description, Boolean isDefault, Boolean enabled)
    {
        return new SearchIndex(id, description, isDefault, enabled);
    }
    public SearchIndex(String id, String description, Boolean isDefault, Boolean enabled)
    {
        this.id = id;
        this.description = description;
        this.isDefault = isDefault;
        this.enabled = enabled;
    }
    public SearchIndex()
    {
        this.enabled = true;
    }
    public String getId()
    {
        return this.id;
    }
    public String getDescription()
    {
        return this.description;
    }
    public Boolean getEnabled()
    {
        return this.enabled;
    }
    public Boolean getIsDefault()
    {
        return this.isDefault;
    }
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
    public IndexConfiguration getConfiguration()
    {
        return this.configuration;
    }
    public SearchIndex setId(String id)
    {
        this.id = id;;
        return this;
    }
    public SearchIndex setDescription(String description)
    {
        this.description = description;;
        return this;
    }
    public SearchIndex setEnabled(Boolean enabled)
    {
        this.enabled = enabled;;
        return this;
    }
    public SearchIndex setIsDefault(Boolean isDefault)
    {
        this.isDefault = isDefault;;
        return this;
    }
    public SearchIndex setCreated(OffsetDateTime created)
    {
        this.created = created;;
        return this;
    }
    public SearchIndex setCreatedBy(String createdBy)
    {
        this.createdBy = createdBy;;
        return this;
    }
    public SearchIndex setModified(OffsetDateTime modified)
    {
        this.modified = modified;;
        return this;
    }
    public SearchIndex setModifiedBy(String modifiedBy)
    {
        this.modifiedBy = modifiedBy;;
        return this;
    }
    public SearchIndex setConfiguration(IndexConfiguration configuration)
    {
        this.configuration = configuration;;
        return this;
    }
}

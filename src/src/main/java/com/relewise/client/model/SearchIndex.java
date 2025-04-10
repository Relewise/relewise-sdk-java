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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchIndex
{
    /** A unique identifier for the search index. */
    public String id;
    /** A descriptive text providing details about the search index. */
    public String description;
    /** Indicates whether the search index is currently enabled. */
    public Boolean enabled;
    /** Indicates whether the search index is marked as the default. */
    public Boolean isDefault;
    /** The timestamp when the search index was created. This property is set server-side during creation. Any value sent from the client will be ignored. */
    public OffsetDateTime created;
    /** The identifier of the user who created the search index. */
    public String createdBy;
    /** The timestamp when the search index was last modified. This property is set server-side during modification. Any value sent from the client will be ignored. */
    public OffsetDateTime modified;
    /** The identifier of the user who last modified the search index. */
    public String modifiedBy;
    /** The configuration settings associated with the search index. */
    public IndexConfiguration configuration;
    /** Details about the current rebuild status of the index These values are set server side, any values set from client is ignored */
    public RebuildStatus rebuildStatus;
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
    /** A unique identifier for the search index. */
    public String getId()
    {
        return this.id;
    }
    /** A descriptive text providing details about the search index. */
    public String getDescription()
    {
        return this.description;
    }
    /** Indicates whether the search index is currently enabled. */
    public Boolean getEnabled()
    {
        return this.enabled;
    }
    /** Indicates whether the search index is marked as the default. */
    public Boolean getIsDefault()
    {
        return this.isDefault;
    }
    /** The timestamp when the search index was created. This property is set server-side during creation. Any value sent from the client will be ignored. */
    public OffsetDateTime getCreated()
    {
        return this.created;
    }
    /** The identifier of the user who created the search index. */
    public String getCreatedBy()
    {
        return this.createdBy;
    }
    /** The timestamp when the search index was last modified. This property is set server-side during modification. Any value sent from the client will be ignored. */
    public OffsetDateTime getModified()
    {
        return this.modified;
    }
    /** The identifier of the user who last modified the search index. */
    public String getModifiedBy()
    {
        return this.modifiedBy;
    }
    /** The configuration settings associated with the search index. */
    public IndexConfiguration getConfiguration()
    {
        return this.configuration;
    }
    /** Details about the current rebuild status of the index These values are set server side, any values set from client is ignored */
    public RebuildStatus getRebuildStatus()
    {
        return this.rebuildStatus;
    }
    /** A unique identifier for the search index. */
    public SearchIndex setId(String id)
    {
        this.id = id;
        return this;
    }
    /** A descriptive text providing details about the search index. */
    public SearchIndex setDescription(String description)
    {
        this.description = description;
        return this;
    }
    /** Indicates whether the search index is currently enabled. */
    public SearchIndex setEnabled(Boolean enabled)
    {
        this.enabled = enabled;
        return this;
    }
    /** Indicates whether the search index is marked as the default. */
    public SearchIndex setIsDefault(Boolean isDefault)
    {
        this.isDefault = isDefault;
        return this;
    }
    /** The timestamp when the search index was created. This property is set server-side during creation. Any value sent from the client will be ignored. */
    public SearchIndex setCreated(OffsetDateTime created)
    {
        this.created = created;
        return this;
    }
    /** The identifier of the user who created the search index. */
    public SearchIndex setCreatedBy(String createdBy)
    {
        this.createdBy = createdBy;
        return this;
    }
    /** The timestamp when the search index was last modified. This property is set server-side during modification. Any value sent from the client will be ignored. */
    public SearchIndex setModified(OffsetDateTime modified)
    {
        this.modified = modified;
        return this;
    }
    /** The identifier of the user who last modified the search index. */
    public SearchIndex setModifiedBy(String modifiedBy)
    {
        this.modifiedBy = modifiedBy;
        return this;
    }
    /** The configuration settings associated with the search index. */
    public SearchIndex setConfiguration(IndexConfiguration configuration)
    {
        this.configuration = configuration;
        return this;
    }
    /** Details about the current rebuild status of the index These values are set server side, any values set from client is ignored */
    public SearchIndex setRebuildStatus(RebuildStatus rebuildStatus)
    {
        this.rebuildStatus = rebuildStatus;
        return this;
    }
}

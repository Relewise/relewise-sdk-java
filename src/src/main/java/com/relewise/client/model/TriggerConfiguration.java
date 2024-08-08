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
    property = "$type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ProductCategoryInterestTriggerConfiguration.class, name = "Relewise.Client.DataTypes.Triggers.Configurations.ProductCategoryInterestTriggerConfiguration, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductInterestTriggerConfiguration.class, name = "Relewise.Client.DataTypes.Triggers.Configurations.ProductInterestTriggerConfiguration, Relewise.Client"),
    @JsonSubTypes.Type(value = AbandonedCartTriggerConfiguration.class, name = "Relewise.Client.DataTypes.Triggers.Configurations.AbandonedCartTriggerConfiguration, Relewise.Client"),
    @JsonSubTypes.Type(value = UserActivityTriggerConfiguration.class, name = "Relewise.Client.DataTypes.Triggers.Configurations.UserActivityTriggerConfiguration, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentCategoryInterestTriggerConfiguration.class, name = "Relewise.Client.DataTypes.Triggers.Configurations.ContentCategoryInterestTriggerConfiguration, Relewise.Client"),
    @JsonSubTypes.Type(value = AbandonedSearchTriggerConfiguration.class, name = "Relewise.Client.DataTypes.Triggers.Configurations.AbandonedSearchTriggerConfiguration, Relewise.Client"),
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class TriggerConfiguration
{
    public String $type = "Relewise.Client.DataTypes.Triggers.Configurations.TriggerConfiguration, Relewise.Client";
    public UUID id;
    public String name;
    public String description;
    public String group;
    public Boolean enabled;
    public OffsetDateTime created;
    public String createdBy;
    public OffsetDateTime modified;
    public String modifiedBy;
    public Integer withinTimeSpanMinutes;
    public HashMap<String, String> settings;
    public UserConditionCollection userConditions;
    public UUID getId()
    {
        return this.id;
    }
    public String getName()
    {
        return this.name;
    }
    public String getDescription()
    {
        return this.description;
    }
    public String getGroup()
    {
        return this.group;
    }
    public Boolean getEnabled()
    {
        return this.enabled;
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
    public Integer getWithinTimeSpanMinutes()
    {
        return this.withinTimeSpanMinutes;
    }
    public HashMap<String, String> getSettings()
    {
        return this.settings;
    }
    public UserConditionCollection getUserConditions()
    {
        return this.userConditions;
    }
    public TriggerConfiguration setId(UUID id)
    {
        this.id = id;;
        return this;
    }
    public TriggerConfiguration setName(String name)
    {
        this.name = name;;
        return this;
    }
    public TriggerConfiguration setDescription(String description)
    {
        this.description = description;;
        return this;
    }
    public TriggerConfiguration setGroup(String group)
    {
        this.group = group;;
        return this;
    }
    public TriggerConfiguration setEnabled(Boolean enabled)
    {
        this.enabled = enabled;;
        return this;
    }
    public TriggerConfiguration setCreated(OffsetDateTime created)
    {
        this.created = created;;
        return this;
    }
    public TriggerConfiguration setCreatedBy(String createdBy)
    {
        this.createdBy = createdBy;;
        return this;
    }
    public TriggerConfiguration setModified(OffsetDateTime modified)
    {
        this.modified = modified;;
        return this;
    }
    public TriggerConfiguration setModifiedBy(String modifiedBy)
    {
        this.modifiedBy = modifiedBy;;
        return this;
    }
    public TriggerConfiguration setWithinTimeSpanMinutes(Integer withinTimeSpanMinutes)
    {
        this.withinTimeSpanMinutes = withinTimeSpanMinutes;;
        return this;
    }
    public TriggerConfiguration addToSettings(String key, String value)
    {
        if (this.settings == null)
        {
            this.settings = new HashMap<>();
        }
        this.settings.put(key, value);
        return this;
    }
    public TriggerConfiguration setSettings(HashMap<String, String> settings)
    {
        this.settings = settings;;
        return this;
    }
    public TriggerConfiguration setUserConditions(UserConditionCollection userConditions)
    {
        this.userConditions = userConditions;;
        return this;
    }
}

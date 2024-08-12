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
    defaultImpl = UserActivityTriggerConfiguration.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserActivityTriggerConfiguration extends UserActivityTriggerResultTriggerConfiguration
{
    public String $type = "Relewise.Client.DataTypes.Triggers.Configurations.UserActivityTriggerConfiguration, Relewise.Client";
    public static UserActivityTriggerConfiguration create(String name, String description)
    {
        return new UserActivityTriggerConfiguration(name, description);
    }
    public UserActivityTriggerConfiguration(String name, String description)
    {
        this.name = name;
        this.description = description;
    }
    public UserActivityTriggerConfiguration()
    {
    }
    @Override
    public UserActivityTriggerConfiguration setId(UUID id)
    {
        this.id = id;
        return this;
    }
    @Override
    public UserActivityTriggerConfiguration setName(String name)
    {
        this.name = name;
        return this;
    }
    @Override
    public UserActivityTriggerConfiguration setDescription(String description)
    {
        this.description = description;
        return this;
    }
    @Override
    public UserActivityTriggerConfiguration setGroup(String group)
    {
        this.group = group;
        return this;
    }
    @Override
    public UserActivityTriggerConfiguration setEnabled(Boolean enabled)
    {
        this.enabled = enabled;
        return this;
    }
    @Override
    public UserActivityTriggerConfiguration setCreated(OffsetDateTime created)
    {
        this.created = created;
        return this;
    }
    @Override
    public UserActivityTriggerConfiguration setCreatedBy(String createdBy)
    {
        this.createdBy = createdBy;
        return this;
    }
    @Override
    public UserActivityTriggerConfiguration setModified(OffsetDateTime modified)
    {
        this.modified = modified;
        return this;
    }
    @Override
    public UserActivityTriggerConfiguration setModifiedBy(String modifiedBy)
    {
        this.modifiedBy = modifiedBy;
        return this;
    }
    @Override
    public UserActivityTriggerConfiguration setWithinTimeSpanMinutes(Integer withinTimeSpanMinutes)
    {
        this.withinTimeSpanMinutes = withinTimeSpanMinutes;
        return this;
    }
    public UserActivityTriggerConfiguration addToSettings(String key, String value)
    {
        if (this.settings == null)
        {
            this.settings = new HashMap<>();
        }
        this.settings.put(key, value);
        return this;
    }
    @Override
    public UserActivityTriggerConfiguration setSettings(HashMap<String, String> settings)
    {
        this.settings = settings;
        return this;
    }
    @Override
    public UserActivityTriggerConfiguration setUserConditions(UserConditionCollection userConditions)
    {
        this.userConditions = userConditions;
        return this;
    }
}

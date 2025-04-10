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
public abstract class UserActivityTriggerResultTriggerConfiguration extends TriggerConfiguration
{
    public String $type = "";
    @Override
    public UserActivityTriggerResultTriggerConfiguration setId(UUID id)
    {
        this.id = id;
        return this;
    }
    @Override
    public UserActivityTriggerResultTriggerConfiguration setName(String name)
    {
        this.name = name;
        return this;
    }
    @Override
    public UserActivityTriggerResultTriggerConfiguration setDescription(String description)
    {
        this.description = description;
        return this;
    }
    @Override
    public UserActivityTriggerResultTriggerConfiguration setGroup(String group)
    {
        this.group = group;
        return this;
    }
    @Override
    public UserActivityTriggerResultTriggerConfiguration setEnabled(Boolean enabled)
    {
        this.enabled = enabled;
        return this;
    }
    @Override
    public UserActivityTriggerResultTriggerConfiguration setCreated(OffsetDateTime created)
    {
        this.created = created;
        return this;
    }
    @Override
    public UserActivityTriggerResultTriggerConfiguration setCreatedBy(String createdBy)
    {
        this.createdBy = createdBy;
        return this;
    }
    @Override
    public UserActivityTriggerResultTriggerConfiguration setModified(OffsetDateTime modified)
    {
        this.modified = modified;
        return this;
    }
    @Override
    public UserActivityTriggerResultTriggerConfiguration setModifiedBy(String modifiedBy)
    {
        this.modifiedBy = modifiedBy;
        return this;
    }
    @Override
    public UserActivityTriggerResultTriggerConfiguration setWithinTimeSpanMinutes(Integer withinTimeSpanMinutes)
    {
        this.withinTimeSpanMinutes = withinTimeSpanMinutes;
        return this;
    }
    public UserActivityTriggerResultTriggerConfiguration addToSettings(String key, String value)
    {
        if (this.settings == null)
        {
            this.settings = new HashMap<>();
        }
        this.settings.put(key, value);
        return this;
    }
    @Override
    public UserActivityTriggerResultTriggerConfiguration setSettings(HashMap<String, String> settings)
    {
        this.settings = settings;
        return this;
    }
    @Override
    public UserActivityTriggerResultTriggerConfiguration setUserConditions(UserConditionCollection userConditions)
    {
        this.userConditions = userConditions;
        return this;
    }
}

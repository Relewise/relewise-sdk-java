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
public abstract class ProductChangeTriggerResultTriggerConfiguration extends TriggerConfiguration
{
    public String $type = "";
    @Override
    public ProductChangeTriggerResultTriggerConfiguration setId(UUID id)
    {
        this.id = id;
        return this;
    }
    @Override
    public ProductChangeTriggerResultTriggerConfiguration setName(String name)
    {
        this.name = name;
        return this;
    }
    @Override
    public ProductChangeTriggerResultTriggerConfiguration setDescription(String description)
    {
        this.description = description;
        return this;
    }
    @Override
    public ProductChangeTriggerResultTriggerConfiguration setGroup(String group)
    {
        this.group = group;
        return this;
    }
    @Override
    public ProductChangeTriggerResultTriggerConfiguration setEnabled(Boolean enabled)
    {
        this.enabled = enabled;
        return this;
    }
    @Override
    public ProductChangeTriggerResultTriggerConfiguration setCreated(OffsetDateTime created)
    {
        this.created = created;
        return this;
    }
    @Override
    public ProductChangeTriggerResultTriggerConfiguration setCreatedBy(String createdBy)
    {
        this.createdBy = createdBy;
        return this;
    }
    @Override
    public ProductChangeTriggerResultTriggerConfiguration setModified(OffsetDateTime modified)
    {
        this.modified = modified;
        return this;
    }
    @Override
    public ProductChangeTriggerResultTriggerConfiguration setModifiedBy(String modifiedBy)
    {
        this.modifiedBy = modifiedBy;
        return this;
    }
    @Override
    public ProductChangeTriggerResultTriggerConfiguration setWithinTimeSpanMinutes(Integer withinTimeSpanMinutes)
    {
        this.withinTimeSpanMinutes = withinTimeSpanMinutes;
        return this;
    }
    public ProductChangeTriggerResultTriggerConfiguration addToSettings(String key, String value)
    {
        if (this.settings == null)
        {
            this.settings = new HashMap<>();
        }
        this.settings.put(key, value);
        return this;
    }
    @Override
    public ProductChangeTriggerResultTriggerConfiguration setSettings(HashMap<String, String> settings)
    {
        this.settings = settings;
        return this;
    }
    @Override
    public ProductChangeTriggerResultTriggerConfiguration setUserConditions(UserConditionCollection userConditions)
    {
        this.userConditions = userConditions;
        return this;
    }
}

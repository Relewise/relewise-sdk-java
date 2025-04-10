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
    defaultImpl = ProductChangeTriggerConfiguration.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductChangeTriggerConfiguration extends ProductChangeTriggerResultProductChangeTriggerResultSettingsProductPropertySelectorEntityChangeTriggerConfiguration
{
    public String $type = "Relewise.Client.DataTypes.Triggers.Configurations.ProductChangeTriggerConfiguration, Relewise.Client";
    public static ProductChangeTriggerConfiguration create(String name, String description, ProductPropertySelector entityPropertySelector, IChange change, ProductChangeTriggerResultSettings resultSettings)
    {
        return new ProductChangeTriggerConfiguration(name, description, entityPropertySelector, change, resultSettings);
    }
    public ProductChangeTriggerConfiguration(String name, String description, ProductPropertySelector entityPropertySelector, IChange change, ProductChangeTriggerResultSettings resultSettings)
    {
        this.name = name;
        this.description = description;
        this.entityPropertySelector = entityPropertySelector;
        this.change = change;
        this.resultSettings = resultSettings;
    }
    public ProductChangeTriggerConfiguration()
    {
    }
    @Override
    public ProductChangeTriggerConfiguration setEntityPropertySelector(@Nullable ProductPropertySelector entityPropertySelector)
    {
        this.entityPropertySelector = entityPropertySelector;
        return this;
    }
    @Override
    public ProductChangeTriggerConfiguration setBeforeChangeFilters(FilterCollection beforeChangeFilters)
    {
        this.beforeChangeFilters = beforeChangeFilters;
        return this;
    }
    @Override
    public ProductChangeTriggerConfiguration setAfterChangeFilters(FilterCollection afterChangeFilters)
    {
        this.afterChangeFilters = afterChangeFilters;
        return this;
    }
    @Override
    public ProductChangeTriggerConfiguration setChange(IChange change)
    {
        this.change = change;
        return this;
    }
    @Override
    public ProductChangeTriggerConfiguration setResultSettings(@Nullable ProductChangeTriggerResultSettings resultSettings)
    {
        this.resultSettings = resultSettings;
        return this;
    }
    @Override
    public ProductChangeTriggerConfiguration setId(UUID id)
    {
        this.id = id;
        return this;
    }
    @Override
    public ProductChangeTriggerConfiguration setName(String name)
    {
        this.name = name;
        return this;
    }
    @Override
    public ProductChangeTriggerConfiguration setDescription(String description)
    {
        this.description = description;
        return this;
    }
    @Override
    public ProductChangeTriggerConfiguration setGroup(String group)
    {
        this.group = group;
        return this;
    }
    @Override
    public ProductChangeTriggerConfiguration setEnabled(Boolean enabled)
    {
        this.enabled = enabled;
        return this;
    }
    @Override
    public ProductChangeTriggerConfiguration setCreated(OffsetDateTime created)
    {
        this.created = created;
        return this;
    }
    @Override
    public ProductChangeTriggerConfiguration setCreatedBy(String createdBy)
    {
        this.createdBy = createdBy;
        return this;
    }
    @Override
    public ProductChangeTriggerConfiguration setModified(OffsetDateTime modified)
    {
        this.modified = modified;
        return this;
    }
    @Override
    public ProductChangeTriggerConfiguration setModifiedBy(String modifiedBy)
    {
        this.modifiedBy = modifiedBy;
        return this;
    }
    @Override
    public ProductChangeTriggerConfiguration setWithinTimeSpanMinutes(Integer withinTimeSpanMinutes)
    {
        this.withinTimeSpanMinutes = withinTimeSpanMinutes;
        return this;
    }
    public ProductChangeTriggerConfiguration addToSettings(String key, String value)
    {
        if (this.settings == null)
        {
            this.settings = new HashMap<>();
        }
        this.settings.put(key, value);
        return this;
    }
    @Override
    public ProductChangeTriggerConfiguration setSettings(HashMap<String, String> settings)
    {
        this.settings = settings;
        return this;
    }
    @Override
    public ProductChangeTriggerConfiguration setUserConditions(UserConditionCollection userConditions)
    {
        this.userConditions = userConditions;
        return this;
    }
}

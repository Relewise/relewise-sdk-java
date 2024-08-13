package com.relewise.client.model;

import com.fasterxml.jackson.annotation.*;
import javax.annotation.Nullable;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.LocalDateTime;
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
    defaultImpl = VariantChangeTriggerConfiguration.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class VariantChangeTriggerConfiguration extends VariantChangeTriggerResultVariantChangeTriggerResultSettingsVariantPropertySelectorEntityChangeTriggerConfiguration
{
    public String $type = "Relewise.Client.DataTypes.Triggers.Configurations.VariantChangeTriggerConfiguration, Relewise.Client";
    public static VariantChangeTriggerConfiguration create(String name, String description, VariantPropertySelector entityPropertySelector, IChange change, VariantChangeTriggerResultSettings resultSettings)
    {
        return new VariantChangeTriggerConfiguration(name, description, entityPropertySelector, change, resultSettings);
    }
    public VariantChangeTriggerConfiguration(String name, String description, VariantPropertySelector entityPropertySelector, IChange change, VariantChangeTriggerResultSettings resultSettings)
    {
        this.name = name;
        this.description = description;
        this.entityPropertySelector = entityPropertySelector;
        this.change = change;
        this.resultSettings = resultSettings;
    }
    public VariantChangeTriggerConfiguration()
    {
    }
    @Override
    public VariantChangeTriggerConfiguration setEntityPropertySelector(@Nullable VariantPropertySelector entityPropertySelector)
    {
        this.entityPropertySelector = entityPropertySelector;
        return this;
    }
    @Override
    public VariantChangeTriggerConfiguration setBeforeChangeFilters(FilterCollection beforeChangeFilters)
    {
        this.beforeChangeFilters = beforeChangeFilters;
        return this;
    }
    @Override
    public VariantChangeTriggerConfiguration setAfterChangeFilters(FilterCollection afterChangeFilters)
    {
        this.afterChangeFilters = afterChangeFilters;
        return this;
    }
    @Override
    public VariantChangeTriggerConfiguration setChange(IChange change)
    {
        this.change = change;
        return this;
    }
    @Override
    public VariantChangeTriggerConfiguration setResultSettings(@Nullable VariantChangeTriggerResultSettings resultSettings)
    {
        this.resultSettings = resultSettings;
        return this;
    }
    @Override
    public VariantChangeTriggerConfiguration setId(UUID id)
    {
        this.id = id;
        return this;
    }
    @Override
    public VariantChangeTriggerConfiguration setName(String name)
    {
        this.name = name;
        return this;
    }
    @Override
    public VariantChangeTriggerConfiguration setDescription(String description)
    {
        this.description = description;
        return this;
    }
    @Override
    public VariantChangeTriggerConfiguration setGroup(String group)
    {
        this.group = group;
        return this;
    }
    @Override
    public VariantChangeTriggerConfiguration setEnabled(Boolean enabled)
    {
        this.enabled = enabled;
        return this;
    }
    @Override
    public VariantChangeTriggerConfiguration setCreated(OffsetDateTime created)
    {
        this.created = created;
        return this;
    }
    @Override
    public VariantChangeTriggerConfiguration setCreatedBy(String createdBy)
    {
        this.createdBy = createdBy;
        return this;
    }
    @Override
    public VariantChangeTriggerConfiguration setModified(OffsetDateTime modified)
    {
        this.modified = modified;
        return this;
    }
    @Override
    public VariantChangeTriggerConfiguration setModifiedBy(String modifiedBy)
    {
        this.modifiedBy = modifiedBy;
        return this;
    }
    @Override
    public VariantChangeTriggerConfiguration setWithinTimeSpanMinutes(Integer withinTimeSpanMinutes)
    {
        this.withinTimeSpanMinutes = withinTimeSpanMinutes;
        return this;
    }
    public VariantChangeTriggerConfiguration addToSettings(String key, String value)
    {
        if (this.settings == null)
        {
            this.settings = new HashMap<>();
        }
        this.settings.put(key, value);
        return this;
    }
    @Override
    public VariantChangeTriggerConfiguration setSettings(HashMap<String, String> settings)
    {
        this.settings = settings;
        return this;
    }
    @Override
    public VariantChangeTriggerConfiguration setUserConditions(UserConditionCollection userConditions)
    {
        this.userConditions = userConditions;
        return this;
    }
}

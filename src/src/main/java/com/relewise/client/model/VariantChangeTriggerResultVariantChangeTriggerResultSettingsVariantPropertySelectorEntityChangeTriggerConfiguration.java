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
    property = "$type")
@JsonSubTypes({
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class VariantChangeTriggerResultVariantChangeTriggerResultSettingsVariantPropertySelectorEntityChangeTriggerConfiguration extends VariantChangeTriggerResultTriggerConfiguration
{
    public String $type = "";
    /** The selector used for choosing which property of the entity the trigger should look for change in. */
    public @Nullable VariantPropertySelector entityPropertySelector;
    /** The filter that specifies which entities the trigger should track changes for. */
    public FilterCollection beforeChangeFilters;
    /** The filter for what state the tracked entities should have once they have changed to be included in the results. */
    public FilterCollection afterChangeFilters;
    /** The type of change that should happen to the value selected by the <code>EntityPropertySelector</code> for an entity to be considered part of the results. */
    public IChange change;
    /** Settings for defining which properties should be included in the result of the trigger. */
    public @Nullable VariantChangeTriggerResultSettings resultSettings;
    /** The selector used for choosing which property of the entity the trigger should look for change in. */
    public @Nullable VariantPropertySelector getEntityPropertySelector()
    {
        return this.entityPropertySelector;
    }
    /** The filter that specifies which entities the trigger should track changes for. */
    public FilterCollection getBeforeChangeFilters()
    {
        return this.beforeChangeFilters;
    }
    /** The filter for what state the tracked entities should have once they have changed to be included in the results. */
    public FilterCollection getAfterChangeFilters()
    {
        return this.afterChangeFilters;
    }
    /** The type of change that should happen to the value selected by the <code>EntityPropertySelector</code> for an entity to be considered part of the results. */
    public IChange getChange()
    {
        return this.change;
    }
    /** Settings for defining which properties should be included in the result of the trigger. */
    public @Nullable VariantChangeTriggerResultSettings getResultSettings()
    {
        return this.resultSettings;
    }
    /** The selector used for choosing which property of the entity the trigger should look for change in. */
    public VariantChangeTriggerResultVariantChangeTriggerResultSettingsVariantPropertySelectorEntityChangeTriggerConfiguration setEntityPropertySelector(@Nullable VariantPropertySelector entityPropertySelector)
    {
        this.entityPropertySelector = entityPropertySelector;
        return this;
    }
    /** The filter that specifies which entities the trigger should track changes for. */
    public VariantChangeTriggerResultVariantChangeTriggerResultSettingsVariantPropertySelectorEntityChangeTriggerConfiguration setBeforeChangeFilters(FilterCollection beforeChangeFilters)
    {
        this.beforeChangeFilters = beforeChangeFilters;
        return this;
    }
    /** The filter for what state the tracked entities should have once they have changed to be included in the results. */
    public VariantChangeTriggerResultVariantChangeTriggerResultSettingsVariantPropertySelectorEntityChangeTriggerConfiguration setAfterChangeFilters(FilterCollection afterChangeFilters)
    {
        this.afterChangeFilters = afterChangeFilters;
        return this;
    }
    /** The type of change that should happen to the value selected by the <code>EntityPropertySelector</code> for an entity to be considered part of the results. */
    public VariantChangeTriggerResultVariantChangeTriggerResultSettingsVariantPropertySelectorEntityChangeTriggerConfiguration setChange(IChange change)
    {
        this.change = change;
        return this;
    }
    /** Settings for defining which properties should be included in the result of the trigger. */
    public VariantChangeTriggerResultVariantChangeTriggerResultSettingsVariantPropertySelectorEntityChangeTriggerConfiguration setResultSettings(@Nullable VariantChangeTriggerResultSettings resultSettings)
    {
        this.resultSettings = resultSettings;
        return this;
    }
    @Override
    public VariantChangeTriggerResultVariantChangeTriggerResultSettingsVariantPropertySelectorEntityChangeTriggerConfiguration setId(UUID id)
    {
        this.id = id;
        return this;
    }
    @Override
    public VariantChangeTriggerResultVariantChangeTriggerResultSettingsVariantPropertySelectorEntityChangeTriggerConfiguration setName(String name)
    {
        this.name = name;
        return this;
    }
    @Override
    public VariantChangeTriggerResultVariantChangeTriggerResultSettingsVariantPropertySelectorEntityChangeTriggerConfiguration setDescription(String description)
    {
        this.description = description;
        return this;
    }
    @Override
    public VariantChangeTriggerResultVariantChangeTriggerResultSettingsVariantPropertySelectorEntityChangeTriggerConfiguration setGroup(String group)
    {
        this.group = group;
        return this;
    }
    @Override
    public VariantChangeTriggerResultVariantChangeTriggerResultSettingsVariantPropertySelectorEntityChangeTriggerConfiguration setEnabled(Boolean enabled)
    {
        this.enabled = enabled;
        return this;
    }
    @Override
    public VariantChangeTriggerResultVariantChangeTriggerResultSettingsVariantPropertySelectorEntityChangeTriggerConfiguration setCreated(OffsetDateTime created)
    {
        this.created = created;
        return this;
    }
    @Override
    public VariantChangeTriggerResultVariantChangeTriggerResultSettingsVariantPropertySelectorEntityChangeTriggerConfiguration setCreatedBy(String createdBy)
    {
        this.createdBy = createdBy;
        return this;
    }
    @Override
    public VariantChangeTriggerResultVariantChangeTriggerResultSettingsVariantPropertySelectorEntityChangeTriggerConfiguration setModified(OffsetDateTime modified)
    {
        this.modified = modified;
        return this;
    }
    @Override
    public VariantChangeTriggerResultVariantChangeTriggerResultSettingsVariantPropertySelectorEntityChangeTriggerConfiguration setModifiedBy(String modifiedBy)
    {
        this.modifiedBy = modifiedBy;
        return this;
    }
    @Override
    public VariantChangeTriggerResultVariantChangeTriggerResultSettingsVariantPropertySelectorEntityChangeTriggerConfiguration setWithinTimeSpanMinutes(Integer withinTimeSpanMinutes)
    {
        this.withinTimeSpanMinutes = withinTimeSpanMinutes;
        return this;
    }
    public VariantChangeTriggerResultVariantChangeTriggerResultSettingsVariantPropertySelectorEntityChangeTriggerConfiguration addToSettings(String key, String value)
    {
        if (this.settings == null)
        {
            this.settings = new HashMap<>();
        }
        this.settings.put(key, value);
        return this;
    }
    @Override
    public VariantChangeTriggerResultVariantChangeTriggerResultSettingsVariantPropertySelectorEntityChangeTriggerConfiguration setSettings(HashMap<String, String> settings)
    {
        this.settings = settings;
        return this;
    }
    @Override
    public VariantChangeTriggerResultVariantChangeTriggerResultSettingsVariantPropertySelectorEntityChangeTriggerConfiguration setUserConditions(UserConditionCollection userConditions)
    {
        this.userConditions = userConditions;
        return this;
    }
}

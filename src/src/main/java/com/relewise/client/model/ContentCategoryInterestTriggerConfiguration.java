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
    defaultImpl = ContentCategoryInterestTriggerConfiguration.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentCategoryInterestTriggerConfiguration extends ContentCategoryInterestTriggerResultTriggerConfiguration
{
    public String $type = "Relewise.Client.DataTypes.Triggers.Configurations.ContentCategoryInterestTriggerConfiguration, Relewise.Client";
    public IntegerRange categoryViews;
    public IntegerRange contentViews;
    public FilterCollection filters;
    public static ContentCategoryInterestTriggerConfiguration create(String name, String description, IntegerRange categoryViews, IntegerRange contentViews)
    {
        return new ContentCategoryInterestTriggerConfiguration(name, description, categoryViews, contentViews);
    }
    public ContentCategoryInterestTriggerConfiguration(String name, String description, IntegerRange categoryViews, IntegerRange contentViews)
    {
        this.name = name;
        this.description = description;
        this.categoryViews = categoryViews;
        this.contentViews = contentViews;
        this.filters = null;
    }
    public static ContentCategoryInterestTriggerConfiguration create(String name, String description, IntegerRange categoryViews, IntegerRange contentViews, FilterCollection filters)
    {
        return new ContentCategoryInterestTriggerConfiguration(name, description, categoryViews, contentViews, filters);
    }
    public ContentCategoryInterestTriggerConfiguration(String name, String description, IntegerRange categoryViews, IntegerRange contentViews, FilterCollection filters)
    {
        this.name = name;
        this.description = description;
        this.categoryViews = categoryViews;
        this.contentViews = contentViews;
        this.filters = filters;
    }
    public ContentCategoryInterestTriggerConfiguration()
    {
        this.filters = null;
    }
    public IntegerRange getCategoryViews()
    {
        return this.categoryViews;
    }
    public IntegerRange getContentViews()
    {
        return this.contentViews;
    }
    public FilterCollection getFilters()
    {
        return this.filters;
    }
    public ContentCategoryInterestTriggerConfiguration setCategoryViews(IntegerRange categoryViews)
    {
        this.categoryViews = categoryViews;
        return this;
    }
    public ContentCategoryInterestTriggerConfiguration setContentViews(IntegerRange contentViews)
    {
        this.contentViews = contentViews;
        return this;
    }
    public ContentCategoryInterestTriggerConfiguration setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
    @Override
    public ContentCategoryInterestTriggerConfiguration setId(UUID id)
    {
        this.id = id;
        return this;
    }
    @Override
    public ContentCategoryInterestTriggerConfiguration setName(String name)
    {
        this.name = name;
        return this;
    }
    @Override
    public ContentCategoryInterestTriggerConfiguration setDescription(String description)
    {
        this.description = description;
        return this;
    }
    @Override
    public ContentCategoryInterestTriggerConfiguration setGroup(String group)
    {
        this.group = group;
        return this;
    }
    @Override
    public ContentCategoryInterestTriggerConfiguration setEnabled(Boolean enabled)
    {
        this.enabled = enabled;
        return this;
    }
    @Override
    public ContentCategoryInterestTriggerConfiguration setCreated(OffsetDateTime created)
    {
        this.created = created;
        return this;
    }
    @Override
    public ContentCategoryInterestTriggerConfiguration setCreatedBy(String createdBy)
    {
        this.createdBy = createdBy;
        return this;
    }
    @Override
    public ContentCategoryInterestTriggerConfiguration setModified(OffsetDateTime modified)
    {
        this.modified = modified;
        return this;
    }
    @Override
    public ContentCategoryInterestTriggerConfiguration setModifiedBy(String modifiedBy)
    {
        this.modifiedBy = modifiedBy;
        return this;
    }
    @Override
    public ContentCategoryInterestTriggerConfiguration setWithinTimeSpanMinutes(Integer withinTimeSpanMinutes)
    {
        this.withinTimeSpanMinutes = withinTimeSpanMinutes;
        return this;
    }
    public ContentCategoryInterestTriggerConfiguration addToSettings(String key, String value)
    {
        if (this.settings == null)
        {
            this.settings = new HashMap<>();
        }
        this.settings.put(key, value);
        return this;
    }
    @Override
    public ContentCategoryInterestTriggerConfiguration setSettings(HashMap<String, String> settings)
    {
        this.settings = settings;
        return this;
    }
    @Override
    public ContentCategoryInterestTriggerConfiguration setUserConditions(UserConditionCollection userConditions)
    {
        this.userConditions = userConditions;
        return this;
    }
}

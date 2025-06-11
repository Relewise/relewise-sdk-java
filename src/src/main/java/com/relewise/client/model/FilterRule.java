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
    defaultImpl = FilterRule.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FilterRule extends MerchandisingRule
{
    public String $type = "Relewise.Client.DataTypes.Merchandising.Rules.FilterRule, Relewise.Client";
    public static FilterRule create(String name, String description)
    {
        return new FilterRule(name, description);
    }
    public FilterRule(String name, String description)
    {
        this.name = name;
        this.description = description;
    }
    public FilterRule()
    {
    }
    @Override
    public FilterRule setId(UUID id)
    {
        this.id = id;
        return this;
    }
    @Override
    public FilterRule setName(String name)
    {
        this.name = name;
        return this;
    }
    @Override
    public FilterRule setDescription(String description)
    {
        this.description = description;
        return this;
    }
    @Override
    public FilterRule setGroup(String group)
    {
        this.group = group;
        return this;
    }
    @Override
    public FilterRule setEnabled(Boolean enabled)
    {
        this.enabled = enabled;
        return this;
    }
    @Override
    public FilterRule setCreated(OffsetDateTime created)
    {
        this.created = created;
        return this;
    }
    @Override
    public FilterRule setCreatedBy(String createdBy)
    {
        this.createdBy = createdBy;
        return this;
    }
    @Override
    public FilterRule setModified(OffsetDateTime modified)
    {
        this.modified = modified;
        return this;
    }
    @Override
    public FilterRule setModifiedBy(String modifiedBy)
    {
        this.modifiedBy = modifiedBy;
        return this;
    }
    @Override
    public FilterRule setConditions(ConditionConfiguration conditions)
    {
        this.conditions = conditions;
        return this;
    }
    @Override
    public FilterRule setRequest(RequestConfiguration request)
    {
        this.request = request;
        return this;
    }
    @Override
    public FilterRule setPriority(Double priority)
    {
        this.priority = priority;
        return this;
    }
    public FilterRule addToSettings(String key, String value)
    {
        if (this.settings == null)
        {
            this.settings = new HashMap<>();
        }
        this.settings.put(key, value);
        return this;
    }
    @Override
    public FilterRule setSettings(HashMap<String, String> settings)
    {
        this.settings = settings;
        return this;
    }
    @Override
    public FilterRule setSchedule(@Nullable ISchedule schedule)
    {
        this.schedule = schedule;
        return this;
    }
    @Override
    public FilterRule setStatus(@Nullable MerchandisingRuleStatusName status)
    {
        this.status = status;
        return this;
    }
}

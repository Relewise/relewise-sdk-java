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
import java.util.Set;
import java.util.HashSet;
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = FixedPositionRule.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FixedPositionRule extends MerchandisingRule
{
    public String $type = "Relewise.Client.DataTypes.Merchandising.Rules.FixedPositionRule, Relewise.Client";
    public Integer position;
    public static FixedPositionRule create(String name, String description, Integer position)
    {
        return new FixedPositionRule(name, description, position);
    }
    public FixedPositionRule(String name, String description, Integer position)
    {
        this.name = name;
        this.description = description;
        this.position = position;
    }
    public FixedPositionRule()
    {
    }
    public Integer getPosition()
    {
        return this.position;
    }
    public FixedPositionRule setPosition(Integer position)
    {
        this.position = position;
        return this;
    }
    @Override
    public FixedPositionRule setId(UUID id)
    {
        this.id = id;
        return this;
    }
    @Override
    public FixedPositionRule setName(String name)
    {
        this.name = name;
        return this;
    }
    @Override
    public FixedPositionRule setDescription(String description)
    {
        this.description = description;
        return this;
    }
    @Override
    public FixedPositionRule setGroup(String group)
    {
        this.group = group;
        return this;
    }
    @Override
    public FixedPositionRule setEnabled(Boolean enabled)
    {
        this.enabled = enabled;
        return this;
    }
    @Override
    public FixedPositionRule setCreated(OffsetDateTime created)
    {
        this.created = created;
        return this;
    }
    @Override
    public FixedPositionRule setCreatedBy(String createdBy)
    {
        this.createdBy = createdBy;
        return this;
    }
    @Override
    public FixedPositionRule setModified(OffsetDateTime modified)
    {
        this.modified = modified;
        return this;
    }
    @Override
    public FixedPositionRule setModifiedBy(String modifiedBy)
    {
        this.modifiedBy = modifiedBy;
        return this;
    }
    @Override
    public FixedPositionRule setConditions(ConditionConfiguration conditions)
    {
        this.conditions = conditions;
        return this;
    }
    @Override
    public FixedPositionRule setRequest(RequestConfiguration request)
    {
        this.request = request;
        return this;
    }
    @Override
    public FixedPositionRule setPriority(Double priority)
    {
        this.priority = priority;
        return this;
    }
    public FixedPositionRule addToSettings(String key, String value)
    {
        if (this.settings == null)
        {
            this.settings = new HashMap<>();
        }
        this.settings.put(key, value);
        return this;
    }
    @Override
    public FixedPositionRule setSettings(HashMap<String, String> settings)
    {
        this.settings = settings;
        return this;
    }
}

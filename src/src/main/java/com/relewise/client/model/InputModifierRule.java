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
    defaultImpl = InputModifierRule.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InputModifierRule extends MerchandisingRule
{
    public String $type = "Relewise.Client.DataTypes.Merchandising.Rules.InputModifierRule, Relewise.Client";
    public static InputModifierRule create(String name, String description)
    {
        return new InputModifierRule(name, description);
    }
    public InputModifierRule(String name, String description)
    {
        this.name = name;
        this.description = description;
    }
    public InputModifierRule()
    {
    }
    @Override
    public InputModifierRule setId(UUID id)
    {
        this.id = id;
        return this;
    }
    @Override
    public InputModifierRule setName(String name)
    {
        this.name = name;
        return this;
    }
    @Override
    public InputModifierRule setDescription(String description)
    {
        this.description = description;
        return this;
    }
    @Override
    public InputModifierRule setGroup(String group)
    {
        this.group = group;
        return this;
    }
    @Override
    public InputModifierRule setEnabled(Boolean enabled)
    {
        this.enabled = enabled;
        return this;
    }
    @Override
    public InputModifierRule setCreated(OffsetDateTime created)
    {
        this.created = created;
        return this;
    }
    @Override
    public InputModifierRule setCreatedBy(String createdBy)
    {
        this.createdBy = createdBy;
        return this;
    }
    @Override
    public InputModifierRule setModified(OffsetDateTime modified)
    {
        this.modified = modified;
        return this;
    }
    @Override
    public InputModifierRule setModifiedBy(String modifiedBy)
    {
        this.modifiedBy = modifiedBy;
        return this;
    }
    @Override
    public InputModifierRule setConditions(ConditionConfiguration conditions)
    {
        this.conditions = conditions;
        return this;
    }
    @Override
    public InputModifierRule setRequest(RequestConfiguration request)
    {
        this.request = request;
        return this;
    }
    @Override
    public InputModifierRule setPriority(Double priority)
    {
        this.priority = priority;
        return this;
    }
    public InputModifierRule addToSettings(String key, String value)
    {
        if (this.settings == null)
        {
            this.settings = new HashMap<>();
        }
        this.settings.put(key, value);
        return this;
    }
    @Override
    public InputModifierRule setSettings(HashMap<String, String> settings)
    {
        this.settings = settings;
        return this;
    }
}

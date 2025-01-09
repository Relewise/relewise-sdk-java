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
    defaultImpl = BoostAndBuryRule.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BoostAndBuryRule extends MerchandisingRule
{
    public String $type = "Relewise.Client.DataTypes.Merchandising.Rules.BoostAndBuryRule, Relewise.Client";
    public ValueSelector multiplierSelector;
    public static BoostAndBuryRule create(String name, String description, ValueSelector multiplierSelector)
    {
        return new BoostAndBuryRule(name, description, multiplierSelector);
    }
    public BoostAndBuryRule(String name, String description, ValueSelector multiplierSelector)
    {
        this.name = name;
        this.description = description;
        this.multiplierSelector = multiplierSelector;
    }
    public BoostAndBuryRule()
    {
    }
    public ValueSelector getMultiplierSelector()
    {
        return this.multiplierSelector;
    }
    public BoostAndBuryRule setMultiplierSelector(ValueSelector multiplierSelector)
    {
        this.multiplierSelector = multiplierSelector;
        return this;
    }
    @Override
    public BoostAndBuryRule setId(UUID id)
    {
        this.id = id;
        return this;
    }
    @Override
    public BoostAndBuryRule setName(String name)
    {
        this.name = name;
        return this;
    }
    @Override
    public BoostAndBuryRule setDescription(String description)
    {
        this.description = description;
        return this;
    }
    @Override
    public BoostAndBuryRule setGroup(String group)
    {
        this.group = group;
        return this;
    }
    @Override
    public BoostAndBuryRule setEnabled(Boolean enabled)
    {
        this.enabled = enabled;
        return this;
    }
    @Override
    public BoostAndBuryRule setCreated(OffsetDateTime created)
    {
        this.created = created;
        return this;
    }
    @Override
    public BoostAndBuryRule setCreatedBy(String createdBy)
    {
        this.createdBy = createdBy;
        return this;
    }
    @Override
    public BoostAndBuryRule setModified(OffsetDateTime modified)
    {
        this.modified = modified;
        return this;
    }
    @Override
    public BoostAndBuryRule setModifiedBy(String modifiedBy)
    {
        this.modifiedBy = modifiedBy;
        return this;
    }
    @Override
    public BoostAndBuryRule setConditions(ConditionConfiguration conditions)
    {
        this.conditions = conditions;
        return this;
    }
    @Override
    public BoostAndBuryRule setRequest(RequestConfiguration request)
    {
        this.request = request;
        return this;
    }
    @Override
    public BoostAndBuryRule setPriority(Double priority)
    {
        this.priority = priority;
        return this;
    }
    public BoostAndBuryRule addToSettings(String key, String value)
    {
        if (this.settings == null)
        {
            this.settings = new HashMap<>();
        }
        this.settings.put(key, value);
        return this;
    }
    @Override
    public BoostAndBuryRule setSettings(HashMap<String, String> settings)
    {
        this.settings = settings;
        return this;
    }
}

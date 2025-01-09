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
    property = "$type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = BoostAndBuryRule.class, name = "Relewise.Client.DataTypes.Merchandising.Rules.BoostAndBuryRule, Relewise.Client"),
    @JsonSubTypes.Type(value = FilterRule.class, name = "Relewise.Client.DataTypes.Merchandising.Rules.FilterRule, Relewise.Client"),
    @JsonSubTypes.Type(value = FixedPositionRule.class, name = "Relewise.Client.DataTypes.Merchandising.Rules.FixedPositionRule, Relewise.Client"),
    @JsonSubTypes.Type(value = InputModifierRule.class, name = "Relewise.Client.DataTypes.Merchandising.Rules.InputModifierRule, Relewise.Client"),
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class MerchandisingRule
{
    public String $type = "";
    public UUID id;
    public String name;
    public String description;
    public String group;
    public Boolean enabled;
    public OffsetDateTime created;
    public String createdBy;
    public OffsetDateTime modified;
    public String modifiedBy;
    public ConditionConfiguration conditions;
    public RequestConfiguration request;
    public Double priority;
    public HashMap<String, String> settings;
    public UUID getId()
    {
        return this.id;
    }
    public String getName()
    {
        return this.name;
    }
    public String getDescription()
    {
        return this.description;
    }
    public String getGroup()
    {
        return this.group;
    }
    public Boolean getEnabled()
    {
        return this.enabled;
    }
    public OffsetDateTime getCreated()
    {
        return this.created;
    }
    public String getCreatedBy()
    {
        return this.createdBy;
    }
    public OffsetDateTime getModified()
    {
        return this.modified;
    }
    public String getModifiedBy()
    {
        return this.modifiedBy;
    }
    public ConditionConfiguration getConditions()
    {
        return this.conditions;
    }
    public RequestConfiguration getRequest()
    {
        return this.request;
    }
    public Double getPriority()
    {
        return this.priority;
    }
    public HashMap<String, String> getSettings()
    {
        return this.settings;
    }
    public MerchandisingRule setId(UUID id)
    {
        this.id = id;
        return this;
    }
    public MerchandisingRule setName(String name)
    {
        this.name = name;
        return this;
    }
    public MerchandisingRule setDescription(String description)
    {
        this.description = description;
        return this;
    }
    public MerchandisingRule setGroup(String group)
    {
        this.group = group;
        return this;
    }
    public MerchandisingRule setEnabled(Boolean enabled)
    {
        this.enabled = enabled;
        return this;
    }
    public MerchandisingRule setCreated(OffsetDateTime created)
    {
        this.created = created;
        return this;
    }
    public MerchandisingRule setCreatedBy(String createdBy)
    {
        this.createdBy = createdBy;
        return this;
    }
    public MerchandisingRule setModified(OffsetDateTime modified)
    {
        this.modified = modified;
        return this;
    }
    public MerchandisingRule setModifiedBy(String modifiedBy)
    {
        this.modifiedBy = modifiedBy;
        return this;
    }
    public MerchandisingRule setConditions(ConditionConfiguration conditions)
    {
        this.conditions = conditions;
        return this;
    }
    public MerchandisingRule setRequest(RequestConfiguration request)
    {
        this.request = request;
        return this;
    }
    public MerchandisingRule setPriority(Double priority)
    {
        this.priority = priority;
        return this;
    }
    public MerchandisingRule addToSettings(String key, String value)
    {
        if (this.settings == null)
        {
            this.settings = new HashMap<>();
        }
        this.settings.put(key, value);
        return this;
    }
    public MerchandisingRule setSettings(HashMap<String, String> settings)
    {
        this.settings = settings;
        return this;
    }
}

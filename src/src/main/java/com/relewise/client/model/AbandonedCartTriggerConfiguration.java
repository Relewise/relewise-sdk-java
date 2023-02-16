package com.relewise.client.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
    defaultImpl = AbandonedCartTriggerConfiguration.class)
public class AbandonedCartTriggerConfiguration extends AbandonedCartTriggerResultTriggerConfiguration
{
    public String $type = "Relewise.Client.DataTypes.Triggers.Configurations.AbandonedCartTriggerConfiguration, Relewise.Client";
    public String cartName;
    public static AbandonedCartTriggerConfiguration create(String name, String description)
    {
        return new AbandonedCartTriggerConfiguration(name, description);
    }
    public AbandonedCartTriggerConfiguration(String name, String description)
    {
        this.name = name;
        this.description = description;
        this.cartName = null;
    }
    public static AbandonedCartTriggerConfiguration create(String name, String description, String cartName)
    {
        return new AbandonedCartTriggerConfiguration(name, description, cartName);
    }
    public AbandonedCartTriggerConfiguration(String name, String description, String cartName)
    {
        this.name = name;
        this.description = description;
        this.cartName = cartName;
    }
    public AbandonedCartTriggerConfiguration()
    {
        this.cartName = null;
    }
    public String getCartName()
    {
        return this.cartName;
    }
    public AbandonedCartTriggerConfiguration setCartName(String cartName)
    {
        this.cartName = cartName;;
        return this;
    }
    @Override
    public AbandonedCartTriggerConfiguration setId(UUID id)
    {
        this.id = id;;
        return this;
    }
    @Override
    public AbandonedCartTriggerConfiguration setName(String name)
    {
        this.name = name;;
        return this;
    }
    @Override
    public AbandonedCartTriggerConfiguration setDescription(String description)
    {
        this.description = description;;
        return this;
    }
    @Override
    public AbandonedCartTriggerConfiguration setGroup(String group)
    {
        this.group = group;;
        return this;
    }
    @Override
    public AbandonedCartTriggerConfiguration setEnabled(Boolean enabled)
    {
        this.enabled = enabled;;
        return this;
    }
    @Override
    public AbandonedCartTriggerConfiguration setCreated(OffsetDateTime created)
    {
        this.created = created;;
        return this;
    }
    @Override
    public AbandonedCartTriggerConfiguration setCreatedBy(String createdBy)
    {
        this.createdBy = createdBy;;
        return this;
    }
    @Override
    public AbandonedCartTriggerConfiguration setModified(OffsetDateTime modified)
    {
        this.modified = modified;;
        return this;
    }
    @Override
    public AbandonedCartTriggerConfiguration setModifiedBy(String modifiedBy)
    {
        this.modifiedBy = modifiedBy;;
        return this;
    }
    @Override
    public AbandonedCartTriggerConfiguration setWithinTimeSpanMinutes(Integer withinTimeSpanMinutes)
    {
        this.withinTimeSpanMinutes = withinTimeSpanMinutes;;
        return this;
    }
    public AbandonedCartTriggerConfiguration addToSettings(String key, String value)
    {
        if (this.settings == null)
        {
            this.settings = new HashMap<>();
        }
        this.settings.put(key, value);
        return this;
    }
    @Override
    public AbandonedCartTriggerConfiguration setSettings(HashMap<String, String> settings)
    {
        this.settings = settings;;
        return this;
    }
    @Override
    public AbandonedCartTriggerConfiguration setUserConditions(UserConditionCollection userConditions)
    {
        this.userConditions = userConditions;;
        return this;
    }
}

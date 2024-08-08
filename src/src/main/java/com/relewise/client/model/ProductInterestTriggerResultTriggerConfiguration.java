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
    property = "$type")
@JsonSubTypes({
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class ProductInterestTriggerResultTriggerConfiguration extends TriggerConfiguration
{
    public String $type = "Relewise.Client.DataTypes.Triggers.Configurations.TriggerConfiguration`1[[Relewise.Client.Responses.Triggers.Results.ProductInterestTriggerResult, Relewise.Client, Version=1.61.0.0, Culture=neutral, PublicKeyToken=null]], Relewise.Client";
    @Override
    public ProductInterestTriggerResultTriggerConfiguration setId(UUID id)
    {
        this.id = id;;
        return this;
    }
    @Override
    public ProductInterestTriggerResultTriggerConfiguration setName(String name)
    {
        this.name = name;;
        return this;
    }
    @Override
    public ProductInterestTriggerResultTriggerConfiguration setDescription(String description)
    {
        this.description = description;;
        return this;
    }
    @Override
    public ProductInterestTriggerResultTriggerConfiguration setGroup(String group)
    {
        this.group = group;;
        return this;
    }
    @Override
    public ProductInterestTriggerResultTriggerConfiguration setEnabled(Boolean enabled)
    {
        this.enabled = enabled;;
        return this;
    }
    @Override
    public ProductInterestTriggerResultTriggerConfiguration setCreated(OffsetDateTime created)
    {
        this.created = created;;
        return this;
    }
    @Override
    public ProductInterestTriggerResultTriggerConfiguration setCreatedBy(String createdBy)
    {
        this.createdBy = createdBy;;
        return this;
    }
    @Override
    public ProductInterestTriggerResultTriggerConfiguration setModified(OffsetDateTime modified)
    {
        this.modified = modified;;
        return this;
    }
    @Override
    public ProductInterestTriggerResultTriggerConfiguration setModifiedBy(String modifiedBy)
    {
        this.modifiedBy = modifiedBy;;
        return this;
    }
    @Override
    public ProductInterestTriggerResultTriggerConfiguration setWithinTimeSpanMinutes(Integer withinTimeSpanMinutes)
    {
        this.withinTimeSpanMinutes = withinTimeSpanMinutes;;
        return this;
    }
    public ProductInterestTriggerResultTriggerConfiguration addToSettings(String key, String value)
    {
        if (this.settings == null)
        {
            this.settings = new HashMap<>();
        }
        this.settings.put(key, value);
        return this;
    }
    @Override
    public ProductInterestTriggerResultTriggerConfiguration setSettings(HashMap<String, String> settings)
    {
        this.settings = settings;;
        return this;
    }
    @Override
    public ProductInterestTriggerResultTriggerConfiguration setUserConditions(UserConditionCollection userConditions)
    {
        this.userConditions = userConditions;;
        return this;
    }
}

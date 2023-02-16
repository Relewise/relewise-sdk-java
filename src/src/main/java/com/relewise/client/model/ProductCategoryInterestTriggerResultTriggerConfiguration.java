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
    property = "$type")
@JsonSubTypes({
})
public abstract class ProductCategoryInterestTriggerResultTriggerConfiguration extends TriggerConfiguration
{
    public String $type = "Relewise.Client.DataTypes.Triggers.Configurations.TriggerConfiguration`1[[Relewise.Client.Responses.Triggers.Results.ProductCategoryInterestTriggerResult, Relewise.Client, Version=1.61.0.0, Culture=neutral, PublicKeyToken=null]], Relewise.Client";
    @Override
    public ProductCategoryInterestTriggerResultTriggerConfiguration setId(UUID id)
    {
        this.id = id;;
        return this;
    }
    @Override
    public ProductCategoryInterestTriggerResultTriggerConfiguration setName(String name)
    {
        this.name = name;;
        return this;
    }
    @Override
    public ProductCategoryInterestTriggerResultTriggerConfiguration setDescription(String description)
    {
        this.description = description;;
        return this;
    }
    @Override
    public ProductCategoryInterestTriggerResultTriggerConfiguration setGroup(String group)
    {
        this.group = group;;
        return this;
    }
    @Override
    public ProductCategoryInterestTriggerResultTriggerConfiguration setEnabled(Boolean enabled)
    {
        this.enabled = enabled;;
        return this;
    }
    @Override
    public ProductCategoryInterestTriggerResultTriggerConfiguration setCreated(OffsetDateTime created)
    {
        this.created = created;;
        return this;
    }
    @Override
    public ProductCategoryInterestTriggerResultTriggerConfiguration setCreatedBy(String createdBy)
    {
        this.createdBy = createdBy;;
        return this;
    }
    @Override
    public ProductCategoryInterestTriggerResultTriggerConfiguration setModified(OffsetDateTime modified)
    {
        this.modified = modified;;
        return this;
    }
    @Override
    public ProductCategoryInterestTriggerResultTriggerConfiguration setModifiedBy(String modifiedBy)
    {
        this.modifiedBy = modifiedBy;;
        return this;
    }
    @Override
    public ProductCategoryInterestTriggerResultTriggerConfiguration setWithinTimeSpanMinutes(Integer withinTimeSpanMinutes)
    {
        this.withinTimeSpanMinutes = withinTimeSpanMinutes;;
        return this;
    }
    public ProductCategoryInterestTriggerResultTriggerConfiguration addToSettings(String key, String value)
    {
        if (this.settings == null)
        {
            this.settings = new HashMap<>();
        }
        this.settings.put(key, value);
        return this;
    }
    @Override
    public ProductCategoryInterestTriggerResultTriggerConfiguration setSettings(HashMap<String, String> settings)
    {
        this.settings = settings;;
        return this;
    }
    @Override
    public ProductCategoryInterestTriggerResultTriggerConfiguration setUserConditions(UserConditionCollection userConditions)
    {
        this.userConditions = userConditions;;
        return this;
    }
}

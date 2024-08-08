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
    defaultImpl = ProductInterestTriggerConfiguration.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductInterestTriggerConfiguration extends ProductInterestTriggerResultTriggerConfiguration
{
    public String $type = "Relewise.Client.DataTypes.Triggers.Configurations.ProductInterestTriggerConfiguration, Relewise.Client";
    public IntegerRange productViews;
    public FilterCollection filters;
    public ProductInterestTriggerResultResultSettings resultSettings;
    public static ProductInterestTriggerConfiguration create(String name, String description, IntegerRange productViews)
    {
        return new ProductInterestTriggerConfiguration(name, description, productViews);
    }
    public ProductInterestTriggerConfiguration(String name, String description, IntegerRange productViews)
    {
        this.name = name;
        this.description = description;
        this.productViews = productViews;
        this.filters = null;
    }
    public static ProductInterestTriggerConfiguration create(String name, String description, IntegerRange productViews, FilterCollection filters)
    {
        return new ProductInterestTriggerConfiguration(name, description, productViews, filters);
    }
    public ProductInterestTriggerConfiguration(String name, String description, IntegerRange productViews, FilterCollection filters)
    {
        this.name = name;
        this.description = description;
        this.productViews = productViews;
        this.filters = filters;
    }
    public ProductInterestTriggerConfiguration()
    {
        this.filters = null;
    }
    public IntegerRange getProductViews()
    {
        return this.productViews;
    }
    public FilterCollection getFilters()
    {
        return this.filters;
    }
    public ProductInterestTriggerResultResultSettings getResultSettings()
    {
        return this.resultSettings;
    }
    public ProductInterestTriggerConfiguration setProductViews(IntegerRange productViews)
    {
        this.productViews = productViews;;
        return this;
    }
    public ProductInterestTriggerConfiguration setFilters(FilterCollection filters)
    {
        this.filters = filters;;
        return this;
    }
    public ProductInterestTriggerConfiguration setResultSettings(ProductInterestTriggerResultResultSettings resultSettings)
    {
        this.resultSettings = resultSettings;;
        return this;
    }
    @Override
    public ProductInterestTriggerConfiguration setId(UUID id)
    {
        this.id = id;;
        return this;
    }
    @Override
    public ProductInterestTriggerConfiguration setName(String name)
    {
        this.name = name;;
        return this;
    }
    @Override
    public ProductInterestTriggerConfiguration setDescription(String description)
    {
        this.description = description;;
        return this;
    }
    @Override
    public ProductInterestTriggerConfiguration setGroup(String group)
    {
        this.group = group;;
        return this;
    }
    @Override
    public ProductInterestTriggerConfiguration setEnabled(Boolean enabled)
    {
        this.enabled = enabled;;
        return this;
    }
    @Override
    public ProductInterestTriggerConfiguration setCreated(OffsetDateTime created)
    {
        this.created = created;;
        return this;
    }
    @Override
    public ProductInterestTriggerConfiguration setCreatedBy(String createdBy)
    {
        this.createdBy = createdBy;;
        return this;
    }
    @Override
    public ProductInterestTriggerConfiguration setModified(OffsetDateTime modified)
    {
        this.modified = modified;;
        return this;
    }
    @Override
    public ProductInterestTriggerConfiguration setModifiedBy(String modifiedBy)
    {
        this.modifiedBy = modifiedBy;;
        return this;
    }
    @Override
    public ProductInterestTriggerConfiguration setWithinTimeSpanMinutes(Integer withinTimeSpanMinutes)
    {
        this.withinTimeSpanMinutes = withinTimeSpanMinutes;;
        return this;
    }
    public ProductInterestTriggerConfiguration addToSettings(String key, String value)
    {
        if (this.settings == null)
        {
            this.settings = new HashMap<>();
        }
        this.settings.put(key, value);
        return this;
    }
    @Override
    public ProductInterestTriggerConfiguration setSettings(HashMap<String, String> settings)
    {
        this.settings = settings;;
        return this;
    }
    @Override
    public ProductInterestTriggerConfiguration setUserConditions(UserConditionCollection userConditions)
    {
        this.userConditions = userConditions;;
        return this;
    }
}

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
    defaultImpl = ProductCategoryInterestTriggerConfiguration.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductCategoryInterestTriggerConfiguration extends ProductCategoryInterestTriggerResultTriggerConfiguration
{
    public String $type = "Relewise.Client.DataTypes.Triggers.Configurations.ProductCategoryInterestTriggerConfiguration, Relewise.Client";
    public IntegerRange categoryViews;
    public IntegerRange productViews;
    public FilterCollection filters;
    public static ProductCategoryInterestTriggerConfiguration create(String name, String description, IntegerRange categoryViews, IntegerRange productViews)
    {
        return new ProductCategoryInterestTriggerConfiguration(name, description, categoryViews, productViews);
    }
    public ProductCategoryInterestTriggerConfiguration(String name, String description, IntegerRange categoryViews, IntegerRange productViews)
    {
        this.name = name;
        this.description = description;
        this.categoryViews = categoryViews;
        this.productViews = productViews;
        this.filters = null;
    }
    public static ProductCategoryInterestTriggerConfiguration create(String name, String description, IntegerRange categoryViews, IntegerRange productViews, FilterCollection filters)
    {
        return new ProductCategoryInterestTriggerConfiguration(name, description, categoryViews, productViews, filters);
    }
    public ProductCategoryInterestTriggerConfiguration(String name, String description, IntegerRange categoryViews, IntegerRange productViews, FilterCollection filters)
    {
        this.name = name;
        this.description = description;
        this.categoryViews = categoryViews;
        this.productViews = productViews;
        this.filters = filters;
    }
    public ProductCategoryInterestTriggerConfiguration()
    {
        this.filters = null;
    }
    public IntegerRange getCategoryViews()
    {
        return this.categoryViews;
    }
    public IntegerRange getProductViews()
    {
        return this.productViews;
    }
    public FilterCollection getFilters()
    {
        return this.filters;
    }
    public ProductCategoryInterestTriggerConfiguration setCategoryViews(IntegerRange categoryViews)
    {
        this.categoryViews = categoryViews;;
        return this;
    }
    public ProductCategoryInterestTriggerConfiguration setProductViews(IntegerRange productViews)
    {
        this.productViews = productViews;;
        return this;
    }
    public ProductCategoryInterestTriggerConfiguration setFilters(FilterCollection filters)
    {
        this.filters = filters;;
        return this;
    }
    @Override
    public ProductCategoryInterestTriggerConfiguration setId(UUID id)
    {
        this.id = id;;
        return this;
    }
    @Override
    public ProductCategoryInterestTriggerConfiguration setName(String name)
    {
        this.name = name;;
        return this;
    }
    @Override
    public ProductCategoryInterestTriggerConfiguration setDescription(String description)
    {
        this.description = description;;
        return this;
    }
    @Override
    public ProductCategoryInterestTriggerConfiguration setGroup(String group)
    {
        this.group = group;;
        return this;
    }
    @Override
    public ProductCategoryInterestTriggerConfiguration setEnabled(Boolean enabled)
    {
        this.enabled = enabled;;
        return this;
    }
    @Override
    public ProductCategoryInterestTriggerConfiguration setCreated(OffsetDateTime created)
    {
        this.created = created;;
        return this;
    }
    @Override
    public ProductCategoryInterestTriggerConfiguration setCreatedBy(String createdBy)
    {
        this.createdBy = createdBy;;
        return this;
    }
    @Override
    public ProductCategoryInterestTriggerConfiguration setModified(OffsetDateTime modified)
    {
        this.modified = modified;;
        return this;
    }
    @Override
    public ProductCategoryInterestTriggerConfiguration setModifiedBy(String modifiedBy)
    {
        this.modifiedBy = modifiedBy;;
        return this;
    }
    @Override
    public ProductCategoryInterestTriggerConfiguration setWithinTimeSpanMinutes(Integer withinTimeSpanMinutes)
    {
        this.withinTimeSpanMinutes = withinTimeSpanMinutes;;
        return this;
    }
    public ProductCategoryInterestTriggerConfiguration addToSettings(String key, String value)
    {
        if (this.settings == null)
        {
            this.settings = new HashMap<>();
        }
        this.settings.put(key, value);
        return this;
    }
    @Override
    public ProductCategoryInterestTriggerConfiguration setSettings(HashMap<String, String> settings)
    {
        this.settings = settings;;
        return this;
    }
    @Override
    public ProductCategoryInterestTriggerConfiguration setUserConditions(UserConditionCollection userConditions)
    {
        this.userConditions = userConditions;;
        return this;
    }
}

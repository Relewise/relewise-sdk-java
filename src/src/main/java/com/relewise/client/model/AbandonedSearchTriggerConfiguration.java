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
    defaultImpl = AbandonedSearchTriggerConfiguration.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AbandonedSearchTriggerConfiguration extends AbandonedSearchTriggerResultTriggerConfiguration
{
    public String $type = "Relewise.Client.DataTypes.Triggers.Configurations.AbandonedSearchTriggerConfiguration, Relewise.Client";
    public SearchType[] searchTypesInPrioritizedOrder;
    public @Nullable SearchTermCondition searchTermCondition;
    public static AbandonedSearchTriggerConfiguration create(String name, String description, SearchType... searchTypesInPrioritizedOrder)
    {
        return new AbandonedSearchTriggerConfiguration(name, description, searchTypesInPrioritizedOrder);
    }
    public AbandonedSearchTriggerConfiguration(String name, String description, SearchType... searchTypesInPrioritizedOrder)
    {
        this.name = name;
        this.description = description;
        this.searchTypesInPrioritizedOrder = searchTypesInPrioritizedOrder;
        this.searchTermCondition = null;
    }
    public static AbandonedSearchTriggerConfiguration create(String name, String description, SearchType[] searchTypesInPrioritizedOrder, SearchTermCondition searchTermCondition)
    {
        return new AbandonedSearchTriggerConfiguration(name, description, searchTypesInPrioritizedOrder, searchTermCondition);
    }
    public AbandonedSearchTriggerConfiguration(String name, String description, SearchType[] searchTypesInPrioritizedOrder, SearchTermCondition searchTermCondition)
    {
        this.name = name;
        this.description = description;
        this.searchTypesInPrioritizedOrder = searchTypesInPrioritizedOrder;
        this.searchTermCondition = searchTermCondition;
    }
    public AbandonedSearchTriggerConfiguration()
    {
        this.searchTermCondition = null;
    }
    public SearchType[] getSearchTypesInPrioritizedOrder()
    {
        return this.searchTypesInPrioritizedOrder;
    }
    public @Nullable SearchTermCondition getSearchTermCondition()
    {
        return this.searchTermCondition;
    }
    public AbandonedSearchTriggerConfiguration setSearchTypesInPrioritizedOrder(SearchType... searchTypesInPrioritizedOrder)
    {
        this.searchTypesInPrioritizedOrder = searchTypesInPrioritizedOrder;
        return this;
    }
    public AbandonedSearchTriggerConfiguration addToSearchTypesInPrioritizedOrder(SearchType searchTypesInPrioritizedOrder)
    {
        if (this.searchTypesInPrioritizedOrder == null)
        {
            this.searchTypesInPrioritizedOrder = new SearchType[] { searchTypesInPrioritizedOrder };
        }
        else
        {
            ArrayList<SearchType> existingList = new ArrayList<>(Arrays.asList(this.searchTypesInPrioritizedOrder));
            existingList.add(searchTypesInPrioritizedOrder);
            this.searchTypesInPrioritizedOrder = existingList.toArray(new SearchType[0]);
        }
        return this;
    }
    public AbandonedSearchTriggerConfiguration setSearchTermCondition(SearchTermCondition searchTermCondition)
    {
        this.searchTermCondition = searchTermCondition;
        return this;
    }
    @Override
    public AbandonedSearchTriggerConfiguration setId(UUID id)
    {
        this.id = id;
        return this;
    }
    @Override
    public AbandonedSearchTriggerConfiguration setName(String name)
    {
        this.name = name;
        return this;
    }
    @Override
    public AbandonedSearchTriggerConfiguration setDescription(String description)
    {
        this.description = description;
        return this;
    }
    @Override
    public AbandonedSearchTriggerConfiguration setGroup(String group)
    {
        this.group = group;
        return this;
    }
    @Override
    public AbandonedSearchTriggerConfiguration setEnabled(Boolean enabled)
    {
        this.enabled = enabled;
        return this;
    }
    @Override
    public AbandonedSearchTriggerConfiguration setCreated(OffsetDateTime created)
    {
        this.created = created;
        return this;
    }
    @Override
    public AbandonedSearchTriggerConfiguration setCreatedBy(String createdBy)
    {
        this.createdBy = createdBy;
        return this;
    }
    @Override
    public AbandonedSearchTriggerConfiguration setModified(OffsetDateTime modified)
    {
        this.modified = modified;
        return this;
    }
    @Override
    public AbandonedSearchTriggerConfiguration setModifiedBy(String modifiedBy)
    {
        this.modifiedBy = modifiedBy;
        return this;
    }
    @Override
    public AbandonedSearchTriggerConfiguration setWithinTimeSpanMinutes(Integer withinTimeSpanMinutes)
    {
        this.withinTimeSpanMinutes = withinTimeSpanMinutes;
        return this;
    }
    public AbandonedSearchTriggerConfiguration addToSettings(String key, String value)
    {
        if (this.settings == null)
        {
            this.settings = new HashMap<>();
        }
        this.settings.put(key, value);
        return this;
    }
    @Override
    public AbandonedSearchTriggerConfiguration setSettings(HashMap<String, String> settings)
    {
        this.settings = settings;
        return this;
    }
    @Override
    public AbandonedSearchTriggerConfiguration setUserConditions(UserConditionCollection userConditions)
    {
        this.userConditions = userConditions;
        return this;
    }
}

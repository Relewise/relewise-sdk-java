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
    defaultImpl = RedirectRule.class)
public class RedirectRule extends SearchRule
{
    public String $type = "Relewise.Client.DataTypes.Search.Configuration.SearchRules.RedirectRule, Relewise.Client";
    public SearchTermCondition condition;
    public @Nullable String destination;
    public @Nullable HashMap<String, String> data;
    public static RedirectRule create(UUID id, @Nullable ApplicableIndexes indexes, @Nullable ApplicableLanguages languages, Boolean isApproved, SearchTermCondition condition, String destination)
    {
        return new RedirectRule(id, indexes, languages, isApproved, condition, destination);
    }
    public RedirectRule(UUID id, @Nullable ApplicableIndexes indexes, @Nullable ApplicableLanguages languages, Boolean isApproved, SearchTermCondition condition, String destination)
    {
        this.id = id;
        this.indexes = indexes;
        this.languages = languages;
        this.isApproved = isApproved;
        this.condition = condition;
        this.destination = destination;
        this.data = null;
    }
    public static RedirectRule create(UUID id, @Nullable ApplicableIndexes indexes, @Nullable ApplicableLanguages languages, Boolean isApproved, SearchTermCondition condition, @Nullable String destination, HashMap<String, String> data)
    {
        return new RedirectRule(id, indexes, languages, isApproved, condition, destination, data);
    }
    public RedirectRule(UUID id, @Nullable ApplicableIndexes indexes, @Nullable ApplicableLanguages languages, Boolean isApproved, SearchTermCondition condition, @Nullable String destination, HashMap<String, String> data)
    {
        this.id = id;
        this.indexes = indexes;
        this.languages = languages;
        this.isApproved = isApproved;
        this.condition = condition;
        this.destination = destination;
        this.data = data;
    }
    public RedirectRule()
    {
        this.data = null;
    }
    public SearchTermCondition getCondition()
    {
        return this.condition;
    }
    public @Nullable String getDestination()
    {
        return this.destination;
    }
    public @Nullable HashMap<String, String> getData()
    {
        return this.data;
    }
    public RedirectRule setCondition(SearchTermCondition condition)
    {
        this.condition = condition;;
        return this;
    }
    public RedirectRule setDestination(String destination)
    {
        this.destination = destination;;
        return this;
    }
    public RedirectRule addToData(String key, String value)
    {
        if (this.data == null)
        {
            this.data = new HashMap<>();
        }
        this.data.put(key, value);
        return this;
    }
    public RedirectRule setData(HashMap<String, String> data)
    {
        this.data = data;;
        return this;
    }
    @Override
    public RedirectRule setId(UUID id)
    {
        this.id = id;;
        return this;
    }
    @Override
    public RedirectRule setIndexes(ApplicableIndexes indexes)
    {
        this.indexes = indexes;;
        return this;
    }
    @Override
    public RedirectRule setLanguages(ApplicableLanguages languages)
    {
        this.languages = languages;;
        return this;
    }
    @Override
    public RedirectRule setCreated(OffsetDateTime created)
    {
        this.created = created;;
        return this;
    }
    @Override
    public RedirectRule setCreatedBy(String createdBy)
    {
        this.createdBy = createdBy;;
        return this;
    }
    @Override
    public RedirectRule setModified(OffsetDateTime modified)
    {
        this.modified = modified;;
        return this;
    }
    @Override
    public RedirectRule setModifiedBy(String modifiedBy)
    {
        this.modifiedBy = modifiedBy;;
        return this;
    }
    @Override
    public RedirectRule setApproved(@Nullable OffsetDateTime approved)
    {
        this.approved = approved;;
        return this;
    }
    @Override
    public RedirectRule setApprovedBy(String approvedBy)
    {
        this.approvedBy = approvedBy;;
        return this;
    }
    @Override
    public RedirectRule setIsApproved(Boolean isApproved)
    {
        this.isApproved = isApproved;;
        return this;
    }
}

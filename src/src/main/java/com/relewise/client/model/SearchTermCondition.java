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
    defaultImpl = SearchTermCondition.class)
public class SearchTermCondition
{
    public String $type = "Relewise.Client.DataTypes.Search.Configuration.SearchRules.SearchTermCondition, Relewise.Client";
    public @Nullable SearchTermConditionConditionKind kind;
    public @Nullable String value;
    public @Nullable ArrayList<SearchTermCondition> andConditions;
    public @Nullable ArrayList<SearchTermCondition> orConditions;
    public @Nullable Integer minimumLength;
    public static SearchTermCondition create()
    {
        return new SearchTermCondition();
    }
    public SearchTermCondition()
    {
    }
    public @Nullable SearchTermConditionConditionKind getKind()
    {
        return this.kind;
    }
    public @Nullable String getValue()
    {
        return this.value;
    }
    public @Nullable ArrayList<SearchTermCondition> getAndConditions()
    {
        return this.andConditions;
    }
    public @Nullable ArrayList<SearchTermCondition> getOrConditions()
    {
        return this.orConditions;
    }
    public @Nullable Integer getMinimumLength()
    {
        return this.minimumLength;
    }
    public SearchTermCondition setKind(@Nullable SearchTermConditionConditionKind kind)
    {
        this.kind = kind;;
        return this;
    }
    public SearchTermCondition setValue(String value)
    {
        this.value = value;;
        return this;
    }
    public SearchTermCondition setAndConditions(SearchTermCondition... andConditions)
    {
        this.andConditions = new ArrayList<>(Arrays.asList(andConditions));;
        return this;
    }
    public SearchTermCondition addToAndConditions(SearchTermCondition andConditions)
    {
        if (this.andConditions == null)
        {
            this.andConditions = new ArrayList<>();
        }
        this.andConditions.add(andConditions);
        return this;
    }
    public SearchTermCondition setOrConditions(SearchTermCondition... orConditions)
    {
        this.orConditions = new ArrayList<>(Arrays.asList(orConditions));;
        return this;
    }
    public SearchTermCondition addToOrConditions(SearchTermCondition orConditions)
    {
        if (this.orConditions == null)
        {
            this.orConditions = new ArrayList<>();
        }
        this.orConditions.add(orConditions);
        return this;
    }
    public SearchTermCondition setMinimumLength(@Nullable Integer minimumLength)
    {
        this.minimumLength = minimumLength;;
        return this;
    }
}

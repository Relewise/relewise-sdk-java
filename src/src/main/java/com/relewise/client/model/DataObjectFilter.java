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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class DataObjectFilter
{
    public @Nullable ArrayList<ObjectValueCondition> conditions;
    public @Nullable Integer skip;
    public @Nullable Integer take;
    public static DataObjectFilter create(ObjectValueCondition... conditions)
    {
        return new DataObjectFilter(conditions);
    }
    public DataObjectFilter(ObjectValueCondition... conditions)
    {
        this.conditions = new ArrayList<>(Arrays.asList(conditions));
    }
    public DataObjectFilter()
    {
    }
    public @Nullable ArrayList<ObjectValueCondition> getConditions()
    {
        return this.conditions;
    }
    public @Nullable Integer getSkip()
    {
        return this.skip;
    }
    public @Nullable Integer getTake()
    {
        return this.take;
    }
    public DataObjectFilter setConditions(ObjectValueCondition... conditions)
    {
        this.conditions = new ArrayList<>(Arrays.asList(conditions));;
        return this;
    }
    public DataObjectFilter addToConditions(ObjectValueCondition conditions)
    {
        if (this.conditions == null)
        {
            this.conditions = new ArrayList<>();
        }
        this.conditions.add(conditions);
        return this;
    }
    public DataObjectFilter setSkip(@Nullable Integer skip)
    {
        this.skip = skip;
        return this;
    }
    public DataObjectFilter setTake(@Nullable Integer take)
    {
        this.take = take;
        return this;
    }
}

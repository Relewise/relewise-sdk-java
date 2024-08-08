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
    defaultImpl = RedirectResult.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RedirectResult
{
    public String $type = "Relewise.Client.DataTypes.RedirectResult, Relewise.Client";
    public UUID id;
    public SearchTermCondition condition;
    public @Nullable String destination;
    public @Nullable HashMap<String, String> data;
    public static RedirectResult create(UUID id, SearchTermCondition condition, @Nullable String destination, HashMap<String, String> data)
    {
        return new RedirectResult(id, condition, destination, data);
    }
    public RedirectResult(UUID id, SearchTermCondition condition, @Nullable String destination, HashMap<String, String> data)
    {
        this.id = id;
        this.condition = condition;
        this.destination = destination;
        this.data = data;
    }
    public RedirectResult()
    {
    }
    public UUID getId()
    {
        return this.id;
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
    public RedirectResult setId(UUID id)
    {
        this.id = id;;
        return this;
    }
    public RedirectResult setCondition(SearchTermCondition condition)
    {
        this.condition = condition;;
        return this;
    }
    public RedirectResult setDestination(String destination)
    {
        this.destination = destination;;
        return this;
    }
    public RedirectResult addToData(String key, String value)
    {
        if (this.data == null)
        {
            this.data = new HashMap<>();
        }
        this.data.put(key, value);
        return this;
    }
    public RedirectResult setData(HashMap<String, String> data)
    {
        this.data = data;;
        return this;
    }
}

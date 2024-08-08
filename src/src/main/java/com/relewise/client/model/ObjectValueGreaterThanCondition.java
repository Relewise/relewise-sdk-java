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
    defaultImpl = ObjectValueGreaterThanCondition.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ObjectValueGreaterThanCondition extends ObjectValueCondition
{
    public String $type = "Relewise.Client.Requests.Filters.DataObjects.Conditions.ObjectValueGreaterThanCondition, Relewise.Client";
    public Double value;
    public static ObjectValueGreaterThanCondition create(String key, Double value)
    {
        return new ObjectValueGreaterThanCondition(key, value);
    }
    public ObjectValueGreaterThanCondition(String key, Double value)
    {
        this.key = key;
        this.value = value;
        this.negated = false;
    }
    public static ObjectValueGreaterThanCondition create(String key, Double value, Boolean negated)
    {
        return new ObjectValueGreaterThanCondition(key, value, negated);
    }
    public ObjectValueGreaterThanCondition(String key, Double value, Boolean negated)
    {
        this.key = key;
        this.value = value;
        this.negated = negated;
    }
    public ObjectValueGreaterThanCondition()
    {
        this.negated = false;
    }
    public Double getValue()
    {
        return this.value;
    }
    public ObjectValueGreaterThanCondition setValue(Double value)
    {
        this.value = value;;
        return this;
    }
    @Override
    public ObjectValueGreaterThanCondition setNegated(Boolean negated)
    {
        this.negated = negated;;
        return this;
    }
    @Override
    public ObjectValueGreaterThanCondition setKey(String key)
    {
        this.key = key;;
        return this;
    }
    @Override
    public ObjectValueGreaterThanCondition setObjectPath(String... objectPath)
    {
        this.objectPath = objectPath;;
        return this;
    }
    public ObjectValueGreaterThanCondition addToObjectPath(String objectPath)
    {
        if (this.objectPath == null)
        {
            this.objectPath = new String[] { objectPath };
        }
        else
        {
            ArrayList<String> existingList = new ArrayList<>(Arrays.asList(this.objectPath));
            existingList.add(objectPath);
            this.objectPath = existingList.toArray(new String[0]);
        }
        return this;
    }
}

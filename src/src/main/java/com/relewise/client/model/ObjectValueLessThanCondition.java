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
    defaultImpl = ObjectValueLessThanCondition.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ObjectValueLessThanCondition extends ObjectValueCondition
{
    public String $type = "Relewise.Client.Requests.Filters.DataObjects.Conditions.ObjectValueLessThanCondition, Relewise.Client";
    public Double value;
    public static ObjectValueLessThanCondition create(String key, Double value)
    {
        return new ObjectValueLessThanCondition(key, value);
    }
    public ObjectValueLessThanCondition(String key, Double value)
    {
        this.key = key;
        this.value = value;
        this.negated = false;
    }
    public static ObjectValueLessThanCondition create(String key, Double value, Boolean negated)
    {
        return new ObjectValueLessThanCondition(key, value, negated);
    }
    public ObjectValueLessThanCondition(String key, Double value, Boolean negated)
    {
        this.key = key;
        this.value = value;
        this.negated = negated;
    }
    public ObjectValueLessThanCondition()
    {
        this.negated = false;
    }
    public Double getValue()
    {
        return this.value;
    }
    public ObjectValueLessThanCondition setValue(Double value)
    {
        this.value = value;;
        return this;
    }
    @Override
    public ObjectValueLessThanCondition setNegated(Boolean negated)
    {
        this.negated = negated;;
        return this;
    }
    @Override
    public ObjectValueLessThanCondition setKey(String key)
    {
        this.key = key;;
        return this;
    }
    @Override
    public ObjectValueLessThanCondition setObjectPath(String... objectPath)
    {
        this.objectPath = objectPath;;
        return this;
    }
    public ObjectValueLessThanCondition addToObjectPath(String objectPath)
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

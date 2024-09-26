package com.relewise.client.model;

import com.fasterxml.jackson.annotation.*;
import javax.annotation.Nullable;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.LocalDateTime;
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
    defaultImpl = ObjectValueIsSubsetOfCondition.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ObjectValueIsSubsetOfCondition extends ObjectValueCondition
{
    public String $type = "Relewise.Client.Requests.Filters.DataObjects.Conditions.ObjectValueIsSubsetOfCondition, Relewise.Client";
    public DataValue value;
    public static ObjectValueIsSubsetOfCondition create(String key, String[] objectPath, DataValue value)
    {
        return new ObjectValueIsSubsetOfCondition(key, objectPath, value);
    }
    public ObjectValueIsSubsetOfCondition(String key, String[] objectPath, DataValue value)
    {
        this.key = key;
        this.objectPath = objectPath;
        this.value = value;
        this.negated = false;
    }
    public static ObjectValueIsSubsetOfCondition create(String key, String[] objectPath, DataValue value, Boolean negated)
    {
        return new ObjectValueIsSubsetOfCondition(key, objectPath, value, negated);
    }
    public ObjectValueIsSubsetOfCondition(String key, String[] objectPath, DataValue value, Boolean negated)
    {
        this.key = key;
        this.objectPath = objectPath;
        this.value = value;
        this.negated = negated;
    }
    public static ObjectValueIsSubsetOfCondition create(String key, DataValue value)
    {
        return new ObjectValueIsSubsetOfCondition(key, value);
    }
    public ObjectValueIsSubsetOfCondition(String key, DataValue value)
    {
        this.key = key;
        this.value = value;
        this.negated = false;
    }
    public static ObjectValueIsSubsetOfCondition create(String key, DataValue value, Boolean negated)
    {
        return new ObjectValueIsSubsetOfCondition(key, value, negated);
    }
    public ObjectValueIsSubsetOfCondition(String key, DataValue value, Boolean negated)
    {
        this.key = key;
        this.value = value;
        this.negated = negated;
    }
    public ObjectValueIsSubsetOfCondition()
    {
        this.negated = false;
    }
    public DataValue getValue()
    {
        return this.value;
    }
    public ObjectValueIsSubsetOfCondition setValue(DataValue value)
    {
        this.value = value;
        return this;
    }
    @Override
    public ObjectValueIsSubsetOfCondition setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    @Override
    public ObjectValueIsSubsetOfCondition setKey(String key)
    {
        this.key = key;
        return this;
    }
    @Override
    public ObjectValueIsSubsetOfCondition setObjectPath(String... objectPath)
    {
        this.objectPath = objectPath;
        return this;
    }
    public ObjectValueIsSubsetOfCondition addToObjectPath(String objectPath)
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

package com.relewise.client.model;

import com.fasterxml.jackson.annotation.*;
import javax.annotation.Nullable;
import java.io.IOException;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Arrays;
import java.util.UUID;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = ObjectValueEqualsCondition.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ObjectValueEqualsCondition extends ObjectValueCondition
{
    public String $type = "Relewise.Client.Requests.Filters.DataObjects.Conditions.ObjectValueEqualsCondition, Relewise.Client";
    public DataValue value;
    public static ObjectValueEqualsCondition create(String key, String[] objectPath, DataValue value)
    {
        return new ObjectValueEqualsCondition(key, objectPath, value);
    }
    public ObjectValueEqualsCondition(String key, String[] objectPath, DataValue value)
    {
        this.key = key;
        this.objectPath = objectPath;
        this.value = value;
        this.negated = false;
    }
    public static ObjectValueEqualsCondition create(String key, String[] objectPath, DataValue value, Boolean negated)
    {
        return new ObjectValueEqualsCondition(key, objectPath, value, negated);
    }
    public ObjectValueEqualsCondition(String key, String[] objectPath, DataValue value, Boolean negated)
    {
        this.key = key;
        this.objectPath = objectPath;
        this.value = value;
        this.negated = negated;
    }
    public static ObjectValueEqualsCondition create(String key, DataValue value)
    {
        return new ObjectValueEqualsCondition(key, value);
    }
    public ObjectValueEqualsCondition(String key, DataValue value)
    {
        this.key = key;
        this.value = value;
        this.negated = false;
    }
    public static ObjectValueEqualsCondition create(String key, DataValue value, Boolean negated)
    {
        return new ObjectValueEqualsCondition(key, value, negated);
    }
    public ObjectValueEqualsCondition(String key, DataValue value, Boolean negated)
    {
        this.key = key;
        this.value = value;
        this.negated = negated;
    }
    public ObjectValueEqualsCondition()
    {
        this.negated = false;
    }
    public DataValue getValue()
    {
        return this.value;
    }
    public ObjectValueEqualsCondition setValue(DataValue value)
    {
        this.value = value;
        return this;
    }
    @Override
    public ObjectValueEqualsCondition setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    @Override
    public ObjectValueEqualsCondition setKey(String key)
    {
        this.key = key;
        return this;
    }
    @Override
    public ObjectValueEqualsCondition setObjectPath(String... objectPath)
    {
        this.objectPath = objectPath;
        return this;
    }
    public ObjectValueEqualsCondition addToObjectPath(String objectPath)
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

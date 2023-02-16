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
    defaultImpl = ObjectValueContainsCondition.class)
public class ObjectValueContainsCondition extends ObjectValueCondition
{
    public String $type = "Relewise.Client.Requests.Filters.DataObjects.Conditions.ObjectValueContainsCondition, Relewise.Client";
    public DataValue value;
    public ObjectValueContainsConditionCompareMode mode;
    public static ObjectValueContainsCondition create(String key, DataValue value)
    {
        return new ObjectValueContainsCondition(key, value);
    }
    public ObjectValueContainsCondition(String key, DataValue value)
    {
        this.key = key;
        this.value = value;
        this.mode = ObjectValueContainsConditionCompareMode.All;
        this.negated = false;
    }
    public static ObjectValueContainsCondition create(String key, DataValue value, ObjectValueContainsConditionCompareMode mode, Boolean negated)
    {
        return new ObjectValueContainsCondition(key, value, mode, negated);
    }
    public ObjectValueContainsCondition(String key, DataValue value, ObjectValueContainsConditionCompareMode mode, Boolean negated)
    {
        this.key = key;
        this.value = value;
        this.mode = mode;
        this.negated = negated;
    }
    public ObjectValueContainsCondition()
    {
        this.mode = ObjectValueContainsConditionCompareMode.All;
        this.negated = false;
    }
    public DataValue getValue()
    {
        return this.value;
    }
    public ObjectValueContainsConditionCompareMode getMode()
    {
        return this.mode;
    }
    public ObjectValueContainsCondition setValue(DataValue value)
    {
        this.value = value;;
        return this;
    }
    public ObjectValueContainsCondition setMode(ObjectValueContainsConditionCompareMode mode)
    {
        this.mode = mode;;
        return this;
    }
    @Override
    public ObjectValueContainsCondition setNegated(Boolean negated)
    {
        this.negated = negated;;
        return this;
    }
    @Override
    public ObjectValueContainsCondition setKey(String key)
    {
        this.key = key;;
        return this;
    }
    @Override
    public ObjectValueContainsCondition setObjectPath(String... objectPath)
    {
        this.objectPath = objectPath;;
        return this;
    }
    public ObjectValueContainsCondition addToObjectPath(String objectPath)
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

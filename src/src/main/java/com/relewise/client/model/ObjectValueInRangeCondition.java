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
import java.util.Set;
import java.util.HashSet;
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = ObjectValueInRangeCondition.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ObjectValueInRangeCondition extends ObjectValueCondition
{
    public String $type = "Relewise.Client.Requests.Filters.DataObjects.Conditions.ObjectValueInRangeCondition, Relewise.Client";
    public DoubleRange range;
    public static ObjectValueInRangeCondition create(String key, String[] objectPath, DoubleRange range)
    {
        return new ObjectValueInRangeCondition(key, objectPath, range);
    }
    public ObjectValueInRangeCondition(String key, String[] objectPath, DoubleRange range)
    {
        this.key = key;
        this.objectPath = objectPath;
        this.range = range;
        this.negated = false;
    }
    public static ObjectValueInRangeCondition create(String key, String[] objectPath, DoubleRange range, Boolean negated)
    {
        return new ObjectValueInRangeCondition(key, objectPath, range, negated);
    }
    public ObjectValueInRangeCondition(String key, String[] objectPath, DoubleRange range, Boolean negated)
    {
        this.key = key;
        this.objectPath = objectPath;
        this.range = range;
        this.negated = negated;
    }
    public static ObjectValueInRangeCondition create(String key, DoubleRange range)
    {
        return new ObjectValueInRangeCondition(key, range);
    }
    public ObjectValueInRangeCondition(String key, DoubleRange range)
    {
        this.key = key;
        this.range = range;
        this.negated = false;
    }
    public static ObjectValueInRangeCondition create(String key, DoubleRange range, Boolean negated)
    {
        return new ObjectValueInRangeCondition(key, range, negated);
    }
    public ObjectValueInRangeCondition(String key, DoubleRange range, Boolean negated)
    {
        this.key = key;
        this.range = range;
        this.negated = negated;
    }
    public ObjectValueInRangeCondition()
    {
        this.negated = false;
    }
    public DoubleRange getRange()
    {
        return this.range;
    }
    public ObjectValueInRangeCondition setRange(DoubleRange range)
    {
        this.range = range;
        return this;
    }
    @Override
    public ObjectValueInRangeCondition setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    @Override
    public ObjectValueInRangeCondition setKey(String key)
    {
        this.key = key;
        return this;
    }
    @Override
    public ObjectValueInRangeCondition setObjectPath(String... objectPath)
    {
        this.objectPath = objectPath;
        return this;
    }
    public ObjectValueInRangeCondition addToObjectPath(String objectPath)
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

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
    defaultImpl = ObjectValueMaxByCondition.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ObjectValueMaxByCondition extends ObjectValueCondition
{
    public String $type = "Relewise.Client.Requests.Filters.DataObjects.Conditions.ObjectValueMaxByCondition, Relewise.Client";
    public static ObjectValueMaxByCondition create(String key, String... objectPath)
    {
        return new ObjectValueMaxByCondition(key, objectPath);
    }
    public ObjectValueMaxByCondition(String key, String... objectPath)
    {
        this.key = key;
        this.objectPath = objectPath;
        this.negated = false;
    }
    public static ObjectValueMaxByCondition create(String key, String[] objectPath, Boolean negated)
    {
        return new ObjectValueMaxByCondition(key, objectPath, negated);
    }
    public ObjectValueMaxByCondition(String key, String[] objectPath, Boolean negated)
    {
        this.key = key;
        this.objectPath = objectPath;
        this.negated = negated;
    }
    public static ObjectValueMaxByCondition create(String key)
    {
        return new ObjectValueMaxByCondition(key);
    }
    public ObjectValueMaxByCondition(String key)
    {
        this.key = key;
        this.negated = false;
    }
    public static ObjectValueMaxByCondition create(String key, Boolean negated)
    {
        return new ObjectValueMaxByCondition(key, negated);
    }
    public ObjectValueMaxByCondition(String key, Boolean negated)
    {
        this.key = key;
        this.negated = negated;
    }
    public ObjectValueMaxByCondition()
    {
        this.negated = false;
    }
    @Override
    public ObjectValueMaxByCondition setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    @Override
    public ObjectValueMaxByCondition setKey(String key)
    {
        this.key = key;
        return this;
    }
    @Override
    public ObjectValueMaxByCondition setObjectPath(String... objectPath)
    {
        this.objectPath = objectPath;
        return this;
    }
    public ObjectValueMaxByCondition addToObjectPath(String objectPath)
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

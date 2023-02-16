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
    defaultImpl = ObjectValueMinByCondition.class)
public class ObjectValueMinByCondition extends ObjectValueCondition
{
    public String $type = "Relewise.Client.Requests.Filters.DataObjects.Conditions.ObjectValueMinByCondition, Relewise.Client";
    public static ObjectValueMinByCondition create(String key)
    {
        return new ObjectValueMinByCondition(key);
    }
    public ObjectValueMinByCondition(String key)
    {
        this.key = key;
        this.negated = false;
    }
    public static ObjectValueMinByCondition create(String key, Boolean negated)
    {
        return new ObjectValueMinByCondition(key, negated);
    }
    public ObjectValueMinByCondition(String key, Boolean negated)
    {
        this.key = key;
        this.negated = negated;
    }
    public ObjectValueMinByCondition()
    {
        this.negated = false;
    }
    @Override
    public ObjectValueMinByCondition setNegated(Boolean negated)
    {
        this.negated = negated;;
        return this;
    }
    @Override
    public ObjectValueMinByCondition setKey(String key)
    {
        this.key = key;;
        return this;
    }
    @Override
    public ObjectValueMinByCondition setObjectPath(String... objectPath)
    {
        this.objectPath = objectPath;;
        return this;
    }
    public ObjectValueMinByCondition addToObjectPath(String objectPath)
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

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
    property = "$type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ObjectValueEqualsCondition.class, name = "Relewise.Client.Requests.Filters.DataObjects.Conditions.ObjectValueEqualsCondition, Relewise.Client"),
    @JsonSubTypes.Type(value = ObjectValueContainsCondition.class, name = "Relewise.Client.Requests.Filters.DataObjects.Conditions.ObjectValueContainsCondition, Relewise.Client"),
    @JsonSubTypes.Type(value = ObjectValueGreaterThanCondition.class, name = "Relewise.Client.Requests.Filters.DataObjects.Conditions.ObjectValueGreaterThanCondition, Relewise.Client"),
    @JsonSubTypes.Type(value = ObjectValueLessThanCondition.class, name = "Relewise.Client.Requests.Filters.DataObjects.Conditions.ObjectValueLessThanCondition, Relewise.Client"),
    @JsonSubTypes.Type(value = ObjectValueInRangeCondition.class, name = "Relewise.Client.Requests.Filters.DataObjects.Conditions.ObjectValueInRangeCondition, Relewise.Client"),
    @JsonSubTypes.Type(value = ObjectValueMinByCondition.class, name = "Relewise.Client.Requests.Filters.DataObjects.Conditions.ObjectValueMinByCondition, Relewise.Client"),
    @JsonSubTypes.Type(value = ObjectValueMaxByCondition.class, name = "Relewise.Client.Requests.Filters.DataObjects.Conditions.ObjectValueMaxByCondition, Relewise.Client"),
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class ObjectValueCondition
{
    public String $type = "";
    public Boolean negated;
    public String key;
    public @Nullable String[] objectPath;
    public Boolean getNegated()
    {
        return this.negated;
    }
    public String getKey()
    {
        return this.key;
    }
    public @Nullable String[] getObjectPath()
    {
        return this.objectPath;
    }
    public ObjectValueCondition setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    public ObjectValueCondition setKey(String key)
    {
        this.key = key;
        return this;
    }
    public ObjectValueCondition setObjectPath(String... objectPath)
    {
        this.objectPath = objectPath;
        return this;
    }
    public ObjectValueCondition addToObjectPath(String objectPath)
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

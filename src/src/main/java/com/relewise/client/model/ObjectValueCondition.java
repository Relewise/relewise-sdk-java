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
    property = "$type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ObjectValueEqualsCondition.class, name = "Relewise.Client.Requests.Filters.DataObjects.Conditions.ObjectValueEqualsCondition, Relewise.Client"),
    @JsonSubTypes.Type(value = ObjectValueContainsCondition.class, name = "Relewise.Client.Requests.Filters.DataObjects.Conditions.ObjectValueContainsCondition, Relewise.Client"),
    @JsonSubTypes.Type(value = ObjectValueGreaterThanCondition.class, name = "Relewise.Client.Requests.Filters.DataObjects.Conditions.ObjectValueGreaterThanCondition, Relewise.Client"),
    @JsonSubTypes.Type(value = ObjectValueLessThanCondition.class, name = "Relewise.Client.Requests.Filters.DataObjects.Conditions.ObjectValueLessThanCondition, Relewise.Client"),
    @JsonSubTypes.Type(value = ObjectValueInRangeCondition.class, name = "Relewise.Client.Requests.Filters.DataObjects.Conditions.ObjectValueInRangeCondition, Relewise.Client"),
    @JsonSubTypes.Type(value = ObjectValueMinByCondition.class, name = "Relewise.Client.Requests.Filters.DataObjects.Conditions.ObjectValueMinByCondition, Relewise.Client"),
    @JsonSubTypes.Type(value = ObjectValueMaxByCondition.class, name = "Relewise.Client.Requests.Filters.DataObjects.Conditions.ObjectValueMaxByCondition, Relewise.Client"),
    @JsonSubTypes.Type(value = ObjectValueRelativeDateTimeCondition.class, name = "Relewise.Client.Requests.Filters.DataObjects.Conditions.ObjectValueRelativeDateTimeCondition, Relewise.Client"),
    @JsonSubTypes.Type(value = ObjectValueIsSubsetOfCondition.class, name = "Relewise.Client.Requests.Filters.DataObjects.Conditions.ObjectValueIsSubsetOfCondition, Relewise.Client"),
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class ObjectValueCondition
{
    public String $type = "";
    /** Whether the condition should be negated / inverted */
    public Boolean negated;
    /** The key of the object that the condition will compare against. */
    public String key;
    /** An optional path to some nested object defined under the selected <code>Key</code>. */
    public @Nullable String[] objectPath;
    /** Whether the condition should be negated / inverted */
    public Boolean getNegated()
    {
        return this.negated;
    }
    /** The key of the object that the condition will compare against. */
    public String getKey()
    {
        return this.key;
    }
    /** An optional path to some nested object defined under the selected <code>Key</code>. */
    public @Nullable String[] getObjectPath()
    {
        return this.objectPath;
    }
    /** Whether the condition should be negated / inverted */
    public ObjectValueCondition setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    /** The key of the object that the condition will compare against. */
    public ObjectValueCondition setKey(String key)
    {
        this.key = key;
        return this;
    }
    /** An optional path to some nested object defined under the selected <code>Key</code>. */
    public ObjectValueCondition setObjectPath(String... objectPath)
    {
        this.objectPath = objectPath;
        return this;
    }
    /** An optional path to some nested object defined under the selected <code>Key</code>. */
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

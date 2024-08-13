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
    
/** a <code>ObjectValueCondition</code> that can check if an object value interpreted as a timestamp is before or after the current time. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = ObjectValueRelativeDateTimeCondition.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ObjectValueRelativeDateTimeCondition extends ObjectValueCondition
{
    public String $type = "Relewise.Client.Requests.Filters.DataObjects.Conditions.ObjectValueRelativeDateTimeCondition, Relewise.Client";
    /** Defines whether the compared value should be before or after the current time for the condition to evaluate true. */
    public RelativeTimeComparison comparison;
    /** Defines the time unit that the compared value is defined in. */
    public TimeUnit unit;
    /** Defines an offset that is added to the current time when making the specified <code>Comparison</code>. This is specified in the unit defined by the <code>Unit</code> property. */
    public Long currentTimeOffset;
    public static ObjectValueRelativeDateTimeCondition create(String key, String[] objectPath, RelativeTimeComparison comparison, TimeUnit unit)
    {
        return new ObjectValueRelativeDateTimeCondition(key, objectPath, comparison, unit);
    }
    public ObjectValueRelativeDateTimeCondition(String key, String[] objectPath, RelativeTimeComparison comparison, TimeUnit unit)
    {
        this.key = key;
        this.objectPath = objectPath;
        this.comparison = comparison;
        this.unit = unit;
        this.currentTimeOffset = 0L;
        this.negated = false;
    }
    /**
     * Creates a <code>ObjectValueCondition</code> that can check if an object value interpreted as a timestamp is before or after the current time.
     * @param key The key of the object that the condition will compare against.
     * @param objectPath An optional path to some nested object defined under the selected Key.
     * @param comparison Defines whether the compared value should be before or after the current time for the condition to evaluate true.
     * @param unit Defines the time unit that the compared value is defined in.
     * @param currentTimeOffset Defines an offset that is added to the current time when making the specified Comparison. This is specified in the unit defined by the Unit property.
     * @param negated Whether the condition should be negated / inverted
     */
    public static ObjectValueRelativeDateTimeCondition create(String key, String[] objectPath, RelativeTimeComparison comparison, TimeUnit unit, Long currentTimeOffset, Boolean negated)
    {
        return new ObjectValueRelativeDateTimeCondition(key, objectPath, comparison, unit, currentTimeOffset, negated);
    }
    /**
     * Creates a <code>ObjectValueCondition</code> that can check if an object value interpreted as a timestamp is before or after the current time.
     * @param key The key of the object that the condition will compare against.
     * @param objectPath An optional path to some nested object defined under the selected Key.
     * @param comparison Defines whether the compared value should be before or after the current time for the condition to evaluate true.
     * @param unit Defines the time unit that the compared value is defined in.
     * @param currentTimeOffset Defines an offset that is added to the current time when making the specified Comparison. This is specified in the unit defined by the Unit property.
     * @param negated Whether the condition should be negated / inverted
     */
    public ObjectValueRelativeDateTimeCondition(String key, String[] objectPath, RelativeTimeComparison comparison, TimeUnit unit, Long currentTimeOffset, Boolean negated)
    {
        this.key = key;
        this.objectPath = objectPath;
        this.comparison = comparison;
        this.unit = unit;
        this.currentTimeOffset = currentTimeOffset;
        this.negated = negated;
    }
    public static ObjectValueRelativeDateTimeCondition create(String key, RelativeTimeComparison comparison, TimeUnit unit)
    {
        return new ObjectValueRelativeDateTimeCondition(key, comparison, unit);
    }
    public ObjectValueRelativeDateTimeCondition(String key, RelativeTimeComparison comparison, TimeUnit unit)
    {
        this.key = key;
        this.comparison = comparison;
        this.unit = unit;
        this.currentTimeOffset = 0L;
        this.negated = false;
    }
    /**
     * Creates a <code>ObjectValueCondition</code> that can check if an object value interpreted as a timestamp is before or after the current time.
     * @param key The key of the object that the condition will compare against.
     * @param comparison Defines whether the compared value should be before or after the current time for the condition to evaluate true.
     * @param unit Defines the time unit that the compared value is defined in.
     * @param currentTimeOffset Defines an offset that is added to the current time when making the specified Comparison. This is specified in the unit defined by the Unit property.
     * @param negated Whether the condition should be negated / inverted
     */
    public static ObjectValueRelativeDateTimeCondition create(String key, RelativeTimeComparison comparison, TimeUnit unit, Long currentTimeOffset, Boolean negated)
    {
        return new ObjectValueRelativeDateTimeCondition(key, comparison, unit, currentTimeOffset, negated);
    }
    /**
     * Creates a <code>ObjectValueCondition</code> that can check if an object value interpreted as a timestamp is before or after the current time.
     * @param key The key of the object that the condition will compare against.
     * @param comparison Defines whether the compared value should be before or after the current time for the condition to evaluate true.
     * @param unit Defines the time unit that the compared value is defined in.
     * @param currentTimeOffset Defines an offset that is added to the current time when making the specified Comparison. This is specified in the unit defined by the Unit property.
     * @param negated Whether the condition should be negated / inverted
     */
    public ObjectValueRelativeDateTimeCondition(String key, RelativeTimeComparison comparison, TimeUnit unit, Long currentTimeOffset, Boolean negated)
    {
        this.key = key;
        this.comparison = comparison;
        this.unit = unit;
        this.currentTimeOffset = currentTimeOffset;
        this.negated = negated;
    }
    public ObjectValueRelativeDateTimeCondition()
    {
        this.currentTimeOffset = 0L;
        this.negated = false;
    }
    /** Defines whether the compared value should be before or after the current time for the condition to evaluate true. */
    public RelativeTimeComparison getComparison()
    {
        return this.comparison;
    }
    /** Defines the time unit that the compared value is defined in. */
    public TimeUnit getUnit()
    {
        return this.unit;
    }
    /** Defines an offset that is added to the current time when making the specified <code>Comparison</code>. This is specified in the unit defined by the <code>Unit</code> property. */
    public Long getCurrentTimeOffset()
    {
        return this.currentTimeOffset;
    }
    /** Defines whether the compared value should be before or after the current time for the condition to evaluate true. */
    public ObjectValueRelativeDateTimeCondition setComparison(RelativeTimeComparison comparison)
    {
        this.comparison = comparison;
        return this;
    }
    /** Defines the time unit that the compared value is defined in. */
    public ObjectValueRelativeDateTimeCondition setUnit(TimeUnit unit)
    {
        this.unit = unit;
        return this;
    }
    /** Defines an offset that is added to the current time when making the specified <code>Comparison</code>. This is specified in the unit defined by the <code>Unit</code> property. */
    public ObjectValueRelativeDateTimeCondition setCurrentTimeOffset(Long currentTimeOffset)
    {
        this.currentTimeOffset = currentTimeOffset;
        return this;
    }
    @Override
    public ObjectValueRelativeDateTimeCondition setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    @Override
    public ObjectValueRelativeDateTimeCondition setKey(String key)
    {
        this.key = key;
        return this;
    }
    @Override
    public ObjectValueRelativeDateTimeCondition setObjectPath(String... objectPath)
    {
        this.objectPath = objectPath;
        return this;
    }
    public ObjectValueRelativeDateTimeCondition addToObjectPath(String objectPath)
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

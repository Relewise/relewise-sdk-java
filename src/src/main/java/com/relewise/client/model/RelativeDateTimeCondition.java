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
    
/** a <code>ValueCondition</code> that can check if an object value interpreted as a timestamp is before or after the current time. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = RelativeDateTimeCondition.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RelativeDateTimeCondition extends ValueCondition
{
    public String $type = "Relewise.Client.Requests.Conditions.RelativeDateTimeCondition, Relewise.Client";
    /** Defines whether the compared value should be before or after the current time for the condition to evaluate true. */
    public RelativeTimeComparison comparison;
    /** Defines the time unit that the compared value is defined in. */
    public TimeUnit unit;
    /** Defines an offset that is added to the current time when making the specified <code>Comparison</code>. This is specified in the unit defined by the <code>Unit</code> property. */
    public Long currentTimeOffset;
    public static RelativeDateTimeCondition create(RelativeTimeComparison comparison, TimeUnit unit)
    {
        return new RelativeDateTimeCondition(comparison, unit);
    }
    public RelativeDateTimeCondition(RelativeTimeComparison comparison, TimeUnit unit)
    {
        this.comparison = comparison;
        this.unit = unit;
        this.currentTimeOffset = 0L;
        this.negated = false;
    }
    /**
     * Creates a <code>ValueCondition</code> that can check if an object value interpreted as a timestamp is before or after the current time.
     * @param comparison Defines whether the compared value should be before or after the current time for the condition to evaluate true.
     * @param unit Defines the time unit that the compared value is defined in.
     * @param currentTimeOffset Defines an offset that is added to the current time when making the specified Comparison. This is specified in the unit defined by the Unit property.
     * @param negated Whether the condition should be negated / inverted
     */
    public static RelativeDateTimeCondition create(RelativeTimeComparison comparison, TimeUnit unit, Long currentTimeOffset, Boolean negated)
    {
        return new RelativeDateTimeCondition(comparison, unit, currentTimeOffset, negated);
    }
    /**
     * Creates a <code>ValueCondition</code> that can check if an object value interpreted as a timestamp is before or after the current time.
     * @param comparison Defines whether the compared value should be before or after the current time for the condition to evaluate true.
     * @param unit Defines the time unit that the compared value is defined in.
     * @param currentTimeOffset Defines an offset that is added to the current time when making the specified Comparison. This is specified in the unit defined by the Unit property.
     * @param negated Whether the condition should be negated / inverted
     */
    public RelativeDateTimeCondition(RelativeTimeComparison comparison, TimeUnit unit, Long currentTimeOffset, Boolean negated)
    {
        this.comparison = comparison;
        this.unit = unit;
        this.currentTimeOffset = currentTimeOffset;
        this.negated = negated;
    }
    public RelativeDateTimeCondition()
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
    public RelativeDateTimeCondition setComparison(RelativeTimeComparison comparison)
    {
        this.comparison = comparison;
        return this;
    }
    /** Defines the time unit that the compared value is defined in. */
    public RelativeDateTimeCondition setUnit(TimeUnit unit)
    {
        this.unit = unit;
        return this;
    }
    /** Defines an offset that is added to the current time when making the specified <code>Comparison</code>. This is specified in the unit defined by the <code>Unit</code> property. */
    public RelativeDateTimeCondition setCurrentTimeOffset(Long currentTimeOffset)
    {
        this.currentTimeOffset = currentTimeOffset;
        return this;
    }
    @Override
    public RelativeDateTimeCondition setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
}

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
    defaultImpl = ContainsCondition.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContainsCondition extends ValueCondition
{
    public String $type = "Relewise.Client.Requests.Conditions.ContainsCondition, Relewise.Client";
    public @Nullable DataValue value;
    public ContainsConditionCollectionArgumentEvaluationMode valueCollectionEvaluationMode;
    public @Nullable DataObjectFilter objectFilter;
    public static ContainsCondition create(DataValue value, ContainsConditionCollectionArgumentEvaluationMode valueCollectionEvaluationMode)
    {
        return new ContainsCondition(value, valueCollectionEvaluationMode);
    }
    public ContainsCondition(DataValue value, ContainsConditionCollectionArgumentEvaluationMode valueCollectionEvaluationMode)
    {
        this.value = value;
        this.valueCollectionEvaluationMode = valueCollectionEvaluationMode;
        this.negated = false;
    }
    public static ContainsCondition create(DataValue value, ContainsConditionCollectionArgumentEvaluationMode valueCollectionEvaluationMode, Boolean negated)
    {
        return new ContainsCondition(value, valueCollectionEvaluationMode, negated);
    }
    public ContainsCondition(DataValue value, ContainsConditionCollectionArgumentEvaluationMode valueCollectionEvaluationMode, Boolean negated)
    {
        this.value = value;
        this.valueCollectionEvaluationMode = valueCollectionEvaluationMode;
        this.negated = negated;
    }
    public static ContainsCondition create(DataValue value)
    {
        return new ContainsCondition(value);
    }
    public ContainsCondition(DataValue value)
    {
        this.value = value;
        this.negated = false;
    }
    public static ContainsCondition create(DataValue value, Boolean negated)
    {
        return new ContainsCondition(value, negated);
    }
    public ContainsCondition(DataValue value, Boolean negated)
    {
        this.value = value;
        this.negated = negated;
    }
    public ContainsCondition()
    {
        this.negated = false;
    }
    public @Nullable DataValue getValue()
    {
        return this.value;
    }
    public ContainsConditionCollectionArgumentEvaluationMode getValueCollectionEvaluationMode()
    {
        return this.valueCollectionEvaluationMode;
    }
    public @Nullable DataObjectFilter getObjectFilter()
    {
        return this.objectFilter;
    }
    public ContainsCondition setValue(@Nullable DataValue value)
    {
        this.value = value;
        return this;
    }
    public ContainsCondition setValueCollectionEvaluationMode(ContainsConditionCollectionArgumentEvaluationMode valueCollectionEvaluationMode)
    {
        this.valueCollectionEvaluationMode = valueCollectionEvaluationMode;
        return this;
    }
    public ContainsCondition setObjectFilter(@Nullable DataObjectFilter objectFilter)
    {
        this.objectFilter = objectFilter;
        return this;
    }
    @Override
    public ContainsCondition setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
}

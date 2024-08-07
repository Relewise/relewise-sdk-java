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
    property = "$type",
    defaultImpl = ContainsCondition.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContainsCondition extends ValueCondition
{
    public String $type = "Relewise.Client.Requests.Conditions.ContainsCondition, Relewise.Client";
    public @Nullable DataValue value;
    public ContainsConditionCollectionArgumentEvaluationMode valueCollectionEvaluationMode;
    public @Nullable DataObjectFilter objectFilter;
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
    public ContainsCondition setValue(DataValue value)
    {
        this.value = value;;
        return this;
    }
    public ContainsCondition setValueCollectionEvaluationMode(ContainsConditionCollectionArgumentEvaluationMode valueCollectionEvaluationMode)
    {
        this.valueCollectionEvaluationMode = valueCollectionEvaluationMode;;
        return this;
    }
    public ContainsCondition setObjectFilter(DataObjectFilter objectFilter)
    {
        this.objectFilter = objectFilter;;
        return this;
    }
    @Override
    public ContainsCondition setNegated(Boolean negated)
    {
        this.negated = negated;;
        return this;
    }
}

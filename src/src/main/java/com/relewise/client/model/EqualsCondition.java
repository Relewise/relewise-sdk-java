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
    defaultImpl = EqualsCondition.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class EqualsCondition extends ValueCondition
{
    public String $type = "Relewise.Client.Requests.Conditions.EqualsCondition, Relewise.Client";
    public DataValue value;
    public static EqualsCondition create(DataValue value)
    {
        return new EqualsCondition(value);
    }
    public EqualsCondition(DataValue value)
    {
        this.value = value;
        this.negated = false;
    }
    public static EqualsCondition create(DataValue value, Boolean negated)
    {
        return new EqualsCondition(value, negated);
    }
    public EqualsCondition(DataValue value, Boolean negated)
    {
        this.value = value;
        this.negated = negated;
    }
    public EqualsCondition()
    {
        this.negated = false;
    }
    public DataValue getValue()
    {
        return this.value;
    }
    public EqualsCondition setValue(DataValue value)
    {
        this.value = value;
        return this;
    }
    @Override
    public EqualsCondition setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
}

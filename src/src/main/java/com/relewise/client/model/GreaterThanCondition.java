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
    defaultImpl = GreaterThanCondition.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GreaterThanCondition extends ValueCondition
{
    public String $type = "Relewise.Client.Requests.Conditions.GreaterThanCondition, Relewise.Client";
    public Double value;
    public static GreaterThanCondition create(Double value)
    {
        return new GreaterThanCondition(value);
    }
    public GreaterThanCondition(Double value)
    {
        this.value = value;
        this.negated = false;
    }
    public static GreaterThanCondition create(Double value, Boolean negated)
    {
        return new GreaterThanCondition(value, negated);
    }
    public GreaterThanCondition(Double value, Boolean negated)
    {
        this.value = value;
        this.negated = negated;
    }
    public GreaterThanCondition()
    {
        this.negated = false;
    }
    public Double getValue()
    {
        return this.value;
    }
    public GreaterThanCondition setValue(Double value)
    {
        this.value = value;
        return this;
    }
    @Override
    public GreaterThanCondition setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
}

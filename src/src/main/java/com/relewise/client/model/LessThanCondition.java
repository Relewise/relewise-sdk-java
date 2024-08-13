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
    defaultImpl = LessThanCondition.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class LessThanCondition extends ValueCondition
{
    public String $type = "Relewise.Client.Requests.Conditions.LessThanCondition, Relewise.Client";
    public Double value;
    public static LessThanCondition create(Double value)
    {
        return new LessThanCondition(value);
    }
    public LessThanCondition(Double value)
    {
        this.value = value;
        this.negated = false;
    }
    public static LessThanCondition create(Double value, Boolean negated)
    {
        return new LessThanCondition(value, negated);
    }
    public LessThanCondition(Double value, Boolean negated)
    {
        this.value = value;
        this.negated = negated;
    }
    public LessThanCondition()
    {
        this.negated = false;
    }
    public Double getValue()
    {
        return this.value;
    }
    public LessThanCondition setValue(Double value)
    {
        this.value = value;
        return this;
    }
    @Override
    public LessThanCondition setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
}

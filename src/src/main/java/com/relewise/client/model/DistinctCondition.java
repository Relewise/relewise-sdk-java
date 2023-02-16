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
    defaultImpl = DistinctCondition.class)
public class DistinctCondition extends ValueCondition
{
    public String $type = "Relewise.Client.Requests.Conditions.DistinctCondition, Relewise.Client";
    public Integer numberOfOccurrencesAllowedWithTheSameValue;
    public static DistinctCondition create()
    {
        return new DistinctCondition();
    }
    public DistinctCondition()
    {
        this.numberOfOccurrencesAllowedWithTheSameValue = 1;
    }
    public static DistinctCondition create(Integer numberOfOccurrencesAllowedWithTheSameValue)
    {
        return new DistinctCondition(numberOfOccurrencesAllowedWithTheSameValue);
    }
    public DistinctCondition(Integer numberOfOccurrencesAllowedWithTheSameValue)
    {
        this.numberOfOccurrencesAllowedWithTheSameValue = numberOfOccurrencesAllowedWithTheSameValue;
    }
    public Integer getNumberOfOccurrencesAllowedWithTheSameValue()
    {
        return this.numberOfOccurrencesAllowedWithTheSameValue;
    }
    public DistinctCondition setNumberOfOccurrencesAllowedWithTheSameValue(Integer numberOfOccurrencesAllowedWithTheSameValue)
    {
        this.numberOfOccurrencesAllowedWithTheSameValue = numberOfOccurrencesAllowedWithTheSameValue;;
        return this;
    }
    @Override
    public DistinctCondition setNegated(Boolean negated)
    {
        this.negated = negated;;
        return this;
    }
}

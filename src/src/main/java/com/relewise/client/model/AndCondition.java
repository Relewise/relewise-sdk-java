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
    defaultImpl = AndCondition.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AndCondition extends UserCondition
{
    public String $type = "Relewise.Client.DataTypes.UserConditions.AndCondition, Relewise.Client";
    public UserConditionCollection conditions;
    public static AndCondition create(UserConditionCollection conditions, Boolean negated)
    {
        return new AndCondition(conditions, negated);
    }
    public AndCondition(UserConditionCollection conditions, Boolean negated)
    {
        this.conditions = conditions;
        this.negated = negated;
    }
    public AndCondition()
    {
    }
    public UserConditionCollection getConditions()
    {
        return this.conditions;
    }
    public AndCondition setConditions(UserConditionCollection conditions)
    {
        this.conditions = conditions;
        return this;
    }
    @Override
    public AndCondition setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
}

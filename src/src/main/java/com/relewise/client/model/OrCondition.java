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
    property = "$type",
    defaultImpl = OrCondition.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrCondition extends UserCondition
{
    public String $type = "Relewise.Client.DataTypes.UserConditions.OrCondition, Relewise.Client";
    public UserConditionCollection conditions;
    public static OrCondition create(UserConditionCollection conditions, Boolean negated)
    {
        return new OrCondition(conditions, negated);
    }
    public OrCondition(UserConditionCollection conditions, Boolean negated)
    {
        this.conditions = conditions;
        this.negated = negated;
    }
    public OrCondition()
    {
    }
    public UserConditionCollection getConditions()
    {
        return this.conditions;
    }
    public OrCondition setConditions(UserConditionCollection conditions)
    {
        this.conditions = conditions;
        return this;
    }
    @Override
    public OrCondition setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
}

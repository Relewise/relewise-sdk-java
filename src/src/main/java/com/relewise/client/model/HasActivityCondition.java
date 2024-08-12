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
    defaultImpl = HasActivityCondition.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class HasActivityCondition extends UserCondition
{
    public String $type = "Relewise.Client.DataTypes.UserConditions.HasActivityCondition, Relewise.Client";
    public Integer withinMinutes;
    public Integer forAtLeastSeconds;
    public static HasActivityCondition create(Integer withinMinutes, Integer forAtLeastSeconds, Boolean negated)
    {
        return new HasActivityCondition(withinMinutes, forAtLeastSeconds, negated);
    }
    public HasActivityCondition(Integer withinMinutes, Integer forAtLeastSeconds, Boolean negated)
    {
        this.withinMinutes = withinMinutes;
        this.forAtLeastSeconds = forAtLeastSeconds;
        this.negated = negated;
    }
    public static HasActivityCondition create(Integer withinMinutes, Boolean negated)
    {
        return new HasActivityCondition(withinMinutes, negated);
    }
    public HasActivityCondition(Integer withinMinutes, Boolean negated)
    {
        this.withinMinutes = withinMinutes;
        this.negated = negated;
    }
    public HasActivityCondition()
    {
    }
    public Integer getWithinMinutes()
    {
        return this.withinMinutes;
    }
    public Integer getForAtLeastSeconds()
    {
        return this.forAtLeastSeconds;
    }
    public HasActivityCondition setWithinMinutes(Integer withinMinutes)
    {
        this.withinMinutes = withinMinutes;;
        return this;
    }
    public HasActivityCondition setForAtLeastSeconds(Integer forAtLeastSeconds)
    {
        this.forAtLeastSeconds = forAtLeastSeconds;;
        return this;
    }
    @Override
    public HasActivityCondition setNegated(Boolean negated)
    {
        this.negated = negated;;
        return this;
    }
}

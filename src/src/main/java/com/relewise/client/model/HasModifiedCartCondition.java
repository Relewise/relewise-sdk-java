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
    defaultImpl = HasModifiedCartCondition.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class HasModifiedCartCondition extends UserCondition
{
    public String $type = "Relewise.Client.DataTypes.UserConditions.HasModifiedCartCondition, Relewise.Client";
    public Integer withinMinutes;
    public String cartName;
    public static HasModifiedCartCondition create()
    {
        return new HasModifiedCartCondition();
    }
    public HasModifiedCartCondition()
    {
        this.cartName = null;
        this.negated = false;
    }
    public static HasModifiedCartCondition create(String cartName, Boolean negated)
    {
        return new HasModifiedCartCondition(cartName, negated);
    }
    public HasModifiedCartCondition(String cartName, Boolean negated)
    {
        this.cartName = cartName;
        this.negated = negated;
    }
    public Integer getWithinMinutes()
    {
        return this.withinMinutes;
    }
    public String getCartName()
    {
        return this.cartName;
    }
    public HasModifiedCartCondition setWithinMinutes(Integer withinMinutes)
    {
        this.withinMinutes = withinMinutes;;
        return this;
    }
    public HasModifiedCartCondition setCartName(String cartName)
    {
        this.cartName = cartName;;
        return this;
    }
    @Override
    public HasModifiedCartCondition setNegated(Boolean negated)
    {
        this.negated = negated;;
        return this;
    }
}

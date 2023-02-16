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
    defaultImpl = HasRecentlyReceivedTriggerCondition.class)
public class HasRecentlyReceivedTriggerCondition extends UserCondition
{
    public String $type = "Relewise.Client.DataTypes.UserConditions.HasRecentlyReceivedTriggerCondition, Relewise.Client";
    public Integer withinMinutes;
    public @Nullable UUID id;
    public String group;
    public @Nullable Short type;
    public static HasRecentlyReceivedTriggerCondition create(@Nullable UUID id, String group, Boolean negated)
    {
        return new HasRecentlyReceivedTriggerCondition(id, group, negated);
    }
    public HasRecentlyReceivedTriggerCondition(@Nullable UUID id, String group, Boolean negated)
    {
        this.id = id;
        this.group = group;
        this.negated = negated;
    }
    public HasRecentlyReceivedTriggerCondition()
    {
    }
    public Integer getWithinMinutes()
    {
        return this.withinMinutes;
    }
    public @Nullable UUID getId()
    {
        return this.id;
    }
    public String getGroup()
    {
        return this.group;
    }
    public @Nullable Short getType()
    {
        return this.type;
    }
    public HasRecentlyReceivedTriggerCondition setWithinMinutes(Integer withinMinutes)
    {
        this.withinMinutes = withinMinutes;;
        return this;
    }
    public HasRecentlyReceivedTriggerCondition setId(@Nullable UUID id)
    {
        this.id = id;;
        return this;
    }
    public HasRecentlyReceivedTriggerCondition setGroup(String group)
    {
        this.group = group;;
        return this;
    }
    public HasRecentlyReceivedTriggerCondition setType(@Nullable Short type)
    {
        this.type = type;;
        return this;
    }
    @Override
    public HasRecentlyReceivedTriggerCondition setNegated(Boolean negated)
    {
        this.negated = negated;;
        return this;
    }
}

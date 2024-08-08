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
    defaultImpl = HasRecentlyReceivedSameTriggerCondition.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class HasRecentlyReceivedSameTriggerCondition extends UserCondition
{
    public String $type = "Relewise.Client.DataTypes.UserConditions.HasRecentlyReceivedSameTriggerCondition, Relewise.Client";
    public Integer withinMinutes;
    public static HasRecentlyReceivedSameTriggerCondition create(Boolean negated)
    {
        return new HasRecentlyReceivedSameTriggerCondition(negated);
    }
    public HasRecentlyReceivedSameTriggerCondition(Boolean negated)
    {
        this.negated = negated;
    }
    public HasRecentlyReceivedSameTriggerCondition()
    {
    }
    public Integer getWithinMinutes()
    {
        return this.withinMinutes;
    }
    public HasRecentlyReceivedSameTriggerCondition setWithinMinutes(Integer withinMinutes)
    {
        this.withinMinutes = withinMinutes;;
        return this;
    }
    @Override
    public HasRecentlyReceivedSameTriggerCondition setNegated(Boolean negated)
    {
        this.negated = negated;;
        return this;
    }
}

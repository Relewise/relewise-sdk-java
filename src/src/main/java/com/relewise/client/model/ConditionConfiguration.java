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
    defaultImpl = ConditionConfiguration.class)
public class ConditionConfiguration
{
    public String $type = "Relewise.Client.DataTypes.Merchandising.Configurations.ConditionConfiguration, Relewise.Client";
    public UserConditionConfiguration user;
    public InputConditionConfiguration input;
    public TargetConditionConfiguration target;
    public ContextConditionConfiguration context;
    public static ConditionConfiguration create()
    {
        return new ConditionConfiguration();
    }
    public ConditionConfiguration()
    {
    }
    public UserConditionConfiguration getUser()
    {
        return this.user;
    }
    public InputConditionConfiguration getInput()
    {
        return this.input;
    }
    public TargetConditionConfiguration getTarget()
    {
        return this.target;
    }
    public ContextConditionConfiguration getContext()
    {
        return this.context;
    }
    public ConditionConfiguration setUser(UserConditionConfiguration user)
    {
        this.user = user;;
        return this;
    }
    public ConditionConfiguration setInput(InputConditionConfiguration input)
    {
        this.input = input;;
        return this;
    }
    public ConditionConfiguration setTarget(TargetConditionConfiguration target)
    {
        this.target = target;;
        return this;
    }
    public ConditionConfiguration setContext(ContextConditionConfiguration context)
    {
        this.context = context;;
        return this;
    }
}

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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class ConditionConfiguration
{
    public @Nullable UserConditionConfiguration user;
    public @Nullable InputConditionConfiguration input;
    public @Nullable TargetConditionConfiguration target;
    public @Nullable ContextConditionConfiguration context;
    public static ConditionConfiguration create()
    {
        return new ConditionConfiguration();
    }
    public ConditionConfiguration()
    {
    }
    public @Nullable UserConditionConfiguration getUser()
    {
        return this.user;
    }
    public @Nullable InputConditionConfiguration getInput()
    {
        return this.input;
    }
    public @Nullable TargetConditionConfiguration getTarget()
    {
        return this.target;
    }
    public @Nullable ContextConditionConfiguration getContext()
    {
        return this.context;
    }
    public ConditionConfiguration setUser(@Nullable UserConditionConfiguration user)
    {
        this.user = user;
        return this;
    }
    public ConditionConfiguration setInput(@Nullable InputConditionConfiguration input)
    {
        this.input = input;
        return this;
    }
    public ConditionConfiguration setTarget(@Nullable TargetConditionConfiguration target)
    {
        this.target = target;
        return this;
    }
    public ConditionConfiguration setContext(@Nullable ContextConditionConfiguration context)
    {
        this.context = context;
        return this;
    }
}

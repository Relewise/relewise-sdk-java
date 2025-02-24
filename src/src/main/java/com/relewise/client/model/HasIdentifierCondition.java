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
    defaultImpl = HasIdentifierCondition.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class HasIdentifierCondition extends UserCondition
{
    public String $type = "Relewise.Client.DataTypes.UserConditions.HasIdentifierCondition, Relewise.Client";
    public String key;
    public static HasIdentifierCondition create(String key, Boolean negated)
    {
        return new HasIdentifierCondition(key, negated);
    }
    public HasIdentifierCondition(String key, Boolean negated)
    {
        this.key = key;
        this.negated = negated;
    }
    public HasIdentifierCondition()
    {
    }
    public String getKey()
    {
        return this.key;
    }
    public HasIdentifierCondition setKey(String key)
    {
        this.key = key;
        return this;
    }
    @Override
    public HasIdentifierCondition setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
}

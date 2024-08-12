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
    defaultImpl = HasClassificationCondition.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class HasClassificationCondition extends UserCondition
{
    public String $type = "Relewise.Client.DataTypes.UserConditions.HasClassificationCondition, Relewise.Client";
    public String key;
    public String value;
    public static HasClassificationCondition create(String key, String value, Boolean negated)
    {
        return new HasClassificationCondition(key, value, negated);
    }
    public HasClassificationCondition(String key, String value, Boolean negated)
    {
        this.key = key;
        this.value = value;
        this.negated = negated;
    }
    public static HasClassificationCondition create(String key, Boolean negated)
    {
        return new HasClassificationCondition(key, negated);
    }
    public HasClassificationCondition(String key, Boolean negated)
    {
        this.key = key;
        this.negated = negated;
    }
    public HasClassificationCondition()
    {
    }
    public String getKey()
    {
        return this.key;
    }
    public String getValue()
    {
        return this.value;
    }
    public HasClassificationCondition setKey(String key)
    {
        this.key = key;
        return this;
    }
    public HasClassificationCondition setValue(String value)
    {
        this.value = value;
        return this;
    }
    @Override
    public HasClassificationCondition setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
}

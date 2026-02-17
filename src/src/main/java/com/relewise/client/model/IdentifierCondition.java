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
    defaultImpl = IdentifierCondition.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class IdentifierCondition extends UserCondition
{
    public String $type = "Relewise.Client.DataTypes.UserConditions.IdentifierCondition, Relewise.Client";
    public String key;
    public ArrayList<String> values;
    public static IdentifierCondition create(String key)
    {
        return new IdentifierCondition(key);
    }
    public IdentifierCondition(String key)
    {
        this.key = key;
        this.negated = false;
    }
    public static IdentifierCondition create(String key, Boolean negated)
    {
        return new IdentifierCondition(key, negated);
    }
    public IdentifierCondition(String key, Boolean negated)
    {
        this.key = key;
        this.negated = negated;
    }
    public IdentifierCondition()
    {
        this.negated = false;
    }
    public String getKey()
    {
        return this.key;
    }
    public ArrayList<String> getValues()
    {
        return this.values;
    }
    public IdentifierCondition setKey(String key)
    {
        this.key = key;
        return this;
    }
    public IdentifierCondition setValues(String... values)
    {
        this.values = new ArrayList<>(Arrays.asList(values));;
        return this;
    }
    public IdentifierCondition addToValues(String values)
    {
        if (this.values == null)
        {
            this.values = new ArrayList<>();
        }
        this.values.add(values);
        return this;
    }
    @Override
    public IdentifierCondition setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
}

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
    
/** Matches when the request contains every configured key and each key has one of its accepted values. For example, DeviceType can accept either Mobile or Tablet. Comparisons are exact and case-sensitive. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = ContextValuesMatchCondition.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContextValuesMatchCondition extends ContextValueCondition
{
    public String $type = "Relewise.Client.DataTypes.Merchandising.ContextValuesMatchCondition, Relewise.Client";
    /** The values that each request key may have. A null or empty dictionary adds no restriction. Each configured key must have a non-empty list with no null values. An empty string is a valid value. */
    public @Nullable HashMap<String, ArrayList<String>> acceptedValues;
    public static ContextValuesMatchCondition create()
    {
        return new ContextValuesMatchCondition();
    }
    public ContextValuesMatchCondition()
    {
    }
    /** The values that each request key may have. A null or empty dictionary adds no restriction. Each configured key must have a non-empty list with no null values. An empty string is a valid value. */
    public @Nullable HashMap<String, ArrayList<String>> getAcceptedValues()
    {
        return this.acceptedValues;
    }
    /** The values that each request key may have. A null or empty dictionary adds no restriction. Each configured key must have a non-empty list with no null values. An empty string is a valid value. */
    public ContextValuesMatchCondition addToAcceptedValues(String key, ArrayList<String> value)
    {
        if (this.acceptedValues == null)
        {
            this.acceptedValues = new HashMap<>();
        }
        this.acceptedValues.put(key, value);
        return this;
    }
    /** The values that each request key may have. A null or empty dictionary adds no restriction. Each configured key must have a non-empty list with no null values. An empty string is a valid value. */
    public ContextValuesMatchCondition setAcceptedValues(@Nullable HashMap<String, ArrayList<String>> acceptedValues)
    {
        this.acceptedValues = acceptedValues;
        return this;
    }
}

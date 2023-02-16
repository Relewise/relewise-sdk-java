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
    defaultImpl = KeyMultiplier.class)
public class KeyMultiplier
{
    public String $type = "Relewise.Client.DataTypes.KeyMultiplier, Relewise.Client";
    public String key;
    public Double multiplier;
    public static KeyMultiplier create(String key, Double multiplier)
    {
        return new KeyMultiplier(key, multiplier);
    }
    public KeyMultiplier(String key, Double multiplier)
    {
        this.key = key;
        this.multiplier = multiplier;
    }
    public KeyMultiplier()
    {
    }
    public String getKey()
    {
        return this.key;
    }
    public Double getMultiplier()
    {
        return this.multiplier;
    }
    public KeyMultiplier setKey(String key)
    {
        this.key = key;;
        return this;
    }
    public KeyMultiplier setMultiplier(Double multiplier)
    {
        this.multiplier = multiplier;;
        return this;
    }
}

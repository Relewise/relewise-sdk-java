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
    defaultImpl = DataIndexConfiguration.class)
public class DataIndexConfiguration
{
    public String $type = "Relewise.Client.DataTypes.Search.Configuration.DataIndexConfiguration, Relewise.Client";
    public HashMap<String, FieldIndexConfiguration> keys;
    public FieldIndexConfiguration unspecified;
    public static DataIndexConfiguration create()
    {
        return new DataIndexConfiguration();
    }
    public DataIndexConfiguration()
    {
    }
    public HashMap<String, FieldIndexConfiguration> getKeys()
    {
        return this.keys;
    }
    public FieldIndexConfiguration getUnspecified()
    {
        return this.unspecified;
    }
    public DataIndexConfiguration addToKeys(String key, FieldIndexConfiguration value)
    {
        if (this.keys == null)
        {
            this.keys = new HashMap<>();
        }
        this.keys.put(key, value);
        return this;
    }
    public DataIndexConfiguration setKeys(HashMap<String, FieldIndexConfiguration> keys)
    {
        this.keys = keys;;
        return this;
    }
    public DataIndexConfiguration setUnspecified(FieldIndexConfiguration unspecified)
    {
        this.unspecified = unspecified;;
        return this;
    }
}
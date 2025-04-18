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
public class DataIndexConfiguration
{
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
        this.keys = keys;
        return this;
    }
    public DataIndexConfiguration setUnspecified(FieldIndexConfiguration unspecified)
    {
        this.unspecified = unspecified;
        return this;
    }
}

package com.relewise.client.model;

import com.fasterxml.jackson.annotation.*;
import javax.annotation.Nullable;
import java.io.IOException;
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
    defaultImpl = DataDoubleSelector.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DataDoubleSelector extends ValueSelector
{
    public String $type = "Relewise.Client.Requests.ValueSelectors.DataDoubleSelector, Relewise.Client";
    public String key;
    public static DataDoubleSelector create(String key)
    {
        return new DataDoubleSelector(key);
    }
    public DataDoubleSelector(String key)
    {
        this.key = key;
    }
    public DataDoubleSelector()
    {
    }
    public String getKey()
    {
        return this.key;
    }
    public DataDoubleSelector setKey(String key)
    {
        this.key = key;
        return this;
    }
}

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
import java.util.AbstractMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashSet;
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class Company
{
    public String id;
    public @Nullable Company parent;
    public @Nullable HashMap<String, DataValue> data;
    public static Company create(String id)
    {
        return new Company(id);
    }
    public Company(String id)
    {
        this.id = id;
    }
    public Company()
    {
    }
    public String getId()
    {
        return this.id;
    }
    public @Nullable Company getParent()
    {
        return this.parent;
    }
    public @Nullable HashMap<String, DataValue> getData()
    {
        return this.data;
    }
    public Company setId(String id)
    {
        this.id = id;
        return this;
    }
    public Company setParent(Company parent)
    {
        this.parent = parent;
        return this;
    }
    public Company addToData(String key, DataValue value)
    {
        if (this.data == null)
        {
            this.data = new HashMap<>();
        }
        this.data.put(key, value);
        return this;
    }
    public Company setData(HashMap<String, DataValue> data)
    {
        this.data = data;
        return this;
    }
}

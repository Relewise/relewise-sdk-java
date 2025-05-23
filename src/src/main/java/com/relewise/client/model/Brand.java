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
public class Brand
{
    public String id;
    public @Nullable String displayName;
    public @Nullable ArrayList<Integer> assortments;
    public @Nullable HashMap<String, DataValue> data;
    public static Brand create(String id)
    {
        return new Brand(id);
    }
    public Brand(String id)
    {
        this.id = id;
    }
    public Brand()
    {
    }
    public String getId()
    {
        return this.id;
    }
    public @Nullable String getDisplayName()
    {
        return this.displayName;
    }
    public @Nullable ArrayList<Integer> getAssortments()
    {
        return this.assortments;
    }
    public @Nullable HashMap<String, DataValue> getData()
    {
        return this.data;
    }
    public Brand setId(String id)
    {
        this.id = id;
        return this;
    }
    public Brand setDisplayName(@Nullable String displayName)
    {
        this.displayName = displayName;
        return this;
    }
    public Brand setAssortments(Integer... assortments)
    {
        this.assortments = new ArrayList<>(Arrays.asList(assortments));;
        return this;
    }
    public Brand addToAssortments(Integer assortments)
    {
        if (this.assortments == null)
        {
            this.assortments = new ArrayList<>();
        }
        this.assortments.add(assortments);
        return this;
    }
    public Brand addToData(String key, DataValue value)
    {
        if (this.data == null)
        {
            this.data = new HashMap<>();
        }
        this.data.put(key, value);
        return this;
    }
    public Brand setData(@Nullable HashMap<String, DataValue> data)
    {
        this.data = data;
        return this;
    }
}

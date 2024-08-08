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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class Content
{
    public String id;
    public @Nullable Multilingual displayName;
    public @Nullable ArrayList<CategoryPath> categoryPaths;
    public @Nullable ArrayList<Integer> assortments;
    public @Nullable HashMap<String, DataValue> data;
    public static Content create(String id)
    {
        return new Content(id);
    }
    public Content(String id)
    {
        this.id = id;
    }
    public Content()
    {
    }
    public String getId()
    {
        return this.id;
    }
    public @Nullable Multilingual getDisplayName()
    {
        return this.displayName;
    }
    public @Nullable ArrayList<CategoryPath> getCategoryPaths()
    {
        return this.categoryPaths;
    }
    public @Nullable ArrayList<Integer> getAssortments()
    {
        return this.assortments;
    }
    public @Nullable HashMap<String, DataValue> getData()
    {
        return this.data;
    }
    public Content setId(String id)
    {
        this.id = id;;
        return this;
    }
    public Content setDisplayName(Multilingual displayName)
    {
        this.displayName = displayName;;
        return this;
    }
    public Content setCategoryPaths(CategoryPath... categoryPaths)
    {
        this.categoryPaths = new ArrayList<>(Arrays.asList(categoryPaths));;
        return this;
    }
    public Content addToCategoryPaths(CategoryPath categoryPaths)
    {
        if (this.categoryPaths == null)
        {
            this.categoryPaths = new ArrayList<>();
        }
        this.categoryPaths.add(categoryPaths);
        return this;
    }
    public Content setAssortments(Integer... assortments)
    {
        this.assortments = new ArrayList<>(Arrays.asList(assortments));;
        return this;
    }
    public Content addToAssortments(Integer assortments)
    {
        if (this.assortments == null)
        {
            this.assortments = new ArrayList<>();
        }
        this.assortments.add(assortments);
        return this;
    }
    public Content addToData(String key, DataValue value)
    {
        if (this.data == null)
        {
            this.data = new HashMap<>();
        }
        this.data.put(key, value);
        return this;
    }
    public Content setData(HashMap<String, DataValue> data)
    {
        this.data = data;;
        return this;
    }
}

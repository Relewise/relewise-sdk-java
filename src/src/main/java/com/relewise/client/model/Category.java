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
    property = "$type")
@JsonSubTypes({
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class Category
{
    public String $type = "";
    public String id;
    public Multilingual displayName;
    public ArrayList<CategoryPath> categoryPaths;
    public ArrayList<Integer> assortments;
    public HashMap<String, DataValue> data;
    public String getId()
    {
        return this.id;
    }
    public Multilingual getDisplayName()
    {
        return this.displayName;
    }
    public ArrayList<CategoryPath> getCategoryPaths()
    {
        return this.categoryPaths;
    }
    public ArrayList<Integer> getAssortments()
    {
        return this.assortments;
    }
    public HashMap<String, DataValue> getData()
    {
        return this.data;
    }
    public Category setId(String id)
    {
        this.id = id;;
        return this;
    }
    public Category setDisplayName(Multilingual displayName)
    {
        this.displayName = displayName;;
        return this;
    }
    public Category setCategoryPaths(CategoryPath... categoryPaths)
    {
        this.categoryPaths = new ArrayList<>(Arrays.asList(categoryPaths));;
        return this;
    }
    public Category addToCategoryPaths(CategoryPath categoryPaths)
    {
        if (this.categoryPaths == null)
        {
            this.categoryPaths = new ArrayList<>();
        }
        this.categoryPaths.add(categoryPaths);
        return this;
    }
    public Category setAssortments(Integer... assortments)
    {
        this.assortments = new ArrayList<>(Arrays.asList(assortments));;
        return this;
    }
    public Category addToAssortments(Integer assortments)
    {
        if (this.assortments == null)
        {
            this.assortments = new ArrayList<>();
        }
        this.assortments.add(assortments);
        return this;
    }
    public Category addToData(String key, DataValue value)
    {
        if (this.data == null)
        {
            this.data = new HashMap<>();
        }
        this.data.put(key, value);
        return this;
    }
    public Category setData(HashMap<String, DataValue> data)
    {
        this.data = data;;
        return this;
    }
}

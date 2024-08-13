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
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ContentCategoryResult.class, name = "Relewise.Client.DataTypes.ContentCategoryResult, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductCategoryResult.class, name = "Relewise.Client.DataTypes.ProductCategoryResult, Relewise.Client"),
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class CategoryResult
{
    public String $type = "";
    public String categoryId;
    public String displayName;
    public Integer rank;
    public ViewedByUserInfo viewedByUser;
    public CategoryPathResult[] paths;
    public Integer[] assortments;
    public HashMap<String, DataValue> data;
    public String getCategoryId()
    {
        return this.categoryId;
    }
    public String getDisplayName()
    {
        return this.displayName;
    }
    public Integer getRank()
    {
        return this.rank;
    }
    public ViewedByUserInfo getViewedByUser()
    {
        return this.viewedByUser;
    }
    public CategoryPathResult[] getPaths()
    {
        return this.paths;
    }
    public Integer[] getAssortments()
    {
        return this.assortments;
    }
    public HashMap<String, DataValue> getData()
    {
        return this.data;
    }
    public CategoryResult setCategoryId(String categoryId)
    {
        this.categoryId = categoryId;
        return this;
    }
    public CategoryResult setDisplayName(String displayName)
    {
        this.displayName = displayName;
        return this;
    }
    public CategoryResult setRank(Integer rank)
    {
        this.rank = rank;
        return this;
    }
    public CategoryResult setViewedByUser(ViewedByUserInfo viewedByUser)
    {
        this.viewedByUser = viewedByUser;
        return this;
    }
    public CategoryResult setPaths(CategoryPathResult... paths)
    {
        this.paths = paths;
        return this;
    }
    public CategoryResult addToPaths(CategoryPathResult path)
    {
        if (this.paths == null)
        {
            this.paths = new CategoryPathResult[] { path };
        }
        else
        {
            ArrayList<CategoryPathResult> existingList = new ArrayList<>(Arrays.asList(this.paths));
            existingList.add(path);
            this.paths = existingList.toArray(new CategoryPathResult[0]);
        }
        return this;
    }
    public CategoryResult setAssortments(Integer... assortments)
    {
        this.assortments = assortments;
        return this;
    }
    public CategoryResult addToAssortments(Integer assortment)
    {
        if (this.assortments == null)
        {
            this.assortments = new Integer[] { assortment };
        }
        else
        {
            ArrayList<Integer> existingList = new ArrayList<>(Arrays.asList(this.assortments));
            existingList.add(assortment);
            this.assortments = existingList.toArray(new Integer[0]);
        }
        return this;
    }
    public CategoryResult addToData(String key, DataValue value)
    {
        if (this.data == null)
        {
            this.data = new HashMap<>();
        }
        this.data.put(key, value);
        return this;
    }
    public CategoryResult setData(HashMap<String, DataValue> data)
    {
        this.data = data;
        return this;
    }
}

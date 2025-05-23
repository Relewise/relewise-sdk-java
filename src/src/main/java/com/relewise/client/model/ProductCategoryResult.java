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
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = ProductCategoryResult.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductCategoryResult extends CategoryResult
{
    public String $type = "Relewise.Client.DataTypes.ProductCategoryResult, Relewise.Client";
    public static ProductCategoryResult create(String categoryId, Integer rank)
    {
        return new ProductCategoryResult(categoryId, rank);
    }
    public ProductCategoryResult(String categoryId, Integer rank)
    {
        this.categoryId = categoryId;
        this.rank = rank;
    }
    public ProductCategoryResult()
    {
    }
    @Override
    public ProductCategoryResult setCategoryId(String categoryId)
    {
        this.categoryId = categoryId;
        return this;
    }
    @Override
    public ProductCategoryResult setDisplayName(String displayName)
    {
        this.displayName = displayName;
        return this;
    }
    @Override
    public ProductCategoryResult setRank(Integer rank)
    {
        this.rank = rank;
        return this;
    }
    @Override
    public ProductCategoryResult setViewedByUser(ViewedByUserInfo viewedByUser)
    {
        this.viewedByUser = viewedByUser;
        return this;
    }
    @Override
    public ProductCategoryResult setPaths(CategoryPathResult... paths)
    {
        this.paths = paths;
        return this;
    }
    public ProductCategoryResult addToPaths(CategoryPathResult path)
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
    @Override
    public ProductCategoryResult setAssortments(Integer... assortments)
    {
        this.assortments = assortments;
        return this;
    }
    public ProductCategoryResult addToAssortments(Integer assortment)
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
    public ProductCategoryResult addToData(String key, DataValue value)
    {
        if (this.data == null)
        {
            this.data = new HashMap<>();
        }
        this.data.put(key, value);
        return this;
    }
    @Override
    public ProductCategoryResult setData(HashMap<String, DataValue> data)
    {
        this.data = data;
        return this;
    }
}

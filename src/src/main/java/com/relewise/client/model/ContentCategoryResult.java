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
    property = "$type",
    defaultImpl = ContentCategoryResult.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentCategoryResult extends CategoryResult
{
    public String $type = "Relewise.Client.DataTypes.ContentCategoryResult, Relewise.Client";
    public static ContentCategoryResult create(String categoryId, Integer rank)
    {
        return new ContentCategoryResult(categoryId, rank);
    }
    public ContentCategoryResult(String categoryId, Integer rank)
    {
        this.categoryId = categoryId;
        this.rank = rank;
    }
    public ContentCategoryResult()
    {
    }
    @Override
    public ContentCategoryResult setCategoryId(String categoryId)
    {
        this.categoryId = categoryId;;
        return this;
    }
    @Override
    public ContentCategoryResult setDisplayName(String displayName)
    {
        this.displayName = displayName;;
        return this;
    }
    @Override
    public ContentCategoryResult setRank(Integer rank)
    {
        this.rank = rank;;
        return this;
    }
    @Override
    public ContentCategoryResult setViewedByUser(ViewedByUserInfo viewedByUser)
    {
        this.viewedByUser = viewedByUser;;
        return this;
    }
    @Override
    public ContentCategoryResult setPaths(CategoryPathResult... paths)
    {
        this.paths = paths;;
        return this;
    }
    public ContentCategoryResult addToPaths(CategoryPathResult path)
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
    public ContentCategoryResult setAssortments(Integer... assortments)
    {
        this.assortments = assortments;;
        return this;
    }
    public ContentCategoryResult addToAssortments(Integer assortment)
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
    public ContentCategoryResult addToData(String key, DataValue value)
    {
        if (this.data == null)
        {
            this.data = new HashMap<>();
        }
        this.data.put(key, value);
        return this;
    }
    @Override
    public ContentCategoryResult setData(HashMap<String, DataValue> data)
    {
        this.data = data;;
        return this;
    }
}

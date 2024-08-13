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
public class ContentResult
{
    public String contentId;
    public String displayName;
    public Integer rank;
    public Integer[] assortments;
    public HashMap<String, DataValue> data;
    public CategoryPathResult[] categoryPaths;
    public ViewedByUserInfo viewedByUser;
    public static ContentResult create(String contentId, Integer rank)
    {
        return new ContentResult(contentId, rank);
    }
    public ContentResult(String contentId, Integer rank)
    {
        this.contentId = contentId;
        this.rank = rank;
    }
    public ContentResult()
    {
    }
    public String getContentId()
    {
        return this.contentId;
    }
    public String getDisplayName()
    {
        return this.displayName;
    }
    public Integer getRank()
    {
        return this.rank;
    }
    public Integer[] getAssortments()
    {
        return this.assortments;
    }
    public HashMap<String, DataValue> getData()
    {
        return this.data;
    }
    public CategoryPathResult[] getCategoryPaths()
    {
        return this.categoryPaths;
    }
    public ViewedByUserInfo getViewedByUser()
    {
        return this.viewedByUser;
    }
    public ContentResult setContentId(String contentId)
    {
        this.contentId = contentId;
        return this;
    }
    public ContentResult setDisplayName(String displayName)
    {
        this.displayName = displayName;
        return this;
    }
    public ContentResult setRank(Integer rank)
    {
        this.rank = rank;
        return this;
    }
    public ContentResult setAssortments(Integer... assortments)
    {
        this.assortments = assortments;
        return this;
    }
    public ContentResult addToAssortments(Integer assortment)
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
    public ContentResult addToData(String key, DataValue value)
    {
        if (this.data == null)
        {
            this.data = new HashMap<>();
        }
        this.data.put(key, value);
        return this;
    }
    public ContentResult setData(HashMap<String, DataValue> data)
    {
        this.data = data;
        return this;
    }
    public ContentResult setCategoryPaths(CategoryPathResult... categoryPaths)
    {
        this.categoryPaths = categoryPaths;
        return this;
    }
    public ContentResult addToCategoryPaths(CategoryPathResult categoryPath)
    {
        if (this.categoryPaths == null)
        {
            this.categoryPaths = new CategoryPathResult[] { categoryPath };
        }
        else
        {
            ArrayList<CategoryPathResult> existingList = new ArrayList<>(Arrays.asList(this.categoryPaths));
            existingList.add(categoryPath);
            this.categoryPaths = existingList.toArray(new CategoryPathResult[0]);
        }
        return this;
    }
    public ContentResult setViewedByUser(ViewedByUserInfo viewedByUser)
    {
        this.viewedByUser = viewedByUser;
        return this;
    }
}

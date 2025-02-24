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
public class BrandResult
{
    public String id;
    public String displayName;
    public Integer rank;
    public ViewedByUserInfo viewedByUser;
    public Integer[] assortments;
    public HashMap<String, DataValue> data;
    public static BrandResult create(String id, Integer rank)
    {
        return new BrandResult(id, rank);
    }
    public BrandResult(String id, Integer rank)
    {
        this.id = id;
        this.rank = rank;
    }
    public BrandResult()
    {
    }
    public String getId()
    {
        return this.id;
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
    public Integer[] getAssortments()
    {
        return this.assortments;
    }
    public HashMap<String, DataValue> getData()
    {
        return this.data;
    }
    public BrandResult setId(String id)
    {
        this.id = id;
        return this;
    }
    public BrandResult setDisplayName(String displayName)
    {
        this.displayName = displayName;
        return this;
    }
    public BrandResult setRank(Integer rank)
    {
        this.rank = rank;
        return this;
    }
    public BrandResult setViewedByUser(ViewedByUserInfo viewedByUser)
    {
        this.viewedByUser = viewedByUser;
        return this;
    }
    public BrandResult setAssortments(Integer... assortments)
    {
        this.assortments = assortments;
        return this;
    }
    public BrandResult addToAssortments(Integer assortment)
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
    public BrandResult addToData(String key, DataValue value)
    {
        if (this.data == null)
        {
            this.data = new HashMap<>();
        }
        this.data.put(key, value);
        return this;
    }
    public BrandResult setData(HashMap<String, DataValue> data)
    {
        this.data = data;
        return this;
    }
}

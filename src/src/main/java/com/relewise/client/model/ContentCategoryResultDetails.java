package com.relewise.client.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
    defaultImpl = ContentCategoryResultDetails.class)
public class ContentCategoryResultDetails extends ContentCategoryResultDetailsCategoryResultDetails
{
    public String $type = "Relewise.Client.DataTypes.ContentCategoryResultDetails, Relewise.Client";
    public static ContentCategoryResultDetails create(String categoryId)
    {
        return new ContentCategoryResultDetails(categoryId);
    }
    public ContentCategoryResultDetails(String categoryId)
    {
        this.categoryId = categoryId;
    }
    public ContentCategoryResultDetails()
    {
    }
    @Override
    public ContentCategoryResultDetails setCategoryId(String categoryId)
    {
        this.categoryId = categoryId;;
        return this;
    }
    @Override
    public ContentCategoryResultDetails setDisplayName(Multilingual displayName)
    {
        this.displayName = displayName;;
        return this;
    }
    @Override
    public ContentCategoryResultDetails setAssortments(Integer... assortments)
    {
        this.assortments = assortments;;
        return this;
    }
    public ContentCategoryResultDetails addToAssortments(Integer assortment)
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
    public ContentCategoryResultDetails addToData(String key, DataValue value)
    {
        if (this.data == null)
        {
            this.data = new HashMap<>();
        }
        this.data.put(key, value);
        return this;
    }
    @Override
    public ContentCategoryResultDetails setData(HashMap<String, DataValue> data)
    {
        this.data = data;;
        return this;
    }
    @Override
    public ContentCategoryResultDetails setViewedByUser(ViewedByUserInfo viewedByUser)
    {
        this.viewedByUser = viewedByUser;;
        return this;
    }
    @Override
    public ContentCategoryResultDetails setCreatedUtc(OffsetDateTime createdUtc)
    {
        this.createdUtc = createdUtc;;
        return this;
    }
    @Override
    public ContentCategoryResultDetails setLastViewedUtc(@Nullable OffsetDateTime lastViewedUtc)
    {
        this.lastViewedUtc = lastViewedUtc;;
        return this;
    }
    @Override
    public ContentCategoryResultDetails setViewedTotalNumberOfTimes(Long viewedTotalNumberOfTimes)
    {
        this.viewedTotalNumberOfTimes = viewedTotalNumberOfTimes;;
        return this;
    }
    @Override
    public ContentCategoryResultDetails setViewedByDifferentNumberOfUsers(Integer viewedByDifferentNumberOfUsers)
    {
        this.viewedByDifferentNumberOfUsers = viewedByDifferentNumberOfUsers;;
        return this;
    }
    @Override
    public ContentCategoryResultDetails setDisabled(Boolean disabled)
    {
        this.disabled = disabled;;
        return this;
    }
    @Override
    public ContentCategoryResultDetails setChildCategories(ContentCategoryResultDetails... childCategories)
    {
        this.childCategories = childCategories;;
        return this;
    }
    public ContentCategoryResultDetails addToChildCategories(ContentCategoryResultDetails childCategory)
    {
        if (this.childCategories == null)
        {
            this.childCategories = new ContentCategoryResultDetails[] { childCategory };
        }
        else
        {
            ArrayList<ContentCategoryResultDetails> existingList = new ArrayList<>(Arrays.asList(this.childCategories));
            existingList.add(childCategory);
            this.childCategories = existingList.toArray(new ContentCategoryResultDetails[0]);
        }
        return this;
    }
    @Override
    public ContentCategoryResultDetails setParentCategories(ContentCategoryResultDetails... parentCategories)
    {
        this.parentCategories = parentCategories;;
        return this;
    }
    public ContentCategoryResultDetails addToParentCategories(ContentCategoryResultDetails parentCategory)
    {
        if (this.parentCategories == null)
        {
            this.parentCategories = new ContentCategoryResultDetails[] { parentCategory };
        }
        else
        {
            ArrayList<ContentCategoryResultDetails> existingList = new ArrayList<>(Arrays.asList(this.parentCategories));
            existingList.add(parentCategory);
            this.parentCategories = existingList.toArray(new ContentCategoryResultDetails[0]);
        }
        return this;
    }
}

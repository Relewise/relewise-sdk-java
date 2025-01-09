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
import java.util.Set;
import java.util.HashSet;
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ContentCategoryResultDetails.class, name = "Relewise.Client.DataTypes.ContentCategoryResultDetails, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductCategoryResultDetails.class, name = "Relewise.Client.DataTypes.ProductCategoryResultDetails, Relewise.Client"),
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class ProductCategoryResultDetailsCategoryResultDetails
{
    public String $type = "";
    public String categoryId;
    public Multilingual displayName;
    public Integer[] assortments;
    public HashMap<String, DataValue> data;
    public ViewedByUserInfo viewedByUser;
    public OffsetDateTime createdUtc;
    public @Nullable OffsetDateTime lastViewedUtc;
    public Long viewedTotalNumberOfTimes;
    public Integer viewedByDifferentNumberOfUsers;
    public Boolean disabled;
    public ProductCategoryResultDetails[] childCategories;
    public ProductCategoryResultDetails[] parentCategories;
    public String getCategoryId()
    {
        return this.categoryId;
    }
    public Multilingual getDisplayName()
    {
        return this.displayName;
    }
    public Integer[] getAssortments()
    {
        return this.assortments;
    }
    public HashMap<String, DataValue> getData()
    {
        return this.data;
    }
    public ViewedByUserInfo getViewedByUser()
    {
        return this.viewedByUser;
    }
    public OffsetDateTime getCreatedUtc()
    {
        return this.createdUtc;
    }
    public @Nullable OffsetDateTime getLastViewedUtc()
    {
        return this.lastViewedUtc;
    }
    public Long getViewedTotalNumberOfTimes()
    {
        return this.viewedTotalNumberOfTimes;
    }
    public Integer getViewedByDifferentNumberOfUsers()
    {
        return this.viewedByDifferentNumberOfUsers;
    }
    public Boolean getDisabled()
    {
        return this.disabled;
    }
    public ProductCategoryResultDetails[] getChildCategories()
    {
        return this.childCategories;
    }
    public ProductCategoryResultDetails[] getParentCategories()
    {
        return this.parentCategories;
    }
    public ProductCategoryResultDetailsCategoryResultDetails setCategoryId(String categoryId)
    {
        this.categoryId = categoryId;
        return this;
    }
    public ProductCategoryResultDetailsCategoryResultDetails setDisplayName(Multilingual displayName)
    {
        this.displayName = displayName;
        return this;
    }
    public ProductCategoryResultDetailsCategoryResultDetails setAssortments(Integer... assortments)
    {
        this.assortments = assortments;
        return this;
    }
    public ProductCategoryResultDetailsCategoryResultDetails addToAssortments(Integer assortment)
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
    public ProductCategoryResultDetailsCategoryResultDetails addToData(String key, DataValue value)
    {
        if (this.data == null)
        {
            this.data = new HashMap<>();
        }
        this.data.put(key, value);
        return this;
    }
    public ProductCategoryResultDetailsCategoryResultDetails setData(HashMap<String, DataValue> data)
    {
        this.data = data;
        return this;
    }
    public ProductCategoryResultDetailsCategoryResultDetails setViewedByUser(ViewedByUserInfo viewedByUser)
    {
        this.viewedByUser = viewedByUser;
        return this;
    }
    public ProductCategoryResultDetailsCategoryResultDetails setCreatedUtc(OffsetDateTime createdUtc)
    {
        this.createdUtc = createdUtc;
        return this;
    }
    public ProductCategoryResultDetailsCategoryResultDetails setLastViewedUtc(@Nullable OffsetDateTime lastViewedUtc)
    {
        this.lastViewedUtc = lastViewedUtc;
        return this;
    }
    public ProductCategoryResultDetailsCategoryResultDetails setViewedTotalNumberOfTimes(Long viewedTotalNumberOfTimes)
    {
        this.viewedTotalNumberOfTimes = viewedTotalNumberOfTimes;
        return this;
    }
    public ProductCategoryResultDetailsCategoryResultDetails setViewedByDifferentNumberOfUsers(Integer viewedByDifferentNumberOfUsers)
    {
        this.viewedByDifferentNumberOfUsers = viewedByDifferentNumberOfUsers;
        return this;
    }
    public ProductCategoryResultDetailsCategoryResultDetails setDisabled(Boolean disabled)
    {
        this.disabled = disabled;
        return this;
    }
    public ProductCategoryResultDetailsCategoryResultDetails setChildCategories(ProductCategoryResultDetails... childCategories)
    {
        this.childCategories = childCategories;
        return this;
    }
    public ProductCategoryResultDetailsCategoryResultDetails setParentCategories(ProductCategoryResultDetails... parentCategories)
    {
        this.parentCategories = parentCategories;
        return this;
    }
}

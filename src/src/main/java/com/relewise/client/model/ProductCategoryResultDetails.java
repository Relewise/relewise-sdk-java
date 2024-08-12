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
    defaultImpl = ProductCategoryResultDetails.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductCategoryResultDetails extends ProductCategoryResultDetailsCategoryResultDetails
{
    public String $type = "Relewise.Client.DataTypes.ProductCategoryResultDetails, Relewise.Client";
    public Integer purchasedFromByDifferentNumberOfUsers;
    public PurchasedByUserInfo purchasedByUser;
    public static ProductCategoryResultDetails create(String categoryId)
    {
        return new ProductCategoryResultDetails(categoryId);
    }
    public ProductCategoryResultDetails(String categoryId)
    {
        this.categoryId = categoryId;
    }
    public ProductCategoryResultDetails()
    {
    }
    public Integer getPurchasedFromByDifferentNumberOfUsers()
    {
        return this.purchasedFromByDifferentNumberOfUsers;
    }
    public PurchasedByUserInfo getPurchasedByUser()
    {
        return this.purchasedByUser;
    }
    public ProductCategoryResultDetails setPurchasedFromByDifferentNumberOfUsers(Integer purchasedFromByDifferentNumberOfUsers)
    {
        this.purchasedFromByDifferentNumberOfUsers = purchasedFromByDifferentNumberOfUsers;
        return this;
    }
    public ProductCategoryResultDetails setPurchasedByUser(PurchasedByUserInfo purchasedByUser)
    {
        this.purchasedByUser = purchasedByUser;
        return this;
    }
    @Override
    public ProductCategoryResultDetails setCategoryId(String categoryId)
    {
        this.categoryId = categoryId;
        return this;
    }
    @Override
    public ProductCategoryResultDetails setDisplayName(Multilingual displayName)
    {
        this.displayName = displayName;
        return this;
    }
    @Override
    public ProductCategoryResultDetails setAssortments(Integer... assortments)
    {
        this.assortments = assortments;
        return this;
    }
    public ProductCategoryResultDetails addToAssortments(Integer assortment)
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
    public ProductCategoryResultDetails addToData(String key, DataValue value)
    {
        if (this.data == null)
        {
            this.data = new HashMap<>();
        }
        this.data.put(key, value);
        return this;
    }
    @Override
    public ProductCategoryResultDetails setData(HashMap<String, DataValue> data)
    {
        this.data = data;
        return this;
    }
    @Override
    public ProductCategoryResultDetails setViewedByUser(ViewedByUserInfo viewedByUser)
    {
        this.viewedByUser = viewedByUser;
        return this;
    }
    @Override
    public ProductCategoryResultDetails setCreatedUtc(OffsetDateTime createdUtc)
    {
        this.createdUtc = createdUtc;
        return this;
    }
    @Override
    public ProductCategoryResultDetails setLastViewedUtc(@Nullable OffsetDateTime lastViewedUtc)
    {
        this.lastViewedUtc = lastViewedUtc;
        return this;
    }
    @Override
    public ProductCategoryResultDetails setViewedTotalNumberOfTimes(Long viewedTotalNumberOfTimes)
    {
        this.viewedTotalNumberOfTimes = viewedTotalNumberOfTimes;
        return this;
    }
    @Override
    public ProductCategoryResultDetails setViewedByDifferentNumberOfUsers(Integer viewedByDifferentNumberOfUsers)
    {
        this.viewedByDifferentNumberOfUsers = viewedByDifferentNumberOfUsers;
        return this;
    }
    @Override
    public ProductCategoryResultDetails setDisabled(Boolean disabled)
    {
        this.disabled = disabled;
        return this;
    }
    @Override
    public ProductCategoryResultDetails setChildCategories(ProductCategoryResultDetails... childCategories)
    {
        this.childCategories = childCategories;
        return this;
    }
    public ProductCategoryResultDetails addToChildCategories(ProductCategoryResultDetails childCategory)
    {
        if (this.childCategories == null)
        {
            this.childCategories = new ProductCategoryResultDetails[] { childCategory };
        }
        else
        {
            ArrayList<ProductCategoryResultDetails> existingList = new ArrayList<>(Arrays.asList(this.childCategories));
            existingList.add(childCategory);
            this.childCategories = existingList.toArray(new ProductCategoryResultDetails[0]);
        }
        return this;
    }
    @Override
    public ProductCategoryResultDetails setParentCategories(ProductCategoryResultDetails... parentCategories)
    {
        this.parentCategories = parentCategories;
        return this;
    }
    public ProductCategoryResultDetails addToParentCategories(ProductCategoryResultDetails parentCategory)
    {
        if (this.parentCategories == null)
        {
            this.parentCategories = new ProductCategoryResultDetails[] { parentCategory };
        }
        else
        {
            ArrayList<ProductCategoryResultDetails> existingList = new ArrayList<>(Arrays.asList(this.parentCategories));
            existingList.add(parentCategory);
            this.parentCategories = existingList.toArray(new ProductCategoryResultDetails[0]);
        }
        return this;
    }
}

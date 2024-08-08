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
    defaultImpl = BrandResultDetails.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BrandResultDetails
{
    public String $type = "Relewise.Client.DataTypes.BrandResultDetails, Relewise.Client";
    public String brandId;
    public String displayName;
    public Integer[] assortments;
    public HashMap<String, DataValue> data;
    public ViewedByUserInfo viewedByUser;
    public OffsetDateTime createdUtc;
    public @Nullable OffsetDateTime lastViewedUtc;
    public Long viewedTotalNumberOfTimes;
    public Integer viewedByDifferentNumberOfUsers;
    public Boolean disabled;
    public Integer purchasedFromByDifferentNumberOfUsers;
    public PurchasedByUserInfo purchasedByUser;
    public static BrandResultDetails create(String brandId)
    {
        return new BrandResultDetails(brandId);
    }
    public BrandResultDetails(String brandId)
    {
        this.brandId = brandId;
    }
    public BrandResultDetails()
    {
    }
    public String getBrandId()
    {
        return this.brandId;
    }
    public String getDisplayName()
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
    public Integer getPurchasedFromByDifferentNumberOfUsers()
    {
        return this.purchasedFromByDifferentNumberOfUsers;
    }
    public PurchasedByUserInfo getPurchasedByUser()
    {
        return this.purchasedByUser;
    }
    public BrandResultDetails setBrandId(String brandId)
    {
        this.brandId = brandId;;
        return this;
    }
    public BrandResultDetails setDisplayName(String displayName)
    {
        this.displayName = displayName;;
        return this;
    }
    public BrandResultDetails setAssortments(Integer... assortments)
    {
        this.assortments = assortments;;
        return this;
    }
    public BrandResultDetails addToAssortments(Integer assortment)
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
    public BrandResultDetails addToData(String key, DataValue value)
    {
        if (this.data == null)
        {
            this.data = new HashMap<>();
        }
        this.data.put(key, value);
        return this;
    }
    public BrandResultDetails setData(HashMap<String, DataValue> data)
    {
        this.data = data;;
        return this;
    }
    public BrandResultDetails setViewedByUser(ViewedByUserInfo viewedByUser)
    {
        this.viewedByUser = viewedByUser;;
        return this;
    }
    public BrandResultDetails setCreatedUtc(OffsetDateTime createdUtc)
    {
        this.createdUtc = createdUtc;;
        return this;
    }
    public BrandResultDetails setLastViewedUtc(@Nullable OffsetDateTime lastViewedUtc)
    {
        this.lastViewedUtc = lastViewedUtc;;
        return this;
    }
    public BrandResultDetails setViewedTotalNumberOfTimes(Long viewedTotalNumberOfTimes)
    {
        this.viewedTotalNumberOfTimes = viewedTotalNumberOfTimes;;
        return this;
    }
    public BrandResultDetails setViewedByDifferentNumberOfUsers(Integer viewedByDifferentNumberOfUsers)
    {
        this.viewedByDifferentNumberOfUsers = viewedByDifferentNumberOfUsers;;
        return this;
    }
    public BrandResultDetails setDisabled(Boolean disabled)
    {
        this.disabled = disabled;;
        return this;
    }
    public BrandResultDetails setPurchasedFromByDifferentNumberOfUsers(Integer purchasedFromByDifferentNumberOfUsers)
    {
        this.purchasedFromByDifferentNumberOfUsers = purchasedFromByDifferentNumberOfUsers;;
        return this;
    }
    public BrandResultDetails setPurchasedByUser(PurchasedByUserInfo purchasedByUser)
    {
        this.purchasedByUser = purchasedByUser;;
        return this;
    }
}

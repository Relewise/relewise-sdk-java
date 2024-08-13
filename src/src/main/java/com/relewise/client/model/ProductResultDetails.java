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
public class ProductResultDetails
{
    public String productId;
    public Multilingual displayName;
    public VariantResult variant;
    public Integer[] assortments;
    public HashMap<String, DataValue> data;
    public CategoryPathResultDetails[] categoryPaths;
    public PurchasedByUserInfo purchasedByUser;
    public ViewedByUserInfo viewedByUser;
    public VariantResultDetails[] allVariants;
    public OffsetDateTime createdUtc;
    public @Nullable OffsetDateTime lastPurchasedUtc;
    public @Nullable OffsetDateTime lastViewedUtc;
    public Long containedInTotalNumberOfOrders;
    public Long viewedTotalNumberOfTimes;
    public Integer purchasedByDifferentNumberOfUsers;
    public Integer viewedByDifferentNumberOfUsers;
    public Boolean disabled;
    public Boolean deleted;
    public MultiCurrency listPrice;
    public MultiCurrency salesPrice;
    public BrandResultDetails brand;
    public VariantResultDetails[] filteredVariants;
    public static ProductResultDetails create(String productId)
    {
        return new ProductResultDetails(productId);
    }
    public ProductResultDetails(String productId)
    {
        this.productId = productId;
    }
    public ProductResultDetails()
    {
    }
    public String getProductId()
    {
        return this.productId;
    }
    public Multilingual getDisplayName()
    {
        return this.displayName;
    }
    public VariantResult getVariant()
    {
        return this.variant;
    }
    public Integer[] getAssortments()
    {
        return this.assortments;
    }
    public HashMap<String, DataValue> getData()
    {
        return this.data;
    }
    public CategoryPathResultDetails[] getCategoryPaths()
    {
        return this.categoryPaths;
    }
    public PurchasedByUserInfo getPurchasedByUser()
    {
        return this.purchasedByUser;
    }
    public ViewedByUserInfo getViewedByUser()
    {
        return this.viewedByUser;
    }
    public VariantResultDetails[] getAllVariants()
    {
        return this.allVariants;
    }
    public OffsetDateTime getCreatedUtc()
    {
        return this.createdUtc;
    }
    public @Nullable OffsetDateTime getLastPurchasedUtc()
    {
        return this.lastPurchasedUtc;
    }
    public @Nullable OffsetDateTime getLastViewedUtc()
    {
        return this.lastViewedUtc;
    }
    public Long getContainedInTotalNumberOfOrders()
    {
        return this.containedInTotalNumberOfOrders;
    }
    public Long getViewedTotalNumberOfTimes()
    {
        return this.viewedTotalNumberOfTimes;
    }
    public Integer getPurchasedByDifferentNumberOfUsers()
    {
        return this.purchasedByDifferentNumberOfUsers;
    }
    public Integer getViewedByDifferentNumberOfUsers()
    {
        return this.viewedByDifferentNumberOfUsers;
    }
    public Boolean getDisabled()
    {
        return this.disabled;
    }
    public Boolean getDeleted()
    {
        return this.deleted;
    }
    public MultiCurrency getListPrice()
    {
        return this.listPrice;
    }
    public MultiCurrency getSalesPrice()
    {
        return this.salesPrice;
    }
    public BrandResultDetails getBrand()
    {
        return this.brand;
    }
    public VariantResultDetails[] getFilteredVariants()
    {
        return this.filteredVariants;
    }
    public ProductResultDetails setProductId(String productId)
    {
        this.productId = productId;
        return this;
    }
    public ProductResultDetails setDisplayName(Multilingual displayName)
    {
        this.displayName = displayName;
        return this;
    }
    public ProductResultDetails setVariant(VariantResult variant)
    {
        this.variant = variant;
        return this;
    }
    public ProductResultDetails setAssortments(Integer... assortments)
    {
        this.assortments = assortments;
        return this;
    }
    public ProductResultDetails addToAssortments(Integer assortment)
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
    public ProductResultDetails addToData(String key, DataValue value)
    {
        if (this.data == null)
        {
            this.data = new HashMap<>();
        }
        this.data.put(key, value);
        return this;
    }
    public ProductResultDetails setData(HashMap<String, DataValue> data)
    {
        this.data = data;
        return this;
    }
    public ProductResultDetails setCategoryPaths(CategoryPathResultDetails... categoryPaths)
    {
        this.categoryPaths = categoryPaths;
        return this;
    }
    public ProductResultDetails addToCategoryPaths(CategoryPathResultDetails categoryPath)
    {
        if (this.categoryPaths == null)
        {
            this.categoryPaths = new CategoryPathResultDetails[] { categoryPath };
        }
        else
        {
            ArrayList<CategoryPathResultDetails> existingList = new ArrayList<>(Arrays.asList(this.categoryPaths));
            existingList.add(categoryPath);
            this.categoryPaths = existingList.toArray(new CategoryPathResultDetails[0]);
        }
        return this;
    }
    public ProductResultDetails setPurchasedByUser(PurchasedByUserInfo purchasedByUser)
    {
        this.purchasedByUser = purchasedByUser;
        return this;
    }
    public ProductResultDetails setViewedByUser(ViewedByUserInfo viewedByUser)
    {
        this.viewedByUser = viewedByUser;
        return this;
    }
    public ProductResultDetails setAllVariants(VariantResultDetails... allVariants)
    {
        this.allVariants = allVariants;
        return this;
    }
    public ProductResultDetails addToAllVariants(VariantResultDetails allVariant)
    {
        if (this.allVariants == null)
        {
            this.allVariants = new VariantResultDetails[] { allVariant };
        }
        else
        {
            ArrayList<VariantResultDetails> existingList = new ArrayList<>(Arrays.asList(this.allVariants));
            existingList.add(allVariant);
            this.allVariants = existingList.toArray(new VariantResultDetails[0]);
        }
        return this;
    }
    public ProductResultDetails setCreatedUtc(OffsetDateTime createdUtc)
    {
        this.createdUtc = createdUtc;
        return this;
    }
    public ProductResultDetails setLastPurchasedUtc(@Nullable OffsetDateTime lastPurchasedUtc)
    {
        this.lastPurchasedUtc = lastPurchasedUtc;
        return this;
    }
    public ProductResultDetails setLastViewedUtc(@Nullable OffsetDateTime lastViewedUtc)
    {
        this.lastViewedUtc = lastViewedUtc;
        return this;
    }
    public ProductResultDetails setContainedInTotalNumberOfOrders(Long containedInTotalNumberOfOrders)
    {
        this.containedInTotalNumberOfOrders = containedInTotalNumberOfOrders;
        return this;
    }
    public ProductResultDetails setViewedTotalNumberOfTimes(Long viewedTotalNumberOfTimes)
    {
        this.viewedTotalNumberOfTimes = viewedTotalNumberOfTimes;
        return this;
    }
    public ProductResultDetails setPurchasedByDifferentNumberOfUsers(Integer purchasedByDifferentNumberOfUsers)
    {
        this.purchasedByDifferentNumberOfUsers = purchasedByDifferentNumberOfUsers;
        return this;
    }
    public ProductResultDetails setViewedByDifferentNumberOfUsers(Integer viewedByDifferentNumberOfUsers)
    {
        this.viewedByDifferentNumberOfUsers = viewedByDifferentNumberOfUsers;
        return this;
    }
    public ProductResultDetails setDisabled(Boolean disabled)
    {
        this.disabled = disabled;
        return this;
    }
    public ProductResultDetails setDeleted(Boolean deleted)
    {
        this.deleted = deleted;
        return this;
    }
    public ProductResultDetails setListPrice(MultiCurrency listPrice)
    {
        this.listPrice = listPrice;
        return this;
    }
    public ProductResultDetails setSalesPrice(MultiCurrency salesPrice)
    {
        this.salesPrice = salesPrice;
        return this;
    }
    public ProductResultDetails setBrand(BrandResultDetails brand)
    {
        this.brand = brand;
        return this;
    }
    public ProductResultDetails setFilteredVariants(VariantResultDetails... filteredVariants)
    {
        this.filteredVariants = filteredVariants;
        return this;
    }
    public ProductResultDetails addToFilteredVariants(VariantResultDetails filteredVariant)
    {
        if (this.filteredVariants == null)
        {
            this.filteredVariants = new VariantResultDetails[] { filteredVariant };
        }
        else
        {
            ArrayList<VariantResultDetails> existingList = new ArrayList<>(Arrays.asList(this.filteredVariants));
            existingList.add(filteredVariant);
            this.filteredVariants = existingList.toArray(new VariantResultDetails[0]);
        }
        return this;
    }
}

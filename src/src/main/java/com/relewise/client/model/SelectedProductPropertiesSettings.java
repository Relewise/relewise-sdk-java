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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class SelectedProductPropertiesSettings
{
    public Boolean displayName;
    public Boolean categoryPaths;
    public Boolean assortments;
    public Boolean pricing;
    public Boolean allData;
    public Boolean viewedByUserInfo;
    public Boolean purchasedByUserInfo;
    public Boolean brand;
    public Boolean allVariants;
    public @Nullable String[] dataKeys;
    public static SelectedProductPropertiesSettings create()
    {
        return new SelectedProductPropertiesSettings();
    }
    public SelectedProductPropertiesSettings()
    {
    }
    public Boolean getDisplayName()
    {
        return this.displayName;
    }
    public Boolean getCategoryPaths()
    {
        return this.categoryPaths;
    }
    public Boolean getAssortments()
    {
        return this.assortments;
    }
    public Boolean getPricing()
    {
        return this.pricing;
    }
    public Boolean getAllData()
    {
        return this.allData;
    }
    public Boolean getViewedByUserInfo()
    {
        return this.viewedByUserInfo;
    }
    public Boolean getPurchasedByUserInfo()
    {
        return this.purchasedByUserInfo;
    }
    public Boolean getBrand()
    {
        return this.brand;
    }
    public Boolean getAllVariants()
    {
        return this.allVariants;
    }
    public @Nullable String[] getDataKeys()
    {
        return this.dataKeys;
    }
    public SelectedProductPropertiesSettings setDisplayName(Boolean displayName)
    {
        this.displayName = displayName;
        return this;
    }
    public SelectedProductPropertiesSettings setCategoryPaths(Boolean categoryPaths)
    {
        this.categoryPaths = categoryPaths;
        return this;
    }
    public SelectedProductPropertiesSettings setAssortments(Boolean assortments)
    {
        this.assortments = assortments;
        return this;
    }
    public SelectedProductPropertiesSettings setPricing(Boolean pricing)
    {
        this.pricing = pricing;
        return this;
    }
    public SelectedProductPropertiesSettings setAllData(Boolean allData)
    {
        this.allData = allData;
        return this;
    }
    public SelectedProductPropertiesSettings setViewedByUserInfo(Boolean viewedByUserInfo)
    {
        this.viewedByUserInfo = viewedByUserInfo;
        return this;
    }
    public SelectedProductPropertiesSettings setPurchasedByUserInfo(Boolean purchasedByUserInfo)
    {
        this.purchasedByUserInfo = purchasedByUserInfo;
        return this;
    }
    public SelectedProductPropertiesSettings setBrand(Boolean brand)
    {
        this.brand = brand;
        return this;
    }
    public SelectedProductPropertiesSettings setAllVariants(Boolean allVariants)
    {
        this.allVariants = allVariants;
        return this;
    }
    public SelectedProductPropertiesSettings setDataKeys(String... dataKeys)
    {
        this.dataKeys = dataKeys;
        return this;
    }
    public SelectedProductPropertiesSettings addToDataKeys(String dataKey)
    {
        if (this.dataKeys == null)
        {
            this.dataKeys = new String[] { dataKey };
        }
        else
        {
            ArrayList<String> existingList = new ArrayList<>(Arrays.asList(this.dataKeys));
            existingList.add(dataKey);
            this.dataKeys = existingList.toArray(new String[0]);
        }
        return this;
    }
}

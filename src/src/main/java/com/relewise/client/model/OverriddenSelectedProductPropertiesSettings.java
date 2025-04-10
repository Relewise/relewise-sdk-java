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
public class OverriddenSelectedProductPropertiesSettings
{
    public @Nullable Boolean displayName;
    public @Nullable Boolean categoryPaths;
    public @Nullable Boolean assortments;
    public @Nullable Boolean pricing;
    public @Nullable Boolean allData;
    public @Nullable Boolean viewedByUserInfo;
    public @Nullable Boolean purchasedByUserInfo;
    public @Nullable Boolean brand;
    public @Nullable Boolean allVariants;
    public String[] dataKeys;
    public static OverriddenSelectedProductPropertiesSettings create()
    {
        return new OverriddenSelectedProductPropertiesSettings();
    }
    public OverriddenSelectedProductPropertiesSettings()
    {
    }
    public @Nullable Boolean getDisplayName()
    {
        return this.displayName;
    }
    public @Nullable Boolean getCategoryPaths()
    {
        return this.categoryPaths;
    }
    public @Nullable Boolean getAssortments()
    {
        return this.assortments;
    }
    public @Nullable Boolean getPricing()
    {
        return this.pricing;
    }
    public @Nullable Boolean getAllData()
    {
        return this.allData;
    }
    public @Nullable Boolean getViewedByUserInfo()
    {
        return this.viewedByUserInfo;
    }
    public @Nullable Boolean getPurchasedByUserInfo()
    {
        return this.purchasedByUserInfo;
    }
    public @Nullable Boolean getBrand()
    {
        return this.brand;
    }
    public @Nullable Boolean getAllVariants()
    {
        return this.allVariants;
    }
    public String[] getDataKeys()
    {
        return this.dataKeys;
    }
    public OverriddenSelectedProductPropertiesSettings setDisplayName(@Nullable Boolean displayName)
    {
        this.displayName = displayName;
        return this;
    }
    public OverriddenSelectedProductPropertiesSettings setCategoryPaths(@Nullable Boolean categoryPaths)
    {
        this.categoryPaths = categoryPaths;
        return this;
    }
    public OverriddenSelectedProductPropertiesSettings setAssortments(@Nullable Boolean assortments)
    {
        this.assortments = assortments;
        return this;
    }
    public OverriddenSelectedProductPropertiesSettings setPricing(@Nullable Boolean pricing)
    {
        this.pricing = pricing;
        return this;
    }
    public OverriddenSelectedProductPropertiesSettings setAllData(@Nullable Boolean allData)
    {
        this.allData = allData;
        return this;
    }
    public OverriddenSelectedProductPropertiesSettings setViewedByUserInfo(@Nullable Boolean viewedByUserInfo)
    {
        this.viewedByUserInfo = viewedByUserInfo;
        return this;
    }
    public OverriddenSelectedProductPropertiesSettings setPurchasedByUserInfo(@Nullable Boolean purchasedByUserInfo)
    {
        this.purchasedByUserInfo = purchasedByUserInfo;
        return this;
    }
    public OverriddenSelectedProductPropertiesSettings setBrand(@Nullable Boolean brand)
    {
        this.brand = brand;
        return this;
    }
    public OverriddenSelectedProductPropertiesSettings setAllVariants(@Nullable Boolean allVariants)
    {
        this.allVariants = allVariants;
        return this;
    }
    public OverriddenSelectedProductPropertiesSettings setDataKeys(String... dataKeys)
    {
        this.dataKeys = dataKeys;
        return this;
    }
    public OverriddenSelectedProductPropertiesSettings addToDataKeys(String dataKey)
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

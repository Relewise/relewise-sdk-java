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
public class SelectedProductDetailsPropertiesSettings
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
    public Boolean viewedByUserCompanyInfo;
    public Boolean purchasedByUserCompanyInfo;
    public @Nullable FilteredVariantsSettings filteredVariants;
    /** Determines whether <code>UserEngagement</code> should be populated when result details are mapped. */
    public Boolean userEngagement;
    public static SelectedProductDetailsPropertiesSettings create()
    {
        return new SelectedProductDetailsPropertiesSettings();
    }
    public SelectedProductDetailsPropertiesSettings()
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
    public Boolean getViewedByUserCompanyInfo()
    {
        return this.viewedByUserCompanyInfo;
    }
    public Boolean getPurchasedByUserCompanyInfo()
    {
        return this.purchasedByUserCompanyInfo;
    }
    public @Nullable FilteredVariantsSettings getFilteredVariants()
    {
        return this.filteredVariants;
    }
    /** Determines whether <code>UserEngagement</code> should be populated when result details are mapped. */
    public Boolean getUserEngagement()
    {
        return this.userEngagement;
    }
    public SelectedProductDetailsPropertiesSettings setDisplayName(Boolean displayName)
    {
        this.displayName = displayName;
        return this;
    }
    public SelectedProductDetailsPropertiesSettings setCategoryPaths(Boolean categoryPaths)
    {
        this.categoryPaths = categoryPaths;
        return this;
    }
    public SelectedProductDetailsPropertiesSettings setAssortments(Boolean assortments)
    {
        this.assortments = assortments;
        return this;
    }
    public SelectedProductDetailsPropertiesSettings setPricing(Boolean pricing)
    {
        this.pricing = pricing;
        return this;
    }
    public SelectedProductDetailsPropertiesSettings setAllData(Boolean allData)
    {
        this.allData = allData;
        return this;
    }
    public SelectedProductDetailsPropertiesSettings setViewedByUserInfo(Boolean viewedByUserInfo)
    {
        this.viewedByUserInfo = viewedByUserInfo;
        return this;
    }
    public SelectedProductDetailsPropertiesSettings setPurchasedByUserInfo(Boolean purchasedByUserInfo)
    {
        this.purchasedByUserInfo = purchasedByUserInfo;
        return this;
    }
    public SelectedProductDetailsPropertiesSettings setBrand(Boolean brand)
    {
        this.brand = brand;
        return this;
    }
    public SelectedProductDetailsPropertiesSettings setAllVariants(Boolean allVariants)
    {
        this.allVariants = allVariants;
        return this;
    }
    public SelectedProductDetailsPropertiesSettings setDataKeys(String... dataKeys)
    {
        this.dataKeys = dataKeys;
        return this;
    }
    public SelectedProductDetailsPropertiesSettings addToDataKeys(String dataKey)
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
    public SelectedProductDetailsPropertiesSettings setViewedByUserCompanyInfo(Boolean viewedByUserCompanyInfo)
    {
        this.viewedByUserCompanyInfo = viewedByUserCompanyInfo;
        return this;
    }
    public SelectedProductDetailsPropertiesSettings setPurchasedByUserCompanyInfo(Boolean purchasedByUserCompanyInfo)
    {
        this.purchasedByUserCompanyInfo = purchasedByUserCompanyInfo;
        return this;
    }
    public SelectedProductDetailsPropertiesSettings setFilteredVariants(@Nullable FilteredVariantsSettings filteredVariants)
    {
        this.filteredVariants = filteredVariants;
        return this;
    }
    /** Determines whether <code>UserEngagement</code> should be populated when result details are mapped. */
    public SelectedProductDetailsPropertiesSettings setUserEngagement(Boolean userEngagement)
    {
        this.userEngagement = userEngagement;
        return this;
    }
}

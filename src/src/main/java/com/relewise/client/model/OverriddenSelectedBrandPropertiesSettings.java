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
public class OverriddenSelectedBrandPropertiesSettings
{
    public @Nullable Boolean displayName;
    public @Nullable Boolean assortments;
    public @Nullable Boolean viewedByUserInfo;
    public @Nullable Boolean allData;
    public String[] dataKeys;
    public static OverriddenSelectedBrandPropertiesSettings create()
    {
        return new OverriddenSelectedBrandPropertiesSettings();
    }
    public OverriddenSelectedBrandPropertiesSettings()
    {
    }
    public @Nullable Boolean getDisplayName()
    {
        return this.displayName;
    }
    public @Nullable Boolean getAssortments()
    {
        return this.assortments;
    }
    public @Nullable Boolean getViewedByUserInfo()
    {
        return this.viewedByUserInfo;
    }
    public @Nullable Boolean getAllData()
    {
        return this.allData;
    }
    public String[] getDataKeys()
    {
        return this.dataKeys;
    }
    public OverriddenSelectedBrandPropertiesSettings setDisplayName(@Nullable Boolean displayName)
    {
        this.displayName = displayName;
        return this;
    }
    public OverriddenSelectedBrandPropertiesSettings setAssortments(@Nullable Boolean assortments)
    {
        this.assortments = assortments;
        return this;
    }
    public OverriddenSelectedBrandPropertiesSettings setViewedByUserInfo(@Nullable Boolean viewedByUserInfo)
    {
        this.viewedByUserInfo = viewedByUserInfo;
        return this;
    }
    public OverriddenSelectedBrandPropertiesSettings setAllData(@Nullable Boolean allData)
    {
        this.allData = allData;
        return this;
    }
    public OverriddenSelectedBrandPropertiesSettings setDataKeys(String... dataKeys)
    {
        this.dataKeys = dataKeys;
        return this;
    }
    public OverriddenSelectedBrandPropertiesSettings addToDataKeys(String dataKey)
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

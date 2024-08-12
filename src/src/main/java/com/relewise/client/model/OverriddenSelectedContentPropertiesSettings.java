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
public class OverriddenSelectedContentPropertiesSettings
{
    public @Nullable Boolean displayName;
    public @Nullable Boolean categoryPaths;
    public @Nullable Boolean assortments;
    public @Nullable Boolean allData;
    public @Nullable Boolean viewedByUserInfo;
    public String[] dataKeys;
    public static OverriddenSelectedContentPropertiesSettings create()
    {
        return new OverriddenSelectedContentPropertiesSettings();
    }
    public OverriddenSelectedContentPropertiesSettings()
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
    public @Nullable Boolean getAllData()
    {
        return this.allData;
    }
    public @Nullable Boolean getViewedByUserInfo()
    {
        return this.viewedByUserInfo;
    }
    public String[] getDataKeys()
    {
        return this.dataKeys;
    }
    public OverriddenSelectedContentPropertiesSettings setDisplayName(@Nullable Boolean displayName)
    {
        this.displayName = displayName;
        return this;
    }
    public OverriddenSelectedContentPropertiesSettings setCategoryPaths(@Nullable Boolean categoryPaths)
    {
        this.categoryPaths = categoryPaths;
        return this;
    }
    public OverriddenSelectedContentPropertiesSettings setAssortments(@Nullable Boolean assortments)
    {
        this.assortments = assortments;
        return this;
    }
    public OverriddenSelectedContentPropertiesSettings setAllData(@Nullable Boolean allData)
    {
        this.allData = allData;
        return this;
    }
    public OverriddenSelectedContentPropertiesSettings setViewedByUserInfo(@Nullable Boolean viewedByUserInfo)
    {
        this.viewedByUserInfo = viewedByUserInfo;
        return this;
    }
    public OverriddenSelectedContentPropertiesSettings setDataKeys(String... dataKeys)
    {
        this.dataKeys = dataKeys;
        return this;
    }
    public OverriddenSelectedContentPropertiesSettings addToDataKeys(String dataKey)
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

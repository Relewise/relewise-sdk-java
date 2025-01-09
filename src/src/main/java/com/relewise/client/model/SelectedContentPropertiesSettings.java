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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class SelectedContentPropertiesSettings
{
    public Boolean displayName;
    public Boolean categoryPaths;
    public Boolean assortments;
    public Boolean allData;
    public Boolean viewedByUserInfo;
    public @Nullable String[] dataKeys;
    public static SelectedContentPropertiesSettings create()
    {
        return new SelectedContentPropertiesSettings();
    }
    public SelectedContentPropertiesSettings()
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
    public Boolean getAllData()
    {
        return this.allData;
    }
    public Boolean getViewedByUserInfo()
    {
        return this.viewedByUserInfo;
    }
    public @Nullable String[] getDataKeys()
    {
        return this.dataKeys;
    }
    public SelectedContentPropertiesSettings setDisplayName(Boolean displayName)
    {
        this.displayName = displayName;
        return this;
    }
    public SelectedContentPropertiesSettings setCategoryPaths(Boolean categoryPaths)
    {
        this.categoryPaths = categoryPaths;
        return this;
    }
    public SelectedContentPropertiesSettings setAssortments(Boolean assortments)
    {
        this.assortments = assortments;
        return this;
    }
    public SelectedContentPropertiesSettings setAllData(Boolean allData)
    {
        this.allData = allData;
        return this;
    }
    public SelectedContentPropertiesSettings setViewedByUserInfo(Boolean viewedByUserInfo)
    {
        this.viewedByUserInfo = viewedByUserInfo;
        return this;
    }
    public SelectedContentPropertiesSettings setDataKeys(String... dataKeys)
    {
        this.dataKeys = dataKeys;
        return this;
    }
    public SelectedContentPropertiesSettings addToDataKeys(String dataKey)
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

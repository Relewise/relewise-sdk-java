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
public class SelectedContentCategoryPropertiesSettings
{
    public Boolean displayName;
    public Boolean paths;
    public Boolean assortments;
    public Boolean viewedByUserInfo;
    public Boolean allData;
    public String[] dataKeys;
    public static SelectedContentCategoryPropertiesSettings create()
    {
        return new SelectedContentCategoryPropertiesSettings();
    }
    public SelectedContentCategoryPropertiesSettings()
    {
    }
    public Boolean getDisplayName()
    {
        return this.displayName;
    }
    public Boolean getPaths()
    {
        return this.paths;
    }
    public Boolean getAssortments()
    {
        return this.assortments;
    }
    public Boolean getViewedByUserInfo()
    {
        return this.viewedByUserInfo;
    }
    public Boolean getAllData()
    {
        return this.allData;
    }
    public String[] getDataKeys()
    {
        return this.dataKeys;
    }
    public SelectedContentCategoryPropertiesSettings setDisplayName(Boolean displayName)
    {
        this.displayName = displayName;
        return this;
    }
    public SelectedContentCategoryPropertiesSettings setPaths(Boolean paths)
    {
        this.paths = paths;
        return this;
    }
    public SelectedContentCategoryPropertiesSettings setAssortments(Boolean assortments)
    {
        this.assortments = assortments;
        return this;
    }
    public SelectedContentCategoryPropertiesSettings setViewedByUserInfo(Boolean viewedByUserInfo)
    {
        this.viewedByUserInfo = viewedByUserInfo;
        return this;
    }
    public SelectedContentCategoryPropertiesSettings setAllData(Boolean allData)
    {
        this.allData = allData;
        return this;
    }
    public SelectedContentCategoryPropertiesSettings setDataKeys(String... dataKeys)
    {
        this.dataKeys = dataKeys;
        return this;
    }
    public SelectedContentCategoryPropertiesSettings addToDataKeys(String dataKey)
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

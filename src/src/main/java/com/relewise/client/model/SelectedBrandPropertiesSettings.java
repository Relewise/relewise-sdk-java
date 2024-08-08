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
public class SelectedBrandPropertiesSettings
{
    public Boolean displayName;
    public Boolean assortments;
    public Boolean viewedByUserInfo;
    public Boolean allData;
    public @Nullable String[] dataKeys;
    public static SelectedBrandPropertiesSettings create()
    {
        return new SelectedBrandPropertiesSettings();
    }
    public SelectedBrandPropertiesSettings()
    {
    }
    public Boolean getDisplayName()
    {
        return this.displayName;
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
    public @Nullable String[] getDataKeys()
    {
        return this.dataKeys;
    }
    public SelectedBrandPropertiesSettings setDisplayName(Boolean displayName)
    {
        this.displayName = displayName;;
        return this;
    }
    public SelectedBrandPropertiesSettings setAssortments(Boolean assortments)
    {
        this.assortments = assortments;;
        return this;
    }
    public SelectedBrandPropertiesSettings setViewedByUserInfo(Boolean viewedByUserInfo)
    {
        this.viewedByUserInfo = viewedByUserInfo;;
        return this;
    }
    public SelectedBrandPropertiesSettings setAllData(Boolean allData)
    {
        this.allData = allData;;
        return this;
    }
    public SelectedBrandPropertiesSettings setDataKeys(String... dataKeys)
    {
        this.dataKeys = dataKeys;;
        return this;
    }
    public SelectedBrandPropertiesSettings addToDataKeys(String dataKey)
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

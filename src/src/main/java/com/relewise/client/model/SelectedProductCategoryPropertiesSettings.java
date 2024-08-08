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
    defaultImpl = SelectedProductCategoryPropertiesSettings.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SelectedProductCategoryPropertiesSettings
{
    public String $type = "Relewise.Client.Requests.Shared.SelectedProductCategoryPropertiesSettings, Relewise.Client";
    public Boolean displayName;
    public Boolean paths;
    public Boolean assortments;
    public Boolean viewedByUserInfo;
    public Boolean allData;
    public String[] dataKeys;
    public static SelectedProductCategoryPropertiesSettings create()
    {
        return new SelectedProductCategoryPropertiesSettings();
    }
    public SelectedProductCategoryPropertiesSettings()
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
    public SelectedProductCategoryPropertiesSettings setDisplayName(Boolean displayName)
    {
        this.displayName = displayName;;
        return this;
    }
    public SelectedProductCategoryPropertiesSettings setPaths(Boolean paths)
    {
        this.paths = paths;;
        return this;
    }
    public SelectedProductCategoryPropertiesSettings setAssortments(Boolean assortments)
    {
        this.assortments = assortments;;
        return this;
    }
    public SelectedProductCategoryPropertiesSettings setViewedByUserInfo(Boolean viewedByUserInfo)
    {
        this.viewedByUserInfo = viewedByUserInfo;;
        return this;
    }
    public SelectedProductCategoryPropertiesSettings setAllData(Boolean allData)
    {
        this.allData = allData;;
        return this;
    }
    public SelectedProductCategoryPropertiesSettings setDataKeys(String... dataKeys)
    {
        this.dataKeys = dataKeys;;
        return this;
    }
    public SelectedProductCategoryPropertiesSettings addToDataKeys(String dataKey)
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

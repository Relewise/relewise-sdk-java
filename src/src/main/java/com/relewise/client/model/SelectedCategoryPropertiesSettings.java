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
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = SelectedProductCategoryPropertiesSettings.class, name = "Relewise.Client.Requests.Shared.SelectedProductCategoryPropertiesSettings, Relewise.Client"),
    @JsonSubTypes.Type(value = SelectedContentCategoryPropertiesSettings.class, name = "Relewise.Client.Requests.Shared.SelectedContentCategoryPropertiesSettings, Relewise.Client"),
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class SelectedCategoryPropertiesSettings
{
    public String $type = "";
    public Boolean displayName;
    public Boolean paths;
    public Boolean assortments;
    public Boolean viewedByUserInfo;
    public Boolean allData;
    public String[] dataKeys;
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
    public SelectedCategoryPropertiesSettings setDisplayName(Boolean displayName)
    {
        this.displayName = displayName;
        return this;
    }
    public SelectedCategoryPropertiesSettings setPaths(Boolean paths)
    {
        this.paths = paths;
        return this;
    }
    public SelectedCategoryPropertiesSettings setAssortments(Boolean assortments)
    {
        this.assortments = assortments;
        return this;
    }
    public SelectedCategoryPropertiesSettings setViewedByUserInfo(Boolean viewedByUserInfo)
    {
        this.viewedByUserInfo = viewedByUserInfo;
        return this;
    }
    public SelectedCategoryPropertiesSettings setAllData(Boolean allData)
    {
        this.allData = allData;
        return this;
    }
    public SelectedCategoryPropertiesSettings setDataKeys(String... dataKeys)
    {
        this.dataKeys = dataKeys;
        return this;
    }
    public SelectedCategoryPropertiesSettings addToDataKeys(String dataKey)
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

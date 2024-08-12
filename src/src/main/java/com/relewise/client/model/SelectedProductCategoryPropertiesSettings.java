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
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = SelectedProductCategoryPropertiesSettings.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SelectedProductCategoryPropertiesSettings extends SelectedCategoryPropertiesSettings
{
    public String $type = "Relewise.Client.Requests.Shared.SelectedProductCategoryPropertiesSettings, Relewise.Client";
    public static SelectedProductCategoryPropertiesSettings create()
    {
        return new SelectedProductCategoryPropertiesSettings();
    }
    public SelectedProductCategoryPropertiesSettings()
    {
    }
    @Override
    public SelectedProductCategoryPropertiesSettings setDisplayName(Boolean displayName)
    {
        this.displayName = displayName;
        return this;
    }
    @Override
    public SelectedProductCategoryPropertiesSettings setPaths(Boolean paths)
    {
        this.paths = paths;
        return this;
    }
    @Override
    public SelectedProductCategoryPropertiesSettings setAssortments(Boolean assortments)
    {
        this.assortments = assortments;
        return this;
    }
    @Override
    public SelectedProductCategoryPropertiesSettings setViewedByUserInfo(Boolean viewedByUserInfo)
    {
        this.viewedByUserInfo = viewedByUserInfo;
        return this;
    }
    @Override
    public SelectedProductCategoryPropertiesSettings setAllData(Boolean allData)
    {
        this.allData = allData;
        return this;
    }
    @Override
    public SelectedProductCategoryPropertiesSettings setDataKeys(String... dataKeys)
    {
        this.dataKeys = dataKeys;
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

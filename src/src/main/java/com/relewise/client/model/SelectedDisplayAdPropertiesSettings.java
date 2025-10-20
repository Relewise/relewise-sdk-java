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
public class SelectedDisplayAdPropertiesSettings
{
    public Boolean displayName;
    public Boolean allData;
    public @Nullable String[] dataKeys;
    public Boolean clickedByUserInfo;
    public static SelectedDisplayAdPropertiesSettings create()
    {
        return new SelectedDisplayAdPropertiesSettings();
    }
    public SelectedDisplayAdPropertiesSettings()
    {
    }
    public Boolean getDisplayName()
    {
        return this.displayName;
    }
    public Boolean getAllData()
    {
        return this.allData;
    }
    public @Nullable String[] getDataKeys()
    {
        return this.dataKeys;
    }
    public Boolean getClickedByUserInfo()
    {
        return this.clickedByUserInfo;
    }
    public SelectedDisplayAdPropertiesSettings setDisplayName(Boolean displayName)
    {
        this.displayName = displayName;
        return this;
    }
    public SelectedDisplayAdPropertiesSettings setAllData(Boolean allData)
    {
        this.allData = allData;
        return this;
    }
    public SelectedDisplayAdPropertiesSettings setDataKeys(String... dataKeys)
    {
        this.dataKeys = dataKeys;
        return this;
    }
    public SelectedDisplayAdPropertiesSettings addToDataKeys(String dataKey)
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
    public SelectedDisplayAdPropertiesSettings setClickedByUserInfo(Boolean clickedByUserInfo)
    {
        this.clickedByUserInfo = clickedByUserInfo;
        return this;
    }
}

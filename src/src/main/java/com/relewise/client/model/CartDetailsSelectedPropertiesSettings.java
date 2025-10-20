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
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = CartDetailsSelectedPropertiesSettings.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CartDetailsSelectedPropertiesSettings
{
    public String $type = "Relewise.Client.DataTypes.CartDetails+SelectedPropertiesSettings, Relewise.Client";
    public Boolean allData;
    public @Nullable String[] dataKeys;
    public @Nullable LineItemSelectedPropertiesSettings lineItems;
    public static CartDetailsSelectedPropertiesSettings create()
    {
        return new CartDetailsSelectedPropertiesSettings();
    }
    public CartDetailsSelectedPropertiesSettings()
    {
    }
    public Boolean getAllData()
    {
        return this.allData;
    }
    public @Nullable String[] getDataKeys()
    {
        return this.dataKeys;
    }
    public @Nullable LineItemSelectedPropertiesSettings getLineItems()
    {
        return this.lineItems;
    }
    public CartDetailsSelectedPropertiesSettings setAllData(Boolean allData)
    {
        this.allData = allData;
        return this;
    }
    public CartDetailsSelectedPropertiesSettings setDataKeys(String... dataKeys)
    {
        this.dataKeys = dataKeys;
        return this;
    }
    public CartDetailsSelectedPropertiesSettings addToDataKeys(String dataKey)
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
    public CartDetailsSelectedPropertiesSettings setLineItems(@Nullable LineItemSelectedPropertiesSettings lineItems)
    {
        this.lineItems = lineItems;
        return this;
    }
}

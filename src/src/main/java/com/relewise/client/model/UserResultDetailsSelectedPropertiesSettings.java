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
    defaultImpl = UserResultDetailsSelectedPropertiesSettings.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserResultDetailsSelectedPropertiesSettings
{
    public String $type = "Relewise.Client.DataTypes.UserResultDetails+SelectedPropertiesSettings, Relewise.Client";
    public Boolean allClassifications;
    public @Nullable String[] classificationKeys;
    public @Nullable CartDetailsSelectedPropertiesSettings carts;
    public Boolean allIdentifiers;
    public @Nullable String[] identifierKeys;
    public Boolean allData;
    public @Nullable String[] dataKeys;
    public static UserResultDetailsSelectedPropertiesSettings create()
    {
        return new UserResultDetailsSelectedPropertiesSettings();
    }
    public UserResultDetailsSelectedPropertiesSettings()
    {
    }
    public Boolean getAllClassifications()
    {
        return this.allClassifications;
    }
    public @Nullable String[] getClassificationKeys()
    {
        return this.classificationKeys;
    }
    public @Nullable CartDetailsSelectedPropertiesSettings getCarts()
    {
        return this.carts;
    }
    public Boolean getAllIdentifiers()
    {
        return this.allIdentifiers;
    }
    public @Nullable String[] getIdentifierKeys()
    {
        return this.identifierKeys;
    }
    public Boolean getAllData()
    {
        return this.allData;
    }
    public @Nullable String[] getDataKeys()
    {
        return this.dataKeys;
    }
    public UserResultDetailsSelectedPropertiesSettings setAllClassifications(Boolean allClassifications)
    {
        this.allClassifications = allClassifications;
        return this;
    }
    public UserResultDetailsSelectedPropertiesSettings setClassificationKeys(String... classificationKeys)
    {
        this.classificationKeys = classificationKeys;
        return this;
    }
    public UserResultDetailsSelectedPropertiesSettings addToClassificationKeys(String classificationKey)
    {
        if (this.classificationKeys == null)
        {
            this.classificationKeys = new String[] { classificationKey };
        }
        else
        {
            ArrayList<String> existingList = new ArrayList<>(Arrays.asList(this.classificationKeys));
            existingList.add(classificationKey);
            this.classificationKeys = existingList.toArray(new String[0]);
        }
        return this;
    }
    public UserResultDetailsSelectedPropertiesSettings setCarts(@Nullable CartDetailsSelectedPropertiesSettings carts)
    {
        this.carts = carts;
        return this;
    }
    public UserResultDetailsSelectedPropertiesSettings setAllIdentifiers(Boolean allIdentifiers)
    {
        this.allIdentifiers = allIdentifiers;
        return this;
    }
    public UserResultDetailsSelectedPropertiesSettings setIdentifierKeys(String... identifierKeys)
    {
        this.identifierKeys = identifierKeys;
        return this;
    }
    public UserResultDetailsSelectedPropertiesSettings addToIdentifierKeys(String identifierKey)
    {
        if (this.identifierKeys == null)
        {
            this.identifierKeys = new String[] { identifierKey };
        }
        else
        {
            ArrayList<String> existingList = new ArrayList<>(Arrays.asList(this.identifierKeys));
            existingList.add(identifierKey);
            this.identifierKeys = existingList.toArray(new String[0]);
        }
        return this;
    }
    public UserResultDetailsSelectedPropertiesSettings setAllData(Boolean allData)
    {
        this.allData = allData;
        return this;
    }
    public UserResultDetailsSelectedPropertiesSettings setDataKeys(String... dataKeys)
    {
        this.dataKeys = dataKeys;
        return this;
    }
    public UserResultDetailsSelectedPropertiesSettings addToDataKeys(String dataKey)
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

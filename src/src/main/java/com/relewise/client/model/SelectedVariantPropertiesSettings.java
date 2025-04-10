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
public class SelectedVariantPropertiesSettings
{
    public Boolean displayName;
    public Boolean pricing;
    public Boolean allSpecifications;
    public Boolean assortments;
    public Boolean allData;
    public @Nullable String[] dataKeys;
    public @Nullable String[] specificationKeys;
    public static SelectedVariantPropertiesSettings create()
    {
        return new SelectedVariantPropertiesSettings();
    }
    public SelectedVariantPropertiesSettings()
    {
    }
    public Boolean getDisplayName()
    {
        return this.displayName;
    }
    public Boolean getPricing()
    {
        return this.pricing;
    }
    public Boolean getAllSpecifications()
    {
        return this.allSpecifications;
    }
    public Boolean getAssortments()
    {
        return this.assortments;
    }
    public Boolean getAllData()
    {
        return this.allData;
    }
    public @Nullable String[] getDataKeys()
    {
        return this.dataKeys;
    }
    public @Nullable String[] getSpecificationKeys()
    {
        return this.specificationKeys;
    }
    public SelectedVariantPropertiesSettings setDisplayName(Boolean displayName)
    {
        this.displayName = displayName;
        return this;
    }
    public SelectedVariantPropertiesSettings setPricing(Boolean pricing)
    {
        this.pricing = pricing;
        return this;
    }
    public SelectedVariantPropertiesSettings setAllSpecifications(Boolean allSpecifications)
    {
        this.allSpecifications = allSpecifications;
        return this;
    }
    public SelectedVariantPropertiesSettings setAssortments(Boolean assortments)
    {
        this.assortments = assortments;
        return this;
    }
    public SelectedVariantPropertiesSettings setAllData(Boolean allData)
    {
        this.allData = allData;
        return this;
    }
    public SelectedVariantPropertiesSettings setDataKeys(String... dataKeys)
    {
        this.dataKeys = dataKeys;
        return this;
    }
    public SelectedVariantPropertiesSettings addToDataKeys(String dataKey)
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
    public SelectedVariantPropertiesSettings setSpecificationKeys(String... specificationKeys)
    {
        this.specificationKeys = specificationKeys;
        return this;
    }
    public SelectedVariantPropertiesSettings addToSpecificationKeys(String specificationKey)
    {
        if (this.specificationKeys == null)
        {
            this.specificationKeys = new String[] { specificationKey };
        }
        else
        {
            ArrayList<String> existingList = new ArrayList<>(Arrays.asList(this.specificationKeys));
            existingList.add(specificationKey);
            this.specificationKeys = existingList.toArray(new String[0]);
        }
        return this;
    }
}

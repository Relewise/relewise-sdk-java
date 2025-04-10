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
public class OverriddenSelectedVariantPropertiesSettings
{
    public @Nullable Boolean displayName;
    public @Nullable Boolean pricing;
    public @Nullable Boolean allSpecifications;
    public @Nullable Boolean assortments;
    public @Nullable Boolean allData;
    public String[] dataKeys;
    public String[] specificationKeys;
    public static OverriddenSelectedVariantPropertiesSettings create()
    {
        return new OverriddenSelectedVariantPropertiesSettings();
    }
    public OverriddenSelectedVariantPropertiesSettings()
    {
    }
    public @Nullable Boolean getDisplayName()
    {
        return this.displayName;
    }
    public @Nullable Boolean getPricing()
    {
        return this.pricing;
    }
    public @Nullable Boolean getAllSpecifications()
    {
        return this.allSpecifications;
    }
    public @Nullable Boolean getAssortments()
    {
        return this.assortments;
    }
    public @Nullable Boolean getAllData()
    {
        return this.allData;
    }
    public String[] getDataKeys()
    {
        return this.dataKeys;
    }
    public String[] getSpecificationKeys()
    {
        return this.specificationKeys;
    }
    public OverriddenSelectedVariantPropertiesSettings setDisplayName(@Nullable Boolean displayName)
    {
        this.displayName = displayName;
        return this;
    }
    public OverriddenSelectedVariantPropertiesSettings setPricing(@Nullable Boolean pricing)
    {
        this.pricing = pricing;
        return this;
    }
    public OverriddenSelectedVariantPropertiesSettings setAllSpecifications(@Nullable Boolean allSpecifications)
    {
        this.allSpecifications = allSpecifications;
        return this;
    }
    public OverriddenSelectedVariantPropertiesSettings setAssortments(@Nullable Boolean assortments)
    {
        this.assortments = assortments;
        return this;
    }
    public OverriddenSelectedVariantPropertiesSettings setAllData(@Nullable Boolean allData)
    {
        this.allData = allData;
        return this;
    }
    public OverriddenSelectedVariantPropertiesSettings setDataKeys(String... dataKeys)
    {
        this.dataKeys = dataKeys;
        return this;
    }
    public OverriddenSelectedVariantPropertiesSettings addToDataKeys(String dataKey)
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
    public OverriddenSelectedVariantPropertiesSettings setSpecificationKeys(String... specificationKeys)
    {
        this.specificationKeys = specificationKeys;
        return this;
    }
    public OverriddenSelectedVariantPropertiesSettings addToSpecificationKeys(String specificationKey)
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

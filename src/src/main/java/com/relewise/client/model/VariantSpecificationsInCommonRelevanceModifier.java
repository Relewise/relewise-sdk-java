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
    defaultImpl = VariantSpecificationsInCommonRelevanceModifier.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class VariantSpecificationsInCommonRelevanceModifier extends RelevanceModifier implements IVariantRelevanceModifier
{
    public String $type = "Relewise.Client.Requests.RelevanceModifiers.VariantSpecificationsInCommonRelevanceModifier, Relewise.Client";
    public KeyMultiplier[] specificationKeysAndMultipliers;
    public static VariantSpecificationsInCommonRelevanceModifier create(KeyMultiplier... specificationKeysAndMultipliers)
    {
        return new VariantSpecificationsInCommonRelevanceModifier(specificationKeysAndMultipliers);
    }
    public VariantSpecificationsInCommonRelevanceModifier(KeyMultiplier... specificationKeysAndMultipliers)
    {
        this.specificationKeysAndMultipliers = specificationKeysAndMultipliers;
    }
    public VariantSpecificationsInCommonRelevanceModifier()
    {
    }
    public KeyMultiplier[] getSpecificationKeysAndMultipliers()
    {
        return this.specificationKeysAndMultipliers;
    }
    public VariantSpecificationsInCommonRelevanceModifier setSpecificationKeysAndMultipliers(KeyMultiplier... specificationKeysAndMultipliers)
    {
        this.specificationKeysAndMultipliers = specificationKeysAndMultipliers;;
        return this;
    }
    public VariantSpecificationsInCommonRelevanceModifier addToSpecificationKeysAndMultipliers(KeyMultiplier specificationKeysAndMultiplier)
    {
        if (this.specificationKeysAndMultipliers == null)
        {
            this.specificationKeysAndMultipliers = new KeyMultiplier[] { specificationKeysAndMultiplier };
        }
        else
        {
            ArrayList<KeyMultiplier> existingList = new ArrayList<>(Arrays.asList(this.specificationKeysAndMultipliers));
            existingList.add(specificationKeysAndMultiplier);
            this.specificationKeysAndMultipliers = existingList.toArray(new KeyMultiplier[0]);
        }
        return this;
    }
    @Override
    public VariantSpecificationsInCommonRelevanceModifier setFilters(FilterCollection filters)
    {
        this.filters = filters;;
        return this;
    }
}

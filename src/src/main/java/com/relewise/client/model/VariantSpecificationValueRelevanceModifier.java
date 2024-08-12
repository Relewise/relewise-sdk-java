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
    defaultImpl = VariantSpecificationValueRelevanceModifier.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class VariantSpecificationValueRelevanceModifier extends RelevanceModifier implements IVariantRelevanceModifier
{
    public String $type = "Relewise.Client.Requests.RelevanceModifiers.VariantSpecificationValueRelevanceModifier, Relewise.Client";
    public String key;
    public String value;
    public Double ifIdenticalMultiplyWeightBy;
    public Double ifNotIdenticalMultiplyWeightBy;
    public Boolean ifSpecificationKeyNotFoundApplyNotEqualMultiplier;
    public static VariantSpecificationValueRelevanceModifier create(String key, String value)
    {
        return new VariantSpecificationValueRelevanceModifier(key, value);
    }
    public VariantSpecificationValueRelevanceModifier(String key, String value)
    {
        this.key = key;
        this.value = value;
        this.ifIdenticalMultiplyWeightBy = 1d;
        this.ifNotIdenticalMultiplyWeightBy = 0d;
        this.ifSpecificationKeyNotFoundApplyNotEqualMultiplier = false;
    }
    public static VariantSpecificationValueRelevanceModifier create(String key, String value, Double ifIdenticalMultiplyWeightBy, Double ifNotIdenticalMultiplyWeightBy, Boolean ifSpecificationKeyNotFoundApplyNotEqualMultiplier)
    {
        return new VariantSpecificationValueRelevanceModifier(key, value, ifIdenticalMultiplyWeightBy, ifNotIdenticalMultiplyWeightBy, ifSpecificationKeyNotFoundApplyNotEqualMultiplier);
    }
    public VariantSpecificationValueRelevanceModifier(String key, String value, Double ifIdenticalMultiplyWeightBy, Double ifNotIdenticalMultiplyWeightBy, Boolean ifSpecificationKeyNotFoundApplyNotEqualMultiplier)
    {
        this.key = key;
        this.value = value;
        this.ifIdenticalMultiplyWeightBy = ifIdenticalMultiplyWeightBy;
        this.ifNotIdenticalMultiplyWeightBy = ifNotIdenticalMultiplyWeightBy;
        this.ifSpecificationKeyNotFoundApplyNotEqualMultiplier = ifSpecificationKeyNotFoundApplyNotEqualMultiplier;
    }
    public VariantSpecificationValueRelevanceModifier()
    {
        this.ifIdenticalMultiplyWeightBy = 1d;
        this.ifNotIdenticalMultiplyWeightBy = 0d;
        this.ifSpecificationKeyNotFoundApplyNotEqualMultiplier = false;
    }
    public String getKey()
    {
        return this.key;
    }
    public String getValue()
    {
        return this.value;
    }
    public Double getIfIdenticalMultiplyWeightBy()
    {
        return this.ifIdenticalMultiplyWeightBy;
    }
    public Double getIfNotIdenticalMultiplyWeightBy()
    {
        return this.ifNotIdenticalMultiplyWeightBy;
    }
    public Boolean getIfSpecificationKeyNotFoundApplyNotEqualMultiplier()
    {
        return this.ifSpecificationKeyNotFoundApplyNotEqualMultiplier;
    }
    public VariantSpecificationValueRelevanceModifier setKey(String key)
    {
        this.key = key;
        return this;
    }
    public VariantSpecificationValueRelevanceModifier setValue(String value)
    {
        this.value = value;
        return this;
    }
    public VariantSpecificationValueRelevanceModifier setIfIdenticalMultiplyWeightBy(Double ifIdenticalMultiplyWeightBy)
    {
        this.ifIdenticalMultiplyWeightBy = ifIdenticalMultiplyWeightBy;
        return this;
    }
    public VariantSpecificationValueRelevanceModifier setIfNotIdenticalMultiplyWeightBy(Double ifNotIdenticalMultiplyWeightBy)
    {
        this.ifNotIdenticalMultiplyWeightBy = ifNotIdenticalMultiplyWeightBy;
        return this;
    }
    public VariantSpecificationValueRelevanceModifier setIfSpecificationKeyNotFoundApplyNotEqualMultiplier(Boolean ifSpecificationKeyNotFoundApplyNotEqualMultiplier)
    {
        this.ifSpecificationKeyNotFoundApplyNotEqualMultiplier = ifSpecificationKeyNotFoundApplyNotEqualMultiplier;
        return this;
    }
    @Override
    public VariantSpecificationValueRelevanceModifier setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
}

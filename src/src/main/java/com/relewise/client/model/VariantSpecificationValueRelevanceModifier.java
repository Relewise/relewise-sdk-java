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
    
/** a <code>RelevanceModifier</code> that can change the relevance of a Variant depending on whether a certain specification <code>Key</code> has a certain <code>Value</code>. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = VariantSpecificationValueRelevanceModifier.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class VariantSpecificationValueRelevanceModifier extends RelevanceModifier implements IVariantRelevanceModifier
{
    public String $type = "Relewise.Client.Requests.RelevanceModifiers.VariantSpecificationValueRelevanceModifier, Relewise.Client";
    /** The specification key that this <code>RelevanceModifier</code> will distinguish on. */
    public String key;
    /** The value that the key must be equal. */
    public String value;
    /** The weight that this <code>RelevanceModifier</code> will multiply relevant variants with. */
    public Double ifIdenticalMultiplyWeightBy;
    /** The weight that this <code>RelevanceModifier</code> will multiply variants that are note relevant with. */
    public Double ifNotIdenticalMultiplyWeightBy;
    /** Determines whether specification keys that are not found should count as the value not being equal i.e. multiplying by <code>IfNotIdenticalMultiplyWeightBy</code>. Alternatively the rank will not be modified in any way by this modifier. */
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
    /**
     * Creates a <code>RelevanceModifier</code> that can change the relevance of a Variant depending on whether a certain specification <code>Key</code> has a certain <code>Value</code>.
     * @param key The specification key that this RelevanceModifier will distinguish on.
     * @param value The value that the key must be equal.
     * @param ifIdenticalMultiplyWeightBy The weight that this RelevanceModifier will multiply relevant variants with.
     * @param ifNotIdenticalMultiplyWeightBy The weight that this RelevanceModifier will multiply variants that are note relevant with.
     * @param ifSpecificationKeyNotFoundApplyNotEqualMultiplier Determines whether specification keys that are not found should count as the value not being equal i.e. multiplying by IfNotIdenticalMultiplyWeightBy. Alternatively the rank will not be modified in any way by this modifier.
     */
    public static VariantSpecificationValueRelevanceModifier create(String key, String value, Double ifIdenticalMultiplyWeightBy, Double ifNotIdenticalMultiplyWeightBy, Boolean ifSpecificationKeyNotFoundApplyNotEqualMultiplier)
    {
        return new VariantSpecificationValueRelevanceModifier(key, value, ifIdenticalMultiplyWeightBy, ifNotIdenticalMultiplyWeightBy, ifSpecificationKeyNotFoundApplyNotEqualMultiplier);
    }
    /**
     * Creates a <code>RelevanceModifier</code> that can change the relevance of a Variant depending on whether a certain specification <code>Key</code> has a certain <code>Value</code>.
     * @param key The specification key that this RelevanceModifier will distinguish on.
     * @param value The value that the key must be equal.
     * @param ifIdenticalMultiplyWeightBy The weight that this RelevanceModifier will multiply relevant variants with.
     * @param ifNotIdenticalMultiplyWeightBy The weight that this RelevanceModifier will multiply variants that are note relevant with.
     * @param ifSpecificationKeyNotFoundApplyNotEqualMultiplier Determines whether specification keys that are not found should count as the value not being equal i.e. multiplying by IfNotIdenticalMultiplyWeightBy. Alternatively the rank will not be modified in any way by this modifier.
     */
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
    /** The specification key that this <code>RelevanceModifier</code> will distinguish on. */
    public String getKey()
    {
        return this.key;
    }
    /** The value that the key must be equal. */
    public String getValue()
    {
        return this.value;
    }
    /** The weight that this <code>RelevanceModifier</code> will multiply relevant variants with. */
    public Double getIfIdenticalMultiplyWeightBy()
    {
        return this.ifIdenticalMultiplyWeightBy;
    }
    /** The weight that this <code>RelevanceModifier</code> will multiply variants that are note relevant with. */
    public Double getIfNotIdenticalMultiplyWeightBy()
    {
        return this.ifNotIdenticalMultiplyWeightBy;
    }
    /** Determines whether specification keys that are not found should count as the value not being equal i.e. multiplying by <code>IfNotIdenticalMultiplyWeightBy</code>. Alternatively the rank will not be modified in any way by this modifier. */
    public Boolean getIfSpecificationKeyNotFoundApplyNotEqualMultiplier()
    {
        return this.ifSpecificationKeyNotFoundApplyNotEqualMultiplier;
    }
    /** The specification key that this <code>RelevanceModifier</code> will distinguish on. */
    public VariantSpecificationValueRelevanceModifier setKey(String key)
    {
        this.key = key;
        return this;
    }
    /** The value that the key must be equal. */
    public VariantSpecificationValueRelevanceModifier setValue(String value)
    {
        this.value = value;
        return this;
    }
    /** The weight that this <code>RelevanceModifier</code> will multiply relevant variants with. */
    public VariantSpecificationValueRelevanceModifier setIfIdenticalMultiplyWeightBy(Double ifIdenticalMultiplyWeightBy)
    {
        this.ifIdenticalMultiplyWeightBy = ifIdenticalMultiplyWeightBy;
        return this;
    }
    /** The weight that this <code>RelevanceModifier</code> will multiply variants that are note relevant with. */
    public VariantSpecificationValueRelevanceModifier setIfNotIdenticalMultiplyWeightBy(Double ifNotIdenticalMultiplyWeightBy)
    {
        this.ifNotIdenticalMultiplyWeightBy = ifNotIdenticalMultiplyWeightBy;
        return this;
    }
    /** Determines whether specification keys that are not found should count as the value not being equal i.e. multiplying by <code>IfNotIdenticalMultiplyWeightBy</code>. Alternatively the rank will not be modified in any way by this modifier. */
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

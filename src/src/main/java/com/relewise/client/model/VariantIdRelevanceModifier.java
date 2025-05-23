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
    
/** a <code>RelevanceModifier</code> that can change the relevance of a Variant depending on whether it is contained in a set of <code>VariantIds</code>. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = VariantIdRelevanceModifier.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class VariantIdRelevanceModifier extends RelevanceModifier implements IVariantRelevanceModifier
{
    public String $type = "Relewise.Client.Requests.RelevanceModifiers.VariantIdRelevanceModifier, Relewise.Client";
    /** The Ids of the Variants that this <code>RelevanceModifier</code> will distinguish on. */
    public String[] variantIds;
    /** The weight that this <code>RelevanceModifier</code> will multiply relevant variants with. */
    public Double multiplyWeightBy;
    /** Determines whether this <code>RelevanceModifier</code> should apply to all the Variants that don't match one of the specified <code>VariantIds</code> instead. */
    public Boolean negated;
    public static VariantIdRelevanceModifier create()
    {
        return new VariantIdRelevanceModifier();
    }
    public VariantIdRelevanceModifier()
    {
        this.multiplyWeightBy = 1d;
        this.negated = false;
    }
    public static VariantIdRelevanceModifier create(Double multiplyWeightBy, Boolean negated)
    {
        return new VariantIdRelevanceModifier(multiplyWeightBy, negated);
    }
    public VariantIdRelevanceModifier(Double multiplyWeightBy, Boolean negated)
    {
        this.multiplyWeightBy = multiplyWeightBy;
        this.negated = negated;
    }
    /** The Ids of the Variants that this <code>RelevanceModifier</code> will distinguish on. */
    public String[] getVariantIds()
    {
        return this.variantIds;
    }
    /** The weight that this <code>RelevanceModifier</code> will multiply relevant variants with. */
    public Double getMultiplyWeightBy()
    {
        return this.multiplyWeightBy;
    }
    /** Determines whether this <code>RelevanceModifier</code> should apply to all the Variants that don't match one of the specified <code>VariantIds</code> instead. */
    public Boolean getNegated()
    {
        return this.negated;
    }
    /** The Ids of the Variants that this <code>RelevanceModifier</code> will distinguish on. */
    public VariantIdRelevanceModifier setVariantIds(String... variantIds)
    {
        this.variantIds = variantIds;
        return this;
    }
    /** The Ids of the Variants that this <code>RelevanceModifier</code> will distinguish on. */
    public VariantIdRelevanceModifier addToVariantIds(String variantId)
    {
        if (this.variantIds == null)
        {
            this.variantIds = new String[] { variantId };
        }
        else
        {
            ArrayList<String> existingList = new ArrayList<>(Arrays.asList(this.variantIds));
            existingList.add(variantId);
            this.variantIds = existingList.toArray(new String[0]);
        }
        return this;
    }
    /** The weight that this <code>RelevanceModifier</code> will multiply relevant variants with. */
    public VariantIdRelevanceModifier setMultiplyWeightBy(Double multiplyWeightBy)
    {
        this.multiplyWeightBy = multiplyWeightBy;
        return this;
    }
    /** Determines whether this <code>RelevanceModifier</code> should apply to all the Variants that don't match one of the specified <code>VariantIds</code> instead. */
    public VariantIdRelevanceModifier setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    @Override
    public VariantIdRelevanceModifier setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
}

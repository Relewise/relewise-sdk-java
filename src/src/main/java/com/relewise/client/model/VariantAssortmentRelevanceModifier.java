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
    
/** a <code>RelevanceModifier</code> that can change the relevance of a Variant depending on whether the Assortments match <code>Assortments</code>. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = VariantAssortmentRelevanceModifier.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class VariantAssortmentRelevanceModifier extends RelevanceModifier implements IVariantRelevanceModifier
{
    public String $type = "Relewise.Client.Requests.RelevanceModifiers.VariantAssortmentRelevanceModifier, Relewise.Client";
    /** The assortments that this <code>RelevanceModifier</code> will multiply the weight for. */
    public Integer[] assortments;
    /** The weight that this <code>RelevanceModifier</code> will multiply relevant variants with. */
    public Double multiplyWeightBy;
    public static VariantAssortmentRelevanceModifier create()
    {
        return new VariantAssortmentRelevanceModifier();
    }
    public VariantAssortmentRelevanceModifier()
    {
        this.multiplyWeightBy = 1d;
    }
    public static VariantAssortmentRelevanceModifier create(Double multiplyWeightBy)
    {
        return new VariantAssortmentRelevanceModifier(multiplyWeightBy);
    }
    public VariantAssortmentRelevanceModifier(Double multiplyWeightBy)
    {
        this.multiplyWeightBy = multiplyWeightBy;
    }
    /** The assortments that this <code>RelevanceModifier</code> will multiply the weight for. */
    public Integer[] getAssortments()
    {
        return this.assortments;
    }
    /** The weight that this <code>RelevanceModifier</code> will multiply relevant variants with. */
    public Double getMultiplyWeightBy()
    {
        return this.multiplyWeightBy;
    }
    /** The assortments that this <code>RelevanceModifier</code> will multiply the weight for. */
    public VariantAssortmentRelevanceModifier setAssortments(Integer... assortments)
    {
        this.assortments = assortments;
        return this;
    }
    /** The assortments that this <code>RelevanceModifier</code> will multiply the weight for. */
    public VariantAssortmentRelevanceModifier addToAssortments(Integer assortment)
    {
        if (this.assortments == null)
        {
            this.assortments = new Integer[] { assortment };
        }
        else
        {
            ArrayList<Integer> existingList = new ArrayList<>(Arrays.asList(this.assortments));
            existingList.add(assortment);
            this.assortments = existingList.toArray(new Integer[0]);
        }
        return this;
    }
    /** The weight that this <code>RelevanceModifier</code> will multiply relevant variants with. */
    public VariantAssortmentRelevanceModifier setMultiplyWeightBy(Double multiplyWeightBy)
    {
        this.multiplyWeightBy = multiplyWeightBy;
        return this;
    }
    @Override
    public VariantAssortmentRelevanceModifier setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
}

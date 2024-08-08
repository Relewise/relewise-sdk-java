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
    defaultImpl = VariantAssortmentRelevanceModifier.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class VariantAssortmentRelevanceModifier extends RelevanceModifier implements IVariantRelevanceModifier
{
    public String $type = "Relewise.Client.Requests.RelevanceModifiers.VariantAssortmentRelevanceModifier, Relewise.Client";
    public Integer[] assortments;
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
    public Integer[] getAssortments()
    {
        return this.assortments;
    }
    public Double getMultiplyWeightBy()
    {
        return this.multiplyWeightBy;
    }
    public VariantAssortmentRelevanceModifier setAssortments(Integer... assortments)
    {
        this.assortments = assortments;;
        return this;
    }
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
    public VariantAssortmentRelevanceModifier setMultiplyWeightBy(Double multiplyWeightBy)
    {
        this.multiplyWeightBy = multiplyWeightBy;;
        return this;
    }
    @Override
    public VariantAssortmentRelevanceModifier setFilters(FilterCollection filters)
    {
        this.filters = filters;;
        return this;
    }
}

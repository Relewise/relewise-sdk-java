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
    defaultImpl = VariantSalesPriceRelevanceModifier.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class VariantSalesPriceRelevanceModifier extends RelevanceModifier implements IVariantRelevanceModifier
{
    public String $type = "Relewise.Client.Requests.RelevanceModifiers.VariantSalesPriceRelevanceModifier, Relewise.Client";
    public DoubleRange range;
    public @Nullable Currency currency;
    public Double multiplyWeightBy;
    public Boolean negated;
    public static VariantSalesPriceRelevanceModifier create(DoubleRange range)
    {
        return new VariantSalesPriceRelevanceModifier(range);
    }
    public VariantSalesPriceRelevanceModifier(DoubleRange range)
    {
        this.range = range;
        this.multiplyWeightBy = 1d;
        this.currency = null;
        this.negated = false;
    }
    public static VariantSalesPriceRelevanceModifier create(DoubleRange range, Double multiplyWeightBy, @Nullable Currency currency, Boolean negated)
    {
        return new VariantSalesPriceRelevanceModifier(range, multiplyWeightBy, currency, negated);
    }
    public VariantSalesPriceRelevanceModifier(DoubleRange range, Double multiplyWeightBy, @Nullable Currency currency, Boolean negated)
    {
        this.range = range;
        this.multiplyWeightBy = multiplyWeightBy;
        this.currency = currency;
        this.negated = negated;
    }
    public VariantSalesPriceRelevanceModifier()
    {
        this.currency = null;
        this.multiplyWeightBy = 1d;
        this.negated = false;
    }
    public DoubleRange getRange()
    {
        return this.range;
    }
    public @Nullable Currency getCurrency()
    {
        return this.currency;
    }
    public Double getMultiplyWeightBy()
    {
        return this.multiplyWeightBy;
    }
    public Boolean getNegated()
    {
        return this.negated;
    }
    public VariantSalesPriceRelevanceModifier setRange(DoubleRange range)
    {
        this.range = range;;
        return this;
    }
    public VariantSalesPriceRelevanceModifier setCurrency(Currency currency)
    {
        this.currency = currency;;
        return this;
    }
    public VariantSalesPriceRelevanceModifier setMultiplyWeightBy(Double multiplyWeightBy)
    {
        this.multiplyWeightBy = multiplyWeightBy;;
        return this;
    }
    public VariantSalesPriceRelevanceModifier setNegated(Boolean negated)
    {
        this.negated = negated;;
        return this;
    }
    @Override
    public VariantSalesPriceRelevanceModifier setFilters(FilterCollection filters)
    {
        this.filters = filters;;
        return this;
    }
}

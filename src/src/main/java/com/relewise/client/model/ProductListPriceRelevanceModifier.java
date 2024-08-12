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
    defaultImpl = ProductListPriceRelevanceModifier.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductListPriceRelevanceModifier extends RelevanceModifier implements IProductRelevanceModifier
{
    public String $type = "Relewise.Client.Requests.RelevanceModifiers.ProductListPriceRelevanceModifier, Relewise.Client";
    public DoubleRange range;
    public @Nullable Currency currency;
    public Double multiplyWeightBy;
    public Boolean negated;
    public static ProductListPriceRelevanceModifier create(DoubleRange range)
    {
        return new ProductListPriceRelevanceModifier(range);
    }
    public ProductListPriceRelevanceModifier(DoubleRange range)
    {
        this.range = range;
        this.multiplyWeightBy = 1d;
        this.currency = null;
        this.negated = false;
    }
    /** 0.0: Means it will be given zero percentage of its default weight during evaluation, but may still be used as "fill" to meet the "desiredNumberOfRecommendations" 0.5: Means a product must be twice as good a match as one with a default weight of 1.0 in order to be considered equal in the recommendation results. 1.0: Default weight 2.0: Means a product only have to be half as good a match, as one with a weight of 1.0 to still score equally high in the recommendation results */
    public static ProductListPriceRelevanceModifier create(DoubleRange range, Double multiplyWeightBy, @Nullable Currency currency, Boolean negated)
    {
        return new ProductListPriceRelevanceModifier(range, multiplyWeightBy, currency, negated);
    }
    /** 0.0: Means it will be given zero percentage of its default weight during evaluation, but may still be used as "fill" to meet the "desiredNumberOfRecommendations" 0.5: Means a product must be twice as good a match as one with a default weight of 1.0 in order to be considered equal in the recommendation results. 1.0: Default weight 2.0: Means a product only have to be half as good a match, as one with a weight of 1.0 to still score equally high in the recommendation results */
    public ProductListPriceRelevanceModifier(DoubleRange range, Double multiplyWeightBy, @Nullable Currency currency, Boolean negated)
    {
        this.range = range;
        this.multiplyWeightBy = multiplyWeightBy;
        this.currency = currency;
        this.negated = negated;
    }
    public ProductListPriceRelevanceModifier()
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
    public ProductListPriceRelevanceModifier setRange(DoubleRange range)
    {
        this.range = range;
        return this;
    }
    public ProductListPriceRelevanceModifier setCurrency(Currency currency)
    {
        this.currency = currency;
        return this;
    }
    public ProductListPriceRelevanceModifier setMultiplyWeightBy(Double multiplyWeightBy)
    {
        this.multiplyWeightBy = multiplyWeightBy;
        return this;
    }
    public ProductListPriceRelevanceModifier setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    @Override
    public ProductListPriceRelevanceModifier setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
}

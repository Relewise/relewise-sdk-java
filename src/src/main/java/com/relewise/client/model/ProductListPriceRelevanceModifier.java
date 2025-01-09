package com.relewise.client.model;

import com.fasterxml.jackson.annotation.*;
import javax.annotation.Nullable;
import java.io.IOException;
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
    
/** a <code>RelevanceModifier</code> that can change the relevance of a Product depending on the list price falling within a specific <code>Range</code>. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = ProductListPriceRelevanceModifier.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductListPriceRelevanceModifier extends RelevanceModifier implements IProductRelevanceModifier
{
    public String $type = "Relewise.Client.Requests.RelevanceModifiers.ProductListPriceRelevanceModifier, Relewise.Client";
    /** The range of list prices that this <code>RelevanceModifier</code> will distinguish on. */
    public DoubleRange range;
    /** The currency that is used to distinguish the price. */
    public @Nullable Currency currency;
    /** The weight that this <code>RelevanceModifier</code> will multiply relevant products with. */
    public Double multiplyWeightBy;
    /** Determines whether this <code>RelevanceModifier</code> should apply to all the Products that aren't contained within the specific <code>Range</code> instead. */
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
    /**
     * Creates a <code>RelevanceModifier</code> that can change the relevance of a Product depending on the list price falling within a specific <code>Range</code>.
     * @param range The range of list prices that this RelevanceModifier will distinguish on.
     * @param multiplyWeightBy The weight that this RelevanceModifier will multiply relevant products with.
     * @param currency The currency that is used to distinguish the price.
     * @param negated Determines whether this RelevanceModifier should apply to all the Products that aren't contained within the specific Range instead.
     */
    public static ProductListPriceRelevanceModifier create(DoubleRange range, Double multiplyWeightBy, @Nullable Currency currency, Boolean negated)
    {
        return new ProductListPriceRelevanceModifier(range, multiplyWeightBy, currency, negated);
    }
    /**
     * Creates a <code>RelevanceModifier</code> that can change the relevance of a Product depending on the list price falling within a specific <code>Range</code>.
     * @param range The range of list prices that this RelevanceModifier will distinguish on.
     * @param multiplyWeightBy The weight that this RelevanceModifier will multiply relevant products with.
     * @param currency The currency that is used to distinguish the price.
     * @param negated Determines whether this RelevanceModifier should apply to all the Products that aren't contained within the specific Range instead.
     */
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
    /** The range of list prices that this <code>RelevanceModifier</code> will distinguish on. */
    public DoubleRange getRange()
    {
        return this.range;
    }
    /** The currency that is used to distinguish the price. */
    public @Nullable Currency getCurrency()
    {
        return this.currency;
    }
    /** The weight that this <code>RelevanceModifier</code> will multiply relevant products with. */
    public Double getMultiplyWeightBy()
    {
        return this.multiplyWeightBy;
    }
    /** Determines whether this <code>RelevanceModifier</code> should apply to all the Products that aren't contained within the specific <code>Range</code> instead. */
    public Boolean getNegated()
    {
        return this.negated;
    }
    /** The range of list prices that this <code>RelevanceModifier</code> will distinguish on. */
    public ProductListPriceRelevanceModifier setRange(DoubleRange range)
    {
        this.range = range;
        return this;
    }
    /** The currency that is used to distinguish the price. */
    public ProductListPriceRelevanceModifier setCurrency(@Nullable Currency currency)
    {
        this.currency = currency;
        return this;
    }
    /** The weight that this <code>RelevanceModifier</code> will multiply relevant products with. */
    public ProductListPriceRelevanceModifier setMultiplyWeightBy(Double multiplyWeightBy)
    {
        this.multiplyWeightBy = multiplyWeightBy;
        return this;
    }
    /** Determines whether this <code>RelevanceModifier</code> should apply to all the Products that aren't contained within the specific <code>Range</code> instead. */
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

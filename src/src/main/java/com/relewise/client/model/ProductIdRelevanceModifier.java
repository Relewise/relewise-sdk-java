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
import java.util.AbstractMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashSet;
    
/** a <code>RelevanceModifier</code> that can change the relevance of a Product depending on whether it is contained in a set of <code>ProductIds</code>. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = ProductIdRelevanceModifier.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductIdRelevanceModifier extends RelevanceModifier implements IProductRelevanceModifier
{
    public String $type = "Relewise.Client.Requests.RelevanceModifiers.ProductIdRelevanceModifier, Relewise.Client";
    /** The Ids of the Products that this <code>RelevanceModifier</code> will distinguish on. */
    public String[] productIds;
    /** The weight that this <code>RelevanceModifier</code> will multiply relevant products with. */
    public Double multiplyWeightBy;
    /** Determines whether this <code>RelevanceModifier</code> should apply to all the Products that don't match one of the specified <code>ProductIds</code> instead. */
    public Boolean negated;
    public static ProductIdRelevanceModifier create()
    {
        return new ProductIdRelevanceModifier();
    }
    public ProductIdRelevanceModifier()
    {
        this.multiplyWeightBy = 1d;
        this.negated = false;
    }
    public static ProductIdRelevanceModifier create(Double multiplyWeightBy, Boolean negated)
    {
        return new ProductIdRelevanceModifier(multiplyWeightBy, negated);
    }
    public ProductIdRelevanceModifier(Double multiplyWeightBy, Boolean negated)
    {
        this.multiplyWeightBy = multiplyWeightBy;
        this.negated = negated;
    }
    /** The Ids of the Products that this <code>RelevanceModifier</code> will distinguish on. */
    public String[] getProductIds()
    {
        return this.productIds;
    }
    /** The weight that this <code>RelevanceModifier</code> will multiply relevant products with. */
    public Double getMultiplyWeightBy()
    {
        return this.multiplyWeightBy;
    }
    /** Determines whether this <code>RelevanceModifier</code> should apply to all the Products that don't match one of the specified <code>ProductIds</code> instead. */
    public Boolean getNegated()
    {
        return this.negated;
    }
    /** The Ids of the Products that this <code>RelevanceModifier</code> will distinguish on. */
    public ProductIdRelevanceModifier setProductIds(String... productIds)
    {
        this.productIds = productIds;
        return this;
    }
    /** The Ids of the Products that this <code>RelevanceModifier</code> will distinguish on. */
    public ProductIdRelevanceModifier addToProductIds(String productId)
    {
        if (this.productIds == null)
        {
            this.productIds = new String[] { productId };
        }
        else
        {
            ArrayList<String> existingList = new ArrayList<>(Arrays.asList(this.productIds));
            existingList.add(productId);
            this.productIds = existingList.toArray(new String[0]);
        }
        return this;
    }
    /** The weight that this <code>RelevanceModifier</code> will multiply relevant products with. */
    public ProductIdRelevanceModifier setMultiplyWeightBy(Double multiplyWeightBy)
    {
        this.multiplyWeightBy = multiplyWeightBy;
        return this;
    }
    /** Determines whether this <code>RelevanceModifier</code> should apply to all the Products that don't match one of the specified <code>ProductIds</code> instead. */
    public ProductIdRelevanceModifier setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    @Override
    public ProductIdRelevanceModifier setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
}

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
    defaultImpl = ProductIdRelevanceModifier.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductIdRelevanceModifier extends RelevanceModifier implements IProductRelevanceModifier
{
    public String $type = "Relewise.Client.Requests.RelevanceModifiers.ProductIdRelevanceModifier, Relewise.Client";
    public String[] productIds;
    public Double multiplyWeightBy;
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
    public String[] getProductIds()
    {
        return this.productIds;
    }
    public Double getMultiplyWeightBy()
    {
        return this.multiplyWeightBy;
    }
    public Boolean getNegated()
    {
        return this.negated;
    }
    public ProductIdRelevanceModifier setProductIds(String... productIds)
    {
        this.productIds = productIds;;
        return this;
    }
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
    public ProductIdRelevanceModifier setMultiplyWeightBy(Double multiplyWeightBy)
    {
        this.multiplyWeightBy = multiplyWeightBy;;
        return this;
    }
    public ProductIdRelevanceModifier setNegated(Boolean negated)
    {
        this.negated = negated;;
        return this;
    }
    @Override
    public ProductIdRelevanceModifier setFilters(FilterCollection filters)
    {
        this.filters = filters;;
        return this;
    }
}

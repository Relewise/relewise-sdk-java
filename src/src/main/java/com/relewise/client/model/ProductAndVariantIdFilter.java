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
    defaultImpl = ProductAndVariantIdFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductAndVariantIdFilter extends Filter implements IProductFilter
{
    public String $type = "Relewise.Client.Requests.Filters.ProductAndVariantIdFilter, Relewise.Client";
    public ArrayList<ProductAndVariantId> productAndVariantIds;
    public static ProductAndVariantIdFilter create()
    {
        return new ProductAndVariantIdFilter();
    }
    public ProductAndVariantIdFilter()
    {
        this.negated = false;
    }
    public static ProductAndVariantIdFilter create(Boolean negated)
    {
        return new ProductAndVariantIdFilter(negated);
    }
    public ProductAndVariantIdFilter(Boolean negated)
    {
        this.negated = negated;
    }
    public ArrayList<ProductAndVariantId> getProductAndVariantIds()
    {
        return this.productAndVariantIds;
    }
    public ProductAndVariantIdFilter setProductAndVariantIds(ProductAndVariantId... productAndVariantIds)
    {
        this.productAndVariantIds = new ArrayList<>(Arrays.asList(productAndVariantIds));;
        return this;
    }
    public ProductAndVariantIdFilter addToProductAndVariantIds(ProductAndVariantId productAndVariantIds)
    {
        if (this.productAndVariantIds == null)
        {
            this.productAndVariantIds = new ArrayList<>();
        }
        this.productAndVariantIds.add(productAndVariantIds);
        return this;
    }
    @Override
    public ProductAndVariantIdFilter setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
}

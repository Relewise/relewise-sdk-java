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
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = ProductIdFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductIdFilter extends Filter implements IProductFilter
{
    public String $type = "Relewise.Client.Requests.Filters.ProductIdFilter, Relewise.Client";
    public ArrayList<String> productIds;
    public static ProductIdFilter create()
    {
        return new ProductIdFilter();
    }
    public ProductIdFilter()
    {
        this.negated = false;
    }
    public static ProductIdFilter create(Boolean negated)
    {
        return new ProductIdFilter(negated);
    }
    public ProductIdFilter(Boolean negated)
    {
        this.negated = negated;
    }
    public ArrayList<String> getProductIds()
    {
        return this.productIds;
    }
    public ProductIdFilter setProductIds(String... productIds)
    {
        this.productIds = new ArrayList<>(Arrays.asList(productIds));;
        return this;
    }
    public ProductIdFilter addToProductIds(String productIds)
    {
        if (this.productIds == null)
        {
            this.productIds = new ArrayList<>();
        }
        this.productIds.add(productIds);
        return this;
    }
    @Override
    public ProductIdFilter setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
}

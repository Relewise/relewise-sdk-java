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
    
/** a <code>Filter</code> that can filter on whether the product is present in the cart associated to the <code>User</code> used in this query. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = ProductInCartFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductInCartFilter extends Filter implements IProductFilter
{
    public String $type = "Relewise.Client.Requests.Filters.ProductInCartFilter, Relewise.Client";
    public static ProductInCartFilter create()
    {
        return new ProductInCartFilter();
    }
    public ProductInCartFilter()
    {
        this.negated = false;
    }
    /**
     * Creates a <code>Filter</code> that can filter on whether the product is present in the cart associated to the <code>User</code> used in this query.
     * @param negated Defines whether the Filter should exclude the matching entities instead of including the matching entities.
     */
    public static ProductInCartFilter create(Boolean negated)
    {
        return new ProductInCartFilter(negated);
    }
    /**
     * Creates a <code>Filter</code> that can filter on whether the product is present in the cart associated to the <code>User</code> used in this query.
     * @param negated Defines whether the Filter should exclude the matching entities instead of including the matching entities.
     */
    public ProductInCartFilter(Boolean negated)
    {
        this.negated = negated;
    }
    @Override
    public ProductInCartFilter setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    @Override
    public ProductInCartFilter setSettings(@Nullable FilterSettings settings)
    {
        this.settings = settings;
        return this;
    }
}

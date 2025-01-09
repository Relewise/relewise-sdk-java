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
    defaultImpl = ProductCategoryHasProductsFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductCategoryHasProductsFilter extends Filter implements IProductCategoryFilter, ICategoryFilter
{
    public String $type = "Relewise.Client.Requests.Filters.ProductCategoryHasProductsFilter, Relewise.Client";
    public static ProductCategoryHasProductsFilter create(Boolean negated)
    {
        return new ProductCategoryHasProductsFilter(negated);
    }
    public ProductCategoryHasProductsFilter(Boolean negated)
    {
        this.negated = negated;
    }
    public ProductCategoryHasProductsFilter()
    {
    }
    @Override
    public ProductCategoryHasProductsFilter setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    @Override
    public ProductCategoryHasProductsFilter setSettings(@Nullable FilterSettings settings)
    {
        this.settings = settings;
        return this;
    }
}

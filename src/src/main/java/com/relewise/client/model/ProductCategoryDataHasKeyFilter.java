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
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = ProductCategoryDataHasKeyFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductCategoryDataHasKeyFilter extends Filter implements IProductCategoryFilter, ICategoryFilter
{
    public String $type = "Relewise.Client.Requests.Filters.ProductCategoryDataHasKeyFilter, Relewise.Client";
    public String key;
    public static ProductCategoryDataHasKeyFilter create(String key)
    {
        return new ProductCategoryDataHasKeyFilter(key);
    }
    public ProductCategoryDataHasKeyFilter(String key)
    {
        this.key = key;
        this.negated = false;
    }
    public static ProductCategoryDataHasKeyFilter create(String key, Boolean negated)
    {
        return new ProductCategoryDataHasKeyFilter(key, negated);
    }
    public ProductCategoryDataHasKeyFilter(String key, Boolean negated)
    {
        this.key = key;
        this.negated = negated;
    }
    public ProductCategoryDataHasKeyFilter()
    {
        this.negated = false;
    }
    public String getKey()
    {
        return this.key;
    }
    public ProductCategoryDataHasKeyFilter setKey(String key)
    {
        this.key = key;
        return this;
    }
    @Override
    public ProductCategoryDataHasKeyFilter setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    @Override
    public ProductCategoryDataHasKeyFilter setSettings(@Nullable FilterSettings settings)
    {
        this.settings = settings;
        return this;
    }
}

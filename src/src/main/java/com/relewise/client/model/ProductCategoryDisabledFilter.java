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
    defaultImpl = ProductCategoryDisabledFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductCategoryDisabledFilter extends Filter implements IProductCategoryFilter, ICategoryFilter
{
    public String $type = "Relewise.Client.Requests.Filters.ProductCategoryDisabledFilter, Relewise.Client";
    public static ProductCategoryDisabledFilter create()
    {
        return new ProductCategoryDisabledFilter();
    }
    public ProductCategoryDisabledFilter()
    {
        this.negated = false;
    }
    public static ProductCategoryDisabledFilter create(Boolean negated)
    {
        return new ProductCategoryDisabledFilter(negated);
    }
    public ProductCategoryDisabledFilter(Boolean negated)
    {
        this.negated = negated;
    }
    @Override
    public ProductCategoryDisabledFilter setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    @Override
    public ProductCategoryDisabledFilter setSettings(@Nullable FilterSettings settings)
    {
        this.settings = settings;
        return this;
    }
}

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
    defaultImpl = ProductCategoryLevelFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductCategoryLevelFilter extends CategoryLevelFilter implements ICategoryFilter
{
    public String $type = "Relewise.Client.Requests.Filters.ProductCategoryLevelFilter, Relewise.Client";
    public static ProductCategoryLevelFilter create()
    {
        return new ProductCategoryLevelFilter();
    }
    public ProductCategoryLevelFilter()
    {
        this.negated = false;
    }
    public static ProductCategoryLevelFilter create(Boolean negated)
    {
        return new ProductCategoryLevelFilter(negated);
    }
    public ProductCategoryLevelFilter(Boolean negated)
    {
        this.negated = negated;
    }
    @Override
    public ProductCategoryLevelFilter setLevels(Integer... levels)
    {
        this.levels = new ArrayList<>(Arrays.asList(levels));;
        return this;
    }
    public ProductCategoryLevelFilter addToLevels(Integer levels)
    {
        if (this.levels == null)
        {
            this.levels = new ArrayList<>();
        }
        this.levels.add(levels);
        return this;
    }
    @Override
    public ProductCategoryLevelFilter setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    @Override
    public ProductCategoryLevelFilter setSettings(FilterSettings settings)
    {
        this.settings = settings;
        return this;
    }
}

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
    defaultImpl = ProductCategoryHasAncestorFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductCategoryHasAncestorFilter extends HasAncestorCategoryFilter implements ICategoryFilter
{
    public String $type = "Relewise.Client.Requests.Filters.ProductCategoryHasAncestorFilter, Relewise.Client";
    public static ProductCategoryHasAncestorFilter create()
    {
        return new ProductCategoryHasAncestorFilter();
    }
    public ProductCategoryHasAncestorFilter()
    {
        this.negated = false;
    }
    public static ProductCategoryHasAncestorFilter create(Boolean negated)
    {
        return new ProductCategoryHasAncestorFilter(negated);
    }
    public ProductCategoryHasAncestorFilter(Boolean negated)
    {
        this.negated = negated;
    }
    @Override
    public ProductCategoryHasAncestorFilter setCategoryIds(String... categoryIds)
    {
        this.categoryIds = new ArrayList<>(Arrays.asList(categoryIds));;
        return this;
    }
    public ProductCategoryHasAncestorFilter addToCategoryIds(String categoryIds)
    {
        if (this.categoryIds == null)
        {
            this.categoryIds = new ArrayList<>();
        }
        this.categoryIds.add(categoryIds);
        return this;
    }
    @Override
    public ProductCategoryHasAncestorFilter setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
}

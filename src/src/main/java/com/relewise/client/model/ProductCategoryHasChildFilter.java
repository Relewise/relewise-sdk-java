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
    defaultImpl = ProductCategoryHasChildFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductCategoryHasChildFilter extends HasChildCategoryFilter implements ICategoryFilter
{
    public String $type = "Relewise.Client.Requests.Filters.ProductCategoryHasChildFilter, Relewise.Client";
    public static ProductCategoryHasChildFilter create()
    {
        return new ProductCategoryHasChildFilter();
    }
    public ProductCategoryHasChildFilter()
    {
        this.negated = false;
    }
    public static ProductCategoryHasChildFilter create(Boolean negated)
    {
        return new ProductCategoryHasChildFilter(negated);
    }
    public ProductCategoryHasChildFilter(Boolean negated)
    {
        this.negated = negated;
    }
    @Override
    public ProductCategoryHasChildFilter setCategoryIds(String... categoryIds)
    {
        this.categoryIds = new ArrayList<>(Arrays.asList(categoryIds));;
        return this;
    }
    public ProductCategoryHasChildFilter addToCategoryIds(String categoryIds)
    {
        if (this.categoryIds == null)
        {
            this.categoryIds = new ArrayList<>();
        }
        this.categoryIds.add(categoryIds);
        return this;
    }
    @Override
    public ProductCategoryHasChildFilter setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
}

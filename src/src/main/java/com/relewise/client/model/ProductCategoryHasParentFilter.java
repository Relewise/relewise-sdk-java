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
    defaultImpl = ProductCategoryHasParentFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductCategoryHasParentFilter extends HasParentCategoryFilter implements ICategoryFilter
{
    public String $type = "Relewise.Client.Requests.Filters.ProductCategoryHasParentFilter, Relewise.Client";
    public static ProductCategoryHasParentFilter create()
    {
        return new ProductCategoryHasParentFilter();
    }
    public ProductCategoryHasParentFilter()
    {
        this.negated = false;
    }
    public static ProductCategoryHasParentFilter create(Boolean negated)
    {
        return new ProductCategoryHasParentFilter(negated);
    }
    public ProductCategoryHasParentFilter(Boolean negated)
    {
        this.negated = negated;
    }
    @Override
    public ProductCategoryHasParentFilter setCategoryIds(String... categoryIds)
    {
        this.categoryIds = new ArrayList<>(Arrays.asList(categoryIds));;
        return this;
    }
    public ProductCategoryHasParentFilter addToCategoryIds(String categoryIds)
    {
        if (this.categoryIds == null)
        {
            this.categoryIds = new ArrayList<>();
        }
        this.categoryIds.add(categoryIds);
        return this;
    }
    @Override
    public ProductCategoryHasParentFilter setNegated(Boolean negated)
    {
        this.negated = negated;;
        return this;
    }
}

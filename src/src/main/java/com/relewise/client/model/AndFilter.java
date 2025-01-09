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
    defaultImpl = AndFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AndFilter extends Filter implements IProductFilter, IContentFilter, IBrandFilter, IProductCategoryFilter, ICategoryFilter, IContentCategoryFilter, IVariantFilter
{
    public String $type = "Relewise.Client.Requests.Filters.AndFilter, Relewise.Client";
    public Filter[] filters;
    public static AndFilter create(Filter... filters)
    {
        return new AndFilter(filters);
    }
    public AndFilter(Filter... filters)
    {
        this.filters = filters;
        this.negated = false;
    }
    public static AndFilter create(Filter[] filters, Boolean negated)
    {
        return new AndFilter(filters, negated);
    }
    public AndFilter(Filter[] filters, Boolean negated)
    {
        this.filters = filters;
        this.negated = negated;
    }
    public AndFilter()
    {
        this.negated = false;
    }
    public Filter[] getFilters()
    {
        return this.filters;
    }
    public AndFilter setFilters(Filter... filters)
    {
        this.filters = filters;
        return this;
    }
    public AndFilter addToFilters(Filter filter)
    {
        if (this.filters == null)
        {
            this.filters = new Filter[] { filter };
        }
        else
        {
            ArrayList<Filter> existingList = new ArrayList<>(Arrays.asList(this.filters));
            existingList.add(filter);
            this.filters = existingList.toArray(new Filter[0]);
        }
        return this;
    }
    @Override
    public AndFilter setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    @Override
    public AndFilter setSettings(@Nullable FilterSettings settings)
    {
        this.settings = settings;
        return this;
    }
}

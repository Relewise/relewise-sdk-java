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
    defaultImpl = OrFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrFilter extends Filter implements IProductFilter, IContentFilter, IBrandFilter, ICategoryFilter, IVariantFilter
{
    public String $type = "Relewise.Client.Requests.Filters.OrFilter, Relewise.Client";
    public Filter[] filters;
    public static OrFilter create(Filter... filters)
    {
        return new OrFilter(filters);
    }
    public OrFilter(Filter... filters)
    {
        this.filters = filters;
        this.negated = false;
    }
    public static OrFilter create(Filter[] filters, Boolean negated)
    {
        return new OrFilter(filters, negated);
    }
    public OrFilter(Filter[] filters, Boolean negated)
    {
        this.filters = filters;
        this.negated = negated;
    }
    public OrFilter()
    {
        this.negated = false;
    }
    public Filter[] getFilters()
    {
        return this.filters;
    }
    public OrFilter setFilters(Filter... filters)
    {
        this.filters = filters;
        return this;
    }
    public OrFilter addToFilters(Filter filter)
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
    public OrFilter setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    @Override
    public OrFilter setSettings(FilterSettings settings)
    {
        this.settings = settings;
        return this;
    }
}

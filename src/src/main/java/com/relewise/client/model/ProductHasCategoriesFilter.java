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
    defaultImpl = ProductHasCategoriesFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductHasCategoriesFilter extends Filter implements IProductFilter
{
    public String $type = "Relewise.Client.Requests.Filters.ProductHasCategoriesFilter, Relewise.Client";
    public static ProductHasCategoriesFilter create(Boolean negated)
    {
        return new ProductHasCategoriesFilter(negated);
    }
    public ProductHasCategoriesFilter(Boolean negated)
    {
        this.negated = negated;
    }
    public ProductHasCategoriesFilter()
    {
    }
    @Override
    public ProductHasCategoriesFilter setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    @Override
    public ProductHasCategoriesFilter setSettings(FilterSettings settings)
    {
        this.settings = settings;
        return this;
    }
}
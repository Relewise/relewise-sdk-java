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
    defaultImpl = ProductDataHasKeyFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductDataHasKeyFilter extends Filter implements IProductFilter
{
    public String $type = "Relewise.Client.Requests.Filters.ProductDataHasKeyFilter, Relewise.Client";
    public String key;
    public static ProductDataHasKeyFilter create(String key)
    {
        return new ProductDataHasKeyFilter(key);
    }
    public ProductDataHasKeyFilter(String key)
    {
        this.key = key;
        this.negated = false;
    }
    public static ProductDataHasKeyFilter create(String key, Boolean negated)
    {
        return new ProductDataHasKeyFilter(key, negated);
    }
    public ProductDataHasKeyFilter(String key, Boolean negated)
    {
        this.key = key;
        this.negated = negated;
    }
    public ProductDataHasKeyFilter()
    {
        this.negated = false;
    }
    public String getKey()
    {
        return this.key;
    }
    public ProductDataHasKeyFilter setKey(String key)
    {
        this.key = key;
        return this;
    }
    @Override
    public ProductDataHasKeyFilter setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    @Override
    public ProductDataHasKeyFilter setSettings(FilterSettings settings)
    {
        this.settings = settings;
        return this;
    }
}

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
    defaultImpl = ProductDisabledFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductDisabledFilter extends Filter implements IProductFilter
{
    public String $type = "Relewise.Client.Requests.Filters.ProductDisabledFilter, Relewise.Client";
    public static ProductDisabledFilter create()
    {
        return new ProductDisabledFilter();
    }
    public ProductDisabledFilter()
    {
        this.negated = false;
    }
    public static ProductDisabledFilter create(Boolean negated)
    {
        return new ProductDisabledFilter(negated);
    }
    public ProductDisabledFilter(Boolean negated)
    {
        this.negated = negated;
    }
    @Override
    public ProductDisabledFilter setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    @Override
    public ProductDisabledFilter setSettings(@Nullable FilterSettings settings)
    {
        this.settings = settings;
        return this;
    }
}

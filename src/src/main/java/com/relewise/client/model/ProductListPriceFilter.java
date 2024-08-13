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
    defaultImpl = ProductListPriceFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductListPriceFilter extends Filter implements IProductFilter
{
    public String $type = "Relewise.Client.Requests.Filters.ProductListPriceFilter, Relewise.Client";
    public DoubleRange range;
    public @Nullable Currency currency;
    public static ProductListPriceFilter create(DoubleRange range)
    {
        return new ProductListPriceFilter(range);
    }
    public ProductListPriceFilter(DoubleRange range)
    {
        this.range = range;
        this.currency = null;
        this.negated = false;
    }
    public static ProductListPriceFilter create(DoubleRange range, @Nullable Currency currency, Boolean negated)
    {
        return new ProductListPriceFilter(range, currency, negated);
    }
    public ProductListPriceFilter(DoubleRange range, @Nullable Currency currency, Boolean negated)
    {
        this.range = range;
        this.currency = currency;
        this.negated = negated;
    }
    public ProductListPriceFilter()
    {
        this.currency = null;
        this.negated = false;
    }
    public DoubleRange getRange()
    {
        return this.range;
    }
    public @Nullable Currency getCurrency()
    {
        return this.currency;
    }
    public ProductListPriceFilter setRange(DoubleRange range)
    {
        this.range = range;
        return this;
    }
    public ProductListPriceFilter setCurrency(@Nullable Currency currency)
    {
        this.currency = currency;
        return this;
    }
    @Override
    public ProductListPriceFilter setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    @Override
    public ProductListPriceFilter setSettings(@Nullable FilterSettings settings)
    {
        this.settings = settings;
        return this;
    }
}

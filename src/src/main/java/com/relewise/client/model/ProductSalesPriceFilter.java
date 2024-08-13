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
    defaultImpl = ProductSalesPriceFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductSalesPriceFilter extends Filter implements IProductFilter
{
    public String $type = "Relewise.Client.Requests.Filters.ProductSalesPriceFilter, Relewise.Client";
    public DoubleRange range;
    public @Nullable Currency currency;
    public static ProductSalesPriceFilter create(DoubleRange range)
    {
        return new ProductSalesPriceFilter(range);
    }
    public ProductSalesPriceFilter(DoubleRange range)
    {
        this.range = range;
        this.currency = null;
        this.negated = false;
    }
    public static ProductSalesPriceFilter create(DoubleRange range, @Nullable Currency currency, Boolean negated)
    {
        return new ProductSalesPriceFilter(range, currency, negated);
    }
    public ProductSalesPriceFilter(DoubleRange range, @Nullable Currency currency, Boolean negated)
    {
        this.range = range;
        this.currency = currency;
        this.negated = negated;
    }
    public ProductSalesPriceFilter()
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
    public ProductSalesPriceFilter setRange(DoubleRange range)
    {
        this.range = range;
        return this;
    }
    public ProductSalesPriceFilter setCurrency(Currency currency)
    {
        this.currency = currency;
        return this;
    }
    @Override
    public ProductSalesPriceFilter setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
}

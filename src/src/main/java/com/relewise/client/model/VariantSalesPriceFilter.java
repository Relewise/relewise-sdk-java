package com.relewise.client.model;

import com.fasterxml.jackson.annotation.*;
import javax.annotation.Nullable;
import java.io.IOException;
import java.time.Duration;
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
    defaultImpl = VariantSalesPriceFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class VariantSalesPriceFilter extends Filter implements IVariantFilter
{
    public String $type = "Relewise.Client.Requests.Filters.VariantSalesPriceFilter, Relewise.Client";
    public DoubleRange range;
    public @Nullable Currency currency;
    public static VariantSalesPriceFilter create(DoubleRange range)
    {
        return new VariantSalesPriceFilter(range);
    }
    public VariantSalesPriceFilter(DoubleRange range)
    {
        this.range = range;
        this.currency = null;
        this.negated = false;
    }
    public static VariantSalesPriceFilter create(DoubleRange range, @Nullable Currency currency, Boolean negated)
    {
        return new VariantSalesPriceFilter(range, currency, negated);
    }
    public VariantSalesPriceFilter(DoubleRange range, @Nullable Currency currency, Boolean negated)
    {
        this.range = range;
        this.currency = currency;
        this.negated = negated;
    }
    public VariantSalesPriceFilter()
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
    public VariantSalesPriceFilter setRange(DoubleRange range)
    {
        this.range = range;
        return this;
    }
    public VariantSalesPriceFilter setCurrency(@Nullable Currency currency)
    {
        this.currency = currency;
        return this;
    }
    @Override
    public VariantSalesPriceFilter setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    @Override
    public VariantSalesPriceFilter setSettings(@Nullable FilterSettings settings)
    {
        this.settings = settings;
        return this;
    }
}

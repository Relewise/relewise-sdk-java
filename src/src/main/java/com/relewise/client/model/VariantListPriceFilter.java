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
    defaultImpl = VariantListPriceFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class VariantListPriceFilter extends Filter implements IVariantFilter
{
    public String $type = "Relewise.Client.Requests.Filters.VariantListPriceFilter, Relewise.Client";
    public DoubleRange range;
    public @Nullable Currency currency;
    public static VariantListPriceFilter create(DoubleRange range)
    {
        return new VariantListPriceFilter(range);
    }
    public VariantListPriceFilter(DoubleRange range)
    {
        this.range = range;
        this.currency = null;
        this.negated = false;
    }
    public static VariantListPriceFilter create(DoubleRange range, @Nullable Currency currency, Boolean negated)
    {
        return new VariantListPriceFilter(range, currency, negated);
    }
    public VariantListPriceFilter(DoubleRange range, @Nullable Currency currency, Boolean negated)
    {
        this.range = range;
        this.currency = currency;
        this.negated = negated;
    }
    public VariantListPriceFilter()
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
    public VariantListPriceFilter setRange(DoubleRange range)
    {
        this.range = range;;
        return this;
    }
    public VariantListPriceFilter setCurrency(Currency currency)
    {
        this.currency = currency;;
        return this;
    }
    @Override
    public VariantListPriceFilter setNegated(Boolean negated)
    {
        this.negated = negated;;
        return this;
    }
}

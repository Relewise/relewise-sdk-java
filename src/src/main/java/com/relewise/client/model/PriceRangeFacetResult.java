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
    defaultImpl = PriceRangeFacetResult.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PriceRangeFacetResult extends FacetResult
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Result.PriceRangeFacetResult, Relewise.Client";
    public DoubleRange selected;
    public DoubleRangeAvailableFacetValue available;
    public PriceSelectionStrategy priceSelectionStrategy;
    public static PriceRangeFacetResult create(FacetingField field, PriceSelectionStrategy priceSelectionStrategy, DoubleRange selected, DoubleRangeAvailableFacetValue available)
    {
        return new PriceRangeFacetResult(field, priceSelectionStrategy, selected, available);
    }
    public PriceRangeFacetResult(FacetingField field, PriceSelectionStrategy priceSelectionStrategy, DoubleRange selected, DoubleRangeAvailableFacetValue available)
    {
        this.field = field;
        this.priceSelectionStrategy = priceSelectionStrategy;
        this.selected = selected;
        this.available = available;
    }
    public PriceRangeFacetResult()
    {
    }
    public DoubleRange getSelected()
    {
        return this.selected;
    }
    public DoubleRangeAvailableFacetValue getAvailable()
    {
        return this.available;
    }
    public PriceSelectionStrategy getPriceSelectionStrategy()
    {
        return this.priceSelectionStrategy;
    }
    public PriceRangeFacetResult setSelected(DoubleRange selected)
    {
        this.selected = selected;
        return this;
    }
    public PriceRangeFacetResult setAvailable(DoubleRangeAvailableFacetValue available)
    {
        this.available = available;
        return this;
    }
    public PriceRangeFacetResult setPriceSelectionStrategy(PriceSelectionStrategy priceSelectionStrategy)
    {
        this.priceSelectionStrategy = priceSelectionStrategy;
        return this;
    }
    @Override
    public PriceRangeFacetResult setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
}

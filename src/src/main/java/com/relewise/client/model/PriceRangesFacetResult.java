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
    defaultImpl = PriceRangesFacetResult.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PriceRangesFacetResult extends FacetResult
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Result.PriceRangesFacetResult, Relewise.Client";
    public @Nullable Double expandedRangeSize;
    public ArrayList<DoubleChainableRange> selected;
    public ArrayList<DoubleChainableRangeAvailableFacetValue> available;
    public PriceSelectionStrategy priceSelectionStrategy;
    public static PriceRangesFacetResult create(FacetingField field, PriceSelectionStrategy priceSelectionStrategy, @Nullable Double expandedRangeSize, ArrayList<DoubleChainableRange> selected, DoubleChainableRangeAvailableFacetValue... available)
    {
        return new PriceRangesFacetResult(field, priceSelectionStrategy, expandedRangeSize, selected, available);
    }
    public PriceRangesFacetResult(FacetingField field, PriceSelectionStrategy priceSelectionStrategy, @Nullable Double expandedRangeSize, ArrayList<DoubleChainableRange> selected, DoubleChainableRangeAvailableFacetValue... available)
    {
        this.field = field;
        this.priceSelectionStrategy = priceSelectionStrategy;
        this.expandedRangeSize = expandedRangeSize;
        this.selected = selected;
        this.available = new ArrayList<>(Arrays.asList(available));
    }
    public PriceRangesFacetResult()
    {
    }
    public @Nullable Double getExpandedRangeSize()
    {
        return this.expandedRangeSize;
    }
    public ArrayList<DoubleChainableRange> getSelected()
    {
        return this.selected;
    }
    public ArrayList<DoubleChainableRangeAvailableFacetValue> getAvailable()
    {
        return this.available;
    }
    public PriceSelectionStrategy getPriceSelectionStrategy()
    {
        return this.priceSelectionStrategy;
    }
    public PriceRangesFacetResult setExpandedRangeSize(@Nullable Double expandedRangeSize)
    {
        this.expandedRangeSize = expandedRangeSize;
        return this;
    }
    public PriceRangesFacetResult setSelected(DoubleChainableRange... selected)
    {
        this.selected = new ArrayList<>(Arrays.asList(selected));;
        return this;
    }
    public PriceRangesFacetResult addToSelected(DoubleChainableRange selected)
    {
        if (this.selected == null)
        {
            this.selected = new ArrayList<>();
        }
        this.selected.add(selected);
        return this;
    }
    public PriceRangesFacetResult setAvailable(DoubleChainableRangeAvailableFacetValue... available)
    {
        this.available = new ArrayList<>(Arrays.asList(available));;
        return this;
    }
    public PriceRangesFacetResult addToAvailable(DoubleChainableRangeAvailableFacetValue available)
    {
        if (this.available == null)
        {
            this.available = new ArrayList<>();
        }
        this.available.add(available);
        return this;
    }
    public PriceRangesFacetResult setPriceSelectionStrategy(PriceSelectionStrategy priceSelectionStrategy)
    {
        this.priceSelectionStrategy = priceSelectionStrategy;
        return this;
    }
    @Override
    public PriceRangesFacetResult setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
}

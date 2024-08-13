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
    defaultImpl = PriceRangesFacet.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PriceRangesFacet extends Facet
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Queries.PriceRangesFacet, Relewise.Client";
    public @Nullable ArrayList<DoubleChainableRange> predefinedRanges;
    public @Nullable Double expandedRangeSize;
    public @Nullable ArrayList<DoubleChainableRange> selected;
    public PriceSelectionStrategy priceSelectionStrategy;
    public static PriceRangesFacet create(FacetingField field, PriceSelectionStrategy priceSelectionStrategy, @Nullable ArrayList<DoubleChainableRange> predefinedRanges, @Nullable Double expandedRangeSize, DoubleChainableRange... selected)
    {
        return new PriceRangesFacet(field, priceSelectionStrategy, predefinedRanges, expandedRangeSize, selected);
    }
    public PriceRangesFacet(FacetingField field, PriceSelectionStrategy priceSelectionStrategy, @Nullable ArrayList<DoubleChainableRange> predefinedRanges, @Nullable Double expandedRangeSize, DoubleChainableRange... selected)
    {
        this.field = field;
        this.priceSelectionStrategy = priceSelectionStrategy;
        this.predefinedRanges = predefinedRanges;
        this.expandedRangeSize = expandedRangeSize;
        this.selected = new ArrayList<>(Arrays.asList(selected));
    }
    public PriceRangesFacet()
    {
    }
    public @Nullable ArrayList<DoubleChainableRange> getPredefinedRanges()
    {
        return this.predefinedRanges;
    }
    public @Nullable Double getExpandedRangeSize()
    {
        return this.expandedRangeSize;
    }
    public @Nullable ArrayList<DoubleChainableRange> getSelected()
    {
        return this.selected;
    }
    public PriceSelectionStrategy getPriceSelectionStrategy()
    {
        return this.priceSelectionStrategy;
    }
    public PriceRangesFacet setPredefinedRanges(DoubleChainableRange... predefinedRanges)
    {
        this.predefinedRanges = new ArrayList<>(Arrays.asList(predefinedRanges));;
        return this;
    }
    public PriceRangesFacet addToPredefinedRanges(DoubleChainableRange predefinedRanges)
    {
        if (this.predefinedRanges == null)
        {
            this.predefinedRanges = new ArrayList<>();
        }
        this.predefinedRanges.add(predefinedRanges);
        return this;
    }
    public PriceRangesFacet setExpandedRangeSize(@Nullable Double expandedRangeSize)
    {
        this.expandedRangeSize = expandedRangeSize;
        return this;
    }
    public PriceRangesFacet setSelected(DoubleChainableRange... selected)
    {
        this.selected = new ArrayList<>(Arrays.asList(selected));;
        return this;
    }
    public PriceRangesFacet addToSelected(DoubleChainableRange selected)
    {
        if (this.selected == null)
        {
            this.selected = new ArrayList<>();
        }
        this.selected.add(selected);
        return this;
    }
    public PriceRangesFacet setPriceSelectionStrategy(PriceSelectionStrategy priceSelectionStrategy)
    {
        this.priceSelectionStrategy = priceSelectionStrategy;
        return this;
    }
    @Override
    public PriceRangesFacet setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
    @Override
    public PriceRangesFacet setSettings(FacetSettings settings)
    {
        this.settings = settings;
        return this;
    }
}

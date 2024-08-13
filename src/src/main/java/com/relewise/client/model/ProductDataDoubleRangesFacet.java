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
    defaultImpl = ProductDataDoubleRangesFacet.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductDataDoubleRangesFacet extends DoubleProductDataRangesFacet
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Queries.ProductDataDoubleRangesFacet, Relewise.Client";
    public static ProductDataDoubleRangesFacet create(String key, DataSelectionStrategy dataSelectionStrategy, @Nullable ArrayList<DoubleChainableRange> predefinedRanges, @Nullable Double expandedRangeSize, DoubleChainableRange... selected)
    {
        return new ProductDataDoubleRangesFacet(key, dataSelectionStrategy, predefinedRanges, expandedRangeSize, selected);
    }
    public ProductDataDoubleRangesFacet(String key, DataSelectionStrategy dataSelectionStrategy, @Nullable ArrayList<DoubleChainableRange> predefinedRanges, @Nullable Double expandedRangeSize, DoubleChainableRange... selected)
    {
        this.key = key;
        this.dataSelectionStrategy = dataSelectionStrategy;
        this.predefinedRanges = predefinedRanges;
        this.expandedRangeSize = expandedRangeSize;
        this.selected = new ArrayList<>(Arrays.asList(selected));
    }
    public ProductDataDoubleRangesFacet()
    {
    }
    @Override
    public ProductDataDoubleRangesFacet setDataSelectionStrategy(DataSelectionStrategy dataSelectionStrategy)
    {
        this.dataSelectionStrategy = dataSelectionStrategy;
        return this;
    }
    @Override
    public ProductDataDoubleRangesFacet setPredefinedRanges(DoubleChainableRange... predefinedRanges)
    {
        this.predefinedRanges = new ArrayList<>(Arrays.asList(predefinedRanges));;
        return this;
    }
    public ProductDataDoubleRangesFacet addToPredefinedRanges(DoubleChainableRange predefinedRanges)
    {
        if (this.predefinedRanges == null)
        {
            this.predefinedRanges = new ArrayList<>();
        }
        this.predefinedRanges.add(predefinedRanges);
        return this;
    }
    @Override
    public ProductDataDoubleRangesFacet setExpandedRangeSize(@Nullable Double expandedRangeSize)
    {
        this.expandedRangeSize = expandedRangeSize;
        return this;
    }
    @Override
    public ProductDataDoubleRangesFacet setSelected(DoubleChainableRange... selected)
    {
        this.selected = new ArrayList<>(Arrays.asList(selected));;
        return this;
    }
    public ProductDataDoubleRangesFacet addToSelected(DoubleChainableRange selected)
    {
        if (this.selected == null)
        {
            this.selected = new ArrayList<>();
        }
        this.selected.add(selected);
        return this;
    }
    @Override
    public ProductDataDoubleRangesFacet setKey(String key)
    {
        this.key = key;
        return this;
    }
    @Override
    public ProductDataDoubleRangesFacet setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
    @Override
    public ProductDataDoubleRangesFacet setSettings(@Nullable FacetSettings settings)
    {
        this.settings = settings;
        return this;
    }
}

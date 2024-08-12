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
    defaultImpl = ProductDataDoubleRangesFacetResult.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductDataDoubleRangesFacetResult extends DoubleProductDataRangesFacetResult
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Result.ProductDataDoubleRangesFacetResult, Relewise.Client";
    public static ProductDataDoubleRangesFacetResult create(String key, DataSelectionStrategy dataSelectionStrategy, @Nullable Double expandedRangeSize, ArrayList<DoubleChainableRange> selected, DoubleChainableRangeAvailableFacetValue... available)
    {
        return new ProductDataDoubleRangesFacetResult(key, dataSelectionStrategy, expandedRangeSize, selected, available);
    }
    public ProductDataDoubleRangesFacetResult(String key, DataSelectionStrategy dataSelectionStrategy, @Nullable Double expandedRangeSize, ArrayList<DoubleChainableRange> selected, DoubleChainableRangeAvailableFacetValue... available)
    {
        this.key = key;
        this.dataSelectionStrategy = dataSelectionStrategy;
        this.expandedRangeSize = expandedRangeSize;
        this.selected = selected;
        this.available = new ArrayList<>(Arrays.asList(available));
    }
    public ProductDataDoubleRangesFacetResult()
    {
    }
    @Override
    public ProductDataDoubleRangesFacetResult setKey(String key)
    {
        this.key = key;
        return this;
    }
    @Override
    public ProductDataDoubleRangesFacetResult setDataSelectionStrategy(DataSelectionStrategy dataSelectionStrategy)
    {
        this.dataSelectionStrategy = dataSelectionStrategy;
        return this;
    }
    @Override
    public ProductDataDoubleRangesFacetResult setExpandedRangeSize(@Nullable Double expandedRangeSize)
    {
        this.expandedRangeSize = expandedRangeSize;
        return this;
    }
    @Override
    public ProductDataDoubleRangesFacetResult setSelected(DoubleChainableRange... selected)
    {
        this.selected = new ArrayList<>(Arrays.asList(selected));;
        return this;
    }
    public ProductDataDoubleRangesFacetResult addToSelected(DoubleChainableRange selected)
    {
        if (this.selected == null)
        {
            this.selected = new ArrayList<>();
        }
        this.selected.add(selected);
        return this;
    }
    @Override
    public ProductDataDoubleRangesFacetResult setAvailable(DoubleChainableRangeAvailableFacetValue... available)
    {
        this.available = new ArrayList<>(Arrays.asList(available));;
        return this;
    }
    public ProductDataDoubleRangesFacetResult addToAvailable(DoubleChainableRangeAvailableFacetValue available)
    {
        if (this.available == null)
        {
            this.available = new ArrayList<>();
        }
        this.available.add(available);
        return this;
    }
    @Override
    public ProductDataDoubleRangesFacetResult setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
}

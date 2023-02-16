package com.relewise.client.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
    defaultImpl = ProductCategoryDataDoubleRangesFacetResult.class)
public class ProductCategoryDataDoubleRangesFacetResult extends DoubleProductCategoryDataRangesFacetResult
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Result.ProductCategoryDataDoubleRangesFacetResult, Relewise.Client";
    public static ProductCategoryDataDoubleRangesFacetResult create(String key, @Nullable Double expandedRangeSize, ArrayList<DoubleChainableRange> selected, DoubleChainableRangeAvailableFacetValue... available)
    {
        return new ProductCategoryDataDoubleRangesFacetResult(key, expandedRangeSize, selected, available);
    }
    public ProductCategoryDataDoubleRangesFacetResult(String key, @Nullable Double expandedRangeSize, ArrayList<DoubleChainableRange> selected, DoubleChainableRangeAvailableFacetValue... available)
    {
        this.key = key;
        this.expandedRangeSize = expandedRangeSize;
        this.selected = selected;
        this.available = new ArrayList<>(Arrays.asList(available));
    }
    public ProductCategoryDataDoubleRangesFacetResult()
    {
    }
    @Override
    public ProductCategoryDataDoubleRangesFacetResult setKey(String key)
    {
        this.key = key;;
        return this;
    }
    @Override
    public ProductCategoryDataDoubleRangesFacetResult setExpandedRangeSize(@Nullable Double expandedRangeSize)
    {
        this.expandedRangeSize = expandedRangeSize;;
        return this;
    }
    @Override
    public ProductCategoryDataDoubleRangesFacetResult setSelected(DoubleChainableRange... selected)
    {
        this.selected = new ArrayList<>(Arrays.asList(selected));;
        return this;
    }
    public ProductCategoryDataDoubleRangesFacetResult addToSelected(DoubleChainableRange selected)
    {
        if (this.selected == null)
        {
            this.selected = new ArrayList<>();
        }
        this.selected.add(selected);
        return this;
    }
    @Override
    public ProductCategoryDataDoubleRangesFacetResult setAvailable(DoubleChainableRangeAvailableFacetValue... available)
    {
        this.available = new ArrayList<>(Arrays.asList(available));;
        return this;
    }
    public ProductCategoryDataDoubleRangesFacetResult addToAvailable(DoubleChainableRangeAvailableFacetValue available)
    {
        if (this.available == null)
        {
            this.available = new ArrayList<>();
        }
        this.available.add(available);
        return this;
    }
    @Override
    public ProductCategoryDataDoubleRangesFacetResult setField(FacetingField field)
    {
        this.field = field;;
        return this;
    }
}

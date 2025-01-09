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
import java.util.Set;
import java.util.HashSet;
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = ProductCategoryDataDoubleRangesFacet.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductCategoryDataDoubleRangesFacet extends DoubleProductCategoryDataRangesFacet
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Queries.ProductCategoryDataDoubleRangesFacet, Relewise.Client";
    public static ProductCategoryDataDoubleRangesFacet create(String key, @Nullable ArrayList<DoubleChainableRange> predefinedRanges, @Nullable Double expandedRangeSize, DoubleChainableRange... selected)
    {
        return new ProductCategoryDataDoubleRangesFacet(key, predefinedRanges, expandedRangeSize, selected);
    }
    public ProductCategoryDataDoubleRangesFacet(String key, @Nullable ArrayList<DoubleChainableRange> predefinedRanges, @Nullable Double expandedRangeSize, DoubleChainableRange... selected)
    {
        this.key = key;
        this.predefinedRanges = predefinedRanges;
        this.expandedRangeSize = expandedRangeSize;
        this.selected = new ArrayList<>(Arrays.asList(selected));
    }
    public ProductCategoryDataDoubleRangesFacet()
    {
    }
    @Override
    public ProductCategoryDataDoubleRangesFacet setPredefinedRanges(DoubleChainableRange... predefinedRanges)
    {
        this.predefinedRanges = new ArrayList<>(Arrays.asList(predefinedRanges));;
        return this;
    }
    public ProductCategoryDataDoubleRangesFacet addToPredefinedRanges(DoubleChainableRange predefinedRanges)
    {
        if (this.predefinedRanges == null)
        {
            this.predefinedRanges = new ArrayList<>();
        }
        this.predefinedRanges.add(predefinedRanges);
        return this;
    }
    @Override
    public ProductCategoryDataDoubleRangesFacet setExpandedRangeSize(@Nullable Double expandedRangeSize)
    {
        this.expandedRangeSize = expandedRangeSize;
        return this;
    }
    @Override
    public ProductCategoryDataDoubleRangesFacet setSelected(DoubleChainableRange... selected)
    {
        this.selected = new ArrayList<>(Arrays.asList(selected));;
        return this;
    }
    public ProductCategoryDataDoubleRangesFacet addToSelected(DoubleChainableRange selected)
    {
        if (this.selected == null)
        {
            this.selected = new ArrayList<>();
        }
        this.selected.add(selected);
        return this;
    }
    @Override
    public ProductCategoryDataDoubleRangesFacet setKey(String key)
    {
        this.key = key;
        return this;
    }
    @Override
    public ProductCategoryDataDoubleRangesFacet setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
    @Override
    public ProductCategoryDataDoubleRangesFacet setSettings(@Nullable FacetSettings settings)
    {
        this.settings = settings;
        return this;
    }
}

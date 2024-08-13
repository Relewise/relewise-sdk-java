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
    defaultImpl = ProductAssortmentFacetResult.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductAssortmentFacetResult extends AssortmentFacetResult
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Result.ProductAssortmentFacetResult, Relewise.Client";
    public AssortmentSelectionStrategy assortmentSelectionStrategy;
    public static ProductAssortmentFacetResult create(AssortmentSelectionStrategy assortmentSelectionStrategy, AssortmentFilterType assortmentFilterType, ArrayList<Integer> selected, IntegerAvailableFacetValue... available)
    {
        return new ProductAssortmentFacetResult(assortmentSelectionStrategy, assortmentFilterType, selected, available);
    }
    public ProductAssortmentFacetResult(AssortmentSelectionStrategy assortmentSelectionStrategy, AssortmentFilterType assortmentFilterType, ArrayList<Integer> selected, IntegerAvailableFacetValue... available)
    {
        this.assortmentSelectionStrategy = assortmentSelectionStrategy;
        this.assortmentFilterType = assortmentFilterType;
        this.selected = selected;
        this.available = new ArrayList<>(Arrays.asList(available));
    }
    public ProductAssortmentFacetResult()
    {
    }
    public AssortmentSelectionStrategy getAssortmentSelectionStrategy()
    {
        return this.assortmentSelectionStrategy;
    }
    public ProductAssortmentFacetResult setAssortmentSelectionStrategy(AssortmentSelectionStrategy assortmentSelectionStrategy)
    {
        this.assortmentSelectionStrategy = assortmentSelectionStrategy;
        return this;
    }
    @Override
    public ProductAssortmentFacetResult setAssortmentFilterType(AssortmentFilterType assortmentFilterType)
    {
        this.assortmentFilterType = assortmentFilterType;
        return this;
    }
    @Override
    public ProductAssortmentFacetResult setSelected(Integer... selected)
    {
        this.selected = new ArrayList<>(Arrays.asList(selected));;
        return this;
    }
    public ProductAssortmentFacetResult addToSelected(Integer selected)
    {
        if (this.selected == null)
        {
            this.selected = new ArrayList<>();
        }
        this.selected.add(selected);
        return this;
    }
    @Override
    public ProductAssortmentFacetResult setAvailable(IntegerAvailableFacetValue... available)
    {
        this.available = new ArrayList<>(Arrays.asList(available));;
        return this;
    }
    public ProductAssortmentFacetResult addToAvailable(IntegerAvailableFacetValue available)
    {
        if (this.available == null)
        {
            this.available = new ArrayList<>();
        }
        this.available.add(available);
        return this;
    }
    @Override
    public ProductAssortmentFacetResult setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
}

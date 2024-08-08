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
    defaultImpl = ProductDataDoubleValueFacetResult.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductDataDoubleValueFacetResult extends DoubleProductDataValueFacetResult
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Result.ProductDataDoubleValueFacetResult, Relewise.Client";
    public static ProductDataDoubleValueFacetResult create(DataSelectionStrategy dataSelectionStrategy, String key, ArrayList<Double> selected, @Nullable CollectionFilterType collectionFilterType, DoubleAvailableFacetValue... available)
    {
        return new ProductDataDoubleValueFacetResult(dataSelectionStrategy, key, selected, collectionFilterType, available);
    }
    public ProductDataDoubleValueFacetResult(DataSelectionStrategy dataSelectionStrategy, String key, ArrayList<Double> selected, @Nullable CollectionFilterType collectionFilterType, DoubleAvailableFacetValue... available)
    {
        this.dataSelectionStrategy = dataSelectionStrategy;
        this.key = key;
        this.selected = selected;
        this.collectionFilterType = collectionFilterType;
        this.available = new ArrayList<>(Arrays.asList(available));
    }
    public ProductDataDoubleValueFacetResult()
    {
    }
    @Override
    public ProductDataDoubleValueFacetResult setDataSelectionStrategy(DataSelectionStrategy dataSelectionStrategy)
    {
        this.dataSelectionStrategy = dataSelectionStrategy;;
        return this;
    }
    @Override
    public ProductDataDoubleValueFacetResult setKey(String key)
    {
        this.key = key;;
        return this;
    }
    @Override
    public ProductDataDoubleValueFacetResult setCollectionFilterType(@Nullable CollectionFilterType collectionFilterType)
    {
        this.collectionFilterType = collectionFilterType;;
        return this;
    }
    @Override
    public ProductDataDoubleValueFacetResult setSelected(Double... selected)
    {
        this.selected = new ArrayList<>(Arrays.asList(selected));;
        return this;
    }
    public ProductDataDoubleValueFacetResult addToSelected(Double selected)
    {
        if (this.selected == null)
        {
            this.selected = new ArrayList<>();
        }
        this.selected.add(selected);
        return this;
    }
    @Override
    public ProductDataDoubleValueFacetResult setAvailable(DoubleAvailableFacetValue... available)
    {
        this.available = new ArrayList<>(Arrays.asList(available));;
        return this;
    }
    public ProductDataDoubleValueFacetResult addToAvailable(DoubleAvailableFacetValue available)
    {
        if (this.available == null)
        {
            this.available = new ArrayList<>();
        }
        this.available.add(available);
        return this;
    }
    @Override
    public ProductDataDoubleValueFacetResult setField(FacetingField field)
    {
        this.field = field;;
        return this;
    }
}

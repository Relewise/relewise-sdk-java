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
    defaultImpl = ProductDataIntegerValueFacetResult.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductDataIntegerValueFacetResult extends IntegerProductDataValueFacetResult
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Result.ProductDataIntegerValueFacetResult, Relewise.Client";
    public static ProductDataIntegerValueFacetResult create(DataSelectionStrategy dataSelectionStrategy, String key, ArrayList<Integer> selected, @Nullable CollectionFilterType collectionFilterType, IntegerAvailableFacetValue... available)
    {
        return new ProductDataIntegerValueFacetResult(dataSelectionStrategy, key, selected, collectionFilterType, available);
    }
    public ProductDataIntegerValueFacetResult(DataSelectionStrategy dataSelectionStrategy, String key, ArrayList<Integer> selected, @Nullable CollectionFilterType collectionFilterType, IntegerAvailableFacetValue... available)
    {
        this.dataSelectionStrategy = dataSelectionStrategy;
        this.key = key;
        this.selected = selected;
        this.collectionFilterType = collectionFilterType;
        this.available = new ArrayList<>(Arrays.asList(available));
    }
    public ProductDataIntegerValueFacetResult()
    {
    }
    @Override
    public ProductDataIntegerValueFacetResult setDataSelectionStrategy(DataSelectionStrategy dataSelectionStrategy)
    {
        this.dataSelectionStrategy = dataSelectionStrategy;
        return this;
    }
    @Override
    public ProductDataIntegerValueFacetResult setKey(String key)
    {
        this.key = key;
        return this;
    }
    @Override
    public ProductDataIntegerValueFacetResult setCollectionFilterType(@Nullable CollectionFilterType collectionFilterType)
    {
        this.collectionFilterType = collectionFilterType;
        return this;
    }
    @Override
    public ProductDataIntegerValueFacetResult setSelected(Integer... selected)
    {
        this.selected = new ArrayList<>(Arrays.asList(selected));;
        return this;
    }
    public ProductDataIntegerValueFacetResult addToSelected(Integer selected)
    {
        if (this.selected == null)
        {
            this.selected = new ArrayList<>();
        }
        this.selected.add(selected);
        return this;
    }
    @Override
    public ProductDataIntegerValueFacetResult setAvailable(IntegerAvailableFacetValue... available)
    {
        this.available = new ArrayList<>(Arrays.asList(available));;
        return this;
    }
    public ProductDataIntegerValueFacetResult addToAvailable(IntegerAvailableFacetValue available)
    {
        if (this.available == null)
        {
            this.available = new ArrayList<>();
        }
        this.available.add(available);
        return this;
    }
    @Override
    public ProductDataIntegerValueFacetResult setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
}

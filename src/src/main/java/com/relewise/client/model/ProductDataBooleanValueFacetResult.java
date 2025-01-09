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
    defaultImpl = ProductDataBooleanValueFacetResult.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductDataBooleanValueFacetResult extends BooleanProductDataValueFacetResult
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Result.ProductDataBooleanValueFacetResult, Relewise.Client";
    public static ProductDataBooleanValueFacetResult create(DataSelectionStrategy dataSelectionStrategy, String key, ArrayList<Boolean> selected, @Nullable CollectionFilterType collectionFilterType, BooleanAvailableFacetValue... available)
    {
        return new ProductDataBooleanValueFacetResult(dataSelectionStrategy, key, selected, collectionFilterType, available);
    }
    public ProductDataBooleanValueFacetResult(DataSelectionStrategy dataSelectionStrategy, String key, ArrayList<Boolean> selected, @Nullable CollectionFilterType collectionFilterType, BooleanAvailableFacetValue... available)
    {
        this.dataSelectionStrategy = dataSelectionStrategy;
        this.key = key;
        this.selected = selected;
        this.collectionFilterType = collectionFilterType;
        this.available = new ArrayList<>(Arrays.asList(available));
    }
    public ProductDataBooleanValueFacetResult()
    {
    }
    @Override
    public ProductDataBooleanValueFacetResult setDataSelectionStrategy(DataSelectionStrategy dataSelectionStrategy)
    {
        this.dataSelectionStrategy = dataSelectionStrategy;
        return this;
    }
    @Override
    public ProductDataBooleanValueFacetResult setKey(String key)
    {
        this.key = key;
        return this;
    }
    @Override
    public ProductDataBooleanValueFacetResult setCollectionFilterType(@Nullable CollectionFilterType collectionFilterType)
    {
        this.collectionFilterType = collectionFilterType;
        return this;
    }
    @Override
    public ProductDataBooleanValueFacetResult setSelected(Boolean... selected)
    {
        this.selected = new ArrayList<>(Arrays.asList(selected));;
        return this;
    }
    public ProductDataBooleanValueFacetResult addToSelected(Boolean selected)
    {
        if (this.selected == null)
        {
            this.selected = new ArrayList<>();
        }
        this.selected.add(selected);
        return this;
    }
    @Override
    public ProductDataBooleanValueFacetResult setAvailable(BooleanAvailableFacetValue... available)
    {
        this.available = new ArrayList<>(Arrays.asList(available));;
        return this;
    }
    public ProductDataBooleanValueFacetResult addToAvailable(BooleanAvailableFacetValue available)
    {
        if (this.available == null)
        {
            this.available = new ArrayList<>();
        }
        this.available.add(available);
        return this;
    }
    @Override
    public ProductDataBooleanValueFacetResult setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
}

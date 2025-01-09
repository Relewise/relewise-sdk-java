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
    defaultImpl = ProductDataStringValueFacetResult.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductDataStringValueFacetResult extends StringProductDataValueFacetResult
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Result.ProductDataStringValueFacetResult, Relewise.Client";
    public static ProductDataStringValueFacetResult create(DataSelectionStrategy dataSelectionStrategy, String key, ArrayList<String> selected, @Nullable CollectionFilterType collectionFilterType, StringAvailableFacetValue... available)
    {
        return new ProductDataStringValueFacetResult(dataSelectionStrategy, key, selected, collectionFilterType, available);
    }
    public ProductDataStringValueFacetResult(DataSelectionStrategy dataSelectionStrategy, String key, ArrayList<String> selected, @Nullable CollectionFilterType collectionFilterType, StringAvailableFacetValue... available)
    {
        this.dataSelectionStrategy = dataSelectionStrategy;
        this.key = key;
        this.selected = selected;
        this.collectionFilterType = collectionFilterType;
        this.available = new ArrayList<>(Arrays.asList(available));
    }
    public ProductDataStringValueFacetResult()
    {
    }
    @Override
    public ProductDataStringValueFacetResult setDataSelectionStrategy(DataSelectionStrategy dataSelectionStrategy)
    {
        this.dataSelectionStrategy = dataSelectionStrategy;
        return this;
    }
    @Override
    public ProductDataStringValueFacetResult setKey(String key)
    {
        this.key = key;
        return this;
    }
    @Override
    public ProductDataStringValueFacetResult setCollectionFilterType(@Nullable CollectionFilterType collectionFilterType)
    {
        this.collectionFilterType = collectionFilterType;
        return this;
    }
    @Override
    public ProductDataStringValueFacetResult setSelected(String... selected)
    {
        this.selected = new ArrayList<>(Arrays.asList(selected));;
        return this;
    }
    public ProductDataStringValueFacetResult addToSelected(String selected)
    {
        if (this.selected == null)
        {
            this.selected = new ArrayList<>();
        }
        this.selected.add(selected);
        return this;
    }
    @Override
    public ProductDataStringValueFacetResult setAvailable(StringAvailableFacetValue... available)
    {
        this.available = new ArrayList<>(Arrays.asList(available));;
        return this;
    }
    public ProductDataStringValueFacetResult addToAvailable(StringAvailableFacetValue available)
    {
        if (this.available == null)
        {
            this.available = new ArrayList<>();
        }
        this.available.add(available);
        return this;
    }
    @Override
    public ProductDataStringValueFacetResult setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
}

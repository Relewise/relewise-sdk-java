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
    defaultImpl = ProductDataDoubleValueFacet.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductDataDoubleValueFacet extends DoubleProductDataValueFacet
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Queries.ProductDataDoubleValueFacet, Relewise.Client";
    public static ProductDataDoubleValueFacet create(DataSelectionStrategy dataSelectionStrategy, String key, @Nullable ArrayList<Double> selected, @Nullable CollectionFilterType collectionFilterType)
    {
        return new ProductDataDoubleValueFacet(dataSelectionStrategy, key, selected, collectionFilterType);
    }
    public ProductDataDoubleValueFacet(DataSelectionStrategy dataSelectionStrategy, String key, @Nullable ArrayList<Double> selected, @Nullable CollectionFilterType collectionFilterType)
    {
        this.dataSelectionStrategy = dataSelectionStrategy;
        this.key = key;
        this.selected = selected;
        this.collectionFilterType = collectionFilterType;
    }
    public ProductDataDoubleValueFacet()
    {
    }
    @Override
    public ProductDataDoubleValueFacet setDataSelectionStrategy(DataSelectionStrategy dataSelectionStrategy)
    {
        this.dataSelectionStrategy = dataSelectionStrategy;
        return this;
    }
    @Override
    public ProductDataDoubleValueFacet setKey(String key)
    {
        this.key = key;
        return this;
    }
    @Override
    public ProductDataDoubleValueFacet setCollectionFilterType(@Nullable CollectionFilterType collectionFilterType)
    {
        this.collectionFilterType = collectionFilterType;
        return this;
    }
    @Override
    public ProductDataDoubleValueFacet setSelected(Double... selected)
    {
        this.selected = new ArrayList<>(Arrays.asList(selected));;
        return this;
    }
    public ProductDataDoubleValueFacet addToSelected(Double selected)
    {
        if (this.selected == null)
        {
            this.selected = new ArrayList<>();
        }
        this.selected.add(selected);
        return this;
    }
    @Override
    public ProductDataDoubleValueFacet setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
    @Override
    public ProductDataDoubleValueFacet setSettings(@Nullable FacetSettings settings)
    {
        this.settings = settings;
        return this;
    }
}

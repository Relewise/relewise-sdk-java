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
    defaultImpl = ProductDataBooleanValueFacet.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductDataBooleanValueFacet extends BooleanProductDataValueFacet
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Queries.ProductDataBooleanValueFacet, Relewise.Client";
    public static ProductDataBooleanValueFacet create(DataSelectionStrategy dataSelectionStrategy, String key, @Nullable ArrayList<Boolean> selected, @Nullable CollectionFilterType collectionFilterType)
    {
        return new ProductDataBooleanValueFacet(dataSelectionStrategy, key, selected, collectionFilterType);
    }
    public ProductDataBooleanValueFacet(DataSelectionStrategy dataSelectionStrategy, String key, @Nullable ArrayList<Boolean> selected, @Nullable CollectionFilterType collectionFilterType)
    {
        this.dataSelectionStrategy = dataSelectionStrategy;
        this.key = key;
        this.selected = selected;
        this.collectionFilterType = collectionFilterType;
    }
    public ProductDataBooleanValueFacet()
    {
    }
    @Override
    public ProductDataBooleanValueFacet setDataSelectionStrategy(DataSelectionStrategy dataSelectionStrategy)
    {
        this.dataSelectionStrategy = dataSelectionStrategy;
        return this;
    }
    @Override
    public ProductDataBooleanValueFacet setKey(String key)
    {
        this.key = key;
        return this;
    }
    @Override
    public ProductDataBooleanValueFacet setCollectionFilterType(@Nullable CollectionFilterType collectionFilterType)
    {
        this.collectionFilterType = collectionFilterType;
        return this;
    }
    @Override
    public ProductDataBooleanValueFacet setSelected(Boolean... selected)
    {
        this.selected = new ArrayList<>(Arrays.asList(selected));;
        return this;
    }
    public ProductDataBooleanValueFacet addToSelected(Boolean selected)
    {
        if (this.selected == null)
        {
            this.selected = new ArrayList<>();
        }
        this.selected.add(selected);
        return this;
    }
    @Override
    public ProductDataBooleanValueFacet setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
    @Override
    public ProductDataBooleanValueFacet setSettings(FacetSettings settings)
    {
        this.settings = settings;
        return this;
    }
}

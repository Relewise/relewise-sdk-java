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
    defaultImpl = ProductDataIntegerValueFacet.class)
public class ProductDataIntegerValueFacet extends IntegerProductDataValueFacet
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Queries.ProductDataIntegerValueFacet, Relewise.Client";
    public static ProductDataIntegerValueFacet create(DataSelectionStrategy dataSelectionStrategy, String key, @Nullable ArrayList<Integer> selected, @Nullable CollectionFilterType collectionFilterType)
    {
        return new ProductDataIntegerValueFacet(dataSelectionStrategy, key, selected, collectionFilterType);
    }
    public ProductDataIntegerValueFacet(DataSelectionStrategy dataSelectionStrategy, String key, @Nullable ArrayList<Integer> selected, @Nullable CollectionFilterType collectionFilterType)
    {
        this.dataSelectionStrategy = dataSelectionStrategy;
        this.key = key;
        this.selected = selected;
        this.collectionFilterType = collectionFilterType;
    }
    public ProductDataIntegerValueFacet()
    {
    }
    @Override
    public ProductDataIntegerValueFacet setDataSelectionStrategy(DataSelectionStrategy dataSelectionStrategy)
    {
        this.dataSelectionStrategy = dataSelectionStrategy;;
        return this;
    }
    @Override
    public ProductDataIntegerValueFacet setKey(String key)
    {
        this.key = key;;
        return this;
    }
    @Override
    public ProductDataIntegerValueFacet setCollectionFilterType(@Nullable CollectionFilterType collectionFilterType)
    {
        this.collectionFilterType = collectionFilterType;;
        return this;
    }
    @Override
    public ProductDataIntegerValueFacet setSelected(Integer... selected)
    {
        this.selected = new ArrayList<>(Arrays.asList(selected));;
        return this;
    }
    public ProductDataIntegerValueFacet addToSelected(Integer selected)
    {
        if (this.selected == null)
        {
            this.selected = new ArrayList<>();
        }
        this.selected.add(selected);
        return this;
    }
    @Override
    public ProductDataIntegerValueFacet setField(FacetingField field)
    {
        this.field = field;;
        return this;
    }
    @Override
    public ProductDataIntegerValueFacet setSettings(FacetSettings settings)
    {
        this.settings = settings;;
        return this;
    }
}

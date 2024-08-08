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
    defaultImpl = ProductDataStringValueFacet.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductDataStringValueFacet extends StringProductDataValueFacet
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Queries.ProductDataStringValueFacet, Relewise.Client";
    public static ProductDataStringValueFacet create(DataSelectionStrategy dataSelectionStrategy, String key, @Nullable ArrayList<String> selected, @Nullable CollectionFilterType collectionFilterType)
    {
        return new ProductDataStringValueFacet(dataSelectionStrategy, key, selected, collectionFilterType);
    }
    public ProductDataStringValueFacet(DataSelectionStrategy dataSelectionStrategy, String key, @Nullable ArrayList<String> selected, @Nullable CollectionFilterType collectionFilterType)
    {
        this.dataSelectionStrategy = dataSelectionStrategy;
        this.key = key;
        this.selected = selected;
        this.collectionFilterType = collectionFilterType;
    }
    public ProductDataStringValueFacet()
    {
    }
    @Override
    public ProductDataStringValueFacet setDataSelectionStrategy(DataSelectionStrategy dataSelectionStrategy)
    {
        this.dataSelectionStrategy = dataSelectionStrategy;;
        return this;
    }
    @Override
    public ProductDataStringValueFacet setKey(String key)
    {
        this.key = key;;
        return this;
    }
    @Override
    public ProductDataStringValueFacet setCollectionFilterType(@Nullable CollectionFilterType collectionFilterType)
    {
        this.collectionFilterType = collectionFilterType;;
        return this;
    }
    @Override
    public ProductDataStringValueFacet setSelected(String... selected)
    {
        this.selected = new ArrayList<>(Arrays.asList(selected));;
        return this;
    }
    public ProductDataStringValueFacet addToSelected(String selected)
    {
        if (this.selected == null)
        {
            this.selected = new ArrayList<>();
        }
        this.selected.add(selected);
        return this;
    }
    @Override
    public ProductDataStringValueFacet setField(FacetingField field)
    {
        this.field = field;;
        return this;
    }
    @Override
    public ProductDataStringValueFacet setSettings(FacetSettings settings)
    {
        this.settings = settings;;
        return this;
    }
}

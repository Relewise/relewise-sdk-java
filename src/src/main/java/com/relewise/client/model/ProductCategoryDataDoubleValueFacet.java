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
    defaultImpl = ProductCategoryDataDoubleValueFacet.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductCategoryDataDoubleValueFacet extends DoubleProductCategoryDataValueFacet
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Queries.ProductCategoryDataDoubleValueFacet, Relewise.Client";
    public static ProductCategoryDataDoubleValueFacet create(String key, @Nullable ArrayList<Double> selected, @Nullable CollectionFilterType collectionFilterType)
    {
        return new ProductCategoryDataDoubleValueFacet(key, selected, collectionFilterType);
    }
    public ProductCategoryDataDoubleValueFacet(String key, @Nullable ArrayList<Double> selected, @Nullable CollectionFilterType collectionFilterType)
    {
        this.key = key;
        this.selected = selected;
        this.collectionFilterType = collectionFilterType;
    }
    public ProductCategoryDataDoubleValueFacet()
    {
    }
    @Override
    public ProductCategoryDataDoubleValueFacet setKey(String key)
    {
        this.key = key;
        return this;
    }
    @Override
    public ProductCategoryDataDoubleValueFacet setCollectionFilterType(@Nullable CollectionFilterType collectionFilterType)
    {
        this.collectionFilterType = collectionFilterType;
        return this;
    }
    @Override
    public ProductCategoryDataDoubleValueFacet setSelected(Double... selected)
    {
        this.selected = new ArrayList<>(Arrays.asList(selected));;
        return this;
    }
    public ProductCategoryDataDoubleValueFacet addToSelected(Double selected)
    {
        if (this.selected == null)
        {
            this.selected = new ArrayList<>();
        }
        this.selected.add(selected);
        return this;
    }
    @Override
    public ProductCategoryDataDoubleValueFacet setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
    @Override
    public ProductCategoryDataDoubleValueFacet setSettings(FacetSettings settings)
    {
        this.settings = settings;
        return this;
    }
}

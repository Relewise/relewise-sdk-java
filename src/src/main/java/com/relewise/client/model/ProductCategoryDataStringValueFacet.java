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
    defaultImpl = ProductCategoryDataStringValueFacet.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductCategoryDataStringValueFacet extends StringProductCategoryDataValueFacet
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Queries.ProductCategoryDataStringValueFacet, Relewise.Client";
    public static ProductCategoryDataStringValueFacet create(String key, @Nullable ArrayList<String> selected, @Nullable CollectionFilterType collectionFilterType)
    {
        return new ProductCategoryDataStringValueFacet(key, selected, collectionFilterType);
    }
    public ProductCategoryDataStringValueFacet(String key, @Nullable ArrayList<String> selected, @Nullable CollectionFilterType collectionFilterType)
    {
        this.key = key;
        this.selected = selected;
        this.collectionFilterType = collectionFilterType;
    }
    public ProductCategoryDataStringValueFacet()
    {
    }
    @Override
    public ProductCategoryDataStringValueFacet setKey(String key)
    {
        this.key = key;
        return this;
    }
    @Override
    public ProductCategoryDataStringValueFacet setCollectionFilterType(@Nullable CollectionFilterType collectionFilterType)
    {
        this.collectionFilterType = collectionFilterType;
        return this;
    }
    @Override
    public ProductCategoryDataStringValueFacet setSelected(String... selected)
    {
        this.selected = new ArrayList<>(Arrays.asList(selected));;
        return this;
    }
    public ProductCategoryDataStringValueFacet addToSelected(String selected)
    {
        if (this.selected == null)
        {
            this.selected = new ArrayList<>();
        }
        this.selected.add(selected);
        return this;
    }
    @Override
    public ProductCategoryDataStringValueFacet setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
    @Override
    public ProductCategoryDataStringValueFacet setSettings(FacetSettings settings)
    {
        this.settings = settings;
        return this;
    }
}

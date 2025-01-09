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
    defaultImpl = ProductCategoryDataBooleanValueFacet.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductCategoryDataBooleanValueFacet extends BooleanProductCategoryDataValueFacet
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Queries.ProductCategoryDataBooleanValueFacet, Relewise.Client";
    public static ProductCategoryDataBooleanValueFacet create(String key, @Nullable ArrayList<Boolean> selected, @Nullable CollectionFilterType collectionFilterType)
    {
        return new ProductCategoryDataBooleanValueFacet(key, selected, collectionFilterType);
    }
    public ProductCategoryDataBooleanValueFacet(String key, @Nullable ArrayList<Boolean> selected, @Nullable CollectionFilterType collectionFilterType)
    {
        this.key = key;
        this.selected = selected;
        this.collectionFilterType = collectionFilterType;
    }
    public ProductCategoryDataBooleanValueFacet()
    {
    }
    @Override
    public ProductCategoryDataBooleanValueFacet setKey(String key)
    {
        this.key = key;
        return this;
    }
    @Override
    public ProductCategoryDataBooleanValueFacet setCollectionFilterType(@Nullable CollectionFilterType collectionFilterType)
    {
        this.collectionFilterType = collectionFilterType;
        return this;
    }
    @Override
    public ProductCategoryDataBooleanValueFacet setSelected(Boolean... selected)
    {
        this.selected = new ArrayList<>(Arrays.asList(selected));;
        return this;
    }
    public ProductCategoryDataBooleanValueFacet addToSelected(Boolean selected)
    {
        if (this.selected == null)
        {
            this.selected = new ArrayList<>();
        }
        this.selected.add(selected);
        return this;
    }
    @Override
    public ProductCategoryDataBooleanValueFacet setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
    @Override
    public ProductCategoryDataBooleanValueFacet setSettings(@Nullable FacetSettings settings)
    {
        this.settings = settings;
        return this;
    }
}

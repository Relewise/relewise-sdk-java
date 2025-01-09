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
    defaultImpl = ProductCategoryDataBooleanValueFacetResult.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductCategoryDataBooleanValueFacetResult extends BooleanProductCategoryDataValueFacetResult
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Result.ProductCategoryDataBooleanValueFacetResult, Relewise.Client";
    public static ProductCategoryDataBooleanValueFacetResult create(String key, ArrayList<Boolean> selected, @Nullable CollectionFilterType collectionFilterType, BooleanAvailableFacetValue... available)
    {
        return new ProductCategoryDataBooleanValueFacetResult(key, selected, collectionFilterType, available);
    }
    public ProductCategoryDataBooleanValueFacetResult(String key, ArrayList<Boolean> selected, @Nullable CollectionFilterType collectionFilterType, BooleanAvailableFacetValue... available)
    {
        this.key = key;
        this.selected = selected;
        this.collectionFilterType = collectionFilterType;
        this.available = new ArrayList<>(Arrays.asList(available));
    }
    public ProductCategoryDataBooleanValueFacetResult()
    {
    }
    @Override
    public ProductCategoryDataBooleanValueFacetResult setKey(String key)
    {
        this.key = key;
        return this;
    }
    @Override
    public ProductCategoryDataBooleanValueFacetResult setCollectionFilterType(@Nullable CollectionFilterType collectionFilterType)
    {
        this.collectionFilterType = collectionFilterType;
        return this;
    }
    @Override
    public ProductCategoryDataBooleanValueFacetResult setSelected(Boolean... selected)
    {
        this.selected = new ArrayList<>(Arrays.asList(selected));;
        return this;
    }
    public ProductCategoryDataBooleanValueFacetResult addToSelected(Boolean selected)
    {
        if (this.selected == null)
        {
            this.selected = new ArrayList<>();
        }
        this.selected.add(selected);
        return this;
    }
    @Override
    public ProductCategoryDataBooleanValueFacetResult setAvailable(BooleanAvailableFacetValue... available)
    {
        this.available = new ArrayList<>(Arrays.asList(available));;
        return this;
    }
    public ProductCategoryDataBooleanValueFacetResult addToAvailable(BooleanAvailableFacetValue available)
    {
        if (this.available == null)
        {
            this.available = new ArrayList<>();
        }
        this.available.add(available);
        return this;
    }
    @Override
    public ProductCategoryDataBooleanValueFacetResult setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
}

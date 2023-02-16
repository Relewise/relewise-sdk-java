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
    defaultImpl = ProductCategoryDataStringValueFacetResult.class)
public class ProductCategoryDataStringValueFacetResult extends StringProductCategoryDataValueFacetResult
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Result.ProductCategoryDataStringValueFacetResult, Relewise.Client";
    public static ProductCategoryDataStringValueFacetResult create(String key, ArrayList<String> selected, @Nullable CollectionFilterType collectionFilterType, StringAvailableFacetValue... available)
    {
        return new ProductCategoryDataStringValueFacetResult(key, selected, collectionFilterType, available);
    }
    public ProductCategoryDataStringValueFacetResult(String key, ArrayList<String> selected, @Nullable CollectionFilterType collectionFilterType, StringAvailableFacetValue... available)
    {
        this.key = key;
        this.selected = selected;
        this.collectionFilterType = collectionFilterType;
        this.available = new ArrayList<>(Arrays.asList(available));
    }
    public ProductCategoryDataStringValueFacetResult()
    {
    }
    @Override
    public ProductCategoryDataStringValueFacetResult setKey(String key)
    {
        this.key = key;;
        return this;
    }
    @Override
    public ProductCategoryDataStringValueFacetResult setCollectionFilterType(@Nullable CollectionFilterType collectionFilterType)
    {
        this.collectionFilterType = collectionFilterType;;
        return this;
    }
    @Override
    public ProductCategoryDataStringValueFacetResult setSelected(String... selected)
    {
        this.selected = new ArrayList<>(Arrays.asList(selected));;
        return this;
    }
    public ProductCategoryDataStringValueFacetResult addToSelected(String selected)
    {
        if (this.selected == null)
        {
            this.selected = new ArrayList<>();
        }
        this.selected.add(selected);
        return this;
    }
    @Override
    public ProductCategoryDataStringValueFacetResult setAvailable(StringAvailableFacetValue... available)
    {
        this.available = new ArrayList<>(Arrays.asList(available));;
        return this;
    }
    public ProductCategoryDataStringValueFacetResult addToAvailable(StringAvailableFacetValue available)
    {
        if (this.available == null)
        {
            this.available = new ArrayList<>();
        }
        this.available.add(available);
        return this;
    }
    @Override
    public ProductCategoryDataStringValueFacetResult setField(FacetingField field)
    {
        this.field = field;;
        return this;
    }
}

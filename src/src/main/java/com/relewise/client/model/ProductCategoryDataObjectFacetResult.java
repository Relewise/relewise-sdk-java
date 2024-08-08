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
    defaultImpl = ProductCategoryDataObjectFacetResult.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductCategoryDataObjectFacetResult extends DataObjectFacetResult
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Result.ProductCategoryDataObjectFacetResult, Relewise.Client";
    public static ProductCategoryDataObjectFacetResult create(String key, ArrayList<FacetResult> items, DataObjectFilter filter)
    {
        return new ProductCategoryDataObjectFacetResult(key, items, filter);
    }
    public ProductCategoryDataObjectFacetResult(String key, ArrayList<FacetResult> items, DataObjectFilter filter)
    {
        this.key = key;
        this.items = items;
        this.filter = filter;
    }
    public ProductCategoryDataObjectFacetResult()
    {
    }
    @Override
    public ProductCategoryDataObjectFacetResult setKey(String key)
    {
        this.key = key;;
        return this;
    }
    @Override
    public ProductCategoryDataObjectFacetResult setItems(FacetResult... items)
    {
        this.items = new ArrayList<>(Arrays.asList(items));;
        return this;
    }
    public ProductCategoryDataObjectFacetResult addToItems(FacetResult items)
    {
        if (this.items == null)
        {
            this.items = new ArrayList<>();
        }
        this.items.add(items);
        return this;
    }
    @Override
    public ProductCategoryDataObjectFacetResult setFilter(DataObjectFilter filter)
    {
        this.filter = filter;;
        return this;
    }
    @Override
    public ProductCategoryDataObjectFacetResult setField(FacetingField field)
    {
        this.field = field;;
        return this;
    }
}

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
    defaultImpl = ProductCategoryFacetResult.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductCategoryFacetResult
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Result.ProductCategoryFacetResult, Relewise.Client";
    public ArrayList<FacetResult> items;
    public static ProductCategoryFacetResult create()
    {
        return new ProductCategoryFacetResult();
    }
    public ProductCategoryFacetResult()
    {
    }
    public ArrayList<FacetResult> getItems()
    {
        return this.items;
    }
    public ProductCategoryFacetResult setItems(FacetResult... items)
    {
        this.items = new ArrayList<>(Arrays.asList(items));;
        return this;
    }
    public ProductCategoryFacetResult addToItems(FacetResult items)
    {
        if (this.items == null)
        {
            this.items = new ArrayList<>();
        }
        this.items.add(items);
        return this;
    }
}

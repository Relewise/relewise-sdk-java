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
    defaultImpl = ProductCategoryDataSorting.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductCategoryDataSorting extends ProductCategorySorting
{
    public String $type = "Relewise.Client.DataTypes.Search.Sorting.ProductCategory.ProductCategoryDataSorting, Relewise.Client";
    public String key;
    public SortMode mode;
    public static ProductCategoryDataSorting create(String key, SortOrder order)
    {
        return new ProductCategoryDataSorting(key, order);
    }
    public ProductCategoryDataSorting(String key, SortOrder order)
    {
        this.key = key;
        this.order = order;
        this.mode = SortMode.Auto;
    }
    public static ProductCategoryDataSorting create(String key, SortOrder order, SortMode mode)
    {
        return new ProductCategoryDataSorting(key, order, mode);
    }
    public ProductCategoryDataSorting(String key, SortOrder order, SortMode mode)
    {
        this.key = key;
        this.order = order;
        this.mode = mode;
    }
    public ProductCategoryDataSorting()
    {
        this.mode = SortMode.Auto;
    }
    public String getKey()
    {
        return this.key;
    }
    public SortMode getMode()
    {
        return this.mode;
    }
    public ProductCategoryDataSorting setKey(String key)
    {
        this.key = key;;
        return this;
    }
    public ProductCategoryDataSorting setMode(SortMode mode)
    {
        this.mode = mode;;
        return this;
    }
    @Override
    public ProductCategoryDataSorting setOrder(SortOrder order)
    {
        this.order = order;;
        return this;
    }
    @Override
    public ProductCategoryDataSorting setThenBy(ProductCategorySorting thenBy)
    {
        this.thenBy = thenBy;;
        return this;
    }
}

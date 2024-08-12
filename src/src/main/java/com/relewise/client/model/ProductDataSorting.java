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
    defaultImpl = ProductDataSorting.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductDataSorting extends ProductSorting
{
    public String $type = "Relewise.Client.DataTypes.Search.Sorting.Product.ProductDataSorting, Relewise.Client";
    public String key;
    public DataSelectionStrategy dataSelectionStrategy;
    public SortMode mode;
    public static ProductDataSorting create(String key, DataSelectionStrategy dataSelectionStrategy, SortOrder order)
    {
        return new ProductDataSorting(key, dataSelectionStrategy, order);
    }
    public ProductDataSorting(String key, DataSelectionStrategy dataSelectionStrategy, SortOrder order)
    {
        this.key = key;
        this.dataSelectionStrategy = dataSelectionStrategy;
        this.order = order;
        this.mode = SortMode.Auto;
    }
    public static ProductDataSorting create(String key, DataSelectionStrategy dataSelectionStrategy, SortOrder order, SortMode mode)
    {
        return new ProductDataSorting(key, dataSelectionStrategy, order, mode);
    }
    public ProductDataSorting(String key, DataSelectionStrategy dataSelectionStrategy, SortOrder order, SortMode mode)
    {
        this.key = key;
        this.dataSelectionStrategy = dataSelectionStrategy;
        this.order = order;
        this.mode = mode;
    }
    public ProductDataSorting()
    {
        this.mode = SortMode.Auto;
    }
    public String getKey()
    {
        return this.key;
    }
    public DataSelectionStrategy getDataSelectionStrategy()
    {
        return this.dataSelectionStrategy;
    }
    public SortMode getMode()
    {
        return this.mode;
    }
    public ProductDataSorting setKey(String key)
    {
        this.key = key;
        return this;
    }
    public ProductDataSorting setDataSelectionStrategy(DataSelectionStrategy dataSelectionStrategy)
    {
        this.dataSelectionStrategy = dataSelectionStrategy;
        return this;
    }
    public ProductDataSorting setMode(SortMode mode)
    {
        this.mode = mode;
        return this;
    }
    @Override
    public ProductDataSorting setOrder(SortOrder order)
    {
        this.order = order;
        return this;
    }
    @Override
    public ProductDataSorting setThenBy(ProductSorting thenBy)
    {
        this.thenBy = thenBy;
        return this;
    }
}

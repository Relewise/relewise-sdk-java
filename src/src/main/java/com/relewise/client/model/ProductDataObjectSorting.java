package com.relewise.client.model;

import com.fasterxml.jackson.annotation.*;
import javax.annotation.Nullable;
import java.io.IOException;
import java.time.Duration;
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
    defaultImpl = ProductDataObjectSorting.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductDataObjectSorting extends ProductSorting
{
    public String $type = "Relewise.Client.DataTypes.Search.Sorting.Product.ProductDataObjectSorting, Relewise.Client";
    public DataSelectionStrategy dataSelectionStrategy;
    public SortMode mode;
    public DataObjectValueSelector valueSelector;
    public static ProductDataObjectSorting create(DataSelectionStrategy dataSelectionStrategy, SortOrder order, DataObjectValueSelector valueSelector)
    {
        return new ProductDataObjectSorting(dataSelectionStrategy, order, valueSelector);
    }
    public ProductDataObjectSorting(DataSelectionStrategy dataSelectionStrategy, SortOrder order, DataObjectValueSelector valueSelector)
    {
        this.dataSelectionStrategy = dataSelectionStrategy;
        this.order = order;
        this.valueSelector = valueSelector;
        this.mode = SortMode.Auto;
    }
    public static ProductDataObjectSorting create(DataSelectionStrategy dataSelectionStrategy, SortOrder order, DataObjectValueSelector valueSelector, SortMode mode)
    {
        return new ProductDataObjectSorting(dataSelectionStrategy, order, valueSelector, mode);
    }
    public ProductDataObjectSorting(DataSelectionStrategy dataSelectionStrategy, SortOrder order, DataObjectValueSelector valueSelector, SortMode mode)
    {
        this.dataSelectionStrategy = dataSelectionStrategy;
        this.order = order;
        this.valueSelector = valueSelector;
        this.mode = mode;
    }
    public ProductDataObjectSorting()
    {
        this.mode = SortMode.Auto;
    }
    public DataSelectionStrategy getDataSelectionStrategy()
    {
        return this.dataSelectionStrategy;
    }
    public SortMode getMode()
    {
        return this.mode;
    }
    public DataObjectValueSelector getValueSelector()
    {
        return this.valueSelector;
    }
    public ProductDataObjectSorting setDataSelectionStrategy(DataSelectionStrategy dataSelectionStrategy)
    {
        this.dataSelectionStrategy = dataSelectionStrategy;
        return this;
    }
    public ProductDataObjectSorting setMode(SortMode mode)
    {
        this.mode = mode;
        return this;
    }
    public ProductDataObjectSorting setValueSelector(DataObjectValueSelector valueSelector)
    {
        this.valueSelector = valueSelector;
        return this;
    }
    @Override
    public ProductDataObjectSorting setOrder(SortOrder order)
    {
        this.order = order;
        return this;
    }
    @Override
    public ProductDataObjectSorting setThenBy(ProductSorting thenBy)
    {
        this.thenBy = thenBy;
        return this;
    }
}

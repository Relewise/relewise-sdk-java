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
    defaultImpl = ProductAttributeSorting.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductAttributeSorting extends ProductSorting
{
    public String $type = "Relewise.Client.DataTypes.Search.Sorting.Product.ProductAttributeSorting, Relewise.Client";
    public ProductAttributeSortingSortableAttribute attribute;
    public SortMode mode;
    public static ProductAttributeSorting create(ProductAttributeSortingSortableAttribute attribute, SortOrder order)
    {
        return new ProductAttributeSorting(attribute, order);
    }
    public ProductAttributeSorting(ProductAttributeSortingSortableAttribute attribute, SortOrder order)
    {
        this.attribute = attribute;
        this.order = order;
        this.mode = SortMode.Auto;
    }
    public static ProductAttributeSorting create(ProductAttributeSortingSortableAttribute attribute, SortOrder order, SortMode mode)
    {
        return new ProductAttributeSorting(attribute, order, mode);
    }
    public ProductAttributeSorting(ProductAttributeSortingSortableAttribute attribute, SortOrder order, SortMode mode)
    {
        this.attribute = attribute;
        this.order = order;
        this.mode = mode;
    }
    public ProductAttributeSorting()
    {
        this.mode = SortMode.Auto;
    }
    public ProductAttributeSortingSortableAttribute getAttribute()
    {
        return this.attribute;
    }
    public SortMode getMode()
    {
        return this.mode;
    }
    public ProductAttributeSorting setAttribute(ProductAttributeSortingSortableAttribute attribute)
    {
        this.attribute = attribute;
        return this;
    }
    public ProductAttributeSorting setMode(SortMode mode)
    {
        this.mode = mode;
        return this;
    }
    @Override
    public ProductAttributeSorting setOrder(SortOrder order)
    {
        this.order = order;
        return this;
    }
    @Override
    public ProductAttributeSorting setThenBy(ProductSorting thenBy)
    {
        this.thenBy = thenBy;
        return this;
    }
}

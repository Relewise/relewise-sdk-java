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
    defaultImpl = ProductCategoryAttributeSorting.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductCategoryAttributeSorting extends ProductCategorySorting
{
    public String $type = "Relewise.Client.DataTypes.Search.Sorting.ProductCategory.ProductCategoryAttributeSorting, Relewise.Client";
    public ProductCategoryAttributeSortingSortableAttribute attribute;
    public SortMode mode;
    public static ProductCategoryAttributeSorting create(ProductCategoryAttributeSortingSortableAttribute attribute, SortOrder order)
    {
        return new ProductCategoryAttributeSorting(attribute, order);
    }
    public ProductCategoryAttributeSorting(ProductCategoryAttributeSortingSortableAttribute attribute, SortOrder order)
    {
        this.attribute = attribute;
        this.order = order;
        this.mode = SortMode.Auto;
    }
    public static ProductCategoryAttributeSorting create(ProductCategoryAttributeSortingSortableAttribute attribute, SortOrder order, SortMode mode)
    {
        return new ProductCategoryAttributeSorting(attribute, order, mode);
    }
    public ProductCategoryAttributeSorting(ProductCategoryAttributeSortingSortableAttribute attribute, SortOrder order, SortMode mode)
    {
        this.attribute = attribute;
        this.order = order;
        this.mode = mode;
    }
    public ProductCategoryAttributeSorting()
    {
        this.mode = SortMode.Auto;
    }
    public ProductCategoryAttributeSortingSortableAttribute getAttribute()
    {
        return this.attribute;
    }
    public SortMode getMode()
    {
        return this.mode;
    }
    public ProductCategoryAttributeSorting setAttribute(ProductCategoryAttributeSortingSortableAttribute attribute)
    {
        this.attribute = attribute;;
        return this;
    }
    public ProductCategoryAttributeSorting setMode(SortMode mode)
    {
        this.mode = mode;;
        return this;
    }
    @Override
    public ProductCategoryAttributeSorting setOrder(SortOrder order)
    {
        this.order = order;;
        return this;
    }
    @Override
    public ProductCategoryAttributeSorting setThenBy(ProductCategorySorting thenBy)
    {
        this.thenBy = thenBy;;
        return this;
    }
}

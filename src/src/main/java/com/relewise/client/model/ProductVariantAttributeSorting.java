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
    defaultImpl = ProductVariantAttributeSorting.class)
public class ProductVariantAttributeSorting extends ProductSorting
{
    public String $type = "Relewise.Client.DataTypes.Search.Sorting.Product.ProductVariantAttributeSorting, Relewise.Client";
    public ProductVariantAttributeSortingSortableAttribute attribute;
    public SortMode mode;
    public static ProductVariantAttributeSorting create(ProductVariantAttributeSortingSortableAttribute attribute, SortOrder order)
    {
        return new ProductVariantAttributeSorting(attribute, order);
    }
    public ProductVariantAttributeSorting(ProductVariantAttributeSortingSortableAttribute attribute, SortOrder order)
    {
        this.attribute = attribute;
        this.order = order;
        this.mode = SortMode.Auto;
    }
    public static ProductVariantAttributeSorting create(ProductVariantAttributeSortingSortableAttribute attribute, SortOrder order, SortMode mode)
    {
        return new ProductVariantAttributeSorting(attribute, order, mode);
    }
    public ProductVariantAttributeSorting(ProductVariantAttributeSortingSortableAttribute attribute, SortOrder order, SortMode mode)
    {
        this.attribute = attribute;
        this.order = order;
        this.mode = mode;
    }
    public ProductVariantAttributeSorting()
    {
        this.mode = SortMode.Auto;
    }
    public ProductVariantAttributeSortingSortableAttribute getAttribute()
    {
        return this.attribute;
    }
    public SortMode getMode()
    {
        return this.mode;
    }
    public ProductVariantAttributeSorting setAttribute(ProductVariantAttributeSortingSortableAttribute attribute)
    {
        this.attribute = attribute;;
        return this;
    }
    public ProductVariantAttributeSorting setMode(SortMode mode)
    {
        this.mode = mode;;
        return this;
    }
    @Override
    public ProductVariantAttributeSorting setOrder(SortOrder order)
    {
        this.order = order;;
        return this;
    }
    @Override
    public ProductVariantAttributeSorting setThenBy(ProductSorting thenBy)
    {
        this.thenBy = thenBy;;
        return this;
    }
}

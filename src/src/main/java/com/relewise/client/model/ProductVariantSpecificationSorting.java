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
    defaultImpl = ProductVariantSpecificationSorting.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductVariantSpecificationSorting extends ProductSorting
{
    public String $type = "Relewise.Client.DataTypes.Search.Sorting.Product.ProductVariantSpecificationSorting, Relewise.Client";
    public String key;
    public SortMode mode;
    public static ProductVariantSpecificationSorting create(String key, SortOrder order)
    {
        return new ProductVariantSpecificationSorting(key, order);
    }
    public ProductVariantSpecificationSorting(String key, SortOrder order)
    {
        this.key = key;
        this.order = order;
        this.mode = SortMode.Auto;
    }
    public static ProductVariantSpecificationSorting create(String key, SortOrder order, SortMode mode)
    {
        return new ProductVariantSpecificationSorting(key, order, mode);
    }
    public ProductVariantSpecificationSorting(String key, SortOrder order, SortMode mode)
    {
        this.key = key;
        this.order = order;
        this.mode = mode;
    }
    public ProductVariantSpecificationSorting()
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
    public ProductVariantSpecificationSorting setKey(String key)
    {
        this.key = key;
        return this;
    }
    public ProductVariantSpecificationSorting setMode(SortMode mode)
    {
        this.mode = mode;
        return this;
    }
    @Override
    public ProductVariantSpecificationSorting setOrder(SortOrder order)
    {
        this.order = order;
        return this;
    }
    @Override
    public ProductVariantSpecificationSorting setThenBy(ProductSorting thenBy)
    {
        this.thenBy = thenBy;
        return this;
    }
}

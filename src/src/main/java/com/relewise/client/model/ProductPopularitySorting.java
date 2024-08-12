package com.relewise.client.model;

import com.fasterxml.jackson.annotation.*;
import javax.annotation.Nullable;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.LocalDateTime;
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
    defaultImpl = ProductPopularitySorting.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductPopularitySorting extends ProductSorting
{
    public String $type = "Relewise.Client.DataTypes.Search.Sorting.Product.ProductPopularitySorting, Relewise.Client";
    public static ProductPopularitySorting create()
    {
        return new ProductPopularitySorting();
    }
    public ProductPopularitySorting()
    {
        this.order = SortOrder.Descending;
    }
    public static ProductPopularitySorting create(SortOrder order)
    {
        return new ProductPopularitySorting(order);
    }
    public ProductPopularitySorting(SortOrder order)
    {
        this.order = order;
    }
    @Override
    public ProductPopularitySorting setOrder(SortOrder order)
    {
        this.order = order;
        return this;
    }
    @Override
    public ProductPopularitySorting setThenBy(ProductSorting thenBy)
    {
        this.thenBy = thenBy;
        return this;
    }
}

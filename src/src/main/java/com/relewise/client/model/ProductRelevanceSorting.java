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
import java.util.Set;
import java.util.HashSet;
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = ProductRelevanceSorting.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductRelevanceSorting extends ProductSorting
{
    public String $type = "Relewise.Client.DataTypes.Search.Sorting.Product.ProductRelevanceSorting, Relewise.Client";
    public static ProductRelevanceSorting create()
    {
        return new ProductRelevanceSorting();
    }
    public ProductRelevanceSorting()
    {
        this.order = SortOrder.Descending;
    }
    public static ProductRelevanceSorting create(SortOrder order)
    {
        return new ProductRelevanceSorting(order);
    }
    public ProductRelevanceSorting(SortOrder order)
    {
        this.order = order;
    }
    @Override
    public ProductRelevanceSorting setOrder(SortOrder order)
    {
        this.order = order;
        return this;
    }
    @Override
    public ProductRelevanceSorting setThenBy(ProductSorting thenBy)
    {
        this.thenBy = thenBy;
        return this;
    }
}

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
    defaultImpl = ProductCategoryRelevanceSorting.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductCategoryRelevanceSorting extends ProductCategorySorting
{
    public String $type = "Relewise.Client.DataTypes.Search.Sorting.ProductCategory.ProductCategoryRelevanceSorting, Relewise.Client";
    public static ProductCategoryRelevanceSorting create()
    {
        return new ProductCategoryRelevanceSorting();
    }
    public ProductCategoryRelevanceSorting()
    {
        this.order = SortOrder.Descending;
    }
    public static ProductCategoryRelevanceSorting create(SortOrder order)
    {
        return new ProductCategoryRelevanceSorting(order);
    }
    public ProductCategoryRelevanceSorting(SortOrder order)
    {
        this.order = order;
    }
    @Override
    public ProductCategoryRelevanceSorting setOrder(SortOrder order)
    {
        this.order = order;
        return this;
    }
    @Override
    public ProductCategoryRelevanceSorting setThenBy(ProductCategorySorting thenBy)
    {
        this.thenBy = thenBy;
        return this;
    }
}

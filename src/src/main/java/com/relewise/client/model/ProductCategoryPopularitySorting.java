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
    defaultImpl = ProductCategoryPopularitySorting.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductCategoryPopularitySorting extends ProductCategorySorting
{
    public String $type = "Relewise.Client.DataTypes.Search.Sorting.ProductCategory.ProductCategoryPopularitySorting, Relewise.Client";
    public static ProductCategoryPopularitySorting create()
    {
        return new ProductCategoryPopularitySorting();
    }
    public ProductCategoryPopularitySorting()
    {
        this.order = SortOrder.Descending;
    }
    public static ProductCategoryPopularitySorting create(SortOrder order)
    {
        return new ProductCategoryPopularitySorting(order);
    }
    public ProductCategoryPopularitySorting(SortOrder order)
    {
        this.order = order;
    }
    @Override
    public ProductCategoryPopularitySorting setOrder(SortOrder order)
    {
        this.order = order;
        return this;
    }
    @Override
    public ProductCategoryPopularitySorting setThenBy(ProductCategorySorting thenBy)
    {
        this.thenBy = thenBy;
        return this;
    }
}

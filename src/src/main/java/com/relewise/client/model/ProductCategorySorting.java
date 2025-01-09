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
    property = "$type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ProductCategoryAttributeSorting.class, name = "Relewise.Client.DataTypes.Search.Sorting.ProductCategory.ProductCategoryAttributeSorting, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductCategoryDataSorting.class, name = "Relewise.Client.DataTypes.Search.Sorting.ProductCategory.ProductCategoryDataSorting, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductCategoryPopularitySorting.class, name = "Relewise.Client.DataTypes.Search.Sorting.ProductCategory.ProductCategoryPopularitySorting, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductCategoryRelevanceSorting.class, name = "Relewise.Client.DataTypes.Search.Sorting.ProductCategory.ProductCategoryRelevanceSorting, Relewise.Client"),
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class ProductCategorySorting extends ProductCategorySortingSorting
{
    public String $type = "";
    @Override
    public ProductCategorySorting setOrder(SortOrder order)
    {
        this.order = order;
        return this;
    }
    @Override
    public ProductCategorySorting setThenBy(ProductCategorySorting thenBy)
    {
        this.thenBy = thenBy;
        return this;
    }
}

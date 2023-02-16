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
    property = "$type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ProductAttributeSorting.class, name = "Relewise.Client.DataTypes.Search.Sorting.Product.ProductAttributeSorting, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductDataSorting.class, name = "Relewise.Client.DataTypes.Search.Sorting.Product.ProductDataSorting, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductPopularitySorting.class, name = "Relewise.Client.DataTypes.Search.Sorting.Product.ProductPopularitySorting, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductRelevanceSorting.class, name = "Relewise.Client.DataTypes.Search.Sorting.Product.ProductRelevanceSorting, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductVariantSpecificationSorting.class, name = "Relewise.Client.DataTypes.Search.Sorting.Product.ProductVariantSpecificationSorting, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductVariantAttributeSorting.class, name = "Relewise.Client.DataTypes.Search.Sorting.Product.ProductVariantAttributeSorting, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductDataObjectSorting.class, name = "Relewise.Client.DataTypes.Search.Sorting.Product.ProductDataObjectSorting, Relewise.Client"),
})
public abstract class ProductSorting extends ProductSortingSorting
{
    public String $type = "Relewise.Client.DataTypes.Search.Sorting.Product.ProductSorting, Relewise.Client";
    @Override
    public ProductSorting setOrder(SortOrder order)
    {
        this.order = order;;
        return this;
    }
    @Override
    public ProductSorting setThenBy(ProductSorting thenBy)
    {
        this.thenBy = thenBy;;
        return this;
    }
}

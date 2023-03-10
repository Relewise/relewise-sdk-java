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
    defaultImpl = ProductSortBySpecification.class)
public class ProductSortBySpecification
{
    public String $type = "Relewise.Client.DataTypes.Search.Sorting.Product.ProductSortBySpecification, Relewise.Client";
    public ProductSorting value;
    public static ProductSortBySpecification create()
    {
        return new ProductSortBySpecification();
    }
    public ProductSortBySpecification()
    {
    }
    public ProductSorting getValue()
    {
        return this.value;
    }
    public ProductSortBySpecification setValue(ProductSorting value)
    {
        this.value = value;;
        return this;
    }
}

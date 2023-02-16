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
    defaultImpl = ProductCategorySortBySpecification.class)
public class ProductCategorySortBySpecification
{
    public String $type = "Relewise.Client.DataTypes.Search.Sorting.ProductCategory.ProductCategorySortBySpecification, Relewise.Client";
    public ProductCategorySorting value;
    public static ProductCategorySortBySpecification create()
    {
        return new ProductCategorySortBySpecification();
    }
    public ProductCategorySortBySpecification()
    {
    }
    public ProductCategorySorting getValue()
    {
        return this.value;
    }
    public ProductCategorySortBySpecification setValue(ProductCategorySorting value)
    {
        this.value = value;;
        return this;
    }
}

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
    defaultImpl = ProductCategoryUpdate.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductCategoryUpdate extends CategoryUpdate
{
    public String $type = "Relewise.Client.DataTypes.ProductCategoryUpdate, Relewise.Client";
    public ProductCategory category;
    public static ProductCategoryUpdate create(ProductCategory category)
    {
        return new ProductCategoryUpdate(category);
    }
    public ProductCategoryUpdate(ProductCategory category)
    {
        this.category = category;
        this.kind = CategoryUpdateUpdateKind.UpdateAndAppend;
    }
    public static ProductCategoryUpdate create(ProductCategory category, CategoryUpdateUpdateKind kind)
    {
        return new ProductCategoryUpdate(category, kind);
    }
    public ProductCategoryUpdate(ProductCategory category, CategoryUpdateUpdateKind kind)
    {
        this.category = category;
        this.kind = kind;
    }
    public ProductCategoryUpdate()
    {
        this.kind = CategoryUpdateUpdateKind.UpdateAndAppend;
    }
    public ProductCategory getCategory()
    {
        return this.category;
    }
    public ProductCategoryUpdate setCategory(ProductCategory category)
    {
        this.category = category;
        return this;
    }
    @Override
    public ProductCategoryUpdate setKind(CategoryUpdateUpdateKind kind)
    {
        this.kind = kind;
        return this;
    }
}

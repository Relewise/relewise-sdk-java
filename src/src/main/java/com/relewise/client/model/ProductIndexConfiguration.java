package com.relewise.client.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductIndexConfiguration
{
    public FieldIndexConfiguration id;
    public FieldIndexConfiguration displayName;
    public CategoryIndexConfiguration category;
    public BrandIndexConfiguration brand;
    public DataIndexConfiguration data;
    public VariantIndexConfiguration variants;
    public static ProductIndexConfiguration create()
    {
        return new ProductIndexConfiguration();
    }
    public ProductIndexConfiguration()
    {
    }
    public FieldIndexConfiguration getId()
    {
        return this.id;
    }
    public FieldIndexConfiguration getDisplayName()
    {
        return this.displayName;
    }
    public CategoryIndexConfiguration getCategory()
    {
        return this.category;
    }
    public BrandIndexConfiguration getBrand()
    {
        return this.brand;
    }
    public DataIndexConfiguration getData()
    {
        return this.data;
    }
    public VariantIndexConfiguration getVariants()
    {
        return this.variants;
    }
    public ProductIndexConfiguration setId(FieldIndexConfiguration id)
    {
        this.id = id;
        return this;
    }
    public ProductIndexConfiguration setDisplayName(FieldIndexConfiguration displayName)
    {
        this.displayName = displayName;
        return this;
    }
    public ProductIndexConfiguration setCategory(CategoryIndexConfiguration category)
    {
        this.category = category;
        return this;
    }
    public ProductIndexConfiguration setBrand(BrandIndexConfiguration brand)
    {
        this.brand = brand;
        return this;
    }
    public ProductIndexConfiguration setData(DataIndexConfiguration data)
    {
        this.data = data;
        return this;
    }
    public ProductIndexConfiguration setVariants(VariantIndexConfiguration variants)
    {
        this.variants = variants;
        return this;
    }
}

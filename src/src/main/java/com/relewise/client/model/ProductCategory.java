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
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = ProductCategory.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductCategory extends Category
{
    public String $type = "Relewise.Client.DataTypes.ProductCategory, Relewise.Client";
    public static ProductCategory create(String id)
    {
        return new ProductCategory(id);
    }
    public ProductCategory(String id)
    {
        this.id = id;
    }
    public ProductCategory()
    {
    }
    @Override
    public ProductCategory setId(String id)
    {
        this.id = id;
        return this;
    }
    @Override
    public ProductCategory setDisplayName(Multilingual displayName)
    {
        this.displayName = displayName;
        return this;
    }
    @Override
    public ProductCategory setCategoryPaths(CategoryPath... categoryPaths)
    {
        this.categoryPaths = new ArrayList<>(Arrays.asList(categoryPaths));;
        return this;
    }
    public ProductCategory addToCategoryPaths(CategoryPath categoryPaths)
    {
        if (this.categoryPaths == null)
        {
            this.categoryPaths = new ArrayList<>();
        }
        this.categoryPaths.add(categoryPaths);
        return this;
    }
    @Override
    public ProductCategory setAssortments(Integer... assortments)
    {
        this.assortments = new ArrayList<>(Arrays.asList(assortments));;
        return this;
    }
    public ProductCategory addToAssortments(Integer assortments)
    {
        if (this.assortments == null)
        {
            this.assortments = new ArrayList<>();
        }
        this.assortments.add(assortments);
        return this;
    }
    public ProductCategory addToData(String key, DataValue value)
    {
        if (this.data == null)
        {
            this.data = new HashMap<>();
        }
        this.data.put(key, value);
        return this;
    }
    @Override
    public ProductCategory setData(HashMap<String, DataValue> data)
    {
        this.data = data;
        return this;
    }
}

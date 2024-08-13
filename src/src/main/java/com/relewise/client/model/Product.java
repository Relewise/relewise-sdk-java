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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class Product
{
    public String id;
    public @Nullable Multilingual displayName;
    public @Nullable ArrayList<CategoryPath> categoryPaths;
    public @Nullable ArrayList<Integer> assortments;
    public @Nullable HashMap<String, DataValue> data;
    public @Nullable MultiCurrency listPrice;
    public @Nullable MultiCurrency salesPrice;
    public @Nullable Brand brand;
    public static Product create(String id)
    {
        return new Product(id);
    }
    public Product(String id)
    {
        this.id = id;
    }
    public Product()
    {
    }
    public String getId()
    {
        return this.id;
    }
    public @Nullable Multilingual getDisplayName()
    {
        return this.displayName;
    }
    public @Nullable ArrayList<CategoryPath> getCategoryPaths()
    {
        return this.categoryPaths;
    }
    public @Nullable ArrayList<Integer> getAssortments()
    {
        return this.assortments;
    }
    public @Nullable HashMap<String, DataValue> getData()
    {
        return this.data;
    }
    public @Nullable MultiCurrency getListPrice()
    {
        return this.listPrice;
    }
    public @Nullable MultiCurrency getSalesPrice()
    {
        return this.salesPrice;
    }
    public @Nullable Brand getBrand()
    {
        return this.brand;
    }
    public Product setId(String id)
    {
        this.id = id;
        return this;
    }
    public Product setDisplayName(@Nullable Multilingual displayName)
    {
        this.displayName = displayName;
        return this;
    }
    public Product setCategoryPaths(CategoryPath... categoryPaths)
    {
        this.categoryPaths = new ArrayList<>(Arrays.asList(categoryPaths));;
        return this;
    }
    public Product addToCategoryPaths(CategoryPath categoryPaths)
    {
        if (this.categoryPaths == null)
        {
            this.categoryPaths = new ArrayList<>();
        }
        this.categoryPaths.add(categoryPaths);
        return this;
    }
    public Product setAssortments(Integer... assortments)
    {
        this.assortments = new ArrayList<>(Arrays.asList(assortments));;
        return this;
    }
    public Product addToAssortments(Integer assortments)
    {
        if (this.assortments == null)
        {
            this.assortments = new ArrayList<>();
        }
        this.assortments.add(assortments);
        return this;
    }
    public Product addToData(String key, DataValue value)
    {
        if (this.data == null)
        {
            this.data = new HashMap<>();
        }
        this.data.put(key, value);
        return this;
    }
    public Product setData(@Nullable HashMap<String, DataValue> data)
    {
        this.data = data;
        return this;
    }
    public Product setListPrice(@Nullable MultiCurrency listPrice)
    {
        this.listPrice = listPrice;
        return this;
    }
    public Product setSalesPrice(@Nullable MultiCurrency salesPrice)
    {
        this.salesPrice = salesPrice;
        return this;
    }
    public Product setBrand(@Nullable Brand brand)
    {
        this.brand = brand;
        return this;
    }
}

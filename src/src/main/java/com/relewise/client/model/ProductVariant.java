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
public class ProductVariant
{
    public String id;
    public @Nullable Multilingual displayName;
    public @Nullable ArrayList<Integer> assortments;
    public @Nullable HashMap<String, String> specification;
    public @Nullable HashMap<String, DataValue> data;
    public @Nullable MultiCurrency listPrice;
    public @Nullable MultiCurrency salesPrice;
    public static ProductVariant create(String variantId)
    {
        return new ProductVariant(variantId);
    }
    public ProductVariant(String variantId)
    {
        this.id = variantId;
    }
    public ProductVariant()
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
    public @Nullable ArrayList<Integer> getAssortments()
    {
        return this.assortments;
    }
    public @Nullable HashMap<String, String> getSpecification()
    {
        return this.specification;
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
    public ProductVariant setId(String id)
    {
        this.id = id;
        return this;
    }
    public ProductVariant setDisplayName(Multilingual displayName)
    {
        this.displayName = displayName;
        return this;
    }
    public ProductVariant setAssortments(Integer... assortments)
    {
        this.assortments = new ArrayList<>(Arrays.asList(assortments));;
        return this;
    }
    public ProductVariant addToAssortments(Integer assortments)
    {
        if (this.assortments == null)
        {
            this.assortments = new ArrayList<>();
        }
        this.assortments.add(assortments);
        return this;
    }
    public ProductVariant addToSpecification(String key, String value)
    {
        if (this.specification == null)
        {
            this.specification = new HashMap<>();
        }
        this.specification.put(key, value);
        return this;
    }
    public ProductVariant setSpecification(HashMap<String, String> specification)
    {
        this.specification = specification;
        return this;
    }
    public ProductVariant addToData(String key, DataValue value)
    {
        if (this.data == null)
        {
            this.data = new HashMap<>();
        }
        this.data.put(key, value);
        return this;
    }
    public ProductVariant setData(HashMap<String, DataValue> data)
    {
        this.data = data;
        return this;
    }
    public ProductVariant setListPrice(MultiCurrency listPrice)
    {
        this.listPrice = listPrice;
        return this;
    }
    public ProductVariant setSalesPrice(MultiCurrency salesPrice)
    {
        this.salesPrice = salesPrice;
        return this;
    }
}

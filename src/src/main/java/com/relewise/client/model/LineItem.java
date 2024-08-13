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
public class LineItem
{
    public Product product;
    public @Nullable ProductVariant variant;
    public Float quantity;
    public Double lineTotal;
    public @Nullable HashMap<String, DataValue> data;
    public static LineItem create(Product product, @Nullable ProductVariant variant, Float quantity, Double lineTotal)
    {
        return new LineItem(product, variant, quantity, lineTotal);
    }
    public LineItem(Product product, @Nullable ProductVariant variant, Float quantity, Double lineTotal)
    {
        this.product = product;
        this.variant = variant;
        this.quantity = quantity;
        this.lineTotal = lineTotal;
    }
    public static LineItem create(Product product, Float quantity)
    {
        return new LineItem(product, quantity);
    }
    public LineItem(Product product, Float quantity)
    {
        this.product = product;
        this.quantity = quantity;
    }
    public LineItem()
    {
    }
    public Product getProduct()
    {
        return this.product;
    }
    public @Nullable ProductVariant getVariant()
    {
        return this.variant;
    }
    public Float getQuantity()
    {
        return this.quantity;
    }
    public Double getLineTotal()
    {
        return this.lineTotal;
    }
    public @Nullable HashMap<String, DataValue> getData()
    {
        return this.data;
    }
    public LineItem setProduct(Product product)
    {
        this.product = product;
        return this;
    }
    public LineItem setVariant(ProductVariant variant)
    {
        this.variant = variant;
        return this;
    }
    public LineItem setQuantity(Float quantity)
    {
        this.quantity = quantity;
        return this;
    }
    public LineItem setLineTotal(Double lineTotal)
    {
        this.lineTotal = lineTotal;
        return this;
    }
    public LineItem addToData(String key, DataValue value)
    {
        if (this.data == null)
        {
            this.data = new HashMap<>();
        }
        this.data.put(key, value);
        return this;
    }
    public LineItem setData(HashMap<String, DataValue> data)
    {
        this.data = data;
        return this;
    }
}

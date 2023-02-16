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
    defaultImpl = LineItem.class)
public class LineItem
{
    public String $type = "Relewise.Client.DataTypes.LineItem, Relewise.Client";
    public Product product;
    public @Nullable ProductVariant variant;
    public Float quantity;
    public Double lineTotal;
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
    public LineItem setProduct(Product product)
    {
        this.product = product;;
        return this;
    }
    public LineItem setVariant(ProductVariant variant)
    {
        this.variant = variant;;
        return this;
    }
    public LineItem setQuantity(Float quantity)
    {
        this.quantity = quantity;;
        return this;
    }
    public LineItem setLineTotal(Double lineTotal)
    {
        this.lineTotal = lineTotal;;
        return this;
    }
}

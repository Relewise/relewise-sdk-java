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
    defaultImpl = ProductView.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductView extends Trackable implements IUserIdentifier
{
    public String $type = "Relewise.Client.DataTypes.ProductView, Relewise.Client";
    public @Nullable User user;
    public Product product;
    public @Nullable ProductVariant variant;
    public static ProductView create(@Nullable User user, Product product)
    {
        return new ProductView(user, product);
    }
    public ProductView(@Nullable User user, Product product)
    {
        this.user = user;
        this.product = product;
        this.variant = null;
    }
    public static ProductView create(@Nullable User user, Product product, ProductVariant variant)
    {
        return new ProductView(user, product, variant);
    }
    public ProductView(@Nullable User user, Product product, ProductVariant variant)
    {
        this.user = user;
        this.product = product;
        this.variant = variant;
    }
    public ProductView()
    {
        this.variant = null;
    }
    public @Nullable User getUser()
    {
        return this.user;
    }
    public Product getProduct()
    {
        return this.product;
    }
    public @Nullable ProductVariant getVariant()
    {
        return this.variant;
    }
    public ProductView setUser(User user)
    {
        this.user = user;
        return this;
    }
    public ProductView setProduct(Product product)
    {
        this.product = product;
        return this;
    }
    public ProductView setVariant(ProductVariant variant)
    {
        this.variant = variant;
        return this;
    }
}

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
    defaultImpl = ProductAndVariantId.class)
public class ProductAndVariantId
{
    public String $type = "Relewise.Client.DataTypes.ProductAndVariantId, Relewise.Client";
    public String productId;
    public @Nullable String variantId;
    public static ProductAndVariantId create(String productId)
    {
        return new ProductAndVariantId(productId);
    }
    public ProductAndVariantId(String productId)
    {
        this.productId = productId;
        this.variantId = null;
    }
    public static ProductAndVariantId create(String productId, String variantId)
    {
        return new ProductAndVariantId(productId, variantId);
    }
    public ProductAndVariantId(String productId, String variantId)
    {
        this.productId = productId;
        this.variantId = variantId;
    }
    public ProductAndVariantId()
    {
        this.variantId = null;
    }
    public String getProductId()
    {
        return this.productId;
    }
    public @Nullable String getVariantId()
    {
        return this.variantId;
    }
    public ProductAndVariantId setProductId(String productId)
    {
        this.productId = productId;;
        return this;
    }
    public ProductAndVariantId setVariantId(String variantId)
    {
        this.variantId = variantId;;
        return this;
    }
}

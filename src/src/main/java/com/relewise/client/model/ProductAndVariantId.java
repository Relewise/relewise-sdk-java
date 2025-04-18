package com.relewise.client.model;

import com.fasterxml.jackson.annotation.*;
import javax.annotation.Nullable;
import java.io.IOException;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Arrays;
import java.util.UUID;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductAndVariantId
{
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
    public static ProductAndVariantId create(String productId, @Nullable String variantId)
    {
        return new ProductAndVariantId(productId, variantId);
    }
    public ProductAndVariantId(String productId, @Nullable String variantId)
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
        this.productId = productId;
        return this;
    }
    public ProductAndVariantId setVariantId(@Nullable String variantId)
    {
        this.variantId = variantId;
        return this;
    }
}

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
    defaultImpl = ProductUpdate.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductUpdate extends Trackable
{
    public String $type = "Relewise.Client.DataTypes.ProductUpdate, Relewise.Client";
    public Product product;
    public ArrayList<ProductVariant> variants;
    public ProductUpdateUpdateKind productUpdateKind;
    public ProductUpdateUpdateKind variantUpdateKind;
    public Boolean replaceExistingVariants;
    public @Nullable BrandUpdateUpdateKind brandUpdateKind;
    public static ProductUpdate create(Product product)
    {
        return new ProductUpdate(product);
    }
    public ProductUpdate(Product product)
    {
        this.product = product;
        this.productUpdateKind = ProductUpdateUpdateKind.UpdateAndAppend;
    }
    public static ProductUpdate create(Product product, ProductUpdateUpdateKind productUpdateKind)
    {
        return new ProductUpdate(product, productUpdateKind);
    }
    public ProductUpdate(Product product, ProductUpdateUpdateKind productUpdateKind)
    {
        this.product = product;
        this.productUpdateKind = productUpdateKind;
    }
    public ProductUpdate()
    {
        this.productUpdateKind = ProductUpdateUpdateKind.UpdateAndAppend;
        this.variantUpdateKind = ProductUpdateUpdateKind.UpdateAndAppend;
        this.replaceExistingVariants = false;
    }
    public Product getProduct()
    {
        return this.product;
    }
    public ArrayList<ProductVariant> getVariants()
    {
        return this.variants;
    }
    public ProductUpdateUpdateKind getProductUpdateKind()
    {
        return this.productUpdateKind;
    }
    public ProductUpdateUpdateKind getVariantUpdateKind()
    {
        return this.variantUpdateKind;
    }
    public Boolean getReplaceExistingVariants()
    {
        return this.replaceExistingVariants;
    }
    public @Nullable BrandUpdateUpdateKind getBrandUpdateKind()
    {
        return this.brandUpdateKind;
    }
    public ProductUpdate setProduct(Product product)
    {
        this.product = product;
        return this;
    }
    public ProductUpdate setVariants(ProductVariant... variants)
    {
        this.variants = new ArrayList<>(Arrays.asList(variants));;
        return this;
    }
    public ProductUpdate addToVariants(ProductVariant variants)
    {
        if (this.variants == null)
        {
            this.variants = new ArrayList<>();
        }
        this.variants.add(variants);
        return this;
    }
    public ProductUpdate setProductUpdateKind(ProductUpdateUpdateKind productUpdateKind)
    {
        this.productUpdateKind = productUpdateKind;
        return this;
    }
    public ProductUpdate setVariantUpdateKind(ProductUpdateUpdateKind variantUpdateKind)
    {
        this.variantUpdateKind = variantUpdateKind;
        return this;
    }
    public ProductUpdate setReplaceExistingVariants(Boolean replaceExistingVariants)
    {
        this.replaceExistingVariants = replaceExistingVariants;
        return this;
    }
    public ProductUpdate setBrandUpdateKind(@Nullable BrandUpdateUpdateKind brandUpdateKind)
    {
        this.brandUpdateKind = brandUpdateKind;
        return this;
    }
}

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
import java.util.Set;
import java.util.HashSet;
    
/** Used for specifying that this kind of promotion is allowed at a specific Location as well as for specific advertisers */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = ProductPromotionSpecification.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductPromotionSpecification extends PromotionSpecification
{
    public String $type = "Relewise.Client.DataTypes.RetailMedia.ProductPromotion+Specification, Relewise.Client";
    /** Filters matching the products which may be promoted */
    public @Nullable FilterCollection promotableProducts;
    public static ProductPromotionSpecification create(@Nullable FilterCollection promotableProducts)
    {
        return new ProductPromotionSpecification(promotableProducts);
    }
    public ProductPromotionSpecification(@Nullable FilterCollection promotableProducts)
    {
        this.promotableProducts = promotableProducts;
    }
    public ProductPromotionSpecification()
    {
    }
    /** Filters matching the products which may be promoted */
    public @Nullable FilterCollection getPromotableProducts()
    {
        return this.promotableProducts;
    }
    /** Filters matching the products which may be promoted */
    public ProductPromotionSpecification setPromotableProducts(@Nullable FilterCollection promotableProducts)
    {
        this.promotableProducts = promotableProducts;
        return this;
    }
}

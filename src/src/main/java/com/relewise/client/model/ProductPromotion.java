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
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = ProductPromotion.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductPromotion extends Promotion
{
    public String $type = "Relewise.Client.DataTypes.RetailMedia.ProductPromotion, Relewise.Client";
    /** Filters matching the products to be promoted */
    public @Nullable FilterCollection filters;
    /** The condition search must match to have <code>ProductPromotion</code> activated. */
    public @Nullable RetailMediaConditions conditions;
    public static ProductPromotion create(String name, @Nullable FilterCollection filters, @Nullable PromotionLocationCollection locations)
    {
        return new ProductPromotion(name, filters, locations);
    }
    public ProductPromotion(String name, @Nullable FilterCollection filters, @Nullable PromotionLocationCollection locations)
    {
        this.name = name;
        this.filters = filters;
        this.locations = locations;
    }
    public ProductPromotion()
    {
    }
    /** Filters matching the products to be promoted */
    public @Nullable FilterCollection getFilters()
    {
        return this.filters;
    }
    /** The condition search must match to have <code>ProductPromotion</code> activated. */
    public @Nullable RetailMediaConditions getConditions()
    {
        return this.conditions;
    }
    /** Filters matching the products to be promoted */
    public ProductPromotion setFilters(@Nullable FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
    /** The condition search must match to have <code>ProductPromotion</code> activated. */
    public ProductPromotion setConditions(@Nullable RetailMediaConditions conditions)
    {
        this.conditions = conditions;
        return this;
    }
    @Override
    public ProductPromotion setName(String name)
    {
        this.name = name;
        return this;
    }
    @Override
    public ProductPromotion setLocations(@Nullable PromotionLocationCollection locations)
    {
        this.locations = locations;
        return this;
    }
}

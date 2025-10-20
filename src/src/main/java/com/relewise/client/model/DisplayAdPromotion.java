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
    defaultImpl = DisplayAdPromotion.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DisplayAdPromotion extends Promotion
{
    public String $type = "Relewise.Client.DataTypes.RetailMedia.DisplayAdPromotion, Relewise.Client";
    /** Filters matching the products in the search result to allow this promotion to be in play */
    public @Nullable FilterCollection productFilters;
    /** The condition search must match to have <code>DisplayAdPromotion</code> activated. */
    public @Nullable DisplayAdPromotionPromotionConditions conditions;
    /** Filters matching the display ads to be promoted */
    public @Nullable FilterCollection displayAdFilters;
    public static DisplayAdPromotion create(String name, @Nullable FilterCollection productFilters, @Nullable FilterCollection displayAdFilters, @Nullable PromotionLocationCollection locations)
    {
        return new DisplayAdPromotion(name, productFilters, displayAdFilters, locations);
    }
    public DisplayAdPromotion(String name, @Nullable FilterCollection productFilters, @Nullable FilterCollection displayAdFilters, @Nullable PromotionLocationCollection locations)
    {
        this.name = name;
        this.productFilters = productFilters;
        this.displayAdFilters = displayAdFilters;
        this.locations = locations;
    }
    public DisplayAdPromotion()
    {
    }
    /** Filters matching the products in the search result to allow this promotion to be in play */
    public @Nullable FilterCollection getProductFilters()
    {
        return this.productFilters;
    }
    /** The condition search must match to have <code>DisplayAdPromotion</code> activated. */
    public @Nullable DisplayAdPromotionPromotionConditions getConditions()
    {
        return this.conditions;
    }
    /** Filters matching the display ads to be promoted */
    public @Nullable FilterCollection getDisplayAdFilters()
    {
        return this.displayAdFilters;
    }
    /** Filters matching the products in the search result to allow this promotion to be in play */
    public DisplayAdPromotion setProductFilters(@Nullable FilterCollection productFilters)
    {
        this.productFilters = productFilters;
        return this;
    }
    /** The condition search must match to have <code>DisplayAdPromotion</code> activated. */
    public DisplayAdPromotion setConditions(@Nullable DisplayAdPromotionPromotionConditions conditions)
    {
        this.conditions = conditions;
        return this;
    }
    /** Filters matching the display ads to be promoted */
    public DisplayAdPromotion setDisplayAdFilters(@Nullable FilterCollection displayAdFilters)
    {
        this.displayAdFilters = displayAdFilters;
        return this;
    }
    @Override
    public DisplayAdPromotion setName(String name)
    {
        this.name = name;
        return this;
    }
    @Override
    public DisplayAdPromotion setLocations(@Nullable PromotionLocationCollection locations)
    {
        this.locations = locations;
        return this;
    }
}

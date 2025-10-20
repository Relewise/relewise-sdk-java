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
    
/** Used for specifying that this kind of promotion is allowed at a specific location */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = PromotionVariationPromotion.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PromotionVariationPromotion extends PromotionSpecificationVariation
{
    public String $type = "Relewise.Client.DataTypes.RetailMedia.Promotion+VariationPromotion, Relewise.Client";
    /** The maximum number of promotions (Products/DisplayAds) to promote in this variation */
    public Integer maxCount;
    /** The preferred number of products to be promoted. If 0, then no products will be returned. */
    public @Nullable Integer preferredNumberOfProducts;
    /** The preferred number of display ads to be promoted. If 0, then no display ads will be returned. */
    public @Nullable Integer preferredNumberOfDisplayAds;
    /** The promotion elements priority */
    public @Nullable PromotionVariationPromotionPriority priority;
    public static PromotionVariationPromotion create(Integer maxCount)
    {
        return new PromotionVariationPromotion(maxCount);
    }
    public PromotionVariationPromotion(Integer maxCount)
    {
        this.maxCount = maxCount;
        this.preferredNumberOfProducts = null;
        this.preferredNumberOfDisplayAds = null;
        this.priority = null;
    }
    public static PromotionVariationPromotion create(Integer maxCount, @Nullable Integer preferredNumberOfProducts, @Nullable Integer preferredNumberOfDisplayAds, @Nullable PromotionVariationPromotionPriority priority)
    {
        return new PromotionVariationPromotion(maxCount, preferredNumberOfProducts, preferredNumberOfDisplayAds, priority);
    }
    public PromotionVariationPromotion(Integer maxCount, @Nullable Integer preferredNumberOfProducts, @Nullable Integer preferredNumberOfDisplayAds, @Nullable PromotionVariationPromotionPriority priority)
    {
        this.maxCount = maxCount;
        this.preferredNumberOfProducts = preferredNumberOfProducts;
        this.preferredNumberOfDisplayAds = preferredNumberOfDisplayAds;
        this.priority = priority;
    }
    public PromotionVariationPromotion()
    {
        this.preferredNumberOfProducts = null;
        this.preferredNumberOfDisplayAds = null;
        this.priority = null;
    }
    /** The maximum number of promotions (Products/DisplayAds) to promote in this variation */
    public Integer getMaxCount()
    {
        return this.maxCount;
    }
    /** The preferred number of products to be promoted. If 0, then no products will be returned. */
    public @Nullable Integer getPreferredNumberOfProducts()
    {
        return this.preferredNumberOfProducts;
    }
    /** The preferred number of display ads to be promoted. If 0, then no display ads will be returned. */
    public @Nullable Integer getPreferredNumberOfDisplayAds()
    {
        return this.preferredNumberOfDisplayAds;
    }
    /** The promotion elements priority */
    public @Nullable PromotionVariationPromotionPriority getPriority()
    {
        return this.priority;
    }
    /** The maximum number of promotions (Products/DisplayAds) to promote in this variation */
    public PromotionVariationPromotion setMaxCount(Integer maxCount)
    {
        this.maxCount = maxCount;
        return this;
    }
    /** The preferred number of products to be promoted. If 0, then no products will be returned. */
    public PromotionVariationPromotion setPreferredNumberOfProducts(@Nullable Integer preferredNumberOfProducts)
    {
        this.preferredNumberOfProducts = preferredNumberOfProducts;
        return this;
    }
    /** The preferred number of display ads to be promoted. If 0, then no display ads will be returned. */
    public PromotionVariationPromotion setPreferredNumberOfDisplayAds(@Nullable Integer preferredNumberOfDisplayAds)
    {
        this.preferredNumberOfDisplayAds = preferredNumberOfDisplayAds;
        return this;
    }
    /** The promotion elements priority */
    public PromotionVariationPromotion setPriority(@Nullable PromotionVariationPromotionPriority priority)
    {
        this.priority = priority;
        return this;
    }
}

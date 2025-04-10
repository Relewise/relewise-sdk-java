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
    
/** a <code>RelevanceModifier</code> that can change the relevance of a Product depending on whether a product has been bought within some interval of minutes <code>SinceMinutesAgo</code>from now, which can define complex modifiers depending on the number of purchases and how long time there has passed since the last purchase. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = UserFavoriteProductRelevanceModifier.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserFavoriteProductRelevanceModifier extends RelevanceModifier implements IProductRelevanceModifier
{
    public String $type = "Relewise.Client.Requests.RelevanceModifiers.UserFavoriteProductRelevanceModifier, Relewise.Client";
    /** The timespan in minutes up till now that a product should be considered relevant if it has been bought by the user. */
    public Integer sinceMinutesAgo;
    /** The multiplier that decides how important the amount of times the product has been bought is. */
    public Double numberOfPurchasesWeight;
    /** The multiplier that decides how important the amount of times the product has been bought is. */
    public Double mostRecentPurchaseWeight;
    /** The multiplier that decides how important more recent purchases should */
    public Double ifNotPurchasedBaseWeight;
    public static UserFavoriteProductRelevanceModifier create(Integer sinceMinutesAgo)
    {
        return new UserFavoriteProductRelevanceModifier(sinceMinutesAgo);
    }
    public UserFavoriteProductRelevanceModifier(Integer sinceMinutesAgo)
    {
        this.sinceMinutesAgo = sinceMinutesAgo;
        this.numberOfPurchasesWeight = 1d;
        this.mostRecentPurchaseWeight = 1d;
        this.ifNotPurchasedBaseWeight = 1d;
    }
    /**
     * Creates a <code>RelevanceModifier</code> that can change the relevance of a Product depending on whether a product has been bought within some interval of minutes <code>SinceMinutesAgo</code>from now, which can define complex modifiers depending on the number of purchases and how long time there has passed since the last purchase.
     * @param sinceMinutesAgo The timespan in minutes up till now that a product should be considered relevant if it has been bought by the user.
     * @param numberOfPurchasesWeight The multiplier that decides how important the amount of times the product has been bought is.
     * @param mostRecentPurchaseWeight The multiplier that decides how important the amount of times the product has been bought is.
     * @param ifNotPurchasedBaseWeight The multiplier that decides how important more recent purchases should
     */
    public static UserFavoriteProductRelevanceModifier create(Integer sinceMinutesAgo, Double numberOfPurchasesWeight, Double mostRecentPurchaseWeight, Double ifNotPurchasedBaseWeight)
    {
        return new UserFavoriteProductRelevanceModifier(sinceMinutesAgo, numberOfPurchasesWeight, mostRecentPurchaseWeight, ifNotPurchasedBaseWeight);
    }
    /**
     * Creates a <code>RelevanceModifier</code> that can change the relevance of a Product depending on whether a product has been bought within some interval of minutes <code>SinceMinutesAgo</code>from now, which can define complex modifiers depending on the number of purchases and how long time there has passed since the last purchase.
     * @param sinceMinutesAgo The timespan in minutes up till now that a product should be considered relevant if it has been bought by the user.
     * @param numberOfPurchasesWeight The multiplier that decides how important the amount of times the product has been bought is.
     * @param mostRecentPurchaseWeight The multiplier that decides how important the amount of times the product has been bought is.
     * @param ifNotPurchasedBaseWeight The multiplier that decides how important more recent purchases should
     */
    public UserFavoriteProductRelevanceModifier(Integer sinceMinutesAgo, Double numberOfPurchasesWeight, Double mostRecentPurchaseWeight, Double ifNotPurchasedBaseWeight)
    {
        this.sinceMinutesAgo = sinceMinutesAgo;
        this.numberOfPurchasesWeight = numberOfPurchasesWeight;
        this.mostRecentPurchaseWeight = mostRecentPurchaseWeight;
        this.ifNotPurchasedBaseWeight = ifNotPurchasedBaseWeight;
    }
    public UserFavoriteProductRelevanceModifier()
    {
        this.numberOfPurchasesWeight = 1d;
        this.mostRecentPurchaseWeight = 1d;
        this.ifNotPurchasedBaseWeight = 1d;
    }
    /** The timespan in minutes up till now that a product should be considered relevant if it has been bought by the user. */
    public Integer getSinceMinutesAgo()
    {
        return this.sinceMinutesAgo;
    }
    /** The multiplier that decides how important the amount of times the product has been bought is. */
    public Double getNumberOfPurchasesWeight()
    {
        return this.numberOfPurchasesWeight;
    }
    /** The multiplier that decides how important the amount of times the product has been bought is. */
    public Double getMostRecentPurchaseWeight()
    {
        return this.mostRecentPurchaseWeight;
    }
    /** The multiplier that decides how important more recent purchases should */
    public Double getIfNotPurchasedBaseWeight()
    {
        return this.ifNotPurchasedBaseWeight;
    }
    /** The timespan in minutes up till now that a product should be considered relevant if it has been bought by the user. */
    public UserFavoriteProductRelevanceModifier setSinceMinutesAgo(Integer sinceMinutesAgo)
    {
        this.sinceMinutesAgo = sinceMinutesAgo;
        return this;
    }
    /** The multiplier that decides how important the amount of times the product has been bought is. */
    public UserFavoriteProductRelevanceModifier setNumberOfPurchasesWeight(Double numberOfPurchasesWeight)
    {
        this.numberOfPurchasesWeight = numberOfPurchasesWeight;
        return this;
    }
    /** The multiplier that decides how important the amount of times the product has been bought is. */
    public UserFavoriteProductRelevanceModifier setMostRecentPurchaseWeight(Double mostRecentPurchaseWeight)
    {
        this.mostRecentPurchaseWeight = mostRecentPurchaseWeight;
        return this;
    }
    /** The multiplier that decides how important more recent purchases should */
    public UserFavoriteProductRelevanceModifier setIfNotPurchasedBaseWeight(Double ifNotPurchasedBaseWeight)
    {
        this.ifNotPurchasedBaseWeight = ifNotPurchasedBaseWeight;
        return this;
    }
    @Override
    public UserFavoriteProductRelevanceModifier setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
}

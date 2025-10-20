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
    
/** Defines the settings for the feed recommendation, including page size, seed settings, composition of entities, and selected properties for products, variants, and content. */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Feed
{
    /** The minimum number of items to return initially and per every <code>FeedRecommendationNextItemsRequest</code>. A higher number of results may be returned if composition configurations dictate so. For example, if a given <code>FeedComposition</code> has a lower bound of 5, and the <code>MinimumPageSize</code> is set to 4, then the feed will return at least 5 items whenever the result contains any derived from that composition element. */
    public Integer minimumPageSize;
    /** Optionally used to seed the feed with specific products or content. Useful, for example, when you want to show a feed based on specific product(s) or content, such as a PDP/CDP, a shopping cart, or an order. */
    public @Nullable FeedSeed seed;
    /** Defines how the feed will be composed, which types of entities to include, how many of each type, and any filters or relevance modifiers that should apply to each type, etc. Multiple <code>FeedComposition</code> instances can be added to compose different types of entities in the feed in the rotation. */
    public ArrayList<FeedComposition> compositions;
    /** Defines which properties to include for recommended products. When not set, only IDs will be returned. */
    public @Nullable SelectedProductPropertiesSettings selectedProductProperties;
    /** Defines which properties to include for recommended variants. When not set, only IDs will be returned. */
    public @Nullable SelectedVariantPropertiesSettings selectedVariantProperties;
    /** Defines which properties to include for recommended content. When not set, only IDs will be returned. */
    public @Nullable SelectedContentPropertiesSettings selectedContentProperties;
    /** Defines if variants should be included for returned products */
    public @Nullable Boolean recommendVariant;
    /** Defines if products should be excluded if they are currently present in the users Cart */
    public @Nullable Boolean allowProductsCurrentlyInCart;
    /**
     * Initializes a new instance of the <code>Feed</code> class.
     * @param minimumPageSize The minimum number of items to return initially and per every
     * @param seed Optionally used to seed the feed with specific products or content. Useful, for example, when you want to show a feed based on specific product(s) or content, such as a PDP/CDP, a shopping cart, or an order.
     * @param composition Defines how the feed will be composed, which types of entities to include, how many of each type, and any filters or relevance modifiers that should apply to each type.
     */
    public static Feed create(Integer minimumPageSize, @Nullable FeedSeed seed, FeedComposition... composition)
    {
        return new Feed(minimumPageSize, seed, composition);
    }
    /**
     * Initializes a new instance of the <code>Feed</code> class.
     * @param minimumPageSize The minimum number of items to return initially and per every
     * @param seed Optionally used to seed the feed with specific products or content. Useful, for example, when you want to show a feed based on specific product(s) or content, such as a PDP/CDP, a shopping cart, or an order.
     * @param composition Defines how the feed will be composed, which types of entities to include, how many of each type, and any filters or relevance modifiers that should apply to each type.
     */
    public Feed(Integer minimumPageSize, @Nullable FeedSeed seed, FeedComposition... composition)
    {
        this.minimumPageSize = minimumPageSize;
        this.seed = seed;
        this.compositions = new ArrayList<>(Arrays.asList(composition));
    }
    public Feed()
    {
    }
    /** The minimum number of items to return initially and per every <code>FeedRecommendationNextItemsRequest</code>. A higher number of results may be returned if composition configurations dictate so. For example, if a given <code>FeedComposition</code> has a lower bound of 5, and the <code>MinimumPageSize</code> is set to 4, then the feed will return at least 5 items whenever the result contains any derived from that composition element. */
    public Integer getMinimumPageSize()
    {
        return this.minimumPageSize;
    }
    /** Optionally used to seed the feed with specific products or content. Useful, for example, when you want to show a feed based on specific product(s) or content, such as a PDP/CDP, a shopping cart, or an order. */
    public @Nullable FeedSeed getSeed()
    {
        return this.seed;
    }
    /** Defines how the feed will be composed, which types of entities to include, how many of each type, and any filters or relevance modifiers that should apply to each type, etc. Multiple <code>FeedComposition</code> instances can be added to compose different types of entities in the feed in the rotation. */
    public ArrayList<FeedComposition> getCompositions()
    {
        return this.compositions;
    }
    /** Defines which properties to include for recommended products. When not set, only IDs will be returned. */
    public @Nullable SelectedProductPropertiesSettings getSelectedProductProperties()
    {
        return this.selectedProductProperties;
    }
    /** Defines which properties to include for recommended variants. When not set, only IDs will be returned. */
    public @Nullable SelectedVariantPropertiesSettings getSelectedVariantProperties()
    {
        return this.selectedVariantProperties;
    }
    /** Defines which properties to include for recommended content. When not set, only IDs will be returned. */
    public @Nullable SelectedContentPropertiesSettings getSelectedContentProperties()
    {
        return this.selectedContentProperties;
    }
    /** Defines if variants should be included for returned products */
    public @Nullable Boolean getRecommendVariant()
    {
        return this.recommendVariant;
    }
    /** Defines if products should be excluded if they are currently present in the users Cart */
    public @Nullable Boolean getAllowProductsCurrentlyInCart()
    {
        return this.allowProductsCurrentlyInCart;
    }
    /** The minimum number of items to return initially and per every <code>FeedRecommendationNextItemsRequest</code>. A higher number of results may be returned if composition configurations dictate so. For example, if a given <code>FeedComposition</code> has a lower bound of 5, and the <code>MinimumPageSize</code> is set to 4, then the feed will return at least 5 items whenever the result contains any derived from that composition element. */
    public Feed setMinimumPageSize(Integer minimumPageSize)
    {
        this.minimumPageSize = minimumPageSize;
        return this;
    }
    /** Optionally used to seed the feed with specific products or content. Useful, for example, when you want to show a feed based on specific product(s) or content, such as a PDP/CDP, a shopping cart, or an order. */
    public Feed setSeed(@Nullable FeedSeed seed)
    {
        this.seed = seed;
        return this;
    }
    /** Defines how the feed will be composed, which types of entities to include, how many of each type, and any filters or relevance modifiers that should apply to each type, etc. Multiple <code>FeedComposition</code> instances can be added to compose different types of entities in the feed in the rotation. */
    public Feed setCompositions(FeedComposition... compositions)
    {
        this.compositions = new ArrayList<>(Arrays.asList(compositions));;
        return this;
    }
    /** Defines how the feed will be composed, which types of entities to include, how many of each type, and any filters or relevance modifiers that should apply to each type, etc. Multiple <code>FeedComposition</code> instances can be added to compose different types of entities in the feed in the rotation. */
    public Feed addToCompositions(FeedComposition compositions)
    {
        if (this.compositions == null)
        {
            this.compositions = new ArrayList<>();
        }
        this.compositions.add(compositions);
        return this;
    }
    /** Defines which properties to include for recommended products. When not set, only IDs will be returned. */
    public Feed setSelectedProductProperties(@Nullable SelectedProductPropertiesSettings selectedProductProperties)
    {
        this.selectedProductProperties = selectedProductProperties;
        return this;
    }
    /** Defines which properties to include for recommended variants. When not set, only IDs will be returned. */
    public Feed setSelectedVariantProperties(@Nullable SelectedVariantPropertiesSettings selectedVariantProperties)
    {
        this.selectedVariantProperties = selectedVariantProperties;
        return this;
    }
    /** Defines which properties to include for recommended content. When not set, only IDs will be returned. */
    public Feed setSelectedContentProperties(@Nullable SelectedContentPropertiesSettings selectedContentProperties)
    {
        this.selectedContentProperties = selectedContentProperties;
        return this;
    }
    /** Defines if variants should be included for returned products */
    public Feed setRecommendVariant(@Nullable Boolean recommendVariant)
    {
        this.recommendVariant = recommendVariant;
        return this;
    }
    /** Defines if products should be excluded if they are currently present in the users Cart */
    public Feed setAllowProductsCurrentlyInCart(@Nullable Boolean allowProductsCurrentlyInCart)
    {
        this.allowProductsCurrentlyInCart = allowProductsCurrentlyInCart;
        return this;
    }
}

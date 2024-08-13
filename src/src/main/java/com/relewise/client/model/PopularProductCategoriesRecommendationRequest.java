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
    defaultImpl = PopularProductCategoriesRecommendationRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PopularProductCategoriesRecommendationRequest extends ProductCategoryRecommendationRequest implements IUserIdentifier
{
    public String $type = "Relewise.Client.Requests.Recommendations.PopularProductCategoriesRecommendationRequest, Relewise.Client";
    public Integer sinceMinutesAgo;
    public ProductCategoryRecommendationWeights weights;
    public static PopularProductCategoriesRecommendationRequest create(@Nullable Language language, @Nullable Currency currency, String displayedAtLocationType, User user, ProductCategoryRecommendationWeights weights, Integer sinceMinutesAgo)
    {
        return new PopularProductCategoriesRecommendationRequest(language, currency, displayedAtLocationType, user, weights, sinceMinutesAgo);
    }
    public PopularProductCategoriesRecommendationRequest(@Nullable Language language, @Nullable Currency currency, String displayedAtLocationType, User user, ProductCategoryRecommendationWeights weights, Integer sinceMinutesAgo)
    {
        this.language = language;
        this.currency = currency;
        this.displayedAtLocationType = displayedAtLocationType;
        this.user = user;
        this.weights = weights;
        this.sinceMinutesAgo = sinceMinutesAgo;
    }
    public PopularProductCategoriesRecommendationRequest()
    {
    }
    public Integer getSinceMinutesAgo()
    {
        return this.sinceMinutesAgo;
    }
    public ProductCategoryRecommendationWeights getWeights()
    {
        return this.weights;
    }
    public PopularProductCategoriesRecommendationRequest setSinceMinutesAgo(Integer sinceMinutesAgo)
    {
        this.sinceMinutesAgo = sinceMinutesAgo;
        return this;
    }
    public PopularProductCategoriesRecommendationRequest setWeights(ProductCategoryRecommendationWeights weights)
    {
        this.weights = weights;
        return this;
    }
    @Override
    public PopularProductCategoriesRecommendationRequest setSettings(ProductCategoryRecommendationRequestSettings settings)
    {
        this.settings = settings;
        return this;
    }
    @Override
    public PopularProductCategoriesRecommendationRequest setLanguage(@Nullable Language language)
    {
        this.language = language;
        return this;
    }
    @Override
    public PopularProductCategoriesRecommendationRequest setUser(@Nullable User user)
    {
        this.user = user;
        return this;
    }
    @Override
    public PopularProductCategoriesRecommendationRequest setRelevanceModifiers(RelevanceModifierCollection relevanceModifiers)
    {
        this.relevanceModifiers = relevanceModifiers;
        return this;
    }
    @Override
    public PopularProductCategoriesRecommendationRequest setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
    @Override
    public PopularProductCategoriesRecommendationRequest setDisplayedAtLocationType(String displayedAtLocationType)
    {
        this.displayedAtLocationType = displayedAtLocationType;
        return this;
    }
    @Override
    public PopularProductCategoriesRecommendationRequest setCurrency(@Nullable Currency currency)
    {
        this.currency = currency;
        return this;
    }
    /** @deprecated Use User.Channel instead. */
    @Override
    public PopularProductCategoriesRecommendationRequest setChannel(@Nullable Channel channel)
    {
        this.channel = channel;
        return this;
    }
}

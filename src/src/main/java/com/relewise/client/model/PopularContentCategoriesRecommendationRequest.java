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
    defaultImpl = PopularContentCategoriesRecommendationRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PopularContentCategoriesRecommendationRequest extends ContentCategoryRecommendationRequest implements IUserIdentifier, IHaveCurrencyLanguage
{
    public String $type = "Relewise.Client.Requests.Recommendations.PopularContentCategoriesRecommendationRequest, Relewise.Client";
    public Integer sinceMinutesAgo;
    public ContentCategoryRecommendationWeights weights;
    public static PopularContentCategoriesRecommendationRequest create(@Nullable Language language, @Nullable Currency currency, String displayedAtLocationType, User user, ContentCategoryRecommendationWeights weights, Integer sinceMinutesAgo)
    {
        return new PopularContentCategoriesRecommendationRequest(language, currency, displayedAtLocationType, user, weights, sinceMinutesAgo);
    }
    public PopularContentCategoriesRecommendationRequest(@Nullable Language language, @Nullable Currency currency, String displayedAtLocationType, User user, ContentCategoryRecommendationWeights weights, Integer sinceMinutesAgo)
    {
        this.language = language;
        this.currency = currency;
        this.displayedAtLocationType = displayedAtLocationType;
        this.user = user;
        this.weights = weights;
        this.sinceMinutesAgo = sinceMinutesAgo;
    }
    public PopularContentCategoriesRecommendationRequest()
    {
    }
    public Integer getSinceMinutesAgo()
    {
        return this.sinceMinutesAgo;
    }
    public ContentCategoryRecommendationWeights getWeights()
    {
        return this.weights;
    }
    public PopularContentCategoriesRecommendationRequest setSinceMinutesAgo(Integer sinceMinutesAgo)
    {
        this.sinceMinutesAgo = sinceMinutesAgo;
        return this;
    }
    public PopularContentCategoriesRecommendationRequest setWeights(ContentCategoryRecommendationWeights weights)
    {
        this.weights = weights;
        return this;
    }
    @Override
    public PopularContentCategoriesRecommendationRequest setSettings(ContentCategoryRecommendationRequestSettings settings)
    {
        this.settings = settings;
        return this;
    }
    @Override
    public PopularContentCategoriesRecommendationRequest setLanguage(@Nullable Language language)
    {
        this.language = language;
        return this;
    }
    @Override
    public PopularContentCategoriesRecommendationRequest setUser(@Nullable User user)
    {
        this.user = user;
        return this;
    }
    @Override
    public PopularContentCategoriesRecommendationRequest setRelevanceModifiers(RelevanceModifierCollection relevanceModifiers)
    {
        this.relevanceModifiers = relevanceModifiers;
        return this;
    }
    @Override
    public PopularContentCategoriesRecommendationRequest setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
    @Override
    public PopularContentCategoriesRecommendationRequest setDisplayedAtLocationType(String displayedAtLocationType)
    {
        this.displayedAtLocationType = displayedAtLocationType;
        return this;
    }
    @Override
    public PopularContentCategoriesRecommendationRequest setCurrency(@Nullable Currency currency)
    {
        this.currency = currency;
        return this;
    }
    /** @deprecated Use User.Channel instead. */
    @Override
    public PopularContentCategoriesRecommendationRequest setChannel(@Nullable Channel channel)
    {
        this.channel = channel;
        return this;
    }
}

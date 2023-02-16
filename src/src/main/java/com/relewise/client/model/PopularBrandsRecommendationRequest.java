package com.relewise.client.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.annotation.Nullable;
import java.io.IOException;
import java.time.OffsetDateTime;
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
    defaultImpl = PopularBrandsRecommendationRequest.class)
public class PopularBrandsRecommendationRequest extends BrandRecommendationRequest implements IUserIdentifier
{
    public String $type = "Relewise.Client.Requests.Recommendations.PopularBrandsRecommendationRequest, Relewise.Client";
    public Integer sinceMinutesAgo;
    public BrandRecommendationWeights weights;
    public static PopularBrandsRecommendationRequest create(@Nullable Language language, @Nullable Currency currency, String displayedAtLocationType, User user, BrandRecommendationWeights weights)
    {
        return new PopularBrandsRecommendationRequest(language, currency, displayedAtLocationType, user, weights);
    }
    public PopularBrandsRecommendationRequest(@Nullable Language language, @Nullable Currency currency, String displayedAtLocationType, User user, BrandRecommendationWeights weights)
    {
        this.language = language;
        this.currency = currency;
        this.displayedAtLocationType = displayedAtLocationType;
        this.user = user;
        this.weights = weights;
    }
    public PopularBrandsRecommendationRequest()
    {
    }
    public Integer getSinceMinutesAgo()
    {
        return this.sinceMinutesAgo;
    }
    public BrandRecommendationWeights getWeights()
    {
        return this.weights;
    }
    public PopularBrandsRecommendationRequest setSinceMinutesAgo(Integer sinceMinutesAgo)
    {
        this.sinceMinutesAgo = sinceMinutesAgo;;
        return this;
    }
    public PopularBrandsRecommendationRequest setWeights(BrandRecommendationWeights weights)
    {
        this.weights = weights;;
        return this;
    }
    @Override
    public PopularBrandsRecommendationRequest setSettings(BrandRecommendationRequestSettings settings)
    {
        this.settings = settings;;
        return this;
    }
    @Override
    public PopularBrandsRecommendationRequest setLanguage(Language language)
    {
        this.language = language;;
        return this;
    }
    @Override
    public PopularBrandsRecommendationRequest setUser(User user)
    {
        this.user = user;;
        return this;
    }
    @Override
    public PopularBrandsRecommendationRequest setRelevanceModifiers(RelevanceModifierCollection relevanceModifiers)
    {
        this.relevanceModifiers = relevanceModifiers;;
        return this;
    }
    @Override
    public PopularBrandsRecommendationRequest setFilters(FilterCollection filters)
    {
        this.filters = filters;;
        return this;
    }
    @Override
    public PopularBrandsRecommendationRequest setDisplayedAtLocationType(String displayedAtLocationType)
    {
        this.displayedAtLocationType = displayedAtLocationType;;
        return this;
    }
    @Override
    public PopularBrandsRecommendationRequest setCurrency(Currency currency)
    {
        this.currency = currency;;
        return this;
    }
}

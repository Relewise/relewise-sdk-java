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
    defaultImpl = PersonalBrandRecommendationRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonalBrandRecommendationRequest extends BrandRecommendationRequest implements IUserIdentifier, IHaveCurrencyLanguage
{
    public String $type = "Relewise.Client.Requests.Recommendations.PersonalBrandRecommendationRequest, Relewise.Client";
    public Integer sinceMinutesAgo;
    public BrandRecommendationWeights weights;
    public static PersonalBrandRecommendationRequest create(@Nullable Language language, @Nullable Currency currency, String displayedAtLocationType, User user, BrandRecommendationWeights weights, Integer sinceMinutesAgo)
    {
        return new PersonalBrandRecommendationRequest(language, currency, displayedAtLocationType, user, weights, sinceMinutesAgo);
    }
    public PersonalBrandRecommendationRequest(@Nullable Language language, @Nullable Currency currency, String displayedAtLocationType, User user, BrandRecommendationWeights weights, Integer sinceMinutesAgo)
    {
        this.language = language;
        this.currency = currency;
        this.displayedAtLocationType = displayedAtLocationType;
        this.user = user;
        this.weights = weights;
        this.sinceMinutesAgo = sinceMinutesAgo;
    }
    public PersonalBrandRecommendationRequest()
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
    public PersonalBrandRecommendationRequest setSinceMinutesAgo(Integer sinceMinutesAgo)
    {
        this.sinceMinutesAgo = sinceMinutesAgo;
        return this;
    }
    public PersonalBrandRecommendationRequest setWeights(BrandRecommendationWeights weights)
    {
        this.weights = weights;
        return this;
    }
    @Override
    public PersonalBrandRecommendationRequest setSettings(BrandRecommendationRequestSettings settings)
    {
        this.settings = settings;
        return this;
    }
    @Override
    public PersonalBrandRecommendationRequest setLanguage(@Nullable Language language)
    {
        this.language = language;
        return this;
    }
    @Override
    public PersonalBrandRecommendationRequest setUser(@Nullable User user)
    {
        this.user = user;
        return this;
    }
    @Override
    public PersonalBrandRecommendationRequest setRelevanceModifiers(RelevanceModifierCollection relevanceModifiers)
    {
        this.relevanceModifiers = relevanceModifiers;
        return this;
    }
    @Override
    public PersonalBrandRecommendationRequest setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
    @Override
    public PersonalBrandRecommendationRequest setDisplayedAtLocationType(String displayedAtLocationType)
    {
        this.displayedAtLocationType = displayedAtLocationType;
        return this;
    }
    @Override
    public PersonalBrandRecommendationRequest setCurrency(@Nullable Currency currency)
    {
        this.currency = currency;
        return this;
    }
    /** @deprecated Use User.Channel instead. */
    @Override
    public PersonalBrandRecommendationRequest setChannel(@Nullable Channel channel)
    {
        this.channel = channel;
        return this;
    }
}

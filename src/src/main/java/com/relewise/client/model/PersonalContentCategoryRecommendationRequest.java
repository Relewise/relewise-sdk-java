package com.relewise.client.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
    defaultImpl = PersonalContentCategoryRecommendationRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonalContentCategoryRecommendationRequest extends ContentCategoryRecommendationRequest implements IUserIdentifier
{
    public String $type = "Relewise.Client.Requests.Recommendations.PersonalContentCategoryRecommendationRequest, Relewise.Client";
    public Integer sinceMinutesAgo;
    public ContentCategoryRecommendationWeights weights;
    public static PersonalContentCategoryRecommendationRequest create(@Nullable Language language, @Nullable Currency currency, String displayedAtLocationType, User user, ContentCategoryRecommendationWeights weights, Integer sinceMinutesAgo)
    {
        return new PersonalContentCategoryRecommendationRequest(language, currency, displayedAtLocationType, user, weights, sinceMinutesAgo);
    }
    public PersonalContentCategoryRecommendationRequest(@Nullable Language language, @Nullable Currency currency, String displayedAtLocationType, User user, ContentCategoryRecommendationWeights weights, Integer sinceMinutesAgo)
    {
        this.language = language;
        this.currency = currency;
        this.displayedAtLocationType = displayedAtLocationType;
        this.user = user;
        this.weights = weights;
        this.sinceMinutesAgo = sinceMinutesAgo;
    }
    public PersonalContentCategoryRecommendationRequest()
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
    public PersonalContentCategoryRecommendationRequest setSinceMinutesAgo(Integer sinceMinutesAgo)
    {
        this.sinceMinutesAgo = sinceMinutesAgo;
        return this;
    }
    public PersonalContentCategoryRecommendationRequest setWeights(ContentCategoryRecommendationWeights weights)
    {
        this.weights = weights;
        return this;
    }
    @Override
    public PersonalContentCategoryRecommendationRequest setSettings(ContentCategoryRecommendationRequestSettings settings)
    {
        this.settings = settings;
        return this;
    }
    @Override
    public PersonalContentCategoryRecommendationRequest setLanguage(Language language)
    {
        this.language = language;
        return this;
    }
    @Override
    public PersonalContentCategoryRecommendationRequest setUser(User user)
    {
        this.user = user;
        return this;
    }
    @Override
    public PersonalContentCategoryRecommendationRequest setRelevanceModifiers(RelevanceModifierCollection relevanceModifiers)
    {
        this.relevanceModifiers = relevanceModifiers;
        return this;
    }
    @Override
    public PersonalContentCategoryRecommendationRequest setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
    @Override
    public PersonalContentCategoryRecommendationRequest setDisplayedAtLocationType(String displayedAtLocationType)
    {
        this.displayedAtLocationType = displayedAtLocationType;
        return this;
    }
    @Override
    public PersonalContentCategoryRecommendationRequest setCurrency(Currency currency)
    {
        this.currency = currency;
        return this;
    }
}

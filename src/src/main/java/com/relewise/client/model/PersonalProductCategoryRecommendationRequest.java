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
    defaultImpl = PersonalProductCategoryRecommendationRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonalProductCategoryRecommendationRequest extends ProductCategoryRecommendationRequest implements IUserIdentifier
{
    public String $type = "Relewise.Client.Requests.Recommendations.PersonalProductCategoryRecommendationRequest, Relewise.Client";
    public Integer sinceMinutesAgo;
    public ProductCategoryRecommendationWeights weights;
    public static PersonalProductCategoryRecommendationRequest create(@Nullable Language language, @Nullable Currency currency, String displayedAtLocationType, User user, ProductCategoryRecommendationWeights weights)
    {
        return new PersonalProductCategoryRecommendationRequest(language, currency, displayedAtLocationType, user, weights);
    }
    public PersonalProductCategoryRecommendationRequest(@Nullable Language language, @Nullable Currency currency, String displayedAtLocationType, User user, ProductCategoryRecommendationWeights weights)
    {
        this.language = language;
        this.currency = currency;
        this.displayedAtLocationType = displayedAtLocationType;
        this.user = user;
        this.weights = weights;
    }
    public PersonalProductCategoryRecommendationRequest()
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
    public PersonalProductCategoryRecommendationRequest setSinceMinutesAgo(Integer sinceMinutesAgo)
    {
        this.sinceMinutesAgo = sinceMinutesAgo;;
        return this;
    }
    public PersonalProductCategoryRecommendationRequest setWeights(ProductCategoryRecommendationWeights weights)
    {
        this.weights = weights;;
        return this;
    }
    @Override
    public PersonalProductCategoryRecommendationRequest setSettings(ProductCategoryRecommendationRequestSettings settings)
    {
        this.settings = settings;;
        return this;
    }
    @Override
    public PersonalProductCategoryRecommendationRequest setLanguage(Language language)
    {
        this.language = language;;
        return this;
    }
    @Override
    public PersonalProductCategoryRecommendationRequest setUser(User user)
    {
        this.user = user;;
        return this;
    }
    @Override
    public PersonalProductCategoryRecommendationRequest setRelevanceModifiers(RelevanceModifierCollection relevanceModifiers)
    {
        this.relevanceModifiers = relevanceModifiers;;
        return this;
    }
    @Override
    public PersonalProductCategoryRecommendationRequest setFilters(FilterCollection filters)
    {
        this.filters = filters;;
        return this;
    }
    @Override
    public PersonalProductCategoryRecommendationRequest setDisplayedAtLocationType(String displayedAtLocationType)
    {
        this.displayedAtLocationType = displayedAtLocationType;;
        return this;
    }
    @Override
    public PersonalProductCategoryRecommendationRequest setCurrency(Currency currency)
    {
        this.currency = currency;;
        return this;
    }
}

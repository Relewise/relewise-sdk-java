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
    defaultImpl = SearchTermBasedProductRecommendationRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchTermBasedProductRecommendationRequest extends ProductRecommendationRequest implements IUserIdentifier
{
    public String $type = "Relewise.Client.Requests.Recommendations.SearchTermBasedProductRecommendationRequest, Relewise.Client";
    public String term;
    public static SearchTermBasedProductRecommendationRequest create(@Nullable Language language, @Nullable Currency currency, String displayedAtLocationType, User user, String term)
    {
        return new SearchTermBasedProductRecommendationRequest(language, currency, displayedAtLocationType, user, term);
    }
    public SearchTermBasedProductRecommendationRequest(@Nullable Language language, @Nullable Currency currency, String displayedAtLocationType, User user, String term)
    {
        this.language = language;
        this.currency = currency;
        this.displayedAtLocationType = displayedAtLocationType;
        this.user = user;
        this.term = term;
    }
    public SearchTermBasedProductRecommendationRequest()
    {
    }
    public String getTerm()
    {
        return this.term;
    }
    public SearchTermBasedProductRecommendationRequest setTerm(String term)
    {
        this.term = term;
        return this;
    }
    @Override
    public SearchTermBasedProductRecommendationRequest setSettings(ProductRecommendationRequestSettings settings)
    {
        this.settings = settings;
        return this;
    }
    @Override
    public SearchTermBasedProductRecommendationRequest setLanguage(Language language)
    {
        this.language = language;
        return this;
    }
    @Override
    public SearchTermBasedProductRecommendationRequest setUser(User user)
    {
        this.user = user;
        return this;
    }
    @Override
    public SearchTermBasedProductRecommendationRequest setRelevanceModifiers(RelevanceModifierCollection relevanceModifiers)
    {
        this.relevanceModifiers = relevanceModifiers;
        return this;
    }
    @Override
    public SearchTermBasedProductRecommendationRequest setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
    @Override
    public SearchTermBasedProductRecommendationRequest setDisplayedAtLocationType(String displayedAtLocationType)
    {
        this.displayedAtLocationType = displayedAtLocationType;
        return this;
    }
    @Override
    public SearchTermBasedProductRecommendationRequest setCurrency(Currency currency)
    {
        this.currency = currency;
        return this;
    }
}

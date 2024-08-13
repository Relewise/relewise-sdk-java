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
    defaultImpl = PopularSearchTermsRecommendationRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PopularSearchTermsRecommendationRequest extends RecommendationRequest implements IUserIdentifier
{
    public String $type = "Relewise.Client.Requests.Recommendations.PopularSearchTermsRecommendationRequest, Relewise.Client";
    public @Nullable String term;
    public @Nullable RecommendPopularSearchTermSettings settings;
    public static PopularSearchTermsRecommendationRequest create(@Nullable Language language, @Nullable Currency currency, String displayedAtLocationType, User user, String term)
    {
        return new PopularSearchTermsRecommendationRequest(language, currency, displayedAtLocationType, user, term);
    }
    public PopularSearchTermsRecommendationRequest(@Nullable Language language, @Nullable Currency currency, String displayedAtLocationType, User user, String term)
    {
        this.language = language;
        this.currency = currency;
        this.displayedAtLocationType = displayedAtLocationType;
        this.user = user;
        this.term = term;
    }
    public static PopularSearchTermsRecommendationRequest create(@Nullable Language language, @Nullable Currency currency, String displayedAtLocationType, User user)
    {
        return new PopularSearchTermsRecommendationRequest(language, currency, displayedAtLocationType, user);
    }
    public PopularSearchTermsRecommendationRequest(@Nullable Language language, @Nullable Currency currency, String displayedAtLocationType, User user)
    {
        this.language = language;
        this.currency = currency;
        this.displayedAtLocationType = displayedAtLocationType;
        this.user = user;
    }
    public PopularSearchTermsRecommendationRequest()
    {
    }
    public @Nullable String getTerm()
    {
        return this.term;
    }
    public @Nullable RecommendPopularSearchTermSettings getSettings()
    {
        return this.settings;
    }
    public PopularSearchTermsRecommendationRequest setTerm(@Nullable String term)
    {
        this.term = term;
        return this;
    }
    public PopularSearchTermsRecommendationRequest setSettings(@Nullable RecommendPopularSearchTermSettings settings)
    {
        this.settings = settings;
        return this;
    }
    @Override
    public PopularSearchTermsRecommendationRequest setLanguage(@Nullable Language language)
    {
        this.language = language;
        return this;
    }
    @Override
    public PopularSearchTermsRecommendationRequest setUser(@Nullable User user)
    {
        this.user = user;
        return this;
    }
    @Override
    public PopularSearchTermsRecommendationRequest setRelevanceModifiers(RelevanceModifierCollection relevanceModifiers)
    {
        this.relevanceModifiers = relevanceModifiers;
        return this;
    }
    @Override
    public PopularSearchTermsRecommendationRequest setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
    @Override
    public PopularSearchTermsRecommendationRequest setDisplayedAtLocationType(String displayedAtLocationType)
    {
        this.displayedAtLocationType = displayedAtLocationType;
        return this;
    }
    @Override
    public PopularSearchTermsRecommendationRequest setCurrency(@Nullable Currency currency)
    {
        this.currency = currency;
        return this;
    }
    /** @deprecated Use User.Channel instead. */
    @Override
    public PopularSearchTermsRecommendationRequest setChannel(@Nullable Channel channel)
    {
        this.channel = channel;
        return this;
    }
}

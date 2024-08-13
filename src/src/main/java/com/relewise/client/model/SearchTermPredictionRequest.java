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
    defaultImpl = SearchTermPredictionRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchTermPredictionRequest extends SearchRequest implements IUserIdentifier
{
    public String $type = "Relewise.Client.Requests.Search.SearchTermPredictionRequest, Relewise.Client";
    public String term;
    public Integer take;
    public @Nullable SearchTermPredictionSettings settings;
    public static SearchTermPredictionRequest create(@Nullable Language language, @Nullable Currency currency, @Nullable SearchIndexSelector indexSelector, User user, String displayedAtLocation, String term, Integer take)
    {
        return new SearchTermPredictionRequest(language, currency, indexSelector, user, displayedAtLocation, term, take);
    }
    public SearchTermPredictionRequest(@Nullable Language language, @Nullable Currency currency, @Nullable SearchIndexSelector indexSelector, User user, String displayedAtLocation, String term, Integer take)
    {
        this.language = language;
        this.currency = currency;
        this.indexSelector = indexSelector;
        this.user = user;
        this.displayedAtLocation = displayedAtLocation;
        this.term = term;
        this.take = take;
    }
    public static SearchTermPredictionRequest create(@Nullable Language language, @Nullable Currency currency, User user, String displayedAtLocation, String term, Integer take)
    {
        return new SearchTermPredictionRequest(language, currency, user, displayedAtLocation, term, take);
    }
    public SearchTermPredictionRequest(@Nullable Language language, @Nullable Currency currency, User user, String displayedAtLocation, String term, Integer take)
    {
        this.language = language;
        this.currency = currency;
        this.user = user;
        this.displayedAtLocation = displayedAtLocation;
        this.term = term;
        this.take = take;
    }
    public SearchTermPredictionRequest()
    {
    }
    public String getTerm()
    {
        return this.term;
    }
    public Integer getTake()
    {
        return this.take;
    }
    public @Nullable SearchTermPredictionSettings getSettings()
    {
        return this.settings;
    }
    public SearchTermPredictionRequest setTerm(String term)
    {
        this.term = term;
        return this;
    }
    public SearchTermPredictionRequest setTake(Integer take)
    {
        this.take = take;
        return this;
    }
    public SearchTermPredictionRequest setSettings(@Nullable SearchTermPredictionSettings settings)
    {
        this.settings = settings;
        return this;
    }
    @Override
    public SearchTermPredictionRequest setLanguage(@Nullable Language language)
    {
        this.language = language;
        return this;
    }
    @Override
    public SearchTermPredictionRequest setCurrency(@Nullable Currency currency)
    {
        this.currency = currency;
        return this;
    }
    @Override
    public SearchTermPredictionRequest setUser(@Nullable User user)
    {
        this.user = user;
        return this;
    }
    @Override
    public SearchTermPredictionRequest setDisplayedAtLocation(@Nullable String displayedAtLocation)
    {
        this.displayedAtLocation = displayedAtLocation;
        return this;
    }
    @Override
    public SearchTermPredictionRequest setRelevanceModifiers(@Nullable RelevanceModifierCollection relevanceModifiers)
    {
        this.relevanceModifiers = relevanceModifiers;
        return this;
    }
    @Override
    public SearchTermPredictionRequest setFilters(@Nullable FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
    @Override
    public SearchTermPredictionRequest setIndexSelector(@Nullable SearchIndexSelector indexSelector)
    {
        this.indexSelector = indexSelector;
        return this;
    }
    @Override
    public SearchTermPredictionRequest setPostFilters(@Nullable FilterCollection postFilters)
    {
        this.postFilters = postFilters;
        return this;
    }
    /** @deprecated Use User.Channel instead. */
    @Override
    public SearchTermPredictionRequest setChannel(@Nullable Channel channel)
    {
        this.channel = channel;
        return this;
    }
}

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
    defaultImpl = SearchTermPredictionRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchTermPredictionRequest extends SearchRequest implements IUserIdentifier
{
    public String $type = "Relewise.Client.Requests.Search.SearchTermPredictionRequest, Relewise.Client";
    public String term;
    public Integer take;
    public @Nullable SearchTermPredictionSettings settings;
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
        this.term = term;;
        return this;
    }
    public SearchTermPredictionRequest setTake(Integer take)
    {
        this.take = take;;
        return this;
    }
    public SearchTermPredictionRequest setSettings(SearchTermPredictionSettings settings)
    {
        this.settings = settings;;
        return this;
    }
    @Override
    public SearchTermPredictionRequest setLanguage(Language language)
    {
        this.language = language;;
        return this;
    }
    @Override
    public SearchTermPredictionRequest setCurrency(Currency currency)
    {
        this.currency = currency;;
        return this;
    }
    @Override
    public SearchTermPredictionRequest setUser(User user)
    {
        this.user = user;;
        return this;
    }
    @Override
    public SearchTermPredictionRequest setDisplayedAtLocation(String displayedAtLocation)
    {
        this.displayedAtLocation = displayedAtLocation;;
        return this;
    }
    @Override
    public SearchTermPredictionRequest setRelevanceModifiers(RelevanceModifierCollection relevanceModifiers)
    {
        this.relevanceModifiers = relevanceModifiers;;
        return this;
    }
    @Override
    public SearchTermPredictionRequest setFilters(FilterCollection filters)
    {
        this.filters = filters;;
        return this;
    }
    @Override
    public SearchTermPredictionRequest setIndexSelector(SearchIndexSelector indexSelector)
    {
        this.indexSelector = indexSelector;;
        return this;
    }
    @Override
    public SearchTermPredictionRequest setPostFilters(FilterCollection postFilters)
    {
        this.postFilters = postFilters;;
        return this;
    }
}

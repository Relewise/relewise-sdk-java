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
import java.util.Set;
import java.util.HashSet;
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = SearchRequestCollection.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchRequestCollection extends SearchRequest implements IUserIdentifier, IHaveCurrencyLanguage
{
    public String $type = "Relewise.Client.Requests.Search.SearchRequestCollection, Relewise.Client";
    public ArrayList<SearchRequest> requests;
    public static SearchRequestCollection create(@Nullable Language language, @Nullable Currency currency, @Nullable SearchIndexSelector indexSelector, @Nullable User user, @Nullable String displayedAtLocation, SearchRequest... requests)
    {
        return new SearchRequestCollection(language, currency, indexSelector, user, displayedAtLocation, requests);
    }
    public SearchRequestCollection(@Nullable Language language, @Nullable Currency currency, @Nullable SearchIndexSelector indexSelector, @Nullable User user, @Nullable String displayedAtLocation, SearchRequest... requests)
    {
        this.language = language;
        this.currency = currency;
        this.indexSelector = indexSelector;
        this.user = user;
        this.displayedAtLocation = displayedAtLocation;
        this.requests = new ArrayList<>(Arrays.asList(requests));
    }
    public static SearchRequestCollection create(SearchRequest... requests)
    {
        return new SearchRequestCollection(requests);
    }
    public SearchRequestCollection(SearchRequest... requests)
    {
        this.requests = new ArrayList<>(Arrays.asList(requests));
    }
    public SearchRequestCollection()
    {
    }
    public ArrayList<SearchRequest> getRequests()
    {
        return this.requests;
    }
    public SearchRequestCollection setRequests(SearchRequest... requests)
    {
        this.requests = new ArrayList<>(Arrays.asList(requests));;
        return this;
    }
    public SearchRequestCollection addToRequests(SearchRequest requests)
    {
        if (this.requests == null)
        {
            this.requests = new ArrayList<>();
        }
        this.requests.add(requests);
        return this;
    }
    @Override
    public SearchRequestCollection setLanguage(@Nullable Language language)
    {
        this.language = language;
        return this;
    }
    @Override
    public SearchRequestCollection setCurrency(@Nullable Currency currency)
    {
        this.currency = currency;
        return this;
    }
    @Override
    public SearchRequestCollection setUser(@Nullable User user)
    {
        this.user = user;
        return this;
    }
    @Override
    public SearchRequestCollection setDisplayedAtLocation(@Nullable String displayedAtLocation)
    {
        this.displayedAtLocation = displayedAtLocation;
        return this;
    }
    @Override
    public SearchRequestCollection setRelevanceModifiers(@Nullable RelevanceModifierCollection relevanceModifiers)
    {
        this.relevanceModifiers = relevanceModifiers;
        return this;
    }
    @Override
    public SearchRequestCollection setFilters(@Nullable FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
    @Override
    public SearchRequestCollection setIndexSelector(@Nullable SearchIndexSelector indexSelector)
    {
        this.indexSelector = indexSelector;
        return this;
    }
    @Override
    public SearchRequestCollection setPostFilters(@Nullable FilterCollection postFilters)
    {
        this.postFilters = postFilters;
        return this;
    }
    /** @deprecated Use User.Channel instead. */
    @Override
    public SearchRequestCollection setChannel(@Nullable Channel channel)
    {
        this.channel = channel;
        return this;
    }
}

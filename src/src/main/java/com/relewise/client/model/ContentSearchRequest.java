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
    defaultImpl = ContentSearchRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentSearchRequest extends PaginatedSearchRequest implements IUserIdentifier
{
    public String $type = "Relewise.Client.Requests.Search.ContentSearchRequest, Relewise.Client";
    public @Nullable String term;
    public @Nullable ContentFacetQuery facets;
    public @Nullable ContentSearchSettings settings;
    public @Nullable ContentSortBySpecification sorting;
    public static ContentSearchRequest create(@Nullable Language language, @Nullable Currency currency, @Nullable SearchIndexSelector indexSelector, User user, String displayedAtLocation, @Nullable String term, Integer skip, Integer take)
    {
        return new ContentSearchRequest(language, currency, indexSelector, user, displayedAtLocation, term, skip, take);
    }
    public ContentSearchRequest(@Nullable Language language, @Nullable Currency currency, @Nullable SearchIndexSelector indexSelector, User user, String displayedAtLocation, @Nullable String term, Integer skip, Integer take)
    {
        this.language = language;
        this.currency = currency;
        this.indexSelector = indexSelector;
        this.user = user;
        this.displayedAtLocation = displayedAtLocation;
        this.term = term;
        this.skip = skip;
        this.take = take;
    }
    public static ContentSearchRequest create(@Nullable Language language, @Nullable Currency currency, User user, String displayedAtLocation, @Nullable String term, Integer skip, Integer take)
    {
        return new ContentSearchRequest(language, currency, user, displayedAtLocation, term, skip, take);
    }
    public ContentSearchRequest(@Nullable Language language, @Nullable Currency currency, User user, String displayedAtLocation, @Nullable String term, Integer skip, Integer take)
    {
        this.language = language;
        this.currency = currency;
        this.user = user;
        this.displayedAtLocation = displayedAtLocation;
        this.term = term;
        this.skip = skip;
        this.take = take;
    }
    public ContentSearchRequest()
    {
    }
    public @Nullable String getTerm()
    {
        return this.term;
    }
    public @Nullable ContentFacetQuery getFacets()
    {
        return this.facets;
    }
    public @Nullable ContentSearchSettings getSettings()
    {
        return this.settings;
    }
    public @Nullable ContentSortBySpecification getSorting()
    {
        return this.sorting;
    }
    public ContentSearchRequest setTerm(String term)
    {
        this.term = term;
        return this;
    }
    public ContentSearchRequest setFacets(ContentFacetQuery facets)
    {
        this.facets = facets;
        return this;
    }
    public ContentSearchRequest setSettings(ContentSearchSettings settings)
    {
        this.settings = settings;
        return this;
    }
    public ContentSearchRequest setSorting(ContentSortBySpecification sorting)
    {
        this.sorting = sorting;
        return this;
    }
    @Override
    public ContentSearchRequest setSkip(Integer skip)
    {
        this.skip = skip;
        return this;
    }
    @Override
    public ContentSearchRequest setTake(Integer take)
    {
        this.take = take;
        return this;
    }
    @Override
    public ContentSearchRequest setLanguage(Language language)
    {
        this.language = language;
        return this;
    }
    @Override
    public ContentSearchRequest setCurrency(Currency currency)
    {
        this.currency = currency;
        return this;
    }
    @Override
    public ContentSearchRequest setUser(User user)
    {
        this.user = user;
        return this;
    }
    @Override
    public ContentSearchRequest setDisplayedAtLocation(String displayedAtLocation)
    {
        this.displayedAtLocation = displayedAtLocation;
        return this;
    }
    @Override
    public ContentSearchRequest setRelevanceModifiers(RelevanceModifierCollection relevanceModifiers)
    {
        this.relevanceModifiers = relevanceModifiers;
        return this;
    }
    @Override
    public ContentSearchRequest setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
    @Override
    public ContentSearchRequest setIndexSelector(SearchIndexSelector indexSelector)
    {
        this.indexSelector = indexSelector;
        return this;
    }
    @Override
    public ContentSearchRequest setPostFilters(FilterCollection postFilters)
    {
        this.postFilters = postFilters;
        return this;
    }
    /** @deprecated Use User.Channel instead. */
    @Override
    public ContentSearchRequest setChannel(Channel channel)
    {
        this.channel = channel;
        return this;
    }
}

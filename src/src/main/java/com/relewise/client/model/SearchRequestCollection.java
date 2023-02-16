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
    defaultImpl = SearchRequestCollection.class)
public class SearchRequestCollection extends SearchRequest implements IUserIdentifier
{
    public String $type = "Relewise.Client.Requests.Search.SearchRequestCollection, Relewise.Client";
    public ArrayList<SearchRequest> requests;
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
    public SearchRequestCollection setLanguage(Language language)
    {
        this.language = language;;
        return this;
    }
    @Override
    public SearchRequestCollection setCurrency(Currency currency)
    {
        this.currency = currency;;
        return this;
    }
    @Override
    public SearchRequestCollection setUser(User user)
    {
        this.user = user;;
        return this;
    }
    @Override
    public SearchRequestCollection setDisplayedAtLocation(String displayedAtLocation)
    {
        this.displayedAtLocation = displayedAtLocation;;
        return this;
    }
    @Override
    public SearchRequestCollection setRelevanceModifiers(RelevanceModifierCollection relevanceModifiers)
    {
        this.relevanceModifiers = relevanceModifiers;;
        return this;
    }
    @Override
    public SearchRequestCollection setFilters(FilterCollection filters)
    {
        this.filters = filters;;
        return this;
    }
    @Override
    public SearchRequestCollection setIndexSelector(SearchIndexSelector indexSelector)
    {
        this.indexSelector = indexSelector;;
        return this;
    }
    @Override
    public SearchRequestCollection setPostFilters(FilterCollection postFilters)
    {
        this.postFilters = postFilters;;
        return this;
    }
}

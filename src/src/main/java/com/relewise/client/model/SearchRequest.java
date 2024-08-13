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
    property = "$type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ProductSearchRequest.class, name = "Relewise.Client.Requests.Search.ProductSearchRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductCategorySearchRequest.class, name = "Relewise.Client.Requests.Search.ProductCategorySearchRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentSearchRequest.class, name = "Relewise.Client.Requests.Search.ContentSearchRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentCategorySearchRequest.class, name = "Relewise.Client.Requests.Search.ContentCategorySearchRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = SearchTermPredictionRequest.class, name = "Relewise.Client.Requests.Search.SearchTermPredictionRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = SearchRequestCollection.class, name = "Relewise.Client.Requests.Search.SearchRequestCollection, Relewise.Client"),
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class SearchRequest extends LicensedRequest implements IUserIdentifier
{
    public String $type = "";
    public @Nullable Language language;
    public @Nullable Currency currency;
    public @Nullable User user;
    public @Nullable String displayedAtLocation;
    public @Nullable RelevanceModifierCollection relevanceModifiers;
    public @Nullable FilterCollection filters;
    public @Nullable SearchIndexSelector indexSelector;
    public @Nullable FilterCollection postFilters;
    public @Nullable Language getLanguage()
    {
        return this.language;
    }
    public @Nullable Currency getCurrency()
    {
        return this.currency;
    }
    public @Nullable User getUser()
    {
        return this.user;
    }
    public @Nullable String getDisplayedAtLocation()
    {
        return this.displayedAtLocation;
    }
    public @Nullable RelevanceModifierCollection getRelevanceModifiers()
    {
        return this.relevanceModifiers;
    }
    public @Nullable FilterCollection getFilters()
    {
        return this.filters;
    }
    public @Nullable SearchIndexSelector getIndexSelector()
    {
        return this.indexSelector;
    }
    public @Nullable FilterCollection getPostFilters()
    {
        return this.postFilters;
    }
    public SearchRequest setLanguage(Language language)
    {
        this.language = language;
        return this;
    }
    public SearchRequest setCurrency(Currency currency)
    {
        this.currency = currency;
        return this;
    }
    public SearchRequest setUser(User user)
    {
        this.user = user;
        return this;
    }
    public SearchRequest setDisplayedAtLocation(String displayedAtLocation)
    {
        this.displayedAtLocation = displayedAtLocation;
        return this;
    }
    public SearchRequest setRelevanceModifiers(RelevanceModifierCollection relevanceModifiers)
    {
        this.relevanceModifiers = relevanceModifiers;
        return this;
    }
    public SearchRequest setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
    public SearchRequest setIndexSelector(SearchIndexSelector indexSelector)
    {
        this.indexSelector = indexSelector;
        return this;
    }
    public SearchRequest setPostFilters(FilterCollection postFilters)
    {
        this.postFilters = postFilters;
        return this;
    }
}

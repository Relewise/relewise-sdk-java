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
    defaultImpl = ProductSearchRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductSearchRequest extends PaginatedSearchRequest implements IUserIdentifier
{
    public String $type = "Relewise.Client.Requests.Search.ProductSearchRequest, Relewise.Client";
    public @Nullable String term;
    public @Nullable ProductFacetQuery facets;
    public @Nullable ProductSearchSettings settings;
    public @Nullable ProductSortBySpecification sorting;
    public @Nullable RetailMediaQuery retailMedia;
    public static ProductSearchRequest create(@Nullable Language language, @Nullable Currency currency, @Nullable SearchIndexSelector indexSelector, User user, String displayedAtLocation, @Nullable String term, Integer skip, Integer take)
    {
        return new ProductSearchRequest(language, currency, indexSelector, user, displayedAtLocation, term, skip, take);
    }
    public ProductSearchRequest(@Nullable Language language, @Nullable Currency currency, @Nullable SearchIndexSelector indexSelector, User user, String displayedAtLocation, @Nullable String term, Integer skip, Integer take)
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
    public static ProductSearchRequest create(@Nullable Language language, @Nullable Currency currency, User user, String displayedAtLocation, @Nullable String term, Integer skip, Integer take)
    {
        return new ProductSearchRequest(language, currency, user, displayedAtLocation, term, skip, take);
    }
    public ProductSearchRequest(@Nullable Language language, @Nullable Currency currency, User user, String displayedAtLocation, @Nullable String term, Integer skip, Integer take)
    {
        this.language = language;
        this.currency = currency;
        this.user = user;
        this.displayedAtLocation = displayedAtLocation;
        this.term = term;
        this.skip = skip;
        this.take = take;
    }
    public ProductSearchRequest()
    {
    }
    public @Nullable String getTerm()
    {
        return this.term;
    }
    public @Nullable ProductFacetQuery getFacets()
    {
        return this.facets;
    }
    public @Nullable ProductSearchSettings getSettings()
    {
        return this.settings;
    }
    public @Nullable ProductSortBySpecification getSorting()
    {
        return this.sorting;
    }
    public @Nullable RetailMediaQuery getRetailMedia()
    {
        return this.retailMedia;
    }
    public ProductSearchRequest setTerm(@Nullable String term)
    {
        this.term = term;
        return this;
    }
    public ProductSearchRequest setFacets(@Nullable ProductFacetQuery facets)
    {
        this.facets = facets;
        return this;
    }
    public ProductSearchRequest setSettings(@Nullable ProductSearchSettings settings)
    {
        this.settings = settings;
        return this;
    }
    public ProductSearchRequest setSorting(@Nullable ProductSortBySpecification sorting)
    {
        this.sorting = sorting;
        return this;
    }
    public ProductSearchRequest setRetailMedia(@Nullable RetailMediaQuery retailMedia)
    {
        this.retailMedia = retailMedia;
        return this;
    }
    @Override
    public ProductSearchRequest setSkip(Integer skip)
    {
        this.skip = skip;
        return this;
    }
    @Override
    public ProductSearchRequest setTake(Integer take)
    {
        this.take = take;
        return this;
    }
    @Override
    public ProductSearchRequest setLanguage(@Nullable Language language)
    {
        this.language = language;
        return this;
    }
    @Override
    public ProductSearchRequest setCurrency(@Nullable Currency currency)
    {
        this.currency = currency;
        return this;
    }
    @Override
    public ProductSearchRequest setUser(@Nullable User user)
    {
        this.user = user;
        return this;
    }
    @Override
    public ProductSearchRequest setDisplayedAtLocation(@Nullable String displayedAtLocation)
    {
        this.displayedAtLocation = displayedAtLocation;
        return this;
    }
    @Override
    public ProductSearchRequest setRelevanceModifiers(@Nullable RelevanceModifierCollection relevanceModifiers)
    {
        this.relevanceModifiers = relevanceModifiers;
        return this;
    }
    @Override
    public ProductSearchRequest setFilters(@Nullable FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
    @Override
    public ProductSearchRequest setIndexSelector(@Nullable SearchIndexSelector indexSelector)
    {
        this.indexSelector = indexSelector;
        return this;
    }
    @Override
    public ProductSearchRequest setPostFilters(@Nullable FilterCollection postFilters)
    {
        this.postFilters = postFilters;
        return this;
    }
    /** @deprecated Use User.Channel instead. */
    @Override
    public ProductSearchRequest setChannel(@Nullable Channel channel)
    {
        this.channel = channel;
        return this;
    }
}

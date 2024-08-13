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
    defaultImpl = ProductCategorySearchRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductCategorySearchRequest extends PaginatedSearchRequest implements IUserIdentifier
{
    public String $type = "Relewise.Client.Requests.Search.ProductCategorySearchRequest, Relewise.Client";
    public @Nullable String term;
    public @Nullable ProductCategorySearchSettings settings;
    public @Nullable ProductCategoryFacetQuery facets;
    public @Nullable ProductCategorySortBySpecification sorting;
    public static ProductCategorySearchRequest create(@Nullable Language language, @Nullable Currency currency, @Nullable SearchIndexSelector indexSelector, User user, String displayedAtLocation, @Nullable String term, Integer skip, Integer take)
    {
        return new ProductCategorySearchRequest(language, currency, indexSelector, user, displayedAtLocation, term, skip, take);
    }
    public ProductCategorySearchRequest(@Nullable Language language, @Nullable Currency currency, @Nullable SearchIndexSelector indexSelector, User user, String displayedAtLocation, @Nullable String term, Integer skip, Integer take)
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
    public static ProductCategorySearchRequest create(@Nullable Language language, @Nullable Currency currency, User user, String displayedAtLocation, @Nullable String term, Integer skip, Integer take)
    {
        return new ProductCategorySearchRequest(language, currency, user, displayedAtLocation, term, skip, take);
    }
    public ProductCategorySearchRequest(@Nullable Language language, @Nullable Currency currency, User user, String displayedAtLocation, @Nullable String term, Integer skip, Integer take)
    {
        this.language = language;
        this.currency = currency;
        this.user = user;
        this.displayedAtLocation = displayedAtLocation;
        this.term = term;
        this.skip = skip;
        this.take = take;
    }
    public ProductCategorySearchRequest()
    {
    }
    public @Nullable String getTerm()
    {
        return this.term;
    }
    public @Nullable ProductCategorySearchSettings getSettings()
    {
        return this.settings;
    }
    public @Nullable ProductCategoryFacetQuery getFacets()
    {
        return this.facets;
    }
    public @Nullable ProductCategorySortBySpecification getSorting()
    {
        return this.sorting;
    }
    public ProductCategorySearchRequest setTerm(String term)
    {
        this.term = term;
        return this;
    }
    public ProductCategorySearchRequest setSettings(ProductCategorySearchSettings settings)
    {
        this.settings = settings;
        return this;
    }
    public ProductCategorySearchRequest setFacets(ProductCategoryFacetQuery facets)
    {
        this.facets = facets;
        return this;
    }
    public ProductCategorySearchRequest setSorting(ProductCategorySortBySpecification sorting)
    {
        this.sorting = sorting;
        return this;
    }
    @Override
    public ProductCategorySearchRequest setSkip(Integer skip)
    {
        this.skip = skip;
        return this;
    }
    @Override
    public ProductCategorySearchRequest setTake(Integer take)
    {
        this.take = take;
        return this;
    }
    @Override
    public ProductCategorySearchRequest setLanguage(Language language)
    {
        this.language = language;
        return this;
    }
    @Override
    public ProductCategorySearchRequest setCurrency(Currency currency)
    {
        this.currency = currency;
        return this;
    }
    @Override
    public ProductCategorySearchRequest setUser(User user)
    {
        this.user = user;
        return this;
    }
    @Override
    public ProductCategorySearchRequest setDisplayedAtLocation(String displayedAtLocation)
    {
        this.displayedAtLocation = displayedAtLocation;
        return this;
    }
    @Override
    public ProductCategorySearchRequest setRelevanceModifiers(RelevanceModifierCollection relevanceModifiers)
    {
        this.relevanceModifiers = relevanceModifiers;
        return this;
    }
    @Override
    public ProductCategorySearchRequest setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
    @Override
    public ProductCategorySearchRequest setIndexSelector(SearchIndexSelector indexSelector)
    {
        this.indexSelector = indexSelector;
        return this;
    }
    @Override
    public ProductCategorySearchRequest setPostFilters(FilterCollection postFilters)
    {
        this.postFilters = postFilters;
        return this;
    }
    /** @deprecated Use User.Channel instead. */
    @Override
    public ProductCategorySearchRequest setChannel(Channel channel)
    {
        this.channel = channel;
        return this;
    }
}

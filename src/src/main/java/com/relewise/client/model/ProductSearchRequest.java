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
    defaultImpl = ProductSearchRequest.class)
public class ProductSearchRequest extends PaginatedSearchRequest implements IUserIdentifier
{
    public String $type = "Relewise.Client.Requests.Search.ProductSearchRequest, Relewise.Client";
    public @Nullable String term;
    public @Nullable ProductFacetQuery facets;
    public @Nullable ProductSearchSettings settings;
    public @Nullable ProductSortBySpecification sorting;
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
    public ProductSearchRequest setTerm(String term)
    {
        this.term = term;;
        return this;
    }
    public ProductSearchRequest setFacets(ProductFacetQuery facets)
    {
        this.facets = facets;;
        return this;
    }
    public ProductSearchRequest setSettings(ProductSearchSettings settings)
    {
        this.settings = settings;;
        return this;
    }
    public ProductSearchRequest setSorting(ProductSortBySpecification sorting)
    {
        this.sorting = sorting;;
        return this;
    }
    @Override
    public ProductSearchRequest setSkip(Integer skip)
    {
        this.skip = skip;;
        return this;
    }
    @Override
    public ProductSearchRequest setTake(Integer take)
    {
        this.take = take;;
        return this;
    }
    @Override
    public ProductSearchRequest setLanguage(Language language)
    {
        this.language = language;;
        return this;
    }
    @Override
    public ProductSearchRequest setCurrency(Currency currency)
    {
        this.currency = currency;;
        return this;
    }
    @Override
    public ProductSearchRequest setUser(User user)
    {
        this.user = user;;
        return this;
    }
    @Override
    public ProductSearchRequest setDisplayedAtLocation(String displayedAtLocation)
    {
        this.displayedAtLocation = displayedAtLocation;;
        return this;
    }
    @Override
    public ProductSearchRequest setRelevanceModifiers(RelevanceModifierCollection relevanceModifiers)
    {
        this.relevanceModifiers = relevanceModifiers;;
        return this;
    }
    @Override
    public ProductSearchRequest setFilters(FilterCollection filters)
    {
        this.filters = filters;;
        return this;
    }
    @Override
    public ProductSearchRequest setIndexSelector(SearchIndexSelector indexSelector)
    {
        this.indexSelector = indexSelector;;
        return this;
    }
    @Override
    public ProductSearchRequest setPostFilters(FilterCollection postFilters)
    {
        this.postFilters = postFilters;;
        return this;
    }
}

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
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class PaginatedSearchRequest extends SearchRequest implements IUserIdentifier
{
    public String $type = "";
    public Integer skip;
    public Integer take;
    public Integer getSkip()
    {
        return this.skip;
    }
    public Integer getTake()
    {
        return this.take;
    }
    public PaginatedSearchRequest setSkip(Integer skip)
    {
        this.skip = skip;
        return this;
    }
    public PaginatedSearchRequest setTake(Integer take)
    {
        this.take = take;
        return this;
    }
    @Override
    public PaginatedSearchRequest setLanguage(Language language)
    {
        this.language = language;
        return this;
    }
    @Override
    public PaginatedSearchRequest setCurrency(Currency currency)
    {
        this.currency = currency;
        return this;
    }
    @Override
    public PaginatedSearchRequest setUser(User user)
    {
        this.user = user;
        return this;
    }
    @Override
    public PaginatedSearchRequest setDisplayedAtLocation(String displayedAtLocation)
    {
        this.displayedAtLocation = displayedAtLocation;
        return this;
    }
    @Override
    public PaginatedSearchRequest setRelevanceModifiers(RelevanceModifierCollection relevanceModifiers)
    {
        this.relevanceModifiers = relevanceModifiers;
        return this;
    }
    @Override
    public PaginatedSearchRequest setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
    @Override
    public PaginatedSearchRequest setIndexSelector(SearchIndexSelector indexSelector)
    {
        this.indexSelector = indexSelector;
        return this;
    }
    @Override
    public PaginatedSearchRequest setPostFilters(FilterCollection postFilters)
    {
        this.postFilters = postFilters;
        return this;
    }
}

package com.relewise.client.model;

import com.fasterxml.jackson.annotation.*;
import javax.annotation.Nullable;
import java.io.IOException;
import java.time.Duration;
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
    defaultImpl = ContentCategorySearchRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentCategorySearchRequest extends PaginatedSearchRequest implements IUserIdentifier
{
    public String $type = "Relewise.Client.Requests.Search.ContentCategorySearchRequest, Relewise.Client";
    public String term;
    public @Nullable ContentCategorySearchSettings settings;
    public static ContentCategorySearchRequest create(@Nullable Language language, @Nullable Currency currency, @Nullable SearchIndexSelector indexSelector, User user, String displayedAtLocation, String term, Integer skip, Integer take)
    {
        return new ContentCategorySearchRequest(language, currency, indexSelector, user, displayedAtLocation, term, skip, take);
    }
    public ContentCategorySearchRequest(@Nullable Language language, @Nullable Currency currency, @Nullable SearchIndexSelector indexSelector, User user, String displayedAtLocation, String term, Integer skip, Integer take)
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
    public static ContentCategorySearchRequest create(@Nullable Language language, @Nullable Currency currency, User user, String displayedAtLocation, String term, Integer skip, Integer take)
    {
        return new ContentCategorySearchRequest(language, currency, user, displayedAtLocation, term, skip, take);
    }
    public ContentCategorySearchRequest(@Nullable Language language, @Nullable Currency currency, User user, String displayedAtLocation, String term, Integer skip, Integer take)
    {
        this.language = language;
        this.currency = currency;
        this.user = user;
        this.displayedAtLocation = displayedAtLocation;
        this.term = term;
        this.skip = skip;
        this.take = take;
    }
    public ContentCategorySearchRequest()
    {
    }
    public String getTerm()
    {
        return this.term;
    }
    public @Nullable ContentCategorySearchSettings getSettings()
    {
        return this.settings;
    }
    public ContentCategorySearchRequest setTerm(String term)
    {
        this.term = term;
        return this;
    }
    public ContentCategorySearchRequest setSettings(@Nullable ContentCategorySearchSettings settings)
    {
        this.settings = settings;
        return this;
    }
    @Override
    public ContentCategorySearchRequest setSkip(Integer skip)
    {
        this.skip = skip;
        return this;
    }
    @Override
    public ContentCategorySearchRequest setTake(Integer take)
    {
        this.take = take;
        return this;
    }
    @Override
    public ContentCategorySearchRequest setLanguage(@Nullable Language language)
    {
        this.language = language;
        return this;
    }
    @Override
    public ContentCategorySearchRequest setCurrency(@Nullable Currency currency)
    {
        this.currency = currency;
        return this;
    }
    @Override
    public ContentCategorySearchRequest setUser(@Nullable User user)
    {
        this.user = user;
        return this;
    }
    @Override
    public ContentCategorySearchRequest setDisplayedAtLocation(@Nullable String displayedAtLocation)
    {
        this.displayedAtLocation = displayedAtLocation;
        return this;
    }
    @Override
    public ContentCategorySearchRequest setRelevanceModifiers(@Nullable RelevanceModifierCollection relevanceModifiers)
    {
        this.relevanceModifiers = relevanceModifiers;
        return this;
    }
    @Override
    public ContentCategorySearchRequest setFilters(@Nullable FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
    @Override
    public ContentCategorySearchRequest setIndexSelector(@Nullable SearchIndexSelector indexSelector)
    {
        this.indexSelector = indexSelector;
        return this;
    }
    @Override
    public ContentCategorySearchRequest setPostFilters(@Nullable FilterCollection postFilters)
    {
        this.postFilters = postFilters;
        return this;
    }
    /** @deprecated Use User.Channel instead. */
    @Override
    public ContentCategorySearchRequest setChannel(@Nullable Channel channel)
    {
        this.channel = channel;
        return this;
    }
}

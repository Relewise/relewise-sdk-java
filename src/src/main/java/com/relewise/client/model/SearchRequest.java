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
    
/** The search request shape establishes language-currency context with search filters, optional user info. Defines <code>Language</code>. <code>Currency</code> pair, as well as <code>Filters</code> (both <code>PostFilters</code>). Products search is done through - <code>ProductSearchRequest</code> Content search is done through - <code>ContentSearchRequest</code> Search term prediction is done through - <code>SearchTermPredictionRequest</code> */
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
public abstract class SearchRequest extends LicensedRequest implements IUserIdentifier, IHaveCurrencyLanguage
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
    /** @deprecated Use User.Channel instead. */
    public @Nullable Channel channel;
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
    /** @deprecated Use User.Channel instead. */
    public @Nullable Channel getChannel()
    {
        return this.channel;
    }
    public SearchRequest setLanguage(@Nullable Language language)
    {
        this.language = language;
        return this;
    }
    public SearchRequest setCurrency(@Nullable Currency currency)
    {
        this.currency = currency;
        return this;
    }
    public SearchRequest setUser(@Nullable User user)
    {
        this.user = user;
        return this;
    }
    public SearchRequest setDisplayedAtLocation(@Nullable String displayedAtLocation)
    {
        this.displayedAtLocation = displayedAtLocation;
        return this;
    }
    public SearchRequest setRelevanceModifiers(@Nullable RelevanceModifierCollection relevanceModifiers)
    {
        this.relevanceModifiers = relevanceModifiers;
        return this;
    }
    public SearchRequest setFilters(@Nullable FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
    public SearchRequest setIndexSelector(@Nullable SearchIndexSelector indexSelector)
    {
        this.indexSelector = indexSelector;
        return this;
    }
    public SearchRequest setPostFilters(@Nullable FilterCollection postFilters)
    {
        this.postFilters = postFilters;
        return this;
    }
    /** @deprecated Use User.Channel instead. */
    public SearchRequest setChannel(@Nullable Channel channel)
    {
        this.channel = channel;
        return this;
    }
}

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
    
/** Used to initialize a feed recommendation for a user (including anonymous ones). Once initialized, additional pages for the feed can be requested using the lightweight <code>FeedRecommendationNextItemsRequest</code>. You may specify any global filters or relevance modifiers that should apply to the entire feed, such as filtering out products that are not in stock, or relevance modifiers that should apply to all products in the feed. Individual <code>FeedComposition</code> instances can also specify their own additional filters and relevance modifiers, which will be applied only to the elements in that specific composition element. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = FeedRecommendationInitializationRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FeedRecommendationInitializationRequest extends RecommendationRequest implements IUserIdentifier
{
    public String $type = "Relewise.Client.Requests.Recommendations.Feed.FeedRecommendationInitializationRequest, Relewise.Client";
    /** Defines the settings for the feed recommendation, including page size, seed settings, composition of entities, selected properties for products, variants and content. */
    public Feed feed;
    /**
     * Initializes a new instance of the <code>FeedRecommendationInitializationRequest</code> class.
     * @param language The language to return results in.
     * @param currency The currency to return results for.
     * @param displayedAtLocationType A short name describing the type of page or location where you intend to show the results from this recommendation request, e.g., "Product details page", "Front page", "Cart page", etc.
     * @param user The user performing the request, or User.Anonymous(...).
     * @param feed The settings determining how the feed will be composed, filtered, page size, seed, etc.
     */
    public static FeedRecommendationInitializationRequest create(@Nullable Language language, @Nullable Currency currency, String displayedAtLocationType, User user, Feed feed)
    {
        return new FeedRecommendationInitializationRequest(language, currency, displayedAtLocationType, user, feed);
    }
    /**
     * Initializes a new instance of the <code>FeedRecommendationInitializationRequest</code> class.
     * @param language The language to return results in.
     * @param currency The currency to return results for.
     * @param displayedAtLocationType A short name describing the type of page or location where you intend to show the results from this recommendation request, e.g., "Product details page", "Front page", "Cart page", etc.
     * @param user The user performing the request, or User.Anonymous(...).
     * @param feed The settings determining how the feed will be composed, filtered, page size, seed, etc.
     */
    public FeedRecommendationInitializationRequest(@Nullable Language language, @Nullable Currency currency, String displayedAtLocationType, User user, Feed feed)
    {
        this.language = language;
        this.currency = currency;
        this.displayedAtLocationType = displayedAtLocationType;
        this.user = user;
        this.feed = feed;
    }
    public FeedRecommendationInitializationRequest()
    {
    }
    /** Defines the settings for the feed recommendation, including page size, seed settings, composition of entities, selected properties for products, variants and content. */
    public Feed getFeed()
    {
        return this.feed;
    }
    /** Defines the settings for the feed recommendation, including page size, seed settings, composition of entities, selected properties for products, variants and content. */
    public FeedRecommendationInitializationRequest setFeed(Feed feed)
    {
        this.feed = feed;
        return this;
    }
    @Override
    public FeedRecommendationInitializationRequest setLanguage(@Nullable Language language)
    {
        this.language = language;
        return this;
    }
    @Override
    public FeedRecommendationInitializationRequest setUser(@Nullable User user)
    {
        this.user = user;
        return this;
    }
    @Override
    public FeedRecommendationInitializationRequest setRelevanceModifiers(RelevanceModifierCollection relevanceModifiers)
    {
        this.relevanceModifiers = relevanceModifiers;
        return this;
    }
    @Override
    public FeedRecommendationInitializationRequest setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
    @Override
    public FeedRecommendationInitializationRequest setDisplayedAtLocationType(String displayedAtLocationType)
    {
        this.displayedAtLocationType = displayedAtLocationType;
        return this;
    }
    @Override
    public FeedRecommendationInitializationRequest setCurrency(@Nullable Currency currency)
    {
        this.currency = currency;
        return this;
    }
    /** @deprecated Use User.Channel instead. */
    @Override
    public FeedRecommendationInitializationRequest setChannel(@Nullable Channel channel)
    {
        this.channel = channel;
        return this;
    }
}

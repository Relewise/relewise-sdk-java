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
    defaultImpl = RecentlyViewedProductsRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RecentlyViewedProductsRequest extends ProductRecommendationRequest implements IUserIdentifier, IHaveCurrencyLanguage
{
    public String $type = "Relewise.Client.Requests.Recommendations.RecentlyViewedProductsRequest, Relewise.Client";
    public static RecentlyViewedProductsRequest create(@Nullable Language language, @Nullable Currency currency, String displayedAtLocationType, User user)
    {
        return new RecentlyViewedProductsRequest(language, currency, displayedAtLocationType, user);
    }
    public RecentlyViewedProductsRequest(@Nullable Language language, @Nullable Currency currency, String displayedAtLocationType, User user)
    {
        this.language = language;
        this.currency = currency;
        this.displayedAtLocationType = displayedAtLocationType;
        this.user = user;
    }
    public RecentlyViewedProductsRequest()
    {
    }
    @Override
    public RecentlyViewedProductsRequest setSettings(ProductRecommendationRequestSettings settings)
    {
        this.settings = settings;
        return this;
    }
    @Override
    public RecentlyViewedProductsRequest setLanguage(@Nullable Language language)
    {
        this.language = language;
        return this;
    }
    @Override
    public RecentlyViewedProductsRequest setUser(@Nullable User user)
    {
        this.user = user;
        return this;
    }
    @Override
    public RecentlyViewedProductsRequest setRelevanceModifiers(RelevanceModifierCollection relevanceModifiers)
    {
        this.relevanceModifiers = relevanceModifiers;
        return this;
    }
    @Override
    public RecentlyViewedProductsRequest setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
    @Override
    public RecentlyViewedProductsRequest setDisplayedAtLocationType(String displayedAtLocationType)
    {
        this.displayedAtLocationType = displayedAtLocationType;
        return this;
    }
    @Override
    public RecentlyViewedProductsRequest setCurrency(@Nullable Currency currency)
    {
        this.currency = currency;
        return this;
    }
    /** @deprecated Use User.Channel instead. */
    @Override
    public RecentlyViewedProductsRequest setChannel(@Nullable Channel channel)
    {
        this.channel = channel;
        return this;
    }
}

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
    defaultImpl = ContentsViewedAfterViewingProductRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentsViewedAfterViewingProductRequest extends ContentRecommendationRequest implements IUserIdentifier
{
    public String $type = "Relewise.Client.Requests.Recommendations.ContentsViewedAfterViewingProductRequest, Relewise.Client";
    public ProductAndVariantId productAndVariantId;
    public static ContentsViewedAfterViewingProductRequest create(@Nullable Language language, @Nullable Currency currency, String displayedAtLocationType, User user, ProductAndVariantId productAndVariantId)
    {
        return new ContentsViewedAfterViewingProductRequest(language, currency, displayedAtLocationType, user, productAndVariantId);
    }
    public ContentsViewedAfterViewingProductRequest(@Nullable Language language, @Nullable Currency currency, String displayedAtLocationType, User user, ProductAndVariantId productAndVariantId)
    {
        this.language = language;
        this.currency = currency;
        this.displayedAtLocationType = displayedAtLocationType;
        this.user = user;
        this.productAndVariantId = productAndVariantId;
    }
    public ContentsViewedAfterViewingProductRequest()
    {
    }
    public ProductAndVariantId getProductAndVariantId()
    {
        return this.productAndVariantId;
    }
    public ContentsViewedAfterViewingProductRequest setProductAndVariantId(ProductAndVariantId productAndVariantId)
    {
        this.productAndVariantId = productAndVariantId;
        return this;
    }
    @Override
    public ContentsViewedAfterViewingProductRequest setSettings(ContentRecommendationRequestSettings settings)
    {
        this.settings = settings;
        return this;
    }
    @Override
    public ContentsViewedAfterViewingProductRequest setLanguage(Language language)
    {
        this.language = language;
        return this;
    }
    @Override
    public ContentsViewedAfterViewingProductRequest setUser(User user)
    {
        this.user = user;
        return this;
    }
    @Override
    public ContentsViewedAfterViewingProductRequest setRelevanceModifiers(RelevanceModifierCollection relevanceModifiers)
    {
        this.relevanceModifiers = relevanceModifiers;
        return this;
    }
    @Override
    public ContentsViewedAfterViewingProductRequest setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
    @Override
    public ContentsViewedAfterViewingProductRequest setDisplayedAtLocationType(String displayedAtLocationType)
    {
        this.displayedAtLocationType = displayedAtLocationType;
        return this;
    }
    @Override
    public ContentsViewedAfterViewingProductRequest setCurrency(Currency currency)
    {
        this.currency = currency;
        return this;
    }
    /** @deprecated Use User.Channel instead. */
    @Override
    public ContentsViewedAfterViewingProductRequest setChannel(Channel channel)
    {
        this.channel = channel;
        return this;
    }
}

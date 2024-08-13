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
    defaultImpl = ProductsViewedAfterViewingContentRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductsViewedAfterViewingContentRequest extends ProductRecommendationRequest implements IUserIdentifier
{
    public String $type = "Relewise.Client.Requests.Recommendations.ProductsViewedAfterViewingContentRequest, Relewise.Client";
    public String contentId;
    public static ProductsViewedAfterViewingContentRequest create(@Nullable Language language, @Nullable Currency currency, String displayedAtLocationType, User user, String contentId)
    {
        return new ProductsViewedAfterViewingContentRequest(language, currency, displayedAtLocationType, user, contentId);
    }
    public ProductsViewedAfterViewingContentRequest(@Nullable Language language, @Nullable Currency currency, String displayedAtLocationType, User user, String contentId)
    {
        this.language = language;
        this.currency = currency;
        this.displayedAtLocationType = displayedAtLocationType;
        this.user = user;
        this.contentId = contentId;
    }
    public ProductsViewedAfterViewingContentRequest()
    {
    }
    public String getContentId()
    {
        return this.contentId;
    }
    public ProductsViewedAfterViewingContentRequest setContentId(String contentId)
    {
        this.contentId = contentId;
        return this;
    }
    @Override
    public ProductsViewedAfterViewingContentRequest setSettings(ProductRecommendationRequestSettings settings)
    {
        this.settings = settings;
        return this;
    }
    @Override
    public ProductsViewedAfterViewingContentRequest setLanguage(Language language)
    {
        this.language = language;
        return this;
    }
    @Override
    public ProductsViewedAfterViewingContentRequest setUser(User user)
    {
        this.user = user;
        return this;
    }
    @Override
    public ProductsViewedAfterViewingContentRequest setRelevanceModifiers(RelevanceModifierCollection relevanceModifiers)
    {
        this.relevanceModifiers = relevanceModifiers;
        return this;
    }
    @Override
    public ProductsViewedAfterViewingContentRequest setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
    @Override
    public ProductsViewedAfterViewingContentRequest setDisplayedAtLocationType(String displayedAtLocationType)
    {
        this.displayedAtLocationType = displayedAtLocationType;
        return this;
    }
    @Override
    public ProductsViewedAfterViewingContentRequest setCurrency(Currency currency)
    {
        this.currency = currency;
        return this;
    }
}

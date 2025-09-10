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
    defaultImpl = ProductsViewedAfterViewingProductRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductsViewedAfterViewingProductRequest extends ProductRecommendationRequest implements IUserIdentifier
{
    public String $type = "Relewise.Client.Requests.Recommendations.ProductsViewedAfterViewingProductRequest, Relewise.Client";
    public ProductAndVariantId productAndVariantId;
    public static ProductsViewedAfterViewingProductRequest create(@Nullable Language language, @Nullable Currency currency, String displayedAtLocationType, User user, ProductAndVariantId productAndVariantId)
    {
        return new ProductsViewedAfterViewingProductRequest(language, currency, displayedAtLocationType, user, productAndVariantId);
    }
    public ProductsViewedAfterViewingProductRequest(@Nullable Language language, @Nullable Currency currency, String displayedAtLocationType, User user, ProductAndVariantId productAndVariantId)
    {
        this.language = language;
        this.currency = currency;
        this.displayedAtLocationType = displayedAtLocationType;
        this.user = user;
        this.productAndVariantId = productAndVariantId;
    }
    public ProductsViewedAfterViewingProductRequest()
    {
    }
    public ProductAndVariantId getProductAndVariantId()
    {
        return this.productAndVariantId;
    }
    public ProductsViewedAfterViewingProductRequest setProductAndVariantId(ProductAndVariantId productAndVariantId)
    {
        this.productAndVariantId = productAndVariantId;
        return this;
    }
    @Override
    public ProductsViewedAfterViewingProductRequest setSettings(ProductRecommendationRequestSettings settings)
    {
        this.settings = settings;
        return this;
    }
    @Override
    public ProductsViewedAfterViewingProductRequest setLanguage(@Nullable Language language)
    {
        this.language = language;
        return this;
    }
    @Override
    public ProductsViewedAfterViewingProductRequest setUser(@Nullable User user)
    {
        this.user = user;
        return this;
    }
    @Override
    public ProductsViewedAfterViewingProductRequest setRelevanceModifiers(RelevanceModifierCollection relevanceModifiers)
    {
        this.relevanceModifiers = relevanceModifiers;
        return this;
    }
    @Override
    public ProductsViewedAfterViewingProductRequest setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
    @Override
    public ProductsViewedAfterViewingProductRequest setDisplayedAtLocationType(String displayedAtLocationType)
    {
        this.displayedAtLocationType = displayedAtLocationType;
        return this;
    }
    @Override
    public ProductsViewedAfterViewingProductRequest setCurrency(@Nullable Currency currency)
    {
        this.currency = currency;
        return this;
    }
    /** @deprecated Use User.Channel instead. */
    @Override
    public ProductsViewedAfterViewingProductRequest setChannel(@Nullable Channel channel)
    {
        this.channel = channel;
        return this;
    }
}

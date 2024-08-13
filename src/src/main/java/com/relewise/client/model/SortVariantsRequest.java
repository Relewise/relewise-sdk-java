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
    defaultImpl = SortVariantsRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SortVariantsRequest extends ProductRecommendationRequest implements IUserIdentifier
{
    public String $type = "Relewise.Client.Requests.Recommendations.SortVariantsRequest, Relewise.Client";
    public String productId;
    public static SortVariantsRequest create(@Nullable Language language, @Nullable Currency currency, String displayedAtLocationType, User user, String productId)
    {
        return new SortVariantsRequest(language, currency, displayedAtLocationType, user, productId);
    }
    public SortVariantsRequest(@Nullable Language language, @Nullable Currency currency, String displayedAtLocationType, User user, String productId)
    {
        this.language = language;
        this.currency = currency;
        this.displayedAtLocationType = displayedAtLocationType;
        this.user = user;
        this.productId = productId;
    }
    public SortVariantsRequest()
    {
    }
    public String getProductId()
    {
        return this.productId;
    }
    public SortVariantsRequest setProductId(String productId)
    {
        this.productId = productId;
        return this;
    }
    @Override
    public SortVariantsRequest setSettings(ProductRecommendationRequestSettings settings)
    {
        this.settings = settings;
        return this;
    }
    @Override
    public SortVariantsRequest setLanguage(@Nullable Language language)
    {
        this.language = language;
        return this;
    }
    @Override
    public SortVariantsRequest setUser(@Nullable User user)
    {
        this.user = user;
        return this;
    }
    @Override
    public SortVariantsRequest setRelevanceModifiers(RelevanceModifierCollection relevanceModifiers)
    {
        this.relevanceModifiers = relevanceModifiers;
        return this;
    }
    @Override
    public SortVariantsRequest setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
    @Override
    public SortVariantsRequest setDisplayedAtLocationType(String displayedAtLocationType)
    {
        this.displayedAtLocationType = displayedAtLocationType;
        return this;
    }
    @Override
    public SortVariantsRequest setCurrency(@Nullable Currency currency)
    {
        this.currency = currency;
        return this;
    }
    /** @deprecated Use User.Channel instead. */
    @Override
    public SortVariantsRequest setChannel(@Nullable Channel channel)
    {
        this.channel = channel;
        return this;
    }
}

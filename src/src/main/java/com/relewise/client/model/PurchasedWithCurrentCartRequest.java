package com.relewise.client.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
    defaultImpl = PurchasedWithCurrentCartRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PurchasedWithCurrentCartRequest extends ProductRecommendationRequest implements IUserIdentifier
{
    public String $type = "Relewise.Client.Requests.Recommendations.PurchasedWithCurrentCartRequest, Relewise.Client";
    public static PurchasedWithCurrentCartRequest create(@Nullable Language language, @Nullable Currency currency, String displayedAtLocationType, User user)
    {
        return new PurchasedWithCurrentCartRequest(language, currency, displayedAtLocationType, user);
    }
    public PurchasedWithCurrentCartRequest(@Nullable Language language, @Nullable Currency currency, String displayedAtLocationType, User user)
    {
        this.language = language;
        this.currency = currency;
        this.displayedAtLocationType = displayedAtLocationType;
        this.user = user;
    }
    public PurchasedWithCurrentCartRequest()
    {
    }
    @Override
    public PurchasedWithCurrentCartRequest setSettings(ProductRecommendationRequestSettings settings)
    {
        this.settings = settings;
        return this;
    }
    @Override
    public PurchasedWithCurrentCartRequest setLanguage(Language language)
    {
        this.language = language;
        return this;
    }
    @Override
    public PurchasedWithCurrentCartRequest setUser(User user)
    {
        this.user = user;
        return this;
    }
    @Override
    public PurchasedWithCurrentCartRequest setRelevanceModifiers(RelevanceModifierCollection relevanceModifiers)
    {
        this.relevanceModifiers = relevanceModifiers;
        return this;
    }
    @Override
    public PurchasedWithCurrentCartRequest setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
    @Override
    public PurchasedWithCurrentCartRequest setDisplayedAtLocationType(String displayedAtLocationType)
    {
        this.displayedAtLocationType = displayedAtLocationType;
        return this;
    }
    @Override
    public PurchasedWithCurrentCartRequest setCurrency(Currency currency)
    {
        this.currency = currency;
        return this;
    }
}

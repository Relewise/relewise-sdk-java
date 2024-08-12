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
    defaultImpl = PopularProductsRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PopularProductsRequest extends ProductRecommendationRequest implements IUserIdentifier
{
    public String $type = "Relewise.Client.Requests.Recommendations.PopularProductsRequest, Relewise.Client";
    public PopularityTypes basedOn;
    public Integer sinceMinutesAgo;
    public static PopularProductsRequest create(@Nullable Language language, @Nullable Currency currency, String displayedAtLocationType, User user, PopularityTypes basedOn, Integer sinceMinutesAgo)
    {
        return new PopularProductsRequest(language, currency, displayedAtLocationType, user, basedOn, sinceMinutesAgo);
    }
    public PopularProductsRequest(@Nullable Language language, @Nullable Currency currency, String displayedAtLocationType, User user, PopularityTypes basedOn, Integer sinceMinutesAgo)
    {
        this.language = language;
        this.currency = currency;
        this.displayedAtLocationType = displayedAtLocationType;
        this.user = user;
        this.basedOn = basedOn;
        this.sinceMinutesAgo = sinceMinutesAgo;
    }
    public PopularProductsRequest()
    {
    }
    public PopularityTypes getBasedOn()
    {
        return this.basedOn;
    }
    public Integer getSinceMinutesAgo()
    {
        return this.sinceMinutesAgo;
    }
    public PopularProductsRequest setBasedOn(PopularityTypes basedOn)
    {
        this.basedOn = basedOn;;
        return this;
    }
    public PopularProductsRequest setSinceMinutesAgo(Integer sinceMinutesAgo)
    {
        this.sinceMinutesAgo = sinceMinutesAgo;;
        return this;
    }
    @Override
    public PopularProductsRequest setSettings(ProductRecommendationRequestSettings settings)
    {
        this.settings = settings;;
        return this;
    }
    @Override
    public PopularProductsRequest setLanguage(Language language)
    {
        this.language = language;;
        return this;
    }
    @Override
    public PopularProductsRequest setUser(User user)
    {
        this.user = user;;
        return this;
    }
    @Override
    public PopularProductsRequest setRelevanceModifiers(RelevanceModifierCollection relevanceModifiers)
    {
        this.relevanceModifiers = relevanceModifiers;;
        return this;
    }
    @Override
    public PopularProductsRequest setFilters(FilterCollection filters)
    {
        this.filters = filters;;
        return this;
    }
    @Override
    public PopularProductsRequest setDisplayedAtLocationType(String displayedAtLocationType)
    {
        this.displayedAtLocationType = displayedAtLocationType;;
        return this;
    }
    @Override
    public PopularProductsRequest setCurrency(Currency currency)
    {
        this.currency = currency;;
        return this;
    }
}

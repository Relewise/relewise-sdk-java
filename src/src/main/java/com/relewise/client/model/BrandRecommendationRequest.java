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
    property = "$type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = PopularBrandsRecommendationRequest.class, name = "Relewise.Client.Requests.Recommendations.PopularBrandsRecommendationRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = PersonalBrandRecommendationRequest.class, name = "Relewise.Client.Requests.Recommendations.PersonalBrandRecommendationRequest, Relewise.Client"),
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class BrandRecommendationRequest extends RecommendationRequest implements IUserIdentifier
{
    public String $type = "";
    public BrandRecommendationRequestSettings settings;
    public BrandRecommendationRequestSettings getSettings()
    {
        return this.settings;
    }
    public BrandRecommendationRequest setSettings(BrandRecommendationRequestSettings settings)
    {
        this.settings = settings;
        return this;
    }
    @Override
    public BrandRecommendationRequest setLanguage(Language language)
    {
        this.language = language;
        return this;
    }
    @Override
    public BrandRecommendationRequest setUser(User user)
    {
        this.user = user;
        return this;
    }
    @Override
    public BrandRecommendationRequest setRelevanceModifiers(RelevanceModifierCollection relevanceModifiers)
    {
        this.relevanceModifiers = relevanceModifiers;
        return this;
    }
    @Override
    public BrandRecommendationRequest setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
    @Override
    public BrandRecommendationRequest setDisplayedAtLocationType(String displayedAtLocationType)
    {
        this.displayedAtLocationType = displayedAtLocationType;
        return this;
    }
    @Override
    public BrandRecommendationRequest setCurrency(Currency currency)
    {
        this.currency = currency;
        return this;
    }
    /** @deprecated Use User.Channel instead. */
    @Override
    public BrandRecommendationRequest setChannel(Channel channel)
    {
        this.channel = channel;
        return this;
    }
}

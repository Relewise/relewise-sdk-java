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
    defaultImpl = CustomProductRecommendationRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomProductRecommendationRequest extends ProductRecommendationRequest implements IUserIdentifier
{
    public String $type = "Relewise.Client.Requests.Recommendations.CustomProductRecommendationRequest, Relewise.Client";
    public String recommendationType;
    public @Nullable HashMap<String, String> parameters;
    public static CustomProductRecommendationRequest create(@Nullable Language language, @Nullable Currency currency, String displayedAtLocationType, User user, String recommendationType)
    {
        return new CustomProductRecommendationRequest(language, currency, displayedAtLocationType, user, recommendationType);
    }
    public CustomProductRecommendationRequest(@Nullable Language language, @Nullable Currency currency, String displayedAtLocationType, User user, String recommendationType)
    {
        this.language = language;
        this.currency = currency;
        this.displayedAtLocationType = displayedAtLocationType;
        this.user = user;
        this.recommendationType = recommendationType;
    }
    public CustomProductRecommendationRequest()
    {
    }
    public String getRecommendationType()
    {
        return this.recommendationType;
    }
    public @Nullable HashMap<String, String> getParameters()
    {
        return this.parameters;
    }
    public CustomProductRecommendationRequest setRecommendationType(String recommendationType)
    {
        this.recommendationType = recommendationType;
        return this;
    }
    public CustomProductRecommendationRequest addToParameters(String key, String value)
    {
        if (this.parameters == null)
        {
            this.parameters = new HashMap<>();
        }
        this.parameters.put(key, value);
        return this;
    }
    public CustomProductRecommendationRequest setParameters(HashMap<String, String> parameters)
    {
        this.parameters = parameters;
        return this;
    }
    @Override
    public CustomProductRecommendationRequest setSettings(ProductRecommendationRequestSettings settings)
    {
        this.settings = settings;
        return this;
    }
    @Override
    public CustomProductRecommendationRequest setLanguage(Language language)
    {
        this.language = language;
        return this;
    }
    @Override
    public CustomProductRecommendationRequest setUser(User user)
    {
        this.user = user;
        return this;
    }
    @Override
    public CustomProductRecommendationRequest setRelevanceModifiers(RelevanceModifierCollection relevanceModifiers)
    {
        this.relevanceModifiers = relevanceModifiers;
        return this;
    }
    @Override
    public CustomProductRecommendationRequest setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
    @Override
    public CustomProductRecommendationRequest setDisplayedAtLocationType(String displayedAtLocationType)
    {
        this.displayedAtLocationType = displayedAtLocationType;
        return this;
    }
    @Override
    public CustomProductRecommendationRequest setCurrency(Currency currency)
    {
        this.currency = currency;
        return this;
    }
    /** @deprecated Use User.Channel instead. */
    @Override
    public CustomProductRecommendationRequest setChannel(Channel channel)
    {
        this.channel = channel;
        return this;
    }
}

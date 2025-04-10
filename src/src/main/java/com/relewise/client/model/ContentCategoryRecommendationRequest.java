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
    property = "$type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = PopularContentCategoriesRecommendationRequest.class, name = "Relewise.Client.Requests.Recommendations.PopularContentCategoriesRecommendationRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = PersonalContentCategoryRecommendationRequest.class, name = "Relewise.Client.Requests.Recommendations.PersonalContentCategoryRecommendationRequest, Relewise.Client"),
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class ContentCategoryRecommendationRequest extends RecommendationRequest implements IUserIdentifier, IHaveCurrencyLanguage
{
    public String $type = "";
    public ContentCategoryRecommendationRequestSettings settings;
    public ContentCategoryRecommendationRequestSettings getSettings()
    {
        return this.settings;
    }
    public ContentCategoryRecommendationRequest setSettings(ContentCategoryRecommendationRequestSettings settings)
    {
        this.settings = settings;
        return this;
    }
    @Override
    public ContentCategoryRecommendationRequest setLanguage(@Nullable Language language)
    {
        this.language = language;
        return this;
    }
    @Override
    public ContentCategoryRecommendationRequest setUser(@Nullable User user)
    {
        this.user = user;
        return this;
    }
    @Override
    public ContentCategoryRecommendationRequest setRelevanceModifiers(RelevanceModifierCollection relevanceModifiers)
    {
        this.relevanceModifiers = relevanceModifiers;
        return this;
    }
    @Override
    public ContentCategoryRecommendationRequest setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
    @Override
    public ContentCategoryRecommendationRequest setDisplayedAtLocationType(String displayedAtLocationType)
    {
        this.displayedAtLocationType = displayedAtLocationType;
        return this;
    }
    @Override
    public ContentCategoryRecommendationRequest setCurrency(@Nullable Currency currency)
    {
        this.currency = currency;
        return this;
    }
    /** @deprecated Use User.Channel instead. */
    @Override
    public ContentCategoryRecommendationRequest setChannel(@Nullable Channel channel)
    {
        this.channel = channel;
        return this;
    }
}

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
    @JsonSubTypes.Type(value = PopularProductCategoriesRecommendationRequest.class, name = "Relewise.Client.Requests.Recommendations.PopularProductCategoriesRecommendationRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = PersonalProductCategoryRecommendationRequest.class, name = "Relewise.Client.Requests.Recommendations.PersonalProductCategoryRecommendationRequest, Relewise.Client"),
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class ProductCategoryRecommendationRequest extends RecommendationRequest implements IUserIdentifier, IHaveCurrencyLanguage
{
    public String $type = "";
    public ProductCategoryRecommendationRequestSettings settings;
    public ProductCategoryRecommendationRequestSettings getSettings()
    {
        return this.settings;
    }
    public ProductCategoryRecommendationRequest setSettings(ProductCategoryRecommendationRequestSettings settings)
    {
        this.settings = settings;
        return this;
    }
    @Override
    public ProductCategoryRecommendationRequest setLanguage(@Nullable Language language)
    {
        this.language = language;
        return this;
    }
    @Override
    public ProductCategoryRecommendationRequest setUser(@Nullable User user)
    {
        this.user = user;
        return this;
    }
    @Override
    public ProductCategoryRecommendationRequest setRelevanceModifiers(RelevanceModifierCollection relevanceModifiers)
    {
        this.relevanceModifiers = relevanceModifiers;
        return this;
    }
    @Override
    public ProductCategoryRecommendationRequest setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
    @Override
    public ProductCategoryRecommendationRequest setDisplayedAtLocationType(String displayedAtLocationType)
    {
        this.displayedAtLocationType = displayedAtLocationType;
        return this;
    }
    @Override
    public ProductCategoryRecommendationRequest setCurrency(@Nullable Currency currency)
    {
        this.currency = currency;
        return this;
    }
    /** @deprecated Use User.Channel instead. */
    @Override
    public ProductCategoryRecommendationRequest setChannel(@Nullable Channel channel)
    {
        this.channel = channel;
        return this;
    }
}

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
    property = "$type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = PopularProductCategoriesRecommendationRequest.class, name = "Relewise.Client.Requests.Recommendations.PopularProductCategoriesRecommendationRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = PersonalProductCategoryRecommendationRequest.class, name = "Relewise.Client.Requests.Recommendations.PersonalProductCategoryRecommendationRequest, Relewise.Client"),
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class ProductCategoryRecommendationRequest extends RecommendationRequest implements IUserIdentifier
{
    public String $type = "";
    public ProductCategoryRecommendationRequestSettings settings;
    public ProductCategoryRecommendationRequestSettings getSettings()
    {
        return this.settings;
    }
    public ProductCategoryRecommendationRequest setSettings(ProductCategoryRecommendationRequestSettings settings)
    {
        this.settings = settings;;
        return this;
    }
    @Override
    public ProductCategoryRecommendationRequest setLanguage(Language language)
    {
        this.language = language;;
        return this;
    }
    @Override
    public ProductCategoryRecommendationRequest setUser(User user)
    {
        this.user = user;;
        return this;
    }
    @Override
    public ProductCategoryRecommendationRequest setRelevanceModifiers(RelevanceModifierCollection relevanceModifiers)
    {
        this.relevanceModifiers = relevanceModifiers;;
        return this;
    }
    @Override
    public ProductCategoryRecommendationRequest setFilters(FilterCollection filters)
    {
        this.filters = filters;;
        return this;
    }
    @Override
    public ProductCategoryRecommendationRequest setDisplayedAtLocationType(String displayedAtLocationType)
    {
        this.displayedAtLocationType = displayedAtLocationType;;
        return this;
    }
    @Override
    public ProductCategoryRecommendationRequest setCurrency(Currency currency)
    {
        this.currency = currency;;
        return this;
    }
}

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
    @JsonSubTypes.Type(value = ContentsViewedAfterViewingContentRequest.class, name = "Relewise.Client.Requests.Recommendations.ContentsViewedAfterViewingContentRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentsViewedAfterViewingProductRequest.class, name = "Relewise.Client.Requests.Recommendations.ContentsViewedAfterViewingProductRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentsViewedAfterViewingMultipleProductsRequest.class, name = "Relewise.Client.Requests.Recommendations.ContentsViewedAfterViewingMultipleProductsRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = PopularContentsRequest.class, name = "Relewise.Client.Requests.Recommendations.PopularContentsRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = PersonalContentRecommendationRequest.class, name = "Relewise.Client.Requests.Recommendations.PersonalContentRecommendationRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentsViewedAfterViewingMultipleContentsRequest.class, name = "Relewise.Client.Requests.Recommendations.ContentsViewedAfterViewingMultipleContentsRequest, Relewise.Client"),
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class ContentRecommendationRequest extends RecommendationRequest implements IUserIdentifier
{
    public String $type = "";
    public ContentRecommendationRequestSettings settings;
    public ContentRecommendationRequestSettings getSettings()
    {
        return this.settings;
    }
    public ContentRecommendationRequest setSettings(ContentRecommendationRequestSettings settings)
    {
        this.settings = settings;
        return this;
    }
    @Override
    public ContentRecommendationRequest setLanguage(Language language)
    {
        this.language = language;
        return this;
    }
    @Override
    public ContentRecommendationRequest setUser(User user)
    {
        this.user = user;
        return this;
    }
    @Override
    public ContentRecommendationRequest setRelevanceModifiers(RelevanceModifierCollection relevanceModifiers)
    {
        this.relevanceModifiers = relevanceModifiers;
        return this;
    }
    @Override
    public ContentRecommendationRequest setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
    @Override
    public ContentRecommendationRequest setDisplayedAtLocationType(String displayedAtLocationType)
    {
        this.displayedAtLocationType = displayedAtLocationType;
        return this;
    }
    @Override
    public ContentRecommendationRequest setCurrency(Currency currency)
    {
        this.currency = currency;
        return this;
    }
}

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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestConfiguration
{
    public RequestConfigurationPrioritization filters;
    public RequestConfigurationPrioritization relevanceModifiers;
    public OverriddenProductRecommendationRequestSettings overriddenProductRecommendationRequestSettings;
    public OverriddenContentRecommendationRequestSettings overriddenContentRecommendationRequestSettings;
    public static RequestConfiguration create()
    {
        return new RequestConfiguration();
    }
    public RequestConfiguration()
    {
    }
    public RequestConfigurationPrioritization getFilters()
    {
        return this.filters;
    }
    public RequestConfigurationPrioritization getRelevanceModifiers()
    {
        return this.relevanceModifiers;
    }
    public OverriddenProductRecommendationRequestSettings getOverriddenProductRecommendationRequestSettings()
    {
        return this.overriddenProductRecommendationRequestSettings;
    }
    public OverriddenContentRecommendationRequestSettings getOverriddenContentRecommendationRequestSettings()
    {
        return this.overriddenContentRecommendationRequestSettings;
    }
    public RequestConfiguration setFilters(RequestConfigurationPrioritization filters)
    {
        this.filters = filters;
        return this;
    }
    public RequestConfiguration setRelevanceModifiers(RequestConfigurationPrioritization relevanceModifiers)
    {
        this.relevanceModifiers = relevanceModifiers;
        return this;
    }
    public RequestConfiguration setOverriddenProductRecommendationRequestSettings(OverriddenProductRecommendationRequestSettings overriddenProductRecommendationRequestSettings)
    {
        this.overriddenProductRecommendationRequestSettings = overriddenProductRecommendationRequestSettings;
        return this;
    }
    public RequestConfiguration setOverriddenContentRecommendationRequestSettings(OverriddenContentRecommendationRequestSettings overriddenContentRecommendationRequestSettings)
    {
        this.overriddenContentRecommendationRequestSettings = overriddenContentRecommendationRequestSettings;
        return this;
    }
}

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
    defaultImpl = OverriddenContentRecommendationRequestSettings.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class OverriddenContentRecommendationRequestSettings
{
    public String $type = "Relewise.Client.Requests.Recommendations.OverriddenContentRecommendationRequestSettings, Relewise.Client";
    public @Nullable Integer numberOfRecommendations;
    public @Nullable Boolean allowFillIfNecessaryToReachNumberOfRecommendations;
    public @Nullable Boolean allowReplacingOfRecentlyShownRecommendations;
    public OverriddenSelectedContentPropertiesSettings selectedContentProperties;
    public @Nullable Boolean prioritizeDiversityBetweenRequests;
    public static OverriddenContentRecommendationRequestSettings create()
    {
        return new OverriddenContentRecommendationRequestSettings();
    }
    public OverriddenContentRecommendationRequestSettings()
    {
    }
    public @Nullable Integer getNumberOfRecommendations()
    {
        return this.numberOfRecommendations;
    }
    public @Nullable Boolean getAllowFillIfNecessaryToReachNumberOfRecommendations()
    {
        return this.allowFillIfNecessaryToReachNumberOfRecommendations;
    }
    public @Nullable Boolean getAllowReplacingOfRecentlyShownRecommendations()
    {
        return this.allowReplacingOfRecentlyShownRecommendations;
    }
    public OverriddenSelectedContentPropertiesSettings getSelectedContentProperties()
    {
        return this.selectedContentProperties;
    }
    public @Nullable Boolean getPrioritizeDiversityBetweenRequests()
    {
        return this.prioritizeDiversityBetweenRequests;
    }
    public OverriddenContentRecommendationRequestSettings setNumberOfRecommendations(@Nullable Integer numberOfRecommendations)
    {
        this.numberOfRecommendations = numberOfRecommendations;;
        return this;
    }
    public OverriddenContentRecommendationRequestSettings setAllowFillIfNecessaryToReachNumberOfRecommendations(@Nullable Boolean allowFillIfNecessaryToReachNumberOfRecommendations)
    {
        this.allowFillIfNecessaryToReachNumberOfRecommendations = allowFillIfNecessaryToReachNumberOfRecommendations;;
        return this;
    }
    public OverriddenContentRecommendationRequestSettings setAllowReplacingOfRecentlyShownRecommendations(@Nullable Boolean allowReplacingOfRecentlyShownRecommendations)
    {
        this.allowReplacingOfRecentlyShownRecommendations = allowReplacingOfRecentlyShownRecommendations;;
        return this;
    }
    public OverriddenContentRecommendationRequestSettings setSelectedContentProperties(OverriddenSelectedContentPropertiesSettings selectedContentProperties)
    {
        this.selectedContentProperties = selectedContentProperties;;
        return this;
    }
    public OverriddenContentRecommendationRequestSettings setPrioritizeDiversityBetweenRequests(@Nullable Boolean prioritizeDiversityBetweenRequests)
    {
        this.prioritizeDiversityBetweenRequests = prioritizeDiversityBetweenRequests;;
        return this;
    }
}

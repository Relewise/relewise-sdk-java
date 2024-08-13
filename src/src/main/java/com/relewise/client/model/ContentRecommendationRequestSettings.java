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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentRecommendationRequestSettings
{
    public Integer numberOfRecommendations;
    public Boolean allowFillIfNecessaryToReachNumberOfRecommendations;
    public Boolean allowReplacingOfRecentlyShownRecommendations;
    public @Nullable SelectedContentPropertiesSettings selectedContentProperties;
    public Boolean prioritizeDiversityBetweenRequests;
    public static ContentRecommendationRequestSettings create()
    {
        return new ContentRecommendationRequestSettings();
    }
    public ContentRecommendationRequestSettings()
    {
    }
    public Integer getNumberOfRecommendations()
    {
        return this.numberOfRecommendations;
    }
    public Boolean getAllowFillIfNecessaryToReachNumberOfRecommendations()
    {
        return this.allowFillIfNecessaryToReachNumberOfRecommendations;
    }
    public Boolean getAllowReplacingOfRecentlyShownRecommendations()
    {
        return this.allowReplacingOfRecentlyShownRecommendations;
    }
    public @Nullable SelectedContentPropertiesSettings getSelectedContentProperties()
    {
        return this.selectedContentProperties;
    }
    public Boolean getPrioritizeDiversityBetweenRequests()
    {
        return this.prioritizeDiversityBetweenRequests;
    }
    public ContentRecommendationRequestSettings setNumberOfRecommendations(Integer numberOfRecommendations)
    {
        this.numberOfRecommendations = numberOfRecommendations;
        return this;
    }
    public ContentRecommendationRequestSettings setAllowFillIfNecessaryToReachNumberOfRecommendations(Boolean allowFillIfNecessaryToReachNumberOfRecommendations)
    {
        this.allowFillIfNecessaryToReachNumberOfRecommendations = allowFillIfNecessaryToReachNumberOfRecommendations;
        return this;
    }
    public ContentRecommendationRequestSettings setAllowReplacingOfRecentlyShownRecommendations(Boolean allowReplacingOfRecentlyShownRecommendations)
    {
        this.allowReplacingOfRecentlyShownRecommendations = allowReplacingOfRecentlyShownRecommendations;
        return this;
    }
    public ContentRecommendationRequestSettings setSelectedContentProperties(SelectedContentPropertiesSettings selectedContentProperties)
    {
        this.selectedContentProperties = selectedContentProperties;
        return this;
    }
    public ContentRecommendationRequestSettings setPrioritizeDiversityBetweenRequests(Boolean prioritizeDiversityBetweenRequests)
    {
        this.prioritizeDiversityBetweenRequests = prioritizeDiversityBetweenRequests;
        return this;
    }
}

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
import java.util.Set;
import java.util.HashSet;
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentCategoryRecommendationRequestSettings
{
    public Integer numberOfRecommendations;
    public Boolean allowFillIfNecessaryToReachNumberOfRecommendations;
    public Boolean allowReplacingOfRecentlyShownRecommendations;
    public Boolean prioritizeDiversityBetweenRequests;
    public SelectedContentCategoryPropertiesSettings selectedContentCategoryProperties;
    public @Nullable Integer prioritizeResultsNotRecommendedWithinSeconds;
    public static ContentCategoryRecommendationRequestSettings create()
    {
        return new ContentCategoryRecommendationRequestSettings();
    }
    public ContentCategoryRecommendationRequestSettings()
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
    public Boolean getPrioritizeDiversityBetweenRequests()
    {
        return this.prioritizeDiversityBetweenRequests;
    }
    public SelectedContentCategoryPropertiesSettings getSelectedContentCategoryProperties()
    {
        return this.selectedContentCategoryProperties;
    }
    public @Nullable Integer getPrioritizeResultsNotRecommendedWithinSeconds()
    {
        return this.prioritizeResultsNotRecommendedWithinSeconds;
    }
    public ContentCategoryRecommendationRequestSettings setNumberOfRecommendations(Integer numberOfRecommendations)
    {
        this.numberOfRecommendations = numberOfRecommendations;
        return this;
    }
    public ContentCategoryRecommendationRequestSettings setAllowFillIfNecessaryToReachNumberOfRecommendations(Boolean allowFillIfNecessaryToReachNumberOfRecommendations)
    {
        this.allowFillIfNecessaryToReachNumberOfRecommendations = allowFillIfNecessaryToReachNumberOfRecommendations;
        return this;
    }
    public ContentCategoryRecommendationRequestSettings setAllowReplacingOfRecentlyShownRecommendations(Boolean allowReplacingOfRecentlyShownRecommendations)
    {
        this.allowReplacingOfRecentlyShownRecommendations = allowReplacingOfRecentlyShownRecommendations;
        return this;
    }
    public ContentCategoryRecommendationRequestSettings setPrioritizeDiversityBetweenRequests(Boolean prioritizeDiversityBetweenRequests)
    {
        this.prioritizeDiversityBetweenRequests = prioritizeDiversityBetweenRequests;
        return this;
    }
    public ContentCategoryRecommendationRequestSettings setSelectedContentCategoryProperties(SelectedContentCategoryPropertiesSettings selectedContentCategoryProperties)
    {
        this.selectedContentCategoryProperties = selectedContentCategoryProperties;
        return this;
    }
    public ContentCategoryRecommendationRequestSettings setPrioritizeResultsNotRecommendedWithinSeconds(@Nullable Integer prioritizeResultsNotRecommendedWithinSeconds)
    {
        this.prioritizeResultsNotRecommendedWithinSeconds = prioritizeResultsNotRecommendedWithinSeconds;
        return this;
    }
}

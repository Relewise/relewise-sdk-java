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
public class BrandRecommendationRequestSettings
{
    public Integer numberOfRecommendations;
    public Boolean allowFillIfNecessaryToReachNumberOfRecommendations;
    public Boolean allowReplacingOfRecentlyShownRecommendations;
    public Boolean prioritizeDiversityBetweenRequests;
    public @Nullable SelectedBrandPropertiesSettings selectedBrandProperties;
    public @Nullable Integer prioritizeResultsNotRecommendedWithinSeconds;
    public static BrandRecommendationRequestSettings create()
    {
        return new BrandRecommendationRequestSettings();
    }
    public BrandRecommendationRequestSettings()
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
    public @Nullable SelectedBrandPropertiesSettings getSelectedBrandProperties()
    {
        return this.selectedBrandProperties;
    }
    public @Nullable Integer getPrioritizeResultsNotRecommendedWithinSeconds()
    {
        return this.prioritizeResultsNotRecommendedWithinSeconds;
    }
    public BrandRecommendationRequestSettings setNumberOfRecommendations(Integer numberOfRecommendations)
    {
        this.numberOfRecommendations = numberOfRecommendations;
        return this;
    }
    public BrandRecommendationRequestSettings setAllowFillIfNecessaryToReachNumberOfRecommendations(Boolean allowFillIfNecessaryToReachNumberOfRecommendations)
    {
        this.allowFillIfNecessaryToReachNumberOfRecommendations = allowFillIfNecessaryToReachNumberOfRecommendations;
        return this;
    }
    public BrandRecommendationRequestSettings setAllowReplacingOfRecentlyShownRecommendations(Boolean allowReplacingOfRecentlyShownRecommendations)
    {
        this.allowReplacingOfRecentlyShownRecommendations = allowReplacingOfRecentlyShownRecommendations;
        return this;
    }
    public BrandRecommendationRequestSettings setPrioritizeDiversityBetweenRequests(Boolean prioritizeDiversityBetweenRequests)
    {
        this.prioritizeDiversityBetweenRequests = prioritizeDiversityBetweenRequests;
        return this;
    }
    public BrandRecommendationRequestSettings setSelectedBrandProperties(@Nullable SelectedBrandPropertiesSettings selectedBrandProperties)
    {
        this.selectedBrandProperties = selectedBrandProperties;
        return this;
    }
    public BrandRecommendationRequestSettings setPrioritizeResultsNotRecommendedWithinSeconds(@Nullable Integer prioritizeResultsNotRecommendedWithinSeconds)
    {
        this.prioritizeResultsNotRecommendedWithinSeconds = prioritizeResultsNotRecommendedWithinSeconds;
        return this;
    }
}

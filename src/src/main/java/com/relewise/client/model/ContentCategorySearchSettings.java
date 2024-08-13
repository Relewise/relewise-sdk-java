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
    defaultImpl = ContentCategorySearchSettings.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentCategorySearchSettings extends SearchSettings
{
    public String $type = "Relewise.Client.Requests.Search.Settings.ContentCategorySearchSettings, Relewise.Client";
    public @Nullable Integer numberOfRecommendations;
    public @Nullable Boolean onlyIncludeRecommendationsForEmptyResults;
    public static ContentCategorySearchSettings create()
    {
        return new ContentCategorySearchSettings();
    }
    public ContentCategorySearchSettings()
    {
    }
    public @Nullable Integer getNumberOfRecommendations()
    {
        return this.numberOfRecommendations;
    }
    public @Nullable Boolean getOnlyIncludeRecommendationsForEmptyResults()
    {
        return this.onlyIncludeRecommendationsForEmptyResults;
    }
    public ContentCategorySearchSettings setNumberOfRecommendations(@Nullable Integer numberOfRecommendations)
    {
        this.numberOfRecommendations = numberOfRecommendations;
        return this;
    }
    public ContentCategorySearchSettings setOnlyIncludeRecommendationsForEmptyResults(@Nullable Boolean onlyIncludeRecommendationsForEmptyResults)
    {
        this.onlyIncludeRecommendationsForEmptyResults = onlyIncludeRecommendationsForEmptyResults;
        return this;
    }
}

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
    property = "$type",
    defaultImpl = ContentSearchSettings.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentSearchSettings extends SearchSettings implements ContentContentHighlightPropsIHighlightSettings
{
    public String $type = "Relewise.Client.Requests.Search.Settings.ContentSearchSettings, Relewise.Client";
    public @Nullable SelectedContentPropertiesSettings selectedContentProperties;
    public RecommendationSettings recommendations;
    public @Nullable ContentSearchSettingsHighlightSettings highlight;
    public static ContentSearchSettings create()
    {
        return new ContentSearchSettings();
    }
    public ContentSearchSettings()
    {
    }
    public @Nullable SelectedContentPropertiesSettings getSelectedContentProperties()
    {
        return this.selectedContentProperties;
    }
    public RecommendationSettings getRecommendations()
    {
        return this.recommendations;
    }
    public @Nullable ContentSearchSettingsHighlightSettings getHighlight()
    {
        return this.highlight;
    }
    public ContentSearchSettings setSelectedContentProperties(@Nullable SelectedContentPropertiesSettings selectedContentProperties)
    {
        this.selectedContentProperties = selectedContentProperties;
        return this;
    }
    public ContentSearchSettings setRecommendations(RecommendationSettings recommendations)
    {
        this.recommendations = recommendations;
        return this;
    }
    public ContentSearchSettings setHighlight(@Nullable ContentSearchSettingsHighlightSettings highlight)
    {
        this.highlight = highlight;
        return this;
    }
}

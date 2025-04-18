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
    defaultImpl = ProductCategorySearchSettings.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductCategorySearchSettings extends SearchSettings
{
    public String $type = "Relewise.Client.Requests.Search.Settings.ProductCategorySearchSettings, Relewise.Client";
    public @Nullable SelectedProductCategoryPropertiesSettings selectedCategoryProperties;
    public RecommendationSettings recommendations;
    public static ProductCategorySearchSettings create()
    {
        return new ProductCategorySearchSettings();
    }
    public ProductCategorySearchSettings()
    {
    }
    public @Nullable SelectedProductCategoryPropertiesSettings getSelectedCategoryProperties()
    {
        return this.selectedCategoryProperties;
    }
    public RecommendationSettings getRecommendations()
    {
        return this.recommendations;
    }
    public ProductCategorySearchSettings setSelectedCategoryProperties(@Nullable SelectedProductCategoryPropertiesSettings selectedCategoryProperties)
    {
        this.selectedCategoryProperties = selectedCategoryProperties;
        return this;
    }
    public ProductCategorySearchSettings setRecommendations(RecommendationSettings recommendations)
    {
        this.recommendations = recommendations;
        return this;
    }
}

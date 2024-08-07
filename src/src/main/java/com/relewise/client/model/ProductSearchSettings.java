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
    defaultImpl = ProductSearchSettings.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductSearchSettings extends SearchSettings
{
    public String $type = "Relewise.Client.Requests.Search.Settings.ProductSearchSettings, Relewise.Client";
    public @Nullable SelectedProductPropertiesSettings selectedProductProperties;
    public @Nullable SelectedVariantPropertiesSettings selectedVariantProperties;
    public @Nullable Integer explodedVariants;
    public RecommendationSettings recommendations;
    public @Nullable SelectedBrandPropertiesSettings selectedBrandProperties;
    public @Nullable VariantSearchSettings variantSettings;
    public static ProductSearchSettings create()
    {
        return new ProductSearchSettings();
    }
    public ProductSearchSettings()
    {
    }
    public @Nullable SelectedProductPropertiesSettings getSelectedProductProperties()
    {
        return this.selectedProductProperties;
    }
    public @Nullable SelectedVariantPropertiesSettings getSelectedVariantProperties()
    {
        return this.selectedVariantProperties;
    }
    public @Nullable Integer getExplodedVariants()
    {
        return this.explodedVariants;
    }
    public RecommendationSettings getRecommendations()
    {
        return this.recommendations;
    }
    public @Nullable SelectedBrandPropertiesSettings getSelectedBrandProperties()
    {
        return this.selectedBrandProperties;
    }
    public @Nullable VariantSearchSettings getVariantSettings()
    {
        return this.variantSettings;
    }
    public ProductSearchSettings setSelectedProductProperties(SelectedProductPropertiesSettings selectedProductProperties)
    {
        this.selectedProductProperties = selectedProductProperties;;
        return this;
    }
    public ProductSearchSettings setSelectedVariantProperties(SelectedVariantPropertiesSettings selectedVariantProperties)
    {
        this.selectedVariantProperties = selectedVariantProperties;;
        return this;
    }
    public ProductSearchSettings setExplodedVariants(@Nullable Integer explodedVariants)
    {
        this.explodedVariants = explodedVariants;;
        return this;
    }
    public ProductSearchSettings setRecommendations(RecommendationSettings recommendations)
    {
        this.recommendations = recommendations;;
        return this;
    }
    public ProductSearchSettings setSelectedBrandProperties(SelectedBrandPropertiesSettings selectedBrandProperties)
    {
        this.selectedBrandProperties = selectedBrandProperties;;
        return this;
    }
    public ProductSearchSettings setVariantSettings(VariantSearchSettings variantSettings)
    {
        this.variantSettings = variantSettings;;
        return this;
    }
}

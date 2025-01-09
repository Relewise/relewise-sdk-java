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
    defaultImpl = ProductSearchSettings.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductSearchSettings extends SearchSettings implements ProductProductHighlightPropsIHighlightSettings
{
    public String $type = "Relewise.Client.Requests.Search.Settings.ProductSearchSettings, Relewise.Client";
    public @Nullable SelectedProductPropertiesSettings selectedProductProperties;
    public @Nullable SelectedVariantPropertiesSettings selectedVariantProperties;
    public @Nullable Integer explodedVariants;
    /** @deprecated Not currently in use */
    public RecommendationSettings recommendations;
    public @Nullable SelectedBrandPropertiesSettings selectedBrandProperties;
    public @Nullable VariantSearchSettings variantSettings;
    /** Used to define constraints which must be honoured to be a valid results. The difference between this and Filters, is that filters are evaluated per product and variant, constraints could be acting on the result of such filter evaluations or a combination of factors, such as whether the product has any variants which matched the provided filters etc. */
    public @Nullable ProductSearchResultConstraint resultConstraint;
    public @Nullable ProductSearchSettingsHighlightSettings highlight;
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
    /** @deprecated Not currently in use */
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
    /** Used to define constraints which must be honoured to be a valid results. The difference between this and Filters, is that filters are evaluated per product and variant, constraints could be acting on the result of such filter evaluations or a combination of factors, such as whether the product has any variants which matched the provided filters etc. */
    public @Nullable ProductSearchResultConstraint getResultConstraint()
    {
        return this.resultConstraint;
    }
    public @Nullable ProductSearchSettingsHighlightSettings getHighlight()
    {
        return this.highlight;
    }
    public ProductSearchSettings setSelectedProductProperties(@Nullable SelectedProductPropertiesSettings selectedProductProperties)
    {
        this.selectedProductProperties = selectedProductProperties;
        return this;
    }
    public ProductSearchSettings setSelectedVariantProperties(@Nullable SelectedVariantPropertiesSettings selectedVariantProperties)
    {
        this.selectedVariantProperties = selectedVariantProperties;
        return this;
    }
    public ProductSearchSettings setExplodedVariants(@Nullable Integer explodedVariants)
    {
        this.explodedVariants = explodedVariants;
        return this;
    }
    /** @deprecated Not currently in use */
    public ProductSearchSettings setRecommendations(RecommendationSettings recommendations)
    {
        this.recommendations = recommendations;
        return this;
    }
    public ProductSearchSettings setSelectedBrandProperties(@Nullable SelectedBrandPropertiesSettings selectedBrandProperties)
    {
        this.selectedBrandProperties = selectedBrandProperties;
        return this;
    }
    public ProductSearchSettings setVariantSettings(@Nullable VariantSearchSettings variantSettings)
    {
        this.variantSettings = variantSettings;
        return this;
    }
    /** Used to define constraints which must be honoured to be a valid results. The difference between this and Filters, is that filters are evaluated per product and variant, constraints could be acting on the result of such filter evaluations or a combination of factors, such as whether the product has any variants which matched the provided filters etc. */
    public ProductSearchSettings setResultConstraint(@Nullable ProductSearchResultConstraint resultConstraint)
    {
        this.resultConstraint = resultConstraint;
        return this;
    }
    public ProductSearchSettings setHighlight(@Nullable ProductSearchSettingsHighlightSettings highlight)
    {
        this.highlight = highlight;
        return this;
    }
}

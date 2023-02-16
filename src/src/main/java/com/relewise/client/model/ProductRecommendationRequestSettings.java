package com.relewise.client.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
    defaultImpl = ProductRecommendationRequestSettings.class)
public class ProductRecommendationRequestSettings
{
    public String $type = "Relewise.Client.Requests.Recommendations.ProductRecommendationRequestSettings, Relewise.Client";
    public Integer numberOfRecommendations;
    public Boolean allowFillIfNecessaryToReachNumberOfRecommendations;
    public Boolean allowReplacingOfRecentlyShownRecommendations;
    public Boolean recommendVariant;
    public @Nullable SelectedProductPropertiesSettings selectedProductProperties;
    public @Nullable SelectedVariantPropertiesSettings selectedVariantProperties;
    public Boolean prioritizeDiversityBetweenRequests;
    public @Nullable Boolean allowProductsCurrentlyInCart;
    public @Nullable SelectedBrandPropertiesSettings selectedBrandProperties;
    public static ProductRecommendationRequestSettings create()
    {
        return new ProductRecommendationRequestSettings();
    }
    public ProductRecommendationRequestSettings()
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
    public Boolean getRecommendVariant()
    {
        return this.recommendVariant;
    }
    public @Nullable SelectedProductPropertiesSettings getSelectedProductProperties()
    {
        return this.selectedProductProperties;
    }
    public @Nullable SelectedVariantPropertiesSettings getSelectedVariantProperties()
    {
        return this.selectedVariantProperties;
    }
    public Boolean getPrioritizeDiversityBetweenRequests()
    {
        return this.prioritizeDiversityBetweenRequests;
    }
    public @Nullable Boolean getAllowProductsCurrentlyInCart()
    {
        return this.allowProductsCurrentlyInCart;
    }
    public @Nullable SelectedBrandPropertiesSettings getSelectedBrandProperties()
    {
        return this.selectedBrandProperties;
    }
    public ProductRecommendationRequestSettings setNumberOfRecommendations(Integer numberOfRecommendations)
    {
        this.numberOfRecommendations = numberOfRecommendations;;
        return this;
    }
    public ProductRecommendationRequestSettings setAllowFillIfNecessaryToReachNumberOfRecommendations(Boolean allowFillIfNecessaryToReachNumberOfRecommendations)
    {
        this.allowFillIfNecessaryToReachNumberOfRecommendations = allowFillIfNecessaryToReachNumberOfRecommendations;;
        return this;
    }
    public ProductRecommendationRequestSettings setAllowReplacingOfRecentlyShownRecommendations(Boolean allowReplacingOfRecentlyShownRecommendations)
    {
        this.allowReplacingOfRecentlyShownRecommendations = allowReplacingOfRecentlyShownRecommendations;;
        return this;
    }
    public ProductRecommendationRequestSettings setRecommendVariant(Boolean recommendVariant)
    {
        this.recommendVariant = recommendVariant;;
        return this;
    }
    public ProductRecommendationRequestSettings setSelectedProductProperties(SelectedProductPropertiesSettings selectedProductProperties)
    {
        this.selectedProductProperties = selectedProductProperties;;
        return this;
    }
    public ProductRecommendationRequestSettings setSelectedVariantProperties(SelectedVariantPropertiesSettings selectedVariantProperties)
    {
        this.selectedVariantProperties = selectedVariantProperties;;
        return this;
    }
    public ProductRecommendationRequestSettings setPrioritizeDiversityBetweenRequests(Boolean prioritizeDiversityBetweenRequests)
    {
        this.prioritizeDiversityBetweenRequests = prioritizeDiversityBetweenRequests;;
        return this;
    }
    public ProductRecommendationRequestSettings setAllowProductsCurrentlyInCart(@Nullable Boolean allowProductsCurrentlyInCart)
    {
        this.allowProductsCurrentlyInCart = allowProductsCurrentlyInCart;;
        return this;
    }
    public ProductRecommendationRequestSettings setSelectedBrandProperties(SelectedBrandPropertiesSettings selectedBrandProperties)
    {
        this.selectedBrandProperties = selectedBrandProperties;;
        return this;
    }
}

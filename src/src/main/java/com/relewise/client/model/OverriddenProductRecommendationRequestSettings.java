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
    
/** Partial overrides that can be merged into an existing <code>ProductRecommendationRequestSettings</code> instance. */
@JsonIgnoreProperties(ignoreUnknown = true)
public class OverriddenProductRecommendationRequestSettings
{
    public @Nullable Integer numberOfRecommendations;
    public @Nullable Boolean allowFillIfNecessaryToReachNumberOfRecommendations;
    public @Nullable Boolean allowReplacingOfRecentlyShownRecommendations;
    /** @deprecated Use VariantRequestSettings.MaxVariantsPerProduct instead. */
    public @Nullable Boolean recommendVariant;
    public OverriddenSelectedProductPropertiesSettings selectedProductProperties;
    public OverriddenSelectedVariantPropertiesSettings selectedVariantProperties;
    public @Nullable Boolean prioritizeDiversityBetweenRequests;
    public @Nullable Boolean allowProductsCurrentlyInCart;
    public OverriddenSelectedBrandPropertiesSettings selectedBrandProperties;
    public @Nullable Integer prioritizeResultsNotRecommendedWithinSeconds;
    /** Overrides variant-inclusion behavior for product recommendation requests. Use this to replace the effective <code>VariantRequestSettings</code> for the overridden request. <code>MaxVariantsPerProduct</code>. */
    public @Nullable VariantRecommendationRequestSettings variantRequestSettings;
    public static OverriddenProductRecommendationRequestSettings create()
    {
        return new OverriddenProductRecommendationRequestSettings();
    }
    public OverriddenProductRecommendationRequestSettings()
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
    /** @deprecated Use VariantRequestSettings.MaxVariantsPerProduct instead. */
    public @Nullable Boolean getRecommendVariant()
    {
        return this.recommendVariant;
    }
    public OverriddenSelectedProductPropertiesSettings getSelectedProductProperties()
    {
        return this.selectedProductProperties;
    }
    public OverriddenSelectedVariantPropertiesSettings getSelectedVariantProperties()
    {
        return this.selectedVariantProperties;
    }
    public @Nullable Boolean getPrioritizeDiversityBetweenRequests()
    {
        return this.prioritizeDiversityBetweenRequests;
    }
    public @Nullable Boolean getAllowProductsCurrentlyInCart()
    {
        return this.allowProductsCurrentlyInCart;
    }
    public OverriddenSelectedBrandPropertiesSettings getSelectedBrandProperties()
    {
        return this.selectedBrandProperties;
    }
    public @Nullable Integer getPrioritizeResultsNotRecommendedWithinSeconds()
    {
        return this.prioritizeResultsNotRecommendedWithinSeconds;
    }
    /** Overrides variant-inclusion behavior for product recommendation requests. Use this to replace the effective <code>VariantRequestSettings</code> for the overridden request. <code>MaxVariantsPerProduct</code>. */
    public @Nullable VariantRecommendationRequestSettings getVariantRequestSettings()
    {
        return this.variantRequestSettings;
    }
    public OverriddenProductRecommendationRequestSettings setNumberOfRecommendations(@Nullable Integer numberOfRecommendations)
    {
        this.numberOfRecommendations = numberOfRecommendations;
        return this;
    }
    public OverriddenProductRecommendationRequestSettings setAllowFillIfNecessaryToReachNumberOfRecommendations(@Nullable Boolean allowFillIfNecessaryToReachNumberOfRecommendations)
    {
        this.allowFillIfNecessaryToReachNumberOfRecommendations = allowFillIfNecessaryToReachNumberOfRecommendations;
        return this;
    }
    public OverriddenProductRecommendationRequestSettings setAllowReplacingOfRecentlyShownRecommendations(@Nullable Boolean allowReplacingOfRecentlyShownRecommendations)
    {
        this.allowReplacingOfRecentlyShownRecommendations = allowReplacingOfRecentlyShownRecommendations;
        return this;
    }
    /** @deprecated Use VariantRequestSettings.MaxVariantsPerProduct instead. */
    public OverriddenProductRecommendationRequestSettings setRecommendVariant(@Nullable Boolean recommendVariant)
    {
        this.recommendVariant = recommendVariant;
        return this;
    }
    public OverriddenProductRecommendationRequestSettings setSelectedProductProperties(OverriddenSelectedProductPropertiesSettings selectedProductProperties)
    {
        this.selectedProductProperties = selectedProductProperties;
        return this;
    }
    public OverriddenProductRecommendationRequestSettings setSelectedVariantProperties(OverriddenSelectedVariantPropertiesSettings selectedVariantProperties)
    {
        this.selectedVariantProperties = selectedVariantProperties;
        return this;
    }
    public OverriddenProductRecommendationRequestSettings setPrioritizeDiversityBetweenRequests(@Nullable Boolean prioritizeDiversityBetweenRequests)
    {
        this.prioritizeDiversityBetweenRequests = prioritizeDiversityBetweenRequests;
        return this;
    }
    public OverriddenProductRecommendationRequestSettings setAllowProductsCurrentlyInCart(@Nullable Boolean allowProductsCurrentlyInCart)
    {
        this.allowProductsCurrentlyInCart = allowProductsCurrentlyInCart;
        return this;
    }
    public OverriddenProductRecommendationRequestSettings setSelectedBrandProperties(OverriddenSelectedBrandPropertiesSettings selectedBrandProperties)
    {
        this.selectedBrandProperties = selectedBrandProperties;
        return this;
    }
    public OverriddenProductRecommendationRequestSettings setPrioritizeResultsNotRecommendedWithinSeconds(@Nullable Integer prioritizeResultsNotRecommendedWithinSeconds)
    {
        this.prioritizeResultsNotRecommendedWithinSeconds = prioritizeResultsNotRecommendedWithinSeconds;
        return this;
    }
    /** Overrides variant-inclusion behavior for product recommendation requests. Use this to replace the effective <code>VariantRequestSettings</code> for the overridden request. <code>MaxVariantsPerProduct</code>. */
    public OverriddenProductRecommendationRequestSettings setVariantRequestSettings(@Nullable VariantRecommendationRequestSettings variantRequestSettings)
    {
        this.variantRequestSettings = variantRequestSettings;
        return this;
    }
}

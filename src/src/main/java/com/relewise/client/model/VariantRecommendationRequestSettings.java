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
    
/** Recommendation-specific variant controls for product recommendation requests. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = VariantRecommendationRequestSettings.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class VariantRecommendationRequestSettings extends VariantRequestSettings
{
    public String $type = "Relewise.Client.Requests.Recommendations.VariantRecommendationRequestSettings, Relewise.Client";
    public static VariantRecommendationRequestSettings create()
    {
        return new VariantRecommendationRequestSettings();
    }
    public VariantRecommendationRequestSettings()
    {
    }
    @Override
    public VariantRecommendationRequestSettings setMaxVariantsPerProduct(@Nullable Integer maxVariantsPerProduct)
    {
        this.maxVariantsPerProduct = maxVariantsPerProduct;
        return this;
    }
    @Override
    public VariantRecommendationRequestSettings setSorting(@Nullable VariantSorting sorting)
    {
        this.sorting = sorting;
        return this;
    }
}

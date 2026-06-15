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
    
/** Request-level controls for how many variants may be returned per product and how those variants should be ordered. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = VariantSearchRequestSettings.class, name = "Relewise.Client.Requests.Search.Settings.VariantSearchRequestSettings, Relewise.Client"),
    @JsonSubTypes.Type(value = VariantRecommendationRequestSettings.class, name = "Relewise.Client.Requests.Recommendations.VariantRecommendationRequestSettings, Relewise.Client"),
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class VariantRequestSettings
{
    public String $type = "";
    /** The maximum number of variants that may be returned for a single product. A value of 0 means product-only output. */
    public @Nullable Integer maxVariantsPerProduct;
    /** The preferred sorting strategy for variants when more than one variant per product is allowed. When omitted, the effective sorting is chosen by the engine. */
    public @Nullable VariantSorting sorting;
    /** The maximum number of variants that may be returned for a single product. A value of 0 means product-only output. */
    public @Nullable Integer getMaxVariantsPerProduct()
    {
        return this.maxVariantsPerProduct;
    }
    /** The preferred sorting strategy for variants when more than one variant per product is allowed. When omitted, the effective sorting is chosen by the engine. */
    public @Nullable VariantSorting getSorting()
    {
        return this.sorting;
    }
    /** The maximum number of variants that may be returned for a single product. A value of 0 means product-only output. */
    public VariantRequestSettings setMaxVariantsPerProduct(@Nullable Integer maxVariantsPerProduct)
    {
        this.maxVariantsPerProduct = maxVariantsPerProduct;
        return this;
    }
    /** The preferred sorting strategy for variants when more than one variant per product is allowed. When omitted, the effective sorting is chosen by the engine. */
    public VariantRequestSettings setSorting(@Nullable VariantSorting sorting)
    {
        this.sorting = sorting;
        return this;
    }
}

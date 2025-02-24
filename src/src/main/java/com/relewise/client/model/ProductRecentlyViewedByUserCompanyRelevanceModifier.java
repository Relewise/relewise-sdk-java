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
    
/** a <code>RelevanceModifier</code> that can change the relevance of a Product depending on whether the users company or parent company have viewed this product within the provided timespan. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = ProductRecentlyViewedByUserCompanyRelevanceModifier.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductRecentlyViewedByUserCompanyRelevanceModifier extends RelevanceModifier implements IProductRelevanceModifier
{
    public String $type = "Relewise.Client.Requests.RelevanceModifiers.ProductRecentlyViewedByUserCompanyRelevanceModifier, Relewise.Client";
    /** The start of the time period in which a product will be considered relevant to the user if viewed previously by their company. */
    public @Nullable OffsetDateTime sinceUtc;
    /** The weight that the Product will be multiplied with if it has been viewed in the past by the users company (since <code>SinceUtc</code>). */
    public Double ifViewedByUserCompanyMultiplyWeightBy;
    /** The weight that the Product will be multiplied with if it has been viewed in the past by the users parent company (since <code>SinceUtc</code>). */
    public Double elseIfViewedByUserParentCompanyMultiplyWeightBy;
    /** The weight that the Product will be multiplied with if it has not been viewed in the past by the users parent company (since <code>SinceUtc</code>). */
    public Double elseIfNotViewedByEitherCompanyMultiplyWeightBy;
    /** The minutes since in which a product will be considered relevant to the user if viewed previously by them. */
    public @Nullable Integer sinceMinutesAgo;
    public static ProductRecentlyViewedByUserCompanyRelevanceModifier create(OffsetDateTime sinceUtc)
    {
        return new ProductRecentlyViewedByUserCompanyRelevanceModifier(sinceUtc);
    }
    public ProductRecentlyViewedByUserCompanyRelevanceModifier(OffsetDateTime sinceUtc)
    {
        this.sinceUtc = sinceUtc;
        this.ifViewedByUserCompanyMultiplyWeightBy = 1d;
        this.elseIfViewedByUserParentCompanyMultiplyWeightBy = 1d;
        this.elseIfNotViewedByEitherCompanyMultiplyWeightBy = 1d;
    }
    /**
     * Creates a <code>RelevanceModifier</code> that can change the relevance of a Product depending on whether the users company or parent company have viewed this product within the provided timespan.
     * @param sinceUtc The start of the time period in which a product will be considered relevant to the user if viewed previously by their company.
     * @param ifViewedByUserCompanyMultiplyWeightBy The weight that the Product will be multiplied with if it has been viewed in the past by the users company (since SinceUtc).
     * @param elseIfViewedByUserParentCompanyMultiplyWeightBy The weight that the Product will be multiplied with if it has been viewed in the past by the users parent company (since SinceUtc).
     * @param elseIfNotViewedByEitherCompanyMultiplyWeightBy The weight that the Product will be multiplied with if it has not been viewed in the past by the users parent company (since SinceUtc).
     */
    public static ProductRecentlyViewedByUserCompanyRelevanceModifier create(OffsetDateTime sinceUtc, Double ifViewedByUserCompanyMultiplyWeightBy, Double elseIfViewedByUserParentCompanyMultiplyWeightBy, Double elseIfNotViewedByEitherCompanyMultiplyWeightBy)
    {
        return new ProductRecentlyViewedByUserCompanyRelevanceModifier(sinceUtc, ifViewedByUserCompanyMultiplyWeightBy, elseIfViewedByUserParentCompanyMultiplyWeightBy, elseIfNotViewedByEitherCompanyMultiplyWeightBy);
    }
    /**
     * Creates a <code>RelevanceModifier</code> that can change the relevance of a Product depending on whether the users company or parent company have viewed this product within the provided timespan.
     * @param sinceUtc The start of the time period in which a product will be considered relevant to the user if viewed previously by their company.
     * @param ifViewedByUserCompanyMultiplyWeightBy The weight that the Product will be multiplied with if it has been viewed in the past by the users company (since SinceUtc).
     * @param elseIfViewedByUserParentCompanyMultiplyWeightBy The weight that the Product will be multiplied with if it has been viewed in the past by the users parent company (since SinceUtc).
     * @param elseIfNotViewedByEitherCompanyMultiplyWeightBy The weight that the Product will be multiplied with if it has not been viewed in the past by the users parent company (since SinceUtc).
     */
    public ProductRecentlyViewedByUserCompanyRelevanceModifier(OffsetDateTime sinceUtc, Double ifViewedByUserCompanyMultiplyWeightBy, Double elseIfViewedByUserParentCompanyMultiplyWeightBy, Double elseIfNotViewedByEitherCompanyMultiplyWeightBy)
    {
        this.sinceUtc = sinceUtc;
        this.ifViewedByUserCompanyMultiplyWeightBy = ifViewedByUserCompanyMultiplyWeightBy;
        this.elseIfViewedByUserParentCompanyMultiplyWeightBy = elseIfViewedByUserParentCompanyMultiplyWeightBy;
        this.elseIfNotViewedByEitherCompanyMultiplyWeightBy = elseIfNotViewedByEitherCompanyMultiplyWeightBy;
    }
    public ProductRecentlyViewedByUserCompanyRelevanceModifier()
    {
        this.ifViewedByUserCompanyMultiplyWeightBy = 1d;
        this.elseIfViewedByUserParentCompanyMultiplyWeightBy = 1d;
        this.elseIfNotViewedByEitherCompanyMultiplyWeightBy = 1d;
    }
    /** The start of the time period in which a product will be considered relevant to the user if viewed previously by their company. */
    public @Nullable OffsetDateTime getSinceUtc()
    {
        return this.sinceUtc;
    }
    /** The weight that the Product will be multiplied with if it has been viewed in the past by the users company (since <code>SinceUtc</code>). */
    public Double getIfViewedByUserCompanyMultiplyWeightBy()
    {
        return this.ifViewedByUserCompanyMultiplyWeightBy;
    }
    /** The weight that the Product will be multiplied with if it has been viewed in the past by the users parent company (since <code>SinceUtc</code>). */
    public Double getElseIfViewedByUserParentCompanyMultiplyWeightBy()
    {
        return this.elseIfViewedByUserParentCompanyMultiplyWeightBy;
    }
    /** The weight that the Product will be multiplied with if it has not been viewed in the past by the users parent company (since <code>SinceUtc</code>). */
    public Double getElseIfNotViewedByEitherCompanyMultiplyWeightBy()
    {
        return this.elseIfNotViewedByEitherCompanyMultiplyWeightBy;
    }
    /** The minutes since in which a product will be considered relevant to the user if viewed previously by them. */
    public @Nullable Integer getSinceMinutesAgo()
    {
        return this.sinceMinutesAgo;
    }
    /** The start of the time period in which a product will be considered relevant to the user if viewed previously by their company. */
    public ProductRecentlyViewedByUserCompanyRelevanceModifier setSinceUtc(@Nullable OffsetDateTime sinceUtc)
    {
        this.sinceUtc = sinceUtc;
        return this;
    }
    /** The weight that the Product will be multiplied with if it has been viewed in the past by the users company (since <code>SinceUtc</code>). */
    public ProductRecentlyViewedByUserCompanyRelevanceModifier setIfViewedByUserCompanyMultiplyWeightBy(Double ifViewedByUserCompanyMultiplyWeightBy)
    {
        this.ifViewedByUserCompanyMultiplyWeightBy = ifViewedByUserCompanyMultiplyWeightBy;
        return this;
    }
    /** The weight that the Product will be multiplied with if it has been viewed in the past by the users parent company (since <code>SinceUtc</code>). */
    public ProductRecentlyViewedByUserCompanyRelevanceModifier setElseIfViewedByUserParentCompanyMultiplyWeightBy(Double elseIfViewedByUserParentCompanyMultiplyWeightBy)
    {
        this.elseIfViewedByUserParentCompanyMultiplyWeightBy = elseIfViewedByUserParentCompanyMultiplyWeightBy;
        return this;
    }
    /** The weight that the Product will be multiplied with if it has not been viewed in the past by the users parent company (since <code>SinceUtc</code>). */
    public ProductRecentlyViewedByUserCompanyRelevanceModifier setElseIfNotViewedByEitherCompanyMultiplyWeightBy(Double elseIfNotViewedByEitherCompanyMultiplyWeightBy)
    {
        this.elseIfNotViewedByEitherCompanyMultiplyWeightBy = elseIfNotViewedByEitherCompanyMultiplyWeightBy;
        return this;
    }
    /** The minutes since in which a product will be considered relevant to the user if viewed previously by them. */
    public ProductRecentlyViewedByUserCompanyRelevanceModifier setSinceMinutesAgo(@Nullable Integer sinceMinutesAgo)
    {
        this.sinceMinutesAgo = sinceMinutesAgo;
        return this;
    }
    @Override
    public ProductRecentlyViewedByUserCompanyRelevanceModifier setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
}

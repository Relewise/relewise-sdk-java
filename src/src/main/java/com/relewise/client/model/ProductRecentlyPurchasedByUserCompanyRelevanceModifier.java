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
import java.util.Set;
import java.util.HashSet;
    
/** a <code>RelevanceModifier</code> that can change the relevance of a Product depending on whether the users company or parent company have purchased this product within some timespan. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = ProductRecentlyPurchasedByUserCompanyRelevanceModifier.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductRecentlyPurchasedByUserCompanyRelevanceModifier extends RelevanceModifier implements IProductRelevanceModifier
{
    public String $type = "Relewise.Client.Requests.RelevanceModifiers.ProductRecentlyPurchasedByUserCompanyRelevanceModifier, Relewise.Client";
    /** The start of the time period in which a product will be considered relevant to the user if purchased previously by their company. */
    public @Nullable OffsetDateTime sinceUtc;
    /** The weight that the Product will be multiplied with if it has been purchased in the past by the users company (since <code>SinceUtc</code>). */
    public Double ifPurchasedByCompanyMultiplyWeightBy;
    /** The weight that the Product will be multiplied with if it has been purchased in the past by the users parent company (since <code>SinceUtc</code>). */
    public Double elseIfPurchasedByParentCompanyMultiplyWeightBy;
    /** The weight that the Product will be multiplied with if it has not been purchased in the past by the users parent company (since <code>SinceUtc</code>). */
    public Double elseIfNotPurchasedByEitherCompanyMultiplyWeightBy;
    /** The minutes since in which a product will be considered relevant to the user if bought previously by them. */
    public @Nullable Integer sinceMinutesAgo;
    public static ProductRecentlyPurchasedByUserCompanyRelevanceModifier create(OffsetDateTime sinceUtc)
    {
        return new ProductRecentlyPurchasedByUserCompanyRelevanceModifier(sinceUtc);
    }
    public ProductRecentlyPurchasedByUserCompanyRelevanceModifier(OffsetDateTime sinceUtc)
    {
        this.sinceUtc = sinceUtc;
        this.ifPurchasedByCompanyMultiplyWeightBy = 1d;
        this.elseIfPurchasedByParentCompanyMultiplyWeightBy = 1d;
        this.elseIfNotPurchasedByEitherCompanyMultiplyWeightBy = 1d;
    }
    /**
     * Creates a <code>RelevanceModifier</code> that can change the relevance of a Product depending on whether the users company or parent company have purchased this product within some timespan.
     * @param sinceUtc The start of the time period in which a product will be considered relevant to the user if purchased previously by their company.
     * @param ifPurchasedByCompanyMultiplyWeightBy The weight that the Product will be multiplied with if it has been purchased in the past by the users company (since SinceUtc).
     * @param elseIfPurchasedByParentCompanyMultiplyWeightBy The weight that the Product will be multiplied with if it has been purchased in the past by the users parent company (since SinceUtc).
     * @param elseIfNotPurchasedByEitherCompanyMultiplyWeightBy The weight that the Product will be multiplied with if it has not been purchased in the past by the users parent company (since SinceUtc).
     */
    public static ProductRecentlyPurchasedByUserCompanyRelevanceModifier create(OffsetDateTime sinceUtc, Double ifPurchasedByCompanyMultiplyWeightBy, Double elseIfPurchasedByParentCompanyMultiplyWeightBy, Double elseIfNotPurchasedByEitherCompanyMultiplyWeightBy)
    {
        return new ProductRecentlyPurchasedByUserCompanyRelevanceModifier(sinceUtc, ifPurchasedByCompanyMultiplyWeightBy, elseIfPurchasedByParentCompanyMultiplyWeightBy, elseIfNotPurchasedByEitherCompanyMultiplyWeightBy);
    }
    /**
     * Creates a <code>RelevanceModifier</code> that can change the relevance of a Product depending on whether the users company or parent company have purchased this product within some timespan.
     * @param sinceUtc The start of the time period in which a product will be considered relevant to the user if purchased previously by their company.
     * @param ifPurchasedByCompanyMultiplyWeightBy The weight that the Product will be multiplied with if it has been purchased in the past by the users company (since SinceUtc).
     * @param elseIfPurchasedByParentCompanyMultiplyWeightBy The weight that the Product will be multiplied with if it has been purchased in the past by the users parent company (since SinceUtc).
     * @param elseIfNotPurchasedByEitherCompanyMultiplyWeightBy The weight that the Product will be multiplied with if it has not been purchased in the past by the users parent company (since SinceUtc).
     */
    public ProductRecentlyPurchasedByUserCompanyRelevanceModifier(OffsetDateTime sinceUtc, Double ifPurchasedByCompanyMultiplyWeightBy, Double elseIfPurchasedByParentCompanyMultiplyWeightBy, Double elseIfNotPurchasedByEitherCompanyMultiplyWeightBy)
    {
        this.sinceUtc = sinceUtc;
        this.ifPurchasedByCompanyMultiplyWeightBy = ifPurchasedByCompanyMultiplyWeightBy;
        this.elseIfPurchasedByParentCompanyMultiplyWeightBy = elseIfPurchasedByParentCompanyMultiplyWeightBy;
        this.elseIfNotPurchasedByEitherCompanyMultiplyWeightBy = elseIfNotPurchasedByEitherCompanyMultiplyWeightBy;
    }
    public ProductRecentlyPurchasedByUserCompanyRelevanceModifier()
    {
        this.ifPurchasedByCompanyMultiplyWeightBy = 1d;
        this.elseIfPurchasedByParentCompanyMultiplyWeightBy = 1d;
        this.elseIfNotPurchasedByEitherCompanyMultiplyWeightBy = 1d;
    }
    /** The start of the time period in which a product will be considered relevant to the user if purchased previously by their company. */
    public @Nullable OffsetDateTime getSinceUtc()
    {
        return this.sinceUtc;
    }
    /** The weight that the Product will be multiplied with if it has been purchased in the past by the users company (since <code>SinceUtc</code>). */
    public Double getIfPurchasedByCompanyMultiplyWeightBy()
    {
        return this.ifPurchasedByCompanyMultiplyWeightBy;
    }
    /** The weight that the Product will be multiplied with if it has been purchased in the past by the users parent company (since <code>SinceUtc</code>). */
    public Double getElseIfPurchasedByParentCompanyMultiplyWeightBy()
    {
        return this.elseIfPurchasedByParentCompanyMultiplyWeightBy;
    }
    /** The weight that the Product will be multiplied with if it has not been purchased in the past by the users parent company (since <code>SinceUtc</code>). */
    public Double getElseIfNotPurchasedByEitherCompanyMultiplyWeightBy()
    {
        return this.elseIfNotPurchasedByEitherCompanyMultiplyWeightBy;
    }
    /** The minutes since in which a product will be considered relevant to the user if bought previously by them. */
    public @Nullable Integer getSinceMinutesAgo()
    {
        return this.sinceMinutesAgo;
    }
    /** The start of the time period in which a product will be considered relevant to the user if purchased previously by their company. */
    public ProductRecentlyPurchasedByUserCompanyRelevanceModifier setSinceUtc(@Nullable OffsetDateTime sinceUtc)
    {
        this.sinceUtc = sinceUtc;
        return this;
    }
    /** The weight that the Product will be multiplied with if it has been purchased in the past by the users company (since <code>SinceUtc</code>). */
    public ProductRecentlyPurchasedByUserCompanyRelevanceModifier setIfPurchasedByCompanyMultiplyWeightBy(Double ifPurchasedByCompanyMultiplyWeightBy)
    {
        this.ifPurchasedByCompanyMultiplyWeightBy = ifPurchasedByCompanyMultiplyWeightBy;
        return this;
    }
    /** The weight that the Product will be multiplied with if it has been purchased in the past by the users parent company (since <code>SinceUtc</code>). */
    public ProductRecentlyPurchasedByUserCompanyRelevanceModifier setElseIfPurchasedByParentCompanyMultiplyWeightBy(Double elseIfPurchasedByParentCompanyMultiplyWeightBy)
    {
        this.elseIfPurchasedByParentCompanyMultiplyWeightBy = elseIfPurchasedByParentCompanyMultiplyWeightBy;
        return this;
    }
    /** The weight that the Product will be multiplied with if it has not been purchased in the past by the users parent company (since <code>SinceUtc</code>). */
    public ProductRecentlyPurchasedByUserCompanyRelevanceModifier setElseIfNotPurchasedByEitherCompanyMultiplyWeightBy(Double elseIfNotPurchasedByEitherCompanyMultiplyWeightBy)
    {
        this.elseIfNotPurchasedByEitherCompanyMultiplyWeightBy = elseIfNotPurchasedByEitherCompanyMultiplyWeightBy;
        return this;
    }
    /** The minutes since in which a product will be considered relevant to the user if bought previously by them. */
    public ProductRecentlyPurchasedByUserCompanyRelevanceModifier setSinceMinutesAgo(@Nullable Integer sinceMinutesAgo)
    {
        this.sinceMinutesAgo = sinceMinutesAgo;
        return this;
    }
    @Override
    public ProductRecentlyPurchasedByUserCompanyRelevanceModifier setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
}

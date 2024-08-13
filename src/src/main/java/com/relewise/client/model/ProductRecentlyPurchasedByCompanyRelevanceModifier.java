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
    
/** a <code>RelevanceModifier</code> that can change the relevance of a Product depending on whether the users company or parent company have purchased this product within some timespan. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = ProductRecentlyPurchasedByCompanyRelevanceModifier.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductRecentlyPurchasedByCompanyRelevanceModifier extends RelevanceModifier implements IProductRelevanceModifier
{
    public String $type = "Relewise.Client.Requests.RelevanceModifiers.ProductRecentlyPurchasedByCompanyRelevanceModifier, Relewise.Client";
    /** The start of the time period in which a product will be considered relevant to the user if purchased previously by any of the provided companies. */
    public @Nullable OffsetDateTime sinceUtc;
    /** The companies that should be evaluated in this modifier. */
    public ArrayList<String> companyIds;
    /** The weight that the Product will be multiplied with if it has been purchased in the past by any of the provided companies (since <code>SinceUtc</code>). */
    public Double ifPurchasedByCompanyMultiplyWeightBy;
    /** The weight that the Product will be multiplied with if it has not been purchased in the past by any of the provided companies (since <code>SinceUtc</code>). */
    public Double elseIfNotPurchasedByCompanyMultiplyWeightBy;
    /** The minutes since in which a product will be considered relevant to the user if bought previously by them. */
    public @Nullable Integer sinceMinutesAgo;
    public static ProductRecentlyPurchasedByCompanyRelevanceModifier create(OffsetDateTime sinceUtc, String... companyIds)
    {
        return new ProductRecentlyPurchasedByCompanyRelevanceModifier(sinceUtc, companyIds);
    }
    public ProductRecentlyPurchasedByCompanyRelevanceModifier(OffsetDateTime sinceUtc, String... companyIds)
    {
        this.sinceUtc = sinceUtc;
        this.companyIds = new ArrayList<>(Arrays.asList(companyIds));
        this.ifPurchasedByCompanyMultiplyWeightBy = 1d;
        this.elseIfNotPurchasedByCompanyMultiplyWeightBy = 1d;
    }
    /**
     * Creates a <code>RelevanceModifier</code> that can change the relevance of a Product depending on whether the users company or parent company have purchased this product within some timespan.
     * @param sinceUtc The start of the time period in which a product will be considered relevant to the user if purchased previously by any of the provided companies.
     * @param companyIds The list of company ids.
     * @param ifPurchasedByCompanyMultiplyWeightBy The weight that the Product will be multiplied with if it has been purchased in the past by any of the provided companies (since SinceUtc).
     * @param elseIfNotPurchasedByCompanyMultiplyWeightBy The weight that the Product will be multiplied with if it has not been purchased in the past by any of the provided companies (since SinceUtc).
     */
    public static ProductRecentlyPurchasedByCompanyRelevanceModifier create(OffsetDateTime sinceUtc, ArrayList<String> companyIds, Double ifPurchasedByCompanyMultiplyWeightBy, Double elseIfNotPurchasedByCompanyMultiplyWeightBy)
    {
        return new ProductRecentlyPurchasedByCompanyRelevanceModifier(sinceUtc, companyIds, ifPurchasedByCompanyMultiplyWeightBy, elseIfNotPurchasedByCompanyMultiplyWeightBy);
    }
    /**
     * Creates a <code>RelevanceModifier</code> that can change the relevance of a Product depending on whether the users company or parent company have purchased this product within some timespan.
     * @param sinceUtc The start of the time period in which a product will be considered relevant to the user if purchased previously by any of the provided companies.
     * @param companyIds The list of company ids.
     * @param ifPurchasedByCompanyMultiplyWeightBy The weight that the Product will be multiplied with if it has been purchased in the past by any of the provided companies (since SinceUtc).
     * @param elseIfNotPurchasedByCompanyMultiplyWeightBy The weight that the Product will be multiplied with if it has not been purchased in the past by any of the provided companies (since SinceUtc).
     */
    public ProductRecentlyPurchasedByCompanyRelevanceModifier(OffsetDateTime sinceUtc, ArrayList<String> companyIds, Double ifPurchasedByCompanyMultiplyWeightBy, Double elseIfNotPurchasedByCompanyMultiplyWeightBy)
    {
        this.sinceUtc = sinceUtc;
        this.companyIds = companyIds;
        this.ifPurchasedByCompanyMultiplyWeightBy = ifPurchasedByCompanyMultiplyWeightBy;
        this.elseIfNotPurchasedByCompanyMultiplyWeightBy = elseIfNotPurchasedByCompanyMultiplyWeightBy;
    }
    public ProductRecentlyPurchasedByCompanyRelevanceModifier()
    {
        this.ifPurchasedByCompanyMultiplyWeightBy = 1d;
        this.elseIfNotPurchasedByCompanyMultiplyWeightBy = 1d;
    }
    /** The start of the time period in which a product will be considered relevant to the user if purchased previously by any of the provided companies. */
    public @Nullable OffsetDateTime getSinceUtc()
    {
        return this.sinceUtc;
    }
    /** The companies that should be evaluated in this modifier. */
    public ArrayList<String> getCompanyIds()
    {
        return this.companyIds;
    }
    /** The weight that the Product will be multiplied with if it has been purchased in the past by any of the provided companies (since <code>SinceUtc</code>). */
    public Double getIfPurchasedByCompanyMultiplyWeightBy()
    {
        return this.ifPurchasedByCompanyMultiplyWeightBy;
    }
    /** The weight that the Product will be multiplied with if it has not been purchased in the past by any of the provided companies (since <code>SinceUtc</code>). */
    public Double getElseIfNotPurchasedByCompanyMultiplyWeightBy()
    {
        return this.elseIfNotPurchasedByCompanyMultiplyWeightBy;
    }
    /** The minutes since in which a product will be considered relevant to the user if bought previously by them. */
    public @Nullable Integer getSinceMinutesAgo()
    {
        return this.sinceMinutesAgo;
    }
    /** The start of the time period in which a product will be considered relevant to the user if purchased previously by any of the provided companies. */
    public ProductRecentlyPurchasedByCompanyRelevanceModifier setSinceUtc(@Nullable OffsetDateTime sinceUtc)
    {
        this.sinceUtc = sinceUtc;
        return this;
    }
    /** The companies that should be evaluated in this modifier. */
    public ProductRecentlyPurchasedByCompanyRelevanceModifier setCompanyIds(String... companyIds)
    {
        this.companyIds = new ArrayList<>(Arrays.asList(companyIds));;
        return this;
    }
    /** The companies that should be evaluated in this modifier. */
    public ProductRecentlyPurchasedByCompanyRelevanceModifier addToCompanyIds(String companyIds)
    {
        if (this.companyIds == null)
        {
            this.companyIds = new ArrayList<>();
        }
        this.companyIds.add(companyIds);
        return this;
    }
    /** The weight that the Product will be multiplied with if it has been purchased in the past by any of the provided companies (since <code>SinceUtc</code>). */
    public ProductRecentlyPurchasedByCompanyRelevanceModifier setIfPurchasedByCompanyMultiplyWeightBy(Double ifPurchasedByCompanyMultiplyWeightBy)
    {
        this.ifPurchasedByCompanyMultiplyWeightBy = ifPurchasedByCompanyMultiplyWeightBy;
        return this;
    }
    /** The weight that the Product will be multiplied with if it has not been purchased in the past by any of the provided companies (since <code>SinceUtc</code>). */
    public ProductRecentlyPurchasedByCompanyRelevanceModifier setElseIfNotPurchasedByCompanyMultiplyWeightBy(Double elseIfNotPurchasedByCompanyMultiplyWeightBy)
    {
        this.elseIfNotPurchasedByCompanyMultiplyWeightBy = elseIfNotPurchasedByCompanyMultiplyWeightBy;
        return this;
    }
    /** The minutes since in which a product will be considered relevant to the user if bought previously by them. */
    public ProductRecentlyPurchasedByCompanyRelevanceModifier setSinceMinutesAgo(@Nullable Integer sinceMinutesAgo)
    {
        this.sinceMinutesAgo = sinceMinutesAgo;
        return this;
    }
    @Override
    public ProductRecentlyPurchasedByCompanyRelevanceModifier setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
}

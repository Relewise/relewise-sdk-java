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
    
/** a <code>RelevanceModifier</code> that can change the relevance of a Product depending on whether the product has been viewed by any of the provided companies within the provided timespan. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = ProductRecentlyViewedByCompanyRelevanceModifier.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductRecentlyViewedByCompanyRelevanceModifier extends RelevanceModifier implements IProductRelevanceModifier
{
    public String $type = "Relewise.Client.Requests.RelevanceModifiers.ProductRecentlyViewedByCompanyRelevanceModifier, Relewise.Client";
    /** The start of the time period in which a product will be considered relevant to the user if viewed previously by any of the provided companies. */
    public @Nullable OffsetDateTime sinceUtc;
    /** The list of companies. */
    public ArrayList<String> companyIds;
    /** The weight that the Product will be multiplied with if it has been viewed in the past by any of the provided companies (since <code>SinceUtc</code>). */
    public Double ifViewedByCompanyMultiplyWeightBy;
    /** The weight that the Product will be multiplied with if it has not been viewed in the past by the users company (since <code>SinceUtc</code>). */
    public Double elseIfNotViewedByCompanyMultiplyWeightBy;
    /** The minutes since in which a product will be considered relevant to the user if viewed previously by them. */
    public @Nullable Integer sinceMinutesAgo;
    public static ProductRecentlyViewedByCompanyRelevanceModifier create(OffsetDateTime sinceUtc, String... companyIds)
    {
        return new ProductRecentlyViewedByCompanyRelevanceModifier(sinceUtc, companyIds);
    }
    public ProductRecentlyViewedByCompanyRelevanceModifier(OffsetDateTime sinceUtc, String... companyIds)
    {
        this.sinceUtc = sinceUtc;
        this.companyIds = new ArrayList<>(Arrays.asList(companyIds));
        this.ifViewedByCompanyMultiplyWeightBy = 1d;
        this.elseIfNotViewedByCompanyMultiplyWeightBy = 1d;
    }
    /**
     * Creates a <code>RelevanceModifier</code> that can change the relevance of a Product depending on whether the product has been viewed by any of the provided companies within the provided timespan.
     * @param sinceUtc The start of the time period in which a product will be considered relevant to the user if viewed previously by any of the provided companies.
     * @param companyIds The single company that should be evaluated in this filter.
     * @param ifViewedByCompanyMultiplyWeightBy The weight that the Product will be multiplied with if it has been viewed in the past by any of the provided companies (since SinceUtc).
     * @param elseIfNotViewedByCompanyMultiplyWeightBy The weight that the Product will be multiplied with if it has not been viewed in the past by the users company (since SinceUtc).
     */
    public static ProductRecentlyViewedByCompanyRelevanceModifier create(OffsetDateTime sinceUtc, ArrayList<String> companyIds, Double ifViewedByCompanyMultiplyWeightBy, Double elseIfNotViewedByCompanyMultiplyWeightBy)
    {
        return new ProductRecentlyViewedByCompanyRelevanceModifier(sinceUtc, companyIds, ifViewedByCompanyMultiplyWeightBy, elseIfNotViewedByCompanyMultiplyWeightBy);
    }
    /**
     * Creates a <code>RelevanceModifier</code> that can change the relevance of a Product depending on whether the product has been viewed by any of the provided companies within the provided timespan.
     * @param sinceUtc The start of the time period in which a product will be considered relevant to the user if viewed previously by any of the provided companies.
     * @param companyIds The single company that should be evaluated in this filter.
     * @param ifViewedByCompanyMultiplyWeightBy The weight that the Product will be multiplied with if it has been viewed in the past by any of the provided companies (since SinceUtc).
     * @param elseIfNotViewedByCompanyMultiplyWeightBy The weight that the Product will be multiplied with if it has not been viewed in the past by the users company (since SinceUtc).
     */
    public ProductRecentlyViewedByCompanyRelevanceModifier(OffsetDateTime sinceUtc, ArrayList<String> companyIds, Double ifViewedByCompanyMultiplyWeightBy, Double elseIfNotViewedByCompanyMultiplyWeightBy)
    {
        this.sinceUtc = sinceUtc;
        this.companyIds = companyIds;
        this.ifViewedByCompanyMultiplyWeightBy = ifViewedByCompanyMultiplyWeightBy;
        this.elseIfNotViewedByCompanyMultiplyWeightBy = elseIfNotViewedByCompanyMultiplyWeightBy;
    }
    public ProductRecentlyViewedByCompanyRelevanceModifier()
    {
        this.ifViewedByCompanyMultiplyWeightBy = 1d;
        this.elseIfNotViewedByCompanyMultiplyWeightBy = 1d;
    }
    /** The start of the time period in which a product will be considered relevant to the user if viewed previously by any of the provided companies. */
    public @Nullable OffsetDateTime getSinceUtc()
    {
        return this.sinceUtc;
    }
    /** The list of companies. */
    public ArrayList<String> getCompanyIds()
    {
        return this.companyIds;
    }
    /** The weight that the Product will be multiplied with if it has been viewed in the past by any of the provided companies (since <code>SinceUtc</code>). */
    public Double getIfViewedByCompanyMultiplyWeightBy()
    {
        return this.ifViewedByCompanyMultiplyWeightBy;
    }
    /** The weight that the Product will be multiplied with if it has not been viewed in the past by the users company (since <code>SinceUtc</code>). */
    public Double getElseIfNotViewedByCompanyMultiplyWeightBy()
    {
        return this.elseIfNotViewedByCompanyMultiplyWeightBy;
    }
    /** The minutes since in which a product will be considered relevant to the user if viewed previously by them. */
    public @Nullable Integer getSinceMinutesAgo()
    {
        return this.sinceMinutesAgo;
    }
    /** The start of the time period in which a product will be considered relevant to the user if viewed previously by any of the provided companies. */
    public ProductRecentlyViewedByCompanyRelevanceModifier setSinceUtc(@Nullable OffsetDateTime sinceUtc)
    {
        this.sinceUtc = sinceUtc;
        return this;
    }
    /** The list of companies. */
    public ProductRecentlyViewedByCompanyRelevanceModifier setCompanyIds(String... companyIds)
    {
        this.companyIds = new ArrayList<>(Arrays.asList(companyIds));;
        return this;
    }
    /** The list of companies. */
    public ProductRecentlyViewedByCompanyRelevanceModifier addToCompanyIds(String companyIds)
    {
        if (this.companyIds == null)
        {
            this.companyIds = new ArrayList<>();
        }
        this.companyIds.add(companyIds);
        return this;
    }
    /** The weight that the Product will be multiplied with if it has been viewed in the past by any of the provided companies (since <code>SinceUtc</code>). */
    public ProductRecentlyViewedByCompanyRelevanceModifier setIfViewedByCompanyMultiplyWeightBy(Double ifViewedByCompanyMultiplyWeightBy)
    {
        this.ifViewedByCompanyMultiplyWeightBy = ifViewedByCompanyMultiplyWeightBy;
        return this;
    }
    /** The weight that the Product will be multiplied with if it has not been viewed in the past by the users company (since <code>SinceUtc</code>). */
    public ProductRecentlyViewedByCompanyRelevanceModifier setElseIfNotViewedByCompanyMultiplyWeightBy(Double elseIfNotViewedByCompanyMultiplyWeightBy)
    {
        this.elseIfNotViewedByCompanyMultiplyWeightBy = elseIfNotViewedByCompanyMultiplyWeightBy;
        return this;
    }
    /** The minutes since in which a product will be considered relevant to the user if viewed previously by them. */
    public ProductRecentlyViewedByCompanyRelevanceModifier setSinceMinutesAgo(@Nullable Integer sinceMinutesAgo)
    {
        this.sinceMinutesAgo = sinceMinutesAgo;
        return this;
    }
    @Override
    public ProductRecentlyViewedByCompanyRelevanceModifier setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
}

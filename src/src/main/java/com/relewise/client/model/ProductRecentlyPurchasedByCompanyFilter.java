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
    
/** a <code>Filter</code> that can filter on the products recently purchased by some companies. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = ProductRecentlyPurchasedByCompanyFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductRecentlyPurchasedByCompanyFilter extends Filter implements IProductFilter
{
    public String $type = "Relewise.Client.Requests.Filters.ProductRecentlyPurchasedByCompanyFilter, Relewise.Client";
    /** The time from which a <code>Product</code> should have been bought by any of the companies to be included by the filter. */
    public @Nullable OffsetDateTime sinceUtc;
    /** The companies that should be evaluated in this filter. */
    public ArrayList<String> companyIds;
    /** The time in minutes from which a <code>Product</code> should have been viewed by any of the companies to be included by the filter. */
    public @Nullable Integer sinceMinutesAgo;
    public static ProductRecentlyPurchasedByCompanyFilter create(OffsetDateTime sinceUtc)
    {
        return new ProductRecentlyPurchasedByCompanyFilter(sinceUtc);
    }
    public ProductRecentlyPurchasedByCompanyFilter(OffsetDateTime sinceUtc)
    {
        this.sinceUtc = sinceUtc;
        this.negated = false;
    }
    public static ProductRecentlyPurchasedByCompanyFilter create(OffsetDateTime sinceUtc, Boolean negated)
    {
        return new ProductRecentlyPurchasedByCompanyFilter(sinceUtc, negated);
    }
    public ProductRecentlyPurchasedByCompanyFilter(OffsetDateTime sinceUtc, Boolean negated)
    {
        this.sinceUtc = sinceUtc;
        this.negated = negated;
    }
    public ProductRecentlyPurchasedByCompanyFilter()
    {
        this.negated = false;
    }
    /** The time from which a <code>Product</code> should have been bought by any of the companies to be included by the filter. */
    public @Nullable OffsetDateTime getSinceUtc()
    {
        return this.sinceUtc;
    }
    /** The companies that should be evaluated in this filter. */
    public ArrayList<String> getCompanyIds()
    {
        return this.companyIds;
    }
    /** The time in minutes from which a <code>Product</code> should have been viewed by any of the companies to be included by the filter. */
    public @Nullable Integer getSinceMinutesAgo()
    {
        return this.sinceMinutesAgo;
    }
    /** The time from which a <code>Product</code> should have been bought by any of the companies to be included by the filter. */
    public ProductRecentlyPurchasedByCompanyFilter setSinceUtc(@Nullable OffsetDateTime sinceUtc)
    {
        this.sinceUtc = sinceUtc;
        return this;
    }
    /** The companies that should be evaluated in this filter. */
    public ProductRecentlyPurchasedByCompanyFilter setCompanyIds(String... companyIds)
    {
        this.companyIds = new ArrayList<>(Arrays.asList(companyIds));;
        return this;
    }
    /** The companies that should be evaluated in this filter. */
    public ProductRecentlyPurchasedByCompanyFilter addToCompanyIds(String companyIds)
    {
        if (this.companyIds == null)
        {
            this.companyIds = new ArrayList<>();
        }
        this.companyIds.add(companyIds);
        return this;
    }
    /** The time in minutes from which a <code>Product</code> should have been viewed by any of the companies to be included by the filter. */
    public ProductRecentlyPurchasedByCompanyFilter setSinceMinutesAgo(@Nullable Integer sinceMinutesAgo)
    {
        this.sinceMinutesAgo = sinceMinutesAgo;
        return this;
    }
    @Override
    public ProductRecentlyPurchasedByCompanyFilter setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    @Override
    public ProductRecentlyPurchasedByCompanyFilter setSettings(@Nullable FilterSettings settings)
    {
        this.settings = settings;
        return this;
    }
}

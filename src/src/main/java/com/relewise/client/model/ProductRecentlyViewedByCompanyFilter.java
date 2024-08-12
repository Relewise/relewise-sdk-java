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
    
/** a <code>Filter</code> that can filter on the products recently viewed by some companies. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = ProductRecentlyViewedByCompanyFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductRecentlyViewedByCompanyFilter extends Filter implements IProductFilter
{
    public String $type = "Relewise.Client.Requests.Filters.ProductRecentlyViewedByCompanyFilter, Relewise.Client";
    /** The time from which a <code>Product</code> should have been viewed by any of the companies to be included by the filter. */
    public @Nullable OffsetDateTime sinceUtc;
    /** The companies that should be evaluated in this filter. */
    public ArrayList<String> companyIds;
    /** The time in minutes from which a <code>Product</code> should have been viewed by any of the companies to be included by the filter. */
    public @Nullable Integer sinceMinutesAgo;
    public static ProductRecentlyViewedByCompanyFilter create(OffsetDateTime sinceUtc)
    {
        return new ProductRecentlyViewedByCompanyFilter(sinceUtc);
    }
    public ProductRecentlyViewedByCompanyFilter(OffsetDateTime sinceUtc)
    {
        this.sinceUtc = sinceUtc;
        this.negated = false;
    }
    public static ProductRecentlyViewedByCompanyFilter create(OffsetDateTime sinceUtc, Boolean negated)
    {
        return new ProductRecentlyViewedByCompanyFilter(sinceUtc, negated);
    }
    public ProductRecentlyViewedByCompanyFilter(OffsetDateTime sinceUtc, Boolean negated)
    {
        this.sinceUtc = sinceUtc;
        this.negated = negated;
    }
    public ProductRecentlyViewedByCompanyFilter()
    {
        this.negated = false;
    }
    /** The time from which a <code>Product</code> should have been viewed by any of the companies to be included by the filter. */
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
    /** The time from which a <code>Product</code> should have been viewed by any of the companies to be included by the filter. */
    public ProductRecentlyViewedByCompanyFilter setSinceUtc(@Nullable OffsetDateTime sinceUtc)
    {
        this.sinceUtc = sinceUtc;
        return this;
    }
    /** The companies that should be evaluated in this filter. */
    public ProductRecentlyViewedByCompanyFilter setCompanyIds(String... companyIds)
    {
        this.companyIds = new ArrayList<>(Arrays.asList(companyIds));;
        return this;
    }
    /** The companies that should be evaluated in this filter. */
    public ProductRecentlyViewedByCompanyFilter addToCompanyIds(String companyIds)
    {
        if (this.companyIds == null)
        {
            this.companyIds = new ArrayList<>();
        }
        this.companyIds.add(companyIds);
        return this;
    }
    /** The time in minutes from which a <code>Product</code> should have been viewed by any of the companies to be included by the filter. */
    public ProductRecentlyViewedByCompanyFilter setSinceMinutesAgo(@Nullable Integer sinceMinutesAgo)
    {
        this.sinceMinutesAgo = sinceMinutesAgo;
        return this;
    }
    @Override
    public ProductRecentlyViewedByCompanyFilter setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    @Override
    public ProductRecentlyViewedByCompanyFilter setSettings(FilterSettings settings)
    {
        this.settings = settings;
        return this;
    }
}

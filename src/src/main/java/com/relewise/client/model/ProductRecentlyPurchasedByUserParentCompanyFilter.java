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
    
/** a <code>Filter</code> that can filter on the products recently purchased by the parent <code>Company</code> associated to the <code>User</code> used in this query. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = ProductRecentlyPurchasedByUserParentCompanyFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductRecentlyPurchasedByUserParentCompanyFilter extends Filter implements IProductFilter
{
    public String $type = "Relewise.Client.Requests.Filters.ProductRecentlyPurchasedByUserParentCompanyFilter, Relewise.Client";
    /** The time from which a <code>Product</code> should have been bought by any of the companies to be included by the filter. */
    public @Nullable OffsetDateTime sinceUtc;
    /** The time in minutes from which a <code>Product</code> should have been viewed by any of the companies to be included by the filter. */
    public @Nullable Integer sinceMinutesAgo;
    public static ProductRecentlyPurchasedByUserParentCompanyFilter create(OffsetDateTime sinceUtc)
    {
        return new ProductRecentlyPurchasedByUserParentCompanyFilter(sinceUtc);
    }
    public ProductRecentlyPurchasedByUserParentCompanyFilter(OffsetDateTime sinceUtc)
    {
        this.sinceUtc = sinceUtc;
        this.negated = false;
    }
    /**
     * Creates a <code>Filter</code> that can filter on the products recently purchased by the parent <code>Company</code> associated to the <code>User</code> used in this query.
     * @param sinceUtc The time from which a Product should have been bought by any of the companies to be included by the filter.
     * @param negated Defines whether the Filter should exclude the matching entities instead of including the matching entities.
     */
    public static ProductRecentlyPurchasedByUserParentCompanyFilter create(OffsetDateTime sinceUtc, Boolean negated)
    {
        return new ProductRecentlyPurchasedByUserParentCompanyFilter(sinceUtc, negated);
    }
    /**
     * Creates a <code>Filter</code> that can filter on the products recently purchased by the parent <code>Company</code> associated to the <code>User</code> used in this query.
     * @param sinceUtc The time from which a Product should have been bought by any of the companies to be included by the filter.
     * @param negated Defines whether the Filter should exclude the matching entities instead of including the matching entities.
     */
    public ProductRecentlyPurchasedByUserParentCompanyFilter(OffsetDateTime sinceUtc, Boolean negated)
    {
        this.sinceUtc = sinceUtc;
        this.negated = negated;
    }
    public ProductRecentlyPurchasedByUserParentCompanyFilter()
    {
        this.negated = false;
    }
    /** The time from which a <code>Product</code> should have been bought by any of the companies to be included by the filter. */
    public @Nullable OffsetDateTime getSinceUtc()
    {
        return this.sinceUtc;
    }
    /** The time in minutes from which a <code>Product</code> should have been viewed by any of the companies to be included by the filter. */
    public @Nullable Integer getSinceMinutesAgo()
    {
        return this.sinceMinutesAgo;
    }
    /** The time from which a <code>Product</code> should have been bought by any of the companies to be included by the filter. */
    public ProductRecentlyPurchasedByUserParentCompanyFilter setSinceUtc(@Nullable OffsetDateTime sinceUtc)
    {
        this.sinceUtc = sinceUtc;
        return this;
    }
    /** The time in minutes from which a <code>Product</code> should have been viewed by any of the companies to be included by the filter. */
    public ProductRecentlyPurchasedByUserParentCompanyFilter setSinceMinutesAgo(@Nullable Integer sinceMinutesAgo)
    {
        this.sinceMinutesAgo = sinceMinutesAgo;
        return this;
    }
    @Override
    public ProductRecentlyPurchasedByUserParentCompanyFilter setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    @Override
    public ProductRecentlyPurchasedByUserParentCompanyFilter setSettings(@Nullable FilterSettings settings)
    {
        this.settings = settings;
        return this;
    }
}

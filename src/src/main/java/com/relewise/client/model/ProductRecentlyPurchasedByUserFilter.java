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
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = ProductRecentlyPurchasedByUserFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductRecentlyPurchasedByUserFilter extends Filter implements IProductFilter
{
    public String $type = "Relewise.Client.Requests.Filters.ProductRecentlyPurchasedByUserFilter, Relewise.Client";
    public @Nullable OffsetDateTime sinceUtc;
    public @Nullable Integer sinceMinutesAgo;
    public static ProductRecentlyPurchasedByUserFilter create(OffsetDateTime sinceUtc)
    {
        return new ProductRecentlyPurchasedByUserFilter(sinceUtc);
    }
    public ProductRecentlyPurchasedByUserFilter(OffsetDateTime sinceUtc)
    {
        this.sinceUtc = sinceUtc;
        this.negated = false;
    }
    public static ProductRecentlyPurchasedByUserFilter create(OffsetDateTime sinceUtc, Boolean negated)
    {
        return new ProductRecentlyPurchasedByUserFilter(sinceUtc, negated);
    }
    public ProductRecentlyPurchasedByUserFilter(OffsetDateTime sinceUtc, Boolean negated)
    {
        this.sinceUtc = sinceUtc;
        this.negated = negated;
    }
    public ProductRecentlyPurchasedByUserFilter()
    {
        this.negated = false;
    }
    public @Nullable OffsetDateTime getSinceUtc()
    {
        return this.sinceUtc;
    }
    public @Nullable Integer getSinceMinutesAgo()
    {
        return this.sinceMinutesAgo;
    }
    public ProductRecentlyPurchasedByUserFilter setSinceUtc(@Nullable OffsetDateTime sinceUtc)
    {
        this.sinceUtc = sinceUtc;
        return this;
    }
    public ProductRecentlyPurchasedByUserFilter setSinceMinutesAgo(@Nullable Integer sinceMinutesAgo)
    {
        this.sinceMinutesAgo = sinceMinutesAgo;
        return this;
    }
    @Override
    public ProductRecentlyPurchasedByUserFilter setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    @Override
    public ProductRecentlyPurchasedByUserFilter setSettings(@Nullable FilterSettings settings)
    {
        this.settings = settings;
        return this;
    }
}

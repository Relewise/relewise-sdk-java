package com.relewise.client.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.annotation.Nullable;
import java.io.IOException;
import java.time.OffsetDateTime;
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
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = ProductRecentlyPurchasedByUserFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductRecentlyPurchasedByUserFilter extends Filter implements IProductFilter
{
    public String $type = "Relewise.Client.Requests.Filters.ProductRecentlyPurchasedByUserFilter, Relewise.Client";
    public OffsetDateTime sinceUtc;
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
    public OffsetDateTime getSinceUtc()
    {
        return this.sinceUtc;
    }
    public ProductRecentlyPurchasedByUserFilter setSinceUtc(OffsetDateTime sinceUtc)
    {
        this.sinceUtc = sinceUtc;;
        return this;
    }
    @Override
    public ProductRecentlyPurchasedByUserFilter setNegated(Boolean negated)
    {
        this.negated = negated;;
        return this;
    }
}

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
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = ContentCategoryRecentlyViewedByUserFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentCategoryRecentlyViewedByUserFilter extends Filter implements ICategoryFilter
{
    public String $type = "Relewise.Client.Requests.Filters.ContentCategoryRecentlyViewedByUserFilter, Relewise.Client";
    public @Nullable OffsetDateTime sinceUtc;
    public @Nullable Integer sinceMinutesAgo;
    public static ContentCategoryRecentlyViewedByUserFilter create(OffsetDateTime sinceUtc)
    {
        return new ContentCategoryRecentlyViewedByUserFilter(sinceUtc);
    }
    public ContentCategoryRecentlyViewedByUserFilter(OffsetDateTime sinceUtc)
    {
        this.sinceUtc = sinceUtc;
        this.negated = false;
    }
    public static ContentCategoryRecentlyViewedByUserFilter create(OffsetDateTime sinceUtc, Boolean negated)
    {
        return new ContentCategoryRecentlyViewedByUserFilter(sinceUtc, negated);
    }
    public ContentCategoryRecentlyViewedByUserFilter(OffsetDateTime sinceUtc, Boolean negated)
    {
        this.sinceUtc = sinceUtc;
        this.negated = negated;
    }
    public ContentCategoryRecentlyViewedByUserFilter()
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
    public ContentCategoryRecentlyViewedByUserFilter setSinceUtc(@Nullable OffsetDateTime sinceUtc)
    {
        this.sinceUtc = sinceUtc;
        return this;
    }
    public ContentCategoryRecentlyViewedByUserFilter setSinceMinutesAgo(@Nullable Integer sinceMinutesAgo)
    {
        this.sinceMinutesAgo = sinceMinutesAgo;
        return this;
    }
    @Override
    public ContentCategoryRecentlyViewedByUserFilter setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    @Override
    public ContentCategoryRecentlyViewedByUserFilter setSettings(FilterSettings settings)
    {
        this.settings = settings;
        return this;
    }
}

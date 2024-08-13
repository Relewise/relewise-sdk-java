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
    defaultImpl = ContentRecentlyViewedByUserFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentRecentlyViewedByUserFilter extends Filter implements IContentFilter
{
    public String $type = "Relewise.Client.Requests.Filters.ContentRecentlyViewedByUserFilter, Relewise.Client";
    public @Nullable OffsetDateTime sinceUtc;
    public @Nullable Integer sinceMinutesAgo;
    public static ContentRecentlyViewedByUserFilter create(OffsetDateTime sinceUtc)
    {
        return new ContentRecentlyViewedByUserFilter(sinceUtc);
    }
    public ContentRecentlyViewedByUserFilter(OffsetDateTime sinceUtc)
    {
        this.sinceUtc = sinceUtc;
        this.negated = false;
    }
    public static ContentRecentlyViewedByUserFilter create(OffsetDateTime sinceUtc, Boolean negated)
    {
        return new ContentRecentlyViewedByUserFilter(sinceUtc, negated);
    }
    public ContentRecentlyViewedByUserFilter(OffsetDateTime sinceUtc, Boolean negated)
    {
        this.sinceUtc = sinceUtc;
        this.negated = negated;
    }
    public ContentRecentlyViewedByUserFilter()
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
    public ContentRecentlyViewedByUserFilter setSinceUtc(@Nullable OffsetDateTime sinceUtc)
    {
        this.sinceUtc = sinceUtc;
        return this;
    }
    public ContentRecentlyViewedByUserFilter setSinceMinutesAgo(@Nullable Integer sinceMinutesAgo)
    {
        this.sinceMinutesAgo = sinceMinutesAgo;
        return this;
    }
    @Override
    public ContentRecentlyViewedByUserFilter setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    @Override
    public ContentRecentlyViewedByUserFilter setSettings(@Nullable FilterSettings settings)
    {
        this.settings = settings;
        return this;
    }
}

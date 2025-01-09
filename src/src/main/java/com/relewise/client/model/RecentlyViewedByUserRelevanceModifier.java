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
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ProductRecentlyViewedByUserRelevanceModifier.class, name = "Relewise.Client.Requests.RelevanceModifiers.ProductRecentlyViewedByUserRelevanceModifier, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentRecentlyViewedByUserRelevanceModifier.class, name = "Relewise.Client.Requests.RelevanceModifiers.ContentRecentlyViewedByUserRelevanceModifier, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductCategoryRecentlyViewedByUserRelevanceModifier.class, name = "Relewise.Client.Requests.RelevanceModifiers.ProductCategoryRecentlyViewedByUserRelevanceModifier, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentCategoryRecentlyViewedByUserRelevanceModifier.class, name = "Relewise.Client.Requests.RelevanceModifiers.ContentCategoryRecentlyViewedByUserRelevanceModifier, Relewise.Client"),
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class RecentlyViewedByUserRelevanceModifier extends RelevanceModifier
{
    public String $type = "";
    /** The start of the time period in which an entity will be considered relevant to the user if viewed previously by them. */
    public @Nullable OffsetDateTime sinceUtc;
    /** The weight that the entity will be multiplied with if it has been viewed in the past by the user (since <code>SinceUtc</code>). */
    public Double ifPreviouslyViewedByUserMultiplyWeightBy;
    /** The weight that the entity will be multiplied with if it has not been viewed in the past by the user (since <code>SinceUtc</code>). */
    public Double ifNotPreviouslyViewedByUserMultiplyWeightBy;
    /** The minutes since in which an entity will be considered relevant to the user if viewed previously by them. */
    public @Nullable Integer sinceMinutesAgo;
    /** The start of the time period in which an entity will be considered relevant to the user if viewed previously by them. */
    public @Nullable OffsetDateTime getSinceUtc()
    {
        return this.sinceUtc;
    }
    /** The weight that the entity will be multiplied with if it has been viewed in the past by the user (since <code>SinceUtc</code>). */
    public Double getIfPreviouslyViewedByUserMultiplyWeightBy()
    {
        return this.ifPreviouslyViewedByUserMultiplyWeightBy;
    }
    /** The weight that the entity will be multiplied with if it has not been viewed in the past by the user (since <code>SinceUtc</code>). */
    public Double getIfNotPreviouslyViewedByUserMultiplyWeightBy()
    {
        return this.ifNotPreviouslyViewedByUserMultiplyWeightBy;
    }
    /** The minutes since in which an entity will be considered relevant to the user if viewed previously by them. */
    public @Nullable Integer getSinceMinutesAgo()
    {
        return this.sinceMinutesAgo;
    }
    /** The start of the time period in which an entity will be considered relevant to the user if viewed previously by them. */
    public RecentlyViewedByUserRelevanceModifier setSinceUtc(@Nullable OffsetDateTime sinceUtc)
    {
        this.sinceUtc = sinceUtc;
        return this;
    }
    /** The weight that the entity will be multiplied with if it has been viewed in the past by the user (since <code>SinceUtc</code>). */
    public RecentlyViewedByUserRelevanceModifier setIfPreviouslyViewedByUserMultiplyWeightBy(Double ifPreviouslyViewedByUserMultiplyWeightBy)
    {
        this.ifPreviouslyViewedByUserMultiplyWeightBy = ifPreviouslyViewedByUserMultiplyWeightBy;
        return this;
    }
    /** The weight that the entity will be multiplied with if it has not been viewed in the past by the user (since <code>SinceUtc</code>). */
    public RecentlyViewedByUserRelevanceModifier setIfNotPreviouslyViewedByUserMultiplyWeightBy(Double ifNotPreviouslyViewedByUserMultiplyWeightBy)
    {
        this.ifNotPreviouslyViewedByUserMultiplyWeightBy = ifNotPreviouslyViewedByUserMultiplyWeightBy;
        return this;
    }
    /** The minutes since in which an entity will be considered relevant to the user if viewed previously by them. */
    public RecentlyViewedByUserRelevanceModifier setSinceMinutesAgo(@Nullable Integer sinceMinutesAgo)
    {
        this.sinceMinutesAgo = sinceMinutesAgo;
        return this;
    }
    @Override
    public RecentlyViewedByUserRelevanceModifier setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
}

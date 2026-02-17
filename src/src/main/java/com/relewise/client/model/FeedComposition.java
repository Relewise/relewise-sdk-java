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
    
/** Defines an element in the feed composition, specifying the type of entity, the count of entities to include, as well as any filters or relevance modifiers that should be applied in addition to any global ones. */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FeedComposition
{
    /** Gets or sets the type of the entity. */
    public FeedCompositionEntityType type;
    /** Gets or sets the desired number of elements to return. 1-1 means exactly 1 element, 0-1 means up to 1 element, 1-5 means between 1 and 5 elements, etc. If the lower bound and upper bound are not equal, the evaluated relevancy will determine how many elements within the allowed range to return. If the lower bound is greater than 0, the feed will always return at least that many elements (unless overridden via <code>Fill</code>), potentially of lower quality. If fewer relevant items are available than requested, the default fill strategy will be used, unless overridden via <code>Fill</code>. Note: The specified lower bound is not guaranteed to be met if filters on either <code>FeedRecommendationInitializationRequest</code>, <code>FeedComposition</code>, or via Merchandising prevent the requested number of items from being found. */
    public IntegerRange count;
    /** Additional filters that should be applied. */
    public @Nullable FilterCollection filters;
    /** Additional relevance modifiers that should be applied. */
    public @Nullable RelevanceModifierCollection relevanceModifiers;
    /** Optionally provide an alternative fill strategy for this composition element, which will be used if fewer relevant items are available than requested via the lower bound of <code>Count</code>. Tip: You may recursively configure a nested chain of fallbacks via <code>Fill</code> on the <code>Fill</code> element for advanced composition needs. */
    public @Nullable FeedComposition fill;
    /** An optional name for the composition element, useful if you need to know from which composition element a result entity was returned for rendering or debugging purposes. If set, this name will be returned for results based on this composition element in <code>Name</code>. */
    public @Nullable String name;
    /** Determines whether to include empty results for this composition element. Useful in combination with <code>Name</code> if you need to show a placeholder or alternative content when no results are found for this composition element. The default is false, meaning empty results will not be included in recommendation responses. */
    public Boolean includeEmptyResults;
    /** If specified, this composition will only be included in the rotation the specified number of times. Any subsequent rotations will exclude this composition element. Leave null to apply no limit. */
    public @Nullable Integer rotationLimit;
    /** If specified (minimum 1), this composition will only be included in the rotation the specified number of times per request. Any subsequent rotations within the same request will exclude this composition element. Leave null to apply no per-request limit. */
    public @Nullable Integer rotationLimitPerRequest;
    /** If true, the entire composition element will be skipped if the requested count cannot be met. Example: If true: Requesting 3-5 results, but only 2 are available, then those 2 will be dropped as the lower bound of 3 cannot be met. Example: If false (default): Requesting 3-5 results, but only 2 are available, then those 2 will still be returned. */
    public Boolean skipEntirelyIfUnableToMeetCount;
    /**
     * Initializes a new instance of the <code>FeedComposition</code> class.
     * @param type The type of the entity represented by this composition element.
     * @param count The desired range of counts for the entity. The lower bound must be greater than or equal to 0, and the upper bound must be at least 1 and greater than or equal to the lower bound.
     */
    public static FeedComposition create(FeedCompositionEntityType type, IntegerRange count)
    {
        return new FeedComposition(type, count);
    }
    /**
     * Initializes a new instance of the <code>FeedComposition</code> class.
     * @param type The type of the entity represented by this composition element.
     * @param count The desired range of counts for the entity. The lower bound must be greater than or equal to 0, and the upper bound must be at least 1 and greater than or equal to the lower bound.
     */
    public FeedComposition(FeedCompositionEntityType type, IntegerRange count)
    {
        this.type = type;
        this.count = count;
    }
    public FeedComposition()
    {
    }
    /** Gets or sets the type of the entity. */
    public FeedCompositionEntityType getType()
    {
        return this.type;
    }
    /** Gets or sets the desired number of elements to return. 1-1 means exactly 1 element, 0-1 means up to 1 element, 1-5 means between 1 and 5 elements, etc. If the lower bound and upper bound are not equal, the evaluated relevancy will determine how many elements within the allowed range to return. If the lower bound is greater than 0, the feed will always return at least that many elements (unless overridden via <code>Fill</code>), potentially of lower quality. If fewer relevant items are available than requested, the default fill strategy will be used, unless overridden via <code>Fill</code>. Note: The specified lower bound is not guaranteed to be met if filters on either <code>FeedRecommendationInitializationRequest</code>, <code>FeedComposition</code>, or via Merchandising prevent the requested number of items from being found. */
    public IntegerRange getCount()
    {
        return this.count;
    }
    /** Additional filters that should be applied. */
    public @Nullable FilterCollection getFilters()
    {
        return this.filters;
    }
    /** Additional relevance modifiers that should be applied. */
    public @Nullable RelevanceModifierCollection getRelevanceModifiers()
    {
        return this.relevanceModifiers;
    }
    /** Optionally provide an alternative fill strategy for this composition element, which will be used if fewer relevant items are available than requested via the lower bound of <code>Count</code>. Tip: You may recursively configure a nested chain of fallbacks via <code>Fill</code> on the <code>Fill</code> element for advanced composition needs. */
    public @Nullable FeedComposition getFill()
    {
        return this.fill;
    }
    /** An optional name for the composition element, useful if you need to know from which composition element a result entity was returned for rendering or debugging purposes. If set, this name will be returned for results based on this composition element in <code>Name</code>. */
    public @Nullable String getName()
    {
        return this.name;
    }
    /** Determines whether to include empty results for this composition element. Useful in combination with <code>Name</code> if you need to show a placeholder or alternative content when no results are found for this composition element. The default is false, meaning empty results will not be included in recommendation responses. */
    public Boolean getIncludeEmptyResults()
    {
        return this.includeEmptyResults;
    }
    /** If specified, this composition will only be included in the rotation the specified number of times. Any subsequent rotations will exclude this composition element. Leave null to apply no limit. */
    public @Nullable Integer getRotationLimit()
    {
        return this.rotationLimit;
    }
    /** If specified (minimum 1), this composition will only be included in the rotation the specified number of times per request. Any subsequent rotations within the same request will exclude this composition element. Leave null to apply no per-request limit. */
    public @Nullable Integer getRotationLimitPerRequest()
    {
        return this.rotationLimitPerRequest;
    }
    /** If true, the entire composition element will be skipped if the requested count cannot be met. Example: If true: Requesting 3-5 results, but only 2 are available, then those 2 will be dropped as the lower bound of 3 cannot be met. Example: If false (default): Requesting 3-5 results, but only 2 are available, then those 2 will still be returned. */
    public Boolean getSkipEntirelyIfUnableToMeetCount()
    {
        return this.skipEntirelyIfUnableToMeetCount;
    }
    /** Gets or sets the type of the entity. */
    public FeedComposition setType(FeedCompositionEntityType type)
    {
        this.type = type;
        return this;
    }
    /** Gets or sets the desired number of elements to return. 1-1 means exactly 1 element, 0-1 means up to 1 element, 1-5 means between 1 and 5 elements, etc. If the lower bound and upper bound are not equal, the evaluated relevancy will determine how many elements within the allowed range to return. If the lower bound is greater than 0, the feed will always return at least that many elements (unless overridden via <code>Fill</code>), potentially of lower quality. If fewer relevant items are available than requested, the default fill strategy will be used, unless overridden via <code>Fill</code>. Note: The specified lower bound is not guaranteed to be met if filters on either <code>FeedRecommendationInitializationRequest</code>, <code>FeedComposition</code>, or via Merchandising prevent the requested number of items from being found. */
    public FeedComposition setCount(IntegerRange count)
    {
        this.count = count;
        return this;
    }
    /** Additional filters that should be applied. */
    public FeedComposition setFilters(@Nullable FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
    /** Additional relevance modifiers that should be applied. */
    public FeedComposition setRelevanceModifiers(@Nullable RelevanceModifierCollection relevanceModifiers)
    {
        this.relevanceModifiers = relevanceModifiers;
        return this;
    }
    /** Optionally provide an alternative fill strategy for this composition element, which will be used if fewer relevant items are available than requested via the lower bound of <code>Count</code>. Tip: You may recursively configure a nested chain of fallbacks via <code>Fill</code> on the <code>Fill</code> element for advanced composition needs. */
    public FeedComposition setFill(@Nullable FeedComposition fill)
    {
        this.fill = fill;
        return this;
    }
    /** An optional name for the composition element, useful if you need to know from which composition element a result entity was returned for rendering or debugging purposes. If set, this name will be returned for results based on this composition element in <code>Name</code>. */
    public FeedComposition setName(@Nullable String name)
    {
        this.name = name;
        return this;
    }
    /** Determines whether to include empty results for this composition element. Useful in combination with <code>Name</code> if you need to show a placeholder or alternative content when no results are found for this composition element. The default is false, meaning empty results will not be included in recommendation responses. */
    public FeedComposition setIncludeEmptyResults(Boolean includeEmptyResults)
    {
        this.includeEmptyResults = includeEmptyResults;
        return this;
    }
    /** If specified, this composition will only be included in the rotation the specified number of times. Any subsequent rotations will exclude this composition element. Leave null to apply no limit. */
    public FeedComposition setRotationLimit(@Nullable Integer rotationLimit)
    {
        this.rotationLimit = rotationLimit;
        return this;
    }
    /** If specified (minimum 1), this composition will only be included in the rotation the specified number of times per request. Any subsequent rotations within the same request will exclude this composition element. Leave null to apply no per-request limit. */
    public FeedComposition setRotationLimitPerRequest(@Nullable Integer rotationLimitPerRequest)
    {
        this.rotationLimitPerRequest = rotationLimitPerRequest;
        return this;
    }
    /** If true, the entire composition element will be skipped if the requested count cannot be met. Example: If true: Requesting 3-5 results, but only 2 are available, then those 2 will be dropped as the lower bound of 3 cannot be met. Example: If false (default): Requesting 3-5 results, but only 2 are available, then those 2 will still be returned. */
    public FeedComposition setSkipEntirelyIfUnableToMeetCount(Boolean skipEntirelyIfUnableToMeetCount)
    {
        this.skipEntirelyIfUnableToMeetCount = skipEntirelyIfUnableToMeetCount;
        return this;
    }
}

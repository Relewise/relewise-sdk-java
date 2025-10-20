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
    
/** A lightweight request for the next page of recommendations for an already initialized feed. A new feed must first be initialized using <code>FeedRecommendationInitializationRequest</code> before this request can be made. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = FeedRecommendationNextItemsRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FeedRecommendationNextItemsRequest extends LicensedRequest
{
    public String $type = "Relewise.Client.Requests.Recommendations.Feed.FeedRecommendationNextItemsRequest, Relewise.Client";
    /** The ID of the initialized feed to get the next page of recommendations from. This ID is first returned as <code>InitializedFeedId</code> as a result of a successful <code>FeedRecommendationInitializationRequest</code>. */
    public UUID initializedFeedId;
    /**
     * Initializes a new instance of the <code>FeedRecommendationNextItemsRequest</code> class for fetching subsequent pages of a feed already initialized via <code>FeedRecommendationInitializationRequest</code>.
     * @param initializedFeedId The ID of the initialized feed to get the next page of recommendations for.
     */
    public static FeedRecommendationNextItemsRequest create(UUID initializedFeedId)
    {
        return new FeedRecommendationNextItemsRequest(initializedFeedId);
    }
    /**
     * Initializes a new instance of the <code>FeedRecommendationNextItemsRequest</code> class for fetching subsequent pages of a feed already initialized via <code>FeedRecommendationInitializationRequest</code>.
     * @param initializedFeedId The ID of the initialized feed to get the next page of recommendations for.
     */
    public FeedRecommendationNextItemsRequest(UUID initializedFeedId)
    {
        this.initializedFeedId = initializedFeedId;
    }
    public FeedRecommendationNextItemsRequest()
    {
    }
    /** The ID of the initialized feed to get the next page of recommendations from. This ID is first returned as <code>InitializedFeedId</code> as a result of a successful <code>FeedRecommendationInitializationRequest</code>. */
    public UUID getInitializedFeedId()
    {
        return this.initializedFeedId;
    }
    /** The ID of the initialized feed to get the next page of recommendations from. This ID is first returned as <code>InitializedFeedId</code> as a result of a successful <code>FeedRecommendationInitializationRequest</code>. */
    public FeedRecommendationNextItemsRequest setInitializedFeedId(UUID initializedFeedId)
    {
        this.initializedFeedId = initializedFeedId;
        return this;
    }
}

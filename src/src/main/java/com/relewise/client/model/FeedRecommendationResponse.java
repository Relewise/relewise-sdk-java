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
    
/** The response type for <code>FeedRecommendationInitializationRequest</code> for initialization and retrieval of the first page of results, and <code>FeedRecommendationNextItemsRequest</code> for subsequent pages of results. Contains the initialized feed ID and a collection of <code>FeedCompositionResult</code> which may contain either product or content results, depending on the request composition configuration. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = FeedRecommendationResponse.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FeedRecommendationResponse extends RecommendationResponse
{
    public String $type = "Relewise.Client.Responses.FeedRecommendationResponse, Relewise.Client";
    /** The ID of the initialized feed. This ID is needed in future requests of type <code>FeedRecommendationNextItemsRequest</code> to retrieve additional results for the initialized feed. Once a feed has been initialized via <code>FeedRecommendationInitializationRequest</code>, the returned <code>InitializedFeedId</code> can be stored and reused to retrieve all subsequent pages of results using <code>FeedRecommendationNextItemsRequest</code>. */
    public UUID initializedFeedId;
    /** The feed recommendations consisting of a collection of <code>FeedCompositionResult</code>, each containing either product or content results, and optionally the composition name if requested. Note: May contain empty cFeedComposition if requested via <code>IncludeEmptyResults</code>. */
    public FeedCompositionResult[] recommendations;
    /**
     * Initializes a new instance of the <code>FeedRecommendationResponse</code> class with the specified feed ID.
     * @param initializedFeedId The ID of the initialized feed.
     * @param recommendations The recommended feed items
     */
    public static FeedRecommendationResponse create(UUID initializedFeedId, FeedCompositionResult... recommendations)
    {
        return new FeedRecommendationResponse(initializedFeedId, recommendations);
    }
    /**
     * Initializes a new instance of the <code>FeedRecommendationResponse</code> class with the specified feed ID.
     * @param initializedFeedId The ID of the initialized feed.
     * @param recommendations The recommended feed items
     */
    public FeedRecommendationResponse(UUID initializedFeedId, FeedCompositionResult... recommendations)
    {
        this.initializedFeedId = initializedFeedId;
        this.recommendations = recommendations;
    }
    public FeedRecommendationResponse()
    {
    }
    /** The ID of the initialized feed. This ID is needed in future requests of type <code>FeedRecommendationNextItemsRequest</code> to retrieve additional results for the initialized feed. Once a feed has been initialized via <code>FeedRecommendationInitializationRequest</code>, the returned <code>InitializedFeedId</code> can be stored and reused to retrieve all subsequent pages of results using <code>FeedRecommendationNextItemsRequest</code>. */
    public UUID getInitializedFeedId()
    {
        return this.initializedFeedId;
    }
    /** The feed recommendations consisting of a collection of <code>FeedCompositionResult</code>, each containing either product or content results, and optionally the composition name if requested. Note: May contain empty cFeedComposition if requested via <code>IncludeEmptyResults</code>. */
    public FeedCompositionResult[] getRecommendations()
    {
        return this.recommendations;
    }
    /** The ID of the initialized feed. This ID is needed in future requests of type <code>FeedRecommendationNextItemsRequest</code> to retrieve additional results for the initialized feed. Once a feed has been initialized via <code>FeedRecommendationInitializationRequest</code>, the returned <code>InitializedFeedId</code> can be stored and reused to retrieve all subsequent pages of results using <code>FeedRecommendationNextItemsRequest</code>. */
    public FeedRecommendationResponse setInitializedFeedId(UUID initializedFeedId)
    {
        this.initializedFeedId = initializedFeedId;
        return this;
    }
    /** The feed recommendations consisting of a collection of <code>FeedCompositionResult</code>, each containing either product or content results, and optionally the composition name if requested. Note: May contain empty cFeedComposition if requested via <code>IncludeEmptyResults</code>. */
    public FeedRecommendationResponse setRecommendations(FeedCompositionResult... recommendations)
    {
        this.recommendations = recommendations;
        return this;
    }
    /** The feed recommendations consisting of a collection of <code>FeedCompositionResult</code>, each containing either product or content results, and optionally the composition name if requested. Note: May contain empty cFeedComposition if requested via <code>IncludeEmptyResults</code>. */
    public FeedRecommendationResponse addToRecommendations(FeedCompositionResult recommendation)
    {
        if (this.recommendations == null)
        {
            this.recommendations = new FeedCompositionResult[] { recommendation };
        }
        else
        {
            ArrayList<FeedCompositionResult> existingList = new ArrayList<>(Arrays.asList(this.recommendations));
            existingList.add(recommendation);
            this.recommendations = existingList.toArray(new FeedCompositionResult[0]);
        }
        return this;
    }
    @Override
    public FeedRecommendationResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;
        return this;
    }
}

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
    defaultImpl = ContentRecommendationRequestCollection.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentRecommendationRequestCollection extends LicensedRequest
{
    public String $type = "Relewise.Client.Requests.Recommendations.ContentRecommendationRequestCollection, Relewise.Client";
    public ArrayList<ContentRecommendationRequest> requests;
    public Boolean requireDistinctContentsAcrossResults;
    /** Default context values used to determine which merchandising rules apply to requests in this batch, such as DeviceType=Mobile or SplitTestVariant=A. */
    public @Nullable HashMap<String, String> contextValues;
    public static ContentRecommendationRequestCollection create(Boolean requireDistinctContentsAcrossResults, ContentRecommendationRequest... requests)
    {
        return new ContentRecommendationRequestCollection(requireDistinctContentsAcrossResults, requests);
    }
    public ContentRecommendationRequestCollection(Boolean requireDistinctContentsAcrossResults, ContentRecommendationRequest... requests)
    {
        this.requireDistinctContentsAcrossResults = requireDistinctContentsAcrossResults;
        this.requests = new ArrayList<>(Arrays.asList(requests));
    }
    public static ContentRecommendationRequestCollection create(Boolean requireDistinctContentsAcrossResults)
    {
        return new ContentRecommendationRequestCollection(requireDistinctContentsAcrossResults);
    }
    public ContentRecommendationRequestCollection(Boolean requireDistinctContentsAcrossResults)
    {
        this.requireDistinctContentsAcrossResults = requireDistinctContentsAcrossResults;
    }
    public ContentRecommendationRequestCollection()
    {
    }
    public ArrayList<ContentRecommendationRequest> getRequests()
    {
        return this.requests;
    }
    public Boolean getRequireDistinctContentsAcrossResults()
    {
        return this.requireDistinctContentsAcrossResults;
    }
    /** Default context values used to determine which merchandising rules apply to requests in this batch, such as DeviceType=Mobile or SplitTestVariant=A. */
    public @Nullable HashMap<String, String> getContextValues()
    {
        return this.contextValues;
    }
    public ContentRecommendationRequestCollection setRequests(ContentRecommendationRequest... requests)
    {
        this.requests = new ArrayList<>(Arrays.asList(requests));;
        return this;
    }
    public ContentRecommendationRequestCollection addToRequests(ContentRecommendationRequest requests)
    {
        if (this.requests == null)
        {
            this.requests = new ArrayList<>();
        }
        this.requests.add(requests);
        return this;
    }
    public ContentRecommendationRequestCollection setRequireDistinctContentsAcrossResults(Boolean requireDistinctContentsAcrossResults)
    {
        this.requireDistinctContentsAcrossResults = requireDistinctContentsAcrossResults;
        return this;
    }
    /** Default context values used to determine which merchandising rules apply to requests in this batch, such as DeviceType=Mobile or SplitTestVariant=A. */
    public ContentRecommendationRequestCollection addToContextValues(String key, String value)
    {
        if (this.contextValues == null)
        {
            this.contextValues = new HashMap<>();
        }
        this.contextValues.put(key, value);
        return this;
    }
    /** Default context values used to determine which merchandising rules apply to requests in this batch, such as DeviceType=Mobile or SplitTestVariant=A. */
    public ContentRecommendationRequestCollection setContextValues(@Nullable HashMap<String, String> contextValues)
    {
        this.contextValues = contextValues;
        return this;
    }
}

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
    defaultImpl = ContentRecommendationRequestCollection.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentRecommendationRequestCollection extends LicensedRequest
{
    public String $type = "Relewise.Client.Requests.Recommendations.ContentRecommendationRequestCollection, Relewise.Client";
    public ArrayList<ContentRecommendationRequest> requests;
    public Boolean requireDistinctContentAcrossResults;
    public static ContentRecommendationRequestCollection create(Boolean requireDistinctContentsAcrossResults, ContentRecommendationRequest... requests)
    {
        return new ContentRecommendationRequestCollection(requireDistinctContentsAcrossResults, requests);
    }
    public ContentRecommendationRequestCollection(Boolean requireDistinctContentsAcrossResults, ContentRecommendationRequest... requests)
    {
        this.requireDistinctContentAcrossResults = requireDistinctContentsAcrossResults;
        this.requests = new ArrayList<>(Arrays.asList(requests));
    }
    public ContentRecommendationRequestCollection()
    {
    }
    public ArrayList<ContentRecommendationRequest> getRequests()
    {
        return this.requests;
    }
    public Boolean getRequireDistinctContentAcrossResults()
    {
        return this.requireDistinctContentAcrossResults;
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
    public ContentRecommendationRequestCollection setRequireDistinctContentAcrossResults(Boolean requireDistinctContentAcrossResults)
    {
        this.requireDistinctContentAcrossResults = requireDistinctContentAcrossResults;
        return this;
    }
}

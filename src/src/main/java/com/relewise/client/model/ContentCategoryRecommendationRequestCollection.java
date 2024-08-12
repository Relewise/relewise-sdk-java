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
    defaultImpl = ContentCategoryRecommendationRequestCollection.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentCategoryRecommendationRequestCollection extends LicensedRequest
{
    public String $type = "Relewise.Client.Requests.Recommendations.ContentCategoryRecommendationRequestCollection, Relewise.Client";
    public ArrayList<ContentCategoryRecommendationRequest> requests;
    public Boolean requireDistinctCategoriesAcrossResults;
    public static ContentCategoryRecommendationRequestCollection create(Boolean requireDistinctCategoriesesAcrossResults, ContentCategoryRecommendationRequest... requests)
    {
        return new ContentCategoryRecommendationRequestCollection(requireDistinctCategoriesesAcrossResults, requests);
    }
    public ContentCategoryRecommendationRequestCollection(Boolean requireDistinctCategoriesesAcrossResults, ContentCategoryRecommendationRequest... requests)
    {
        this.requireDistinctCategoriesAcrossResults = requireDistinctCategoriesesAcrossResults;
        this.requests = new ArrayList<>(Arrays.asList(requests));
    }
    public ContentCategoryRecommendationRequestCollection()
    {
    }
    public ArrayList<ContentCategoryRecommendationRequest> getRequests()
    {
        return this.requests;
    }
    public Boolean getRequireDistinctCategoriesAcrossResults()
    {
        return this.requireDistinctCategoriesAcrossResults;
    }
    public ContentCategoryRecommendationRequestCollection setRequests(ContentCategoryRecommendationRequest... requests)
    {
        this.requests = new ArrayList<>(Arrays.asList(requests));;
        return this;
    }
    public ContentCategoryRecommendationRequestCollection addToRequests(ContentCategoryRecommendationRequest requests)
    {
        if (this.requests == null)
        {
            this.requests = new ArrayList<>();
        }
        this.requests.add(requests);
        return this;
    }
    public ContentCategoryRecommendationRequestCollection setRequireDistinctCategoriesAcrossResults(Boolean requireDistinctCategoriesAcrossResults)
    {
        this.requireDistinctCategoriesAcrossResults = requireDistinctCategoriesAcrossResults;
        return this;
    }
}

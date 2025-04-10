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
    defaultImpl = ContentSearchResponse.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentSearchResponse extends PaginatedSearchResponse
{
    public String $type = "Relewise.Client.Responses.Search.ContentSearchResponse, Relewise.Client";
    public ContentResult[] results;
    public ContentFacetResult facets;
    public ContentResult[] recommendations;
    public static ContentSearchResponse create()
    {
        return new ContentSearchResponse();
    }
    public ContentSearchResponse()
    {
    }
    public ContentResult[] getResults()
    {
        return this.results;
    }
    public ContentFacetResult getFacets()
    {
        return this.facets;
    }
    public ContentResult[] getRecommendations()
    {
        return this.recommendations;
    }
    public ContentSearchResponse setResults(ContentResult... results)
    {
        this.results = results;
        return this;
    }
    public ContentSearchResponse addToResults(ContentResult result)
    {
        if (this.results == null)
        {
            this.results = new ContentResult[] { result };
        }
        else
        {
            ArrayList<ContentResult> existingList = new ArrayList<>(Arrays.asList(this.results));
            existingList.add(result);
            this.results = existingList.toArray(new ContentResult[0]);
        }
        return this;
    }
    public ContentSearchResponse setFacets(ContentFacetResult facets)
    {
        this.facets = facets;
        return this;
    }
    public ContentSearchResponse setRecommendations(ContentResult... recommendations)
    {
        this.recommendations = recommendations;
        return this;
    }
    public ContentSearchResponse addToRecommendations(ContentResult recommendation)
    {
        if (this.recommendations == null)
        {
            this.recommendations = new ContentResult[] { recommendation };
        }
        else
        {
            ArrayList<ContentResult> existingList = new ArrayList<>(Arrays.asList(this.recommendations));
            existingList.add(recommendation);
            this.recommendations = existingList.toArray(new ContentResult[0]);
        }
        return this;
    }
    @Override
    public ContentSearchResponse setHits(Integer hits)
    {
        this.hits = hits;
        return this;
    }
    @Override
    public ContentSearchResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;
        return this;
    }
}

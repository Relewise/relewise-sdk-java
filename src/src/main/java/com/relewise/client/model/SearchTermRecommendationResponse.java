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
    defaultImpl = SearchTermRecommendationResponse.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchTermRecommendationResponse extends RecommendationResponse
{
    public String $type = "Relewise.Client.Responses.SearchTermRecommendationResponse, Relewise.Client";
    public SearchTermResult[] recommendations;
    public static SearchTermRecommendationResponse create()
    {
        return new SearchTermRecommendationResponse();
    }
    public SearchTermRecommendationResponse()
    {
    }
    public SearchTermResult[] getRecommendations()
    {
        return this.recommendations;
    }
    public SearchTermRecommendationResponse setRecommendations(SearchTermResult... recommendations)
    {
        this.recommendations = recommendations;
        return this;
    }
    public SearchTermRecommendationResponse addToRecommendations(SearchTermResult recommendation)
    {
        if (this.recommendations == null)
        {
            this.recommendations = new SearchTermResult[] { recommendation };
        }
        else
        {
            ArrayList<SearchTermResult> existingList = new ArrayList<>(Arrays.asList(this.recommendations));
            existingList.add(recommendation);
            this.recommendations = existingList.toArray(new SearchTermResult[0]);
        }
        return this;
    }
    @Override
    public SearchTermRecommendationResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;
        return this;
    }
}

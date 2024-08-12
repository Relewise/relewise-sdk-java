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
    defaultImpl = ContentRecommendationResponse.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentRecommendationResponse extends RecommendationResponse
{
    public String $type = "Relewise.Client.Responses.ContentRecommendationResponse, Relewise.Client";
    public ContentResult[] recommendations;
    public static ContentRecommendationResponse create(ContentResult... recommendations)
    {
        return new ContentRecommendationResponse(recommendations);
    }
    public ContentRecommendationResponse(ContentResult... recommendations)
    {
        this.recommendations = recommendations;
    }
    public ContentRecommendationResponse()
    {
    }
    public ContentResult[] getRecommendations()
    {
        return this.recommendations;
    }
    public ContentRecommendationResponse setRecommendations(ContentResult... recommendations)
    {
        this.recommendations = recommendations;
        return this;
    }
    public ContentRecommendationResponse addToRecommendations(ContentResult recommendation)
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
    public ContentRecommendationResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;
        return this;
    }
}

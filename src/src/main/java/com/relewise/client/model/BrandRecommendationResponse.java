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
    defaultImpl = BrandRecommendationResponse.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BrandRecommendationResponse extends RecommendationResponse
{
    public String $type = "Relewise.Client.Responses.BrandRecommendationResponse, Relewise.Client";
    public BrandResult[] recommendations;
    public static BrandRecommendationResponse create(BrandResult... recommendations)
    {
        return new BrandRecommendationResponse(recommendations);
    }
    public BrandRecommendationResponse(BrandResult... recommendations)
    {
        this.recommendations = recommendations;
    }
    public BrandRecommendationResponse()
    {
    }
    public BrandResult[] getRecommendations()
    {
        return this.recommendations;
    }
    public BrandRecommendationResponse setRecommendations(BrandResult... recommendations)
    {
        this.recommendations = recommendations;
        return this;
    }
    public BrandRecommendationResponse addToRecommendations(BrandResult recommendation)
    {
        if (this.recommendations == null)
        {
            this.recommendations = new BrandResult[] { recommendation };
        }
        else
        {
            ArrayList<BrandResult> existingList = new ArrayList<>(Arrays.asList(this.recommendations));
            existingList.add(recommendation);
            this.recommendations = existingList.toArray(new BrandResult[0]);
        }
        return this;
    }
    @Override
    public BrandRecommendationResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;
        return this;
    }
}

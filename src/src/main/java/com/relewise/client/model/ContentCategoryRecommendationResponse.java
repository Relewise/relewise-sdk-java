package com.relewise.client.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
    defaultImpl = ContentCategoryRecommendationResponse.class)
public class ContentCategoryRecommendationResponse extends RecommendationResponse
{
    public String $type = "Relewise.Client.Responses.ContentCategoryRecommendationResponse, Relewise.Client";
    public ContentCategoryResult[] recommendations;
    public static ContentCategoryRecommendationResponse create(ContentCategoryResult... recommendations)
    {
        return new ContentCategoryRecommendationResponse(recommendations);
    }
    public ContentCategoryRecommendationResponse(ContentCategoryResult... recommendations)
    {
        this.recommendations = recommendations;
    }
    public ContentCategoryRecommendationResponse()
    {
    }
    public ContentCategoryResult[] getRecommendations()
    {
        return this.recommendations;
    }
    public ContentCategoryRecommendationResponse setRecommendations(ContentCategoryResult... recommendations)
    {
        this.recommendations = recommendations;;
        return this;
    }
    public ContentCategoryRecommendationResponse addToRecommendations(ContentCategoryResult recommendation)
    {
        if (this.recommendations == null)
        {
            this.recommendations = new ContentCategoryResult[] { recommendation };
        }
        else
        {
            ArrayList<ContentCategoryResult> existingList = new ArrayList<>(Arrays.asList(this.recommendations));
            existingList.add(recommendation);
            this.recommendations = existingList.toArray(new ContentCategoryResult[0]);
        }
        return this;
    }
    @Override
    public ContentCategoryRecommendationResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;;
        return this;
    }
}

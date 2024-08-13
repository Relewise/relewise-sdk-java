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
    defaultImpl = ContentRecommendationResponseCollection.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentRecommendationResponseCollection extends TimedResponse
{
    public String $type = "Relewise.Client.Responses.ContentRecommendationResponseCollection, Relewise.Client";
    public ContentRecommendationResponse[] responses;
    public static ContentRecommendationResponseCollection create(ContentRecommendationResponse... responses)
    {
        return new ContentRecommendationResponseCollection(responses);
    }
    public ContentRecommendationResponseCollection(ContentRecommendationResponse... responses)
    {
        this.responses = responses;
    }
    public ContentRecommendationResponseCollection()
    {
    }
    public ContentRecommendationResponse[] getResponses()
    {
        return this.responses;
    }
    public ContentRecommendationResponseCollection setResponses(ContentRecommendationResponse... responses)
    {
        this.responses = responses;
        return this;
    }
    public ContentRecommendationResponseCollection addToResponses(ContentRecommendationResponse response)
    {
        if (this.responses == null)
        {
            this.responses = new ContentRecommendationResponse[] { response };
        }
        else
        {
            ArrayList<ContentRecommendationResponse> existingList = new ArrayList<>(Arrays.asList(this.responses));
            existingList.add(response);
            this.responses = existingList.toArray(new ContentRecommendationResponse[0]);
        }
        return this;
    }
    @Override
    public ContentRecommendationResponseCollection setStatistics(Statistics statistics)
    {
        this.statistics = statistics;
        return this;
    }
}

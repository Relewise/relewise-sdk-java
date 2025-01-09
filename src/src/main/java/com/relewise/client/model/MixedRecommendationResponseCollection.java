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
import java.util.Set;
import java.util.HashSet;
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = MixedRecommendationResponseCollection.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class MixedRecommendationResponseCollection extends TimedResponse
{
    public String $type = "Relewise.Client.Responses.MixedRecommendationResponseCollection, Relewise.Client";
    public RecommendationResponse[] responses;
    public static MixedRecommendationResponseCollection create(RecommendationResponse... responses)
    {
        return new MixedRecommendationResponseCollection(responses);
    }
    public MixedRecommendationResponseCollection(RecommendationResponse... responses)
    {
        this.responses = responses;
    }
    public MixedRecommendationResponseCollection()
    {
    }
    public RecommendationResponse[] getResponses()
    {
        return this.responses;
    }
    public MixedRecommendationResponseCollection setResponses(RecommendationResponse... responses)
    {
        this.responses = responses;
        return this;
    }
    public MixedRecommendationResponseCollection addToResponses(RecommendationResponse response)
    {
        if (this.responses == null)
        {
            this.responses = new RecommendationResponse[] { response };
        }
        else
        {
            ArrayList<RecommendationResponse> existingList = new ArrayList<>(Arrays.asList(this.responses));
            existingList.add(response);
            this.responses = existingList.toArray(new RecommendationResponse[0]);
        }
        return this;
    }
    @Override
    public MixedRecommendationResponseCollection setStatistics(Statistics statistics)
    {
        this.statistics = statistics;
        return this;
    }
}

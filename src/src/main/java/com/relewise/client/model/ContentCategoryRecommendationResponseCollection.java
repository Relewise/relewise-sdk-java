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
    defaultImpl = ContentCategoryRecommendationResponseCollection.class)
public class ContentCategoryRecommendationResponseCollection extends TimedResponse
{
    public String $type = "Relewise.Client.Responses.ContentCategoryRecommendationResponseCollection, Relewise.Client";
    public ContentCategoryRecommendationResponse[] responses;
    public static ContentCategoryRecommendationResponseCollection create(ContentCategoryRecommendationResponse... responses)
    {
        return new ContentCategoryRecommendationResponseCollection(responses);
    }
    public ContentCategoryRecommendationResponseCollection(ContentCategoryRecommendationResponse... responses)
    {
        this.responses = responses;
    }
    public ContentCategoryRecommendationResponseCollection()
    {
    }
    public ContentCategoryRecommendationResponse[] getResponses()
    {
        return this.responses;
    }
    public ContentCategoryRecommendationResponseCollection setResponses(ContentCategoryRecommendationResponse... responses)
    {
        this.responses = responses;;
        return this;
    }
    public ContentCategoryRecommendationResponseCollection addToResponses(ContentCategoryRecommendationResponse response)
    {
        if (this.responses == null)
        {
            this.responses = new ContentCategoryRecommendationResponse[] { response };
        }
        else
        {
            ArrayList<ContentCategoryRecommendationResponse> existingList = new ArrayList<>(Arrays.asList(this.responses));
            existingList.add(response);
            this.responses = existingList.toArray(new ContentCategoryRecommendationResponse[0]);
        }
        return this;
    }
    @Override
    public ContentCategoryRecommendationResponseCollection setStatistics(Statistics statistics)
    {
        this.statistics = statistics;;
        return this;
    }
}

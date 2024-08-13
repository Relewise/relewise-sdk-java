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
    defaultImpl = ProductRecommendationResponseCollection.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductRecommendationResponseCollection extends TimedResponse
{
    public String $type = "Relewise.Client.Responses.ProductRecommendationResponseCollection, Relewise.Client";
    public ProductRecommendationResponse[] responses;
    public static ProductRecommendationResponseCollection create(ProductRecommendationResponse... responses)
    {
        return new ProductRecommendationResponseCollection(responses);
    }
    public ProductRecommendationResponseCollection(ProductRecommendationResponse... responses)
    {
        this.responses = responses;
    }
    public ProductRecommendationResponseCollection()
    {
    }
    public ProductRecommendationResponse[] getResponses()
    {
        return this.responses;
    }
    public ProductRecommendationResponseCollection setResponses(ProductRecommendationResponse... responses)
    {
        this.responses = responses;
        return this;
    }
    public ProductRecommendationResponseCollection addToResponses(ProductRecommendationResponse response)
    {
        if (this.responses == null)
        {
            this.responses = new ProductRecommendationResponse[] { response };
        }
        else
        {
            ArrayList<ProductRecommendationResponse> existingList = new ArrayList<>(Arrays.asList(this.responses));
            existingList.add(response);
            this.responses = existingList.toArray(new ProductRecommendationResponse[0]);
        }
        return this;
    }
    @Override
    public ProductRecommendationResponseCollection setStatistics(Statistics statistics)
    {
        this.statistics = statistics;
        return this;
    }
}

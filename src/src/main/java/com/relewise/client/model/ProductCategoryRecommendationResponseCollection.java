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
    defaultImpl = ProductCategoryRecommendationResponseCollection.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductCategoryRecommendationResponseCollection extends TimedResponse
{
    public String $type = "Relewise.Client.Responses.ProductCategoryRecommendationResponseCollection, Relewise.Client";
    public ProductCategoryRecommendationResponse[] responses;
    public static ProductCategoryRecommendationResponseCollection create(ProductCategoryRecommendationResponse... responses)
    {
        return new ProductCategoryRecommendationResponseCollection(responses);
    }
    public ProductCategoryRecommendationResponseCollection(ProductCategoryRecommendationResponse... responses)
    {
        this.responses = responses;
    }
    public ProductCategoryRecommendationResponseCollection()
    {
    }
    public ProductCategoryRecommendationResponse[] getResponses()
    {
        return this.responses;
    }
    public ProductCategoryRecommendationResponseCollection setResponses(ProductCategoryRecommendationResponse... responses)
    {
        this.responses = responses;
        return this;
    }
    public ProductCategoryRecommendationResponseCollection addToResponses(ProductCategoryRecommendationResponse response)
    {
        if (this.responses == null)
        {
            this.responses = new ProductCategoryRecommendationResponse[] { response };
        }
        else
        {
            ArrayList<ProductCategoryRecommendationResponse> existingList = new ArrayList<>(Arrays.asList(this.responses));
            existingList.add(response);
            this.responses = existingList.toArray(new ProductCategoryRecommendationResponse[0]);
        }
        return this;
    }
    @Override
    public ProductCategoryRecommendationResponseCollection setStatistics(Statistics statistics)
    {
        this.statistics = statistics;
        return this;
    }
}

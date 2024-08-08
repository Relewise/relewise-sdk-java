package com.relewise.client.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
    defaultImpl = ProductRecommendationResponse.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductRecommendationResponse extends RecommendationResponse
{
    public String $type = "Relewise.Client.Responses.ProductRecommendationResponse, Relewise.Client";
    public ProductResult[] recommendations;
    public static ProductRecommendationResponse create(ProductResult... recommendations)
    {
        return new ProductRecommendationResponse(recommendations);
    }
    public ProductRecommendationResponse(ProductResult... recommendations)
    {
        this.recommendations = recommendations;
    }
    public ProductRecommendationResponse()
    {
    }
    public ProductResult[] getRecommendations()
    {
        return this.recommendations;
    }
    public ProductRecommendationResponse setRecommendations(ProductResult... recommendations)
    {
        this.recommendations = recommendations;;
        return this;
    }
    public ProductRecommendationResponse addToRecommendations(ProductResult recommendation)
    {
        if (this.recommendations == null)
        {
            this.recommendations = new ProductResult[] { recommendation };
        }
        else
        {
            ArrayList<ProductResult> existingList = new ArrayList<>(Arrays.asList(this.recommendations));
            existingList.add(recommendation);
            this.recommendations = existingList.toArray(new ProductResult[0]);
        }
        return this;
    }
    @Override
    public ProductRecommendationResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;;
        return this;
    }
}

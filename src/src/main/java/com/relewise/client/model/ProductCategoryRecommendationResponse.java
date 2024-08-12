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
    defaultImpl = ProductCategoryRecommendationResponse.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductCategoryRecommendationResponse extends RecommendationResponse
{
    public String $type = "Relewise.Client.Responses.ProductCategoryRecommendationResponse, Relewise.Client";
    public ProductCategoryResult[] recommendations;
    public static ProductCategoryRecommendationResponse create(ProductCategoryResult... recommendations)
    {
        return new ProductCategoryRecommendationResponse(recommendations);
    }
    public ProductCategoryRecommendationResponse(ProductCategoryResult... recommendations)
    {
        this.recommendations = recommendations;
    }
    public ProductCategoryRecommendationResponse()
    {
    }
    public ProductCategoryResult[] getRecommendations()
    {
        return this.recommendations;
    }
    public ProductCategoryRecommendationResponse setRecommendations(ProductCategoryResult... recommendations)
    {
        this.recommendations = recommendations;
        return this;
    }
    public ProductCategoryRecommendationResponse addToRecommendations(ProductCategoryResult recommendation)
    {
        if (this.recommendations == null)
        {
            this.recommendations = new ProductCategoryResult[] { recommendation };
        }
        else
        {
            ArrayList<ProductCategoryResult> existingList = new ArrayList<>(Arrays.asList(this.recommendations));
            existingList.add(recommendation);
            this.recommendations = existingList.toArray(new ProductCategoryResult[0]);
        }
        return this;
    }
    @Override
    public ProductCategoryRecommendationResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;
        return this;
    }
}

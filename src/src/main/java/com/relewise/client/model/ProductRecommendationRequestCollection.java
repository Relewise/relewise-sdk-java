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
    defaultImpl = ProductRecommendationRequestCollection.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductRecommendationRequestCollection extends LicensedRequest
{
    public String $type = "Relewise.Client.Requests.Recommendations.ProductRecommendationRequestCollection, Relewise.Client";
    public ArrayList<ProductRecommendationRequest> requests;
    public Boolean requireDistinctProductsAcrossResults;
    public static ProductRecommendationRequestCollection create(Boolean requireDistinctProductsAcrossResults, ProductRecommendationRequest... requests)
    {
        return new ProductRecommendationRequestCollection(requireDistinctProductsAcrossResults, requests);
    }
    public ProductRecommendationRequestCollection(Boolean requireDistinctProductsAcrossResults, ProductRecommendationRequest... requests)
    {
        this.requireDistinctProductsAcrossResults = requireDistinctProductsAcrossResults;
        this.requests = new ArrayList<>(Arrays.asList(requests));
    }
    public ProductRecommendationRequestCollection()
    {
    }
    public ArrayList<ProductRecommendationRequest> getRequests()
    {
        return this.requests;
    }
    public Boolean getRequireDistinctProductsAcrossResults()
    {
        return this.requireDistinctProductsAcrossResults;
    }
    public ProductRecommendationRequestCollection setRequests(ProductRecommendationRequest... requests)
    {
        this.requests = new ArrayList<>(Arrays.asList(requests));;
        return this;
    }
    public ProductRecommendationRequestCollection addToRequests(ProductRecommendationRequest requests)
    {
        if (this.requests == null)
        {
            this.requests = new ArrayList<>();
        }
        this.requests.add(requests);
        return this;
    }
    public ProductRecommendationRequestCollection setRequireDistinctProductsAcrossResults(Boolean requireDistinctProductsAcrossResults)
    {
        this.requireDistinctProductsAcrossResults = requireDistinctProductsAcrossResults;
        return this;
    }
}

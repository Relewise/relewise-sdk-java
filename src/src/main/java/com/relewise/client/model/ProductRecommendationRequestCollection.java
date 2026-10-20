package com.relewise.client.model;

import com.fasterxml.jackson.annotation.*;
import javax.annotation.Nullable;
import java.io.IOException;
import java.time.Duration;
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
    defaultImpl = ProductRecommendationRequestCollection.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductRecommendationRequestCollection extends LicensedRequest
{
    public String $type = "Relewise.Client.Requests.Recommendations.ProductRecommendationRequestCollection, Relewise.Client";
    public ArrayList<ProductRecommendationRequest> requests;
    public Boolean requireDistinctProductsAcrossResults;
    /** Default context values used to determine which merchandising rules apply to requests in this batch, such as DeviceType=Mobile or SplitTestVariant=A. */
    public @Nullable HashMap<String, String> contextValues;
    public static ProductRecommendationRequestCollection create(Boolean requireDistinctProductsAcrossResults, ProductRecommendationRequest... requests)
    {
        return new ProductRecommendationRequestCollection(requireDistinctProductsAcrossResults, requests);
    }
    public ProductRecommendationRequestCollection(Boolean requireDistinctProductsAcrossResults, ProductRecommendationRequest... requests)
    {
        this.requireDistinctProductsAcrossResults = requireDistinctProductsAcrossResults;
        this.requests = new ArrayList<>(Arrays.asList(requests));
    }
    public static ProductRecommendationRequestCollection create(Boolean requireDistinctProductsAcrossResults)
    {
        return new ProductRecommendationRequestCollection(requireDistinctProductsAcrossResults);
    }
    public ProductRecommendationRequestCollection(Boolean requireDistinctProductsAcrossResults)
    {
        this.requireDistinctProductsAcrossResults = requireDistinctProductsAcrossResults;
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
    /** Default context values used to determine which merchandising rules apply to requests in this batch, such as DeviceType=Mobile or SplitTestVariant=A. */
    public @Nullable HashMap<String, String> getContextValues()
    {
        return this.contextValues;
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
    /** Default context values used to determine which merchandising rules apply to requests in this batch, such as DeviceType=Mobile or SplitTestVariant=A. */
    public ProductRecommendationRequestCollection addToContextValues(String key, String value)
    {
        if (this.contextValues == null)
        {
            this.contextValues = new HashMap<>();
        }
        this.contextValues.put(key, value);
        return this;
    }
    /** Default context values used to determine which merchandising rules apply to requests in this batch, such as DeviceType=Mobile or SplitTestVariant=A. */
    public ProductRecommendationRequestCollection setContextValues(@Nullable HashMap<String, String> contextValues)
    {
        this.contextValues = contextValues;
        return this;
    }
}

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
    defaultImpl = ProductCategoryRecommendationRequestCollection.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductCategoryRecommendationRequestCollection extends LicensedRequest
{
    public String $type = "Relewise.Client.Requests.Recommendations.ProductCategoryRecommendationRequestCollection, Relewise.Client";
    public ArrayList<ProductCategoryRecommendationRequest> requests;
    public Boolean requireDistinctCategoriesAcrossResults;
    public static ProductCategoryRecommendationRequestCollection create(Boolean requireDistinctCategoriesesAcrossResults, ProductCategoryRecommendationRequest... requests)
    {
        return new ProductCategoryRecommendationRequestCollection(requireDistinctCategoriesesAcrossResults, requests);
    }
    public ProductCategoryRecommendationRequestCollection(Boolean requireDistinctCategoriesesAcrossResults, ProductCategoryRecommendationRequest... requests)
    {
        this.requireDistinctCategoriesAcrossResults = requireDistinctCategoriesesAcrossResults;
        this.requests = new ArrayList<>(Arrays.asList(requests));
    }
    public ProductCategoryRecommendationRequestCollection()
    {
    }
    public ArrayList<ProductCategoryRecommendationRequest> getRequests()
    {
        return this.requests;
    }
    public Boolean getRequireDistinctCategoriesAcrossResults()
    {
        return this.requireDistinctCategoriesAcrossResults;
    }
    public ProductCategoryRecommendationRequestCollection setRequests(ProductCategoryRecommendationRequest... requests)
    {
        this.requests = new ArrayList<>(Arrays.asList(requests));;
        return this;
    }
    public ProductCategoryRecommendationRequestCollection addToRequests(ProductCategoryRecommendationRequest requests)
    {
        if (this.requests == null)
        {
            this.requests = new ArrayList<>();
        }
        this.requests.add(requests);
        return this;
    }
    public ProductCategoryRecommendationRequestCollection setRequireDistinctCategoriesAcrossResults(Boolean requireDistinctCategoriesAcrossResults)
    {
        this.requireDistinctCategoriesAcrossResults = requireDistinctCategoriesAcrossResults;
        return this;
    }
}

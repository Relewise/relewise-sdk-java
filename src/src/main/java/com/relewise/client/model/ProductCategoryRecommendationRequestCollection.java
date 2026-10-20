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
    defaultImpl = ProductCategoryRecommendationRequestCollection.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductCategoryRecommendationRequestCollection extends LicensedRequest
{
    public String $type = "Relewise.Client.Requests.Recommendations.ProductCategoryRecommendationRequestCollection, Relewise.Client";
    public ArrayList<ProductCategoryRecommendationRequest> requests;
    public Boolean requireDistinctCategoriesAcrossResults;
    /** Default context values used to determine which merchandising rules apply to requests in this batch, such as DeviceType=Mobile or SplitTestVariant=A. */
    public @Nullable HashMap<String, String> contextValues;
    public static ProductCategoryRecommendationRequestCollection create(Boolean requireDistinctCategoriesesAcrossResults)
    {
        return new ProductCategoryRecommendationRequestCollection(requireDistinctCategoriesesAcrossResults);
    }
    public ProductCategoryRecommendationRequestCollection(Boolean requireDistinctCategoriesesAcrossResults)
    {
        this.requireDistinctCategoriesAcrossResults = requireDistinctCategoriesesAcrossResults;
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
    /** Default context values used to determine which merchandising rules apply to requests in this batch, such as DeviceType=Mobile or SplitTestVariant=A. */
    public @Nullable HashMap<String, String> getContextValues()
    {
        return this.contextValues;
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
    /** Default context values used to determine which merchandising rules apply to requests in this batch, such as DeviceType=Mobile or SplitTestVariant=A. */
    public ProductCategoryRecommendationRequestCollection addToContextValues(String key, String value)
    {
        if (this.contextValues == null)
        {
            this.contextValues = new HashMap<>();
        }
        this.contextValues.put(key, value);
        return this;
    }
    /** Default context values used to determine which merchandising rules apply to requests in this batch, such as DeviceType=Mobile or SplitTestVariant=A. */
    public ProductCategoryRecommendationRequestCollection setContextValues(@Nullable HashMap<String, String> contextValues)
    {
        this.contextValues = contextValues;
        return this;
    }
}

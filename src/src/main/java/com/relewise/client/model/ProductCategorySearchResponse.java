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
    defaultImpl = ProductCategorySearchResponse.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductCategorySearchResponse extends PaginatedSearchResponse
{
    public String $type = "Relewise.Client.Responses.Search.ProductCategorySearchResponse, Relewise.Client";
    public ProductCategoryResult[] results;
    public ProductCategoryFacetResult facets;
    public ProductCategoryResult[] recommendations;
    public static ProductCategorySearchResponse create()
    {
        return new ProductCategorySearchResponse();
    }
    public ProductCategorySearchResponse()
    {
    }
    public ProductCategoryResult[] getResults()
    {
        return this.results;
    }
    public ProductCategoryFacetResult getFacets()
    {
        return this.facets;
    }
    public ProductCategoryResult[] getRecommendations()
    {
        return this.recommendations;
    }
    public ProductCategorySearchResponse setResults(ProductCategoryResult... results)
    {
        this.results = results;
        return this;
    }
    public ProductCategorySearchResponse addToResults(ProductCategoryResult result)
    {
        if (this.results == null)
        {
            this.results = new ProductCategoryResult[] { result };
        }
        else
        {
            ArrayList<ProductCategoryResult> existingList = new ArrayList<>(Arrays.asList(this.results));
            existingList.add(result);
            this.results = existingList.toArray(new ProductCategoryResult[0]);
        }
        return this;
    }
    public ProductCategorySearchResponse setFacets(ProductCategoryFacetResult facets)
    {
        this.facets = facets;
        return this;
    }
    public ProductCategorySearchResponse setRecommendations(ProductCategoryResult... recommendations)
    {
        this.recommendations = recommendations;
        return this;
    }
    public ProductCategorySearchResponse addToRecommendations(ProductCategoryResult recommendation)
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
    public ProductCategorySearchResponse setHits(Integer hits)
    {
        this.hits = hits;
        return this;
    }
    @Override
    public ProductCategorySearchResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;
        return this;
    }
}

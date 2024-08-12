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
    defaultImpl = ProductSearchResponse.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductSearchResponse extends PaginatedSearchResponse
{
    public String $type = "Relewise.Client.Responses.Search.ProductSearchResponse, Relewise.Client";
    public ProductResult[] results;
    public ProductFacetResult facets;
    public ProductResult[] recommendations;
    public RedirectResult[] redirects;
    public RetailMediaResult retailMedia;
    public static ProductSearchResponse create()
    {
        return new ProductSearchResponse();
    }
    public ProductSearchResponse()
    {
    }
    public ProductResult[] getResults()
    {
        return this.results;
    }
    public ProductFacetResult getFacets()
    {
        return this.facets;
    }
    public ProductResult[] getRecommendations()
    {
        return this.recommendations;
    }
    public RedirectResult[] getRedirects()
    {
        return this.redirects;
    }
    public RetailMediaResult getRetailMedia()
    {
        return this.retailMedia;
    }
    public ProductSearchResponse setResults(ProductResult... results)
    {
        this.results = results;
        return this;
    }
    public ProductSearchResponse addToResults(ProductResult result)
    {
        if (this.results == null)
        {
            this.results = new ProductResult[] { result };
        }
        else
        {
            ArrayList<ProductResult> existingList = new ArrayList<>(Arrays.asList(this.results));
            existingList.add(result);
            this.results = existingList.toArray(new ProductResult[0]);
        }
        return this;
    }
    public ProductSearchResponse setFacets(ProductFacetResult facets)
    {
        this.facets = facets;
        return this;
    }
    public ProductSearchResponse setRecommendations(ProductResult... recommendations)
    {
        this.recommendations = recommendations;
        return this;
    }
    public ProductSearchResponse addToRecommendations(ProductResult recommendation)
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
    public ProductSearchResponse setRedirects(RedirectResult... redirects)
    {
        this.redirects = redirects;
        return this;
    }
    public ProductSearchResponse addToRedirects(RedirectResult redirect)
    {
        if (this.redirects == null)
        {
            this.redirects = new RedirectResult[] { redirect };
        }
        else
        {
            ArrayList<RedirectResult> existingList = new ArrayList<>(Arrays.asList(this.redirects));
            existingList.add(redirect);
            this.redirects = existingList.toArray(new RedirectResult[0]);
        }
        return this;
    }
    public ProductSearchResponse setRetailMedia(RetailMediaResult retailMedia)
    {
        this.retailMedia = retailMedia;
        return this;
    }
    @Override
    public ProductSearchResponse setHits(Integer hits)
    {
        this.hits = hits;
        return this;
    }
    @Override
    public ProductSearchResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;
        return this;
    }
}

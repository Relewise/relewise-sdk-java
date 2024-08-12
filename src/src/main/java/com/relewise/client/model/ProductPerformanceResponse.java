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
    defaultImpl = ProductPerformanceResponse.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductPerformanceResponse extends TimedResponse
{
    public String $type = "Relewise.Client.Responses.Analyzers.ProductPerformanceResponse, Relewise.Client";
    public ProductPerformanceResult[] results;
    public Integer totalNumberOfResults;
    public Integer remainingNumberOfResults;
    public static ProductPerformanceResponse create()
    {
        return new ProductPerformanceResponse();
    }
    public ProductPerformanceResponse()
    {
    }
    public ProductPerformanceResult[] getResults()
    {
        return this.results;
    }
    public Integer getTotalNumberOfResults()
    {
        return this.totalNumberOfResults;
    }
    public Integer getRemainingNumberOfResults()
    {
        return this.remainingNumberOfResults;
    }
    public ProductPerformanceResponse setResults(ProductPerformanceResult... results)
    {
        this.results = results;
        return this;
    }
    public ProductPerformanceResponse addToResults(ProductPerformanceResult result)
    {
        if (this.results == null)
        {
            this.results = new ProductPerformanceResult[] { result };
        }
        else
        {
            ArrayList<ProductPerformanceResult> existingList = new ArrayList<>(Arrays.asList(this.results));
            existingList.add(result);
            this.results = existingList.toArray(new ProductPerformanceResult[0]);
        }
        return this;
    }
    public ProductPerformanceResponse setTotalNumberOfResults(Integer totalNumberOfResults)
    {
        this.totalNumberOfResults = totalNumberOfResults;
        return this;
    }
    public ProductPerformanceResponse setRemainingNumberOfResults(Integer remainingNumberOfResults)
    {
        this.remainingNumberOfResults = remainingNumberOfResults;
        return this;
    }
    @Override
    public ProductPerformanceResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;
        return this;
    }
}

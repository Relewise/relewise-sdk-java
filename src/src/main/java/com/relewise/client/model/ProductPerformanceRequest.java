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
    defaultImpl = ProductPerformanceRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductPerformanceRequest extends AnalyzerRequest
{
    public String $type = "Relewise.Client.Requests.Analyzers.ProductPerformanceRequest, Relewise.Client";
    public Long fromUnixTimeSeconds;
    public Long toUnixTimeSeconds;
    public @Nullable FilterCollection filters;
    public Integer numberOfResults;
    public Integer skipNumberOfResults;
    public Boolean byVariant;
    public @Nullable SelectedProductPropertiesSettings selectedProductProperties;
    public @Nullable SelectedVariantPropertiesSettings selectedVariantProperties;
    public ProductPerformanceRequestOrderByOptions orderBy;
    public ProductPerformanceRequestVariantDataOptions variantData;
    public @Nullable ArrayList<AbstractMap.SimpleEntry<String, String>> classifications;
    public @Nullable SelectedBrandPropertiesSettings selectedBrandProperties;
    public static ProductPerformanceRequest create(@Nullable Language language, @Nullable Currency currency, Boolean byVariant, Integer numberOfResultsPerRequest)
    {
        return new ProductPerformanceRequest(language, currency, byVariant, numberOfResultsPerRequest);
    }
    public ProductPerformanceRequest(@Nullable Language language, @Nullable Currency currency, Boolean byVariant, Integer numberOfResultsPerRequest)
    {
        this.language = language;
        this.currency = currency;
        this.byVariant = byVariant;
        this.numberOfResults = numberOfResultsPerRequest;
        this.skipNumberOfResults = 0;
    }
    public static ProductPerformanceRequest create(@Nullable Language language, @Nullable Currency currency, Boolean byVariant, Integer numberOfResultsPerRequest, Integer skipNumberOfResults)
    {
        return new ProductPerformanceRequest(language, currency, byVariant, numberOfResultsPerRequest, skipNumberOfResults);
    }
    public ProductPerformanceRequest(@Nullable Language language, @Nullable Currency currency, Boolean byVariant, Integer numberOfResultsPerRequest, Integer skipNumberOfResults)
    {
        this.language = language;
        this.currency = currency;
        this.byVariant = byVariant;
        this.numberOfResults = numberOfResultsPerRequest;
        this.skipNumberOfResults = skipNumberOfResults;
    }
    public ProductPerformanceRequest()
    {
        this.skipNumberOfResults = 0;
    }
    public Long getFromUnixTimeSeconds()
    {
        return this.fromUnixTimeSeconds;
    }
    public Long getToUnixTimeSeconds()
    {
        return this.toUnixTimeSeconds;
    }
    public @Nullable FilterCollection getFilters()
    {
        return this.filters;
    }
    public Integer getNumberOfResults()
    {
        return this.numberOfResults;
    }
    public Integer getSkipNumberOfResults()
    {
        return this.skipNumberOfResults;
    }
    public Boolean getByVariant()
    {
        return this.byVariant;
    }
    public @Nullable SelectedProductPropertiesSettings getSelectedProductProperties()
    {
        return this.selectedProductProperties;
    }
    public @Nullable SelectedVariantPropertiesSettings getSelectedVariantProperties()
    {
        return this.selectedVariantProperties;
    }
    public ProductPerformanceRequestOrderByOptions getOrderBy()
    {
        return this.orderBy;
    }
    public ProductPerformanceRequestVariantDataOptions getVariantData()
    {
        return this.variantData;
    }
    public @Nullable ArrayList<AbstractMap.SimpleEntry<String, String>> getClassifications()
    {
        return this.classifications;
    }
    public @Nullable SelectedBrandPropertiesSettings getSelectedBrandProperties()
    {
        return this.selectedBrandProperties;
    }
    public ProductPerformanceRequest setFromUnixTimeSeconds(Long fromUnixTimeSeconds)
    {
        this.fromUnixTimeSeconds = fromUnixTimeSeconds;
        return this;
    }
    public ProductPerformanceRequest setToUnixTimeSeconds(Long toUnixTimeSeconds)
    {
        this.toUnixTimeSeconds = toUnixTimeSeconds;
        return this;
    }
    public ProductPerformanceRequest setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
    public ProductPerformanceRequest setNumberOfResults(Integer numberOfResults)
    {
        this.numberOfResults = numberOfResults;
        return this;
    }
    public ProductPerformanceRequest setSkipNumberOfResults(Integer skipNumberOfResults)
    {
        this.skipNumberOfResults = skipNumberOfResults;
        return this;
    }
    public ProductPerformanceRequest setByVariant(Boolean byVariant)
    {
        this.byVariant = byVariant;
        return this;
    }
    public ProductPerformanceRequest setSelectedProductProperties(SelectedProductPropertiesSettings selectedProductProperties)
    {
        this.selectedProductProperties = selectedProductProperties;
        return this;
    }
    public ProductPerformanceRequest setSelectedVariantProperties(SelectedVariantPropertiesSettings selectedVariantProperties)
    {
        this.selectedVariantProperties = selectedVariantProperties;
        return this;
    }
    public ProductPerformanceRequest setOrderBy(ProductPerformanceRequestOrderByOptions orderBy)
    {
        this.orderBy = orderBy;
        return this;
    }
    public ProductPerformanceRequest setVariantData(ProductPerformanceRequestVariantDataOptions variantData)
    {
        this.variantData = variantData;
        return this;
    }
    public ProductPerformanceRequest setClassifications(AbstractMap.SimpleEntry<String, String>... classifications)
    {
        this.classifications = new ArrayList<>(Arrays.asList(classifications));;
        return this;
    }
    public ProductPerformanceRequest addToClassifications(AbstractMap.SimpleEntry<String, String> classifications)
    {
        if (this.classifications == null)
        {
            this.classifications = new ArrayList<>();
        }
        this.classifications.add(classifications);
        return this;
    }
    public ProductPerformanceRequest setSelectedBrandProperties(SelectedBrandPropertiesSettings selectedBrandProperties)
    {
        this.selectedBrandProperties = selectedBrandProperties;
        return this;
    }
    @Override
    public ProductPerformanceRequest setLanguage(Language language)
    {
        this.language = language;
        return this;
    }
    @Override
    public ProductPerformanceRequest setCurrency(Currency currency)
    {
        this.currency = currency;
        return this;
    }
}

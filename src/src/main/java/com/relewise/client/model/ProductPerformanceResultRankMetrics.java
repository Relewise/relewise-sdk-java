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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductPerformanceResultRankMetrics
{
    public ProductPerformanceResultViewsAndSalesMetrics overall;
    public ProductPerformanceResultCategoryMetrics[] withinCategories;
    public ProductPerformanceResultViewsAndSalesMetrics withinBrand;
    public static ProductPerformanceResultRankMetrics create()
    {
        return new ProductPerformanceResultRankMetrics();
    }
    public ProductPerformanceResultRankMetrics()
    {
    }
    public ProductPerformanceResultViewsAndSalesMetrics getOverall()
    {
        return this.overall;
    }
    public ProductPerformanceResultCategoryMetrics[] getWithinCategories()
    {
        return this.withinCategories;
    }
    public ProductPerformanceResultViewsAndSalesMetrics getWithinBrand()
    {
        return this.withinBrand;
    }
    public ProductPerformanceResultRankMetrics setOverall(ProductPerformanceResultViewsAndSalesMetrics overall)
    {
        this.overall = overall;
        return this;
    }
    public ProductPerformanceResultRankMetrics setWithinCategories(ProductPerformanceResultCategoryMetrics... withinCategories)
    {
        this.withinCategories = withinCategories;
        return this;
    }
    public ProductPerformanceResultRankMetrics addToWithinCategories(ProductPerformanceResultCategoryMetrics withinCategory)
    {
        if (this.withinCategories == null)
        {
            this.withinCategories = new ProductPerformanceResultCategoryMetrics[] { withinCategory };
        }
        else
        {
            ArrayList<ProductPerformanceResultCategoryMetrics> existingList = new ArrayList<>(Arrays.asList(this.withinCategories));
            existingList.add(withinCategory);
            this.withinCategories = existingList.toArray(new ProductPerformanceResultCategoryMetrics[0]);
        }
        return this;
    }
    public ProductPerformanceResultRankMetrics setWithinBrand(ProductPerformanceResultViewsAndSalesMetrics withinBrand)
    {
        this.withinBrand = withinBrand;
        return this;
    }
}

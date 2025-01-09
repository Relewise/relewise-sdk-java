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
import java.util.Set;
import java.util.HashSet;
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductPerformanceResultClassificationMetrics
{
    public HashMap<String, String> combination;
    public ProductPerformanceResultViewsMetrics views;
    public ProductPerformanceResultSalesMetrics sales;
    public ProductPerformanceResultCartMetrics carts;
    public ProductPerformanceResultRankMetrics rank;
    public static ProductPerformanceResultClassificationMetrics create()
    {
        return new ProductPerformanceResultClassificationMetrics();
    }
    public ProductPerformanceResultClassificationMetrics()
    {
    }
    public HashMap<String, String> getCombination()
    {
        return this.combination;
    }
    public ProductPerformanceResultViewsMetrics getViews()
    {
        return this.views;
    }
    public ProductPerformanceResultSalesMetrics getSales()
    {
        return this.sales;
    }
    public ProductPerformanceResultCartMetrics getCarts()
    {
        return this.carts;
    }
    public ProductPerformanceResultRankMetrics getRank()
    {
        return this.rank;
    }
    public ProductPerformanceResultClassificationMetrics addToCombination(String key, String value)
    {
        if (this.combination == null)
        {
            this.combination = new HashMap<>();
        }
        this.combination.put(key, value);
        return this;
    }
    public ProductPerformanceResultClassificationMetrics setCombination(HashMap<String, String> combination)
    {
        this.combination = combination;
        return this;
    }
    public ProductPerformanceResultClassificationMetrics setViews(ProductPerformanceResultViewsMetrics views)
    {
        this.views = views;
        return this;
    }
    public ProductPerformanceResultClassificationMetrics setSales(ProductPerformanceResultSalesMetrics sales)
    {
        this.sales = sales;
        return this;
    }
    public ProductPerformanceResultClassificationMetrics setCarts(ProductPerformanceResultCartMetrics carts)
    {
        this.carts = carts;
        return this;
    }
    public ProductPerformanceResultClassificationMetrics setRank(ProductPerformanceResultRankMetrics rank)
    {
        this.rank = rank;
        return this;
    }
}

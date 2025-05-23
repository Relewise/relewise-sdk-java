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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductPerformanceResultCategoryMetrics
{
    public CategoryNameAndIdResult category;
    public Boolean immediateParent;
    public ProductPerformanceResultViewsAndSalesMetrics rank;
    public static ProductPerformanceResultCategoryMetrics create()
    {
        return new ProductPerformanceResultCategoryMetrics();
    }
    public ProductPerformanceResultCategoryMetrics()
    {
    }
    public CategoryNameAndIdResult getCategory()
    {
        return this.category;
    }
    public Boolean getImmediateParent()
    {
        return this.immediateParent;
    }
    public ProductPerformanceResultViewsAndSalesMetrics getRank()
    {
        return this.rank;
    }
    public ProductPerformanceResultCategoryMetrics setCategory(CategoryNameAndIdResult category)
    {
        this.category = category;
        return this;
    }
    public ProductPerformanceResultCategoryMetrics setImmediateParent(Boolean immediateParent)
    {
        this.immediateParent = immediateParent;
        return this;
    }
    public ProductPerformanceResultCategoryMetrics setRank(ProductPerformanceResultViewsAndSalesMetrics rank)
    {
        this.rank = rank;
        return this;
    }
}

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
public class ProductPerformanceResultViewsAndSalesMetrics
{
    public Double byViews;
    public Double bySales;
    public static ProductPerformanceResultViewsAndSalesMetrics create()
    {
        return new ProductPerformanceResultViewsAndSalesMetrics();
    }
    public ProductPerformanceResultViewsAndSalesMetrics()
    {
    }
    public Double getByViews()
    {
        return this.byViews;
    }
    public Double getBySales()
    {
        return this.bySales;
    }
    public ProductPerformanceResultViewsAndSalesMetrics setByViews(Double byViews)
    {
        this.byViews = byViews;
        return this;
    }
    public ProductPerformanceResultViewsAndSalesMetrics setBySales(Double bySales)
    {
        this.bySales = bySales;
        return this;
    }
}

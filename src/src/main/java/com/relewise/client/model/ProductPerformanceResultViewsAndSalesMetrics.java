package com.relewise.client.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
    defaultImpl = ProductPerformanceResultViewsAndSalesMetrics.class)
public class ProductPerformanceResultViewsAndSalesMetrics
{
    public String $type = "Relewise.Client.DataTypes.ProductPerformanceResult+ViewsAndSalesMetrics, Relewise.Client";
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
        this.byViews = byViews;;
        return this;
    }
    public ProductPerformanceResultViewsAndSalesMetrics setBySales(Double bySales)
    {
        this.bySales = bySales;;
        return this;
    }
}

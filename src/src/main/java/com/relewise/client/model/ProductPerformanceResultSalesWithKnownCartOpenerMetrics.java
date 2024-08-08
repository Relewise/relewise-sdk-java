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
    defaultImpl = ProductPerformanceResultSalesWithKnownCartOpenerMetrics.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductPerformanceResultSalesWithKnownCartOpenerMetrics
{
    public String $type = "Relewise.Client.DataTypes.ProductPerformanceResult+SalesWithKnownCartOpenerMetrics, Relewise.Client";
    public Integer orders;
    public Integer opened;
    public Double openedPercent;
    public static ProductPerformanceResultSalesWithKnownCartOpenerMetrics create()
    {
        return new ProductPerformanceResultSalesWithKnownCartOpenerMetrics();
    }
    public ProductPerformanceResultSalesWithKnownCartOpenerMetrics()
    {
    }
    public Integer getOrders()
    {
        return this.orders;
    }
    public Integer getOpened()
    {
        return this.opened;
    }
    public Double getOpenedPercent()
    {
        return this.openedPercent;
    }
    public ProductPerformanceResultSalesWithKnownCartOpenerMetrics setOrders(Integer orders)
    {
        this.orders = orders;;
        return this;
    }
    public ProductPerformanceResultSalesWithKnownCartOpenerMetrics setOpened(Integer opened)
    {
        this.opened = opened;;
        return this;
    }
    public ProductPerformanceResultSalesWithKnownCartOpenerMetrics setOpenedPercent(Double openedPercent)
    {
        this.openedPercent = openedPercent;;
        return this;
    }
}

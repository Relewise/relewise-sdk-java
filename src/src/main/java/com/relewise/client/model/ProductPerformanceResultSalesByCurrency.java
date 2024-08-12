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
public class ProductPerformanceResultSalesByCurrency
{
    public Currency currency;
    public Integer orders;
    public Double averageSubtotal;
    public Double units;
    public Double revenue;
    public static ProductPerformanceResultSalesByCurrency create()
    {
        return new ProductPerformanceResultSalesByCurrency();
    }
    public ProductPerformanceResultSalesByCurrency()
    {
    }
    public Currency getCurrency()
    {
        return this.currency;
    }
    public Integer getOrders()
    {
        return this.orders;
    }
    public Double getAverageSubtotal()
    {
        return this.averageSubtotal;
    }
    public Double getUnits()
    {
        return this.units;
    }
    public Double getRevenue()
    {
        return this.revenue;
    }
    public ProductPerformanceResultSalesByCurrency setCurrency(Currency currency)
    {
        this.currency = currency;
        return this;
    }
    public ProductPerformanceResultSalesByCurrency setOrders(Integer orders)
    {
        this.orders = orders;
        return this;
    }
    public ProductPerformanceResultSalesByCurrency setAverageSubtotal(Double averageSubtotal)
    {
        this.averageSubtotal = averageSubtotal;
        return this;
    }
    public ProductPerformanceResultSalesByCurrency setUnits(Double units)
    {
        this.units = units;
        return this;
    }
    public ProductPerformanceResultSalesByCurrency setRevenue(Double revenue)
    {
        this.revenue = revenue;
        return this;
    }
}

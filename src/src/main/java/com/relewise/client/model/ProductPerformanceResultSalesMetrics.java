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
    defaultImpl = ProductPerformanceResultSalesMetrics.class)
public class ProductPerformanceResultSalesMetrics
{
    public String $type = "Relewise.Client.DataTypes.ProductPerformanceResult+SalesMetrics, Relewise.Client";
    public Integer orders;
    public Double averageNoOfLineItems;
    public ProductPerformanceResultSalesByCurrency[] currencies;
    public ProductPerformanceResultSalesWithKnownCartOpenerMetrics withKnownCartOpener;
    public static ProductPerformanceResultSalesMetrics create()
    {
        return new ProductPerformanceResultSalesMetrics();
    }
    public ProductPerformanceResultSalesMetrics()
    {
    }
    public Integer getOrders()
    {
        return this.orders;
    }
    public Double getAverageNoOfLineItems()
    {
        return this.averageNoOfLineItems;
    }
    public ProductPerformanceResultSalesByCurrency[] getCurrencies()
    {
        return this.currencies;
    }
    public ProductPerformanceResultSalesWithKnownCartOpenerMetrics getWithKnownCartOpener()
    {
        return this.withKnownCartOpener;
    }
    public ProductPerformanceResultSalesMetrics setOrders(Integer orders)
    {
        this.orders = orders;;
        return this;
    }
    public ProductPerformanceResultSalesMetrics setAverageNoOfLineItems(Double averageNoOfLineItems)
    {
        this.averageNoOfLineItems = averageNoOfLineItems;;
        return this;
    }
    public ProductPerformanceResultSalesMetrics setCurrencies(ProductPerformanceResultSalesByCurrency... currencies)
    {
        this.currencies = currencies;;
        return this;
    }
    public ProductPerformanceResultSalesMetrics addToCurrencies(ProductPerformanceResultSalesByCurrency currency)
    {
        if (this.currencies == null)
        {
            this.currencies = new ProductPerformanceResultSalesByCurrency[] { currency };
        }
        else
        {
            ArrayList<ProductPerformanceResultSalesByCurrency> existingList = new ArrayList<>(Arrays.asList(this.currencies));
            existingList.add(currency);
            this.currencies = existingList.toArray(new ProductPerformanceResultSalesByCurrency[0]);
        }
        return this;
    }
    public ProductPerformanceResultSalesMetrics setWithKnownCartOpener(ProductPerformanceResultSalesWithKnownCartOpenerMetrics withKnownCartOpener)
    {
        this.withKnownCartOpener = withKnownCartOpener;;
        return this;
    }
}

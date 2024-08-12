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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class CampaignAnalyticsProductAnalyticsPeriodMetricsCurrencyMetrics
{
    public String currency;
    public Double revenue;
    public static CampaignAnalyticsProductAnalyticsPeriodMetricsCurrencyMetrics create(String currency, Double revenue)
    {
        return new CampaignAnalyticsProductAnalyticsPeriodMetricsCurrencyMetrics(currency, revenue);
    }
    public CampaignAnalyticsProductAnalyticsPeriodMetricsCurrencyMetrics(String currency, Double revenue)
    {
        this.currency = currency;
        this.revenue = revenue;
    }
    public CampaignAnalyticsProductAnalyticsPeriodMetricsCurrencyMetrics()
    {
    }
    public String getCurrency()
    {
        return this.currency;
    }
    public Double getRevenue()
    {
        return this.revenue;
    }
    public CampaignAnalyticsProductAnalyticsPeriodMetricsCurrencyMetrics setCurrency(String currency)
    {
        this.currency = currency;
        return this;
    }
    public CampaignAnalyticsProductAnalyticsPeriodMetricsCurrencyMetrics setRevenue(Double revenue)
    {
        this.revenue = revenue;
        return this;
    }
}

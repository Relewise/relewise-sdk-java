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
public class CampaignAnalyticsProductAnalyticsPeriodMetrics
{
    public OffsetDateTime periodFromUtc;
    public Integer views;
    public Integer salesQuantity;
    public CampaignAnalyticsProductAnalyticsPeriodMetricsCurrencyMetrics[] currencies;
    public static CampaignAnalyticsProductAnalyticsPeriodMetrics create(OffsetDateTime periodFromUtc, Integer views, Integer salesQuantity, CampaignAnalyticsProductAnalyticsPeriodMetricsCurrencyMetrics... currencies)
    {
        return new CampaignAnalyticsProductAnalyticsPeriodMetrics(periodFromUtc, views, salesQuantity, currencies);
    }
    public CampaignAnalyticsProductAnalyticsPeriodMetrics(OffsetDateTime periodFromUtc, Integer views, Integer salesQuantity, CampaignAnalyticsProductAnalyticsPeriodMetricsCurrencyMetrics... currencies)
    {
        this.periodFromUtc = periodFromUtc;
        this.views = views;
        this.salesQuantity = salesQuantity;
        this.currencies = currencies;
    }
    public CampaignAnalyticsProductAnalyticsPeriodMetrics()
    {
    }
    public OffsetDateTime getPeriodFromUtc()
    {
        return this.periodFromUtc;
    }
    public Integer getViews()
    {
        return this.views;
    }
    public Integer getSalesQuantity()
    {
        return this.salesQuantity;
    }
    public CampaignAnalyticsProductAnalyticsPeriodMetricsCurrencyMetrics[] getCurrencies()
    {
        return this.currencies;
    }
    public CampaignAnalyticsProductAnalyticsPeriodMetrics setPeriodFromUtc(OffsetDateTime periodFromUtc)
    {
        this.periodFromUtc = periodFromUtc;
        return this;
    }
    public CampaignAnalyticsProductAnalyticsPeriodMetrics setViews(Integer views)
    {
        this.views = views;
        return this;
    }
    public CampaignAnalyticsProductAnalyticsPeriodMetrics setSalesQuantity(Integer salesQuantity)
    {
        this.salesQuantity = salesQuantity;
        return this;
    }
    public CampaignAnalyticsProductAnalyticsPeriodMetrics setCurrencies(CampaignAnalyticsProductAnalyticsPeriodMetricsCurrencyMetrics... currencies)
    {
        this.currencies = currencies;
        return this;
    }
    public CampaignAnalyticsProductAnalyticsPeriodMetrics addToCurrencies(CampaignAnalyticsProductAnalyticsPeriodMetricsCurrencyMetrics currency)
    {
        if (this.currencies == null)
        {
            this.currencies = new CampaignAnalyticsProductAnalyticsPeriodMetricsCurrencyMetrics[] { currency };
        }
        else
        {
            ArrayList<CampaignAnalyticsProductAnalyticsPeriodMetricsCurrencyMetrics> existingList = new ArrayList<>(Arrays.asList(this.currencies));
            existingList.add(currency);
            this.currencies = existingList.toArray(new CampaignAnalyticsProductAnalyticsPeriodMetricsCurrencyMetrics[0]);
        }
        return this;
    }
}

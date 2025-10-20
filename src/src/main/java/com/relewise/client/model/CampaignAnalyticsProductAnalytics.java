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
    
/** Defines how campaign performs. */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CampaignAnalyticsProductAnalytics
{
    public CampaignAnalyticsProductAnalyticsPeriodMetrics[] timeSeries;
    /** Number of times products are being promoted by the <code>Campaign</code>. */
    public Integer promotions;
    /** How many times each product was promoted. */
    public CampaignAnalyticsProductAnalyticsPromotedProductMetrics[] promotedProducts;
    public static CampaignAnalyticsProductAnalytics create(CampaignAnalyticsProductAnalyticsPeriodMetrics[] timeSeries, Integer promotions, CampaignAnalyticsProductAnalyticsPromotedProductMetrics... promotedProducts)
    {
        return new CampaignAnalyticsProductAnalytics(timeSeries, promotions, promotedProducts);
    }
    public CampaignAnalyticsProductAnalytics(CampaignAnalyticsProductAnalyticsPeriodMetrics[] timeSeries, Integer promotions, CampaignAnalyticsProductAnalyticsPromotedProductMetrics... promotedProducts)
    {
        this.timeSeries = timeSeries;
        this.promotions = promotions;
        this.promotedProducts = promotedProducts;
    }
    public CampaignAnalyticsProductAnalytics()
    {
    }
    public CampaignAnalyticsProductAnalyticsPeriodMetrics[] getTimeSeries()
    {
        return this.timeSeries;
    }
    /** Number of times products are being promoted by the <code>Campaign</code>. */
    public Integer getPromotions()
    {
        return this.promotions;
    }
    /** How many times each product was promoted. */
    public CampaignAnalyticsProductAnalyticsPromotedProductMetrics[] getPromotedProducts()
    {
        return this.promotedProducts;
    }
    public CampaignAnalyticsProductAnalytics setTimeSeries(CampaignAnalyticsProductAnalyticsPeriodMetrics... timeSeries)
    {
        this.timeSeries = timeSeries;
        return this;
    }
    public CampaignAnalyticsProductAnalytics addToTimeSeries(CampaignAnalyticsProductAnalyticsPeriodMetrics timeSery)
    {
        if (this.timeSeries == null)
        {
            this.timeSeries = new CampaignAnalyticsProductAnalyticsPeriodMetrics[] { timeSery };
        }
        else
        {
            ArrayList<CampaignAnalyticsProductAnalyticsPeriodMetrics> existingList = new ArrayList<>(Arrays.asList(this.timeSeries));
            existingList.add(timeSery);
            this.timeSeries = existingList.toArray(new CampaignAnalyticsProductAnalyticsPeriodMetrics[0]);
        }
        return this;
    }
    /** Number of times products are being promoted by the <code>Campaign</code>. */
    public CampaignAnalyticsProductAnalytics setPromotions(Integer promotions)
    {
        this.promotions = promotions;
        return this;
    }
    /** How many times each product was promoted. */
    public CampaignAnalyticsProductAnalytics setPromotedProducts(CampaignAnalyticsProductAnalyticsPromotedProductMetrics... promotedProducts)
    {
        this.promotedProducts = promotedProducts;
        return this;
    }
    /** How many times each product was promoted. */
    public CampaignAnalyticsProductAnalytics addToPromotedProducts(CampaignAnalyticsProductAnalyticsPromotedProductMetrics promotedProduct)
    {
        if (this.promotedProducts == null)
        {
            this.promotedProducts = new CampaignAnalyticsProductAnalyticsPromotedProductMetrics[] { promotedProduct };
        }
        else
        {
            ArrayList<CampaignAnalyticsProductAnalyticsPromotedProductMetrics> existingList = new ArrayList<>(Arrays.asList(this.promotedProducts));
            existingList.add(promotedProduct);
            this.promotedProducts = existingList.toArray(new CampaignAnalyticsProductAnalyticsPromotedProductMetrics[0]);
        }
        return this;
    }
}

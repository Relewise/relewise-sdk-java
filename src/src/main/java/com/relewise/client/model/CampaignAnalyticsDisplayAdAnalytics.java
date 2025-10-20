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
public class CampaignAnalyticsDisplayAdAnalytics
{
    public CampaignAnalyticsDisplayAdAnalyticsPeriodMetrics[] timeSeries;
    /** Number of times display ads has been promoted by the <code>Campaign</code>. */
    public Integer promotions;
    /** How many times each display ad was promoted. */
    public CampaignAnalyticsDisplayAdAnalyticsPromotedDisplayAdMetrics[] promotedDisplayAds;
    public static CampaignAnalyticsDisplayAdAnalytics create(CampaignAnalyticsDisplayAdAnalyticsPeriodMetrics[] timeSeries, Integer promotions, CampaignAnalyticsDisplayAdAnalyticsPromotedDisplayAdMetrics... promotedDisplayAds)
    {
        return new CampaignAnalyticsDisplayAdAnalytics(timeSeries, promotions, promotedDisplayAds);
    }
    public CampaignAnalyticsDisplayAdAnalytics(CampaignAnalyticsDisplayAdAnalyticsPeriodMetrics[] timeSeries, Integer promotions, CampaignAnalyticsDisplayAdAnalyticsPromotedDisplayAdMetrics... promotedDisplayAds)
    {
        this.timeSeries = timeSeries;
        this.promotions = promotions;
        this.promotedDisplayAds = promotedDisplayAds;
    }
    public CampaignAnalyticsDisplayAdAnalytics()
    {
    }
    public CampaignAnalyticsDisplayAdAnalyticsPeriodMetrics[] getTimeSeries()
    {
        return this.timeSeries;
    }
    /** Number of times display ads has been promoted by the <code>Campaign</code>. */
    public Integer getPromotions()
    {
        return this.promotions;
    }
    /** How many times each display ad was promoted. */
    public CampaignAnalyticsDisplayAdAnalyticsPromotedDisplayAdMetrics[] getPromotedDisplayAds()
    {
        return this.promotedDisplayAds;
    }
    public CampaignAnalyticsDisplayAdAnalytics setTimeSeries(CampaignAnalyticsDisplayAdAnalyticsPeriodMetrics... timeSeries)
    {
        this.timeSeries = timeSeries;
        return this;
    }
    public CampaignAnalyticsDisplayAdAnalytics addToTimeSeries(CampaignAnalyticsDisplayAdAnalyticsPeriodMetrics timeSery)
    {
        if (this.timeSeries == null)
        {
            this.timeSeries = new CampaignAnalyticsDisplayAdAnalyticsPeriodMetrics[] { timeSery };
        }
        else
        {
            ArrayList<CampaignAnalyticsDisplayAdAnalyticsPeriodMetrics> existingList = new ArrayList<>(Arrays.asList(this.timeSeries));
            existingList.add(timeSery);
            this.timeSeries = existingList.toArray(new CampaignAnalyticsDisplayAdAnalyticsPeriodMetrics[0]);
        }
        return this;
    }
    /** Number of times display ads has been promoted by the <code>Campaign</code>. */
    public CampaignAnalyticsDisplayAdAnalytics setPromotions(Integer promotions)
    {
        this.promotions = promotions;
        return this;
    }
    /** How many times each display ad was promoted. */
    public CampaignAnalyticsDisplayAdAnalytics setPromotedDisplayAds(CampaignAnalyticsDisplayAdAnalyticsPromotedDisplayAdMetrics... promotedDisplayAds)
    {
        this.promotedDisplayAds = promotedDisplayAds;
        return this;
    }
    /** How many times each display ad was promoted. */
    public CampaignAnalyticsDisplayAdAnalytics addToPromotedDisplayAds(CampaignAnalyticsDisplayAdAnalyticsPromotedDisplayAdMetrics promotedDisplayAd)
    {
        if (this.promotedDisplayAds == null)
        {
            this.promotedDisplayAds = new CampaignAnalyticsDisplayAdAnalyticsPromotedDisplayAdMetrics[] { promotedDisplayAd };
        }
        else
        {
            ArrayList<CampaignAnalyticsDisplayAdAnalyticsPromotedDisplayAdMetrics> existingList = new ArrayList<>(Arrays.asList(this.promotedDisplayAds));
            existingList.add(promotedDisplayAd);
            this.promotedDisplayAds = existingList.toArray(new CampaignAnalyticsDisplayAdAnalyticsPromotedDisplayAdMetrics[0]);
        }
        return this;
    }
}

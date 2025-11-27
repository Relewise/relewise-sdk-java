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
public class CampaignAnalyticsDisplayAdAnalyticsPeriodMetrics
{
    public OffsetDateTime periodFromUtc;
    public Integer promotions;
    public Integer clicks;
    public static CampaignAnalyticsDisplayAdAnalyticsPeriodMetrics create(OffsetDateTime periodFromUtc, Integer promotions, Integer clicks)
    {
        return new CampaignAnalyticsDisplayAdAnalyticsPeriodMetrics(periodFromUtc, promotions, clicks);
    }
    public CampaignAnalyticsDisplayAdAnalyticsPeriodMetrics(OffsetDateTime periodFromUtc, Integer promotions, Integer clicks)
    {
        this.periodFromUtc = periodFromUtc;
        this.promotions = promotions;
        this.clicks = clicks;
    }
    public CampaignAnalyticsDisplayAdAnalyticsPeriodMetrics()
    {
    }
    public OffsetDateTime getPeriodFromUtc()
    {
        return this.periodFromUtc;
    }
    public Integer getPromotions()
    {
        return this.promotions;
    }
    public Integer getClicks()
    {
        return this.clicks;
    }
    public CampaignAnalyticsDisplayAdAnalyticsPeriodMetrics setPeriodFromUtc(OffsetDateTime periodFromUtc)
    {
        this.periodFromUtc = periodFromUtc;
        return this;
    }
    public CampaignAnalyticsDisplayAdAnalyticsPeriodMetrics setPromotions(Integer promotions)
    {
        this.promotions = promotions;
        return this;
    }
    public CampaignAnalyticsDisplayAdAnalyticsPeriodMetrics setClicks(Integer clicks)
    {
        this.clicks = clicks;
        return this;
    }
}

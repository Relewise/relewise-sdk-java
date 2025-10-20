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
public class CampaignAnalytics
{
    public CampaignAnalyticsProductAnalytics products;
    public CampaignAnalyticsDisplayAdAnalytics displayAds;
    public static CampaignAnalytics create(CampaignAnalyticsProductAnalytics products, CampaignAnalyticsDisplayAdAnalytics displayAds)
    {
        return new CampaignAnalytics(products, displayAds);
    }
    public CampaignAnalytics(CampaignAnalyticsProductAnalytics products, CampaignAnalyticsDisplayAdAnalytics displayAds)
    {
        this.products = products;
        this.displayAds = displayAds;
    }
    public CampaignAnalytics()
    {
    }
    public CampaignAnalyticsProductAnalytics getProducts()
    {
        return this.products;
    }
    public CampaignAnalyticsDisplayAdAnalytics getDisplayAds()
    {
        return this.displayAds;
    }
    public CampaignAnalytics setProducts(CampaignAnalyticsProductAnalytics products)
    {
        this.products = products;
        return this;
    }
    public CampaignAnalytics setDisplayAds(CampaignAnalyticsDisplayAdAnalytics displayAds)
    {
        this.displayAds = displayAds;
        return this;
    }
}

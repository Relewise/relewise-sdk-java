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
import java.util.Set;
import java.util.HashSet;
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = CampaignAnalyticsResponse.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CampaignAnalyticsResponse extends TimedResponse
{
    public String $type = "Relewise.Client.Responses.RetailMedia.CampaignAnalyticsResponse, Relewise.Client";
    public CampaignAnalytics analytics;
    public static CampaignAnalyticsResponse create(CampaignAnalytics analytics)
    {
        return new CampaignAnalyticsResponse(analytics);
    }
    public CampaignAnalyticsResponse(CampaignAnalytics analytics)
    {
        this.analytics = analytics;
    }
    public CampaignAnalyticsResponse()
    {
    }
    public CampaignAnalytics getAnalytics()
    {
        return this.analytics;
    }
    public CampaignAnalyticsResponse setAnalytics(CampaignAnalytics analytics)
    {
        this.analytics = analytics;
        return this;
    }
    @Override
    public CampaignAnalyticsResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;
        return this;
    }
}

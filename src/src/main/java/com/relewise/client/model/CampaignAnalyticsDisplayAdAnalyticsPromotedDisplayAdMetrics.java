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
public class CampaignAnalyticsDisplayAdAnalyticsPromotedDisplayAdMetrics
{
    public String displayAdId;
    public Integer promotions;
    public Integer lastClickedUnixMinutes;
    public Integer numberOfTimesClicked;
    public static CampaignAnalyticsDisplayAdAnalyticsPromotedDisplayAdMetrics create(String displayAdId, Integer promotions, Integer lastClickedUnixMinutes, Integer numberOfTimesClicked)
    {
        return new CampaignAnalyticsDisplayAdAnalyticsPromotedDisplayAdMetrics(displayAdId, promotions, lastClickedUnixMinutes, numberOfTimesClicked);
    }
    public CampaignAnalyticsDisplayAdAnalyticsPromotedDisplayAdMetrics(String displayAdId, Integer promotions, Integer lastClickedUnixMinutes, Integer numberOfTimesClicked)
    {
        this.displayAdId = displayAdId;
        this.promotions = promotions;
        this.lastClickedUnixMinutes = lastClickedUnixMinutes;
        this.numberOfTimesClicked = numberOfTimesClicked;
    }
    public CampaignAnalyticsDisplayAdAnalyticsPromotedDisplayAdMetrics()
    {
    }
    public String getDisplayAdId()
    {
        return this.displayAdId;
    }
    public Integer getPromotions()
    {
        return this.promotions;
    }
    public Integer getLastClickedUnixMinutes()
    {
        return this.lastClickedUnixMinutes;
    }
    public Integer getNumberOfTimesClicked()
    {
        return this.numberOfTimesClicked;
    }
    public CampaignAnalyticsDisplayAdAnalyticsPromotedDisplayAdMetrics setDisplayAdId(String displayAdId)
    {
        this.displayAdId = displayAdId;
        return this;
    }
    public CampaignAnalyticsDisplayAdAnalyticsPromotedDisplayAdMetrics setPromotions(Integer promotions)
    {
        this.promotions = promotions;
        return this;
    }
    public CampaignAnalyticsDisplayAdAnalyticsPromotedDisplayAdMetrics setLastClickedUnixMinutes(Integer lastClickedUnixMinutes)
    {
        this.lastClickedUnixMinutes = lastClickedUnixMinutes;
        return this;
    }
    public CampaignAnalyticsDisplayAdAnalyticsPromotedDisplayAdMetrics setNumberOfTimesClicked(Integer numberOfTimesClicked)
    {
        this.numberOfTimesClicked = numberOfTimesClicked;
        return this;
    }
}

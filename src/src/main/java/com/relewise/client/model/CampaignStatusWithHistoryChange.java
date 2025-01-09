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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class CampaignStatusWithHistoryChange
{
    public OffsetDateTime utcTime;
    public CampaignStatusWithHistoryStatusName status;
    public static CampaignStatusWithHistoryChange create(OffsetDateTime utcTime, CampaignStatusWithHistoryStatusName status)
    {
        return new CampaignStatusWithHistoryChange(utcTime, status);
    }
    public CampaignStatusWithHistoryChange(OffsetDateTime utcTime, CampaignStatusWithHistoryStatusName status)
    {
        this.utcTime = utcTime;
        this.status = status;
    }
    public CampaignStatusWithHistoryChange()
    {
    }
    public OffsetDateTime getUtcTime()
    {
        return this.utcTime;
    }
    public CampaignStatusWithHistoryStatusName getStatus()
    {
        return this.status;
    }
    public CampaignStatusWithHistoryChange setUtcTime(OffsetDateTime utcTime)
    {
        this.utcTime = utcTime;
        return this;
    }
    public CampaignStatusWithHistoryChange setStatus(CampaignStatusWithHistoryStatusName status)
    {
        this.status = status;
        return this;
    }
}

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
public class CampaignStatusWithHistory
{
    public CampaignStatusWithHistoryStatusName current;
    public ArrayList<CampaignStatusWithHistoryChange> history;
    public static CampaignStatusWithHistory create(CampaignStatusWithHistoryStatusName current, CampaignStatusWithHistoryChange... history)
    {
        return new CampaignStatusWithHistory(current, history);
    }
    public CampaignStatusWithHistory(CampaignStatusWithHistoryStatusName current, CampaignStatusWithHistoryChange... history)
    {
        this.current = current;
        this.history = new ArrayList<>(Arrays.asList(history));
    }
    public CampaignStatusWithHistory()
    {
    }
    public CampaignStatusWithHistoryStatusName getCurrent()
    {
        return this.current;
    }
    public ArrayList<CampaignStatusWithHistoryChange> getHistory()
    {
        return this.history;
    }
    public CampaignStatusWithHistory setCurrent(CampaignStatusWithHistoryStatusName current)
    {
        this.current = current;
        return this;
    }
    public CampaignStatusWithHistory setHistory(CampaignStatusWithHistoryChange... history)
    {
        this.history = new ArrayList<>(Arrays.asList(history));;
        return this;
    }
    public CampaignStatusWithHistory addToHistory(CampaignStatusWithHistoryChange history)
    {
        if (this.history == null)
        {
            this.history = new ArrayList<>();
        }
        this.history.add(history);
        return this;
    }
}

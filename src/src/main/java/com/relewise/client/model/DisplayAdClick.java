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
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = DisplayAdClick.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DisplayAdClick extends Trackable
{
    public String $type = "Relewise.Client.DataTypes.DisplayAdClick, Relewise.Client";
    public @Nullable User user;
    public String displayAdId;
    public UUID campaignId;
    public static DisplayAdClick create(@Nullable User user, String displayAdId, UUID campaignId)
    {
        return new DisplayAdClick(user, displayAdId, campaignId);
    }
    public DisplayAdClick(@Nullable User user, String displayAdId, UUID campaignId)
    {
        this.user = user;
        this.displayAdId = displayAdId;
        this.campaignId = campaignId;
    }
    public DisplayAdClick()
    {
    }
    public @Nullable User getUser()
    {
        return this.user;
    }
    public String getDisplayAdId()
    {
        return this.displayAdId;
    }
    public UUID getCampaignId()
    {
        return this.campaignId;
    }
    public DisplayAdClick setUser(@Nullable User user)
    {
        this.user = user;
        return this;
    }
    public DisplayAdClick setDisplayAdId(String displayAdId)
    {
        this.displayAdId = displayAdId;
        return this;
    }
    public DisplayAdClick setCampaignId(UUID campaignId)
    {
        this.campaignId = campaignId;
        return this;
    }
}

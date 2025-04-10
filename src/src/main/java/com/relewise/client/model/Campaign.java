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
    defaultImpl = Campaign.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Campaign extends CampaignEntityStateCampaignMetadataValuesRetailMediaEntity
{
    public String $type = "Relewise.Client.DataTypes.RetailMedia.Campaign, Relewise.Client";
    public String name;
    public @Nullable ISchedule schedule;
    public PromotionCollection promotions;
    public UUID advertiserId;
    public Budget budget;
    public CampaignStatusWithHistory status;
    /** Conditions for Retail Media engine to be applied. */
    public @Nullable RetailMediaConditions conditions;
    public static Campaign create(@Nullable UUID id, CampaignEntityState state, String name, UUID advertiserId, Budget budget, @Nullable ISchedule schedule, PromotionCollection promotions)
    {
        return new Campaign(id, state, name, advertiserId, budget, schedule, promotions);
    }
    public Campaign(@Nullable UUID id, CampaignEntityState state, String name, UUID advertiserId, Budget budget, @Nullable ISchedule schedule, PromotionCollection promotions)
    {
        this.id = id;
        this.state = state;
        this.name = name;
        this.advertiserId = advertiserId;
        this.budget = budget;
        this.schedule = schedule;
        this.promotions = promotions;
    }
    public Campaign()
    {
    }
    public String getName()
    {
        return this.name;
    }
    public @Nullable ISchedule getSchedule()
    {
        return this.schedule;
    }
    public PromotionCollection getPromotions()
    {
        return this.promotions;
    }
    public UUID getAdvertiserId()
    {
        return this.advertiserId;
    }
    public Budget getBudget()
    {
        return this.budget;
    }
    public CampaignStatusWithHistory getStatus()
    {
        return this.status;
    }
    /** Conditions for Retail Media engine to be applied. */
    public @Nullable RetailMediaConditions getConditions()
    {
        return this.conditions;
    }
    public Campaign setName(String name)
    {
        this.name = name;
        return this;
    }
    public Campaign setSchedule(@Nullable ISchedule schedule)
    {
        this.schedule = schedule;
        return this;
    }
    public Campaign setPromotions(PromotionCollection promotions)
    {
        this.promotions = promotions;
        return this;
    }
    public Campaign setAdvertiserId(UUID advertiserId)
    {
        this.advertiserId = advertiserId;
        return this;
    }
    public Campaign setBudget(Budget budget)
    {
        this.budget = budget;
        return this;
    }
    public Campaign setStatus(CampaignStatusWithHistory status)
    {
        this.status = status;
        return this;
    }
    /** Conditions for Retail Media engine to be applied. */
    public Campaign setConditions(@Nullable RetailMediaConditions conditions)
    {
        this.conditions = conditions;
        return this;
    }
    @Override
    public Campaign setState(CampaignEntityState state)
    {
        this.state = state;
        return this;
    }
    @Override
    public Campaign setMetadata(CampaignMetadataValues metadata)
    {
        this.metadata = metadata;
        return this;
    }
    @Override
    public Campaign setId(@Nullable UUID id)
    {
        this.id = id;
        return this;
    }
}

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
    
/** Analytics data request for campaign <code>Id</code> during <code>PeriodUtc</code>. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = CampaignAnalyticsRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CampaignAnalyticsRequest extends LicensedRequest
{
    public String $type = "Relewise.Client.Requests.RetailMedia.CampaignAnalyticsRequest, Relewise.Client";
    /** The campaign to provide analytics for. */
    public UUID id;
    public LocalDateTimeRange periodUtc;
    public @Nullable FilterCollection productFilters;
    public @Nullable FilterCollection displayAdFilters;
    public @Nullable Language language;
    public @Nullable Currency currency;
    public @Nullable SelectedProductPropertiesSettings selectedProductProperties;
    public @Nullable SelectedDisplayAdPropertiesSettings selectedDisplayAdProperties;
    public static CampaignAnalyticsRequest create(UUID id, LocalDateTimeRange periodUtc, @Nullable FilterCollection productFilters, @Nullable FilterCollection displayAdFilters)
    {
        return new CampaignAnalyticsRequest(id, periodUtc, productFilters, displayAdFilters);
    }
    public CampaignAnalyticsRequest(UUID id, LocalDateTimeRange periodUtc, @Nullable FilterCollection productFilters, @Nullable FilterCollection displayAdFilters)
    {
        this.id = id;
        this.periodUtc = periodUtc;
        this.productFilters = productFilters;
        this.displayAdFilters = displayAdFilters;
    }
    public CampaignAnalyticsRequest()
    {
    }
    /** The campaign to provide analytics for. */
    public UUID getId()
    {
        return this.id;
    }
    public LocalDateTimeRange getPeriodUtc()
    {
        return this.periodUtc;
    }
    public @Nullable FilterCollection getProductFilters()
    {
        return this.productFilters;
    }
    public @Nullable FilterCollection getDisplayAdFilters()
    {
        return this.displayAdFilters;
    }
    public @Nullable Language getLanguage()
    {
        return this.language;
    }
    public @Nullable Currency getCurrency()
    {
        return this.currency;
    }
    public @Nullable SelectedProductPropertiesSettings getSelectedProductProperties()
    {
        return this.selectedProductProperties;
    }
    public @Nullable SelectedDisplayAdPropertiesSettings getSelectedDisplayAdProperties()
    {
        return this.selectedDisplayAdProperties;
    }
    /** The campaign to provide analytics for. */
    public CampaignAnalyticsRequest setId(UUID id)
    {
        this.id = id;
        return this;
    }
    public CampaignAnalyticsRequest setPeriodUtc(LocalDateTimeRange periodUtc)
    {
        this.periodUtc = periodUtc;
        return this;
    }
    public CampaignAnalyticsRequest setProductFilters(@Nullable FilterCollection productFilters)
    {
        this.productFilters = productFilters;
        return this;
    }
    public CampaignAnalyticsRequest setDisplayAdFilters(@Nullable FilterCollection displayAdFilters)
    {
        this.displayAdFilters = displayAdFilters;
        return this;
    }
    public CampaignAnalyticsRequest setLanguage(@Nullable Language language)
    {
        this.language = language;
        return this;
    }
    public CampaignAnalyticsRequest setCurrency(@Nullable Currency currency)
    {
        this.currency = currency;
        return this;
    }
    public CampaignAnalyticsRequest setSelectedProductProperties(@Nullable SelectedProductPropertiesSettings selectedProductProperties)
    {
        this.selectedProductProperties = selectedProductProperties;
        return this;
    }
    public CampaignAnalyticsRequest setSelectedDisplayAdProperties(@Nullable SelectedDisplayAdPropertiesSettings selectedDisplayAdProperties)
    {
        this.selectedDisplayAdProperties = selectedDisplayAdProperties;
        return this;
    }
}

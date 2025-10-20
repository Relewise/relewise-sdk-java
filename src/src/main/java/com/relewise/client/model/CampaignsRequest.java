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
    defaultImpl = CampaignsRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CampaignsRequest extends CampaignEntityStateUUIDCampaignMetadataValuesCampaignsRequestSortByCampaignsRequestEntityFiltersEntitiesRequest
{
    public String $type = "Relewise.Client.Requests.RetailMedia.CampaignsRequest, Relewise.Client";
    public static CampaignsRequest create(@Nullable CampaignsRequestEntityFilters filters, @Nullable CampaignsRequestSortBySorting sorting, Integer skip, Integer take)
    {
        return new CampaignsRequest(filters, sorting, skip, take);
    }
    public CampaignsRequest(@Nullable CampaignsRequestEntityFilters filters, @Nullable CampaignsRequestSortBySorting sorting, Integer skip, Integer take)
    {
        this.filters = filters;
        this.sorting = sorting;
        this.skip = skip;
        this.take = take;
    }
    public CampaignsRequest()
    {
    }
    @Override
    public CampaignsRequest setFilters(@Nullable CampaignsRequestEntityFilters filters)
    {
        this.filters = filters;
        return this;
    }
    @Override
    public CampaignsRequest setSorting(@Nullable CampaignsRequestSortBySorting sorting)
    {
        this.sorting = sorting;
        return this;
    }
    @Override
    public CampaignsRequest setSkip(Integer skip)
    {
        this.skip = skip;
        return this;
    }
    @Override
    public CampaignsRequest setTake(Integer take)
    {
        this.take = take;
        return this;
    }
}

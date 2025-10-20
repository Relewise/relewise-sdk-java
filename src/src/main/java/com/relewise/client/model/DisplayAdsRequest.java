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
    defaultImpl = DisplayAdsRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DisplayAdsRequest extends DisplayAdEntityStateStringDisplayAdMetadataValuesDisplayAdsRequestSortByDisplayAdsRequestEntityFiltersEntitiesRequest
{
    public String $type = "Relewise.Client.Requests.RetailMedia.DisplayAdsRequest, Relewise.Client";
    public static DisplayAdsRequest create(@Nullable DisplayAdsRequestEntityFilters filters, @Nullable DisplayAdsRequestSortBySorting sorting, Integer skip, Integer take)
    {
        return new DisplayAdsRequest(filters, sorting, skip, take);
    }
    public DisplayAdsRequest(@Nullable DisplayAdsRequestEntityFilters filters, @Nullable DisplayAdsRequestSortBySorting sorting, Integer skip, Integer take)
    {
        this.filters = filters;
        this.sorting = sorting;
        this.skip = skip;
        this.take = take;
    }
    public DisplayAdsRequest()
    {
    }
    @Override
    public DisplayAdsRequest setFilters(@Nullable DisplayAdsRequestEntityFilters filters)
    {
        this.filters = filters;
        return this;
    }
    @Override
    public DisplayAdsRequest setSorting(@Nullable DisplayAdsRequestSortBySorting sorting)
    {
        this.sorting = sorting;
        return this;
    }
    @Override
    public DisplayAdsRequest setSkip(Integer skip)
    {
        this.skip = skip;
        return this;
    }
    @Override
    public DisplayAdsRequest setTake(Integer take)
    {
        this.take = take;
        return this;
    }
}

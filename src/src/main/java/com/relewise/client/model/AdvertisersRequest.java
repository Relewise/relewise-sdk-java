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
import java.util.AbstractMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashSet;
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = AdvertisersRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AdvertisersRequest extends AdvertiserEntityStateAdvertiserMetadataValuesAdvertisersRequestSortByAdvertisersRequestEntityFiltersEntitiesRequest
{
    public String $type = "Relewise.Client.Requests.RetailMedia.AdvertisersRequest, Relewise.Client";
    public static AdvertisersRequest create(@Nullable AdvertisersRequestEntityFilters filters, @Nullable AdvertisersRequestSortBySorting sorting, Integer skip, Integer take)
    {
        return new AdvertisersRequest(filters, sorting, skip, take);
    }
    public AdvertisersRequest(@Nullable AdvertisersRequestEntityFilters filters, @Nullable AdvertisersRequestSortBySorting sorting, Integer skip, Integer take)
    {
        this.filters = filters;
        this.sorting = sorting;
        this.skip = skip;
        this.take = take;
    }
    public AdvertisersRequest()
    {
    }
    @Override
    public AdvertisersRequest setFilters(@Nullable AdvertisersRequestEntityFilters filters)
    {
        this.filters = filters;
        return this;
    }
    @Override
    public AdvertisersRequest setSorting(@Nullable AdvertisersRequestSortBySorting sorting)
    {
        this.sorting = sorting;
        return this;
    }
    @Override
    public AdvertisersRequest setSkip(Integer skip)
    {
        this.skip = skip;
        return this;
    }
    @Override
    public AdvertisersRequest setTake(Integer take)
    {
        this.take = take;
        return this;
    }
}

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
    defaultImpl = LocationsRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class LocationsRequest extends LocationEntityStateLocationMetadataValuesLocationsRequestSortByLocationsRequestEntityFiltersEntitiesRequest
{
    public String $type = "Relewise.Client.Requests.RetailMedia.LocationsRequest, Relewise.Client";
    public static LocationsRequest create(@Nullable LocationsRequestEntityFilters filters, @Nullable LocationsRequestSortBySorting sorting, Integer skip, Integer take)
    {
        return new LocationsRequest(filters, sorting, skip, take);
    }
    public LocationsRequest(@Nullable LocationsRequestEntityFilters filters, @Nullable LocationsRequestSortBySorting sorting, Integer skip, Integer take)
    {
        this.filters = filters;
        this.sorting = sorting;
        this.skip = skip;
        this.take = take;
    }
    public LocationsRequest()
    {
    }
    @Override
    public LocationsRequest setFilters(@Nullable LocationsRequestEntityFilters filters)
    {
        this.filters = filters;
        return this;
    }
    @Override
    public LocationsRequest setSorting(@Nullable LocationsRequestSortBySorting sorting)
    {
        this.sorting = sorting;
        return this;
    }
    @Override
    public LocationsRequest setSkip(Integer skip)
    {
        this.skip = skip;
        return this;
    }
    @Override
    public LocationsRequest setTake(Integer take)
    {
        this.take = take;
        return this;
    }
}

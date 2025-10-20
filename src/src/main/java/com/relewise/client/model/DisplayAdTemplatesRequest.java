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
    defaultImpl = DisplayAdTemplatesRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DisplayAdTemplatesRequest extends DisplayAdTemplateEntityStateUUIDDisplayAdTemplateMetadataValuesDisplayAdTemplatesRequestSortByDisplayAdTemplatesRequestEntityFiltersEntitiesRequest
{
    public String $type = "Relewise.Client.Requests.RetailMedia.DisplayAdTemplatesRequest, Relewise.Client";
    public static DisplayAdTemplatesRequest create(@Nullable DisplayAdTemplatesRequestEntityFilters filters, @Nullable DisplayAdTemplatesRequestSortBySorting sorting, Integer skip, Integer take)
    {
        return new DisplayAdTemplatesRequest(filters, sorting, skip, take);
    }
    public DisplayAdTemplatesRequest(@Nullable DisplayAdTemplatesRequestEntityFilters filters, @Nullable DisplayAdTemplatesRequestSortBySorting sorting, Integer skip, Integer take)
    {
        this.filters = filters;
        this.sorting = sorting;
        this.skip = skip;
        this.take = take;
    }
    public DisplayAdTemplatesRequest()
    {
    }
    @Override
    public DisplayAdTemplatesRequest setFilters(@Nullable DisplayAdTemplatesRequestEntityFilters filters)
    {
        this.filters = filters;
        return this;
    }
    @Override
    public DisplayAdTemplatesRequest setSorting(@Nullable DisplayAdTemplatesRequestSortBySorting sorting)
    {
        this.sorting = sorting;
        return this;
    }
    @Override
    public DisplayAdTemplatesRequest setSkip(Integer skip)
    {
        this.skip = skip;
        return this;
    }
    @Override
    public DisplayAdTemplatesRequest setTake(Integer take)
    {
        this.take = take;
        return this;
    }
}

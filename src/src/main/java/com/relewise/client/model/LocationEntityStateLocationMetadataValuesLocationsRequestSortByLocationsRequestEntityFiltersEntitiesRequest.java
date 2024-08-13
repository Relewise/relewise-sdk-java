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
    property = "$type")
@JsonSubTypes({
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class LocationEntityStateLocationMetadataValuesLocationsRequestSortByLocationsRequestEntityFiltersEntitiesRequest extends LicensedRequest
{
    public String $type = "";
    public @Nullable LocationsRequestEntityFilters filters;
    public @Nullable LocationsRequestSortBySorting sorting;
    public Integer skip;
    public Integer take;
    public @Nullable LocationsRequestEntityFilters getFilters()
    {
        return this.filters;
    }
    public @Nullable LocationsRequestSortBySorting getSorting()
    {
        return this.sorting;
    }
    public Integer getSkip()
    {
        return this.skip;
    }
    public Integer getTake()
    {
        return this.take;
    }
    public LocationEntityStateLocationMetadataValuesLocationsRequestSortByLocationsRequestEntityFiltersEntitiesRequest setFilters(@Nullable LocationsRequestEntityFilters filters)
    {
        this.filters = filters;
        return this;
    }
    public LocationEntityStateLocationMetadataValuesLocationsRequestSortByLocationsRequestEntityFiltersEntitiesRequest setSorting(@Nullable LocationsRequestSortBySorting sorting)
    {
        this.sorting = sorting;
        return this;
    }
    public LocationEntityStateLocationMetadataValuesLocationsRequestSortByLocationsRequestEntityFiltersEntitiesRequest setSkip(Integer skip)
    {
        this.skip = skip;
        return this;
    }
    public LocationEntityStateLocationMetadataValuesLocationsRequestSortByLocationsRequestEntityFiltersEntitiesRequest setTake(Integer take)
    {
        this.take = take;
        return this;
    }
}

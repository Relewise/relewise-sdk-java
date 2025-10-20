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
    property = "$type")
@JsonSubTypes({
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class DisplayAdEntityStateStringDisplayAdMetadataValuesDisplayAdsRequestSortByDisplayAdsRequestEntityFiltersEntitiesRequest extends LicensedRequest
{
    public String $type = "";
    public @Nullable DisplayAdsRequestEntityFilters filters;
    public @Nullable DisplayAdsRequestSortBySorting sorting;
    public Integer skip;
    public Integer take;
    public @Nullable DisplayAdsRequestEntityFilters getFilters()
    {
        return this.filters;
    }
    public @Nullable DisplayAdsRequestSortBySorting getSorting()
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
    public DisplayAdEntityStateStringDisplayAdMetadataValuesDisplayAdsRequestSortByDisplayAdsRequestEntityFiltersEntitiesRequest setFilters(@Nullable DisplayAdsRequestEntityFilters filters)
    {
        this.filters = filters;
        return this;
    }
    public DisplayAdEntityStateStringDisplayAdMetadataValuesDisplayAdsRequestSortByDisplayAdsRequestEntityFiltersEntitiesRequest setSorting(@Nullable DisplayAdsRequestSortBySorting sorting)
    {
        this.sorting = sorting;
        return this;
    }
    public DisplayAdEntityStateStringDisplayAdMetadataValuesDisplayAdsRequestSortByDisplayAdsRequestEntityFiltersEntitiesRequest setSkip(Integer skip)
    {
        this.skip = skip;
        return this;
    }
    public DisplayAdEntityStateStringDisplayAdMetadataValuesDisplayAdsRequestSortByDisplayAdsRequestEntityFiltersEntitiesRequest setTake(Integer take)
    {
        this.take = take;
        return this;
    }
}

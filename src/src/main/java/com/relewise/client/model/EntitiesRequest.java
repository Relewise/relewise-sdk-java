package com.relewise.client.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
public abstract class EntitiesRequest extends LicensedRequest
{
    public String $type = "";
    public @Nullable AdvertisersRequestEntityFilters filters;
    public @Nullable AdvertisersRequestSortBySorting sorting;
    public Integer skip;
    public Integer take;
    public @Nullable AdvertisersRequestEntityFilters getFilters()
    {
        return this.filters;
    }
    public @Nullable AdvertisersRequestSortBySorting getSorting()
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
    public EntitiesRequest setFilters(AdvertisersRequestEntityFilters filters)
    {
        this.filters = filters;
        return this;
    }
    public EntitiesRequest setSorting(AdvertisersRequestSortBySorting sorting)
    {
        this.sorting = sorting;
        return this;
    }
    public EntitiesRequest setSkip(Integer skip)
    {
        this.skip = skip;
        return this;
    }
    public EntitiesRequest setTake(Integer take)
    {
        this.take = take;
        return this;
    }
}

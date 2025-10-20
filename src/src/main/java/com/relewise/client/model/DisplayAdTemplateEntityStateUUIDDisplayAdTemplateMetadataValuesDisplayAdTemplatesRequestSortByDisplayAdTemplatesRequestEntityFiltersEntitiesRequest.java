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
public abstract class DisplayAdTemplateEntityStateUUIDDisplayAdTemplateMetadataValuesDisplayAdTemplatesRequestSortByDisplayAdTemplatesRequestEntityFiltersEntitiesRequest extends LicensedRequest
{
    public String $type = "";
    public @Nullable DisplayAdTemplatesRequestEntityFilters filters;
    public @Nullable DisplayAdTemplatesRequestSortBySorting sorting;
    public Integer skip;
    public Integer take;
    public @Nullable DisplayAdTemplatesRequestEntityFilters getFilters()
    {
        return this.filters;
    }
    public @Nullable DisplayAdTemplatesRequestSortBySorting getSorting()
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
    public DisplayAdTemplateEntityStateUUIDDisplayAdTemplateMetadataValuesDisplayAdTemplatesRequestSortByDisplayAdTemplatesRequestEntityFiltersEntitiesRequest setFilters(@Nullable DisplayAdTemplatesRequestEntityFilters filters)
    {
        this.filters = filters;
        return this;
    }
    public DisplayAdTemplateEntityStateUUIDDisplayAdTemplateMetadataValuesDisplayAdTemplatesRequestSortByDisplayAdTemplatesRequestEntityFiltersEntitiesRequest setSorting(@Nullable DisplayAdTemplatesRequestSortBySorting sorting)
    {
        this.sorting = sorting;
        return this;
    }
    public DisplayAdTemplateEntityStateUUIDDisplayAdTemplateMetadataValuesDisplayAdTemplatesRequestSortByDisplayAdTemplatesRequestEntityFiltersEntitiesRequest setSkip(Integer skip)
    {
        this.skip = skip;
        return this;
    }
    public DisplayAdTemplateEntityStateUUIDDisplayAdTemplateMetadataValuesDisplayAdTemplatesRequestSortByDisplayAdTemplatesRequestEntityFiltersEntitiesRequest setTake(Integer take)
    {
        this.take = take;
        return this;
    }
}

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
import java.util.Set;
import java.util.HashSet;
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = ContentDataObjectFacetResult.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentDataObjectFacetResult extends DataObjectFacetResult
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Result.ContentDataObjectFacetResult, Relewise.Client";
    public static ContentDataObjectFacetResult create(String key, ArrayList<FacetResult> items, DataObjectFilter filter)
    {
        return new ContentDataObjectFacetResult(key, items, filter);
    }
    public ContentDataObjectFacetResult(String key, ArrayList<FacetResult> items, DataObjectFilter filter)
    {
        this.key = key;
        this.items = items;
        this.filter = filter;
    }
    public ContentDataObjectFacetResult()
    {
    }
    @Override
    public ContentDataObjectFacetResult setKey(String key)
    {
        this.key = key;
        return this;
    }
    @Override
    public ContentDataObjectFacetResult setItems(FacetResult... items)
    {
        this.items = new ArrayList<>(Arrays.asList(items));;
        return this;
    }
    public ContentDataObjectFacetResult addToItems(FacetResult items)
    {
        if (this.items == null)
        {
            this.items = new ArrayList<>();
        }
        this.items.add(items);
        return this;
    }
    @Override
    public ContentDataObjectFacetResult setFilter(DataObjectFilter filter)
    {
        this.filter = filter;
        return this;
    }
    @Override
    public ContentDataObjectFacetResult setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
}

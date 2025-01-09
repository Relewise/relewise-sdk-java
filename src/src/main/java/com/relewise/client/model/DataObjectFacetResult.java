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
    defaultImpl = DataObjectFacetResult.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DataObjectFacetResult extends FacetResult
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Result.DataObjectFacetResult, Relewise.Client";
    public String key;
    public ArrayList<FacetResult> items;
    public DataObjectFilter filter;
    public static DataObjectFacetResult create(String key, ArrayList<FacetResult> items, DataObjectFilter filter)
    {
        return new DataObjectFacetResult(key, items, filter);
    }
    public DataObjectFacetResult(String key, ArrayList<FacetResult> items, DataObjectFilter filter)
    {
        this.key = key;
        this.items = items;
        this.filter = filter;
    }
    public DataObjectFacetResult()
    {
    }
    public String getKey()
    {
        return this.key;
    }
    public ArrayList<FacetResult> getItems()
    {
        return this.items;
    }
    public DataObjectFilter getFilter()
    {
        return this.filter;
    }
    public DataObjectFacetResult setKey(String key)
    {
        this.key = key;
        return this;
    }
    public DataObjectFacetResult setItems(FacetResult... items)
    {
        this.items = new ArrayList<>(Arrays.asList(items));;
        return this;
    }
    public DataObjectFacetResult addToItems(FacetResult items)
    {
        if (this.items == null)
        {
            this.items = new ArrayList<>();
        }
        this.items.add(items);
        return this;
    }
    public DataObjectFacetResult setFilter(DataObjectFilter filter)
    {
        this.filter = filter;
        return this;
    }
    @Override
    public DataObjectFacetResult setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
}

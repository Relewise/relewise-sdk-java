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
    defaultImpl = DataObjectFacet.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DataObjectFacet extends Facet
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Queries.DataObjectFacet, Relewise.Client";
    public String key;
    public ArrayList<Facet> items;
    public DataObjectFilter filter;
    public static DataObjectFacet create(String key)
    {
        return new DataObjectFacet(key);
    }
    public DataObjectFacet(String key)
    {
        this.key = key;
    }
    public DataObjectFacet()
    {
    }
    public String getKey()
    {
        return this.key;
    }
    public ArrayList<Facet> getItems()
    {
        return this.items;
    }
    public DataObjectFilter getFilter()
    {
        return this.filter;
    }
    public DataObjectFacet setKey(String key)
    {
        this.key = key;
        return this;
    }
    public DataObjectFacet setItems(Facet... items)
    {
        this.items = new ArrayList<>(Arrays.asList(items));;
        return this;
    }
    public DataObjectFacet addToItems(Facet items)
    {
        if (this.items == null)
        {
            this.items = new ArrayList<>();
        }
        this.items.add(items);
        return this;
    }
    public DataObjectFacet setFilter(DataObjectFilter filter)
    {
        this.filter = filter;
        return this;
    }
    @Override
    public DataObjectFacet setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
    @Override
    public DataObjectFacet setSettings(@Nullable FacetSettings settings)
    {
        this.settings = settings;
        return this;
    }
}

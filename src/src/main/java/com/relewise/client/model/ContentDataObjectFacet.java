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
    defaultImpl = ContentDataObjectFacet.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentDataObjectFacet extends DataObjectFacet
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Queries.ContentDataObjectFacet, Relewise.Client";
    public static ContentDataObjectFacet create(String key)
    {
        return new ContentDataObjectFacet(key);
    }
    public ContentDataObjectFacet(String key)
    {
        this.key = key;
    }
    public ContentDataObjectFacet()
    {
    }
    @Override
    public ContentDataObjectFacet setKey(String key)
    {
        this.key = key;
        return this;
    }
    @Override
    public ContentDataObjectFacet setItems(Facet... items)
    {
        this.items = new ArrayList<>(Arrays.asList(items));;
        return this;
    }
    public ContentDataObjectFacet addToItems(Facet items)
    {
        if (this.items == null)
        {
            this.items = new ArrayList<>();
        }
        this.items.add(items);
        return this;
    }
    @Override
    public ContentDataObjectFacet setFilter(DataObjectFilter filter)
    {
        this.filter = filter;
        return this;
    }
    @Override
    public ContentDataObjectFacet setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
    @Override
    public ContentDataObjectFacet setSettings(@Nullable FacetSettings settings)
    {
        this.settings = settings;
        return this;
    }
}

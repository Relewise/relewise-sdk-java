package com.relewise.client.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.annotation.Nullable;
import java.io.IOException;
import java.time.OffsetDateTime;
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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentFacetQuery
{
    public ArrayList<Facet> items;
    public static ContentFacetQuery create()
    {
        return new ContentFacetQuery();
    }
    public ContentFacetQuery()
    {
    }
    public ArrayList<Facet> getItems()
    {
        return this.items;
    }
    public ContentFacetQuery setItems(Facet... items)
    {
        this.items = new ArrayList<>(Arrays.asList(items));;
        return this;
    }
    public ContentFacetQuery addToItems(Facet items)
    {
        if (this.items == null)
        {
            this.items = new ArrayList<>();
        }
        this.items.add(items);
        return this;
    }
}

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
    defaultImpl = ProductFacetQuery.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductFacetQuery extends FacetQuery
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Queries.ProductFacetQuery, Relewise.Client";
    public ArrayList<Facet> items;
    public static ProductFacetQuery create()
    {
        return new ProductFacetQuery();
    }
    public ProductFacetQuery()
    {
    }
    public ArrayList<Facet> getItems()
    {
        return this.items;
    }
    public ProductFacetQuery setItems(Facet... items)
    {
        this.items = new ArrayList<>(Arrays.asList(items));;
        return this;
    }
    public ProductFacetQuery addToItems(Facet items)
    {
        if (this.items == null)
        {
            this.items = new ArrayList<>();
        }
        this.items.add(items);
        return this;
    }
}

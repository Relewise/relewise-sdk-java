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
    property = "$type",
    defaultImpl = ProductCategoryFacetQuery.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductCategoryFacetQuery extends FacetQuery
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Queries.ProductCategoryFacetQuery, Relewise.Client";
    public ArrayList<Facet> items;
    public static ProductCategoryFacetQuery create()
    {
        return new ProductCategoryFacetQuery();
    }
    public ProductCategoryFacetQuery()
    {
    }
    public ArrayList<Facet> getItems()
    {
        return this.items;
    }
    public ProductCategoryFacetQuery setItems(Facet... items)
    {
        this.items = new ArrayList<>(Arrays.asList(items));;
        return this;
    }
    public ProductCategoryFacetQuery addToItems(Facet items)
    {
        if (this.items == null)
        {
            this.items = new ArrayList<>();
        }
        this.items.add(items);
        return this;
    }
}

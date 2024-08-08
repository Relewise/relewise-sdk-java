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
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = ProductDataObjectFacet.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductDataObjectFacet extends DataObjectFacet
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Queries.ProductDataObjectFacet, Relewise.Client";
    public DataSelectionStrategy dataSelectionStrategy;
    public static ProductDataObjectFacet create(DataSelectionStrategy dataSelectionStrategy, String key)
    {
        return new ProductDataObjectFacet(dataSelectionStrategy, key);
    }
    public ProductDataObjectFacet(DataSelectionStrategy dataSelectionStrategy, String key)
    {
        this.dataSelectionStrategy = dataSelectionStrategy;
        this.key = key;
    }
    public ProductDataObjectFacet()
    {
    }
    public DataSelectionStrategy getDataSelectionStrategy()
    {
        return this.dataSelectionStrategy;
    }
    public ProductDataObjectFacet setDataSelectionStrategy(DataSelectionStrategy dataSelectionStrategy)
    {
        this.dataSelectionStrategy = dataSelectionStrategy;;
        return this;
    }
    @Override
    public ProductDataObjectFacet setKey(String key)
    {
        this.key = key;;
        return this;
    }
    @Override
    public ProductDataObjectFacet setItems(Facet... items)
    {
        this.items = new ArrayList<>(Arrays.asList(items));;
        return this;
    }
    public ProductDataObjectFacet addToItems(Facet items)
    {
        if (this.items == null)
        {
            this.items = new ArrayList<>();
        }
        this.items.add(items);
        return this;
    }
    @Override
    public ProductDataObjectFacet setFilter(DataObjectFilter filter)
    {
        this.filter = filter;;
        return this;
    }
    @Override
    public ProductDataObjectFacet setField(FacetingField field)
    {
        this.field = field;;
        return this;
    }
    @Override
    public ProductDataObjectFacet setSettings(FacetSettings settings)
    {
        this.settings = settings;;
        return this;
    }
}

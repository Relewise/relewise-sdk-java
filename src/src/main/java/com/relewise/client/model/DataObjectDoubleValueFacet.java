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
    defaultImpl = DataObjectDoubleValueFacet.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DataObjectDoubleValueFacet extends DoubleDataObjectValueFacet
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Queries.DataObjectDoubleValueFacet, Relewise.Client";
    public static DataObjectDoubleValueFacet create(String key, @Nullable ArrayList<Double> selected, @Nullable CollectionFilterType collectionFilterType)
    {
        return new DataObjectDoubleValueFacet(key, selected, collectionFilterType);
    }
    public DataObjectDoubleValueFacet(String key, @Nullable ArrayList<Double> selected, @Nullable CollectionFilterType collectionFilterType)
    {
        this.key = key;
        this.selected = selected;
        this.collectionFilterType = collectionFilterType;
    }
    public DataObjectDoubleValueFacet()
    {
    }
    @Override
    public DataObjectDoubleValueFacet setKey(String key)
    {
        this.key = key;
        return this;
    }
    @Override
    public DataObjectDoubleValueFacet setCollectionFilterType(@Nullable CollectionFilterType collectionFilterType)
    {
        this.collectionFilterType = collectionFilterType;
        return this;
    }
    @Override
    public DataObjectDoubleValueFacet setSelected(Double... selected)
    {
        this.selected = new ArrayList<>(Arrays.asList(selected));;
        return this;
    }
    public DataObjectDoubleValueFacet addToSelected(Double selected)
    {
        if (this.selected == null)
        {
            this.selected = new ArrayList<>();
        }
        this.selected.add(selected);
        return this;
    }
    @Override
    public DataObjectDoubleValueFacet setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
    @Override
    public DataObjectDoubleValueFacet setSettings(@Nullable FacetSettings settings)
    {
        this.settings = settings;
        return this;
    }
}

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
    defaultImpl = DataObjectStringValueFacet.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DataObjectStringValueFacet extends StringDataObjectValueFacet
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Queries.DataObjectStringValueFacet, Relewise.Client";
    public static DataObjectStringValueFacet create(String key, @Nullable ArrayList<String> selected, @Nullable CollectionFilterType collectionFilterType)
    {
        return new DataObjectStringValueFacet(key, selected, collectionFilterType);
    }
    public DataObjectStringValueFacet(String key, @Nullable ArrayList<String> selected, @Nullable CollectionFilterType collectionFilterType)
    {
        this.key = key;
        this.selected = selected;
        this.collectionFilterType = collectionFilterType;
    }
    public DataObjectStringValueFacet()
    {
    }
    @Override
    public DataObjectStringValueFacet setKey(String key)
    {
        this.key = key;
        return this;
    }
    @Override
    public DataObjectStringValueFacet setCollectionFilterType(@Nullable CollectionFilterType collectionFilterType)
    {
        this.collectionFilterType = collectionFilterType;
        return this;
    }
    @Override
    public DataObjectStringValueFacet setSelected(String... selected)
    {
        this.selected = new ArrayList<>(Arrays.asList(selected));;
        return this;
    }
    public DataObjectStringValueFacet addToSelected(String selected)
    {
        if (this.selected == null)
        {
            this.selected = new ArrayList<>();
        }
        this.selected.add(selected);
        return this;
    }
    @Override
    public DataObjectStringValueFacet setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
    @Override
    public DataObjectStringValueFacet setSettings(@Nullable FacetSettings settings)
    {
        this.settings = settings;
        return this;
    }
}

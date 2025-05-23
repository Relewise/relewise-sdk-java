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
    defaultImpl = DataObjectBooleanValueFacet.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DataObjectBooleanValueFacet extends BooleanDataObjectValueFacet
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Queries.DataObjectBooleanValueFacet, Relewise.Client";
    public static DataObjectBooleanValueFacet create(String key, @Nullable ArrayList<Boolean> selected, @Nullable CollectionFilterType collectionFilterType)
    {
        return new DataObjectBooleanValueFacet(key, selected, collectionFilterType);
    }
    public DataObjectBooleanValueFacet(String key, @Nullable ArrayList<Boolean> selected, @Nullable CollectionFilterType collectionFilterType)
    {
        this.key = key;
        this.selected = selected;
        this.collectionFilterType = collectionFilterType;
    }
    public DataObjectBooleanValueFacet()
    {
    }
    @Override
    public DataObjectBooleanValueFacet setKey(String key)
    {
        this.key = key;
        return this;
    }
    @Override
    public DataObjectBooleanValueFacet setCollectionFilterType(@Nullable CollectionFilterType collectionFilterType)
    {
        this.collectionFilterType = collectionFilterType;
        return this;
    }
    @Override
    public DataObjectBooleanValueFacet setSelected(Boolean... selected)
    {
        this.selected = new ArrayList<>(Arrays.asList(selected));;
        return this;
    }
    public DataObjectBooleanValueFacet addToSelected(Boolean selected)
    {
        if (this.selected == null)
        {
            this.selected = new ArrayList<>();
        }
        this.selected.add(selected);
        return this;
    }
    @Override
    public DataObjectBooleanValueFacet setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
    @Override
    public DataObjectBooleanValueFacet setSettings(@Nullable FacetSettings settings)
    {
        this.settings = settings;
        return this;
    }
}

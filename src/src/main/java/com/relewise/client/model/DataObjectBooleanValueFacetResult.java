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
    defaultImpl = DataObjectBooleanValueFacetResult.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DataObjectBooleanValueFacetResult extends BooleanDataObjectValueFacetResult
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Result.DataObjectBooleanValueFacetResult, Relewise.Client";
    public static DataObjectBooleanValueFacetResult create(String key, ArrayList<Boolean> selected, @Nullable CollectionFilterType collectionFilterType, BooleanAvailableFacetValue... available)
    {
        return new DataObjectBooleanValueFacetResult(key, selected, collectionFilterType, available);
    }
    public DataObjectBooleanValueFacetResult(String key, ArrayList<Boolean> selected, @Nullable CollectionFilterType collectionFilterType, BooleanAvailableFacetValue... available)
    {
        this.key = key;
        this.selected = selected;
        this.collectionFilterType = collectionFilterType;
        this.available = new ArrayList<>(Arrays.asList(available));
    }
    public DataObjectBooleanValueFacetResult()
    {
    }
    @Override
    public DataObjectBooleanValueFacetResult setKey(String key)
    {
        this.key = key;
        return this;
    }
    @Override
    public DataObjectBooleanValueFacetResult setCollectionFilterType(@Nullable CollectionFilterType collectionFilterType)
    {
        this.collectionFilterType = collectionFilterType;
        return this;
    }
    @Override
    public DataObjectBooleanValueFacetResult setSelected(Boolean... selected)
    {
        this.selected = new ArrayList<>(Arrays.asList(selected));;
        return this;
    }
    public DataObjectBooleanValueFacetResult addToSelected(Boolean selected)
    {
        if (this.selected == null)
        {
            this.selected = new ArrayList<>();
        }
        this.selected.add(selected);
        return this;
    }
    @Override
    public DataObjectBooleanValueFacetResult setAvailable(BooleanAvailableFacetValue... available)
    {
        this.available = new ArrayList<>(Arrays.asList(available));;
        return this;
    }
    public DataObjectBooleanValueFacetResult addToAvailable(BooleanAvailableFacetValue available)
    {
        if (this.available == null)
        {
            this.available = new ArrayList<>();
        }
        this.available.add(available);
        return this;
    }
    @Override
    public DataObjectBooleanValueFacetResult setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
}

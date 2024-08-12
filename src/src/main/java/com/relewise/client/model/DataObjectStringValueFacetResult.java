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
    defaultImpl = DataObjectStringValueFacetResult.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DataObjectStringValueFacetResult extends StringDataObjectValueFacetResult
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Result.DataObjectStringValueFacetResult, Relewise.Client";
    public static DataObjectStringValueFacetResult create(String key, ArrayList<String> selected, @Nullable CollectionFilterType collectionFilterType, StringAvailableFacetValue... available)
    {
        return new DataObjectStringValueFacetResult(key, selected, collectionFilterType, available);
    }
    public DataObjectStringValueFacetResult(String key, ArrayList<String> selected, @Nullable CollectionFilterType collectionFilterType, StringAvailableFacetValue... available)
    {
        this.key = key;
        this.selected = selected;
        this.collectionFilterType = collectionFilterType;
        this.available = new ArrayList<>(Arrays.asList(available));
    }
    public DataObjectStringValueFacetResult()
    {
    }
    @Override
    public DataObjectStringValueFacetResult setKey(String key)
    {
        this.key = key;
        return this;
    }
    @Override
    public DataObjectStringValueFacetResult setCollectionFilterType(@Nullable CollectionFilterType collectionFilterType)
    {
        this.collectionFilterType = collectionFilterType;
        return this;
    }
    @Override
    public DataObjectStringValueFacetResult setSelected(String... selected)
    {
        this.selected = new ArrayList<>(Arrays.asList(selected));;
        return this;
    }
    public DataObjectStringValueFacetResult addToSelected(String selected)
    {
        if (this.selected == null)
        {
            this.selected = new ArrayList<>();
        }
        this.selected.add(selected);
        return this;
    }
    @Override
    public DataObjectStringValueFacetResult setAvailable(StringAvailableFacetValue... available)
    {
        this.available = new ArrayList<>(Arrays.asList(available));;
        return this;
    }
    public DataObjectStringValueFacetResult addToAvailable(StringAvailableFacetValue available)
    {
        if (this.available == null)
        {
            this.available = new ArrayList<>();
        }
        this.available.add(available);
        return this;
    }
    @Override
    public DataObjectStringValueFacetResult setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
}

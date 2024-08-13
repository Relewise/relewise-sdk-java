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
    defaultImpl = ContentDataBooleanValueFacetResult.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentDataBooleanValueFacetResult extends BooleanContentDataValueFacetResult
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Result.ContentDataBooleanValueFacetResult, Relewise.Client";
    public static ContentDataBooleanValueFacetResult create(String key, ArrayList<Boolean> selected, @Nullable CollectionFilterType collectionFilterType, BooleanAvailableFacetValue... available)
    {
        return new ContentDataBooleanValueFacetResult(key, selected, collectionFilterType, available);
    }
    public ContentDataBooleanValueFacetResult(String key, ArrayList<Boolean> selected, @Nullable CollectionFilterType collectionFilterType, BooleanAvailableFacetValue... available)
    {
        this.key = key;
        this.selected = selected;
        this.collectionFilterType = collectionFilterType;
        this.available = new ArrayList<>(Arrays.asList(available));
    }
    public ContentDataBooleanValueFacetResult()
    {
    }
    @Override
    public ContentDataBooleanValueFacetResult setKey(String key)
    {
        this.key = key;
        return this;
    }
    @Override
    public ContentDataBooleanValueFacetResult setCollectionFilterType(@Nullable CollectionFilterType collectionFilterType)
    {
        this.collectionFilterType = collectionFilterType;
        return this;
    }
    @Override
    public ContentDataBooleanValueFacetResult setSelected(Boolean... selected)
    {
        this.selected = new ArrayList<>(Arrays.asList(selected));;
        return this;
    }
    public ContentDataBooleanValueFacetResult addToSelected(Boolean selected)
    {
        if (this.selected == null)
        {
            this.selected = new ArrayList<>();
        }
        this.selected.add(selected);
        return this;
    }
    @Override
    public ContentDataBooleanValueFacetResult setAvailable(BooleanAvailableFacetValue... available)
    {
        this.available = new ArrayList<>(Arrays.asList(available));;
        return this;
    }
    public ContentDataBooleanValueFacetResult addToAvailable(BooleanAvailableFacetValue available)
    {
        if (this.available == null)
        {
            this.available = new ArrayList<>();
        }
        this.available.add(available);
        return this;
    }
    @Override
    public ContentDataBooleanValueFacetResult setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
}

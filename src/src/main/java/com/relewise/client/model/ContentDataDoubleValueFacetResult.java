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
    defaultImpl = ContentDataDoubleValueFacetResult.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentDataDoubleValueFacetResult extends DoubleContentDataValueFacetResult
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Result.ContentDataDoubleValueFacetResult, Relewise.Client";
    public static ContentDataDoubleValueFacetResult create(String key, ArrayList<Double> selected, @Nullable CollectionFilterType collectionFilterType, DoubleAvailableFacetValue... available)
    {
        return new ContentDataDoubleValueFacetResult(key, selected, collectionFilterType, available);
    }
    public ContentDataDoubleValueFacetResult(String key, ArrayList<Double> selected, @Nullable CollectionFilterType collectionFilterType, DoubleAvailableFacetValue... available)
    {
        this.key = key;
        this.selected = selected;
        this.collectionFilterType = collectionFilterType;
        this.available = new ArrayList<>(Arrays.asList(available));
    }
    public ContentDataDoubleValueFacetResult()
    {
    }
    @Override
    public ContentDataDoubleValueFacetResult setKey(String key)
    {
        this.key = key;
        return this;
    }
    @Override
    public ContentDataDoubleValueFacetResult setCollectionFilterType(@Nullable CollectionFilterType collectionFilterType)
    {
        this.collectionFilterType = collectionFilterType;
        return this;
    }
    @Override
    public ContentDataDoubleValueFacetResult setSelected(Double... selected)
    {
        this.selected = new ArrayList<>(Arrays.asList(selected));;
        return this;
    }
    public ContentDataDoubleValueFacetResult addToSelected(Double selected)
    {
        if (this.selected == null)
        {
            this.selected = new ArrayList<>();
        }
        this.selected.add(selected);
        return this;
    }
    @Override
    public ContentDataDoubleValueFacetResult setAvailable(DoubleAvailableFacetValue... available)
    {
        this.available = new ArrayList<>(Arrays.asList(available));;
        return this;
    }
    public ContentDataDoubleValueFacetResult addToAvailable(DoubleAvailableFacetValue available)
    {
        if (this.available == null)
        {
            this.available = new ArrayList<>();
        }
        this.available.add(available);
        return this;
    }
    @Override
    public ContentDataDoubleValueFacetResult setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
}

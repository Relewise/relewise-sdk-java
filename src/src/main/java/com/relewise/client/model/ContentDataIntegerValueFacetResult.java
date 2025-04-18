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
    
/** @deprecated Use ContentDataDoubleValueFacetResult instead */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = ContentDataIntegerValueFacetResult.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentDataIntegerValueFacetResult extends IntegerContentDataValueFacetResult
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Result.ContentDataIntegerValueFacetResult, Relewise.Client";
    public static ContentDataIntegerValueFacetResult create(String key, ArrayList<Integer> selected, @Nullable CollectionFilterType collectionFilterType, IntegerAvailableFacetValue... available)
    {
        return new ContentDataIntegerValueFacetResult(key, selected, collectionFilterType, available);
    }
    public ContentDataIntegerValueFacetResult(String key, ArrayList<Integer> selected, @Nullable CollectionFilterType collectionFilterType, IntegerAvailableFacetValue... available)
    {
        this.key = key;
        this.selected = selected;
        this.collectionFilterType = collectionFilterType;
        this.available = new ArrayList<>(Arrays.asList(available));
    }
    public ContentDataIntegerValueFacetResult()
    {
    }
    @Override
    public ContentDataIntegerValueFacetResult setKey(String key)
    {
        this.key = key;
        return this;
    }
    @Override
    public ContentDataIntegerValueFacetResult setCollectionFilterType(@Nullable CollectionFilterType collectionFilterType)
    {
        this.collectionFilterType = collectionFilterType;
        return this;
    }
    @Override
    public ContentDataIntegerValueFacetResult setSelected(Integer... selected)
    {
        this.selected = new ArrayList<>(Arrays.asList(selected));;
        return this;
    }
    public ContentDataIntegerValueFacetResult addToSelected(Integer selected)
    {
        if (this.selected == null)
        {
            this.selected = new ArrayList<>();
        }
        this.selected.add(selected);
        return this;
    }
    @Override
    public ContentDataIntegerValueFacetResult setAvailable(IntegerAvailableFacetValue... available)
    {
        this.available = new ArrayList<>(Arrays.asList(available));;
        return this;
    }
    public ContentDataIntegerValueFacetResult addToAvailable(IntegerAvailableFacetValue available)
    {
        if (this.available == null)
        {
            this.available = new ArrayList<>();
        }
        this.available.add(available);
        return this;
    }
    @Override
    public ContentDataIntegerValueFacetResult setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
}

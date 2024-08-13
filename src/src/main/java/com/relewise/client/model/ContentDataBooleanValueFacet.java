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
    defaultImpl = ContentDataBooleanValueFacet.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentDataBooleanValueFacet extends BooleanContentDataValueFacet
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Queries.ContentDataBooleanValueFacet, Relewise.Client";
    public static ContentDataBooleanValueFacet create(String key, @Nullable ArrayList<Boolean> selected, @Nullable CollectionFilterType collectionFilterType)
    {
        return new ContentDataBooleanValueFacet(key, selected, collectionFilterType);
    }
    public ContentDataBooleanValueFacet(String key, @Nullable ArrayList<Boolean> selected, @Nullable CollectionFilterType collectionFilterType)
    {
        this.key = key;
        this.selected = selected;
        this.collectionFilterType = collectionFilterType;
    }
    public ContentDataBooleanValueFacet()
    {
    }
    @Override
    public ContentDataBooleanValueFacet setKey(String key)
    {
        this.key = key;
        return this;
    }
    @Override
    public ContentDataBooleanValueFacet setCollectionFilterType(@Nullable CollectionFilterType collectionFilterType)
    {
        this.collectionFilterType = collectionFilterType;
        return this;
    }
    @Override
    public ContentDataBooleanValueFacet setSelected(Boolean... selected)
    {
        this.selected = new ArrayList<>(Arrays.asList(selected));;
        return this;
    }
    public ContentDataBooleanValueFacet addToSelected(Boolean selected)
    {
        if (this.selected == null)
        {
            this.selected = new ArrayList<>();
        }
        this.selected.add(selected);
        return this;
    }
    @Override
    public ContentDataBooleanValueFacet setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
    @Override
    public ContentDataBooleanValueFacet setSettings(@Nullable FacetSettings settings)
    {
        this.settings = settings;
        return this;
    }
}

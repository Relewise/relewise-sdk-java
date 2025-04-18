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
    defaultImpl = ContentDataDoubleValueFacet.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentDataDoubleValueFacet extends DoubleContentDataValueFacet
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Queries.ContentDataDoubleValueFacet, Relewise.Client";
    public static ContentDataDoubleValueFacet create(String key, @Nullable ArrayList<Double> selected, @Nullable CollectionFilterType collectionFilterType)
    {
        return new ContentDataDoubleValueFacet(key, selected, collectionFilterType);
    }
    public ContentDataDoubleValueFacet(String key, @Nullable ArrayList<Double> selected, @Nullable CollectionFilterType collectionFilterType)
    {
        this.key = key;
        this.selected = selected;
        this.collectionFilterType = collectionFilterType;
    }
    public ContentDataDoubleValueFacet()
    {
    }
    @Override
    public ContentDataDoubleValueFacet setKey(String key)
    {
        this.key = key;
        return this;
    }
    @Override
    public ContentDataDoubleValueFacet setCollectionFilterType(@Nullable CollectionFilterType collectionFilterType)
    {
        this.collectionFilterType = collectionFilterType;
        return this;
    }
    @Override
    public ContentDataDoubleValueFacet setSelected(Double... selected)
    {
        this.selected = new ArrayList<>(Arrays.asList(selected));;
        return this;
    }
    public ContentDataDoubleValueFacet addToSelected(Double selected)
    {
        if (this.selected == null)
        {
            this.selected = new ArrayList<>();
        }
        this.selected.add(selected);
        return this;
    }
    @Override
    public ContentDataDoubleValueFacet setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
    @Override
    public ContentDataDoubleValueFacet setSettings(@Nullable FacetSettings settings)
    {
        this.settings = settings;
        return this;
    }
}

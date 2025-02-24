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
    
/** @deprecated Use ContentDataDoubleValueFacet instead */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = ContentDataIntegerValueFacet.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentDataIntegerValueFacet extends IntegerContentDataValueFacet
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Queries.ContentDataIntegerValueFacet, Relewise.Client";
    public static ContentDataIntegerValueFacet create(String key, @Nullable ArrayList<Integer> selected, @Nullable CollectionFilterType collectionFilterType)
    {
        return new ContentDataIntegerValueFacet(key, selected, collectionFilterType);
    }
    public ContentDataIntegerValueFacet(String key, @Nullable ArrayList<Integer> selected, @Nullable CollectionFilterType collectionFilterType)
    {
        this.key = key;
        this.selected = selected;
        this.collectionFilterType = collectionFilterType;
    }
    public ContentDataIntegerValueFacet()
    {
    }
    @Override
    public ContentDataIntegerValueFacet setKey(String key)
    {
        this.key = key;
        return this;
    }
    @Override
    public ContentDataIntegerValueFacet setCollectionFilterType(@Nullable CollectionFilterType collectionFilterType)
    {
        this.collectionFilterType = collectionFilterType;
        return this;
    }
    @Override
    public ContentDataIntegerValueFacet setSelected(Integer... selected)
    {
        this.selected = new ArrayList<>(Arrays.asList(selected));;
        return this;
    }
    public ContentDataIntegerValueFacet addToSelected(Integer selected)
    {
        if (this.selected == null)
        {
            this.selected = new ArrayList<>();
        }
        this.selected.add(selected);
        return this;
    }
    @Override
    public ContentDataIntegerValueFacet setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
    @Override
    public ContentDataIntegerValueFacet setSettings(@Nullable FacetSettings settings)
    {
        this.settings = settings;
        return this;
    }
}

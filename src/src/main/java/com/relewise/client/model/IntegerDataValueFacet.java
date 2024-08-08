package com.relewise.client.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.annotation.Nullable;
import java.io.IOException;
import java.time.OffsetDateTime;
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
    property = "$type")
@JsonSubTypes({
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class IntegerDataValueFacet extends IntegerValueFacet
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Queries.DataValueFacet`1[[System.Int32, System.Private.CoreLib, Version=7.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e]], Relewise.Client";
    public String key;
    public @Nullable CollectionFilterType collectionFilterType;
    public String getKey()
    {
        return this.key;
    }
    public @Nullable CollectionFilterType getCollectionFilterType()
    {
        return this.collectionFilterType;
    }
    public IntegerDataValueFacet setKey(String key)
    {
        this.key = key;;
        return this;
    }
    public IntegerDataValueFacet setCollectionFilterType(@Nullable CollectionFilterType collectionFilterType)
    {
        this.collectionFilterType = collectionFilterType;;
        return this;
    }
    @Override
    public IntegerDataValueFacet setSelected(Integer... selected)
    {
        this.selected = new ArrayList<>(Arrays.asList(selected));;
        return this;
    }
    public IntegerDataValueFacet addToSelected(Integer selected)
    {
        if (this.selected == null)
        {
            this.selected = new ArrayList<>();
        }
        this.selected.add(selected);
        return this;
    }
    @Override
    public IntegerDataValueFacet setField(FacetingField field)
    {
        this.field = field;;
        return this;
    }
    @Override
    public IntegerDataValueFacet setSettings(FacetSettings settings)
    {
        this.settings = settings;;
        return this;
    }
}

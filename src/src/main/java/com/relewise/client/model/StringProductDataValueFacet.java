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
public abstract class StringProductDataValueFacet extends StringDataValueFacet
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Queries.ProductDataValueFacet`1[[System.String, System.Private.CoreLib, Version=7.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e]], Relewise.Client";
    public DataSelectionStrategy dataSelectionStrategy;
    public DataSelectionStrategy getDataSelectionStrategy()
    {
        return this.dataSelectionStrategy;
    }
    public StringProductDataValueFacet setDataSelectionStrategy(DataSelectionStrategy dataSelectionStrategy)
    {
        this.dataSelectionStrategy = dataSelectionStrategy;;
        return this;
    }
    @Override
    public StringProductDataValueFacet setKey(String key)
    {
        this.key = key;;
        return this;
    }
    @Override
    public StringProductDataValueFacet setCollectionFilterType(@Nullable CollectionFilterType collectionFilterType)
    {
        this.collectionFilterType = collectionFilterType;;
        return this;
    }
    @Override
    public StringProductDataValueFacet setSelected(String... selected)
    {
        this.selected = new ArrayList<>(Arrays.asList(selected));;
        return this;
    }
    public StringProductDataValueFacet addToSelected(String selected)
    {
        if (this.selected == null)
        {
            this.selected = new ArrayList<>();
        }
        this.selected.add(selected);
        return this;
    }
    @Override
    public StringProductDataValueFacet setField(FacetingField field)
    {
        this.field = field;;
        return this;
    }
    @Override
    public StringProductDataValueFacet setSettings(FacetSettings settings)
    {
        this.settings = settings;;
        return this;
    }
}

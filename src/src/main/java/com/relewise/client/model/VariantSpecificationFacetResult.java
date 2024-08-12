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
    property = "$type",
    defaultImpl = VariantSpecificationFacetResult.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class VariantSpecificationFacetResult extends StringValueFacetResult
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Result.VariantSpecificationFacetResult, Relewise.Client";
    public String key;
    public static VariantSpecificationFacetResult create(String key, ArrayList<String> selected, StringAvailableFacetValue... available)
    {
        return new VariantSpecificationFacetResult(key, selected, available);
    }
    public VariantSpecificationFacetResult(String key, ArrayList<String> selected, StringAvailableFacetValue... available)
    {
        this.key = key;
        this.selected = selected;
        this.available = new ArrayList<>(Arrays.asList(available));
    }
    public VariantSpecificationFacetResult()
    {
    }
    public String getKey()
    {
        return this.key;
    }
    public VariantSpecificationFacetResult setKey(String key)
    {
        this.key = key;
        return this;
    }
    @Override
    public VariantSpecificationFacetResult setSelected(String... selected)
    {
        this.selected = new ArrayList<>(Arrays.asList(selected));;
        return this;
    }
    public VariantSpecificationFacetResult addToSelected(String selected)
    {
        if (this.selected == null)
        {
            this.selected = new ArrayList<>();
        }
        this.selected.add(selected);
        return this;
    }
    @Override
    public VariantSpecificationFacetResult setAvailable(StringAvailableFacetValue... available)
    {
        this.available = new ArrayList<>(Arrays.asList(available));;
        return this;
    }
    public VariantSpecificationFacetResult addToAvailable(StringAvailableFacetValue available)
    {
        if (this.available == null)
        {
            this.available = new ArrayList<>();
        }
        this.available.add(available);
        return this;
    }
    @Override
    public VariantSpecificationFacetResult setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
}

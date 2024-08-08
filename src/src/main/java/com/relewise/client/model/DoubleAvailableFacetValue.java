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
    defaultImpl = DoubleAvailableFacetValue.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DoubleAvailableFacetValue
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Result.AvailableFacetValue`1[[System.Double, System.Private.CoreLib, Version=7.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e]], Relewise.Client";
    public Double value;
    public Integer hits;
    public Boolean selected;
    public static DoubleAvailableFacetValue create(Double value, Boolean selected, Integer hits)
    {
        return new DoubleAvailableFacetValue(value, selected, hits);
    }
    public DoubleAvailableFacetValue(Double value, Boolean selected, Integer hits)
    {
        this.value = value;
        this.selected = selected;
        this.hits = hits;
    }
    public DoubleAvailableFacetValue()
    {
    }
    public Double getValue()
    {
        return this.value;
    }
    public Integer getHits()
    {
        return this.hits;
    }
    public Boolean getSelected()
    {
        return this.selected;
    }
    public DoubleAvailableFacetValue setValue(Double value)
    {
        this.value = value;;
        return this;
    }
    public DoubleAvailableFacetValue setHits(Integer hits)
    {
        this.hits = hits;;
        return this;
    }
    public DoubleAvailableFacetValue setSelected(Boolean selected)
    {
        this.selected = selected;;
        return this;
    }
}

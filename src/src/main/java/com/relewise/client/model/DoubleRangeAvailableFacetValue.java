package com.relewise.client.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
    defaultImpl = DoubleRangeAvailableFacetValue.class)
public class DoubleRangeAvailableFacetValue
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Result.AvailableFacetValue`1[[Relewise.Client.DataTypes.Range`1[[System.Nullable`1[[System.Double, System.Private.CoreLib, Version=7.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e]], System.Private.CoreLib, Version=7.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e]], Relewise.Client, Version=1.61.0.0, Culture=neutral, PublicKeyToken=null]], Relewise.Client";
    public DoubleRange value;
    public Integer hits;
    public Boolean selected;
    public static DoubleRangeAvailableFacetValue create(DoubleRange value, Boolean selected, Integer hits)
    {
        return new DoubleRangeAvailableFacetValue(value, selected, hits);
    }
    public DoubleRangeAvailableFacetValue(DoubleRange value, Boolean selected, Integer hits)
    {
        this.value = value;
        this.selected = selected;
        this.hits = hits;
    }
    public DoubleRangeAvailableFacetValue()
    {
    }
    public DoubleRange getValue()
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
    public DoubleRangeAvailableFacetValue setValue(DoubleRange value)
    {
        this.value = value;;
        return this;
    }
    public DoubleRangeAvailableFacetValue setHits(Integer hits)
    {
        this.hits = hits;;
        return this;
    }
    public DoubleRangeAvailableFacetValue setSelected(Boolean selected)
    {
        this.selected = selected;;
        return this;
    }
}

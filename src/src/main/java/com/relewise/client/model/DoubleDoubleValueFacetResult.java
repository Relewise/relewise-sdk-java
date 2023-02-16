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
    property = "$type")
@JsonSubTypes({
})
public abstract class DoubleDoubleValueFacetResult extends FacetResult
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Result.ValueFacetResult`2[[System.Double, System.Private.CoreLib, Version=7.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e],[System.Double, System.Private.CoreLib, Version=7.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e]], Relewise.Client";
    public ArrayList<Double> selected;
    public ArrayList<DoubleAvailableFacetValue> available;
    public ArrayList<Double> getSelected()
    {
        return this.selected;
    }
    public ArrayList<DoubleAvailableFacetValue> getAvailable()
    {
        return this.available;
    }
    public DoubleDoubleValueFacetResult setSelected(Double... selected)
    {
        this.selected = new ArrayList<>(Arrays.asList(selected));;
        return this;
    }
    public DoubleDoubleValueFacetResult addToSelected(Double selected)
    {
        if (this.selected == null)
        {
            this.selected = new ArrayList<>();
        }
        this.selected.add(selected);
        return this;
    }
    public DoubleDoubleValueFacetResult setAvailable(DoubleAvailableFacetValue... available)
    {
        this.available = new ArrayList<>(Arrays.asList(available));;
        return this;
    }
    public DoubleDoubleValueFacetResult addToAvailable(DoubleAvailableFacetValue available)
    {
        if (this.available == null)
        {
            this.available = new ArrayList<>();
        }
        this.available.add(available);
        return this;
    }
    @Override
    public DoubleDoubleValueFacetResult setField(FacetingField field)
    {
        this.field = field;;
        return this;
    }
}

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
public abstract class DoubleDataRangesFacet extends Facet
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Queries.DataRangesFacet`1[[System.Nullable`1[[System.Double, System.Private.CoreLib, Version=7.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e]], System.Private.CoreLib, Version=7.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e]], Relewise.Client";
    public @Nullable ArrayList<DoubleChainableRange> predefinedRanges;
    public @Nullable Double expandedRangeSize;
    public @Nullable ArrayList<DoubleChainableRange> selected;
    public String key;
    public @Nullable ArrayList<DoubleChainableRange> getPredefinedRanges()
    {
        return this.predefinedRanges;
    }
    public @Nullable Double getExpandedRangeSize()
    {
        return this.expandedRangeSize;
    }
    public @Nullable ArrayList<DoubleChainableRange> getSelected()
    {
        return this.selected;
    }
    public String getKey()
    {
        return this.key;
    }
    public DoubleDataRangesFacet setPredefinedRanges(DoubleChainableRange... predefinedRanges)
    {
        this.predefinedRanges = new ArrayList<>(Arrays.asList(predefinedRanges));;
        return this;
    }
    public DoubleDataRangesFacet addToPredefinedRanges(DoubleChainableRange predefinedRanges)
    {
        if (this.predefinedRanges == null)
        {
            this.predefinedRanges = new ArrayList<>();
        }
        this.predefinedRanges.add(predefinedRanges);
        return this;
    }
    public DoubleDataRangesFacet setExpandedRangeSize(@Nullable Double expandedRangeSize)
    {
        this.expandedRangeSize = expandedRangeSize;;
        return this;
    }
    public DoubleDataRangesFacet setSelected(DoubleChainableRange... selected)
    {
        this.selected = new ArrayList<>(Arrays.asList(selected));;
        return this;
    }
    public DoubleDataRangesFacet addToSelected(DoubleChainableRange selected)
    {
        if (this.selected == null)
        {
            this.selected = new ArrayList<>();
        }
        this.selected.add(selected);
        return this;
    }
    public DoubleDataRangesFacet setKey(String key)
    {
        this.key = key;;
        return this;
    }
    @Override
    public DoubleDataRangesFacet setField(FacetingField field)
    {
        this.field = field;;
        return this;
    }
    @Override
    public DoubleDataRangesFacet setSettings(FacetSettings settings)
    {
        this.settings = settings;;
        return this;
    }
}

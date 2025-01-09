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
import java.util.Set;
import java.util.HashSet;
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = ContentDataDoubleRangesFacetResult.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentDataDoubleRangesFacetResult extends DoubleContentDataRangesFacetResult
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Result.ContentDataDoubleRangesFacetResult, Relewise.Client";
    public static ContentDataDoubleRangesFacetResult create(String key, @Nullable Double expandedRangeSize, ArrayList<DoubleChainableRange> selected, DoubleChainableRangeAvailableFacetValue... available)
    {
        return new ContentDataDoubleRangesFacetResult(key, expandedRangeSize, selected, available);
    }
    public ContentDataDoubleRangesFacetResult(String key, @Nullable Double expandedRangeSize, ArrayList<DoubleChainableRange> selected, DoubleChainableRangeAvailableFacetValue... available)
    {
        this.key = key;
        this.expandedRangeSize = expandedRangeSize;
        this.selected = selected;
        this.available = new ArrayList<>(Arrays.asList(available));
    }
    public ContentDataDoubleRangesFacetResult()
    {
    }
    @Override
    public ContentDataDoubleRangesFacetResult setKey(String key)
    {
        this.key = key;
        return this;
    }
    @Override
    public ContentDataDoubleRangesFacetResult setExpandedRangeSize(@Nullable Double expandedRangeSize)
    {
        this.expandedRangeSize = expandedRangeSize;
        return this;
    }
    @Override
    public ContentDataDoubleRangesFacetResult setSelected(DoubleChainableRange... selected)
    {
        this.selected = new ArrayList<>(Arrays.asList(selected));;
        return this;
    }
    public ContentDataDoubleRangesFacetResult addToSelected(DoubleChainableRange selected)
    {
        if (this.selected == null)
        {
            this.selected = new ArrayList<>();
        }
        this.selected.add(selected);
        return this;
    }
    @Override
    public ContentDataDoubleRangesFacetResult setAvailable(DoubleChainableRangeAvailableFacetValue... available)
    {
        this.available = new ArrayList<>(Arrays.asList(available));;
        return this;
    }
    public ContentDataDoubleRangesFacetResult addToAvailable(DoubleChainableRangeAvailableFacetValue available)
    {
        if (this.available == null)
        {
            this.available = new ArrayList<>();
        }
        this.available.add(available);
        return this;
    }
    @Override
    public ContentDataDoubleRangesFacetResult setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
}

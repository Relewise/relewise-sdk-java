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
    defaultImpl = ContentDataDoubleRangesFacet.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentDataDoubleRangesFacet extends DoubleContentDataRangesFacet
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Queries.ContentDataDoubleRangesFacet, Relewise.Client";
    public static ContentDataDoubleRangesFacet create(String key, @Nullable ArrayList<DoubleChainableRange> predefinedRanges, @Nullable Double expandedRangeSize, DoubleChainableRange... selected)
    {
        return new ContentDataDoubleRangesFacet(key, predefinedRanges, expandedRangeSize, selected);
    }
    public ContentDataDoubleRangesFacet(String key, @Nullable ArrayList<DoubleChainableRange> predefinedRanges, @Nullable Double expandedRangeSize, DoubleChainableRange... selected)
    {
        this.key = key;
        this.predefinedRanges = predefinedRanges;
        this.expandedRangeSize = expandedRangeSize;
        this.selected = new ArrayList<>(Arrays.asList(selected));
    }
    public ContentDataDoubleRangesFacet()
    {
    }
    @Override
    public ContentDataDoubleRangesFacet setPredefinedRanges(DoubleChainableRange... predefinedRanges)
    {
        this.predefinedRanges = new ArrayList<>(Arrays.asList(predefinedRanges));;
        return this;
    }
    public ContentDataDoubleRangesFacet addToPredefinedRanges(DoubleChainableRange predefinedRanges)
    {
        if (this.predefinedRanges == null)
        {
            this.predefinedRanges = new ArrayList<>();
        }
        this.predefinedRanges.add(predefinedRanges);
        return this;
    }
    @Override
    public ContentDataDoubleRangesFacet setExpandedRangeSize(@Nullable Double expandedRangeSize)
    {
        this.expandedRangeSize = expandedRangeSize;
        return this;
    }
    @Override
    public ContentDataDoubleRangesFacet setSelected(DoubleChainableRange... selected)
    {
        this.selected = new ArrayList<>(Arrays.asList(selected));;
        return this;
    }
    public ContentDataDoubleRangesFacet addToSelected(DoubleChainableRange selected)
    {
        if (this.selected == null)
        {
            this.selected = new ArrayList<>();
        }
        this.selected.add(selected);
        return this;
    }
    @Override
    public ContentDataDoubleRangesFacet setKey(String key)
    {
        this.key = key;
        return this;
    }
    @Override
    public ContentDataDoubleRangesFacet setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
    @Override
    public ContentDataDoubleRangesFacet setSettings(@Nullable FacetSettings settings)
    {
        this.settings = settings;
        return this;
    }
}

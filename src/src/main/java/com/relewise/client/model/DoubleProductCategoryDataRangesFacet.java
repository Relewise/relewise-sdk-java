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
    property = "$type")
@JsonSubTypes({
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class DoubleProductCategoryDataRangesFacet extends DoubleDataRangesFacet
{
    public String $type = "";
    @Override
    public DoubleProductCategoryDataRangesFacet setPredefinedRanges(DoubleChainableRange... predefinedRanges)
    {
        this.predefinedRanges = new ArrayList<>(Arrays.asList(predefinedRanges));;
        return this;
    }
    public DoubleProductCategoryDataRangesFacet addToPredefinedRanges(DoubleChainableRange predefinedRanges)
    {
        if (this.predefinedRanges == null)
        {
            this.predefinedRanges = new ArrayList<>();
        }
        this.predefinedRanges.add(predefinedRanges);
        return this;
    }
    @Override
    public DoubleProductCategoryDataRangesFacet setExpandedRangeSize(@Nullable Double expandedRangeSize)
    {
        this.expandedRangeSize = expandedRangeSize;
        return this;
    }
    @Override
    public DoubleProductCategoryDataRangesFacet setSelected(DoubleChainableRange... selected)
    {
        this.selected = new ArrayList<>(Arrays.asList(selected));;
        return this;
    }
    public DoubleProductCategoryDataRangesFacet addToSelected(DoubleChainableRange selected)
    {
        if (this.selected == null)
        {
            this.selected = new ArrayList<>();
        }
        this.selected.add(selected);
        return this;
    }
    @Override
    public DoubleProductCategoryDataRangesFacet setKey(String key)
    {
        this.key = key;
        return this;
    }
    @Override
    public DoubleProductCategoryDataRangesFacet setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
    @Override
    public DoubleProductCategoryDataRangesFacet setSettings(@Nullable FacetSettings settings)
    {
        this.settings = settings;
        return this;
    }
}

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
    defaultImpl = ContentAssortmentFacetResult.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentAssortmentFacetResult extends AssortmentFacetResult
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Result.ContentAssortmentFacetResult, Relewise.Client";
    public static ContentAssortmentFacetResult create(AssortmentFilterType assortmentFilterType, ArrayList<Integer> selected, IntegerAvailableFacetValue... available)
    {
        return new ContentAssortmentFacetResult(assortmentFilterType, selected, available);
    }
    public ContentAssortmentFacetResult(AssortmentFilterType assortmentFilterType, ArrayList<Integer> selected, IntegerAvailableFacetValue... available)
    {
        this.assortmentFilterType = assortmentFilterType;
        this.selected = selected;
        this.available = new ArrayList<>(Arrays.asList(available));
    }
    public ContentAssortmentFacetResult()
    {
    }
    @Override
    public ContentAssortmentFacetResult setAssortmentFilterType(AssortmentFilterType assortmentFilterType)
    {
        this.assortmentFilterType = assortmentFilterType;;
        return this;
    }
    @Override
    public ContentAssortmentFacetResult setSelected(Integer... selected)
    {
        this.selected = new ArrayList<>(Arrays.asList(selected));;
        return this;
    }
    public ContentAssortmentFacetResult addToSelected(Integer selected)
    {
        if (this.selected == null)
        {
            this.selected = new ArrayList<>();
        }
        this.selected.add(selected);
        return this;
    }
    @Override
    public ContentAssortmentFacetResult setAvailable(IntegerAvailableFacetValue... available)
    {
        this.available = new ArrayList<>(Arrays.asList(available));;
        return this;
    }
    public ContentAssortmentFacetResult addToAvailable(IntegerAvailableFacetValue available)
    {
        if (this.available == null)
        {
            this.available = new ArrayList<>();
        }
        this.available.add(available);
        return this;
    }
    @Override
    public ContentAssortmentFacetResult setField(FacetingField field)
    {
        this.field = field;;
        return this;
    }
}

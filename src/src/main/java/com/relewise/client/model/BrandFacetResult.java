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
import java.util.AbstractMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashSet;
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = BrandFacetResult.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BrandFacetResult extends StringBrandNameAndIdResultValueFacetResult
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Result.BrandFacetResult, Relewise.Client";
    public static BrandFacetResult create(ArrayList<String> selected, BrandNameAndIdResultAvailableFacetValue... available)
    {
        return new BrandFacetResult(selected, available);
    }
    public BrandFacetResult(ArrayList<String> selected, BrandNameAndIdResultAvailableFacetValue... available)
    {
        this.selected = selected;
        this.available = new ArrayList<>(Arrays.asList(available));
    }
    public BrandFacetResult()
    {
    }
    @Override
    public BrandFacetResult setSelected(String... selected)
    {
        this.selected = new ArrayList<>(Arrays.asList(selected));;
        return this;
    }
    public BrandFacetResult addToSelected(String selected)
    {
        if (this.selected == null)
        {
            this.selected = new ArrayList<>();
        }
        this.selected.add(selected);
        return this;
    }
    @Override
    public BrandFacetResult setAvailable(BrandNameAndIdResultAvailableFacetValue... available)
    {
        this.available = new ArrayList<>(Arrays.asList(available));;
        return this;
    }
    public BrandFacetResult addToAvailable(BrandNameAndIdResultAvailableFacetValue available)
    {
        if (this.available == null)
        {
            this.available = new ArrayList<>();
        }
        this.available.add(available);
        return this;
    }
    @Override
    public BrandFacetResult setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
}

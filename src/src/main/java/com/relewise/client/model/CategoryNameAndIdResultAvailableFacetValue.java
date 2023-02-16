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
    defaultImpl = CategoryNameAndIdResultAvailableFacetValue.class)
public class CategoryNameAndIdResultAvailableFacetValue
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Result.AvailableFacetValue`1[[Relewise.Client.DataTypes.CategoryNameAndIdResult, Relewise.Client, Version=1.61.0.0, Culture=neutral, PublicKeyToken=null]], Relewise.Client";
    public CategoryNameAndIdResult value;
    public Integer hits;
    public Boolean selected;
    public static CategoryNameAndIdResultAvailableFacetValue create(CategoryNameAndIdResult value, Boolean selected, Integer hits)
    {
        return new CategoryNameAndIdResultAvailableFacetValue(value, selected, hits);
    }
    public CategoryNameAndIdResultAvailableFacetValue(CategoryNameAndIdResult value, Boolean selected, Integer hits)
    {
        this.value = value;
        this.selected = selected;
        this.hits = hits;
    }
    public CategoryNameAndIdResultAvailableFacetValue()
    {
    }
    public CategoryNameAndIdResult getValue()
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
    public CategoryNameAndIdResultAvailableFacetValue setValue(CategoryNameAndIdResult value)
    {
        this.value = value;;
        return this;
    }
    public CategoryNameAndIdResultAvailableFacetValue setHits(Integer hits)
    {
        this.hits = hits;;
        return this;
    }
    public CategoryNameAndIdResultAvailableFacetValue setSelected(Boolean selected)
    {
        this.selected = selected;;
        return this;
    }
}

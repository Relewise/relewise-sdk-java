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
public abstract class StringCategoryNameAndIdResultValueFacetResult extends FacetResult
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Result.ValueFacetResult`2[[System.String, System.Private.CoreLib, Version=7.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e],[Relewise.Client.DataTypes.CategoryNameAndIdResult, Relewise.Client, Version=1.61.0.0, Culture=neutral, PublicKeyToken=null]], Relewise.Client";
    public ArrayList<String> selected;
    public ArrayList<CategoryNameAndIdResultAvailableFacetValue> available;
    public ArrayList<String> getSelected()
    {
        return this.selected;
    }
    public ArrayList<CategoryNameAndIdResultAvailableFacetValue> getAvailable()
    {
        return this.available;
    }
    public StringCategoryNameAndIdResultValueFacetResult setSelected(String... selected)
    {
        this.selected = new ArrayList<>(Arrays.asList(selected));;
        return this;
    }
    public StringCategoryNameAndIdResultValueFacetResult addToSelected(String selected)
    {
        if (this.selected == null)
        {
            this.selected = new ArrayList<>();
        }
        this.selected.add(selected);
        return this;
    }
    public StringCategoryNameAndIdResultValueFacetResult setAvailable(CategoryNameAndIdResultAvailableFacetValue... available)
    {
        this.available = new ArrayList<>(Arrays.asList(available));;
        return this;
    }
    public StringCategoryNameAndIdResultValueFacetResult addToAvailable(CategoryNameAndIdResultAvailableFacetValue available)
    {
        if (this.available == null)
        {
            this.available = new ArrayList<>();
        }
        this.available.add(available);
        return this;
    }
    @Override
    public StringCategoryNameAndIdResultValueFacetResult setField(FacetingField field)
    {
        this.field = field;;
        return this;
    }
}

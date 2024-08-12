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
    defaultImpl = CategoryFacetResult.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CategoryFacetResult extends StringCategoryNameAndIdResultValueFacetResult
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Result.CategoryFacetResult, Relewise.Client";
    public CategorySelectionStrategy categorySelectionStrategy;
    public static CategoryFacetResult create(CategorySelectionStrategy categorySelectionStrategy, ArrayList<String> selected, CategoryNameAndIdResultAvailableFacetValue... available)
    {
        return new CategoryFacetResult(categorySelectionStrategy, selected, available);
    }
    public CategoryFacetResult(CategorySelectionStrategy categorySelectionStrategy, ArrayList<String> selected, CategoryNameAndIdResultAvailableFacetValue... available)
    {
        this.categorySelectionStrategy = categorySelectionStrategy;
        this.selected = selected;
        this.available = new ArrayList<>(Arrays.asList(available));
    }
    public CategoryFacetResult()
    {
    }
    public CategorySelectionStrategy getCategorySelectionStrategy()
    {
        return this.categorySelectionStrategy;
    }
    public CategoryFacetResult setCategorySelectionStrategy(CategorySelectionStrategy categorySelectionStrategy)
    {
        this.categorySelectionStrategy = categorySelectionStrategy;
        return this;
    }
    @Override
    public CategoryFacetResult setSelected(String... selected)
    {
        this.selected = new ArrayList<>(Arrays.asList(selected));;
        return this;
    }
    public CategoryFacetResult addToSelected(String selected)
    {
        if (this.selected == null)
        {
            this.selected = new ArrayList<>();
        }
        this.selected.add(selected);
        return this;
    }
    @Override
    public CategoryFacetResult setAvailable(CategoryNameAndIdResultAvailableFacetValue... available)
    {
        this.available = new ArrayList<>(Arrays.asList(available));;
        return this;
    }
    public CategoryFacetResult addToAvailable(CategoryNameAndIdResultAvailableFacetValue available)
    {
        if (this.available == null)
        {
            this.available = new ArrayList<>();
        }
        this.available.add(available);
        return this;
    }
    @Override
    public CategoryFacetResult setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
}

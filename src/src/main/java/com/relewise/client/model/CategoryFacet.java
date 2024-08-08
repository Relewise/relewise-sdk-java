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
    defaultImpl = CategoryFacet.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CategoryFacet extends StringValueFacet
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Queries.CategoryFacet, Relewise.Client";
    public CategorySelectionStrategy categorySelectionStrategy;
    public static CategoryFacet create(CategorySelectionStrategy categorySelectionStrategy, String... selectedIds)
    {
        return new CategoryFacet(categorySelectionStrategy, selectedIds);
    }
    public CategoryFacet(CategorySelectionStrategy categorySelectionStrategy, String... selectedIds)
    {
        this.categorySelectionStrategy = categorySelectionStrategy;
        this.selected = new ArrayList<>(Arrays.asList(selectedIds));
    }
    public CategoryFacet()
    {
    }
    public CategorySelectionStrategy getCategorySelectionStrategy()
    {
        return this.categorySelectionStrategy;
    }
    public CategoryFacet setCategorySelectionStrategy(CategorySelectionStrategy categorySelectionStrategy)
    {
        this.categorySelectionStrategy = categorySelectionStrategy;;
        return this;
    }
    @Override
    public CategoryFacet setSelected(String... selected)
    {
        this.selected = new ArrayList<>(Arrays.asList(selected));;
        return this;
    }
    public CategoryFacet addToSelected(String selected)
    {
        if (this.selected == null)
        {
            this.selected = new ArrayList<>();
        }
        this.selected.add(selected);
        return this;
    }
    @Override
    public CategoryFacet setField(FacetingField field)
    {
        this.field = field;;
        return this;
    }
    @Override
    public CategoryFacet setSettings(FacetSettings settings)
    {
        this.settings = settings;;
        return this;
    }
}

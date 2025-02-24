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
    defaultImpl = CategoryHierarchyFacet.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CategoryHierarchyFacet extends CategoryPathValueFacet
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Queries.CategoryHierarchyFacet, Relewise.Client";
    public CategorySelectionStrategy categorySelectionStrategy;
    public @Nullable SelectedCategoryPropertiesSettings selectedPropertiesSettings;
    public static CategoryHierarchyFacet create(CategorySelectionStrategy categorySelectionStrategy, CategoryPath... selectedCategoryPath)
    {
        return new CategoryHierarchyFacet(categorySelectionStrategy, selectedCategoryPath);
    }
    public CategoryHierarchyFacet(CategorySelectionStrategy categorySelectionStrategy, CategoryPath... selectedCategoryPath)
    {
        this.categorySelectionStrategy = categorySelectionStrategy;
        this.selected = new ArrayList<>(Arrays.asList(selectedCategoryPath));
    }
    public CategoryHierarchyFacet()
    {
    }
    public CategorySelectionStrategy getCategorySelectionStrategy()
    {
        return this.categorySelectionStrategy;
    }
    public @Nullable SelectedCategoryPropertiesSettings getSelectedPropertiesSettings()
    {
        return this.selectedPropertiesSettings;
    }
    public CategoryHierarchyFacet setCategorySelectionStrategy(CategorySelectionStrategy categorySelectionStrategy)
    {
        this.categorySelectionStrategy = categorySelectionStrategy;
        return this;
    }
    public CategoryHierarchyFacet setSelectedPropertiesSettings(@Nullable SelectedCategoryPropertiesSettings selectedPropertiesSettings)
    {
        this.selectedPropertiesSettings = selectedPropertiesSettings;
        return this;
    }
    @Override
    public CategoryHierarchyFacet setSelected(CategoryPath... selected)
    {
        this.selected = new ArrayList<>(Arrays.asList(selected));;
        return this;
    }
    public CategoryHierarchyFacet addToSelected(CategoryPath selected)
    {
        if (this.selected == null)
        {
            this.selected = new ArrayList<>();
        }
        this.selected.add(selected);
        return this;
    }
    @Override
    public CategoryHierarchyFacet setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
    @Override
    public CategoryHierarchyFacet setSettings(@Nullable FacetSettings settings)
    {
        this.settings = settings;
        return this;
    }
}

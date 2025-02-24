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
    defaultImpl = CategoryHierarchyFacetResult.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CategoryHierarchyFacetResult extends FacetResult
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Result.CategoryHierarchyFacetResult, Relewise.Client";
    public CategorySelectionStrategy categorySelectionStrategy;
    public CategoryHierarchyFacetResultCategoryNode[] nodes;
    public static CategoryHierarchyFacetResult create(CategorySelectionStrategy categorySelectionStrategy, CategoryHierarchyFacetResultCategoryNode... nodes)
    {
        return new CategoryHierarchyFacetResult(categorySelectionStrategy, nodes);
    }
    public CategoryHierarchyFacetResult(CategorySelectionStrategy categorySelectionStrategy, CategoryHierarchyFacetResultCategoryNode... nodes)
    {
        this.categorySelectionStrategy = categorySelectionStrategy;
        this.nodes = nodes;
    }
    public CategoryHierarchyFacetResult()
    {
    }
    public CategorySelectionStrategy getCategorySelectionStrategy()
    {
        return this.categorySelectionStrategy;
    }
    public CategoryHierarchyFacetResultCategoryNode[] getNodes()
    {
        return this.nodes;
    }
    public CategoryHierarchyFacetResult setCategorySelectionStrategy(CategorySelectionStrategy categorySelectionStrategy)
    {
        this.categorySelectionStrategy = categorySelectionStrategy;
        return this;
    }
    public CategoryHierarchyFacetResult setNodes(CategoryHierarchyFacetResultCategoryNode... nodes)
    {
        this.nodes = nodes;
        return this;
    }
    public CategoryHierarchyFacetResult addToNodes(CategoryHierarchyFacetResultCategoryNode node)
    {
        if (this.nodes == null)
        {
            this.nodes = new CategoryHierarchyFacetResultCategoryNode[] { node };
        }
        else
        {
            ArrayList<CategoryHierarchyFacetResultCategoryNode> existingList = new ArrayList<>(Arrays.asList(this.nodes));
            existingList.add(node);
            this.nodes = existingList.toArray(new CategoryHierarchyFacetResultCategoryNode[0]);
        }
        return this;
    }
    @Override
    public CategoryHierarchyFacetResult setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
}

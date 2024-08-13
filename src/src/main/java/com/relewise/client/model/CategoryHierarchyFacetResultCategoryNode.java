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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class CategoryHierarchyFacetResultCategoryNode
{
    public CategoryResult category;
    public Integer hits;
    public @Nullable String parentId;
    public @Nullable CategoryHierarchyFacetResultCategoryNode[] children;
    public Boolean selected;
    public static CategoryHierarchyFacetResultCategoryNode create(CategoryResult category, Integer hits, @Nullable String parentId, @Nullable CategoryHierarchyFacetResultCategoryNode[] children, Boolean selected)
    {
        return new CategoryHierarchyFacetResultCategoryNode(category, hits, parentId, children, selected);
    }
    public CategoryHierarchyFacetResultCategoryNode(CategoryResult category, Integer hits, @Nullable String parentId, @Nullable CategoryHierarchyFacetResultCategoryNode[] children, Boolean selected)
    {
        this.category = category;
        this.hits = hits;
        this.parentId = parentId;
        this.children = children;
        this.selected = selected;
    }
    public CategoryHierarchyFacetResultCategoryNode()
    {
    }
    public CategoryResult getCategory()
    {
        return this.category;
    }
    public Integer getHits()
    {
        return this.hits;
    }
    public @Nullable String getParentId()
    {
        return this.parentId;
    }
    public @Nullable CategoryHierarchyFacetResultCategoryNode[] getChildren()
    {
        return this.children;
    }
    public Boolean getSelected()
    {
        return this.selected;
    }
    public CategoryHierarchyFacetResultCategoryNode setCategory(CategoryResult category)
    {
        this.category = category;
        return this;
    }
    public CategoryHierarchyFacetResultCategoryNode setHits(Integer hits)
    {
        this.hits = hits;
        return this;
    }
    public CategoryHierarchyFacetResultCategoryNode setParentId(String parentId)
    {
        this.parentId = parentId;
        return this;
    }
    public CategoryHierarchyFacetResultCategoryNode setChildren(CategoryHierarchyFacetResultCategoryNode... children)
    {
        this.children = children;
        return this;
    }
    public CategoryHierarchyFacetResultCategoryNode addToChildren(CategoryHierarchyFacetResultCategoryNode children)
    {
        if (this.children == null)
        {
            this.children = new CategoryHierarchyFacetResultCategoryNode[] { children };
        }
        else
        {
            ArrayList<CategoryHierarchyFacetResultCategoryNode> existingList = new ArrayList<>(Arrays.asList(this.children));
            existingList.add(children);
            this.children = existingList.toArray(new CategoryHierarchyFacetResultCategoryNode[0]);
        }
        return this;
    }
    public CategoryHierarchyFacetResultCategoryNode setSelected(Boolean selected)
    {
        this.selected = selected;
        return this;
    }
}

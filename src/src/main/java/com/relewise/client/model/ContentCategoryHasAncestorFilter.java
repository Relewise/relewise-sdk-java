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
    defaultImpl = ContentCategoryHasAncestorFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentCategoryHasAncestorFilter extends HasAncestorCategoryFilter implements ICategoryFilter
{
    public String $type = "Relewise.Client.Requests.Filters.ContentCategoryHasAncestorFilter, Relewise.Client";
    public static ContentCategoryHasAncestorFilter create()
    {
        return new ContentCategoryHasAncestorFilter();
    }
    public ContentCategoryHasAncestorFilter()
    {
        this.negated = false;
    }
    public static ContentCategoryHasAncestorFilter create(Boolean negated)
    {
        return new ContentCategoryHasAncestorFilter(negated);
    }
    public ContentCategoryHasAncestorFilter(Boolean negated)
    {
        this.negated = negated;
    }
    @Override
    public ContentCategoryHasAncestorFilter setCategoryIds(String... categoryIds)
    {
        this.categoryIds = new ArrayList<>(Arrays.asList(categoryIds));;
        return this;
    }
    public ContentCategoryHasAncestorFilter addToCategoryIds(String categoryIds)
    {
        if (this.categoryIds == null)
        {
            this.categoryIds = new ArrayList<>();
        }
        this.categoryIds.add(categoryIds);
        return this;
    }
    @Override
    public ContentCategoryHasAncestorFilter setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
}

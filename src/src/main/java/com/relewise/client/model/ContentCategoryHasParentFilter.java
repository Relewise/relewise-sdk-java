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
import java.util.Set;
import java.util.HashSet;
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = ContentCategoryHasParentFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentCategoryHasParentFilter extends HasParentCategoryFilter implements IContentCategoryFilter, ICategoryFilter
{
    public String $type = "Relewise.Client.Requests.Filters.ContentCategoryHasParentFilter, Relewise.Client";
    public static ContentCategoryHasParentFilter create()
    {
        return new ContentCategoryHasParentFilter();
    }
    public ContentCategoryHasParentFilter()
    {
        this.negated = false;
    }
    public static ContentCategoryHasParentFilter create(Boolean negated)
    {
        return new ContentCategoryHasParentFilter(negated);
    }
    public ContentCategoryHasParentFilter(Boolean negated)
    {
        this.negated = negated;
    }
    @Override
    public ContentCategoryHasParentFilter setCategoryIds(String... categoryIds)
    {
        this.categoryIds = new ArrayList<>(Arrays.asList(categoryIds));;
        return this;
    }
    public ContentCategoryHasParentFilter addToCategoryIds(String categoryIds)
    {
        if (this.categoryIds == null)
        {
            this.categoryIds = new ArrayList<>();
        }
        this.categoryIds.add(categoryIds);
        return this;
    }
    @Override
    public ContentCategoryHasParentFilter setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    @Override
    public ContentCategoryHasParentFilter setSettings(@Nullable FilterSettings settings)
    {
        this.settings = settings;
        return this;
    }
}

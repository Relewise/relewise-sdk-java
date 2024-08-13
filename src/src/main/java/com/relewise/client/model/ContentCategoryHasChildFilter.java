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
    defaultImpl = ContentCategoryHasChildFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentCategoryHasChildFilter extends HasChildCategoryFilter implements ICategoryFilter
{
    public String $type = "Relewise.Client.Requests.Filters.ContentCategoryHasChildFilter, Relewise.Client";
    public static ContentCategoryHasChildFilter create()
    {
        return new ContentCategoryHasChildFilter();
    }
    public ContentCategoryHasChildFilter()
    {
        this.negated = false;
    }
    public static ContentCategoryHasChildFilter create(Boolean negated)
    {
        return new ContentCategoryHasChildFilter(negated);
    }
    public ContentCategoryHasChildFilter(Boolean negated)
    {
        this.negated = negated;
    }
    @Override
    public ContentCategoryHasChildFilter setCategoryIds(String... categoryIds)
    {
        this.categoryIds = new ArrayList<>(Arrays.asList(categoryIds));;
        return this;
    }
    public ContentCategoryHasChildFilter addToCategoryIds(String categoryIds)
    {
        if (this.categoryIds == null)
        {
            this.categoryIds = new ArrayList<>();
        }
        this.categoryIds.add(categoryIds);
        return this;
    }
    @Override
    public ContentCategoryHasChildFilter setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    @Override
    public ContentCategoryHasChildFilter setSettings(@Nullable FilterSettings settings)
    {
        this.settings = settings;
        return this;
    }
}

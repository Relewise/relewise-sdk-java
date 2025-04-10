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
    defaultImpl = ContentCategoryLevelFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentCategoryLevelFilter extends CategoryLevelFilter implements IContentCategoryFilter, ICategoryFilter
{
    public String $type = "Relewise.Client.Requests.Filters.ContentCategoryLevelFilter, Relewise.Client";
    public static ContentCategoryLevelFilter create()
    {
        return new ContentCategoryLevelFilter();
    }
    public ContentCategoryLevelFilter()
    {
        this.negated = false;
    }
    public static ContentCategoryLevelFilter create(Boolean negated)
    {
        return new ContentCategoryLevelFilter(negated);
    }
    public ContentCategoryLevelFilter(Boolean negated)
    {
        this.negated = negated;
    }
    @Override
    public ContentCategoryLevelFilter setLevels(Integer... levels)
    {
        this.levels = new ArrayList<>(Arrays.asList(levels));;
        return this;
    }
    public ContentCategoryLevelFilter addToLevels(Integer levels)
    {
        if (this.levels == null)
        {
            this.levels = new ArrayList<>();
        }
        this.levels.add(levels);
        return this;
    }
    @Override
    public ContentCategoryLevelFilter setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    @Override
    public ContentCategoryLevelFilter setSettings(@Nullable FilterSettings settings)
    {
        this.settings = settings;
        return this;
    }
}

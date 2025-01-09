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
    defaultImpl = ContentCategoryDataHasKeyFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentCategoryDataHasKeyFilter extends Filter implements IContentCategoryFilter, ICategoryFilter
{
    public String $type = "Relewise.Client.Requests.Filters.ContentCategoryDataHasKeyFilter, Relewise.Client";
    public String key;
    public static ContentCategoryDataHasKeyFilter create(String key)
    {
        return new ContentCategoryDataHasKeyFilter(key);
    }
    public ContentCategoryDataHasKeyFilter(String key)
    {
        this.key = key;
        this.negated = false;
    }
    public static ContentCategoryDataHasKeyFilter create(String key, Boolean negated)
    {
        return new ContentCategoryDataHasKeyFilter(key, negated);
    }
    public ContentCategoryDataHasKeyFilter(String key, Boolean negated)
    {
        this.key = key;
        this.negated = negated;
    }
    public ContentCategoryDataHasKeyFilter()
    {
        this.negated = false;
    }
    public String getKey()
    {
        return this.key;
    }
    public ContentCategoryDataHasKeyFilter setKey(String key)
    {
        this.key = key;
        return this;
    }
    @Override
    public ContentCategoryDataHasKeyFilter setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    @Override
    public ContentCategoryDataHasKeyFilter setSettings(@Nullable FilterSettings settings)
    {
        this.settings = settings;
        return this;
    }
}

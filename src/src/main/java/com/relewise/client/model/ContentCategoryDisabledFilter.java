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
    defaultImpl = ContentCategoryDisabledFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentCategoryDisabledFilter extends Filter implements IContentCategoryFilter, ICategoryFilter
{
    public String $type = "Relewise.Client.Requests.Filters.ContentCategoryDisabledFilter, Relewise.Client";
    public static ContentCategoryDisabledFilter create()
    {
        return new ContentCategoryDisabledFilter();
    }
    public ContentCategoryDisabledFilter()
    {
        this.negated = false;
    }
    public static ContentCategoryDisabledFilter create(Boolean negated)
    {
        return new ContentCategoryDisabledFilter(negated);
    }
    public ContentCategoryDisabledFilter(Boolean negated)
    {
        this.negated = negated;
    }
    @Override
    public ContentCategoryDisabledFilter setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    @Override
    public ContentCategoryDisabledFilter setSettings(@Nullable FilterSettings settings)
    {
        this.settings = settings;
        return this;
    }
}

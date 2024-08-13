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
    defaultImpl = ContentCategoryHasContentsFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentCategoryHasContentsFilter extends Filter implements ICategoryFilter
{
    public String $type = "Relewise.Client.Requests.Filters.ContentCategoryHasContentsFilter, Relewise.Client";
    public static ContentCategoryHasContentsFilter create(Boolean negated)
    {
        return new ContentCategoryHasContentsFilter(negated);
    }
    public ContentCategoryHasContentsFilter(Boolean negated)
    {
        this.negated = negated;
    }
    public ContentCategoryHasContentsFilter()
    {
    }
    @Override
    public ContentCategoryHasContentsFilter setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    @Override
    public ContentCategoryHasContentsFilter setSettings(@Nullable FilterSettings settings)
    {
        this.settings = settings;
        return this;
    }
}

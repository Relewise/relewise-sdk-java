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
    defaultImpl = ContentDataHasKeyFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentDataHasKeyFilter extends Filter implements IContentFilter
{
    public String $type = "Relewise.Client.Requests.Filters.ContentDataHasKeyFilter, Relewise.Client";
    public String key;
    public static ContentDataHasKeyFilter create(String key)
    {
        return new ContentDataHasKeyFilter(key);
    }
    public ContentDataHasKeyFilter(String key)
    {
        this.key = key;
        this.negated = false;
    }
    public static ContentDataHasKeyFilter create(String key, Boolean negated)
    {
        return new ContentDataHasKeyFilter(key, negated);
    }
    public ContentDataHasKeyFilter(String key, Boolean negated)
    {
        this.key = key;
        this.negated = negated;
    }
    public ContentDataHasKeyFilter()
    {
        this.negated = false;
    }
    public String getKey()
    {
        return this.key;
    }
    public ContentDataHasKeyFilter setKey(String key)
    {
        this.key = key;
        return this;
    }
    @Override
    public ContentDataHasKeyFilter setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    @Override
    public ContentDataHasKeyFilter setSettings(@Nullable FilterSettings settings)
    {
        this.settings = settings;
        return this;
    }
}

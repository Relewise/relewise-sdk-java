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
    defaultImpl = ContentDisabledFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentDisabledFilter extends Filter implements IContentFilter
{
    public String $type = "Relewise.Client.Requests.Filters.ContentDisabledFilter, Relewise.Client";
    public static ContentDisabledFilter create()
    {
        return new ContentDisabledFilter();
    }
    public ContentDisabledFilter()
    {
        this.negated = false;
    }
    public static ContentDisabledFilter create(Boolean negated)
    {
        return new ContentDisabledFilter(negated);
    }
    public ContentDisabledFilter(Boolean negated)
    {
        this.negated = negated;
    }
    @Override
    public ContentDisabledFilter setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    @Override
    public ContentDisabledFilter setSettings(@Nullable FilterSettings settings)
    {
        this.settings = settings;
        return this;
    }
}

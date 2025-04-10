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
    defaultImpl = ContentHasCategoriesFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentHasCategoriesFilter extends Filter implements IContentFilter
{
    public String $type = "Relewise.Client.Requests.Filters.ContentHasCategoriesFilter, Relewise.Client";
    public static ContentHasCategoriesFilter create(Boolean negated)
    {
        return new ContentHasCategoriesFilter(negated);
    }
    public ContentHasCategoriesFilter(Boolean negated)
    {
        this.negated = negated;
    }
    public ContentHasCategoriesFilter()
    {
    }
    @Override
    public ContentHasCategoriesFilter setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    @Override
    public ContentHasCategoriesFilter setSettings(@Nullable FilterSettings settings)
    {
        this.settings = settings;
        return this;
    }
}

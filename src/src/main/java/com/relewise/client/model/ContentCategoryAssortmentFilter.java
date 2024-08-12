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
    defaultImpl = ContentCategoryAssortmentFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentCategoryAssortmentFilter extends Filter implements ICategoryFilter
{
    public String $type = "Relewise.Client.Requests.Filters.ContentCategoryAssortmentFilter, Relewise.Client";
    public ArrayList<Integer> assortments;
    public static ContentCategoryAssortmentFilter create()
    {
        return new ContentCategoryAssortmentFilter();
    }
    public ContentCategoryAssortmentFilter()
    {
        this.negated = false;
    }
    public static ContentCategoryAssortmentFilter create(Boolean negated)
    {
        return new ContentCategoryAssortmentFilter(negated);
    }
    public ContentCategoryAssortmentFilter(Boolean negated)
    {
        this.negated = negated;
    }
    public ArrayList<Integer> getAssortments()
    {
        return this.assortments;
    }
    public ContentCategoryAssortmentFilter setAssortments(Integer... assortments)
    {
        this.assortments = new ArrayList<>(Arrays.asList(assortments));;
        return this;
    }
    public ContentCategoryAssortmentFilter addToAssortments(Integer assortments)
    {
        if (this.assortments == null)
        {
            this.assortments = new ArrayList<>();
        }
        this.assortments.add(assortments);
        return this;
    }
    @Override
    public ContentCategoryAssortmentFilter setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    @Override
    public ContentCategoryAssortmentFilter setSettings(FilterSettings settings)
    {
        this.settings = settings;
        return this;
    }
}

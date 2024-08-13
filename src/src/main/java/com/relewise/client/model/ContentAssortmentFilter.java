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
    defaultImpl = ContentAssortmentFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentAssortmentFilter extends Filter implements IContentFilter
{
    public String $type = "Relewise.Client.Requests.Filters.ContentAssortmentFilter, Relewise.Client";
    public ArrayList<Integer> assortments;
    public static ContentAssortmentFilter create()
    {
        return new ContentAssortmentFilter();
    }
    public ContentAssortmentFilter()
    {
        this.negated = false;
    }
    public static ContentAssortmentFilter create(Boolean negated)
    {
        return new ContentAssortmentFilter(negated);
    }
    public ContentAssortmentFilter(Boolean negated)
    {
        this.negated = negated;
    }
    public ArrayList<Integer> getAssortments()
    {
        return this.assortments;
    }
    public ContentAssortmentFilter setAssortments(Integer... assortments)
    {
        this.assortments = new ArrayList<>(Arrays.asList(assortments));;
        return this;
    }
    public ContentAssortmentFilter addToAssortments(Integer assortments)
    {
        if (this.assortments == null)
        {
            this.assortments = new ArrayList<>();
        }
        this.assortments.add(assortments);
        return this;
    }
    @Override
    public ContentAssortmentFilter setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    @Override
    public ContentAssortmentFilter setSettings(@Nullable FilterSettings settings)
    {
        this.settings = settings;
        return this;
    }
}

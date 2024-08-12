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
    defaultImpl = ContentAttributeSorting.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentAttributeSorting extends ContentSorting
{
    public String $type = "Relewise.Client.DataTypes.Search.Sorting.Content.ContentAttributeSorting, Relewise.Client";
    public ContentAttributeSortingSortableAttribute attribute;
    public SortMode mode;
    public static ContentAttributeSorting create(ContentAttributeSortingSortableAttribute attribute, SortOrder order)
    {
        return new ContentAttributeSorting(attribute, order);
    }
    public ContentAttributeSorting(ContentAttributeSortingSortableAttribute attribute, SortOrder order)
    {
        this.attribute = attribute;
        this.order = order;
        this.mode = SortMode.Auto;
    }
    public static ContentAttributeSorting create(ContentAttributeSortingSortableAttribute attribute, SortOrder order, SortMode mode)
    {
        return new ContentAttributeSorting(attribute, order, mode);
    }
    public ContentAttributeSorting(ContentAttributeSortingSortableAttribute attribute, SortOrder order, SortMode mode)
    {
        this.attribute = attribute;
        this.order = order;
        this.mode = mode;
    }
    public ContentAttributeSorting()
    {
        this.mode = SortMode.Auto;
    }
    public ContentAttributeSortingSortableAttribute getAttribute()
    {
        return this.attribute;
    }
    public SortMode getMode()
    {
        return this.mode;
    }
    public ContentAttributeSorting setAttribute(ContentAttributeSortingSortableAttribute attribute)
    {
        this.attribute = attribute;
        return this;
    }
    public ContentAttributeSorting setMode(SortMode mode)
    {
        this.mode = mode;
        return this;
    }
    @Override
    public ContentAttributeSorting setOrder(SortOrder order)
    {
        this.order = order;
        return this;
    }
    @Override
    public ContentAttributeSorting setThenBy(ContentSorting thenBy)
    {
        this.thenBy = thenBy;
        return this;
    }
}

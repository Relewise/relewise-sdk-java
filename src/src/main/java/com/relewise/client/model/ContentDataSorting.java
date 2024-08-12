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
    defaultImpl = ContentDataSorting.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentDataSorting extends ContentSorting
{
    public String $type = "Relewise.Client.DataTypes.Search.Sorting.Content.ContentDataSorting, Relewise.Client";
    public String key;
    public SortMode mode;
    public static ContentDataSorting create(String key, SortOrder order)
    {
        return new ContentDataSorting(key, order);
    }
    public ContentDataSorting(String key, SortOrder order)
    {
        this.key = key;
        this.order = order;
        this.mode = SortMode.Auto;
    }
    public static ContentDataSorting create(String key, SortOrder order, SortMode mode)
    {
        return new ContentDataSorting(key, order, mode);
    }
    public ContentDataSorting(String key, SortOrder order, SortMode mode)
    {
        this.key = key;
        this.order = order;
        this.mode = mode;
    }
    public ContentDataSorting()
    {
        this.mode = SortMode.Auto;
    }
    public String getKey()
    {
        return this.key;
    }
    public SortMode getMode()
    {
        return this.mode;
    }
    public ContentDataSorting setKey(String key)
    {
        this.key = key;
        return this;
    }
    public ContentDataSorting setMode(SortMode mode)
    {
        this.mode = mode;
        return this;
    }
    @Override
    public ContentDataSorting setOrder(SortOrder order)
    {
        this.order = order;
        return this;
    }
    @Override
    public ContentDataSorting setThenBy(ContentSorting thenBy)
    {
        this.thenBy = thenBy;
        return this;
    }
}

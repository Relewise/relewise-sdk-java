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
    defaultImpl = ContentRelevanceSorting.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentRelevanceSorting extends ContentSorting
{
    public String $type = "Relewise.Client.DataTypes.Search.Sorting.Content.ContentRelevanceSorting, Relewise.Client";
    public static ContentRelevanceSorting create()
    {
        return new ContentRelevanceSorting();
    }
    public ContentRelevanceSorting()
    {
        this.order = SortOrder.Descending;
    }
    public static ContentRelevanceSorting create(SortOrder order)
    {
        return new ContentRelevanceSorting(order);
    }
    public ContentRelevanceSorting(SortOrder order)
    {
        this.order = order;
    }
    @Override
    public ContentRelevanceSorting setOrder(SortOrder order)
    {
        this.order = order;
        return this;
    }
    @Override
    public ContentRelevanceSorting setThenBy(ContentSorting thenBy)
    {
        this.thenBy = thenBy;
        return this;
    }
}

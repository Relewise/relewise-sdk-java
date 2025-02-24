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
    defaultImpl = ContentPopularitySorting.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentPopularitySorting extends ContentSorting
{
    public String $type = "Relewise.Client.DataTypes.Search.Sorting.Content.ContentPopularitySorting, Relewise.Client";
    public static ContentPopularitySorting create()
    {
        return new ContentPopularitySorting();
    }
    public ContentPopularitySorting()
    {
        this.order = SortOrder.Descending;
    }
    public static ContentPopularitySorting create(SortOrder order)
    {
        return new ContentPopularitySorting(order);
    }
    public ContentPopularitySorting(SortOrder order)
    {
        this.order = order;
    }
    @Override
    public ContentPopularitySorting setOrder(SortOrder order)
    {
        this.order = order;
        return this;
    }
    @Override
    public ContentPopularitySorting setThenBy(ContentSorting thenBy)
    {
        this.thenBy = thenBy;
        return this;
    }
}

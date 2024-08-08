package com.relewise.client.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.annotation.Nullable;
import java.io.IOException;
import java.time.OffsetDateTime;
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
    property = "$type")
@JsonSubTypes({
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class ContentSortingSorting
{
    public String $type = "Relewise.Client.DataTypes.Search.Sorting.Sorting`1[[Relewise.Client.DataTypes.Search.Sorting.Content.ContentSorting, Relewise.Client, Version=1.61.0.0, Culture=neutral, PublicKeyToken=null]], Relewise.Client";
    public SortOrder order;
    public ContentSorting thenBy;
    public SortOrder getOrder()
    {
        return this.order;
    }
    public ContentSorting getThenBy()
    {
        return this.thenBy;
    }
    public ContentSortingSorting setOrder(SortOrder order)
    {
        this.order = order;;
        return this;
    }
    public ContentSortingSorting setThenBy(ContentSorting thenBy)
    {
        this.thenBy = thenBy;;
        return this;
    }
}

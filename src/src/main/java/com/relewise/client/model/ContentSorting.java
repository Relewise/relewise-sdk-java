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
    @JsonSubTypes.Type(value = ContentAttributeSorting.class, name = "Relewise.Client.DataTypes.Search.Sorting.Content.ContentAttributeSorting, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentDataSorting.class, name = "Relewise.Client.DataTypes.Search.Sorting.Content.ContentDataSorting, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentPopularitySorting.class, name = "Relewise.Client.DataTypes.Search.Sorting.Content.ContentPopularitySorting, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentRelevanceSorting.class, name = "Relewise.Client.DataTypes.Search.Sorting.Content.ContentRelevanceSorting, Relewise.Client"),
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class ContentSorting extends ContentSortingSorting
{
    public String $type = "Relewise.Client.DataTypes.Search.Sorting.Content.ContentSorting, Relewise.Client";
    @Override
    public ContentSorting setOrder(SortOrder order)
    {
        this.order = order;;
        return this;
    }
    @Override
    public ContentSorting setThenBy(ContentSorting thenBy)
    {
        this.thenBy = thenBy;;
        return this;
    }
}

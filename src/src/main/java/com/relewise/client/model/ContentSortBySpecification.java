package com.relewise.client.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
    property = "$type",
    defaultImpl = ContentSortBySpecification.class)
public class ContentSortBySpecification
{
    public String $type = "Relewise.Client.DataTypes.Search.Sorting.Content.ContentSortBySpecification, Relewise.Client";
    public ContentSorting value;
    public static ContentSortBySpecification create()
    {
        return new ContentSortBySpecification();
    }
    public ContentSortBySpecification()
    {
    }
    public ContentSorting getValue()
    {
        return this.value;
    }
    public ContentSortBySpecification setValue(ContentSorting value)
    {
        this.value = value;;
        return this;
    }
}

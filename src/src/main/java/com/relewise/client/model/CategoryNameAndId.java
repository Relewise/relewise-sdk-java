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
    property = "$type",
    defaultImpl = CategoryNameAndId.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CategoryNameAndId
{
    public String $type = "Relewise.Client.DataTypes.CategoryNameAndId, Relewise.Client";
    public String id;
    public @Nullable Multilingual displayName;
    public static CategoryNameAndId create(String id)
    {
        return new CategoryNameAndId(id);
    }
    public CategoryNameAndId(String id)
    {
        this.id = id;
        this.displayName = null;
    }
    public static CategoryNameAndId create(String id, Multilingual displayName)
    {
        return new CategoryNameAndId(id, displayName);
    }
    public CategoryNameAndId(String id, Multilingual displayName)
    {
        this.id = id;
        this.displayName = displayName;
    }
    public CategoryNameAndId()
    {
        this.displayName = null;
    }
    public String getId()
    {
        return this.id;
    }
    public @Nullable Multilingual getDisplayName()
    {
        return this.displayName;
    }
    public CategoryNameAndId setId(String id)
    {
        this.id = id;;
        return this;
    }
    public CategoryNameAndId setDisplayName(Multilingual displayName)
    {
        this.displayName = displayName;;
        return this;
    }
}

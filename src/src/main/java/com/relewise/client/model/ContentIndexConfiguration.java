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
    defaultImpl = ContentIndexConfiguration.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentIndexConfiguration
{
    public String $type = "Relewise.Client.DataTypes.Search.Configuration.ContentIndexConfiguration, Relewise.Client";
    public FieldIndexConfiguration id;
    public FieldIndexConfiguration displayName;
    public CategoryIndexConfiguration category;
    public DataIndexConfiguration data;
    public static ContentIndexConfiguration create()
    {
        return new ContentIndexConfiguration();
    }
    public ContentIndexConfiguration()
    {
    }
    public FieldIndexConfiguration getId()
    {
        return this.id;
    }
    public FieldIndexConfiguration getDisplayName()
    {
        return this.displayName;
    }
    public CategoryIndexConfiguration getCategory()
    {
        return this.category;
    }
    public DataIndexConfiguration getData()
    {
        return this.data;
    }
    public ContentIndexConfiguration setId(FieldIndexConfiguration id)
    {
        this.id = id;;
        return this;
    }
    public ContentIndexConfiguration setDisplayName(FieldIndexConfiguration displayName)
    {
        this.displayName = displayName;;
        return this;
    }
    public ContentIndexConfiguration setCategory(CategoryIndexConfiguration category)
    {
        this.category = category;;
        return this;
    }
    public ContentIndexConfiguration setData(DataIndexConfiguration data)
    {
        this.data = data;;
        return this;
    }
}

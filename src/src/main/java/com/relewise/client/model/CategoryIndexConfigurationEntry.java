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
    defaultImpl = CategoryIndexConfigurationEntry.class)
public class CategoryIndexConfigurationEntry
{
    public String $type = "Relewise.Client.DataTypes.Search.Configuration.CategoryIndexConfigurationEntry, Relewise.Client";
    public FieldIndexConfiguration id;
    public FieldIndexConfiguration displayName;
    public DataIndexConfiguration data;
    public static CategoryIndexConfigurationEntry create()
    {
        return new CategoryIndexConfigurationEntry();
    }
    public CategoryIndexConfigurationEntry()
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
    public DataIndexConfiguration getData()
    {
        return this.data;
    }
    public CategoryIndexConfigurationEntry setId(FieldIndexConfiguration id)
    {
        this.id = id;;
        return this;
    }
    public CategoryIndexConfigurationEntry setDisplayName(FieldIndexConfiguration displayName)
    {
        this.displayName = displayName;;
        return this;
    }
    public CategoryIndexConfigurationEntry setData(DataIndexConfiguration data)
    {
        this.data = data;;
        return this;
    }
}

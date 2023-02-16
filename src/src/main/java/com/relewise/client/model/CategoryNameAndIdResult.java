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
    defaultImpl = CategoryNameAndIdResult.class)
public class CategoryNameAndIdResult
{
    public String $type = "Relewise.Client.DataTypes.CategoryNameAndIdResult, Relewise.Client";
    public String id;
    public String displayName;
    public static CategoryNameAndIdResult create(String id, String displayName)
    {
        return new CategoryNameAndIdResult(id, displayName);
    }
    public CategoryNameAndIdResult(String id, String displayName)
    {
        this.id = id;
        this.displayName = displayName;
    }
    public CategoryNameAndIdResult()
    {
    }
    public String getId()
    {
        return this.id;
    }
    public String getDisplayName()
    {
        return this.displayName;
    }
    public CategoryNameAndIdResult setId(String id)
    {
        this.id = id;;
        return this;
    }
    public CategoryNameAndIdResult setDisplayName(String displayName)
    {
        this.displayName = displayName;;
        return this;
    }
}

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
    defaultImpl = ContentCategory.class)
public class ContentCategory extends Category
{
    public String $type = "Relewise.Client.DataTypes.ContentCategory, Relewise.Client";
    public static ContentCategory create(String id)
    {
        return new ContentCategory(id);
    }
    public ContentCategory(String id)
    {
        this.id = id;
    }
    public ContentCategory()
    {
    }
    @Override
    public ContentCategory setId(String id)
    {
        this.id = id;;
        return this;
    }
    @Override
    public ContentCategory setDisplayName(Multilingual displayName)
    {
        this.displayName = displayName;;
        return this;
    }
    @Override
    public ContentCategory setCategoryPaths(CategoryPath... categoryPaths)
    {
        this.categoryPaths = new ArrayList<>(Arrays.asList(categoryPaths));;
        return this;
    }
    public ContentCategory addToCategoryPaths(CategoryPath categoryPaths)
    {
        if (this.categoryPaths == null)
        {
            this.categoryPaths = new ArrayList<>();
        }
        this.categoryPaths.add(categoryPaths);
        return this;
    }
    @Override
    public ContentCategory setAssortments(Integer... assortments)
    {
        this.assortments = new ArrayList<>(Arrays.asList(assortments));;
        return this;
    }
    public ContentCategory addToAssortments(Integer assortments)
    {
        if (this.assortments == null)
        {
            this.assortments = new ArrayList<>();
        }
        this.assortments.add(assortments);
        return this;
    }
    public ContentCategory addToData(String key, DataValue value)
    {
        if (this.data == null)
        {
            this.data = new HashMap<>();
        }
        this.data.put(key, value);
        return this;
    }
    @Override
    public ContentCategory setData(HashMap<String, DataValue> data)
    {
        this.data = data;;
        return this;
    }
}

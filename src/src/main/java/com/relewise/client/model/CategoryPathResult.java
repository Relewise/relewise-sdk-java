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
    defaultImpl = CategoryPathResult.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CategoryPathResult
{
    public String $type = "Relewise.Client.DataTypes.CategoryPathResult, Relewise.Client";
    public ArrayList<CategoryNameAndIdResult> pathFromRoot;
    public Integer rank;
    public static CategoryPathResult create(CategoryNameAndIdResult... pathFromRoot)
    {
        return new CategoryPathResult(pathFromRoot);
    }
    public CategoryPathResult(CategoryNameAndIdResult... pathFromRoot)
    {
        this.pathFromRoot = new ArrayList<>(Arrays.asList(pathFromRoot));
    }
    public CategoryPathResult()
    {
    }
    public ArrayList<CategoryNameAndIdResult> getPathFromRoot()
    {
        return this.pathFromRoot;
    }
    public Integer getRank()
    {
        return this.rank;
    }
    public CategoryPathResult setPathFromRoot(CategoryNameAndIdResult... pathFromRoot)
    {
        this.pathFromRoot = new ArrayList<>(Arrays.asList(pathFromRoot));;
        return this;
    }
    public CategoryPathResult addToPathFromRoot(CategoryNameAndIdResult pathFromRoot)
    {
        if (this.pathFromRoot == null)
        {
            this.pathFromRoot = new ArrayList<>();
        }
        this.pathFromRoot.add(pathFromRoot);
        return this;
    }
    public CategoryPathResult setRank(Integer rank)
    {
        this.rank = rank;;
        return this;
    }
}

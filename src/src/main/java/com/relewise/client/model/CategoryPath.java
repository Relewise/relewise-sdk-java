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
    defaultImpl = CategoryPath.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CategoryPath
{
    public String $type = "Relewise.Client.DataTypes.CategoryPath, Relewise.Client";
    public ArrayList<CategoryNameAndId> breadcrumbPathStartingFromRoot;
    public static CategoryPath create(CategoryNameAndId... breadcrumbPathStartingFromRoot)
    {
        return new CategoryPath(breadcrumbPathStartingFromRoot);
    }
    public CategoryPath(CategoryNameAndId... breadcrumbPathStartingFromRoot)
    {
        this.breadcrumbPathStartingFromRoot = new ArrayList<>(Arrays.asList(breadcrumbPathStartingFromRoot));
    }
    public CategoryPath()
    {
    }
    public ArrayList<CategoryNameAndId> getBreadcrumbPathStartingFromRoot()
    {
        return this.breadcrumbPathStartingFromRoot;
    }
    public CategoryPath setBreadcrumbPathStartingFromRoot(CategoryNameAndId... breadcrumbPathStartingFromRoot)
    {
        this.breadcrumbPathStartingFromRoot = new ArrayList<>(Arrays.asList(breadcrumbPathStartingFromRoot));;
        return this;
    }
    public CategoryPath addToBreadcrumbPathStartingFromRoot(CategoryNameAndId breadcrumbPathStartingFromRoot)
    {
        if (this.breadcrumbPathStartingFromRoot == null)
        {
            this.breadcrumbPathStartingFromRoot = new ArrayList<>();
        }
        this.breadcrumbPathStartingFromRoot.add(breadcrumbPathStartingFromRoot);
        return this;
    }
}

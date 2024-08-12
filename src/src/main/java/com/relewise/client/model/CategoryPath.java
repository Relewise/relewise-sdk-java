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
    
/** Used to specify the full path of a product/lineitem, starting at the root > subcategory > subcategory2 etc. */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CategoryPath
{
    public ArrayList<CategoryNameAndId> breadcrumbPathStartingFromRoot;
    /**
     * The full path of the products, starting at the root > subcategory > subcategory2 etc. If you dont have a category id available, provide the Category name for both ID and Name, and the same if you have an ID, but not a Name. Example: new CategoryPath(new CategoryNameAndId("515", "Soups"), new CategoryNameAndId("518", "Vegetable soups"))
     * @param breadcrumbPathStartingFromRoot Example: new CategoryPath(new CategoryNameAndId("515", "Soups"), new CategoryNameAndId("518", "Vegetable soups"))
     */
    public static CategoryPath create(CategoryNameAndId... breadcrumbPathStartingFromRoot)
    {
        return new CategoryPath(breadcrumbPathStartingFromRoot);
    }
    /**
     * The full path of the products, starting at the root > subcategory > subcategory2 etc. If you dont have a category id available, provide the Category name for both ID and Name, and the same if you have an ID, but not a Name. Example: new CategoryPath(new CategoryNameAndId("515", "Soups"), new CategoryNameAndId("518", "Vegetable soups"))
     * @param breadcrumbPathStartingFromRoot Example: new CategoryPath(new CategoryNameAndId("515", "Soups"), new CategoryNameAndId("518", "Vegetable soups"))
     */
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

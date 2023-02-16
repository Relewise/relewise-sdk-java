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
    defaultImpl = ProductCategoryInterestTriggerResultCategory.class)
public class ProductCategoryInterestTriggerResultCategory
{
    public String $type = "Relewise.Client.Responses.Triggers.Results.ProductCategoryInterestTriggerResult+Category, Relewise.Client";
    public String[] lastPath;
    public Integer views;
    public CategoryProductAndVariant[] viewedProducts;
    public static ProductCategoryInterestTriggerResultCategory create()
    {
        return new ProductCategoryInterestTriggerResultCategory();
    }
    public ProductCategoryInterestTriggerResultCategory()
    {
    }
    public String[] getLastPath()
    {
        return this.lastPath;
    }
    public Integer getViews()
    {
        return this.views;
    }
    public CategoryProductAndVariant[] getViewedProducts()
    {
        return this.viewedProducts;
    }
    public ProductCategoryInterestTriggerResultCategory setLastPath(String... lastPath)
    {
        this.lastPath = lastPath;;
        return this;
    }
    public ProductCategoryInterestTriggerResultCategory addToLastPath(String lastPath)
    {
        if (this.lastPath == null)
        {
            this.lastPath = new String[] { lastPath };
        }
        else
        {
            ArrayList<String> existingList = new ArrayList<>(Arrays.asList(this.lastPath));
            existingList.add(lastPath);
            this.lastPath = existingList.toArray(new String[0]);
        }
        return this;
    }
    public ProductCategoryInterestTriggerResultCategory setViews(Integer views)
    {
        this.views = views;;
        return this;
    }
    public ProductCategoryInterestTriggerResultCategory setViewedProducts(CategoryProductAndVariant... viewedProducts)
    {
        this.viewedProducts = viewedProducts;;
        return this;
    }
    public ProductCategoryInterestTriggerResultCategory addToViewedProducts(CategoryProductAndVariant viewedProduct)
    {
        if (this.viewedProducts == null)
        {
            this.viewedProducts = new CategoryProductAndVariant[] { viewedProduct };
        }
        else
        {
            ArrayList<CategoryProductAndVariant> existingList = new ArrayList<>(Arrays.asList(this.viewedProducts));
            existingList.add(viewedProduct);
            this.viewedProducts = existingList.toArray(new CategoryProductAndVariant[0]);
        }
        return this;
    }
}

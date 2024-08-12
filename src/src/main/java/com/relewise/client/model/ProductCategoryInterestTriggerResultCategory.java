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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductCategoryInterestTriggerResultCategory
{
    public String[] lastPath;
    public Integer views;
    public ProductCategoryInterestTriggerResultCategoryProductAndVariant[] viewedProducts;
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
    public ProductCategoryInterestTriggerResultCategoryProductAndVariant[] getViewedProducts()
    {
        return this.viewedProducts;
    }
    public ProductCategoryInterestTriggerResultCategory setLastPath(String... lastPath)
    {
        this.lastPath = lastPath;
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
        this.views = views;
        return this;
    }
    public ProductCategoryInterestTriggerResultCategory setViewedProducts(ProductCategoryInterestTriggerResultCategoryProductAndVariant... viewedProducts)
    {
        this.viewedProducts = viewedProducts;
        return this;
    }
    public ProductCategoryInterestTriggerResultCategory addToViewedProducts(ProductCategoryInterestTriggerResultCategoryProductAndVariant viewedProduct)
    {
        if (this.viewedProducts == null)
        {
            this.viewedProducts = new ProductCategoryInterestTriggerResultCategoryProductAndVariant[] { viewedProduct };
        }
        else
        {
            ArrayList<ProductCategoryInterestTriggerResultCategoryProductAndVariant> existingList = new ArrayList<>(Arrays.asList(this.viewedProducts));
            existingList.add(viewedProduct);
            this.viewedProducts = existingList.toArray(new ProductCategoryInterestTriggerResultCategoryProductAndVariant[0]);
        }
        return this;
    }
}

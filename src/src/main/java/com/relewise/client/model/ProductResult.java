package com.relewise.client.model;

import com.fasterxml.jackson.annotation.*;
import javax.annotation.Nullable;
import java.io.IOException;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Arrays;
import java.util.UUID;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductResult
{
    public String productId;
    public String displayName;
    public VariantResult variant;
    public Integer rank;
    public Integer[] assortments;
    public HashMap<String, DataValue> data;
    public CategoryPathResult[] categoryPaths;
    public PurchasedByUserInfo purchasedByUser;
    public ViewedByUserInfo viewedByUser;
    public @Nullable Double listPrice;
    public @Nullable Double salesPrice;
    public BrandResult brand;
    public VariantResult[] allVariants;
    public PurchasedByUserCompanyInfo purchasedByUserCompany;
    public ViewedByUserCompanyInfo viewedByUserCompany;
    public VariantResult[] filteredVariants;
    public @Nullable HighlightResult highlight;
    /** Holds information about how good this product result is. This will only be populated if specifically requested which is currently only possible for term-based product search requests. */
    public @Nullable Score score;
    public static ProductResult create(String productId, Integer rank)
    {
        return new ProductResult(productId, rank);
    }
    public ProductResult(String productId, Integer rank)
    {
        this.productId = productId;
        this.rank = rank;
    }
    public ProductResult()
    {
    }
    public String getProductId()
    {
        return this.productId;
    }
    public String getDisplayName()
    {
        return this.displayName;
    }
    public VariantResult getVariant()
    {
        return this.variant;
    }
    public Integer getRank()
    {
        return this.rank;
    }
    public Integer[] getAssortments()
    {
        return this.assortments;
    }
    public HashMap<String, DataValue> getData()
    {
        return this.data;
    }
    public CategoryPathResult[] getCategoryPaths()
    {
        return this.categoryPaths;
    }
    public PurchasedByUserInfo getPurchasedByUser()
    {
        return this.purchasedByUser;
    }
    public ViewedByUserInfo getViewedByUser()
    {
        return this.viewedByUser;
    }
    public @Nullable Double getListPrice()
    {
        return this.listPrice;
    }
    public @Nullable Double getSalesPrice()
    {
        return this.salesPrice;
    }
    public BrandResult getBrand()
    {
        return this.brand;
    }
    public VariantResult[] getAllVariants()
    {
        return this.allVariants;
    }
    public PurchasedByUserCompanyInfo getPurchasedByUserCompany()
    {
        return this.purchasedByUserCompany;
    }
    public ViewedByUserCompanyInfo getViewedByUserCompany()
    {
        return this.viewedByUserCompany;
    }
    public VariantResult[] getFilteredVariants()
    {
        return this.filteredVariants;
    }
    public @Nullable HighlightResult getHighlight()
    {
        return this.highlight;
    }
    /** Holds information about how good this product result is. This will only be populated if specifically requested which is currently only possible for term-based product search requests. */
    public @Nullable Score getScore()
    {
        return this.score;
    }
    public ProductResult setProductId(String productId)
    {
        this.productId = productId;
        return this;
    }
    public ProductResult setDisplayName(String displayName)
    {
        this.displayName = displayName;
        return this;
    }
    public ProductResult setVariant(VariantResult variant)
    {
        this.variant = variant;
        return this;
    }
    public ProductResult setRank(Integer rank)
    {
        this.rank = rank;
        return this;
    }
    public ProductResult setAssortments(Integer... assortments)
    {
        this.assortments = assortments;
        return this;
    }
    public ProductResult addToAssortments(Integer assortment)
    {
        if (this.assortments == null)
        {
            this.assortments = new Integer[] { assortment };
        }
        else
        {
            ArrayList<Integer> existingList = new ArrayList<>(Arrays.asList(this.assortments));
            existingList.add(assortment);
            this.assortments = existingList.toArray(new Integer[0]);
        }
        return this;
    }
    public ProductResult addToData(String key, DataValue value)
    {
        if (this.data == null)
        {
            this.data = new HashMap<>();
        }
        this.data.put(key, value);
        return this;
    }
    public ProductResult setData(HashMap<String, DataValue> data)
    {
        this.data = data;
        return this;
    }
    public ProductResult setCategoryPaths(CategoryPathResult... categoryPaths)
    {
        this.categoryPaths = categoryPaths;
        return this;
    }
    public ProductResult addToCategoryPaths(CategoryPathResult categoryPath)
    {
        if (this.categoryPaths == null)
        {
            this.categoryPaths = new CategoryPathResult[] { categoryPath };
        }
        else
        {
            ArrayList<CategoryPathResult> existingList = new ArrayList<>(Arrays.asList(this.categoryPaths));
            existingList.add(categoryPath);
            this.categoryPaths = existingList.toArray(new CategoryPathResult[0]);
        }
        return this;
    }
    public ProductResult setPurchasedByUser(PurchasedByUserInfo purchasedByUser)
    {
        this.purchasedByUser = purchasedByUser;
        return this;
    }
    public ProductResult setViewedByUser(ViewedByUserInfo viewedByUser)
    {
        this.viewedByUser = viewedByUser;
        return this;
    }
    public ProductResult setListPrice(@Nullable Double listPrice)
    {
        this.listPrice = listPrice;
        return this;
    }
    public ProductResult setSalesPrice(@Nullable Double salesPrice)
    {
        this.salesPrice = salesPrice;
        return this;
    }
    public ProductResult setBrand(BrandResult brand)
    {
        this.brand = brand;
        return this;
    }
    public ProductResult setAllVariants(VariantResult... allVariants)
    {
        this.allVariants = allVariants;
        return this;
    }
    public ProductResult addToAllVariants(VariantResult allVariant)
    {
        if (this.allVariants == null)
        {
            this.allVariants = new VariantResult[] { allVariant };
        }
        else
        {
            ArrayList<VariantResult> existingList = new ArrayList<>(Arrays.asList(this.allVariants));
            existingList.add(allVariant);
            this.allVariants = existingList.toArray(new VariantResult[0]);
        }
        return this;
    }
    public ProductResult setPurchasedByUserCompany(PurchasedByUserCompanyInfo purchasedByUserCompany)
    {
        this.purchasedByUserCompany = purchasedByUserCompany;
        return this;
    }
    public ProductResult setViewedByUserCompany(ViewedByUserCompanyInfo viewedByUserCompany)
    {
        this.viewedByUserCompany = viewedByUserCompany;
        return this;
    }
    public ProductResult setFilteredVariants(VariantResult... filteredVariants)
    {
        this.filteredVariants = filteredVariants;
        return this;
    }
    public ProductResult addToFilteredVariants(VariantResult filteredVariant)
    {
        if (this.filteredVariants == null)
        {
            this.filteredVariants = new VariantResult[] { filteredVariant };
        }
        else
        {
            ArrayList<VariantResult> existingList = new ArrayList<>(Arrays.asList(this.filteredVariants));
            existingList.add(filteredVariant);
            this.filteredVariants = existingList.toArray(new VariantResult[0]);
        }
        return this;
    }
    public ProductResult setHighlight(@Nullable HighlightResult highlight)
    {
        this.highlight = highlight;
        return this;
    }
    /** Holds information about how good this product result is. This will only be populated if specifically requested which is currently only possible for term-based product search requests. */
    public ProductResult setScore(@Nullable Score score)
    {
        this.score = score;
        return this;
    }
}

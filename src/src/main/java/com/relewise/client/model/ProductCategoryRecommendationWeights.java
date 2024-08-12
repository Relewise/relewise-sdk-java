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
public class ProductCategoryRecommendationWeights
{
    public Double categoryViews;
    public Double productViews;
    public Double productPurchases;
    public static ProductCategoryRecommendationWeights create()
    {
        return new ProductCategoryRecommendationWeights();
    }
    public ProductCategoryRecommendationWeights()
    {
        this.categoryViews = 1d;
        this.productViews = 1d;
        this.productPurchases = 1d;
    }
    public static ProductCategoryRecommendationWeights create(Double categoryViews, Double productViews, Double productPurchases)
    {
        return new ProductCategoryRecommendationWeights(categoryViews, productViews, productPurchases);
    }
    public ProductCategoryRecommendationWeights(Double categoryViews, Double productViews, Double productPurchases)
    {
        this.categoryViews = categoryViews;
        this.productViews = productViews;
        this.productPurchases = productPurchases;
    }
    public Double getCategoryViews()
    {
        return this.categoryViews;
    }
    public Double getProductViews()
    {
        return this.productViews;
    }
    public Double getProductPurchases()
    {
        return this.productPurchases;
    }
    public ProductCategoryRecommendationWeights setCategoryViews(Double categoryViews)
    {
        this.categoryViews = categoryViews;
        return this;
    }
    public ProductCategoryRecommendationWeights setProductViews(Double productViews)
    {
        this.productViews = productViews;
        return this;
    }
    public ProductCategoryRecommendationWeights setProductPurchases(Double productPurchases)
    {
        this.productPurchases = productPurchases;
        return this;
    }
}

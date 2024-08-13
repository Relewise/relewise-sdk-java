package com.relewise.client.model;

import com.fasterxml.jackson.annotation.*;
import javax.annotation.Nullable;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.LocalDateTime;
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
public class BrandRecommendationWeights
{
    public Double brandViews;
    public Double productViews;
    public Double productPurchases;
    public static BrandRecommendationWeights create()
    {
        return new BrandRecommendationWeights();
    }
    public BrandRecommendationWeights()
    {
        this.brandViews = 1d;
        this.productViews = 1d;
        this.productPurchases = 1d;
    }
    public static BrandRecommendationWeights create(Double brandViews, Double productViews, Double productPurchases)
    {
        return new BrandRecommendationWeights(brandViews, productViews, productPurchases);
    }
    public BrandRecommendationWeights(Double brandViews, Double productViews, Double productPurchases)
    {
        this.brandViews = brandViews;
        this.productViews = productViews;
        this.productPurchases = productPurchases;
    }
    public Double getBrandViews()
    {
        return this.brandViews;
    }
    public Double getProductViews()
    {
        return this.productViews;
    }
    public Double getProductPurchases()
    {
        return this.productPurchases;
    }
    public BrandRecommendationWeights setBrandViews(Double brandViews)
    {
        this.brandViews = brandViews;
        return this;
    }
    public BrandRecommendationWeights setProductViews(Double productViews)
    {
        this.productViews = productViews;
        return this;
    }
    public BrandRecommendationWeights setProductPurchases(Double productPurchases)
    {
        this.productPurchases = productPurchases;
        return this;
    }
}

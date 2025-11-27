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
public class CampaignAnalyticsProductAnalyticsPromotedProductMetrics
{
    public String productId;
    public Integer promotions;
    public ProductResult product;
    public static CampaignAnalyticsProductAnalyticsPromotedProductMetrics create(String productId, Integer promotions)
    {
        return new CampaignAnalyticsProductAnalyticsPromotedProductMetrics(productId, promotions);
    }
    public CampaignAnalyticsProductAnalyticsPromotedProductMetrics(String productId, Integer promotions)
    {
        this.productId = productId;
        this.promotions = promotions;
    }
    public CampaignAnalyticsProductAnalyticsPromotedProductMetrics()
    {
    }
    public String getProductId()
    {
        return this.productId;
    }
    public Integer getPromotions()
    {
        return this.promotions;
    }
    public ProductResult getProduct()
    {
        return this.product;
    }
    public CampaignAnalyticsProductAnalyticsPromotedProductMetrics setProductId(String productId)
    {
        this.productId = productId;
        return this;
    }
    public CampaignAnalyticsProductAnalyticsPromotedProductMetrics setPromotions(Integer promotions)
    {
        this.promotions = promotions;
        return this;
    }
    public CampaignAnalyticsProductAnalyticsPromotedProductMetrics setProduct(ProductResult product)
    {
        this.product = product;
        return this;
    }
}

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
    
/** Defines the settings for seeding the feed with specific products or content. Useful, for example, when you want to show a feed based on specific product(s) or content, such as for a feed on a PDP/CDP, a shopping cart, or an order. */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FeedSeed
{
    /** Optionally used to seed the feed with specific product IDs (optionally also with variant IDs), e.g., a single product for a PDP or one to many products for a shopping cart or order. */
    public @Nullable ArrayList<ProductAndVariantId> productAndVariantIds;
    /** Optionally used to seed the feed with specific content, e.g., a single content ID for a CDP. */
    public @Nullable ArrayList<String> contentIds;
    public static FeedSeed create()
    {
        return new FeedSeed();
    }
    public FeedSeed()
    {
    }
    /** Optionally used to seed the feed with specific product IDs (optionally also with variant IDs), e.g., a single product for a PDP or one to many products for a shopping cart or order. */
    public @Nullable ArrayList<ProductAndVariantId> getProductAndVariantIds()
    {
        return this.productAndVariantIds;
    }
    /** Optionally used to seed the feed with specific content, e.g., a single content ID for a CDP. */
    public @Nullable ArrayList<String> getContentIds()
    {
        return this.contentIds;
    }
    /** Optionally used to seed the feed with specific product IDs (optionally also with variant IDs), e.g., a single product for a PDP or one to many products for a shopping cart or order. */
    public FeedSeed setProductAndVariantIds(ProductAndVariantId... productAndVariantIds)
    {
        this.productAndVariantIds = new ArrayList<>(Arrays.asList(productAndVariantIds));;
        return this;
    }
    /** Optionally used to seed the feed with specific product IDs (optionally also with variant IDs), e.g., a single product for a PDP or one to many products for a shopping cart or order. */
    public FeedSeed addToProductAndVariantIds(ProductAndVariantId productAndVariantIds)
    {
        if (this.productAndVariantIds == null)
        {
            this.productAndVariantIds = new ArrayList<>();
        }
        this.productAndVariantIds.add(productAndVariantIds);
        return this;
    }
    /** Optionally used to seed the feed with specific content, e.g., a single content ID for a CDP. */
    public FeedSeed setContentIds(String... contentIds)
    {
        this.contentIds = new ArrayList<>(Arrays.asList(contentIds));;
        return this;
    }
    /** Optionally used to seed the feed with specific content, e.g., a single content ID for a CDP. */
    public FeedSeed addToContentIds(String contentIds)
    {
        if (this.contentIds == null)
        {
            this.contentIds = new ArrayList<>();
        }
        this.contentIds.add(contentIds);
        return this;
    }
}

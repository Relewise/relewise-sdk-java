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
    
/** Represents a single item in a feed, which can be either a product (with optional variant) or content. Used to specify items for feed operations such as tracking user interactions via <code>FeedItemPreview</code>, and <code>FeedDwell</code>. */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FeedItem
{
    /** The product and variant identifier for this feed item. Set this property when the feed item represents a product, either with or without a specific variant. Cannot be set simultaneously with <code>ContentId</code>. */
    public @Nullable ProductAndVariantId productAndVariantId;
    /** The content identifier for this feed item. Set this property when the feed item represents content. Cannot be set simultaneously with <code>ProductAndVariantId</code>. */
    public @Nullable String contentId;
    /**
     * Initializes a new instance of the <code>FeedItem</code> class with a product and optional variant.
     * @param productAndVariantId The product and variant identifier for this feed item.
     */
    public static FeedItem create(ProductAndVariantId productAndVariantId)
    {
        return new FeedItem(productAndVariantId);
    }
    /**
     * Initializes a new instance of the <code>FeedItem</code> class with a product and optional variant.
     * @param productAndVariantId The product and variant identifier for this feed item.
     */
    public FeedItem(ProductAndVariantId productAndVariantId)
    {
        this.productAndVariantId = productAndVariantId;
    }
    public FeedItem()
    {
    }
    /** The product and variant identifier for this feed item. Set this property when the feed item represents a product, either with or without a specific variant. Cannot be set simultaneously with <code>ContentId</code>. */
    public @Nullable ProductAndVariantId getProductAndVariantId()
    {
        return this.productAndVariantId;
    }
    /** The content identifier for this feed item. Set this property when the feed item represents content. Cannot be set simultaneously with <code>ProductAndVariantId</code>. */
    public @Nullable String getContentId()
    {
        return this.contentId;
    }
    /** The product and variant identifier for this feed item. Set this property when the feed item represents a product, either with or without a specific variant. Cannot be set simultaneously with <code>ContentId</code>. */
    public FeedItem setProductAndVariantId(@Nullable ProductAndVariantId productAndVariantId)
    {
        this.productAndVariantId = productAndVariantId;
        return this;
    }
    /** The content identifier for this feed item. Set this property when the feed item represents content. Cannot be set simultaneously with <code>ProductAndVariantId</code>. */
    public FeedItem setContentId(@Nullable String contentId)
    {
        this.contentId = contentId;
        return this;
    }
}

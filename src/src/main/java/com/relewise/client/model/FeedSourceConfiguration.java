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
    
/** Configuration for feed sources, which determine the content and products that appear in feeds. This includes enablement, selection policies, and result limits for each source. */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FeedSourceConfiguration
{
    /** Feed sources that produce product results. */
    public ArrayList<IProductFeedSource> products;
    /** Feed sources that produce content results. */
    public ArrayList<IContentFeedSource> content;
    public static FeedSourceConfiguration create()
    {
        return new FeedSourceConfiguration();
    }
    public FeedSourceConfiguration()
    {
    }
    /** Feed sources that produce product results. */
    public ArrayList<IProductFeedSource> getProducts()
    {
        return this.products;
    }
    /** Feed sources that produce content results. */
    public ArrayList<IContentFeedSource> getContent()
    {
        return this.content;
    }
    /** Feed sources that produce product results. */
    public FeedSourceConfiguration setProducts(IProductFeedSource... products)
    {
        this.products = new ArrayList<>(Arrays.asList(products));;
        return this;
    }
    /** Feed sources that produce product results. */
    public FeedSourceConfiguration addToProducts(IProductFeedSource products)
    {
        if (this.products == null)
        {
            this.products = new ArrayList<>();
        }
        this.products.add(products);
        return this;
    }
    /** Feed sources that produce content results. */
    public FeedSourceConfiguration setContent(IContentFeedSource... content)
    {
        this.content = new ArrayList<>(Arrays.asList(content));;
        return this;
    }
    /** Feed sources that produce content results. */
    public FeedSourceConfiguration addToContent(IContentFeedSource content)
    {
        if (this.content == null)
        {
            this.content = new ArrayList<>();
        }
        this.content.add(content);
        return this;
    }
}

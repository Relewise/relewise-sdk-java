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
public class FeedCompositionResult
{
    /** The name of the configured <code>Name</code> if specified, otherwise null. */
    public @Nullable String name;
    /** If this composition is of type Product, contains any product results, otherwise null. */
    public @Nullable ProductResult[] products;
    /** If this composition is of type Content, contains any content results, otherwise null. */
    public @Nullable ContentResult[] content;
    public static FeedCompositionResult create(@Nullable String name, @Nullable ProductResult[] products, ContentResult... content)
    {
        return new FeedCompositionResult(name, products, content);
    }
    public FeedCompositionResult(@Nullable String name, @Nullable ProductResult[] products, ContentResult... content)
    {
        this.name = name;
        this.products = products;
        this.content = content;
    }
    public FeedCompositionResult()
    {
    }
    /** The name of the configured <code>Name</code> if specified, otherwise null. */
    public @Nullable String getName()
    {
        return this.name;
    }
    /** If this composition is of type Product, contains any product results, otherwise null. */
    public @Nullable ProductResult[] getProducts()
    {
        return this.products;
    }
    /** If this composition is of type Content, contains any content results, otherwise null. */
    public @Nullable ContentResult[] getContent()
    {
        return this.content;
    }
    /** The name of the configured <code>Name</code> if specified, otherwise null. */
    public FeedCompositionResult setName(@Nullable String name)
    {
        this.name = name;
        return this;
    }
    /** If this composition is of type Product, contains any product results, otherwise null. */
    public FeedCompositionResult setProducts(ProductResult... products)
    {
        this.products = products;
        return this;
    }
    /** If this composition is of type Product, contains any product results, otherwise null. */
    public FeedCompositionResult addToProducts(ProductResult product)
    {
        if (this.products == null)
        {
            this.products = new ProductResult[] { product };
        }
        else
        {
            ArrayList<ProductResult> existingList = new ArrayList<>(Arrays.asList(this.products));
            existingList.add(product);
            this.products = existingList.toArray(new ProductResult[0]);
        }
        return this;
    }
    /** If this composition is of type Content, contains any content results, otherwise null. */
    public FeedCompositionResult setContent(ContentResult... content)
    {
        this.content = content;
        return this;
    }
    /** If this composition is of type Content, contains any content results, otherwise null. */
    public FeedCompositionResult addToContent(ContentResult content)
    {
        if (this.content == null)
        {
            this.content = new ContentResult[] { content };
        }
        else
        {
            ArrayList<ContentResult> existingList = new ArrayList<>(Arrays.asList(this.content));
            existingList.add(content);
            this.content = existingList.toArray(new ContentResult[0]);
        }
        return this;
    }
}

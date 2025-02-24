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
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = ProductDetailsCollectionResponse.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductDetailsCollectionResponse extends TimedResponse
{
    public String $type = "Relewise.Client.Responses.ProductDetailsCollectionResponse, Relewise.Client";
    public ProductResultDetails[] products;
    public @Nullable Integer totalNumberOfResults;
    /** Provides a token for <code>NextPageToken</code> to consume <code>ProductQuery</code> results in pages of <code>PageSize</code>. Turns <code>null</code> as soon as cursor is fully exhausted/read/processed. Once null is returned, there are no more data to be retrieved and no more requests should be made. */
    public @Nullable UUID nextPageToken;
    public static ProductDetailsCollectionResponse create(ProductResultDetails[] products, @Nullable Integer totalNumberOfResults)
    {
        return new ProductDetailsCollectionResponse(products, totalNumberOfResults);
    }
    public ProductDetailsCollectionResponse(ProductResultDetails[] products, @Nullable Integer totalNumberOfResults)
    {
        this.products = products;
        this.totalNumberOfResults = totalNumberOfResults;
    }
    public ProductDetailsCollectionResponse()
    {
    }
    public ProductResultDetails[] getProducts()
    {
        return this.products;
    }
    public @Nullable Integer getTotalNumberOfResults()
    {
        return this.totalNumberOfResults;
    }
    /** Provides a token for <code>NextPageToken</code> to consume <code>ProductQuery</code> results in pages of <code>PageSize</code>. Turns <code>null</code> as soon as cursor is fully exhausted/read/processed. Once null is returned, there are no more data to be retrieved and no more requests should be made. */
    public @Nullable UUID getNextPageToken()
    {
        return this.nextPageToken;
    }
    public ProductDetailsCollectionResponse setProducts(ProductResultDetails... products)
    {
        this.products = products;
        return this;
    }
    public ProductDetailsCollectionResponse addToProducts(ProductResultDetails product)
    {
        if (this.products == null)
        {
            this.products = new ProductResultDetails[] { product };
        }
        else
        {
            ArrayList<ProductResultDetails> existingList = new ArrayList<>(Arrays.asList(this.products));
            existingList.add(product);
            this.products = existingList.toArray(new ProductResultDetails[0]);
        }
        return this;
    }
    public ProductDetailsCollectionResponse setTotalNumberOfResults(@Nullable Integer totalNumberOfResults)
    {
        this.totalNumberOfResults = totalNumberOfResults;
        return this;
    }
    /** Provides a token for <code>NextPageToken</code> to consume <code>ProductQuery</code> results in pages of <code>PageSize</code>. Turns <code>null</code> as soon as cursor is fully exhausted/read/processed. Once null is returned, there are no more data to be retrieved and no more requests should be made. */
    public ProductDetailsCollectionResponse setNextPageToken(@Nullable UUID nextPageToken)
    {
        this.nextPageToken = nextPageToken;
        return this;
    }
    @Override
    public ProductDetailsCollectionResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;
        return this;
    }
}

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
    public ProductDetailsCollectionResponse setProducts(ProductResultDetails... products)
    {
        this.products = products;;
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
        this.totalNumberOfResults = totalNumberOfResults;;
        return this;
    }
    @Override
    public ProductDetailsCollectionResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;;
        return this;
    }
}

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
    defaultImpl = ProductCategoryDetailsCollectionResponse.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductCategoryDetailsCollectionResponse extends TimedResponse
{
    public String $type = "Relewise.Client.Responses.ProductCategoryDetailsCollectionResponse, Relewise.Client";
    public ProductCategoryResultDetails[] categories;
    public @Nullable Integer totalNumberOfResults;
    public static ProductCategoryDetailsCollectionResponse create(ProductCategoryResultDetails[] categories, @Nullable Integer totalNumberOfResults)
    {
        return new ProductCategoryDetailsCollectionResponse(categories, totalNumberOfResults);
    }
    public ProductCategoryDetailsCollectionResponse(ProductCategoryResultDetails[] categories, @Nullable Integer totalNumberOfResults)
    {
        this.categories = categories;
        this.totalNumberOfResults = totalNumberOfResults;
    }
    public ProductCategoryDetailsCollectionResponse()
    {
    }
    public ProductCategoryResultDetails[] getCategories()
    {
        return this.categories;
    }
    public @Nullable Integer getTotalNumberOfResults()
    {
        return this.totalNumberOfResults;
    }
    public ProductCategoryDetailsCollectionResponse setCategories(ProductCategoryResultDetails... categories)
    {
        this.categories = categories;;
        return this;
    }
    public ProductCategoryDetailsCollectionResponse addToCategories(ProductCategoryResultDetails category)
    {
        if (this.categories == null)
        {
            this.categories = new ProductCategoryResultDetails[] { category };
        }
        else
        {
            ArrayList<ProductCategoryResultDetails> existingList = new ArrayList<>(Arrays.asList(this.categories));
            existingList.add(category);
            this.categories = existingList.toArray(new ProductCategoryResultDetails[0]);
        }
        return this;
    }
    public ProductCategoryDetailsCollectionResponse setTotalNumberOfResults(@Nullable Integer totalNumberOfResults)
    {
        this.totalNumberOfResults = totalNumberOfResults;;
        return this;
    }
    @Override
    public ProductCategoryDetailsCollectionResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;;
        return this;
    }
}

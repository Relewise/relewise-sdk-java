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
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = ProductCategoryQuery.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductCategoryQuery extends ProductCategoryIdFilterCategoryQuery
{
    public String $type = "Relewise.Client.Requests.Queries.ProductCategoryQuery, Relewise.Client";
    public static ProductCategoryQuery create()
    {
        return new ProductCategoryQuery();
    }
    public ProductCategoryQuery()
    {
        this.language = null;
        this.currency = null;
    }
    public static ProductCategoryQuery create(@Nullable Language language, @Nullable Currency currency)
    {
        return new ProductCategoryQuery(language, currency);
    }
    public ProductCategoryQuery(@Nullable Language language, @Nullable Currency currency)
    {
        this.language = language;
        this.currency = currency;
    }
    @Override
    public ProductCategoryQuery setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
    @Override
    public ProductCategoryQuery setNumberOfResults(Integer numberOfResults)
    {
        this.numberOfResults = numberOfResults;
        return this;
    }
    @Override
    public ProductCategoryQuery setLanguage(@Nullable Language language)
    {
        this.language = language;
        return this;
    }
    @Override
    public ProductCategoryQuery setCurrency(@Nullable Currency currency)
    {
        this.currency = currency;
        return this;
    }
    @Override
    public ProductCategoryQuery setSkipNumberOfResults(Integer skipNumberOfResults)
    {
        this.skipNumberOfResults = skipNumberOfResults;
        return this;
    }
    @Override
    public ProductCategoryQuery setReturnTotalNumberOfResults(Boolean returnTotalNumberOfResults)
    {
        this.returnTotalNumberOfResults = returnTotalNumberOfResults;
        return this;
    }
    @Override
    public ProductCategoryQuery setIncludeDisabledCategories(Boolean includeDisabledCategories)
    {
        this.includeDisabledCategories = includeDisabledCategories;
        return this;
    }
    @Override
    public ProductCategoryQuery setIncludeChildCategoriesToDepth(Integer includeChildCategoriesToDepth)
    {
        this.includeChildCategoriesToDepth = includeChildCategoriesToDepth;
        return this;
    }
    @Override
    public ProductCategoryQuery setIncludeParentCategoriesToDepth(Integer includeParentCategoriesToDepth)
    {
        this.includeParentCategoriesToDepth = includeParentCategoriesToDepth;
        return this;
    }
}

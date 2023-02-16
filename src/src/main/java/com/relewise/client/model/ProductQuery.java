package com.relewise.client.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
    defaultImpl = ProductQuery.class)
public class ProductQuery extends LicensedRequest
{
    public String $type = "Relewise.Client.Requests.Queries.ProductQuery, Relewise.Client";
    public FilterCollection filters;
    public Integer numberOfResults;
    public @Nullable Language language;
    public @Nullable Currency currency;
    public Integer skipNumberOfResults;
    public Boolean returnTotalNumberOfResults;
    public Boolean includeDisabledProducts;
    public Boolean includeDisabledVariants;
    public Boolean excludeProductsWithNoVariants;
    public static ProductQuery create()
    {
        return new ProductQuery();
    }
    public ProductQuery()
    {
        this.language = null;
        this.currency = null;
    }
    public static ProductQuery create(@Nullable Language language, Currency currency)
    {
        return new ProductQuery(language, currency);
    }
    public ProductQuery(@Nullable Language language, Currency currency)
    {
        this.language = language;
        this.currency = currency;
    }
    public FilterCollection getFilters()
    {
        return this.filters;
    }
    public Integer getNumberOfResults()
    {
        return this.numberOfResults;
    }
    public @Nullable Language getLanguage()
    {
        return this.language;
    }
    public @Nullable Currency getCurrency()
    {
        return this.currency;
    }
    public Integer getSkipNumberOfResults()
    {
        return this.skipNumberOfResults;
    }
    public Boolean getReturnTotalNumberOfResults()
    {
        return this.returnTotalNumberOfResults;
    }
    public Boolean getIncludeDisabledProducts()
    {
        return this.includeDisabledProducts;
    }
    public Boolean getIncludeDisabledVariants()
    {
        return this.includeDisabledVariants;
    }
    public Boolean getExcludeProductsWithNoVariants()
    {
        return this.excludeProductsWithNoVariants;
    }
    public ProductQuery setFilters(FilterCollection filters)
    {
        this.filters = filters;;
        return this;
    }
    public ProductQuery setNumberOfResults(Integer numberOfResults)
    {
        this.numberOfResults = numberOfResults;;
        return this;
    }
    public ProductQuery setLanguage(Language language)
    {
        this.language = language;;
        return this;
    }
    public ProductQuery setCurrency(Currency currency)
    {
        this.currency = currency;;
        return this;
    }
    public ProductQuery setSkipNumberOfResults(Integer skipNumberOfResults)
    {
        this.skipNumberOfResults = skipNumberOfResults;;
        return this;
    }
    public ProductQuery setReturnTotalNumberOfResults(Boolean returnTotalNumberOfResults)
    {
        this.returnTotalNumberOfResults = returnTotalNumberOfResults;;
        return this;
    }
    public ProductQuery setIncludeDisabledProducts(Boolean includeDisabledProducts)
    {
        this.includeDisabledProducts = includeDisabledProducts;;
        return this;
    }
    public ProductQuery setIncludeDisabledVariants(Boolean includeDisabledVariants)
    {
        this.includeDisabledVariants = includeDisabledVariants;;
        return this;
    }
    public ProductQuery setExcludeProductsWithNoVariants(Boolean excludeProductsWithNoVariants)
    {
        this.excludeProductsWithNoVariants = excludeProductsWithNoVariants;;
        return this;
    }
}

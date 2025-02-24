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
    defaultImpl = ProductQuery.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductQuery extends LicensedRequest
{
    public String $type = "Relewise.Client.Requests.Queries.ProductQuery, Relewise.Client";
    public @Nullable FilterCollection filters;
    /** @deprecated For better paging support, please use NextPageToken and PageSize */
    public Integer numberOfResults;
    public @Nullable Language language;
    public @Nullable Currency currency;
    /** @deprecated For better paging support, please use NextPageToken and PageSize */
    public Integer skipNumberOfResults;
    public Boolean returnTotalNumberOfResults;
    public Boolean includeDisabledProducts;
    public Boolean includeDisabledVariants;
    public Boolean excludeProductsWithNoVariants;
    /** The identifier for the <code>ProductQuery</code> paged cursor, to consume results in <code>PageSize</code> batches. Leave as <code>null</code> for retrieving the first page, and set to the value returned in <code>NextPageToken</code> for any subsequent page requests. Should a wrong/unexisting token be supplied, a 'Validation' exception shall be returned. */
    public @Nullable UUID nextPageToken;
    /** The size of the page requested. Maximum allowed value is 1000. */
    public @Nullable Integer pageSize;
    /** Settings for which properties should be included for the entities in the response. If settings are not set they default to include everything. */
    public @Nullable ProductQuerySelectedPropertiesSettings resultSettings;
    public static ProductQuery create(@Nullable FilterCollection filters, Boolean excludeProductsWithNoVariants)
    {
        return new ProductQuery(filters, excludeProductsWithNoVariants);
    }
    public ProductQuery(@Nullable FilterCollection filters, Boolean excludeProductsWithNoVariants)
    {
        this.filters = filters;
        this.excludeProductsWithNoVariants = excludeProductsWithNoVariants;
        this.pageSize = 10;
        this.language = null;
        this.currency = null;
        this.nextPageToken = null;
    }
    /**
     * Initiates a new instance of <code>ProductQuery</code> with support for paging. The initial request needs to set <code>PageSize</code>. Should results span over multiple pages, the response would have token for <code>nextPageToken</code>
     * @param filters The filters to be executed to limit results.
     * @param excludeProductsWithNoVariants Should products without variants be included.
     * @param pageSize The positive number of elements in page should results span over multiple pages.
     * @param language The language to use.
     * @param currency The currency to use.
     * @param nextPageToken The token returned as a part of previous
     */
    public static ProductQuery create(@Nullable FilterCollection filters, Boolean excludeProductsWithNoVariants, Integer pageSize, @Nullable Language language, @Nullable Currency currency, @Nullable UUID nextPageToken)
    {
        return new ProductQuery(filters, excludeProductsWithNoVariants, pageSize, language, currency, nextPageToken);
    }
    /**
     * Initiates a new instance of <code>ProductQuery</code> with support for paging. The initial request needs to set <code>PageSize</code>. Should results span over multiple pages, the response would have token for <code>nextPageToken</code>
     * @param filters The filters to be executed to limit results.
     * @param excludeProductsWithNoVariants Should products without variants be included.
     * @param pageSize The positive number of elements in page should results span over multiple pages.
     * @param language The language to use.
     * @param currency The currency to use.
     * @param nextPageToken The token returned as a part of previous
     */
    public ProductQuery(@Nullable FilterCollection filters, Boolean excludeProductsWithNoVariants, Integer pageSize, @Nullable Language language, @Nullable Currency currency, @Nullable UUID nextPageToken)
    {
        this.filters = filters;
        this.excludeProductsWithNoVariants = excludeProductsWithNoVariants;
        this.pageSize = pageSize;
        this.language = language;
        this.currency = currency;
        this.nextPageToken = nextPageToken;
    }
    public ProductQuery()
    {
        this.language = null;
        this.currency = null;
        this.skipNumberOfResults = 0;
        this.returnTotalNumberOfResults = false;
        this.nextPageToken = null;
    }
    public @Nullable FilterCollection getFilters()
    {
        return this.filters;
    }
    /** @deprecated For better paging support, please use NextPageToken and PageSize */
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
    /** @deprecated For better paging support, please use NextPageToken and PageSize */
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
    /** The identifier for the <code>ProductQuery</code> paged cursor, to consume results in <code>PageSize</code> batches. Leave as <code>null</code> for retrieving the first page, and set to the value returned in <code>NextPageToken</code> for any subsequent page requests. Should a wrong/unexisting token be supplied, a 'Validation' exception shall be returned. */
    public @Nullable UUID getNextPageToken()
    {
        return this.nextPageToken;
    }
    /** The size of the page requested. Maximum allowed value is 1000. */
    public @Nullable Integer getPageSize()
    {
        return this.pageSize;
    }
    /** Settings for which properties should be included for the entities in the response. If settings are not set they default to include everything. */
    public @Nullable ProductQuerySelectedPropertiesSettings getResultSettings()
    {
        return this.resultSettings;
    }
    public ProductQuery setFilters(@Nullable FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
    /** @deprecated For better paging support, please use NextPageToken and PageSize */
    public ProductQuery setNumberOfResults(Integer numberOfResults)
    {
        this.numberOfResults = numberOfResults;
        return this;
    }
    public ProductQuery setLanguage(@Nullable Language language)
    {
        this.language = language;
        return this;
    }
    public ProductQuery setCurrency(@Nullable Currency currency)
    {
        this.currency = currency;
        return this;
    }
    /** @deprecated For better paging support, please use NextPageToken and PageSize */
    public ProductQuery setSkipNumberOfResults(Integer skipNumberOfResults)
    {
        this.skipNumberOfResults = skipNumberOfResults;
        return this;
    }
    public ProductQuery setReturnTotalNumberOfResults(Boolean returnTotalNumberOfResults)
    {
        this.returnTotalNumberOfResults = returnTotalNumberOfResults;
        return this;
    }
    public ProductQuery setIncludeDisabledProducts(Boolean includeDisabledProducts)
    {
        this.includeDisabledProducts = includeDisabledProducts;
        return this;
    }
    public ProductQuery setIncludeDisabledVariants(Boolean includeDisabledVariants)
    {
        this.includeDisabledVariants = includeDisabledVariants;
        return this;
    }
    public ProductQuery setExcludeProductsWithNoVariants(Boolean excludeProductsWithNoVariants)
    {
        this.excludeProductsWithNoVariants = excludeProductsWithNoVariants;
        return this;
    }
    /** The identifier for the <code>ProductQuery</code> paged cursor, to consume results in <code>PageSize</code> batches. Leave as <code>null</code> for retrieving the first page, and set to the value returned in <code>NextPageToken</code> for any subsequent page requests. Should a wrong/unexisting token be supplied, a 'Validation' exception shall be returned. */
    public ProductQuery setNextPageToken(@Nullable UUID nextPageToken)
    {
        this.nextPageToken = nextPageToken;
        return this;
    }
    /** The size of the page requested. Maximum allowed value is 1000. */
    public ProductQuery setPageSize(@Nullable Integer pageSize)
    {
        this.pageSize = pageSize;
        return this;
    }
    /** Settings for which properties should be included for the entities in the response. If settings are not set they default to include everything. */
    public ProductQuery setResultSettings(@Nullable ProductQuerySelectedPropertiesSettings resultSettings)
    {
        this.resultSettings = resultSettings;
        return this;
    }
}

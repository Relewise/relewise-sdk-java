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
    defaultImpl = BrandQuery.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BrandQuery extends LicensedRequest
{
    public String $type = "Relewise.Client.Requests.Queries.BrandQuery, Relewise.Client";
    public FilterCollection filters;
    public Integer numberOfResults;
    public @Nullable Language language;
    public @Nullable Currency currency;
    public Integer skipNumberOfResults;
    public Boolean returnTotalNumberOfResults;
    public Boolean includeDisabledBrands;
    public static BrandQuery create()
    {
        return new BrandQuery();
    }
    public BrandQuery()
    {
        this.language = null;
        this.currency = null;
    }
    public static BrandQuery create(@Nullable Language language, Currency currency)
    {
        return new BrandQuery(language, currency);
    }
    public BrandQuery(@Nullable Language language, Currency currency)
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
    public Boolean getIncludeDisabledBrands()
    {
        return this.includeDisabledBrands;
    }
    public BrandQuery setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
    public BrandQuery setNumberOfResults(Integer numberOfResults)
    {
        this.numberOfResults = numberOfResults;
        return this;
    }
    public BrandQuery setLanguage(Language language)
    {
        this.language = language;
        return this;
    }
    public BrandQuery setCurrency(Currency currency)
    {
        this.currency = currency;
        return this;
    }
    public BrandQuery setSkipNumberOfResults(Integer skipNumberOfResults)
    {
        this.skipNumberOfResults = skipNumberOfResults;
        return this;
    }
    public BrandQuery setReturnTotalNumberOfResults(Boolean returnTotalNumberOfResults)
    {
        this.returnTotalNumberOfResults = returnTotalNumberOfResults;
        return this;
    }
    public BrandQuery setIncludeDisabledBrands(Boolean includeDisabledBrands)
    {
        this.includeDisabledBrands = includeDisabledBrands;
        return this;
    }
}

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
    defaultImpl = ContentQuery.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentQuery extends LicensedRequest implements IHaveCurrencyLanguage
{
    public String $type = "Relewise.Client.Requests.Queries.ContentQuery, Relewise.Client";
    public FilterCollection filters;
    public Integer numberOfResults;
    public @Nullable Language language;
    public @Nullable Currency currency;
    public Integer skipNumberOfResults;
    public Boolean returnTotalNumberOfResults;
    public Boolean includeDisabledContents;
    public static ContentQuery create()
    {
        return new ContentQuery();
    }
    public ContentQuery()
    {
        this.language = null;
        this.currency = null;
    }
    public static ContentQuery create(@Nullable Language language, @Nullable Currency currency)
    {
        return new ContentQuery(language, currency);
    }
    public ContentQuery(@Nullable Language language, @Nullable Currency currency)
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
    public Boolean getIncludeDisabledContents()
    {
        return this.includeDisabledContents;
    }
    public ContentQuery setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
    public ContentQuery setNumberOfResults(Integer numberOfResults)
    {
        this.numberOfResults = numberOfResults;
        return this;
    }
    public ContentQuery setLanguage(@Nullable Language language)
    {
        this.language = language;
        return this;
    }
    public ContentQuery setCurrency(@Nullable Currency currency)
    {
        this.currency = currency;
        return this;
    }
    public ContentQuery setSkipNumberOfResults(Integer skipNumberOfResults)
    {
        this.skipNumberOfResults = skipNumberOfResults;
        return this;
    }
    public ContentQuery setReturnTotalNumberOfResults(Boolean returnTotalNumberOfResults)
    {
        this.returnTotalNumberOfResults = returnTotalNumberOfResults;
        return this;
    }
    public ContentQuery setIncludeDisabledContents(Boolean includeDisabledContents)
    {
        this.includeDisabledContents = includeDisabledContents;
        return this;
    }
}

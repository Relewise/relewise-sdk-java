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
    defaultImpl = ContentCategoryQuery.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentCategoryQuery extends ContentCategoryIdFilterCategoryQuery implements IHaveCurrencyLanguage
{
    public String $type = "Relewise.Client.Requests.Queries.ContentCategoryQuery, Relewise.Client";
    public static ContentCategoryQuery create()
    {
        return new ContentCategoryQuery();
    }
    public ContentCategoryQuery()
    {
        this.language = null;
        this.currency = null;
    }
    public static ContentCategoryQuery create(@Nullable Language language, @Nullable Currency currency)
    {
        return new ContentCategoryQuery(language, currency);
    }
    public ContentCategoryQuery(@Nullable Language language, @Nullable Currency currency)
    {
        this.language = language;
        this.currency = currency;
    }
    @Override
    public ContentCategoryQuery setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
    @Override
    public ContentCategoryQuery setNumberOfResults(Integer numberOfResults)
    {
        this.numberOfResults = numberOfResults;
        return this;
    }
    @Override
    public ContentCategoryQuery setLanguage(@Nullable Language language)
    {
        this.language = language;
        return this;
    }
    @Override
    public ContentCategoryQuery setCurrency(@Nullable Currency currency)
    {
        this.currency = currency;
        return this;
    }
    @Override
    public ContentCategoryQuery setSkipNumberOfResults(Integer skipNumberOfResults)
    {
        this.skipNumberOfResults = skipNumberOfResults;
        return this;
    }
    @Override
    public ContentCategoryQuery setReturnTotalNumberOfResults(Boolean returnTotalNumberOfResults)
    {
        this.returnTotalNumberOfResults = returnTotalNumberOfResults;
        return this;
    }
    @Override
    public ContentCategoryQuery setIncludeDisabledCategories(Boolean includeDisabledCategories)
    {
        this.includeDisabledCategories = includeDisabledCategories;
        return this;
    }
    @Override
    public ContentCategoryQuery setIncludeChildCategoriesToDepth(Integer includeChildCategoriesToDepth)
    {
        this.includeChildCategoriesToDepth = includeChildCategoriesToDepth;
        return this;
    }
    @Override
    public ContentCategoryQuery setIncludeParentCategoriesToDepth(Integer includeParentCategoriesToDepth)
    {
        this.includeParentCategoriesToDepth = includeParentCategoriesToDepth;
        return this;
    }
}

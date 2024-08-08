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
    property = "$type")
@JsonSubTypes({
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class ContentCategoryIdFilterCategoryQuery extends LicensedRequest
{
    public String $type = "";
    public FilterCollection filters;
    public Integer numberOfResults;
    public @Nullable Language language;
    public @Nullable Currency currency;
    public Integer skipNumberOfResults;
    public Boolean returnTotalNumberOfResults;
    public Boolean includeDisabledCategories;
    public Integer includeChildCategoriesToDepth;
    public Integer includeParentCategoriesToDepth;
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
    public Boolean getIncludeDisabledCategories()
    {
        return this.includeDisabledCategories;
    }
    public Integer getIncludeChildCategoriesToDepth()
    {
        return this.includeChildCategoriesToDepth;
    }
    public Integer getIncludeParentCategoriesToDepth()
    {
        return this.includeParentCategoriesToDepth;
    }
    public ContentCategoryIdFilterCategoryQuery setFilters(FilterCollection filters)
    {
        this.filters = filters;;
        return this;
    }
    public ContentCategoryIdFilterCategoryQuery setNumberOfResults(Integer numberOfResults)
    {
        this.numberOfResults = numberOfResults;;
        return this;
    }
    public ContentCategoryIdFilterCategoryQuery setLanguage(Language language)
    {
        this.language = language;;
        return this;
    }
    public ContentCategoryIdFilterCategoryQuery setCurrency(Currency currency)
    {
        this.currency = currency;;
        return this;
    }
    public ContentCategoryIdFilterCategoryQuery setSkipNumberOfResults(Integer skipNumberOfResults)
    {
        this.skipNumberOfResults = skipNumberOfResults;;
        return this;
    }
    public ContentCategoryIdFilterCategoryQuery setReturnTotalNumberOfResults(Boolean returnTotalNumberOfResults)
    {
        this.returnTotalNumberOfResults = returnTotalNumberOfResults;;
        return this;
    }
    public ContentCategoryIdFilterCategoryQuery setIncludeDisabledCategories(Boolean includeDisabledCategories)
    {
        this.includeDisabledCategories = includeDisabledCategories;;
        return this;
    }
    public ContentCategoryIdFilterCategoryQuery setIncludeChildCategoriesToDepth(Integer includeChildCategoriesToDepth)
    {
        this.includeChildCategoriesToDepth = includeChildCategoriesToDepth;;
        return this;
    }
    public ContentCategoryIdFilterCategoryQuery setIncludeParentCategoriesToDepth(Integer includeParentCategoriesToDepth)
    {
        this.includeParentCategoriesToDepth = includeParentCategoriesToDepth;;
        return this;
    }
}

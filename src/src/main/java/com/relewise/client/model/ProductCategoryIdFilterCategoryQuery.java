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
    property = "$type")
@JsonSubTypes({
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class ProductCategoryIdFilterCategoryQuery extends LicensedRequest
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
    public ProductCategoryIdFilterCategoryQuery setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
    public ProductCategoryIdFilterCategoryQuery setNumberOfResults(Integer numberOfResults)
    {
        this.numberOfResults = numberOfResults;
        return this;
    }
    public ProductCategoryIdFilterCategoryQuery setLanguage(@Nullable Language language)
    {
        this.language = language;
        return this;
    }
    public ProductCategoryIdFilterCategoryQuery setCurrency(@Nullable Currency currency)
    {
        this.currency = currency;
        return this;
    }
    public ProductCategoryIdFilterCategoryQuery setSkipNumberOfResults(Integer skipNumberOfResults)
    {
        this.skipNumberOfResults = skipNumberOfResults;
        return this;
    }
    public ProductCategoryIdFilterCategoryQuery setReturnTotalNumberOfResults(Boolean returnTotalNumberOfResults)
    {
        this.returnTotalNumberOfResults = returnTotalNumberOfResults;
        return this;
    }
    public ProductCategoryIdFilterCategoryQuery setIncludeDisabledCategories(Boolean includeDisabledCategories)
    {
        this.includeDisabledCategories = includeDisabledCategories;
        return this;
    }
    public ProductCategoryIdFilterCategoryQuery setIncludeChildCategoriesToDepth(Integer includeChildCategoriesToDepth)
    {
        this.includeChildCategoriesToDepth = includeChildCategoriesToDepth;
        return this;
    }
    public ProductCategoryIdFilterCategoryQuery setIncludeParentCategoriesToDepth(Integer includeParentCategoriesToDepth)
    {
        this.includeParentCategoriesToDepth = includeParentCategoriesToDepth;
        return this;
    }
}

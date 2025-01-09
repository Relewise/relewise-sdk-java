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
import java.util.Set;
import java.util.HashSet;
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = ProductCategoryDataFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductCategoryDataFilter extends DataFilter implements IHaveCurrencyLanguage, IProductCategoryFilter, ICategoryFilter
{
    public String $type = "Relewise.Client.Requests.Filters.ProductCategoryDataFilter, Relewise.Client";
    public static ProductCategoryDataFilter create(String key, String... objectPath)
    {
        return new ProductCategoryDataFilter(key, objectPath);
    }
    public ProductCategoryDataFilter(String key, String... objectPath)
    {
        this.key = key;
        this.objectPath = objectPath;
        this.conditions = null;
        this.mustMatchAllConditions = true;
        this.filterOutIfKeyIsNotFound = true;
        this.language = null;
        this.currency = null;
    }
    public static ProductCategoryDataFilter create(String key, String[] objectPath, @Nullable ValueConditionCollection conditions, Boolean mustMatchAllConditions, Boolean filterOutIfKeyIsNotFound, @Nullable Language language, @Nullable Currency currency)
    {
        return new ProductCategoryDataFilter(key, objectPath, conditions, mustMatchAllConditions, filterOutIfKeyIsNotFound, language, currency);
    }
    public ProductCategoryDataFilter(String key, String[] objectPath, @Nullable ValueConditionCollection conditions, Boolean mustMatchAllConditions, Boolean filterOutIfKeyIsNotFound, @Nullable Language language, @Nullable Currency currency)
    {
        this.key = key;
        this.objectPath = objectPath;
        this.conditions = conditions;
        this.mustMatchAllConditions = mustMatchAllConditions;
        this.filterOutIfKeyIsNotFound = filterOutIfKeyIsNotFound;
        this.language = language;
        this.currency = currency;
    }
    public static ProductCategoryDataFilter create(String key)
    {
        return new ProductCategoryDataFilter(key);
    }
    public ProductCategoryDataFilter(String key)
    {
        this.key = key;
        this.conditions = null;
        this.mustMatchAllConditions = true;
        this.filterOutIfKeyIsNotFound = true;
        this.language = null;
        this.currency = null;
    }
    public static ProductCategoryDataFilter create(String key, @Nullable ValueConditionCollection conditions, Boolean mustMatchAllConditions, Boolean filterOutIfKeyIsNotFound, @Nullable Language language, @Nullable Currency currency)
    {
        return new ProductCategoryDataFilter(key, conditions, mustMatchAllConditions, filterOutIfKeyIsNotFound, language, currency);
    }
    public ProductCategoryDataFilter(String key, @Nullable ValueConditionCollection conditions, Boolean mustMatchAllConditions, Boolean filterOutIfKeyIsNotFound, @Nullable Language language, @Nullable Currency currency)
    {
        this.key = key;
        this.conditions = conditions;
        this.mustMatchAllConditions = mustMatchAllConditions;
        this.filterOutIfKeyIsNotFound = filterOutIfKeyIsNotFound;
        this.language = language;
        this.currency = currency;
    }
    public ProductCategoryDataFilter()
    {
        this.filterOutIfKeyIsNotFound = true;
        this.mustMatchAllConditions = true;
        this.conditions = null;
        this.language = null;
        this.currency = null;
    }
    @Override
    public ProductCategoryDataFilter setKey(String key)
    {
        this.key = key;
        return this;
    }
    @Override
    public ProductCategoryDataFilter setFilterOutIfKeyIsNotFound(Boolean filterOutIfKeyIsNotFound)
    {
        this.filterOutIfKeyIsNotFound = filterOutIfKeyIsNotFound;
        return this;
    }
    @Override
    public ProductCategoryDataFilter setMustMatchAllConditions(Boolean mustMatchAllConditions)
    {
        this.mustMatchAllConditions = mustMatchAllConditions;
        return this;
    }
    @Override
    public ProductCategoryDataFilter setConditions(@Nullable ValueConditionCollection conditions)
    {
        this.conditions = conditions;
        return this;
    }
    @Override
    public ProductCategoryDataFilter setLanguage(@Nullable Language language)
    {
        this.language = language;
        return this;
    }
    @Override
    public ProductCategoryDataFilter setCurrency(@Nullable Currency currency)
    {
        this.currency = currency;
        return this;
    }
    @Override
    public ProductCategoryDataFilter setObjectPath(String... objectPath)
    {
        this.objectPath = objectPath;
        return this;
    }
    public ProductCategoryDataFilter addToObjectPath(String objectPath)
    {
        if (this.objectPath == null)
        {
            this.objectPath = new String[] { objectPath };
        }
        else
        {
            ArrayList<String> existingList = new ArrayList<>(Arrays.asList(this.objectPath));
            existingList.add(objectPath);
            this.objectPath = existingList.toArray(new String[0]);
        }
        return this;
    }
    @Override
    public ProductCategoryDataFilter setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    @Override
    public ProductCategoryDataFilter setSettings(@Nullable FilterSettings settings)
    {
        this.settings = settings;
        return this;
    }
}

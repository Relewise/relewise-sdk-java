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
    defaultImpl = ProductCategoryDataFilter.class)
public class ProductCategoryDataFilter extends DataFilter implements ICategoryFilter
{
    public String $type = "Relewise.Client.Requests.Filters.ProductCategoryDataFilter, Relewise.Client";
    public static ProductCategoryDataFilter create(String key)
    {
        return new ProductCategoryDataFilter(key);
    }
    public ProductCategoryDataFilter(String key)
    {
        this.key = key;
        this.filterOutIfKeyIsNotFound = true;
        this.language = null;
        this.currency = null;
    }
    public static ProductCategoryDataFilter create(String key, Boolean filterOutIfKeyIsNotFound, @Nullable Language language, Currency currency)
    {
        return new ProductCategoryDataFilter(key, filterOutIfKeyIsNotFound, language, currency);
    }
    public ProductCategoryDataFilter(String key, Boolean filterOutIfKeyIsNotFound, @Nullable Language language, Currency currency)
    {
        this.key = key;
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
        this.key = key;;
        return this;
    }
    @Override
    public ProductCategoryDataFilter setFilterOutIfKeyIsNotFound(Boolean filterOutIfKeyIsNotFound)
    {
        this.filterOutIfKeyIsNotFound = filterOutIfKeyIsNotFound;;
        return this;
    }
    @Override
    public ProductCategoryDataFilter setMustMatchAllConditions(Boolean mustMatchAllConditions)
    {
        this.mustMatchAllConditions = mustMatchAllConditions;;
        return this;
    }
    @Override
    public ProductCategoryDataFilter setConditions(ValueConditionCollection conditions)
    {
        this.conditions = conditions;;
        return this;
    }
    @Override
    public ProductCategoryDataFilter setLanguage(Language language)
    {
        this.language = language;;
        return this;
    }
    @Override
    public ProductCategoryDataFilter setCurrency(Currency currency)
    {
        this.currency = currency;;
        return this;
    }
    @Override
    public ProductCategoryDataFilter setObjectPath(String... objectPath)
    {
        this.objectPath = objectPath;;
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
        this.negated = negated;;
        return this;
    }
}

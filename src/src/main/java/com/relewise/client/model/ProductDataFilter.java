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
    property = "$type",
    defaultImpl = ProductDataFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductDataFilter extends DataFilter implements IProductFilter
{
    public String $type = "Relewise.Client.Requests.Filters.ProductDataFilter, Relewise.Client";
    public static ProductDataFilter create(String key, String... objectPath)
    {
        return new ProductDataFilter(key, objectPath);
    }
    public ProductDataFilter(String key, String... objectPath)
    {
        this.key = key;
        this.objectPath = objectPath;
        this.conditions = null;
        this.mustMatchAllConditions = true;
        this.filterOutIfKeyIsNotFound = true;
        this.language = null;
        this.currency = null;
    }
    public static ProductDataFilter create(String key, String[] objectPath, @Nullable ValueConditionCollection conditions, Boolean mustMatchAllConditions, Boolean filterOutIfKeyIsNotFound, @Nullable Language language, Currency currency)
    {
        return new ProductDataFilter(key, objectPath, conditions, mustMatchAllConditions, filterOutIfKeyIsNotFound, language, currency);
    }
    public ProductDataFilter(String key, String[] objectPath, @Nullable ValueConditionCollection conditions, Boolean mustMatchAllConditions, Boolean filterOutIfKeyIsNotFound, @Nullable Language language, Currency currency)
    {
        this.key = key;
        this.objectPath = objectPath;
        this.conditions = conditions;
        this.mustMatchAllConditions = mustMatchAllConditions;
        this.filterOutIfKeyIsNotFound = filterOutIfKeyIsNotFound;
        this.language = language;
        this.currency = currency;
    }
    public static ProductDataFilter create(String key)
    {
        return new ProductDataFilter(key);
    }
    public ProductDataFilter(String key)
    {
        this.key = key;
        this.conditions = null;
        this.mustMatchAllConditions = true;
        this.filterOutIfKeyIsNotFound = true;
        this.language = null;
        this.currency = null;
    }
    public static ProductDataFilter create(String key, @Nullable ValueConditionCollection conditions, Boolean mustMatchAllConditions, Boolean filterOutIfKeyIsNotFound, @Nullable Language language, Currency currency)
    {
        return new ProductDataFilter(key, conditions, mustMatchAllConditions, filterOutIfKeyIsNotFound, language, currency);
    }
    public ProductDataFilter(String key, @Nullable ValueConditionCollection conditions, Boolean mustMatchAllConditions, Boolean filterOutIfKeyIsNotFound, @Nullable Language language, Currency currency)
    {
        this.key = key;
        this.conditions = conditions;
        this.mustMatchAllConditions = mustMatchAllConditions;
        this.filterOutIfKeyIsNotFound = filterOutIfKeyIsNotFound;
        this.language = language;
        this.currency = currency;
    }
    public ProductDataFilter()
    {
        this.filterOutIfKeyIsNotFound = true;
        this.mustMatchAllConditions = true;
        this.conditions = null;
        this.language = null;
        this.currency = null;
    }
    @Override
    public ProductDataFilter setKey(String key)
    {
        this.key = key;;
        return this;
    }
    @Override
    public ProductDataFilter setFilterOutIfKeyIsNotFound(Boolean filterOutIfKeyIsNotFound)
    {
        this.filterOutIfKeyIsNotFound = filterOutIfKeyIsNotFound;;
        return this;
    }
    @Override
    public ProductDataFilter setMustMatchAllConditions(Boolean mustMatchAllConditions)
    {
        this.mustMatchAllConditions = mustMatchAllConditions;;
        return this;
    }
    @Override
    public ProductDataFilter setConditions(ValueConditionCollection conditions)
    {
        this.conditions = conditions;;
        return this;
    }
    @Override
    public ProductDataFilter setLanguage(Language language)
    {
        this.language = language;;
        return this;
    }
    @Override
    public ProductDataFilter setCurrency(Currency currency)
    {
        this.currency = currency;;
        return this;
    }
    @Override
    public ProductDataFilter setObjectPath(String... objectPath)
    {
        this.objectPath = objectPath;;
        return this;
    }
    public ProductDataFilter addToObjectPath(String objectPath)
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
    public ProductDataFilter setNegated(Boolean negated)
    {
        this.negated = negated;;
        return this;
    }
}

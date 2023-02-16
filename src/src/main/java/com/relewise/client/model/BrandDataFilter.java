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
    defaultImpl = BrandDataFilter.class)
public class BrandDataFilter extends DataFilter implements IBrandFilter
{
    public String $type = "Relewise.Client.Requests.Filters.BrandDataFilter, Relewise.Client";
    public static BrandDataFilter create(String key)
    {
        return new BrandDataFilter(key);
    }
    public BrandDataFilter(String key)
    {
        this.key = key;
        this.filterOutIfKeyIsNotFound = true;
        this.language = null;
        this.currency = null;
    }
    public static BrandDataFilter create(String key, Boolean filterOutIfKeyIsNotFound, @Nullable Language language, Currency currency)
    {
        return new BrandDataFilter(key, filterOutIfKeyIsNotFound, language, currency);
    }
    public BrandDataFilter(String key, Boolean filterOutIfKeyIsNotFound, @Nullable Language language, Currency currency)
    {
        this.key = key;
        this.filterOutIfKeyIsNotFound = filterOutIfKeyIsNotFound;
        this.language = language;
        this.currency = currency;
    }
    public BrandDataFilter()
    {
        this.filterOutIfKeyIsNotFound = true;
        this.mustMatchAllConditions = true;
        this.conditions = null;
        this.language = null;
        this.currency = null;
    }
    @Override
    public BrandDataFilter setKey(String key)
    {
        this.key = key;;
        return this;
    }
    @Override
    public BrandDataFilter setFilterOutIfKeyIsNotFound(Boolean filterOutIfKeyIsNotFound)
    {
        this.filterOutIfKeyIsNotFound = filterOutIfKeyIsNotFound;;
        return this;
    }
    @Override
    public BrandDataFilter setMustMatchAllConditions(Boolean mustMatchAllConditions)
    {
        this.mustMatchAllConditions = mustMatchAllConditions;;
        return this;
    }
    @Override
    public BrandDataFilter setConditions(ValueConditionCollection conditions)
    {
        this.conditions = conditions;;
        return this;
    }
    @Override
    public BrandDataFilter setLanguage(Language language)
    {
        this.language = language;;
        return this;
    }
    @Override
    public BrandDataFilter setCurrency(Currency currency)
    {
        this.currency = currency;;
        return this;
    }
    @Override
    public BrandDataFilter setObjectPath(String... objectPath)
    {
        this.objectPath = objectPath;;
        return this;
    }
    public BrandDataFilter addToObjectPath(String objectPath)
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
    public BrandDataFilter setNegated(Boolean negated)
    {
        this.negated = negated;;
        return this;
    }
}

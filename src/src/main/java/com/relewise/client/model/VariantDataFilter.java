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
    defaultImpl = VariantDataFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class VariantDataFilter extends DataFilter implements IVariantFilter
{
    public String $type = "Relewise.Client.Requests.Filters.VariantDataFilter, Relewise.Client";
    public static VariantDataFilter create(String key)
    {
        return new VariantDataFilter(key);
    }
    public VariantDataFilter(String key)
    {
        this.key = key;
        this.mustMatchAllConditions = true;
        this.filterOutIfKeyIsNotFound = true;
        this.language = null;
        this.currency = null;
    }
    public static VariantDataFilter create(String key, Boolean mustMatchAllConditions, Boolean filterOutIfKeyIsNotFound, @Nullable Language language, Currency currency)
    {
        return new VariantDataFilter(key, mustMatchAllConditions, filterOutIfKeyIsNotFound, language, currency);
    }
    public VariantDataFilter(String key, Boolean mustMatchAllConditions, Boolean filterOutIfKeyIsNotFound, @Nullable Language language, Currency currency)
    {
        this.key = key;
        this.mustMatchAllConditions = mustMatchAllConditions;
        this.filterOutIfKeyIsNotFound = filterOutIfKeyIsNotFound;
        this.language = language;
        this.currency = currency;
    }
    public VariantDataFilter()
    {
        this.filterOutIfKeyIsNotFound = true;
        this.mustMatchAllConditions = true;
        this.conditions = null;
        this.language = null;
        this.currency = null;
    }
    @Override
    public VariantDataFilter setKey(String key)
    {
        this.key = key;;
        return this;
    }
    @Override
    public VariantDataFilter setFilterOutIfKeyIsNotFound(Boolean filterOutIfKeyIsNotFound)
    {
        this.filterOutIfKeyIsNotFound = filterOutIfKeyIsNotFound;;
        return this;
    }
    @Override
    public VariantDataFilter setMustMatchAllConditions(Boolean mustMatchAllConditions)
    {
        this.mustMatchAllConditions = mustMatchAllConditions;;
        return this;
    }
    @Override
    public VariantDataFilter setConditions(ValueConditionCollection conditions)
    {
        this.conditions = conditions;;
        return this;
    }
    @Override
    public VariantDataFilter setLanguage(Language language)
    {
        this.language = language;;
        return this;
    }
    @Override
    public VariantDataFilter setCurrency(Currency currency)
    {
        this.currency = currency;;
        return this;
    }
    @Override
    public VariantDataFilter setObjectPath(String... objectPath)
    {
        this.objectPath = objectPath;;
        return this;
    }
    public VariantDataFilter addToObjectPath(String objectPath)
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
    public VariantDataFilter setNegated(Boolean negated)
    {
        this.negated = negated;;
        return this;
    }
}

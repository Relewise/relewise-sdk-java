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
    defaultImpl = CompanyDataFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CompanyDataFilter extends DataFilter implements IHaveCurrencyLanguage, ICompanyFilter
{
    public String $type = "Relewise.Client.Requests.Filters.CompanyDataFilter, Relewise.Client";
    public static CompanyDataFilter create(String key, String... objectPath)
    {
        return new CompanyDataFilter(key, objectPath);
    }
    public CompanyDataFilter(String key, String... objectPath)
    {
        this.key = key;
        this.objectPath = objectPath;
        this.conditions = null;
        this.mustMatchAllConditions = true;
        this.filterOutIfKeyIsNotFound = true;
        this.language = null;
        this.currency = null;
    }
    public static CompanyDataFilter create(String key, String[] objectPath, @Nullable ValueConditionCollection conditions, Boolean mustMatchAllConditions, Boolean filterOutIfKeyIsNotFound, @Nullable Language language, @Nullable Currency currency)
    {
        return new CompanyDataFilter(key, objectPath, conditions, mustMatchAllConditions, filterOutIfKeyIsNotFound, language, currency);
    }
    public CompanyDataFilter(String key, String[] objectPath, @Nullable ValueConditionCollection conditions, Boolean mustMatchAllConditions, Boolean filterOutIfKeyIsNotFound, @Nullable Language language, @Nullable Currency currency)
    {
        this.key = key;
        this.objectPath = objectPath;
        this.conditions = conditions;
        this.mustMatchAllConditions = mustMatchAllConditions;
        this.filterOutIfKeyIsNotFound = filterOutIfKeyIsNotFound;
        this.language = language;
        this.currency = currency;
    }
    public static CompanyDataFilter create(String key)
    {
        return new CompanyDataFilter(key);
    }
    public CompanyDataFilter(String key)
    {
        this.key = key;
        this.conditions = null;
        this.mustMatchAllConditions = true;
        this.filterOutIfKeyIsNotFound = true;
        this.language = null;
        this.currency = null;
    }
    public static CompanyDataFilter create(String key, @Nullable ValueConditionCollection conditions, Boolean mustMatchAllConditions, Boolean filterOutIfKeyIsNotFound, @Nullable Language language, @Nullable Currency currency)
    {
        return new CompanyDataFilter(key, conditions, mustMatchAllConditions, filterOutIfKeyIsNotFound, language, currency);
    }
    public CompanyDataFilter(String key, @Nullable ValueConditionCollection conditions, Boolean mustMatchAllConditions, Boolean filterOutIfKeyIsNotFound, @Nullable Language language, @Nullable Currency currency)
    {
        this.key = key;
        this.conditions = conditions;
        this.mustMatchAllConditions = mustMatchAllConditions;
        this.filterOutIfKeyIsNotFound = filterOutIfKeyIsNotFound;
        this.language = language;
        this.currency = currency;
    }
    public CompanyDataFilter()
    {
        this.filterOutIfKeyIsNotFound = true;
        this.mustMatchAllConditions = true;
        this.conditions = null;
        this.language = null;
        this.currency = null;
    }
    @Override
    public CompanyDataFilter setKey(String key)
    {
        this.key = key;
        return this;
    }
    @Override
    public CompanyDataFilter setFilterOutIfKeyIsNotFound(Boolean filterOutIfKeyIsNotFound)
    {
        this.filterOutIfKeyIsNotFound = filterOutIfKeyIsNotFound;
        return this;
    }
    @Override
    public CompanyDataFilter setMustMatchAllConditions(Boolean mustMatchAllConditions)
    {
        this.mustMatchAllConditions = mustMatchAllConditions;
        return this;
    }
    @Override
    public CompanyDataFilter setConditions(@Nullable ValueConditionCollection conditions)
    {
        this.conditions = conditions;
        return this;
    }
    @Override
    public CompanyDataFilter setLanguage(@Nullable Language language)
    {
        this.language = language;
        return this;
    }
    @Override
    public CompanyDataFilter setCurrency(@Nullable Currency currency)
    {
        this.currency = currency;
        return this;
    }
    @Override
    public CompanyDataFilter setObjectPath(String... objectPath)
    {
        this.objectPath = objectPath;
        return this;
    }
    public CompanyDataFilter addToObjectPath(String objectPath)
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
    public CompanyDataFilter setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    @Override
    public CompanyDataFilter setSettings(@Nullable FilterSettings settings)
    {
        this.settings = settings;
        return this;
    }
}

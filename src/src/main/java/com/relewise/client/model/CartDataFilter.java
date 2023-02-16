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
    defaultImpl = CartDataFilter.class)
public class CartDataFilter extends Filter
{
    public String $type = "Relewise.Client.Requests.Filters.CartDataFilter, Relewise.Client";
    public String key;
    public Boolean filterOutIfKeyIsNotFound;
    public Boolean mustMatchAllConditions;
    public @Nullable ValueConditionCollection conditions;
    public @Nullable Language language;
    public @Nullable Currency currency;
    public static CartDataFilter create(String key)
    {
        return new CartDataFilter(key);
    }
    public CartDataFilter(String key)
    {
        this.key = key;
        this.mustMatchAllConditions = true;
        this.filterOutIfKeyIsNotFound = true;
        this.language = null;
        this.currency = null;
    }
    public static CartDataFilter create(String key, Boolean mustMatchAllConditions, Boolean filterOutIfKeyIsNotFound, @Nullable Language language, Currency currency)
    {
        return new CartDataFilter(key, mustMatchAllConditions, filterOutIfKeyIsNotFound, language, currency);
    }
    public CartDataFilter(String key, Boolean mustMatchAllConditions, Boolean filterOutIfKeyIsNotFound, @Nullable Language language, Currency currency)
    {
        this.key = key;
        this.mustMatchAllConditions = mustMatchAllConditions;
        this.filterOutIfKeyIsNotFound = filterOutIfKeyIsNotFound;
        this.language = language;
        this.currency = currency;
    }
    public CartDataFilter()
    {
        this.filterOutIfKeyIsNotFound = true;
        this.mustMatchAllConditions = true;
        this.conditions = null;
        this.language = null;
        this.currency = null;
    }
    public String getKey()
    {
        return this.key;
    }
    public Boolean getFilterOutIfKeyIsNotFound()
    {
        return this.filterOutIfKeyIsNotFound;
    }
    public Boolean getMustMatchAllConditions()
    {
        return this.mustMatchAllConditions;
    }
    public @Nullable ValueConditionCollection getConditions()
    {
        return this.conditions;
    }
    public @Nullable Language getLanguage()
    {
        return this.language;
    }
    public @Nullable Currency getCurrency()
    {
        return this.currency;
    }
    public CartDataFilter setKey(String key)
    {
        this.key = key;;
        return this;
    }
    public CartDataFilter setFilterOutIfKeyIsNotFound(Boolean filterOutIfKeyIsNotFound)
    {
        this.filterOutIfKeyIsNotFound = filterOutIfKeyIsNotFound;;
        return this;
    }
    public CartDataFilter setMustMatchAllConditions(Boolean mustMatchAllConditions)
    {
        this.mustMatchAllConditions = mustMatchAllConditions;;
        return this;
    }
    public CartDataFilter setConditions(ValueConditionCollection conditions)
    {
        this.conditions = conditions;;
        return this;
    }
    public CartDataFilter setLanguage(Language language)
    {
        this.language = language;;
        return this;
    }
    public CartDataFilter setCurrency(Currency currency)
    {
        this.currency = currency;;
        return this;
    }
    @Override
    public CartDataFilter setNegated(Boolean negated)
    {
        this.negated = negated;;
        return this;
    }
}

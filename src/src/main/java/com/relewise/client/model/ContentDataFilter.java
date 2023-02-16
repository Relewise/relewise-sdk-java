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
    defaultImpl = ContentDataFilter.class)
public class ContentDataFilter extends DataFilter implements IContentFilter
{
    public String $type = "Relewise.Client.Requests.Filters.ContentDataFilter, Relewise.Client";
    public static ContentDataFilter create(String key)
    {
        return new ContentDataFilter(key);
    }
    public ContentDataFilter(String key)
    {
        this.key = key;
        this.filterOutIfKeyIsNotFound = true;
        this.language = null;
        this.currency = null;
    }
    public static ContentDataFilter create(String key, Boolean filterOutIfKeyIsNotFound, @Nullable Language language, Currency currency)
    {
        return new ContentDataFilter(key, filterOutIfKeyIsNotFound, language, currency);
    }
    public ContentDataFilter(String key, Boolean filterOutIfKeyIsNotFound, @Nullable Language language, Currency currency)
    {
        this.key = key;
        this.filterOutIfKeyIsNotFound = filterOutIfKeyIsNotFound;
        this.language = language;
        this.currency = currency;
    }
    public ContentDataFilter()
    {
        this.filterOutIfKeyIsNotFound = true;
        this.mustMatchAllConditions = true;
        this.conditions = null;
        this.language = null;
        this.currency = null;
    }
    @Override
    public ContentDataFilter setKey(String key)
    {
        this.key = key;;
        return this;
    }
    @Override
    public ContentDataFilter setFilterOutIfKeyIsNotFound(Boolean filterOutIfKeyIsNotFound)
    {
        this.filterOutIfKeyIsNotFound = filterOutIfKeyIsNotFound;;
        return this;
    }
    @Override
    public ContentDataFilter setMustMatchAllConditions(Boolean mustMatchAllConditions)
    {
        this.mustMatchAllConditions = mustMatchAllConditions;;
        return this;
    }
    @Override
    public ContentDataFilter setConditions(ValueConditionCollection conditions)
    {
        this.conditions = conditions;;
        return this;
    }
    @Override
    public ContentDataFilter setLanguage(Language language)
    {
        this.language = language;;
        return this;
    }
    @Override
    public ContentDataFilter setCurrency(Currency currency)
    {
        this.currency = currency;;
        return this;
    }
    @Override
    public ContentDataFilter setObjectPath(String... objectPath)
    {
        this.objectPath = objectPath;;
        return this;
    }
    public ContentDataFilter addToObjectPath(String objectPath)
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
    public ContentDataFilter setNegated(Boolean negated)
    {
        this.negated = negated;;
        return this;
    }
}

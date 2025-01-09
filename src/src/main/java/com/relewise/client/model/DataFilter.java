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
public abstract class DataFilter extends Filter implements IHaveCurrencyLanguage
{
    public String $type = "";
    public String key;
    public Boolean filterOutIfKeyIsNotFound;
    public Boolean mustMatchAllConditions;
    public @Nullable ValueConditionCollection conditions;
    public @Nullable Language language;
    public @Nullable Currency currency;
    public @Nullable String[] objectPath;
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
    public @Nullable String[] getObjectPath()
    {
        return this.objectPath;
    }
    public DataFilter setKey(String key)
    {
        this.key = key;
        return this;
    }
    public DataFilter setFilterOutIfKeyIsNotFound(Boolean filterOutIfKeyIsNotFound)
    {
        this.filterOutIfKeyIsNotFound = filterOutIfKeyIsNotFound;
        return this;
    }
    public DataFilter setMustMatchAllConditions(Boolean mustMatchAllConditions)
    {
        this.mustMatchAllConditions = mustMatchAllConditions;
        return this;
    }
    public DataFilter setConditions(@Nullable ValueConditionCollection conditions)
    {
        this.conditions = conditions;
        return this;
    }
    public DataFilter setLanguage(@Nullable Language language)
    {
        this.language = language;
        return this;
    }
    public DataFilter setCurrency(@Nullable Currency currency)
    {
        this.currency = currency;
        return this;
    }
    public DataFilter setObjectPath(String... objectPath)
    {
        this.objectPath = objectPath;
        return this;
    }
    public DataFilter addToObjectPath(String objectPath)
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
    public DataFilter setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    @Override
    public DataFilter setSettings(@Nullable FilterSettings settings)
    {
        this.settings = settings;
        return this;
    }
}

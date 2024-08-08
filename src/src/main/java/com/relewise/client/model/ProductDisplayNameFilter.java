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
    defaultImpl = ProductDisplayNameFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductDisplayNameFilter extends Filter implements IProductFilter
{
    public String $type = "Relewise.Client.Requests.Filters.ProductDisplayNameFilter, Relewise.Client";
    public @Nullable Language language;
    public @Nullable ValueConditionCollection conditions;
    public Boolean mustMatchAllConditions;
    public static ProductDisplayNameFilter create()
    {
        return new ProductDisplayNameFilter();
    }
    public ProductDisplayNameFilter()
    {
        this.language = null;
    }
    public static ProductDisplayNameFilter create(Language language)
    {
        return new ProductDisplayNameFilter(language);
    }
    public ProductDisplayNameFilter(Language language)
    {
        this.language = language;
    }
    public @Nullable Language getLanguage()
    {
        return this.language;
    }
    public @Nullable ValueConditionCollection getConditions()
    {
        return this.conditions;
    }
    public Boolean getMustMatchAllConditions()
    {
        return this.mustMatchAllConditions;
    }
    public ProductDisplayNameFilter setLanguage(Language language)
    {
        this.language = language;;
        return this;
    }
    public ProductDisplayNameFilter setConditions(ValueConditionCollection conditions)
    {
        this.conditions = conditions;;
        return this;
    }
    public ProductDisplayNameFilter setMustMatchAllConditions(Boolean mustMatchAllConditions)
    {
        this.mustMatchAllConditions = mustMatchAllConditions;;
        return this;
    }
    @Override
    public ProductDisplayNameFilter setNegated(Boolean negated)
    {
        this.negated = negated;;
        return this;
    }
}

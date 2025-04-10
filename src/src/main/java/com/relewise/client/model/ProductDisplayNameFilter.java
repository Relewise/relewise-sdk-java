package com.relewise.client.model;

import com.fasterxml.jackson.annotation.*;
import javax.annotation.Nullable;
import java.io.IOException;
import java.time.Duration;
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
    defaultImpl = ProductDisplayNameFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductDisplayNameFilter extends Filter implements IProductFilter
{
    public String $type = "Relewise.Client.Requests.Filters.ProductDisplayNameFilter, Relewise.Client";
    public @Nullable Language language;
    public @Nullable ValueConditionCollection conditions;
    public Boolean mustMatchAllConditions;
    public static ProductDisplayNameFilter create(ValueConditionCollection conditions)
    {
        return new ProductDisplayNameFilter(conditions);
    }
    public ProductDisplayNameFilter(ValueConditionCollection conditions)
    {
        this.conditions = conditions;
        this.mustMatchAllConditions = true;
        this.language = null;
    }
    public static ProductDisplayNameFilter create(ValueConditionCollection conditions, Boolean mustMatchAllConditions, @Nullable Language language)
    {
        return new ProductDisplayNameFilter(conditions, mustMatchAllConditions, language);
    }
    public ProductDisplayNameFilter(ValueConditionCollection conditions, Boolean mustMatchAllConditions, @Nullable Language language)
    {
        this.conditions = conditions;
        this.mustMatchAllConditions = mustMatchAllConditions;
        this.language = language;
    }
    public ProductDisplayNameFilter()
    {
        this.language = null;
        this.mustMatchAllConditions = true;
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
    public ProductDisplayNameFilter setLanguage(@Nullable Language language)
    {
        this.language = language;
        return this;
    }
    public ProductDisplayNameFilter setConditions(@Nullable ValueConditionCollection conditions)
    {
        this.conditions = conditions;
        return this;
    }
    public ProductDisplayNameFilter setMustMatchAllConditions(Boolean mustMatchAllConditions)
    {
        this.mustMatchAllConditions = mustMatchAllConditions;
        return this;
    }
    @Override
    public ProductDisplayNameFilter setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    @Override
    public ProductDisplayNameFilter setSettings(@Nullable FilterSettings settings)
    {
        this.settings = settings;
        return this;
    }
}

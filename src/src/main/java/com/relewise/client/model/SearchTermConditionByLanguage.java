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
    defaultImpl = SearchTermConditionByLanguage.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchTermConditionByLanguage extends SearchTermCondition
{
    public String $type = "Relewise.Client.DataTypes.Search.Rules.SearchTermConditionByLanguage, Relewise.Client";
    public Language language;
    public static SearchTermConditionByLanguage create(Language language, SearchTermConditionConditionKind kind, String value)
    {
        return new SearchTermConditionByLanguage(language, kind, value);
    }
    public SearchTermConditionByLanguage(Language language, SearchTermConditionConditionKind kind, String value)
    {
        this.language = language;
        this.kind = kind;
        this.value = value;
        this.minimumLength = null;
        this.negated = false;
    }
    public static SearchTermConditionByLanguage create(Language language, SearchTermConditionConditionKind kind, String value, @Nullable Integer minimumLength, Boolean negated)
    {
        return new SearchTermConditionByLanguage(language, kind, value, minimumLength, negated);
    }
    public SearchTermConditionByLanguage(Language language, SearchTermConditionConditionKind kind, String value, @Nullable Integer minimumLength, Boolean negated)
    {
        this.language = language;
        this.kind = kind;
        this.value = value;
        this.minimumLength = minimumLength;
        this.negated = negated;
    }
    public static SearchTermConditionByLanguage create(Language language, Integer minimumLength)
    {
        return new SearchTermConditionByLanguage(language, minimumLength);
    }
    public SearchTermConditionByLanguage(Language language, Integer minimumLength)
    {
        this.language = language;
        this.minimumLength = minimumLength;
    }
    public SearchTermConditionByLanguage()
    {
        this.minimumLength = null;
        this.negated = false;
    }
    public Language getLanguage()
    {
        return this.language;
    }
    public SearchTermConditionByLanguage setLanguage(Language language)
    {
        this.language = language;
        return this;
    }
    @Override
    public SearchTermConditionByLanguage setKind(@Nullable SearchTermConditionConditionKind kind)
    {
        this.kind = kind;
        return this;
    }
    @Override
    public SearchTermConditionByLanguage setValue(@Nullable String value)
    {
        this.value = value;
        return this;
    }
    @Override
    public SearchTermConditionByLanguage setAndConditions(SearchTermCondition... andConditions)
    {
        this.andConditions = new ArrayList<>(Arrays.asList(andConditions));;
        return this;
    }
    public SearchTermConditionByLanguage addToAndConditions(SearchTermCondition andConditions)
    {
        if (this.andConditions == null)
        {
            this.andConditions = new ArrayList<>();
        }
        this.andConditions.add(andConditions);
        return this;
    }
    @Override
    public SearchTermConditionByLanguage setOrConditions(SearchTermCondition... orConditions)
    {
        this.orConditions = new ArrayList<>(Arrays.asList(orConditions));;
        return this;
    }
    public SearchTermConditionByLanguage addToOrConditions(SearchTermCondition orConditions)
    {
        if (this.orConditions == null)
        {
            this.orConditions = new ArrayList<>();
        }
        this.orConditions.add(orConditions);
        return this;
    }
    @Override
    public SearchTermConditionByLanguage setMinimumLength(@Nullable Integer minimumLength)
    {
        this.minimumLength = minimumLength;
        return this;
    }
    @Override
    public SearchTermConditionByLanguage setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
}

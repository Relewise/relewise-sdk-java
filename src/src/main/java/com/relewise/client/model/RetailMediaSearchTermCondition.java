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
    defaultImpl = RetailMediaSearchTermCondition.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RetailMediaSearchTermCondition extends SearchTermCondition
{
    public String $type = "Relewise.Client.DataTypes.RetailMedia.RetailMediaSearchTermCondition, Relewise.Client";
    public Language language;
    public static RetailMediaSearchTermCondition create(Language language, SearchTermConditionConditionKind kind, String value)
    {
        return new RetailMediaSearchTermCondition(language, kind, value);
    }
    public RetailMediaSearchTermCondition(Language language, SearchTermConditionConditionKind kind, String value)
    {
        this.language = language;
        this.kind = kind;
        this.value = value;
        this.minimumLength = null;
        this.negated = false;
    }
    public static RetailMediaSearchTermCondition create(Language language, SearchTermConditionConditionKind kind, String value, @Nullable Integer minimumLength, Boolean negated)
    {
        return new RetailMediaSearchTermCondition(language, kind, value, minimumLength, negated);
    }
    public RetailMediaSearchTermCondition(Language language, SearchTermConditionConditionKind kind, String value, @Nullable Integer minimumLength, Boolean negated)
    {
        this.language = language;
        this.kind = kind;
        this.value = value;
        this.minimumLength = minimumLength;
        this.negated = negated;
    }
    public static RetailMediaSearchTermCondition create(Language language, Integer minimumLength)
    {
        return new RetailMediaSearchTermCondition(language, minimumLength);
    }
    public RetailMediaSearchTermCondition(Language language, Integer minimumLength)
    {
        this.language = language;
        this.minimumLength = minimumLength;
    }
    public RetailMediaSearchTermCondition()
    {
        this.minimumLength = null;
        this.negated = false;
    }
    public Language getLanguage()
    {
        return this.language;
    }
    public RetailMediaSearchTermCondition setLanguage(Language language)
    {
        this.language = language;
        return this;
    }
    @Override
    public RetailMediaSearchTermCondition setKind(@Nullable SearchTermConditionConditionKind kind)
    {
        this.kind = kind;
        return this;
    }
    @Override
    public RetailMediaSearchTermCondition setValue(@Nullable String value)
    {
        this.value = value;
        return this;
    }
    @Override
    public RetailMediaSearchTermCondition setAndConditions(SearchTermCondition... andConditions)
    {
        this.andConditions = new ArrayList<>(Arrays.asList(andConditions));;
        return this;
    }
    public RetailMediaSearchTermCondition addToAndConditions(SearchTermCondition andConditions)
    {
        if (this.andConditions == null)
        {
            this.andConditions = new ArrayList<>();
        }
        this.andConditions.add(andConditions);
        return this;
    }
    @Override
    public RetailMediaSearchTermCondition setOrConditions(SearchTermCondition... orConditions)
    {
        this.orConditions = new ArrayList<>(Arrays.asList(orConditions));;
        return this;
    }
    public RetailMediaSearchTermCondition addToOrConditions(SearchTermCondition orConditions)
    {
        if (this.orConditions == null)
        {
            this.orConditions = new ArrayList<>();
        }
        this.orConditions.add(orConditions);
        return this;
    }
    @Override
    public RetailMediaSearchTermCondition setMinimumLength(@Nullable Integer minimumLength)
    {
        this.minimumLength = minimumLength;
        return this;
    }
    @Override
    public RetailMediaSearchTermCondition setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
}

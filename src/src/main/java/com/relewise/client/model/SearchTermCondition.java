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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchTermCondition
{
    public @Nullable SearchTermConditionConditionKind kind;
    public @Nullable String value;
    public @Nullable ArrayList<SearchTermCondition> andConditions;
    public @Nullable ArrayList<SearchTermCondition> orConditions;
    public @Nullable Integer minimumLength;
    /** Negates only direct <code>Kind</code> and <code>Value</code> condition. Requires <code>Kind</code> to be supplied in case 'negate' logic is requested. */
    public Boolean negated;
    public static SearchTermCondition create(SearchTermConditionConditionKind kind, String value)
    {
        return new SearchTermCondition(kind, value);
    }
    public SearchTermCondition(SearchTermConditionConditionKind kind, String value)
    {
        this.kind = kind;
        this.value = value;
        this.minimumLength = null;
        this.negated = false;
    }
    public static SearchTermCondition create(SearchTermConditionConditionKind kind, String value, @Nullable Integer minimumLength, Boolean negated)
    {
        return new SearchTermCondition(kind, value, minimumLength, negated);
    }
    public SearchTermCondition(SearchTermConditionConditionKind kind, String value, @Nullable Integer minimumLength, Boolean negated)
    {
        this.kind = kind;
        this.value = value;
        this.minimumLength = minimumLength;
        this.negated = negated;
    }
    public static SearchTermCondition create(Integer minimumLength)
    {
        return new SearchTermCondition(minimumLength);
    }
    public SearchTermCondition(Integer minimumLength)
    {
        this.minimumLength = minimumLength;
    }
    public static SearchTermCondition create(SearchTermConditionConditionKind kind, String value, @Nullable Integer minimumLength)
    {
        return new SearchTermCondition(kind, value, minimumLength);
    }
    public SearchTermCondition(SearchTermConditionConditionKind kind, String value, @Nullable Integer minimumLength)
    {
        this.kind = kind;
        this.value = value;
        this.minimumLength = minimumLength;
    }
    public SearchTermCondition()
    {
        this.minimumLength = null;
        this.negated = false;
    }
    public @Nullable SearchTermConditionConditionKind getKind()
    {
        return this.kind;
    }
    public @Nullable String getValue()
    {
        return this.value;
    }
    public @Nullable ArrayList<SearchTermCondition> getAndConditions()
    {
        return this.andConditions;
    }
    public @Nullable ArrayList<SearchTermCondition> getOrConditions()
    {
        return this.orConditions;
    }
    public @Nullable Integer getMinimumLength()
    {
        return this.minimumLength;
    }
    /** Negates only direct <code>Kind</code> and <code>Value</code> condition. Requires <code>Kind</code> to be supplied in case 'negate' logic is requested. */
    public Boolean getNegated()
    {
        return this.negated;
    }
    public SearchTermCondition setKind(@Nullable SearchTermConditionConditionKind kind)
    {
        this.kind = kind;
        return this;
    }
    public SearchTermCondition setValue(@Nullable String value)
    {
        this.value = value;
        return this;
    }
    public SearchTermCondition setAndConditions(SearchTermCondition... andConditions)
    {
        this.andConditions = new ArrayList<>(Arrays.asList(andConditions));;
        return this;
    }
    public SearchTermCondition addToAndConditions(SearchTermCondition andConditions)
    {
        if (this.andConditions == null)
        {
            this.andConditions = new ArrayList<>();
        }
        this.andConditions.add(andConditions);
        return this;
    }
    public SearchTermCondition setOrConditions(SearchTermCondition... orConditions)
    {
        this.orConditions = new ArrayList<>(Arrays.asList(orConditions));;
        return this;
    }
    public SearchTermCondition addToOrConditions(SearchTermCondition orConditions)
    {
        if (this.orConditions == null)
        {
            this.orConditions = new ArrayList<>();
        }
        this.orConditions.add(orConditions);
        return this;
    }
    public SearchTermCondition setMinimumLength(@Nullable Integer minimumLength)
    {
        this.minimumLength = minimumLength;
        return this;
    }
    /** Negates only direct <code>Kind</code> and <code>Value</code> condition. Requires <code>Kind</code> to be supplied in case 'negate' logic is requested. */
    public SearchTermCondition setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
}

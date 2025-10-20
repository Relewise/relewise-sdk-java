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
public class SearchTermConditionByLanguageCollection
{
    public @Nullable ArrayList<SearchTermConditionByLanguage> values;
    public static SearchTermConditionByLanguageCollection create(SearchTermConditionByLanguage... languageSpecificSearchTermConditions)
    {
        return new SearchTermConditionByLanguageCollection(languageSpecificSearchTermConditions);
    }
    public SearchTermConditionByLanguageCollection(SearchTermConditionByLanguage... languageSpecificSearchTermConditions)
    {
        this.values = new ArrayList<>(Arrays.asList(languageSpecificSearchTermConditions));
    }
    public SearchTermConditionByLanguageCollection()
    {
    }
    public @Nullable ArrayList<SearchTermConditionByLanguage> getValues()
    {
        return this.values;
    }
    public SearchTermConditionByLanguageCollection setValues(SearchTermConditionByLanguage... values)
    {
        this.values = new ArrayList<>(Arrays.asList(values));;
        return this;
    }
    public SearchTermConditionByLanguageCollection addToValues(SearchTermConditionByLanguage values)
    {
        if (this.values == null)
        {
            this.values = new ArrayList<>();
        }
        this.values.add(values);
        return this;
    }
}

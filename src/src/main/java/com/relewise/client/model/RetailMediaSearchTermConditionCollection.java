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
public class RetailMediaSearchTermConditionCollection
{
    public @Nullable ArrayList<RetailMediaSearchTermCondition> values;
    public static RetailMediaSearchTermConditionCollection create(RetailMediaSearchTermCondition... languageSpecificSearchTermConditions)
    {
        return new RetailMediaSearchTermConditionCollection(languageSpecificSearchTermConditions);
    }
    public RetailMediaSearchTermConditionCollection(RetailMediaSearchTermCondition... languageSpecificSearchTermConditions)
    {
        this.values = new ArrayList<>(Arrays.asList(languageSpecificSearchTermConditions));
    }
    public RetailMediaSearchTermConditionCollection()
    {
    }
    public @Nullable ArrayList<RetailMediaSearchTermCondition> getValues()
    {
        return this.values;
    }
    public RetailMediaSearchTermConditionCollection setValues(RetailMediaSearchTermCondition... values)
    {
        this.values = new ArrayList<>(Arrays.asList(values));;
        return this;
    }
    public RetailMediaSearchTermConditionCollection addToValues(RetailMediaSearchTermCondition values)
    {
        if (this.values == null)
        {
            this.values = new ArrayList<>();
        }
        this.values.add(values);
        return this;
    }
}

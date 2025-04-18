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
public class PredictionRuleSuppression
{
    public PredictionRuleSuppressionConditionKind condition;
    public String[] values;
    public static PredictionRuleSuppression create(PredictionRuleSuppressionConditionKind condition, String... values)
    {
        return new PredictionRuleSuppression(condition, values);
    }
    public PredictionRuleSuppression(PredictionRuleSuppressionConditionKind condition, String... values)
    {
        this.condition = condition;
        this.values = values;
    }
    public PredictionRuleSuppression()
    {
    }
    public PredictionRuleSuppressionConditionKind getCondition()
    {
        return this.condition;
    }
    public String[] getValues()
    {
        return this.values;
    }
    public PredictionRuleSuppression setCondition(PredictionRuleSuppressionConditionKind condition)
    {
        this.condition = condition;
        return this;
    }
    public PredictionRuleSuppression setValues(String... values)
    {
        this.values = values;
        return this;
    }
    public PredictionRuleSuppression addToValues(String value)
    {
        if (this.values == null)
        {
            this.values = new String[] { value };
        }
        else
        {
            ArrayList<String> existingList = new ArrayList<>(Arrays.asList(this.values));
            existingList.add(value);
            this.values = existingList.toArray(new String[0]);
        }
        return this;
    }
}

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
    defaultImpl = PredictionRuleSuppression.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PredictionRuleSuppression
{
    public String $type = "Relewise.Client.DataTypes.Search.Configuration.SearchRules.PredictionRule+Suppression, Relewise.Client";
    public SuppressionConditionKind condition;
    public String[] values;
    public static PredictionRuleSuppression create(SuppressionConditionKind condition, String... values)
    {
        return new PredictionRuleSuppression(condition, values);
    }
    public PredictionRuleSuppression(SuppressionConditionKind condition, String... values)
    {
        this.condition = condition;
        this.values = values;
    }
    public PredictionRuleSuppression()
    {
    }
    public SuppressionConditionKind getCondition()
    {
        return this.condition;
    }
    public String[] getValues()
    {
        return this.values;
    }
    public PredictionRuleSuppression setCondition(SuppressionConditionKind condition)
    {
        this.condition = condition;;
        return this;
    }
    public PredictionRuleSuppression setValues(String... values)
    {
        this.values = values;;
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

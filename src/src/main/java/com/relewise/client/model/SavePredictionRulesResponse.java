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
import java.util.Set;
import java.util.HashSet;
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = SavePredictionRulesResponse.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SavePredictionRulesResponse extends PredictionRuleSaveSearchRulesResponse
{
    public String $type = "Relewise.Client.Responses.Search.Rules.SavePredictionRulesResponse, Relewise.Client";
    public static SavePredictionRulesResponse create(PredictionRule... rules)
    {
        return new SavePredictionRulesResponse(rules);
    }
    public SavePredictionRulesResponse(PredictionRule... rules)
    {
        this.rules = rules;
    }
    public SavePredictionRulesResponse()
    {
    }
    @Override
    public SavePredictionRulesResponse setRules(PredictionRule... rules)
    {
        this.rules = rules;
        return this;
    }
    public SavePredictionRulesResponse addToRules(PredictionRule rule)
    {
        if (this.rules == null)
        {
            this.rules = new PredictionRule[] { rule };
        }
        else
        {
            ArrayList<PredictionRule> existingList = new ArrayList<>(Arrays.asList(this.rules));
            existingList.add(rule);
            this.rules = existingList.toArray(new PredictionRule[0]);
        }
        return this;
    }
    @Override
    public SavePredictionRulesResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;
        return this;
    }
}

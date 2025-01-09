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
    defaultImpl = SavePredictionRulesRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SavePredictionRulesRequest extends PredictionRuleSaveSearchRulesRequest
{
    public String $type = "Relewise.Client.Requests.Search.Rules.SavePredictionRulesRequest, Relewise.Client";
    public static SavePredictionRulesRequest create(PredictionRule[] rules, String modifiedBy)
    {
        return new SavePredictionRulesRequest(rules, modifiedBy);
    }
    public SavePredictionRulesRequest(PredictionRule[] rules, String modifiedBy)
    {
        this.rules = rules;
        this.modifiedBy = modifiedBy;
    }
    public SavePredictionRulesRequest()
    {
    }
    @Override
    public SavePredictionRulesRequest setRules(PredictionRule... rules)
    {
        this.rules = rules;
        return this;
    }
    public SavePredictionRulesRequest addToRules(PredictionRule rule)
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
    public SavePredictionRulesRequest setModifiedBy(String modifiedBy)
    {
        this.modifiedBy = modifiedBy;
        return this;
    }
}

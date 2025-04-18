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
    defaultImpl = PredictionRulesResponse.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PredictionRulesResponse extends PredictionRuleSearchRulesResponse
{
    public String $type = "Relewise.Client.Responses.Search.Rules.PredictionRulesResponse, Relewise.Client";
    public static PredictionRulesResponse create(PredictionRule[] rules, Integer hits)
    {
        return new PredictionRulesResponse(rules, hits);
    }
    public PredictionRulesResponse(PredictionRule[] rules, Integer hits)
    {
        this.rules = rules;
        this.hits = hits;
    }
    public PredictionRulesResponse()
    {
    }
    @Override
    public PredictionRulesResponse setRules(PredictionRule... rules)
    {
        this.rules = rules;
        return this;
    }
    public PredictionRulesResponse addToRules(PredictionRule rule)
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
    public PredictionRulesResponse setHits(Integer hits)
    {
        this.hits = hits;
        return this;
    }
    @Override
    public PredictionRulesResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;
        return this;
    }
}

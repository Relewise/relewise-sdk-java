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
    defaultImpl = StemmingRulesResponse.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class StemmingRulesResponse extends StemmingRuleSearchRulesResponse
{
    public String $type = "Relewise.Client.Responses.Search.Rules.StemmingRulesResponse, Relewise.Client";
    public static StemmingRulesResponse create(StemmingRule[] rules, Integer hits)
    {
        return new StemmingRulesResponse(rules, hits);
    }
    public StemmingRulesResponse(StemmingRule[] rules, Integer hits)
    {
        this.rules = rules;
        this.hits = hits;
    }
    public StemmingRulesResponse()
    {
    }
    @Override
    public StemmingRulesResponse setRules(StemmingRule... rules)
    {
        this.rules = rules;
        return this;
    }
    public StemmingRulesResponse addToRules(StemmingRule rule)
    {
        if (this.rules == null)
        {
            this.rules = new StemmingRule[] { rule };
        }
        else
        {
            ArrayList<StemmingRule> existingList = new ArrayList<>(Arrays.asList(this.rules));
            existingList.add(rule);
            this.rules = existingList.toArray(new StemmingRule[0]);
        }
        return this;
    }
    @Override
    public StemmingRulesResponse setHits(Integer hits)
    {
        this.hits = hits;
        return this;
    }
    @Override
    public StemmingRulesResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;
        return this;
    }
}

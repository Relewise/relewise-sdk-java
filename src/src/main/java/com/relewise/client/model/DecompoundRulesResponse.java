package com.relewise.client.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
    defaultImpl = DecompoundRulesResponse.class)
public class DecompoundRulesResponse extends DecompoundRuleSearchRulesResponse
{
    public String $type = "Relewise.Client.Responses.Search.Rules.DecompoundRulesResponse, Relewise.Client";
    public static DecompoundRulesResponse create(DecompoundRule[] rules, Integer hits)
    {
        return new DecompoundRulesResponse(rules, hits);
    }
    public DecompoundRulesResponse(DecompoundRule[] rules, Integer hits)
    {
        this.rules = rules;
        this.hits = hits;
    }
    public DecompoundRulesResponse()
    {
    }
    @Override
    public DecompoundRulesResponse setRules(DecompoundRule... rules)
    {
        this.rules = rules;;
        return this;
    }
    public DecompoundRulesResponse addToRules(DecompoundRule rule)
    {
        if (this.rules == null)
        {
            this.rules = new DecompoundRule[] { rule };
        }
        else
        {
            ArrayList<DecompoundRule> existingList = new ArrayList<>(Arrays.asList(this.rules));
            existingList.add(rule);
            this.rules = existingList.toArray(new DecompoundRule[0]);
        }
        return this;
    }
    @Override
    public DecompoundRulesResponse setHits(Integer hits)
    {
        this.hits = hits;;
        return this;
    }
    @Override
    public DecompoundRulesResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;;
        return this;
    }
}

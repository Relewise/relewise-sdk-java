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
    defaultImpl = RedirectRulesResponse.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RedirectRulesResponse extends RedirectRuleSearchRulesResponse
{
    public String $type = "Relewise.Client.Responses.Search.Rules.RedirectRulesResponse, Relewise.Client";
    public static RedirectRulesResponse create(RedirectRule[] rules, Integer hits)
    {
        return new RedirectRulesResponse(rules, hits);
    }
    public RedirectRulesResponse(RedirectRule[] rules, Integer hits)
    {
        this.rules = rules;
        this.hits = hits;
    }
    public RedirectRulesResponse()
    {
    }
    @Override
    public RedirectRulesResponse setRules(RedirectRule... rules)
    {
        this.rules = rules;
        return this;
    }
    public RedirectRulesResponse addToRules(RedirectRule rule)
    {
        if (this.rules == null)
        {
            this.rules = new RedirectRule[] { rule };
        }
        else
        {
            ArrayList<RedirectRule> existingList = new ArrayList<>(Arrays.asList(this.rules));
            existingList.add(rule);
            this.rules = existingList.toArray(new RedirectRule[0]);
        }
        return this;
    }
    @Override
    public RedirectRulesResponse setHits(Integer hits)
    {
        this.hits = hits;
        return this;
    }
    @Override
    public RedirectRulesResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;
        return this;
    }
}

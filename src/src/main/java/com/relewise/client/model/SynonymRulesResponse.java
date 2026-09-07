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
    
/** Contains synonym rules returned by the Search Rules API. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = SynonymRulesResponse.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SynonymRulesResponse extends SynonymRuleSearchRulesResponse
{
    public String $type = "Relewise.Client.Responses.Search.Rules.SynonymRulesResponse, Relewise.Client";
    /**
     * Creates a response containing a page of synonym rules.
     * @param rules The rules in the requested page.
     * @param hits The total number of matching rules.
     */
    public static SynonymRulesResponse create(SynonymRule[] rules, Integer hits)
    {
        return new SynonymRulesResponse(rules, hits);
    }
    /**
     * Creates a response containing a page of synonym rules.
     * @param rules The rules in the requested page.
     * @param hits The total number of matching rules.
     */
    public SynonymRulesResponse(SynonymRule[] rules, Integer hits)
    {
        this.rules = rules;
        this.hits = hits;
    }
    public SynonymRulesResponse()
    {
    }
    @Override
    public SynonymRulesResponse setRules(SynonymRule... rules)
    {
        this.rules = rules;
        return this;
    }
    public SynonymRulesResponse addToRules(SynonymRule rule)
    {
        if (this.rules == null)
        {
            this.rules = new SynonymRule[] { rule };
        }
        else
        {
            ArrayList<SynonymRule> existingList = new ArrayList<>(Arrays.asList(this.rules));
            existingList.add(rule);
            this.rules = existingList.toArray(new SynonymRule[0]);
        }
        return this;
    }
    @Override
    public SynonymRulesResponse setHits(Integer hits)
    {
        this.hits = hits;
        return this;
    }
    @Override
    public SynonymRulesResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;
        return this;
    }
}

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
import java.util.AbstractMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashSet;
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = SearchTermModifierRulesResponse.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchTermModifierRulesResponse extends SearchTermModifierRuleSearchRulesResponse
{
    public String $type = "Relewise.Client.Responses.Search.Rules.SearchTermModifierRulesResponse, Relewise.Client";
    public static SearchTermModifierRulesResponse create(SearchTermModifierRule[] rules, Integer hits)
    {
        return new SearchTermModifierRulesResponse(rules, hits);
    }
    public SearchTermModifierRulesResponse(SearchTermModifierRule[] rules, Integer hits)
    {
        this.rules = rules;
        this.hits = hits;
    }
    public SearchTermModifierRulesResponse()
    {
    }
    @Override
    public SearchTermModifierRulesResponse setRules(SearchTermModifierRule... rules)
    {
        this.rules = rules;
        return this;
    }
    public SearchTermModifierRulesResponse addToRules(SearchTermModifierRule rule)
    {
        if (this.rules == null)
        {
            this.rules = new SearchTermModifierRule[] { rule };
        }
        else
        {
            ArrayList<SearchTermModifierRule> existingList = new ArrayList<>(Arrays.asList(this.rules));
            existingList.add(rule);
            this.rules = existingList.toArray(new SearchTermModifierRule[0]);
        }
        return this;
    }
    @Override
    public SearchTermModifierRulesResponse setHits(Integer hits)
    {
        this.hits = hits;
        return this;
    }
    @Override
    public SearchTermModifierRulesResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;
        return this;
    }
}

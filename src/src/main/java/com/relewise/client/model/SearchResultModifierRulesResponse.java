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
    defaultImpl = SearchResultModifierRulesResponse.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchResultModifierRulesResponse extends SearchResultModifierRuleSearchRulesResponse
{
    public String $type = "Relewise.Client.Responses.Search.Rules.SearchResultModifierRulesResponse, Relewise.Client";
    public static SearchResultModifierRulesResponse create(SearchResultModifierRule[] rules, Integer hits)
    {
        return new SearchResultModifierRulesResponse(rules, hits);
    }
    public SearchResultModifierRulesResponse(SearchResultModifierRule[] rules, Integer hits)
    {
        this.rules = rules;
        this.hits = hits;
    }
    public SearchResultModifierRulesResponse()
    {
    }
    @Override
    public SearchResultModifierRulesResponse setRules(SearchResultModifierRule... rules)
    {
        this.rules = rules;
        return this;
    }
    public SearchResultModifierRulesResponse addToRules(SearchResultModifierRule rule)
    {
        if (this.rules == null)
        {
            this.rules = new SearchResultModifierRule[] { rule };
        }
        else
        {
            ArrayList<SearchResultModifierRule> existingList = new ArrayList<>(Arrays.asList(this.rules));
            existingList.add(rule);
            this.rules = existingList.toArray(new SearchResultModifierRule[0]);
        }
        return this;
    }
    @Override
    public SearchResultModifierRulesResponse setHits(Integer hits)
    {
        this.hits = hits;
        return this;
    }
    @Override
    public SearchResultModifierRulesResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;
        return this;
    }
}

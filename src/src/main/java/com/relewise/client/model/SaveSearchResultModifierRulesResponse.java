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
    defaultImpl = SaveSearchResultModifierRulesResponse.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SaveSearchResultModifierRulesResponse extends SearchResultModifierRuleSaveSearchRulesResponse
{
    public String $type = "Relewise.Client.Responses.Search.Rules.SaveSearchResultModifierRulesResponse, Relewise.Client";
    public static SaveSearchResultModifierRulesResponse create(SearchResultModifierRule... rules)
    {
        return new SaveSearchResultModifierRulesResponse(rules);
    }
    public SaveSearchResultModifierRulesResponse(SearchResultModifierRule... rules)
    {
        this.rules = rules;
    }
    public SaveSearchResultModifierRulesResponse()
    {
    }
    @Override
    public SaveSearchResultModifierRulesResponse setRules(SearchResultModifierRule... rules)
    {
        this.rules = rules;
        return this;
    }
    public SaveSearchResultModifierRulesResponse addToRules(SearchResultModifierRule rule)
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
    public SaveSearchResultModifierRulesResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;
        return this;
    }
}

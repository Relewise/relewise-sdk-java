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
    defaultImpl = SaveSearchTermModifierRulesResponse.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SaveSearchTermModifierRulesResponse extends SearchTermModifierRuleSaveSearchRulesResponse
{
    public String $type = "Relewise.Client.Responses.Search.Rules.SaveSearchTermModifierRulesResponse, Relewise.Client";
    public static SaveSearchTermModifierRulesResponse create(SearchTermModifierRule... rules)
    {
        return new SaveSearchTermModifierRulesResponse(rules);
    }
    public SaveSearchTermModifierRulesResponse(SearchTermModifierRule... rules)
    {
        this.rules = rules;
    }
    public SaveSearchTermModifierRulesResponse()
    {
    }
    @Override
    public SaveSearchTermModifierRulesResponse setRules(SearchTermModifierRule... rules)
    {
        this.rules = rules;
        return this;
    }
    public SaveSearchTermModifierRulesResponse addToRules(SearchTermModifierRule rule)
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
    public SaveSearchTermModifierRulesResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;
        return this;
    }
}

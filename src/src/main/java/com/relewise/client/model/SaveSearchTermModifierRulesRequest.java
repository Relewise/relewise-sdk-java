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
    defaultImpl = SaveSearchTermModifierRulesRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SaveSearchTermModifierRulesRequest extends SearchTermModifierRuleSaveSearchRulesRequest
{
    public String $type = "Relewise.Client.Requests.Search.Rules.SaveSearchTermModifierRulesRequest, Relewise.Client";
    public static SaveSearchTermModifierRulesRequest create(SearchTermModifierRule[] rules, String modifiedBy)
    {
        return new SaveSearchTermModifierRulesRequest(rules, modifiedBy);
    }
    public SaveSearchTermModifierRulesRequest(SearchTermModifierRule[] rules, String modifiedBy)
    {
        this.rules = rules;
        this.modifiedBy = modifiedBy;
    }
    public SaveSearchTermModifierRulesRequest()
    {
    }
    @Override
    public SaveSearchTermModifierRulesRequest setRules(SearchTermModifierRule... rules)
    {
        this.rules = rules;
        return this;
    }
    public SaveSearchTermModifierRulesRequest addToRules(SearchTermModifierRule rule)
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
    public SaveSearchTermModifierRulesRequest setModifiedBy(String modifiedBy)
    {
        this.modifiedBy = modifiedBy;
        return this;
    }
}

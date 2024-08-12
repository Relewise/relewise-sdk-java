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
    defaultImpl = SaveSearchResultModifierRulesRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SaveSearchResultModifierRulesRequest extends SearchResultModifierRuleSaveSearchRulesRequest
{
    public String $type = "Relewise.Client.Requests.Search.Rules.SaveSearchResultModifierRulesRequest, Relewise.Client";
    public static SaveSearchResultModifierRulesRequest create(SearchResultModifierRule[] rules, String modifiedBy)
    {
        return new SaveSearchResultModifierRulesRequest(rules, modifiedBy);
    }
    public SaveSearchResultModifierRulesRequest(SearchResultModifierRule[] rules, String modifiedBy)
    {
        this.rules = rules;
        this.modifiedBy = modifiedBy;
    }
    public SaveSearchResultModifierRulesRequest()
    {
    }
    @Override
    public SaveSearchResultModifierRulesRequest setRules(SearchResultModifierRule... rules)
    {
        this.rules = rules;
        return this;
    }
    public SaveSearchResultModifierRulesRequest addToRules(SearchResultModifierRule rule)
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
    public SaveSearchResultModifierRulesRequest setModifiedBy(String modifiedBy)
    {
        this.modifiedBy = modifiedBy;
        return this;
    }
}

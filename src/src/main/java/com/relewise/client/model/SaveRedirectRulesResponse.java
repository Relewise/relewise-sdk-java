package com.relewise.client.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
    defaultImpl = SaveRedirectRulesResponse.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SaveRedirectRulesResponse extends RedirectRuleSaveSearchRulesResponse
{
    public String $type = "Relewise.Client.Responses.Search.Rules.SaveRedirectRulesResponse, Relewise.Client";
    public static SaveRedirectRulesResponse create(RedirectRule... rules)
    {
        return new SaveRedirectRulesResponse(rules);
    }
    public SaveRedirectRulesResponse(RedirectRule... rules)
    {
        this.rules = rules;
    }
    public SaveRedirectRulesResponse()
    {
    }
    @Override
    public SaveRedirectRulesResponse setRules(RedirectRule... rules)
    {
        this.rules = rules;;
        return this;
    }
    public SaveRedirectRulesResponse addToRules(RedirectRule rule)
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
    public SaveRedirectRulesResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;;
        return this;
    }
}

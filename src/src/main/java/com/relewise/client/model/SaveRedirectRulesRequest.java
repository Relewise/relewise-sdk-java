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
    defaultImpl = SaveRedirectRulesRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SaveRedirectRulesRequest extends RedirectRuleSaveSearchRulesRequest
{
    public String $type = "Relewise.Client.Requests.Search.Rules.SaveRedirectRulesRequest, Relewise.Client";
    public static SaveRedirectRulesRequest create(RedirectRule[] rules, String modifiedBy)
    {
        return new SaveRedirectRulesRequest(rules, modifiedBy);
    }
    public SaveRedirectRulesRequest(RedirectRule[] rules, String modifiedBy)
    {
        this.rules = rules;
        this.modifiedBy = modifiedBy;
    }
    public SaveRedirectRulesRequest()
    {
    }
    @Override
    public SaveRedirectRulesRequest setRules(RedirectRule... rules)
    {
        this.rules = rules;;
        return this;
    }
    public SaveRedirectRulesRequest addToRules(RedirectRule rule)
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
    public SaveRedirectRulesRequest setModifiedBy(String modifiedBy)
    {
        this.modifiedBy = modifiedBy;;
        return this;
    }
}

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
    defaultImpl = SaveStemmingRulesRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SaveStemmingRulesRequest extends StemmingRuleSaveSearchRulesRequest
{
    public String $type = "Relewise.Client.Requests.Search.Rules.SaveStemmingRulesRequest, Relewise.Client";
    public static SaveStemmingRulesRequest create(StemmingRule[] rules, String modifiedBy)
    {
        return new SaveStemmingRulesRequest(rules, modifiedBy);
    }
    public SaveStemmingRulesRequest(StemmingRule[] rules, String modifiedBy)
    {
        this.rules = rules;
        this.modifiedBy = modifiedBy;
    }
    public SaveStemmingRulesRequest()
    {
    }
    @Override
    public SaveStemmingRulesRequest setRules(StemmingRule... rules)
    {
        this.rules = rules;
        return this;
    }
    public SaveStemmingRulesRequest addToRules(StemmingRule rule)
    {
        if (this.rules == null)
        {
            this.rules = new StemmingRule[] { rule };
        }
        else
        {
            ArrayList<StemmingRule> existingList = new ArrayList<>(Arrays.asList(this.rules));
            existingList.add(rule);
            this.rules = existingList.toArray(new StemmingRule[0]);
        }
        return this;
    }
    @Override
    public SaveStemmingRulesRequest setModifiedBy(String modifiedBy)
    {
        this.modifiedBy = modifiedBy;
        return this;
    }
}

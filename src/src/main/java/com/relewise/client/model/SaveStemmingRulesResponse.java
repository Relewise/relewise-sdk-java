package com.relewise.client.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
    defaultImpl = SaveStemmingRulesResponse.class)
public class SaveStemmingRulesResponse extends StemmingRuleSaveSearchRulesResponse
{
    public String $type = "Relewise.Client.Responses.Search.Rules.SaveStemmingRulesResponse, Relewise.Client";
    public static SaveStemmingRulesResponse create(StemmingRule... rules)
    {
        return new SaveStemmingRulesResponse(rules);
    }
    public SaveStemmingRulesResponse(StemmingRule... rules)
    {
        this.rules = rules;
    }
    public SaveStemmingRulesResponse()
    {
    }
    @Override
    public SaveStemmingRulesResponse setRules(StemmingRule... rules)
    {
        this.rules = rules;;
        return this;
    }
    public SaveStemmingRulesResponse addToRules(StemmingRule rule)
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
    public SaveStemmingRulesResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;;
        return this;
    }
}

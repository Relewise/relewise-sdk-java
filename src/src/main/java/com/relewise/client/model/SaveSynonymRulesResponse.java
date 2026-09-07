package com.relewise.client.model;

import com.fasterxml.jackson.annotation.*;
import javax.annotation.Nullable;
import java.io.IOException;
import java.time.Duration;
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
    
/** Contains synonym rules after they have been saved. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = SaveSynonymRulesResponse.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SaveSynonymRulesResponse extends SynonymRuleSaveSearchRulesResponse
{
    public String $type = "Relewise.Client.Responses.Search.Rules.SaveSynonymRulesResponse, Relewise.Client";
    /**
     * Creates a response containing the saved synonym rules.
     * @param rules The saved synonym rules.
     */
    public static SaveSynonymRulesResponse create(SynonymRule... rules)
    {
        return new SaveSynonymRulesResponse(rules);
    }
    /**
     * Creates a response containing the saved synonym rules.
     * @param rules The saved synonym rules.
     */
    public SaveSynonymRulesResponse(SynonymRule... rules)
    {
        this.rules = rules;
    }
    public SaveSynonymRulesResponse()
    {
    }
    @Override
    public SaveSynonymRulesResponse setRules(SynonymRule... rules)
    {
        this.rules = rules;
        return this;
    }
    public SaveSynonymRulesResponse addToRules(SynonymRule rule)
    {
        if (this.rules == null)
        {
            this.rules = new SynonymRule[] { rule };
        }
        else
        {
            ArrayList<SynonymRule> existingList = new ArrayList<>(Arrays.asList(this.rules));
            existingList.add(rule);
            this.rules = existingList.toArray(new SynonymRule[0]);
        }
        return this;
    }
    @Override
    public SaveSynonymRulesResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;
        return this;
    }
}

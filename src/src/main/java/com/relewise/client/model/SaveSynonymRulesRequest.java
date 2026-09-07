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
    
/** Creates or updates synonym rules. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = SaveSynonymRulesRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SaveSynonymRulesRequest extends SynonymRuleSaveSearchRulesRequest
{
    public String $type = "Relewise.Client.Requests.Search.Rules.SaveSynonymRulesRequest, Relewise.Client";
    /**
     * Creates a request that saves one or more synonym rules.
     * @param rules The rules to save.
     * @param modifiedBy The identity responsible for the change.
     */
    public static SaveSynonymRulesRequest create(SynonymRule[] rules, String modifiedBy)
    {
        return new SaveSynonymRulesRequest(rules, modifiedBy);
    }
    /**
     * Creates a request that saves one or more synonym rules.
     * @param rules The rules to save.
     * @param modifiedBy The identity responsible for the change.
     */
    public SaveSynonymRulesRequest(SynonymRule[] rules, String modifiedBy)
    {
        this.rules = rules;
        this.modifiedBy = modifiedBy;
    }
    public SaveSynonymRulesRequest()
    {
    }
    @Override
    public SaveSynonymRulesRequest setRules(SynonymRule... rules)
    {
        this.rules = rules;
        return this;
    }
    public SaveSynonymRulesRequest addToRules(SynonymRule rule)
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
    public SaveSynonymRulesRequest setModifiedBy(String modifiedBy)
    {
        this.modifiedBy = modifiedBy;
        return this;
    }
}

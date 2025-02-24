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
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = SaveDecompoundRulesResponse.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SaveDecompoundRulesResponse extends DecompoundRuleSaveSearchRulesResponse
{
    public String $type = "Relewise.Client.Responses.Search.Rules.SaveDecompoundRulesResponse, Relewise.Client";
    public static SaveDecompoundRulesResponse create(DecompoundRule... rules)
    {
        return new SaveDecompoundRulesResponse(rules);
    }
    public SaveDecompoundRulesResponse(DecompoundRule... rules)
    {
        this.rules = rules;
    }
    public SaveDecompoundRulesResponse()
    {
    }
    @Override
    public SaveDecompoundRulesResponse setRules(DecompoundRule... rules)
    {
        this.rules = rules;
        return this;
    }
    public SaveDecompoundRulesResponse addToRules(DecompoundRule rule)
    {
        if (this.rules == null)
        {
            this.rules = new DecompoundRule[] { rule };
        }
        else
        {
            ArrayList<DecompoundRule> existingList = new ArrayList<>(Arrays.asList(this.rules));
            existingList.add(rule);
            this.rules = existingList.toArray(new DecompoundRule[0]);
        }
        return this;
    }
    @Override
    public SaveDecompoundRulesResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;
        return this;
    }
}

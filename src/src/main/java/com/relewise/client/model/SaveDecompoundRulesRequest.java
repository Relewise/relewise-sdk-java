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
    defaultImpl = SaveDecompoundRulesRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SaveDecompoundRulesRequest extends DecompoundRuleSaveSearchRulesRequest
{
    public String $type = "Relewise.Client.Requests.Search.Rules.SaveDecompoundRulesRequest, Relewise.Client";
    public static SaveDecompoundRulesRequest create(String modifiedBy)
    {
        return new SaveDecompoundRulesRequest(modifiedBy);
    }
    public SaveDecompoundRulesRequest(String modifiedBy)
    {
        this.modifiedBy = modifiedBy;
    }
    public SaveDecompoundRulesRequest()
    {
    }
    @Override
    public SaveDecompoundRulesRequest setRules(DecompoundRule... rules)
    {
        this.rules = rules;;
        return this;
    }
    public SaveDecompoundRulesRequest addToRules(DecompoundRule rule)
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
    public SaveDecompoundRulesRequest setModifiedBy(String modifiedBy)
    {
        this.modifiedBy = modifiedBy;;
        return this;
    }
}

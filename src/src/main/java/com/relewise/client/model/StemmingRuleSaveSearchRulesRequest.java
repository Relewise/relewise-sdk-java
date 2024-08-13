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
    property = "$type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = SavePredictionRulesRequest.class, name = "Relewise.Client.Requests.Search.Rules.SavePredictionRulesRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = SaveRedirectRulesRequest.class, name = "Relewise.Client.Requests.Search.Rules.SaveRedirectRulesRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = SaveDecompoundRulesRequest.class, name = "Relewise.Client.Requests.Search.Rules.SaveDecompoundRulesRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = SaveStemmingRulesRequest.class, name = "Relewise.Client.Requests.Search.Rules.SaveStemmingRulesRequest, Relewise.Client"),
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class StemmingRuleSaveSearchRulesRequest extends LicensedRequest
{
    public String $type = "";
    public StemmingRule[] rules;
    public String modifiedBy;
    public StemmingRule[] getRules()
    {
        return this.rules;
    }
    public String getModifiedBy()
    {
        return this.modifiedBy;
    }
    public StemmingRuleSaveSearchRulesRequest setRules(StemmingRule... rules)
    {
        this.rules = rules;
        return this;
    }
    public StemmingRuleSaveSearchRulesRequest setModifiedBy(String modifiedBy)
    {
        this.modifiedBy = modifiedBy;
        return this;
    }
}

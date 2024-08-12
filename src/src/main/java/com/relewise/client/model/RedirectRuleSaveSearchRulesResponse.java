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
    @JsonSubTypes.Type(value = SavePredictionRulesResponse.class, name = "Relewise.Client.Responses.Search.Rules.SavePredictionRulesResponse, Relewise.Client"),
    @JsonSubTypes.Type(value = SaveRedirectRulesResponse.class, name = "Relewise.Client.Responses.Search.Rules.SaveRedirectRulesResponse, Relewise.Client"),
    @JsonSubTypes.Type(value = SaveDecompoundRulesResponse.class, name = "Relewise.Client.Responses.Search.Rules.SaveDecompoundRulesResponse, Relewise.Client"),
    @JsonSubTypes.Type(value = SaveStemmingRulesResponse.class, name = "Relewise.Client.Responses.Search.Rules.SaveStemmingRulesResponse, Relewise.Client"),
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class RedirectRuleSaveSearchRulesResponse extends TimedResponse
{
    public String $type = "";
    public RedirectRule[] rules;
    public RedirectRule[] getRules()
    {
        return this.rules;
    }
    public RedirectRuleSaveSearchRulesResponse setRules(RedirectRule... rules)
    {
        this.rules = rules;
        return this;
    }
    @Override
    public RedirectRuleSaveSearchRulesResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;
        return this;
    }
}

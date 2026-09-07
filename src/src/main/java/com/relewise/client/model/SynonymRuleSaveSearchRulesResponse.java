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
    property = "$type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = SavePredictionRulesResponse.class, name = "Relewise.Client.Responses.Search.Rules.SavePredictionRulesResponse, Relewise.Client"),
    @JsonSubTypes.Type(value = SaveRedirectRulesResponse.class, name = "Relewise.Client.Responses.Search.Rules.SaveRedirectRulesResponse, Relewise.Client"),
    @JsonSubTypes.Type(value = SaveDecompoundRulesResponse.class, name = "Relewise.Client.Responses.Search.Rules.SaveDecompoundRulesResponse, Relewise.Client"),
    @JsonSubTypes.Type(value = SaveStemmingRulesResponse.class, name = "Relewise.Client.Responses.Search.Rules.SaveStemmingRulesResponse, Relewise.Client"),
    @JsonSubTypes.Type(value = SaveSearchTermModifierRulesResponse.class, name = "Relewise.Client.Responses.Search.Rules.SaveSearchTermModifierRulesResponse, Relewise.Client"),
    @JsonSubTypes.Type(value = SaveSearchResultModifierRulesResponse.class, name = "Relewise.Client.Responses.Search.Rules.SaveSearchResultModifierRulesResponse, Relewise.Client"),
    @JsonSubTypes.Type(value = SaveSynonymRulesResponse.class, name = "Relewise.Client.Responses.Search.Rules.SaveSynonymRulesResponse, Relewise.Client"),
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class SynonymRuleSaveSearchRulesResponse extends TimedResponse
{
    public String $type = "";
    public SynonymRule[] rules;
    public SynonymRule[] getRules()
    {
        return this.rules;
    }
    public SynonymRuleSaveSearchRulesResponse setRules(SynonymRule... rules)
    {
        this.rules = rules;
        return this;
    }
    @Override
    public SynonymRuleSaveSearchRulesResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;
        return this;
    }
}

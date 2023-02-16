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
    property = "$type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = PredictionRulesResponse.class, name = "Relewise.Client.Responses.Search.Rules.PredictionRulesResponse, Relewise.Client"),
    @JsonSubTypes.Type(value = RedirectRulesResponse.class, name = "Relewise.Client.Responses.Search.Rules.RedirectRulesResponse, Relewise.Client"),
    @JsonSubTypes.Type(value = DecompoundRulesResponse.class, name = "Relewise.Client.Responses.Search.Rules.DecompoundRulesResponse, Relewise.Client"),
    @JsonSubTypes.Type(value = StemmingRulesResponse.class, name = "Relewise.Client.Responses.Search.Rules.StemmingRulesResponse, Relewise.Client"),
})
public abstract class PredictionRuleSearchRulesResponse extends TimedResponse
{
    public String $type = "Relewise.Client.Responses.Search.Rules.SearchRulesResponse`1[[Relewise.Client.DataTypes.Search.Configuration.SearchRules.PredictionRule, Relewise.Client, Version=1.61.0.0, Culture=neutral, PublicKeyToken=null]], Relewise.Client";
    public PredictionRule[] rules;
    public Integer hits;
    public PredictionRule[] getRules()
    {
        return this.rules;
    }
    public Integer getHits()
    {
        return this.hits;
    }
    public PredictionRuleSearchRulesResponse setRules(PredictionRule... rules)
    {
        this.rules = rules;;
        return this;
    }
    public PredictionRuleSearchRulesResponse setHits(Integer hits)
    {
        this.hits = hits;;
        return this;
    }
    @Override
    public PredictionRuleSearchRulesResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;;
        return this;
    }
}

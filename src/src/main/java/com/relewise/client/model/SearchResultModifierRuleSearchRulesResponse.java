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
    @JsonSubTypes.Type(value = PredictionRulesResponse.class, name = "Relewise.Client.Responses.Search.Rules.PredictionRulesResponse, Relewise.Client"),
    @JsonSubTypes.Type(value = RedirectRulesResponse.class, name = "Relewise.Client.Responses.Search.Rules.RedirectRulesResponse, Relewise.Client"),
    @JsonSubTypes.Type(value = DecompoundRulesResponse.class, name = "Relewise.Client.Responses.Search.Rules.DecompoundRulesResponse, Relewise.Client"),
    @JsonSubTypes.Type(value = StemmingRulesResponse.class, name = "Relewise.Client.Responses.Search.Rules.StemmingRulesResponse, Relewise.Client"),
    @JsonSubTypes.Type(value = SearchTermModifierRulesResponse.class, name = "Relewise.Client.Responses.Search.Rules.SearchTermModifierRulesResponse, Relewise.Client"),
    @JsonSubTypes.Type(value = SearchResultModifierRulesResponse.class, name = "Relewise.Client.Responses.Search.Rules.SearchResultModifierRulesResponse, Relewise.Client"),
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class SearchResultModifierRuleSearchRulesResponse extends TimedResponse
{
    public String $type = "";
    public SearchResultModifierRule[] rules;
    public Integer hits;
    public SearchResultModifierRule[] getRules()
    {
        return this.rules;
    }
    public Integer getHits()
    {
        return this.hits;
    }
    public SearchResultModifierRuleSearchRulesResponse setRules(SearchResultModifierRule... rules)
    {
        this.rules = rules;
        return this;
    }
    public SearchResultModifierRuleSearchRulesResponse setHits(Integer hits)
    {
        this.hits = hits;
        return this;
    }
    @Override
    public SearchResultModifierRuleSearchRulesResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;
        return this;
    }
}
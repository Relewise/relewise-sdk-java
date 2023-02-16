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
    @JsonSubTypes.Type(value = SavePredictionRulesResponse.class, name = "Relewise.Client.Responses.Search.Rules.SavePredictionRulesResponse, Relewise.Client"),
    @JsonSubTypes.Type(value = SaveRedirectRulesResponse.class, name = "Relewise.Client.Responses.Search.Rules.SaveRedirectRulesResponse, Relewise.Client"),
    @JsonSubTypes.Type(value = SaveDecompoundRulesResponse.class, name = "Relewise.Client.Responses.Search.Rules.SaveDecompoundRulesResponse, Relewise.Client"),
    @JsonSubTypes.Type(value = SaveStemmingRulesResponse.class, name = "Relewise.Client.Responses.Search.Rules.SaveStemmingRulesResponse, Relewise.Client"),
})
public abstract class RedirectRuleSaveSearchRulesResponse extends TimedResponse
{
    public String $type = "Relewise.Client.Responses.Search.Rules.SaveSearchRulesResponse`1[[Relewise.Client.DataTypes.Search.Configuration.SearchRules.RedirectRule, Relewise.Client, Version=1.61.0.0, Culture=neutral, PublicKeyToken=null]], Relewise.Client";
    public RedirectRule[] rules;
    public RedirectRule[] getRules()
    {
        return this.rules;
    }
    public RedirectRuleSaveSearchRulesResponse setRules(RedirectRule... rules)
    {
        this.rules = rules;;
        return this;
    }
    @Override
    public RedirectRuleSaveSearchRulesResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;;
        return this;
    }
}

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
import java.util.Set;
import java.util.HashSet;
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = SearchResultModifierRuleAddTermFilterAction.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchResultModifierRuleAddTermFilterAction extends SearchResultModifierRuleRuleAction
{
    public String $type = "Relewise.Client.DataTypes.Search.Rules.SearchResultModifierRule+AddTermFilterAction, Relewise.Client";
    public String term;
    public Boolean negated;
    public static SearchResultModifierRuleAddTermFilterAction create(String term, Boolean negated)
    {
        return new SearchResultModifierRuleAddTermFilterAction(term, negated);
    }
    public SearchResultModifierRuleAddTermFilterAction(String term, Boolean negated)
    {
        this.term = term;
        this.negated = negated;
    }
    public SearchResultModifierRuleAddTermFilterAction()
    {
    }
    public String getTerm()
    {
        return this.term;
    }
    public Boolean getNegated()
    {
        return this.negated;
    }
    public SearchResultModifierRuleAddTermFilterAction setTerm(String term)
    {
        this.term = term;
        return this;
    }
    public SearchResultModifierRuleAddTermFilterAction setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
}

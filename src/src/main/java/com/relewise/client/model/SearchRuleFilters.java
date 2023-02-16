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
    property = "$type",
    defaultImpl = SearchRuleFilters.class)
public class SearchRuleFilters
{
    public String $type = "Relewise.Client.Requests.Search.Rules.SearchRuleFilters, Relewise.Client";
    public @Nullable String term;
    public @Nullable Boolean approved;
    public @Nullable UUID id;
    public static SearchRuleFilters create()
    {
        return new SearchRuleFilters();
    }
    public SearchRuleFilters()
    {
    }
    public @Nullable String getTerm()
    {
        return this.term;
    }
    public @Nullable Boolean getApproved()
    {
        return this.approved;
    }
    public @Nullable UUID getId()
    {
        return this.id;
    }
    public SearchRuleFilters setTerm(String term)
    {
        this.term = term;;
        return this;
    }
    public SearchRuleFilters setApproved(@Nullable Boolean approved)
    {
        this.approved = approved;;
        return this;
    }
    public SearchRuleFilters setId(@Nullable UUID id)
    {
        this.id = id;;
        return this;
    }
}
